package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩸ۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N4FD */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21307 {
    /* JADX INFO: renamed from: ۙ */
    public abstract long mo4375();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo4376(InterfaceC10983 interfaceC10983);

    /* JADX INFO: renamed from: ۨ */
    public abstract C9501 mo4377();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC21307 m47776(C9501 c9501, String str) {
        Charset charset = C0140.f1178;
        if (c9501 != null) {
            Charset charsetM24338 = c9501.m24338((Charset) null);
            if (charsetM24338 == null) {
                try {
                    c9501 = C9501.m24336(c9501 + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    c9501 = null;
                }
            } else {
                charset = charsetM24338;
            }
        }
        return m47777(c9501, str.getBytes(charset));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC21307 m47777(C9501 c9501, byte[] bArr) {
        int length = bArr.length;
        long length2 = bArr.length;
        long j = 0;
        long j2 = length;
        byte[] bArr2 = C0140.f1168;
        if ((j | j2) >= 0 && j <= length2 && length2 - j >= j2) {
            return new C14958(c9501, length, bArr);
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
