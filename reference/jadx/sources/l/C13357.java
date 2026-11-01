package l;

import android.net.Uri;
import java.io.File;

/* JADX INFO: renamed from: l.۬᩷ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 116O */
/* JADX INFO: loaded from: classes4.dex */
public final class C13357 extends AbstractC23089 {
    public C13357(File file, Uri uri) {
        super(file, uri);
        if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
            return;
        }
        throw new IllegalArgumentException("Unsupported uri authority: " + uri.getAuthority());
    }

    @Override // l.AbstractC23089
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23089 mo32854(File file, Uri uri) {
        return new C13357(file, uri);
    }

    @Override // l.AbstractC23089
    /* JADX INFO: renamed from: ۫ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC23089 mo32857() {
        File parentFile = this.f75029.getParentFile();
        Uri uriM50041 = C22529.m50041(mo40127());
        if (parentFile == null || uriM50041 == null) {
            return null;
        }
        return new C13357(parentFile, uriM50041);
    }

    @Override // l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo32856() {
        return C19812.m45045().mo43869();
    }

    @Override // l.C22383, l.AbstractC20745
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo32858() {
        return C19812.m45045().mo43869();
    }

    @Override // l.AbstractC20745
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo32855(long j) {
        if (j < 0 || !this.f75029.setLastModified(j)) {
            return false;
        }
        C6860 c6860 = this.f75028;
        if (c6860 == null) {
            return true;
        }
        c6860.f23140 = j;
        return true;
    }

    @Override // l.AbstractC23089
    /* JADX INFO: renamed from: ᩻ܰ, reason: not valid java name and contains not printable characters */
    public final String mo32859() {
        return C22529.m50044(mo40127());
    }
}
