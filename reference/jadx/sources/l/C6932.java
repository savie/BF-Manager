package l;

import java.io.UncheckedIOException;

/* JADX INFO: renamed from: l.ۜᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57ZT */
/* JADX INFO: loaded from: classes3.dex */
public final class C6932 implements InterfaceC3964 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C3073 f23303;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21749 f23304;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f23305 = new byte[4096];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C21043 f23306;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f23307;

    @Override // l.InterfaceC3964
    public final void end() {
        C8344 c8344;
        this.f23307 = null;
        C21043 c21043 = this.f23306;
        if (c21043 != null) {
            C7638 c7638 = c21043.f2539;
            if (c7638 != null && (c8344 = c7638.f25214) != null) {
                c8344.m21794();
                c8344.f28909 = null;
                c8344.f28895 = null;
            }
            this.f23306 = null;
        }
        C21749 c21749 = this.f23304;
        if (c21749 != null) {
            C15400 c15400 = c21749.f2536;
            if (c15400 != null) {
                int i = c15400.f50150;
                if (i == 42 || i == 113 || i == 666) {
                    c15400.f50154 = null;
                    c15400.f50155 = null;
                    c15400.f50151 = null;
                    c15400.f50173 = null;
                    c15400.f50140 = null;
                }
                c21749.f2536 = null;
                c21749.f2535 = null;
                c21749.f2537 = null;
                c21749.f2545 = null;
            }
            this.f23304 = null;
        }
        this.f23303 = null;
    }

    @Override // l.InterfaceC3964
    /* JADX INFO: renamed from: ۙ */
    public final void mo11449(int i, int i2, C3073 c3073) {
        this.f23303 = c3073;
        if (i == 1) {
            try {
                this.f23304 = new C21749(i2);
            } catch (C18221 e) {
                throw new UncheckedIOException(e);
            }
        } else if (i == 0) {
            C21043 c21043 = new C21043();
            C7638 c7638 = new C7638(c21043);
            c21043.f2539 = c7638;
            c7638.m20191();
            this.f23306 = c21043;
            this.f23307 = new byte[4096];
        }
        C3073 c3074 = this.f23303;
        (c3074 == null ? C0168.m1326() : c3074.m9228()).getClass();
    }

    @Override // l.InterfaceC3964
    /* JADX INFO: renamed from: ܰ */
    public final byte[] mo11451(byte[] bArr, int[] iArr) {
        C21749 c21749 = this.f23304;
        c21749.f2535 = bArr;
        int i = 5;
        c21749.f2542 = 5;
        c21749.f2543 = iArr[0] - 5;
        do {
            C21749 c217410 = this.f23304;
            byte[] bArr2 = this.f23305;
            c217410.f2537 = bArr2;
            c217410.f2540 = 0;
            c217410.f2541 = 4096;
            C15400 c15400 = c217410.f2536;
            if ((c15400 == null ? -2 : c15400.m36847()) != 0) {
                C3073 c3073 = this.f23303;
                (c3073 == null ? C0168.m1326() : c3073.m9228()).getClass();
            } else {
                int i2 = 4096 - this.f23304.f2541;
                int i3 = i + i2;
                int i4 = i3 + 52;
                if (bArr.length < i4) {
                    byte[] bArr3 = new byte[i4 * 2];
                    System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                    bArr = bArr3;
                }
                System.arraycopy(bArr2, 0, bArr, i, i2);
                i = i3;
            }
        } while (this.f23304.f2541 == 0);
        iArr[0] = i;
        return bArr;
    }

    @Override // l.InterfaceC3964
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo11450(byte[] bArr, int[] iArr) {
        C21043 c21043 = this.f23306;
        c21043.f2535 = bArr;
        c21043.f2542 = 5;
        c21043.f2543 = iArr[0];
        int i = 0;
        while (true) {
            C21043 c21044 = this.f23306;
            byte[] bArr2 = this.f23305;
            c21044.f2537 = bArr2;
            c21044.f2540 = 0;
            c21044.f2541 = 4096;
            C7638 c7638 = c21044.f2539;
            int iM20190 = c7638 == null ? -2 : c7638.m20190();
            if (iM20190 == -5) {
                if (i > bArr.length - 5) {
                    byte[] bArr3 = new byte[i + 5];
                    System.arraycopy(bArr, 0, bArr3, 0, 5);
                    System.arraycopy(this.f23307, 0, bArr3, 5, i);
                    bArr = bArr3;
                } else {
                    System.arraycopy(this.f23307, 0, bArr, 5, i);
                }
                iArr[0] = i;
                return bArr;
            }
            if (iM20190 != 0) {
                C3073 c3073 = this.f23303;
                (c3073 == null ? C0168.m1326() : c3073.m9228()).getClass();
                return null;
            }
            byte[] bArr4 = this.f23307;
            int length = bArr4.length;
            int i2 = (i + 4096) - this.f23306.f2541;
            if (length < i2) {
                int length2 = bArr4.length * 2;
                if (length2 >= i2) {
                    i2 = length2;
                }
                byte[] bArr5 = new byte[i2];
                System.arraycopy(bArr4, 0, bArr5, 0, i);
                this.f23307 = bArr5;
            }
            System.arraycopy(bArr2, 0, this.f23307, i, 4096 - this.f23306.f2541);
            i += 4096 - this.f23306.f2541;
            iArr[0] = i;
        }
    }
}
