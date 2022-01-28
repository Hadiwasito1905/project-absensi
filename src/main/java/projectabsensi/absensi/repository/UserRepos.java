package projectabsensi.absensi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import projectabsensi.absensi.models.entity.User;

@Repository
public interface UserRepos extends CrudRepository<User, Long> {

}
