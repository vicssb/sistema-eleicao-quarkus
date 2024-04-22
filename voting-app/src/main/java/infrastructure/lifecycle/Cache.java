package infrastructure.lifecycle;

import infrastructure.repositories.RedisElectionRepository;
import io.quarkus.runtime.Startup;

import javax.enterprise.context.ApplicationScoped;
import java.util.logging.Logger;

@Startup
@ApplicationScoped
public class Cache {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(Cache.class));

    public Cache(RedisElectionRepository repository) {
        LOGGER.info("Startup Cache");
        repository.findAll();
    }
}
