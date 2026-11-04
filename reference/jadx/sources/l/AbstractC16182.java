package l;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܶܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9HU */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16182 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final byte[] f52521 = {0, 0};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AbstractC16182 f52522 = new C17674();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC16182 f52520 = new C16928();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract long mo38406(C25134 c25134);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo38408(C25134 c25134, long j);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo38409(C25134 c25134, String str);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract long mo38410(C25134 c25134);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38405(C25134 c25134, Charset charset) throws C2013 {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2];
        c25134.getClass();
        while (true) {
            c25134.m56024(2, bArr);
            if (bArr[0] != 0 || bArr[1] != 0) {
                byteArrayOutputStream.write(bArr, 0, 2);
            } else {
                return new String(byteArrayOutputStream.toByteArray(), charset);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38404(C25134 c25134, int i, Charset charset) throws C2013 {
        int i2 = i * 2;
        byte[] bArr = new byte[i2];
        c25134.m56024(i2, bArr);
        return new String(bArr, charset);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38407(C7453 c7453, String str) {
        mo38409((C25134) c7453, str);
        c7453.m56007(2, f52521);
    }
}
