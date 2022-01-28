package projectabsensi.absensi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projectabsensi.absensi.models.entity.Bank;
import projectabsensi.absensi.models.entity.User;
import projectabsensi.absensi.service.BankService;
import projectabsensi.absensi.service.UserService;

@RestController
@RequestMapping("/banks")
public class BankController {

    @Autowired
    private BankService bankService;

    @PostMapping
    public Bank create(@RequestBody Bank bank){
        return bankService.save(bank);
    }

    @GetMapping
    public Iterable<Bank> findAll(){
        return bankService.findAll();
    }

    @GetMapping("/{id}")
    public Bank findOne(@PathVariable Long id){
        return bankService.findOne(id);
    }

    @PutMapping
    public Bank update(@RequestBody Bank bank){
        return bankService.save(bank);
    }
}
