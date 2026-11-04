package l;

import android.net.Uri;

/* JADX INFO: renamed from: l.۟ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C7775 extends EnumC18962 {
    public /* synthetic */ C7775() {
        this("VISITOR", 1);
    }

    @Override // l.EnumC18962
    /* JADX INFO: renamed from: ۙ */
    public long mo1992() {
        return 1L;
    }

    public C7775(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC18962
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1994(String str) {
        return str.startsWith("visitor:");
    }

    @Override // l.EnumC18962
    /* JADX INFO: renamed from: ۙ */
    public boolean mo1993(Uri uri) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equalsIgnoreCase("mt_media") && uri.getAuthority() == null;
    }
}
