package l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z754 */
/* JADX INFO: loaded from: classes.dex */
public final class C24031 implements InterfaceC14333 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final String[] f77749 = {"id", "key", "metadata"};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9924 f77750;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final SparseArray f77751 = new SparseArray();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f77752;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f77753;

    public C24031(C9924 c9924) {
        this.f77750 = c9924;
    }

    @Override // l.InterfaceC14333
    /* JADX INFO: renamed from: ۙ */
    public final void mo12530(long j) {
        String hexString = Long.toHexString(j);
        this.f77752 = hexString;
        this.f77753 = C25272.m56409("ExoPlayerCacheIndex", hexString);
    }

    @Override // l.InterfaceC14333
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo12535() throws C18875 {
        try {
            SQLiteDatabase readableDatabase = this.f77750.getReadableDatabase();
            String str = this.f77752;
            str.getClass();
            return C0976.m3857(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new C18875(e);
        }
    }

    @Override // l.InterfaceC14333
    public final void delete() throws C18875 {
        C9924 c9924 = this.f77750;
        String str = this.f77752;
        str.getClass();
        try {
            String strConcat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = c9924.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i = C0976.f3561;
                try {
                    String str2 = C7116.f23455;
                    if (DatabaseUtils.queryNumEntries(writableDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (SQLException e) {
                    throw new C18875(e);
                }
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e2) {
            throw new C18875(e2);
        }
    }

    @Override // l.InterfaceC14333
    /* JADX INFO: renamed from: ۙ */
    public final void mo12532(HashMap map, SparseArray sparseArray) throws C18875 {
        C9924 c9924 = this.f77750;
        C20782.m47568(this.f77751.size() == 0);
        try {
            SQLiteDatabase readableDatabase = c9924.getReadableDatabase();
            String str = this.f77752;
            str.getClass();
            if (C0976.m3857(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = c9924.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    m53587(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase readableDatabase2 = c9924.getReadableDatabase();
            String str2 = this.f77753;
            str2.getClass();
            Cursor cursorQuery = readableDatabase2.query(str2, f77749, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    string.getClass();
                    map.put(string, new C6131(i, string, C21047.m48096(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                    sparseArray.put(i, string);
                } catch (Throwable th2) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            cursorQuery.close();
        } catch (SQLiteException e) {
            map.clear();
            sparseArray.clear();
            throw new C18875(e);
        }
    }

    @Override // l.InterfaceC14333
    /* JADX INFO: renamed from: ᩷ */
    public final void mo12536(HashMap map) throws C18875 {
        try {
            SQLiteDatabase writableDatabase = this.f77750.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                m53587(writableDatabase);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    m53588(writableDatabase, (C6131) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.f77751.clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C18875(e);
        }
    }

    @Override // l.InterfaceC14333
    /* JADX INFO: renamed from: ۙ */
    public final void mo12531(HashMap map) throws C18875 {
        SparseArray sparseArray = this.f77751;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.f77750.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    C6131 c6131 = (C6131) sparseArray.valueAt(i);
                    if (c6131 == null) {
                        int iKeyAt = sparseArray.keyAt(i);
                        String str = this.f77753;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        m53588(writableDatabase, c6131);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new C18875(e);
        }
    }

    @Override // l.InterfaceC14333
    /* JADX INFO: renamed from: ۙ */
    public final void mo12533(C6131 c6131) {
        this.f77751.put(c6131.f20941, c6131);
    }

    @Override // l.InterfaceC14333
    /* JADX INFO: renamed from: ۙ */
    public final void mo12534(C6131 c6131, boolean z) {
        int i = c6131.f20941;
        SparseArray sparseArray = this.f77751;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m53587(SQLiteDatabase sQLiteDatabase) throws C18875 {
        String str = this.f77752;
        str.getClass();
        C0976.m3858(sQLiteDatabase, 1, str);
        String str2 = this.f77753;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + this.f77753 + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m53588(SQLiteDatabase sQLiteDatabase, C6131 c6131) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C21047.m48097(c6131.m17726(), new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(c6131.f20941));
        contentValues.put("key", c6131.f20939);
        contentValues.put("metadata", byteArray);
        String str = this.f77753;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }
}
