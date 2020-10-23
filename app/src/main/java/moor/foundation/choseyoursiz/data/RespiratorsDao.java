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

    @Query("DELETE FROM Respirators")
    void deleteAll();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 1' AND clapan = 'Да'")
    List<Respirators> getFFP1YesClapan();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 1' AND clapan = 'Да' AND construction = 'Формованный'")
    List<Respirators> getFFP1YesClapanForm();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 1' AND clapan = 'Нет' AND construction = 'Формованный'")
    List<Respirators> getFFP1NoClapanForm();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 1' AND clapan = 'Нет'")
    List<Respirators> getFFP1NoClapan();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 3' AND clapan = 'Да'")
    List<Respirators> getFFP3YesClapan();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 2' AND clapan = 'Нет'")
    List<Respirators> getFFP2NoClapan();

    @Query("SELECT * FROM respirators WHERE id = :id")
    Respirators getById(long id);

    @Insert
    void insert(Respirators respirators);

    @Update
    void update(Respirators respirators);

    @Delete
    void delete(Respirators respirators);
}
