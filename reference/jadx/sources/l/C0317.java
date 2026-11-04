package l;

import android.net.Uri;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;

/* JADX INFO: renamed from: l.֡ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C0317 extends EnumC18962 {
    public /* synthetic */ C0317() {
        this("HTTP", 0);
    }

    @Override // l.EnumC18962
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long mo1992() {
        return 2L;
    }

    public C0317(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC18962
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo1994(String str) {
        return str.startsWith("http:");
    }

    @Override // l.EnumC18962
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo1993(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            return (scheme.equalsIgnoreCase(a.s) || scheme.equalsIgnoreCase(b.a)) && uri.getHost() != null;
        }
        return false;
    }
}
