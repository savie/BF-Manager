package l;

/* JADX INFO: renamed from: l.۫᩵ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes4.dex */
public final class C12618 implements InterfaceC17556 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f42172 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f42169 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f42170 = new byte[8];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float[] f42171 = new float[16];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m31405() {
        return this.f42172 == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m31403() {
        return this.f42172;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31401(byte b) {
        int i = this.f42172;
        byte[] bArr = this.f42170;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f42170 = bArr2;
        }
        byte[] bArr3 = this.f42170;
        int i2 = this.f42172;
        this.f42172 = i2 + 1;
        bArr3[i2] = b;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31402(int i) {
        float[] fArr = this.f42171;
        if (fArr.length < this.f42169 + i) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.f42171 = fArr2;
        }
    }

    @Override // l.InterfaceC17556
    /* JADX INFO: renamed from: ۙ */
    public final void mo4004(float f, float f2) {
        m31401((byte) 0);
        m31402(2);
        float[] fArr = this.f42171;
        int i = this.f42169;
        int i2 = i + 1;
        this.f42169 = i2;
        fArr[i] = f;
        this.f42169 = i + 2;
        fArr[i2] = f2;
    }

    @Override // l.InterfaceC17556
    /* JADX INFO: renamed from: ܰ */
    public final void mo4008(float f, float f2) {
        m31401((byte) 1);
        m31402(2);
        float[] fArr = this.f42171;
        int i = this.f42169;
        int i2 = i + 1;
        this.f42169 = i2;
        fArr[i] = f;
        this.f42169 = i + 2;
        fArr[i2] = f2;
    }

    @Override // l.InterfaceC17556
    /* JADX INFO: renamed from: ۙ */
    public final void mo4006(float f, float f2, float f3, float f4, float f5, float f6) {
        m31401((byte) 2);
        m31402(6);
        float[] fArr = this.f42171;
        int i = this.f42169;
        int i2 = i + 1;
        this.f42169 = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.f42169 = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.f42169 = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.f42169 = i5;
        fArr[i4] = f4;
        int i6 = i + 5;
        this.f42169 = i6;
        fArr[i5] = f5;
        this.f42169 = i + 6;
        fArr[i6] = f6;
    }

    @Override // l.InterfaceC17556
    /* JADX INFO: renamed from: ۙ */
    public final void mo4005(float f, float f2, float f3, float f4) {
        m31401((byte) 3);
        m31402(4);
        float[] fArr = this.f42171;
        int i = this.f42169;
        int i2 = i + 1;
        this.f42169 = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.f42169 = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.f42169 = i4;
        fArr[i3] = f3;
        this.f42169 = i + 4;
        fArr[i4] = f4;
    }

    @Override // l.InterfaceC17556
    /* JADX INFO: renamed from: ۙ */
    public final void mo4007(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        m31401((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
        m31402(5);
        float[] fArr = this.f42171;
        int i = this.f42169;
        int i2 = i + 1;
        this.f42169 = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.f42169 = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.f42169 = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.f42169 = i5;
        fArr[i4] = f4;
        this.f42169 = i + 5;
        fArr[i5] = f5;
    }

    @Override // l.InterfaceC17556
    public final void close() {
        m31401((byte) 8);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31404(InterfaceC17556 interfaceC17556) {
        int i = 0;
        for (int i2 = 0; i2 < this.f42172; i2++) {
            byte b = this.f42170[i2];
            if (b == 0) {
                float[] fArr = this.f42171;
                int i3 = i + 1;
                float f = fArr[i];
                i += 2;
                interfaceC17556.mo4004(f, fArr[i3]);
            } else if (b == 1) {
                float[] fArr2 = this.f42171;
                int i4 = i + 1;
                float f2 = fArr2[i];
                i += 2;
                interfaceC17556.mo4008(f2, fArr2[i4]);
            } else if (b == 2) {
                float[] fArr3 = this.f42171;
                float f3 = fArr3[i];
                float f4 = fArr3[i + 1];
                float f5 = fArr3[i + 2];
                float f6 = fArr3[i + 3];
                int i5 = i + 5;
                float f7 = fArr3[i + 4];
                i += 6;
                interfaceC17556.mo4006(f3, f4, f5, f6, f7, fArr3[i5]);
            } else if (b == 3) {
                float[] fArr4 = this.f42171;
                float f8 = fArr4[i];
                float f9 = fArr4[i + 1];
                int i6 = i + 3;
                float f10 = fArr4[i + 2];
                i += 4;
                interfaceC17556.mo4005(f8, f9, f10, fArr4[i6]);
            } else if (b == 8) {
                interfaceC17556.close();
            } else {
                boolean z = (b & 2) != 0;
                boolean z2 = (b & 1) != 0;
                float[] fArr5 = this.f42171;
                float f11 = fArr5[i];
                float f12 = fArr5[i + 1];
                float f13 = fArr5[i + 2];
                int i7 = i + 4;
                float f14 = fArr5[i + 3];
                i += 5;
                interfaceC17556.mo4007(f11, f12, f13, z, z2, f14, fArr5[i7]);
            }
        }
    }
}
