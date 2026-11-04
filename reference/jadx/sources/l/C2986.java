package l;

import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۖ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F1TL */
/* JADX INFO: loaded from: classes3.dex */
public final class C2986 extends AbstractC9697 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] f9692;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f9693;

    public C2986(C0573 c0573) {
        byte[] bArrMo2594 = c0573.mo2594(65531);
        this.f9692 = bArrMo2594;
        this.f9693 = bArrMo2594.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9708(C0573 c0573) {
        c0573.mo2592(this.f9692);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9707(int i, DataInputStream dataInputStream) throws IOException {
        if (i < 5) {
            throw new C13996();
        }
        if (dataInputStream.readUnsignedByte() != 0) {
            throw new C13996();
        }
        this.f31310 = dataInputStream.readInt();
        this.f31311 = -1;
        int i2 = i - 5;
        byte[] bArr = this.f9692;
        int length = bArr.length - i2;
        this.f9693 = length;
        dataInputStream.readFully(bArr, length, i2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m9709() {
        return this.f9693 == this.f9692.length && this.f31310 == 0;
    }

    @Override // l.AbstractC9697
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9706() throws C13996 {
        int i = this.f31311;
        if (((-16777216) & i) == 0) {
            try {
                int i2 = this.f31310 << 8;
                byte[] bArr = this.f9692;
                int i3 = this.f9693;
                this.f9693 = i3 + 1;
                this.f31310 = i2 | (bArr[i3] & 255);
                this.f31311 = i << 8;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C13996();
            }
        }
    }
}
