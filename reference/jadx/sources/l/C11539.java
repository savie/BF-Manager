package l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ۨۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8UL */
/* JADX INFO: loaded from: classes3.dex */
public final class C11539 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2460 f38774 = new C2460(10);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0987 m28713(InterfaceC7222 interfaceC7222, InterfaceC11787 interfaceC11787) {
        C2460 c2460 = this.f38774;
        C0987 c0987M15036 = null;
        int i = 0;
        while (true) {
            try {
                interfaceC7222.mo19210(0, 10, c2460.m7518());
                c2460.m7510(0);
                if (c2460.m7525() != 4801587) {
                    break;
                }
                c2460.m7535(3);
                int iM7515 = c2460.m7515();
                int i2 = iM7515 + 10;
                if (c0987M15036 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(c2460.m7518(), 0, bArr, 0, 10);
                    interfaceC7222.mo19210(10, iM7515, bArr);
                    c0987M15036 = new C5436(interfaceC11787).m15036(i2, bArr);
                } else {
                    interfaceC7222.mo19209(iM7515);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        interfaceC7222.mo19217();
        interfaceC7222.mo19209(i);
        return c0987M15036;
    }
}
