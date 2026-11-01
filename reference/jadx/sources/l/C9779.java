package l;

import com.alipay.sdk.m.w.a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.ۢᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P4D5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9779 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f33478;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Charset f33479;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Charset f33480;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24887(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24888(boolean z) {
        return z ? 1231 : 1237;
    }

    static {
        Charset.forName("US-ASCII");
        f33479 = Charset.forName(a.D);
        f33480 = Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        byte[] bArr = new byte[0];
        f33478 = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC3262.m9743(false, 0, 0, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24889(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
