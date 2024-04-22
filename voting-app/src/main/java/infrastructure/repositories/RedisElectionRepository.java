package infrastructure.repositories;

import domain.Candidate;
import domain.Election;
import domain.ElectionRepository;
import io.quarkus.cache.CacheResult;
import io.quarkus.redis.datasource.RedisDataSource;
import io.quarkus.redis.datasource.keys.KeyCommands;
import io.quarkus.redis.datasource.sortedset.SortedSetCommands;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.logging.Logger;

@ApplicationScoped
public class RedisElectionRepository implements ElectionRepository {
    private static final Logger LOGGER = Logger.getLogger(RedisElectionRepository.class);

    public RedisElectionRepository(RedisDataSource redisDataSource) {
        SortedSetCommands<String, String> sortedSetCommands = redisDataSource.sortedSet(String.class, String.class);
        KeyCommands<String> keyCommands = redisDataSource.key(String.class);
    }

    @Override
    @CacheResult(cacheName = "memorization")
    public Election findById(String id) {
        LOGGER.info("Retrieving election "+id+ " from redis.");

        List<Candidate> candidates = sortedSetCommands.zrange("election: "+id, 0, -1)
                .stream()
                .map(Candidate::new)
                .toList();

        return new Election(id, candidates);
    }

    @Override
    public List<Election> findAll() {
        LOGGER.info("Retrieving election from redis.");

        return keyCommands.keys("elections:*")
                .stream()
                .map(id -> findById(id.replace("elections:", "")))
                .toList();

    }

    @Override
    public void vote(String electionId, Candidate candidate){
        LOGGER.info("Voting for " + candidate.id();
        sortedSetCommands.zincrby("election:"+ electionId, 1, candidate.id());
    }
}
