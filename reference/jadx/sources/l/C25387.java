package l;

import android.database.Cursor;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩻᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes.dex */
public final class C25387 extends AbstractC13057 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22965 f81957;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f81958;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f81959;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Uri f81960;

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo32546() {
        return true;
    }

    public C25387(String str, String str2, C22965 c22965, Uri uri) {
        this.f81959 = str;
        this.f81958 = str2;
        this.f81957 = c22965;
        this.f81960 = uri;
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۫ */
    public final String mo17426() {
        return this.f81959;
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۤ */
    public final String mo17425() {
        return this.f81958;
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ᩹ */
    public final InputStream mo17428() {
        return this.f81957.mo4290();
    }

    @Override // l.AbstractC13057
    /* JADX INFO: renamed from: ۗ */
    public final C15294 mo17423() throws IOException {
        try {
            Cursor cursorQuery = C21576.m49091().query(this.f81960, null, null, null, null);
            long jMax = -1;
            long j = 0;
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int columnIndex = cursorQuery.getColumnIndex("_size");
                        int columnIndex2 = cursorQuery.getColumnIndex("last_modified");
                        if (columnIndex >= 0 && !cursorQuery.isNull(columnIndex)) {
                            jMax = Math.max(-1L, cursorQuery.getLong(columnIndex));
                        }
                        if (columnIndex2 >= 0 && !cursorQuery.isNull(columnIndex2)) {
                            j = cursorQuery.getLong(columnIndex2);
                        }
                    }
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
            }
            long j2 = j;
            C15294 c15294 = new C15294(this.f81959, jMax, j2);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return c15294;
        } catch (RuntimeException e) {
            throw new IOException("Could not query image content metadata", e);
        }
    }
}
