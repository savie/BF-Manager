package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۢܳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: N4FD */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10190 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract long mo26310();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo26311(InterfaceC11573 interfaceC11573);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract C16157 mo26312();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC10190 m26308(C16157 c16157, String str) {
        Charset charset = C19822.f63729;
        if (c16157 != null) {
            Charset charsetM38333 = c16157.m38333((Charset) null);
            if (charsetM38333 == null) {
                try {
                    c16157 = C16157.m38331(c16157 + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    c16157 = null;
                }
            } else {
                charset = charsetM38333;
            }
        }
        return m26309(c16157, str.getBytes(charset));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC10190 m26309(C16157 c16157, byte[] bArr) {
        int length = bArr.length;
        long length2 = bArr.length;
        long j = 0;
        long j2 = length;
        byte[] bArr2 = C19822.f63715;
        if ((j | j2) >= 0 && j <= length2 && length2 - j >= j2) {
            return new C19141(c16157, length, bArr);
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
