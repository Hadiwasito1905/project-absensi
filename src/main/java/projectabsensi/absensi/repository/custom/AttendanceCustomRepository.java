package projectabsensi.absensi.repository.custom;

import org.springframework.stereotype.Repository;
import projectabsensi.absensi.models.entity.Attendance;

import java.util.List;
public interface AttendanceCustomRepository {
    public List<Attendance> getAllByFilter();

}
