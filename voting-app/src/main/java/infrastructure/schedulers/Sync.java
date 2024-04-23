package infrastructure.schedulers;

import infrastructure.repositories.RedisElectionRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Sync {

    private  final SQLElectionRepository sqlElectionRepository;
    private final RedisElectionRepository redisElectionRepository;

    public Sync(SQLElectionRepository sqlElectionRepository, RedisElectionRepository redisElectionRepository) {
        this.sqlElectionRepository = sqlElectionRepository;
        this.redisElectionRepository = redisElectionRepository;
    }
}
