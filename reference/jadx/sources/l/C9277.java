package l;

import android.database.Cursor;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۢ֫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes3.dex */
public final class C9277 extends AbstractC1886 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Uri f31535;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22383 f31536;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f31537;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f31538;

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo6140() {
        return true;
    }

    public C9277(String str, String str2, C22383 c22383, Uri uri) {
        this.f31538 = str;
        this.f31537 = str2;
        this.f31536 = c22383;
        this.f31535 = uri;
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ֨ */
    public final String mo5281() {
        return this.f31538;
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ۖ */
    public final String mo5282() {
        return this.f31537;
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ᩴ */
    public final InputStream mo5285() {
        return this.f31536.mo33970();
    }

    @Override // l.AbstractC1886
    /* JADX INFO: renamed from: ۠ */
    public final C14588 mo5283() throws IOException {
        try {
            Cursor cursorQuery = C16737.m39259().query(this.f31535, null, null, null, null);
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
            C14588 c14588 = new C14588(this.f31538, jMax, j2);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return c14588;
        } catch (RuntimeException e) {
            throw new IOException("Could not query image content metadata", e);
        }
    }
}
