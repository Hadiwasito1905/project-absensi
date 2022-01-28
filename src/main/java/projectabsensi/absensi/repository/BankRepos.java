package projectabsensi.absensi.repository;

import org.springframework.data.repository.CrudRepository;
import projectabsensi.absensi.models.entity.Bank;

public interface BankRepos extends CrudRepository<Bank, Long> {

}
