package l;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙܰܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8KG */
/* JADX INFO: loaded from: classes3.dex */
public final class C4689 implements InterfaceC15785 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f16573;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f16574;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15785 f16575;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f16576;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3009 f16577;

    public C4689(InterfaceC15785 interfaceC15785, int i, InterfaceC3009 interfaceC3009) {
        C2023.m6507(i > 0);
        this.f16575 = interfaceC15785;
        this.f16576 = i;
        this.f16577 = interfaceC3009;
        this.f16573 = new byte[1];
        this.f16574 = i;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f16574;
        InterfaceC15785 interfaceC15785 = this.f16575;
        if (i3 == 0) {
            byte[] bArr2 = this.f16573;
            int i4 = 0;
            if (interfaceC15785.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = interfaceC15785.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        ((C3278) this.f16577).m9774(new C2460(bArr3, i5));
                    }
                }
                this.f16574 = this.f16576;
            }
            return -1;
        }
        int i8 = interfaceC15785.read(bArr, i, Math.min(this.f16574, i2));
        if (i8 != -1) {
            this.f16574 -= i8;
        }
        return i8;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        return this.f16575.mo9274();
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final Map mo9273() {
        return this.f16575.mo9273();
    }

    @Override // l.InterfaceC15785
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final void mo11161(InterfaceC19706 interfaceC19706) {
        interfaceC19706.getClass();
        this.f16575.mo11161(interfaceC19706);
    }
}
