package l;

import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59S0 */
/* JADX INFO: loaded from: classes2.dex */
public class C23235 extends AbstractC23089 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public transient C18295 f75395;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f75396;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f75397;

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۚ */
    public final C23235 mo46707() {
        return this;
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ᩶ۙ */
    public final boolean mo46731() {
        return true;
    }

    public C23235(File file, Uri uri, C18295 c18295) {
        super(file, uri);
        this.f75395 = c18295;
        this.f75396 = c18295.f58374;
        String path = file.getPath();
        this.f75397 = path.length() != 18 ? false : path.equalsIgnoreCase(c18295.m42503());
    }

    @Override // l.AbstractC23089
    /* JADX INFO: renamed from: ۙ */
    public C23235 mo32854(File file, Uri uri) {
        return new C23235(file, uri, m51272());
    }

    /* JADX INFO: renamed from: ۙۨ, reason: not valid java name and contains not printable characters */
    public final C18295 m51272() {
        C18295 c18295 = this.f75395;
        if (c18295 != null) {
            return c18295;
        }
        C18295 c18295M43706 = C19001.m43706(this.f75396);
        C13638.requireNonNull(c18295M43706);
        this.f75395 = c18295M43706;
        return c18295M43706;
    }

    @Override // l.AbstractC23089, l.C22383
    /* JADX INFO: renamed from: ֡ܰ */
    public void mo40897() {
        super.mo40897();
        String str = mo40127().getPathSegments().get(3);
        C18295 c18295M51272 = m51272();
        synchronized (c18295M51272.f58378) {
            Iterator it = c18295M51272.f58378.values().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next())) {
                    it.remove();
                }
            }
        }
        C4716.m13051(new RunnableC11767(2, c18295M51272), c18295M51272, 500L);
    }

    @Override // l.AbstractC23089
    /* JADX INFO: renamed from: ֫ܰ */
    public final void mo51097() {
        Cursor cursorQuery = C16737.m39259().query(m51272().f58380, new String[]{"document_id", "_display_name"}, null, null, null);
        if (cursorQuery == null) {
            try {
                C10535.m26673(this);
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51273(File file, Uri uri, boolean z) {
        String strSubstring = file.getPath().substring(19);
        boolean z2 = !z && file.getName().equals(C22529.m50045(uri));
        C18295 c18295M51272 = m51272();
        String strM42504 = c18295M51272.m42504(strSubstring, z2);
        String str = uri.getPathSegments().get(3);
        if (strM42504.equals(str)) {
            return;
        }
        c18295M51272.f58378.put(C22697.m50267(new StringBuilder(), c18295M51272.f58379, strSubstring), str);
        C4716.m13051(new RunnableC11767(2, c18295M51272), c18295M51272, 500L);
    }

    @Override // l.AbstractC23089
    /* JADX INFO: renamed from: ۙ */
    public void mo40904(File file, Uri uri, boolean z) {
        m51273(file, uri, z);
    }

    @Override // l.C22383
    /* JADX INFO: renamed from: ۙ */
    public final void mo49659(Uri uri, boolean z) {
        super.mo49659(uri, z);
        m51273(new File(this.f75029.getPath()), uri, z);
    }

    @Override // l.AbstractC23089, l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ֫ۙ */
    public final long mo33964() {
        if (this.f75397) {
            return -1L;
        }
        return super.mo33964();
    }

    @Override // l.AbstractC23089, l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ۟ۙ */
    public final boolean mo33971() {
        if (this.f75397) {
            return false;
        }
        return super.mo33971();
    }

    @Override // l.AbstractC23089, l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ۤۙ */
    public final boolean mo33974() {
        if (this.f75397) {
            return true;
        }
        return super.mo33974();
    }

    @Override // l.AbstractC23089, l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ۧ */
    public boolean mo33975() {
        if (this.f75397) {
            return true;
        }
        return super.mo33975();
    }

    /* JADX INFO: renamed from: ᩹ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m51274() {
        return this.f75397;
    }

    @Override // l.AbstractC23089, l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ᩻ۙ */
    public final long mo33991() {
        if (this.f75397) {
            return 0L;
        }
        return super.mo33991();
    }

    @Override // l.AbstractC23089
    /* JADX INFO: renamed from: ܳܰ */
    public final boolean mo51100() {
        return "com.android.mtp.documents".equals(mo40127().getAuthority());
    }

    @Override // l.AbstractC23089
    /* JADX INFO: renamed from: ۗܰ */
    public boolean mo40900() throws IOException {
        if (this.f75397) {
            return true;
        }
        C18295 c18295M51272 = m51272();
        Uri uri = c18295M51272.f58380;
        Uri uriM50046 = C22529.m50046(uri);
        String path = this.f75029.getPath();
        int length = c18295M51272.m42503().length() + 1;
        boolean zEquals = true;
        while (length < path.length()) {
            int iIndexOf = path.indexOf(47, length);
            if (iIndexOf < 0) {
                iIndexOf = path.length();
            }
            String strSubstring = path.substring(length, iIndexOf);
            Cursor cursorQuery = C16737.m39259().query(C22529.m50042(uriM50046), new String[]{"document_id", "_display_name", "mime_type"}, null, null, null);
            if (cursorQuery == null) {
                throw new IOException("Provider directory is unavailable");
            }
            Uri uri2 = null;
            while (cursorQuery.moveToNext()) {
                try {
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
            cursorQuery.close();
            if (uri2 == null) {
                return false;
            }
            if (iIndexOf < path.length() && !zEquals) {
                throw new IOException("Provider path parent is not a directory");
            }
            length = iIndexOf + 1;
            uriM50046 = uri2;
        }
        if (!uriM50046.equals(mo40127())) {
            mo49659(uriM50046, zEquals);
        }
        return true;
    }
}
