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

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 1'") // 1
    List<Respirators> getFFP1();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 2'") // 2
    List<Respirators> getFFP2();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 3'") // 3
    List<Respirators> getFFP3();

    @Query("SELECT * FROM Respirators WHERE clapan = 'Да'") // 40
    List<Respirators> getYesClapan();

    @Query("SELECT * FROM Respirators WHERE clapan = 'Нет'") // 50
    List<Respirators> getNoClapan();

    @Query("SELECT * FROM Respirators WHERE construction = 'Складной'") // 100
    List<Respirators> getSkladnoi();

    @Query("SELECT * FROM Respirators WHERE construction = 'Формованный'") // 200
    List<Respirators> getForm();

    @Query("SELECT * FROM Respirators WHERE construction = 'Неформованный'") // 300
    List<Respirators> getNoForm();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 1' AND clapan = 'Да'") // 41
    List<Respirators> getFFP1YesClapan();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 2' AND clapan = 'Да'") // 42
    List<Respirators> getFFP2YesClapan();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 3' AND clapan = 'Да'") // 43
    List<Respirators> getFFP3YesClapan();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 1' AND clapan = 'Нет'") // 51
    List<Respirators> getFFP1NoClapan();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 2' AND clapan = 'Нет'") // 52
    List<Respirators> getFFP2NoClapan();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 3' AND clapan = 'Нет'") // 53
    List<Respirators> getFFP3NoClapan();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 1' AND clapan = 'Да' AND construction = 'Складной'") // 141
    List<Respirators> getFFP1YesClapanSklad();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 2' AND clapan = 'Да' AND construction = 'Складной'") // 142
    List<Respirators> getFFP2YesClapanSklad();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 3' AND clapan = 'Да' AND construction = 'Складной'") // 143
    List<Respirators> getFFP3YesClapanSklad();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 1' AND clapan = 'Да' AND construction = 'Формованный'") // 241
    List<Respirators> getFFP1YesClapanForm();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 2' AND clapan = 'Да' AND construction = 'Формованный'") // 242
    List<Respirators> getFFP2YesClapanForm();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 3' AND clapan = 'Да' AND construction = 'Формованный'") // 243
    List<Respirators> getFFP3YesClapanForm();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 1' AND clapan = 'Да' AND construction = 'Неформованный'") // 341
    List<Respirators> getFFP1YesClapanNoForm();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 2' AND clapan = 'Да' AND construction = 'Неформованный'") // 342
    List<Respirators> getFFP2YesClapanNoForm();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 3' AND clapan = 'Да' AND construction = 'Неформованный'") // 343
    List<Respirators> getFFP3YesClapanNoForm();


    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 1' AND clapan = 'Нет' AND construction = 'Складной'") // 151
    List<Respirators> getFFP1NoClapanSklad();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 2' AND clapan = 'Нет' AND construction = 'Складной'") // 152
    List<Respirators> getFFP2NoClapanSklad();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 3' AND clapan = 'Нет' AND construction = 'Складной'") // 153
    List<Respirators> getFFP3NoClapanSklad();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 1' AND clapan = 'Нет' AND construction = 'Формованный'") // 251
    List<Respirators> getFFP1NoClapanForm();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 2' AND clapan = 'Нет' AND construction = 'Формованный'") // 252
    List<Respirators> getFFP2NoClapanForm();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 3' AND clapan = 'Нет' AND construction = 'Формованный'") // 253
    List<Respirators> getFFP3NoClapanForm();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 1' AND clapan = 'Нет' AND construction = 'Неформованный'") // 351
    List<Respirators> getFFP1NoClapanNoForm();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 2' AND clapan = 'Нет' AND construction = 'Неформованный'") // 352
    List<Respirators> getFFP2NoClapanNoForm();

    @Query("SELECT * FROM Respirators WHERE classOfDefend = 'FFP 3' AND clapan = 'Нет' AND construction = 'Неформованный'") // 353
    List<Respirators> getFFP3NoClapanNoForm();


    @Query("SELECT * FROM Respirators WHERE title LIKE '%НРЗ%'")
    List<Respirators> getHP3();

    @Query("SELECT * FROM Respirators WHERE title LIKE '%Спиро%'")
    List<Respirators> getSpiro();

    @Query("SELECT * FROM Respirators WHERE title LIKE '%Алина%'")
    List<Respirators> getAlina();

    @Query("SELECT * FROM Respirators WHERE title LIKE '%3М%'")
    List<Respirators> get3M();


    @Query("DELETE FROM Respirators")
    void deleteAll();

    @Query("SELECT * FROM respirators WHERE id = :id")
    Respirators getById(long id);

    @Insert
    void insert(Respirators respirators);

    @Update
    void update(Respirators respirators);

    @Delete
    void delete(Respirators respirators);
}
