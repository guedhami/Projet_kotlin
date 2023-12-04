package com.example.todolist.data.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.todolist.data.TaskModel;
import com.example.todolist.data.TaskPriority;
import java.lang.Class;
import java.lang.Exception;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TaskDao_Impl implements TaskDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TaskModel> __insertionAdapterOfTaskModel;

  private final EntityDeletionOrUpdateAdapter<TaskModel> __updateAdapterOfTaskModel;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public TaskDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTaskModel = new EntityInsertionAdapter<TaskModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `item` (`id`,`description`,`priority`,`is_done`,`deadline_date`,`creation_date`,`last_edit_date`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TaskModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescription());
        }
        if (value.getPriority() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, __TaskPriority_enumToString(value.getPriority()));
        }
        final int _tmp = value.isDone() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        if (value.getDeadlineDate() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getDeadlineDate());
        }
        stmt.bindLong(6, value.getCreationDate());
        stmt.bindLong(7, value.getLastEditDate());
      }
    };
    this.__updateAdapterOfTaskModel = new EntityDeletionOrUpdateAdapter<TaskModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `item` SET `id` = ?,`description` = ?,`priority` = ?,`is_done` = ?,`deadline_date` = ?,`creation_date` = ?,`last_edit_date` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TaskModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescription());
        }
        if (value.getPriority() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, __TaskPriority_enumToString(value.getPriority()));
        }
        final int _tmp = value.isDone() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        if (value.getDeadlineDate() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getDeadlineDate());
        }
        stmt.bindLong(6, value.getCreationDate());
        stmt.bindLong(7, value.getLastEditDate());
        stmt.bindLong(8, value.getId());
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM item WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final TaskModel item, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTaskModel.insert(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final TaskModel item, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfTaskModel.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void delete(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDelete.release(_stmt);
    }
  }

  @Override
  public Flow<TaskModel> getItem(final int id) {
    final String _sql = "SELECT * FROM item WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"item"}, new Callable<TaskModel>() {
      @Override
      public TaskModel call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfIsDone = CursorUtil.getColumnIndexOrThrow(_cursor, "is_done");
          final int _cursorIndexOfDeadlineDate = CursorUtil.getColumnIndexOrThrow(_cursor, "deadline_date");
          final int _cursorIndexOfCreationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "creation_date");
          final int _cursorIndexOfLastEditDate = CursorUtil.getColumnIndexOrThrow(_cursor, "last_edit_date");
          final TaskModel _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final TaskPriority _tmpPriority;
            _tmpPriority = __TaskPriority_stringToEnum(_cursor.getString(_cursorIndexOfPriority));
            final boolean _tmpIsDone;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsDone);
            _tmpIsDone = _tmp != 0;
            final Long _tmpDeadlineDate;
            if (_cursor.isNull(_cursorIndexOfDeadlineDate)) {
              _tmpDeadlineDate = null;
            } else {
              _tmpDeadlineDate = _cursor.getLong(_cursorIndexOfDeadlineDate);
            }
            final long _tmpCreationDate;
            _tmpCreationDate = _cursor.getLong(_cursorIndexOfCreationDate);
            final long _tmpLastEditDate;
            _tmpLastEditDate = _cursor.getLong(_cursorIndexOfLastEditDate);
            _result = new TaskModel(_tmpId,_tmpDescription,_tmpPriority,_tmpIsDone,_tmpDeadlineDate,_tmpCreationDate,_tmpLastEditDate);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TaskModel>> getItems() {
    final String _sql = "SELECT * FROM item ORDER BY creation_date ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"item"}, new Callable<List<TaskModel>>() {
      @Override
      public List<TaskModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfIsDone = CursorUtil.getColumnIndexOrThrow(_cursor, "is_done");
          final int _cursorIndexOfDeadlineDate = CursorUtil.getColumnIndexOrThrow(_cursor, "deadline_date");
          final int _cursorIndexOfCreationDate = CursorUtil.getColumnIndexOrThrow(_cursor, "creation_date");
          final int _cursorIndexOfLastEditDate = CursorUtil.getColumnIndexOrThrow(_cursor, "last_edit_date");
          final List<TaskModel> _result = new ArrayList<TaskModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TaskModel _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final TaskPriority _tmpPriority;
            _tmpPriority = __TaskPriority_stringToEnum(_cursor.getString(_cursorIndexOfPriority));
            final boolean _tmpIsDone;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsDone);
            _tmpIsDone = _tmp != 0;
            final Long _tmpDeadlineDate;
            if (_cursor.isNull(_cursorIndexOfDeadlineDate)) {
              _tmpDeadlineDate = null;
            } else {
              _tmpDeadlineDate = _cursor.getLong(_cursorIndexOfDeadlineDate);
            }
            final long _tmpCreationDate;
            _tmpCreationDate = _cursor.getLong(_cursorIndexOfCreationDate);
            final long _tmpLastEditDate;
            _tmpLastEditDate = _cursor.getLong(_cursorIndexOfLastEditDate);
            _item = new TaskModel(_tmpId,_tmpDescription,_tmpPriority,_tmpIsDone,_tmpDeadlineDate,_tmpCreationDate,_tmpLastEditDate);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<Integer> getNumberDoneItems() {
    final String _sql = "SELECT COUNT(*) FROM item WHERE is_done = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"item"}, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private String __TaskPriority_enumToString(final TaskPriority _value) {
    if (_value == null) {
      return null;
    } switch (_value) {
      case LOW: return "LOW";
      case NORMAL: return "NORMAL";
      case URGENT: return "URGENT";
      default: throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + _value);
    }
  }

  private TaskPriority __TaskPriority_stringToEnum(final String _value) {
    if (_value == null) {
      return null;
    } switch (_value) {
      case "LOW": return TaskPriority.LOW;
      case "NORMAL": return TaskPriority.NORMAL;
      case "URGENT": return TaskPriority.URGENT;
      default: throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }
  }
}
