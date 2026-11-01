package l;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.֫ۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V9HU */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1748 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final byte[] f6872 = {0, 0};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final AbstractC1748 f6873 = new C14450();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC1748 f6871 = new C23622();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract long mo5790(C10922 c10922);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo5791(C10922 c10922, long j);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo5792(C10922 c10922, String str);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract long mo5794(C10922 c10922);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m5789(C10922 c10922, Charset charset) throws C17271 {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2];
        c10922.getClass();
        while (true) {
            c10922.m27397(2, bArr);
            if (bArr[0] != 0 || bArr[1] != 0) {
                byteArrayOutputStream.write(bArr, 0, 2);
            } else {
                return new String(byteArrayOutputStream.toByteArray(), charset);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m5788(C10922 c10922, int i, Charset charset) throws C17271 {
        int i2 = i * 2;
        byte[] bArr = new byte[i2];
        c10922.m27397(i2, bArr);
        return new String(bArr, charset);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5793(C19240 c19240, String str) {
        mo5792((C10922) c19240, str);
        c19240.m27383(2, f6872);
    }
}
