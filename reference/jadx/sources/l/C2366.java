package l;

/* JADX INFO: renamed from: l.ۖۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes3.dex */
public final class C2366 implements InterfaceC8332 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f7621 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f7622 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f7619 = new byte[8];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float[] f7620 = new float[16];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m8043() {
        return this.f7621 == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m8036() {
        return this.f7621;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8034(byte b) {
        int i = this.f7621;
        byte[] bArr = this.f7619;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f7619 = bArr2;
        }
        byte[] bArr3 = this.f7619;
        int i2 = this.f7621;
        this.f7621 = i2 + 1;
        bArr3[i2] = b;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8035(int i) {
        float[] fArr = this.f7620;
        if (fArr.length < this.f7622 + i) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.f7620 = fArr2;
        }
    }

    @Override // l.InterfaceC8332
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8037(float f, float f2) {
        m8034((byte) 0);
        m8035(2);
        float[] fArr = this.f7620;
        int i = this.f7622;
        int i2 = i + 1;
        this.f7622 = i2;
        fArr[i] = f;
        this.f7622 = i + 2;
        fArr[i2] = f2;
    }

    @Override // l.InterfaceC8332
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo8042(float f, float f2) {
        m8034((byte) 1);
        m8035(2);
        float[] fArr = this.f7620;
        int i = this.f7622;
        int i2 = i + 1;
        this.f7622 = i2;
        fArr[i] = f;
        this.f7622 = i + 2;
        fArr[i2] = f2;
    }

    @Override // l.InterfaceC8332
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8039(float f, float f2, float f3, float f4, float f5, float f6) {
        m8034((byte) 2);
        m8035(6);
        float[] fArr = this.f7620;
        int i = this.f7622;
        int i2 = i + 1;
        this.f7622 = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.f7622 = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.f7622 = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.f7622 = i5;
        fArr[i4] = f4;
        int i6 = i + 5;
        this.f7622 = i6;
        fArr[i5] = f5;
        this.f7622 = i + 6;
        fArr[i6] = f6;
    }

    @Override // l.InterfaceC8332
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8038(float f, float f2, float f3, float f4) {
        m8034((byte) 3);
        m8035(4);
        float[] fArr = this.f7620;
        int i = this.f7622;
        int i2 = i + 1;
        this.f7622 = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.f7622 = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.f7622 = i4;
        fArr[i3] = f3;
        this.f7622 = i + 4;
        fArr[i4] = f4;
    }

    @Override // l.InterfaceC8332
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8040(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        m8034((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
        m8035(5);
        float[] fArr = this.f7620;
        int i = this.f7622;
        int i2 = i + 1;
        this.f7622 = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.f7622 = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.f7622 = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.f7622 = i5;
        fArr[i4] = f4;
        this.f7622 = i + 5;
        fArr[i5] = f5;
    }

    @Override // l.InterfaceC8332
    public final void close() {
        m8034((byte) 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8041(InterfaceC8332 interfaceC8332) {
        int i = 0;
        for (int i2 = 0; i2 < this.f7621; i2++) {
            byte b = this.f7619[i2];
            if (b == 0) {
                float[] fArr = this.f7620;
                int i3 = i + 1;
                float f = fArr[i];
                i += 2;
                interfaceC8332.mo8037(f, fArr[i3]);
            } else if (b == 1) {
                float[] fArr2 = this.f7620;
                int i4 = i + 1;
                float f2 = fArr2[i];
                i += 2;
                interfaceC8332.mo8042(f2, fArr2[i4]);
            } else if (b == 2) {
                float[] fArr3 = this.f7620;
                float f3 = fArr3[i];
                float f4 = fArr3[i + 1];
                float f5 = fArr3[i + 2];
                float f6 = fArr3[i + 3];
                int i5 = i + 5;
                float f7 = fArr3[i + 4];
                i += 6;
                interfaceC8332.mo8039(f3, f4, f5, f6, f7, fArr3[i5]);
            } else if (b == 3) {
                float[] fArr4 = this.f7620;
                float f8 = fArr4[i];
                float f9 = fArr4[i + 1];
                int i6 = i + 3;
                float f10 = fArr4[i + 2];
                i += 4;
                interfaceC8332.mo8038(f8, f9, f10, fArr4[i6]);
            } else if (b == 8) {
                interfaceC8332.close();
            } else {
                boolean z = (b & 2) != 0;
                boolean z2 = (b & 1) != 0;
                float[] fArr5 = this.f7620;
                float f11 = fArr5[i];
                float f12 = fArr5[i + 1];
                float f13 = fArr5[i + 2];
                int i7 = i + 4;
                float f14 = fArr5[i + 3];
                i += 5;
                interfaceC8332.mo8040(f11, f12, f13, z, z2, f14, fArr5[i7]);
            }
        }
    }
}
