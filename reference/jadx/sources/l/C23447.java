package l;

import com.alipay.sdk.m.w.a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.᩹ۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: P4D5 */
/* JADX INFO: loaded from: classes.dex */
public final class C23447 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f75887;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Charset f75888;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Charset f75889;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m52660(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m52661(boolean z) {
        return z ? 1231 : 1237;
    }

    static {
        Charset.forName("US-ASCII");
        f75888 = Charset.forName(a.D);
        f75889 = Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        byte[] bArr = new byte[0];
        f75887 = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC3660.m11872(false, 0, 0, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52662(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
