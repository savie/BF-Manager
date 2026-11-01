package l;

import android.net.Uri;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ᩴܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7MY */
/* JADX INFO: loaded from: classes4.dex */
public final class C18813 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f60978 = new C18107(5, 1.0f, false);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m43417(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.f60978.get(uri);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43416(Uri uri, byte[] bArr) {
        uri.getClass();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] m43418(Uri uri) {
        uri.getClass();
        return (byte[]) this.f60978.remove(uri);
    }
}
