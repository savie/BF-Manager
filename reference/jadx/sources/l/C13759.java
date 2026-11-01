package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.ܰۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C13759 extends EnumC11642 {
    public /* synthetic */ C13759() {
        this("VISITOR", 1);
    }

    @Override // l.EnumC11642
    /* JADX INFO: renamed from: ۙ */
    public long mo12733() {
        return 1L;
    }

    public C13759(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC11642
    /* JADX INFO: renamed from: ۙ */
    public boolean mo12735(String str) {
        return str.startsWith("visitor:");
    }

    @Override // l.EnumC11642
    /* JADX INFO: renamed from: ۙ */
    public boolean mo12734(Uri uri) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equalsIgnoreCase("mt_media") && uri.getAuthority() == null;
    }
}
