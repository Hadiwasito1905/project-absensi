package projectabsensi.absensi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projectabsensi.absensi.models.entity.Bank;
import projectabsensi.absensi.models.entity.User;
import projectabsensi.absensi.repository.BankRepos;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class BankService {

    @Autowired
    public BankRepos bankRepos;

    public Bank save(Bank bank){
        return bankRepos.save(bank);
    }

    public Bank findOne(Long id){
        Optional<Bank> bank =  bankRepos.findById(id);
        if (!bank.isPresent()){
            return null;
        }
        return bank.get();
    }

    public Iterable<Bank> findAll(){
        return bankRepos.findAll();
    }


}
