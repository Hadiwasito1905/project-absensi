package projectabsensi.absensi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projectabsensi.absensi.models.entity.Attendance;
import projectabsensi.absensi.repository.AttendanceRepos;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AttendanceService {

    @Autowired
    private AttendanceRepos attendanceRepos;

    public Attendance save(Attendance attendance){
        return attendanceRepos.save(attendance);
    }

    public Attendance findOne(Long id){
        Optional<Attendance> attendance = attendanceRepos.findById(id);
        if (!attendance.isPresent()){
            return null;
        }
        return attendance.get();
    }

    public Iterable<Attendance> findAll(){
        return attendanceRepos.findAll();
    }

    public void removeOne(Long id){
        attendanceRepos.deleteById(id);
    }

    public List<Attendance> findByDate(Date date){

        return attendanceRepos.getAllByFilter();
    }

}
