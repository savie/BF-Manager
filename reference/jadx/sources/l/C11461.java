package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.ۨۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 39NU */
/* JADX INFO: loaded from: classes4.dex */
public final class C11461 extends AbstractC22044 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f38570;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] f38571;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f38572;

    public C11461(byte[] bArr, int i) {
        super(0);
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.f38571 = bArr;
        this.f38570 = 0;
        this.f38572 = i;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۨ */
    public final void mo14249(int i, int i2) throws C2287 {
        mo14248((i << 3) | i2);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܰ */
    public final void mo14252(int i, int i2) throws C2287 {
        mo14249(i, 0);
        mo14251(i2);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۖ */
    public final void mo14231(int i, int i2) throws C2287 {
        mo14249(i, 0);
        mo14248(i2);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final void mo14234(int i, int i2) throws C2287 {
        mo14249(i, 5);
        mo14233(i2);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܰ */
    public final void mo14253(int i, long j) throws C2287 {
        mo14249(i, 0);
        mo14256(j);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final void mo14236(int i, long j) throws C2287 {
        mo14249(i, 1);
        mo14242(j);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final void mo14240(int i, boolean z) throws C2287 {
        mo14249(i, 0);
        mo14232(z ? (byte) 1 : (byte) 0);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final void mo14237(int i, String str) throws C2287 {
        mo14249(i, 2);
        mo14243(str);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final void mo14239(int i, AbstractC23725 abstractC23725) throws C2287 {
        mo14249(i, 2);
        mo14245(abstractC23725);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final void mo14245(AbstractC23725 abstractC23725) throws C2287 {
        mo14248(abstractC23725.size());
        abstractC23725.mo16490(this);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final void mo14241(int i, byte[] bArr) throws C2287 {
        mo14248(i);
        m28607(bArr, 0, i);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܰ */
    public final void mo14254(int i, InterfaceC23206 interfaceC23206) throws C2287 {
        mo14249(i, 2);
        mo14244(interfaceC23206);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final void mo14238(int i, InterfaceC23206 interfaceC23206, InterfaceC6667 interfaceC6667) throws C2287 {
        mo14249(i, 2);
        mo14248(((AbstractC18079) interfaceC23206).getSerializedSize(interfaceC6667));
        interfaceC6667.mo18057((Object) interfaceC23206, (InterfaceC12976) this.f71448);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۨ */
    public final void mo14250(int i, InterfaceC23206 interfaceC23206) throws C2287 {
        mo14249(1, 3);
        mo14231(2, i);
        mo14254(3, interfaceC23206);
        mo14249(1, 4);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܰ */
    public final void mo14255(int i, AbstractC23725 abstractC23725) throws C2287 {
        mo14249(1, 3);
        mo14231(2, i);
        mo14239(3, abstractC23725);
        mo14249(1, 4);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final void mo14244(InterfaceC23206 interfaceC23206) throws C2287 {
        mo14248(interfaceC23206.getSerializedSize());
        interfaceC23206.writeTo(this);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final void mo14232(byte b) throws C2287 {
        try {
            byte[] bArr = this.f38571;
            int i = this.f38570;
            this.f38570 = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C2287(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f38570), Integer.valueOf(this.f38572), 1), e);
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܰ */
    public final void mo14251(int i) throws C2287 {
        if (i >= 0) {
            mo14248(i);
        } else {
            mo14256(i);
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۨ */
    public final void mo14248(int i) throws C2287 {
        while (true) {
            int i2 = i & a.g;
            byte[] bArr = this.f38571;
            if (i2 == 0) {
                int i3 = this.f38570;
                this.f38570 = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.f38570;
                    this.f38570 = i4 + 1;
                    bArr[i4] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C2287(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f38570), Integer.valueOf(this.f38572), 1), e);
                }
            }
            throw new C2287(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f38570), Integer.valueOf(this.f38572), 1), e);
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final void mo14233(int i) throws C2287 {
        try {
            byte[] bArr = this.f38571;
            int i2 = this.f38570;
            int i3 = i2 + 1;
            this.f38570 = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f38570 = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f38570 = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f38570 = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C2287(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f38570), Integer.valueOf(this.f38572), 1), e);
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ܰ */
    public final void mo14256(long j) throws C2287 {
        boolean z = AbstractC22044.f71446;
        byte[] bArr = this.f38571;
        if (z && mo28606() >= 10) {
            while ((j & (-128)) != 0) {
                int i = this.f38570;
                this.f38570 = i + 1;
                C15882.m37782(bArr, i, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i2 = this.f38570;
            this.f38570 = i2 + 1;
            C15882.m37782(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i3 = this.f38570;
                this.f38570 = i3 + 1;
                bArr[i3] = (byte) ((((int) j) | 128) & 255);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new C2287(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f38570), Integer.valueOf(this.f38572), 1), e);
            }
        }
        int i4 = this.f38570;
        this.f38570 = i4 + 1;
        bArr[i4] = (byte) j;
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final void mo14242(long j) throws C2287 {
        try {
            byte[] bArr = this.f38571;
            int i = this.f38570;
            int i2 = i + 1;
            this.f38570 = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f38570 = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f38570 = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f38570 = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f38570 = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f38570 = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f38570 = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f38570 = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C2287(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f38570), Integer.valueOf(this.f38572), 1), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28607(byte[] bArr, int i, int i2) throws C2287 {
        try {
            System.arraycopy(bArr, i, this.f38571, this.f38570, i2);
            this.f38570 += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C2287(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f38570), Integer.valueOf(this.f38572), Integer.valueOf(i2)), e);
        }
    }

    @Override // l.AbstractC10319
    /* JADX INFO: renamed from: ۙ */
    public final void mo14235(int i, int i2, byte[] bArr) throws C2287 {
        m28607(bArr, i, i2);
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ */
    public final void mo14243(String str) throws C2287 {
        int i = this.f38570;
        try {
            int iM48959 = AbstractC22044.m48959(str.length() * 3);
            int iM489510 = AbstractC22044.m48959(str.length());
            byte[] bArr = this.f38571;
            if (iM489510 == iM48959) {
                int i2 = i + iM489510;
                this.f38570 = i2;
                int iM16289 = C6003.m16289(i2, mo28606(), str, bArr);
                this.f38570 = i;
                mo14248((iM16289 - i) - iM489510);
                this.f38570 = iM16289;
                return;
            }
            mo14248(C6003.m16291(str));
            this.f38570 = C6003.m16289(this.f38570, mo28606(), str, bArr);
        } catch (IndexOutOfBoundsException e) {
            throw new C2287(e);
        } catch (C12354 e2) {
            this.f38570 = i;
            m48976(str, e2);
        }
    }

    @Override // l.AbstractC22044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo28606() {
        return this.f38572 - this.f38570;
    }
}
