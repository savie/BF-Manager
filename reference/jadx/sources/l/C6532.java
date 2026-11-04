package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۛܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9EH */
/* JADX INFO: loaded from: classes3.dex */
public final class C6532 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Charset f21949 = C22150.f71350;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m18404(C9689 c9689, byte[] bArr, byte[]... bArr2) {
        try {
            c9689.getClass();
            InterfaceC5216 interfaceC5216M25275 = C9689.m25275("HMACT64");
            interfaceC5216M25275.init(bArr);
            for (byte[] bArr3 : bArr2) {
                interfaceC5216M25275.update(bArr3);
            }
            return interfaceC5216M25275.mo9696();
        } catch (C11181 e) {
            throw new C5786(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m18405(C9689 c9689, byte[]... bArr) {
        try {
            c9689.getClass();
            C1487 c1487M25274 = C9689.m25274("MD5");
            for (byte[] bArr2 : bArr) {
                c1487M25274.m5309(bArr2);
            }
            return c1487M25274.m5311();
        } catch (C11181 e) {
            throw new C5786(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m18403(C9689 c9689, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr2.length];
        try {
            c9689.getClass();
            InterfaceC7233 interfaceC7233M12123 = C3724.m12123();
            interfaceC7233M12123.mo19835(EnumC8724.ENCRYPT, bArr);
            interfaceC7233M12123.doFinal(bArr3, interfaceC7233M12123.mo19834(bArr2.length, bArr2, bArr3));
            return bArr3;
        } catch (C11181 e) {
            throw new C5786(e);
        }
    }
}
