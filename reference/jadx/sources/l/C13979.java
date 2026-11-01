package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.ܰᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36ZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C13979 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C0571[] f45962;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f45963;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f45964;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11862 f45965;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C0571[] f45966;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f45967;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f45968;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int[] f45969;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f45970;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C1900 f45971;

    public C13979(C1900 c1900, int i, int i2, C11862 c11862) {
        int i3;
        C13638.requireNonNull(c1900, "program");
        this.f45971 = c1900;
        if (i < 0 || i2 < 0 || i2 > i) {
            throw new IllegalArgumentException("Invalid syntax window restart recorder");
        }
        this.f45967 = i;
        long j = i;
        int iMax = (int) Math.max(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, (1023 + j) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
        this.f45964 = iMax;
        if (i <= 1) {
            i3 = 0;
        } else {
            long j2 = iMax;
            i3 = (int) ((((j - 1) + j2) - 1) / j2);
        }
        this.f45970 = i3;
        if (c11862 != null && (c11862.f39799 != c1900 || c11862.f39801 != i)) {
            throw new IllegalArgumentException("Restart index and syntax window differ");
        }
        this.f45965 = c11862;
        if (i2 > 0 && i2 < i) {
            m33822(i2, c11862 == null ? null : c11862.m29564(i2), i2, null);
        }
        this.f45963 = ((long) i2) + ((long) iMax);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33825(int i, C4910 c4910) {
        if (i <= 0 || i >= this.f45967) {
            return;
        }
        long j = i;
        if (j < this.f45963) {
            return;
        }
        m33822(i, c4910.m13658(i), c4910.m13648(), c4910.m13649(i));
        this.f45963 = j + ((long) this.f45964);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m33822(int i, C0571 c0571, int i2, C0571 c0572) {
        int i3;
        int i4 = this.f45964;
        int i5 = (i - 1) / i4;
        if (this.f45968 == null) {
            C11862 c11862 = this.f45965;
            if (c11862 == null) {
                i3 = 0;
                break;
            }
            int length = c11862.f39797.length - 1;
            int i6 = 0;
            while (true) {
                if (i6 > length) {
                    i3 = 0;
                    break;
                }
                int i7 = (i6 + length) >>> 1;
                int i8 = (c11862.f39797[i7] - 1) / i4;
                if (i8 >= i5) {
                    if (i8 <= i5) {
                        i3 = c11862.f39797[i7];
                        break;
                    }
                    length = i7 - 1;
                } else {
                    i6 = i7 + 1;
                }
            }
            if (i3 >= i) {
                return;
            }
            int i9 = this.f45970;
            this.f45968 = new int[i9];
            this.f45966 = new C0571[i9];
            this.f45969 = new int[i9];
            this.f45962 = new C0571[i9];
            if (c11862 != null) {
                for (int i10 = 0; i10 < c11862.f39797.length; i10++) {
                    int i11 = (c11862.f39797[i10] - 1) / i4;
                    this.f45968[i11] = c11862.f39797[i10];
                    this.f45966[i11] = c11862.f39800[i10];
                    this.f45969[i11] = c11862.f39796[i10];
                    this.f45962[i11] = c11862.f39798[i10];
                }
            }
        }
        int i12 = this.f45968[i5];
        if (i >= i12) {
            if (c0572 != null && this.f45962[i5] != null && this.f45969[i5] < i2 && i2 <= i12) {
                C20328 c20328 = new C20328(this.f45967);
                c20328.m45884(this.f45962[i5]);
                c20328.m45884(c0572);
                c0572 = c20328.m45887();
                i2 = this.f45969[i5];
            }
            this.f45968[i5] = i;
            this.f45966[i5] = c0571;
            this.f45969[i5] = i2;
            this.f45962[i5] = c0572;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11862 m33826() {
        int[] iArr = this.f45968;
        int i = this.f45967;
        C1900 c1900 = this.f45971;
        if (iArr == null) {
            C11862 c11862 = this.f45965;
            return c11862 == null ? C11862.m29559(c1900, i) : c11862;
        }
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 != 0) {
                i2++;
            }
        }
        if (i2 == 0) {
            this.f45968 = null;
            this.f45966 = null;
            this.f45969 = null;
            this.f45962 = null;
            return C11862.m29559(c1900, i);
        }
        int i4 = 0;
        int[] iArr2 = new int[i2];
        C0571[] c0571Arr = new C0571[i2];
        int[] iArr3 = new int[i2];
        C0571[] c0571Arr2 = new C0571[i2];
        int i5 = 0;
        while (true) {
            int[] iArr4 = this.f45968;
            if (i4 < iArr4.length) {
                int i6 = iArr4[i4];
                if (i6 != 0) {
                    iArr2[i5] = i6;
                    c0571Arr[i5] = this.f45966[i4];
                    iArr3[i5] = this.f45969[i4];
                    c0571Arr2[i5] = this.f45962[i4];
                    i5++;
                }
                i4++;
            } else {
                this.f45968 = null;
                this.f45966 = null;
                this.f45969 = null;
                this.f45962 = null;
                return new C11862(this.f45971, this.f45967, iArr2, c0571Arr, iArr3, c0571Arr2, 0);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33824() {
        this.f45968 = null;
        this.f45966 = null;
        this.f45969 = null;
        this.f45962 = null;
    }
}
