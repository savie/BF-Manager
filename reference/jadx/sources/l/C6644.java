package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.ۛ᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 39NU */
/* JADX INFO: loaded from: classes3.dex */
public final class C6644 extends AbstractC14846 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f22172;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f22173;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final byte[] f22174;

    public C6644(byte[] bArr, int i) {
        super(0);
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.f22174 = bArr;
        this.f22172 = 0;
        this.f22173 = i;
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۤ */
    public final void mo14019(int i, int i2) throws C24544 {
        mo14018((i << 3) | i2);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14022(int i, int i2) throws C24544 {
        mo14019(i, 0);
        mo14021(i2);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ᩸ */
    public final void mo14027(int i, int i2) throws C24544 {
        mo14019(i, 0);
        mo14018(i2);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ */
    public final void mo14004(int i, int i2) throws C24544 {
        mo14019(i, 5);
        mo14003(i2);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14023(int i, long j) throws C24544 {
        mo14019(i, 0);
        mo14026(j);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ */
    public final void mo14006(int i, long j) throws C24544 {
        mo14019(i, 1);
        mo14012(j);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ */
    public final void mo14010(int i, boolean z) throws C24544 {
        mo14019(i, 0);
        mo14002(z ? (byte) 1 : (byte) 0);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ */
    public final void mo14007(int i, String str) throws C24544 {
        mo14019(i, 2);
        mo14013(str);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ */
    public final void mo14008(int i, AbstractC17084 abstractC17084) throws C24544 {
        mo14019(i, 2);
        mo14014(abstractC17084);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ */
    public final void mo14014(AbstractC17084 abstractC17084) throws C24544 {
        mo14018(abstractC17084.size());
        abstractC17084.mo29724(this);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ */
    public final void mo14011(int i, byte[] bArr) throws C24544 {
        mo14018(i);
        m18583(bArr, 0, i);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14025(int i, InterfaceC18775 interfaceC18775) throws C24544 {
        mo14019(i, 2);
        mo14015(interfaceC18775);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ */
    public final void mo14009(int i, InterfaceC18775 interfaceC18775, InterfaceC7762 interfaceC7762) throws C24544 {
        mo14019(i, 2);
        mo14018(((AbstractC9427) interfaceC18775).getSerializedSize(interfaceC7762));
        interfaceC7762.mo21143((Object) interfaceC18775, (InterfaceC18356) this.f48543);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۤ */
    public final void mo14020(int i, InterfaceC18775 interfaceC18775) throws C24544 {
        mo14019(1, 3);
        mo14027(2, i);
        mo14025(3, interfaceC18775);
        mo14019(1, 4);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14024(int i, AbstractC17084 abstractC17084) throws C24544 {
        mo14019(1, 3);
        mo14027(2, i);
        mo14008(3, abstractC17084);
        mo14019(1, 4);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ */
    public final void mo14015(InterfaceC18775 interfaceC18775) throws C24544 {
        mo14018(interfaceC18775.getSerializedSize());
        interfaceC18775.writeTo(this);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ */
    public final void mo14002(byte b) throws C24544 {
        try {
            byte[] bArr = this.f22174;
            int i = this.f22172;
            this.f22172 = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C24544(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22172), Integer.valueOf(this.f22173), 1), e);
        }
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14021(int i) throws C24544 {
        if (i >= 0) {
            mo14018(i);
        } else {
            mo14026(i);
        }
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۤ */
    public final void mo14018(int i) throws C24544 {
        while (true) {
            int i2 = i & a.g;
            byte[] bArr = this.f22174;
            if (i2 == 0) {
                int i3 = this.f22172;
                this.f22172 = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    int i4 = this.f22172;
                    this.f22172 = i4 + 1;
                    bArr[i4] = (byte) ((i | 128) & 255);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new C24544(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22172), Integer.valueOf(this.f22173), 1), e);
                }
            }
            throw new C24544(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22172), Integer.valueOf(this.f22173), 1), e);
        }
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ */
    public final void mo14003(int i) throws C24544 {
        try {
            byte[] bArr = this.f22174;
            int i2 = this.f22172;
            int i3 = i2 + 1;
            this.f22172 = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f22172 = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f22172 = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f22172 = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C24544(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22172), Integer.valueOf(this.f22173), 1), e);
        }
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14026(long j) throws C24544 {
        boolean z = AbstractC14846.f48540;
        byte[] bArr = this.f22174;
        if (z && mo18582() >= 10) {
            while ((j & (-128)) != 0) {
                int i = this.f22172;
                this.f22172 = i + 1;
                C22832.m51513(bArr, i, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i2 = this.f22172;
            this.f22172 = i2 + 1;
            C22832.m51513(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i3 = this.f22172;
                this.f22172 = i3 + 1;
                bArr[i3] = (byte) ((((int) j) | 128) & 255);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new C24544(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22172), Integer.valueOf(this.f22173), 1), e);
            }
        }
        int i4 = this.f22172;
        this.f22172 = i4 + 1;
        bArr[i4] = (byte) j;
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ */
    public final void mo14012(long j) throws C24544 {
        try {
            byte[] bArr = this.f22174;
            int i = this.f22172;
            int i2 = i + 1;
            this.f22172 = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f22172 = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f22172 = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f22172 = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f22172 = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f22172 = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f22172 = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f22172 = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C24544(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22172), Integer.valueOf(this.f22173), 1), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18583(byte[] bArr, int i, int i2) throws C24544 {
        try {
            System.arraycopy(bArr, i, this.f22174, this.f22172, i2);
            this.f22172 += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new C24544(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22172), Integer.valueOf(this.f22173), Integer.valueOf(i2)), e);
        }
    }

    @Override // l.AbstractC5152
    /* JADX INFO: renamed from: ۙ */
    public final void mo14005(int i, int i2, byte[] bArr) throws C24544 {
        m18583(bArr, i, i2);
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ */
    public final void mo14013(String str) throws C24544 {
        int i = this.f22172;
        try {
            int iM35763 = AbstractC14846.m35763(str.length() * 3);
            int iM35764 = AbstractC14846.m35763(str.length());
            byte[] bArr = this.f22174;
            if (iM35764 == iM35763) {
                int i2 = i + iM35764;
                this.f22172 = i2;
                int iM29254 = C11643.m29254(i2, mo18582(), str, bArr);
                this.f22172 = i;
                mo14018((iM29254 - i) - iM35764);
                this.f22172 = iM29254;
                return;
            }
            mo14018(C11643.m29256(str));
            this.f22172 = C11643.m29254(this.f22172, mo18582(), str, bArr);
        } catch (IndexOutOfBoundsException e) {
            throw new C24544(e);
        } catch (C5678 e2) {
            this.f22172 = i;
            m35776(str, e2);
        }
    }

    @Override // l.AbstractC14846
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo18582() {
        return this.f22173 - this.f22172;
    }
}
