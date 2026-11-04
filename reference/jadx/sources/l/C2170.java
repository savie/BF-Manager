package l;

import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59S0 */
/* JADX INFO: loaded from: classes3.dex */
public class C2170 extends AbstractC2082 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f7148;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f7149;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public transient C25291 f7150;

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C2170 mo7467() {
        return this;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo7468() {
        return true;
    }

    public C2170(File file, Uri uri, C25291 c25291) {
        super(file, uri);
        this.f7150 = c25291;
        this.f7149 = c25291.f81684;
        String path = file.getPath();
        this.f7148 = path.length() != 18 ? false : path.equalsIgnoreCase(c25291.m56469());
    }

    @Override // l.AbstractC2082
    /* JADX INFO: renamed from: ۙ */
    public C2170 mo2937(File file, Uri uri) {
        return new C2170(file, uri, m7465());
    }

    /* JADX INFO: renamed from: ۙۤ, reason: not valid java name and contains not printable characters */
    public final C25291 m7465() {
        C25291 c25291 = this.f7150;
        if (c25291 != null) {
            return c25291;
        }
        C25291 c25291M40226 = C17085.m40226(this.f7149);
        C17359.requireNonNull(c25291M40226);
        this.f7150 = c25291M40226;
        return c25291M40226;
    }

    @Override // l.AbstractC2082, l.C22965
    /* JADX INFO: renamed from: ܿ᩷ */
    public void mo2952() {
        super.mo2952();
        String str = mo42888().getPathSegments().get(3);
        C25291 c25291M7465 = m7465();
        synchronized (c25291M7465.f81683) {
            Iterator it = c25291M7465.f81683.values().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next())) {
                    it.remove();
                }
            }
        }
        C5261.m15836(new RunnableC4773(3, c25291M7465), c25291M7465, 500L);
    }

    @Override // l.AbstractC2082
    /* JADX INFO: renamed from: ۠᩷ */
    public final void mo7166() {
        Cursor cursorQuery = C21576.m49091().query(m7465().f81685, new String[]{"document_id", "_display_name"}, null, null, null);
        if (cursorQuery == null) {
            try {
                C20815.m47617(this);
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
        if (cursorQuery != null) {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m7469(File file, Uri uri, boolean z) {
        String strSubstring = file.getPath().substring(19);
        boolean z2 = !z && file.getName().equals(C23053.m51954(uri));
        C25291 c25291M7465 = m7465();
        String strM56470 = c25291M7465.m56470(strSubstring, z2);
        String str = uri.getPathSegments().get(3);
        if (strM56470.equals(str)) {
            return;
        }
        c25291M7465.f81683.put(C8947.m23910(new StringBuilder(), c25291M7465.f81687, strSubstring), str);
        C5261.m15836(new RunnableC4773(3, c25291M7465), c25291M7465, 500L);
    }

    @Override // l.AbstractC2082
    /* JADX INFO: renamed from: ۙ */
    public void mo2940(File file, Uri uri, boolean z) {
        m7469(file, uri, z);
    }

    @Override // l.C22965
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7464(Uri uri, boolean z) {
        super.mo7464(uri, z);
        m7469(new File(this.f6914.getPath()), uri, z);
    }

    @Override // l.AbstractC2082, l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ֨ */
    public boolean mo2934() {
        if (this.f7148) {
            return true;
        }
        return super.mo2934();
    }

    @Override // l.AbstractC2082, l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ۛۙ */
    public final boolean mo4281() {
        if (this.f7148) {
            return true;
        }
        return super.mo4281();
    }

    @Override // l.AbstractC2082, l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ۠ۙ */
    public final long mo4285() {
        if (this.f7148) {
            return -1L;
        }
        return super.mo4285();
    }

    @Override // l.AbstractC2082, l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ۡۙ */
    public final long mo4286() {
        if (this.f7148) {
            return 0L;
        }
        return super.mo4286();
    }

    /* JADX INFO: renamed from: ۫ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m7466() {
        return this.f7148;
    }

    @Override // l.AbstractC2082, l.C22965, l.AbstractC22044
    /* JADX INFO: renamed from: ᩺ۙ */
    public final boolean mo4304() {
        if (this.f7148) {
            return false;
        }
        return super.mo4304();
    }

    @Override // l.AbstractC2082
    /* JADX INFO: renamed from: ۖ᩷ */
    public final boolean mo7163() {
        return "com.android.mtp.documents".equals(mo42888().getAuthority());
    }

    @Override // l.AbstractC2082
    /* JADX INFO: renamed from: ۬᩷ */
    public boolean mo2949() throws IOException {
        if (this.f7148) {
            return true;
        }
        C25291 c25291M7465 = m7465();
        Uri uri = c25291M7465.f81685;
        Uri uriM51956 = C23053.m51956(uri);
        String path = this.f6914.getPath();
        int length = c25291M7465.m56469().length() + 1;
        boolean zEquals = true;
        while (length < path.length()) {
            int iIndexOf = path.indexOf(47, length);
            if (iIndexOf < 0) {
                iIndexOf = path.length();
            }
            String strSubstring = path.substring(length, iIndexOf);
            Cursor cursorQuery = C21576.m49091().query(C23053.m51952(uriM51956), new String[]{"document_id", "_display_name", "mime_type"}, null, null, null);
            if (cursorQuery == null) {
                throw new IOException("Provider directory is unavailable");
            }
            try {
                C20069.m46193(cursorQuery);
                Uri uri2 = null;
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(1);
                    String string2 = cursorQuery.getString(0);
                    if (string == null || string2 == null) {
                        throw new IOException("Provider returned invalid child identity");
                    }
                    if (strSubstring.equals(string)) {
                        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, string2);
                        if (uri2 != null && !uri2.equals(uriBuildDocumentUriUsingTree)) {
                            throw new IOException("Provider path has ambiguous child names");
                        }
                        uri2 = uriBuildDocumentUriUsingTree;
                        zEquals = "vnd.android.document/directory".equals(cursorQuery.getString(2));
                    }
                }
                cursorQuery.close();
                if (uri2 == null) {
                    return false;
                }
                if (iIndexOf < path.length() && !zEquals) {
                    throw new IOException("Provider path parent is not a directory");
                }
                length = iIndexOf + 1;
                uriM51956 = uri2;
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
        if (!uriM51956.equals(mo42888())) {
            mo7464(uriM51956, zEquals);
        }
        return true;
    }
}
