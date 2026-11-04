package l;

import android.net.Uri;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.ۙۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7MY */
/* JADX INFO: loaded from: classes2.dex */
public final class C4595 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f16313 = new C13739(5, 1.0f, false);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m14393(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.f16313.get(uri);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14392(Uri uri, byte[] bArr) {
        uri.getClass();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] m14394(Uri uri) {
        uri.getClass();
        return (byte[]) this.f16313.remove(uri);
    }
}
