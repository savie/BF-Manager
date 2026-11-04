package l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ܶۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E734 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15825 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final String[] f51467 = {"name", Name.LENGTH, "last_touch_timestamp"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9924 f51468;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f51469;

    public C15825(C9924 c9924) {
        this.f51468 = c9924;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37755(long j) {
        C9924 c9924 = this.f51468;
        try {
            String hexString = Long.toHexString(j);
            this.f51469 = "ExoPlayerCacheFileMetadata" + hexString;
            if (C0976.m3857(c9924.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = c9924.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    C0976.m3858(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f51469);
                    writableDatabase.execSQL("CREATE TABLE " + this.f51469 + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new C18875(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37757(String str, long j, long j2) {
        this.f51469.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f51468.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put(Name.LENGTH, Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.f51469, null, contentValues);
        } catch (SQLException e) {
            throw new C18875(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37756(String str) {
        this.f51469.getClass();
        try {
            this.f51468.getWritableDatabase().delete(this.f51469, "name = ?", new String[]{str});
        } catch (SQLException e) {
            throw new C18875(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37758(Set set) {
        this.f51469.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f51468.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f51469, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C18875(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap m37754() {
        try {
            this.f51469.getClass();
            Cursor cursorQuery = this.f51468.getReadableDatabase().query(this.f51469, f51467, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new C17317(cursorQuery.getLong(1), cursorQuery.getLong(2)));
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
            throw new C18875(e);
        }
    }
}
