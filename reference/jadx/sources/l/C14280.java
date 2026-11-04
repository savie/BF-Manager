package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ܰ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: M8UL */
/* JADX INFO: loaded from: classes4.dex */
public final class C14280 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21287 f45110 = new C21287(10);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19378 m34693(InterfaceC19502 interfaceC19502, InterfaceC18689 interfaceC18689) {
        C21287 c21287 = this.f45110;
        C19378 c19378M22215 = null;
        int i = 0;
        while (true) {
            try {
                interfaceC19502.mo10069(0, 10, c21287.m48497());
                c21287.m48510(0);
                if (c21287.m48501() != 4801587) {
                    break;
                }
                c21287.m48503(3);
                int iM48499 = c21287.m48499();
                int i2 = iM48499 + 10;
                if (c19378M22215 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(c21287.m48497(), 0, bArr, 0, 10);
                    interfaceC19502.mo10069(10, iM48499, bArr);
                    c19378M22215 = new C8248(interfaceC18689).m22215(i2, bArr);
                } else {
                    interfaceC19502.mo10068(iM48499);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        interfaceC19502.mo10076();
        interfaceC19502.mo10068(i);
        return c19378M22215;
    }
}
