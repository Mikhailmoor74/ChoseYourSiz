package moor.foundation.choseyoursiz.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface RespiratorsDao {

    @Query("SELECT * FROM Respirators")
    List<Respirators> getAll();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 1'")
    List<Respirators> getFFP1();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 2'")
    List<Respirators> getFFP2();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 3'")
    List<Respirators> getFFP3();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 3' AND clapan = 'Да'")
    List<Respirators> getYesClapan();

    @Query("SELECT * FROM respirators WHERE id = :id")
    Respirators getById(long id);

    @Insert
    void insert(Respirators respirators);

    @Update
    void update(Respirators respirators);

    @Delete
    void delete(Respirators respirators);
}
