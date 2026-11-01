package l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.᩻᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E734 */
/* JADX INFO: loaded from: classes.dex */
public final class C23939 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final String[] f77526 = {"name", Name.LENGTH, "last_touch_timestamp"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3788 f77527;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f77528;

    public C23939(C3788 c3788) {
        this.f77527 = c3788;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52771(long j) {
        C3788 c3788 = this.f77527;
        try {
            String hexString = Long.toHexString(j);
            this.f77528 = "ExoPlayerCacheFileMetadata" + hexString;
            if (C6611.m17944(c3788.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = c3788.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    C6611.m17945(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f77528);
                    writableDatabase.execSQL("CREATE TABLE " + this.f77528 + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new C12962(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52773(String str, long j, long j2) {
        this.f77528.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f77527.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put(Name.LENGTH, Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.f77528, null, contentValues);
        } catch (SQLException e) {
            throw new C12962(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52772(String str) {
        this.f77528.getClass();
        try {
            this.f77527.getWritableDatabase().delete(this.f77528, "name = ?", new String[]{str});
        } catch (SQLException e) {
            throw new C12962(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52774(Set set) {
        this.f77528.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f77527.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f77528, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C12962(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap m52770() {
        try {
            this.f77528.getClass();
            Cursor cursorQuery = this.f77527.getReadableDatabase().query(this.f77528, f77526, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new C11239(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLException e) {
            throw new C12962(e);
        }
    }
}
