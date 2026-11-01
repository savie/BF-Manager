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

/* JADX INFO: renamed from: l.ܰܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z754 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13916 implements InterfaceC2625 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final String[] f45841 = {"id", "key", "metadata"};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f45842;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3788 f45843;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final SparseArray f45844 = new SparseArray();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f45845;

    public C13916(C3788 c3788) {
        this.f45843 = c3788;
    }

    @Override // l.InterfaceC2625
    /* JADX INFO: renamed from: ۙ */
    public final void mo8100(long j) {
        String hexString = Long.toHexString(j);
        this.f45845 = hexString;
        this.f45842 = C0252.m1693("ExoPlayerCacheIndex", hexString);
    }

    @Override // l.InterfaceC2625
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo8105() throws C12962 {
        try {
            SQLiteDatabase readableDatabase = this.f45843.getReadableDatabase();
            String str = this.f45845;
            str.getClass();
            return C6611.m17944(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new C12962(e);
        }
    }

    @Override // l.InterfaceC2625
    public final void delete() throws C12962 {
        C3788 c3788 = this.f45843;
        String str = this.f45845;
        str.getClass();
        try {
            String strConcat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = c3788.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i = C6611.f22265;
                try {
                    String str2 = C17983.f57504;
                    if (DatabaseUtils.queryNumEntries(writableDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (SQLException e) {
                    throw new C12962(e);
                }
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e2) {
            throw new C12962(e2);
        }
    }

    @Override // l.InterfaceC2625
    /* JADX INFO: renamed from: ۙ */
    public final void mo8102(HashMap map, SparseArray sparseArray) throws C12962 {
        C3788 c3788 = this.f45843;
        C2023.m6510(this.f45844.size() == 0);
        try {
            SQLiteDatabase readableDatabase = c3788.getReadableDatabase();
            String str = this.f45845;
            str.getClass();
            if (C6611.m17944(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = c3788.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    m33757(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase readableDatabase2 = c3788.getReadableDatabase();
            String str2 = this.f45842;
            str2.getClass();
            Cursor cursorQuery = readableDatabase2.query(str2, f45841, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    string.getClass();
                    map.put(string, new C4742(i, string, C5448.m15099(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
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
            throw new C12962(e);
        }
    }

    @Override // l.InterfaceC2625
    /* JADX INFO: renamed from: ܰ */
    public final void mo8106(HashMap map) throws C12962 {
        try {
            SQLiteDatabase writableDatabase = this.f45843.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                m33757(writableDatabase);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    m33758(writableDatabase, (C4742) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.f45844.clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C12962(e);
        }
    }

    @Override // l.InterfaceC2625
    /* JADX INFO: renamed from: ۙ */
    public final void mo8101(HashMap map) throws C12962 {
        SparseArray sparseArray = this.f45844;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.f45843.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    C4742 c4742 = (C4742) sparseArray.valueAt(i);
                    if (c4742 == null) {
                        int iKeyAt = sparseArray.keyAt(i);
                        String str = this.f45842;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        m33758(writableDatabase, c4742);
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
            throw new C12962(e);
        }
    }

    @Override // l.InterfaceC2625
    /* JADX INFO: renamed from: ۙ */
    public final void mo8103(C4742 c4742) {
        this.f45844.put(c4742.f16689, c4742);
    }

    @Override // l.InterfaceC2625
    /* JADX INFO: renamed from: ۙ */
    public final void mo8104(C4742 c4742, boolean z) {
        int i = c4742.f16689;
        SparseArray sparseArray = this.f45844;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33757(SQLiteDatabase sQLiteDatabase) throws C12962 {
        String str = this.f45845;
        str.getClass();
        C6611.m17945(sQLiteDatabase, 1, str);
        String str2 = this.f45842;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + this.f45842 + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m33758(SQLiteDatabase sQLiteDatabase, C4742 c4742) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C5448.m15100(c4742.m13109(), new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(c4742.f16689));
        contentValues.put("key", c4742.f16688);
        contentValues.put("metadata", byteArray);
        String str = this.f45842;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }
}
