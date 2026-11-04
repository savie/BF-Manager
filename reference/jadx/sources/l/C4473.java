package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.ۘ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36ZX */
/* JADX INFO: loaded from: classes2.dex */
public final class C4473 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f15994;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14913 f15995;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int[] f15996;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f15997;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f15998;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C12831[] f15999;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20661 f16000;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C12831[] f16001;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f16002;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f16003;

    public C4473(C20661 c20661, int i, int i2, C14913 c14913) {
        int i3;
        C17359.requireNonNull(c20661, "program");
        this.f16000 = c20661;
        if (i < 0 || i2 < 0 || i2 > i) {
            throw new IllegalArgumentException("Invalid syntax window restart recorder");
        }
        this.f15998 = i;
        long j = i;
        int iMax = (int) Math.max(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, (1023 + j) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
        this.f15994 = iMax;
        if (i <= 1) {
            i3 = 0;
        } else {
            long j2 = iMax;
            i3 = (int) ((((j - 1) + j2) - 1) / j2);
        }
        this.f16002 = i3;
        if (c14913 != null && (c14913.f48700 != c20661 || c14913.f48701 != i)) {
            throw new IllegalArgumentException("Restart index and syntax window differ");
        }
        this.f15995 = c14913;
        if (i2 > 0 && i2 < i) {
            m14174(i2, c14913 == null ? null : c14913.m35880(i2), i2, null);
        }
        this.f16003 = ((long) i2) + ((long) iMax);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14177(int i, C24391 c24391) {
        if (i <= 0 || i >= this.f15998) {
            return;
        }
        long j = i;
        if (j < this.f16003) {
            return;
        }
        m14174(i, c24391.m54522(i), c24391.m54520(), c24391.m54528(i));
        this.f16003 = j + ((long) this.f15994);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m14174(int i, C12831 c12831, int i2, C12831 c12832) {
        int i3;
        int i4 = this.f15994;
        int i5 = (i - 1) / i4;
        if (this.f15997 == null) {
            C14913 c14913 = this.f15995;
            if (c14913 == null) {
                i3 = 0;
                break;
            }
            int length = c14913.f48699.length - 1;
            int i6 = 0;
            while (true) {
                if (i6 > length) {
                    i3 = 0;
                    break;
                }
                int i7 = (i6 + length) >>> 1;
                int i8 = (c14913.f48699[i7] - 1) / i4;
                if (i8 >= i5) {
                    if (i8 <= i5) {
                        i3 = c14913.f48699[i7];
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
            int i9 = this.f16002;
            this.f15997 = new int[i9];
            this.f16001 = new C12831[i9];
            this.f15996 = new int[i9];
            this.f15999 = new C12831[i9];
            if (c14913 != null) {
                for (int i10 = 0; i10 < c14913.f48699.length; i10++) {
                    int i11 = (c14913.f48699[i10] - 1) / i4;
                    this.f15997[i11] = c14913.f48699[i10];
                    this.f16001[i11] = c14913.f48703[i10];
                    this.f15996[i11] = c14913.f48704[i10];
                    this.f15999[i11] = c14913.f48702[i10];
                }
            }
        }
        int i12 = this.f15997[i5];
        if (i >= i12) {
            if (c12832 != null && this.f15999[i5] != null && this.f15996[i5] < i2 && i2 <= i12) {
                C15068 c15068 = new C15068(this.f15998);
                c15068.m36324(this.f15999[i5]);
                c15068.m36324(c12832);
                c12832 = c15068.m36327();
                i2 = this.f15996[i5];
            }
            this.f15997[i5] = i;
            this.f16001[i5] = c12831;
            this.f15996[i5] = i2;
            this.f15999[i5] = c12832;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C14913 m14178() {
        int[] iArr = this.f15997;
        int i = this.f15998;
        C20661 c20661 = this.f16000;
        if (iArr == null) {
            C14913 c14913 = this.f15995;
            return c14913 == null ? C14913.m35875(c20661, i) : c14913;
        }
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 != 0) {
                i2++;
            }
        }
        if (i2 == 0) {
            this.f15997 = null;
            this.f16001 = null;
            this.f15996 = null;
            this.f15999 = null;
            return C14913.m35875(c20661, i);
        }
        int i4 = 0;
        int[] iArr2 = new int[i2];
        C12831[] c12831Arr = new C12831[i2];
        int[] iArr3 = new int[i2];
        C12831[] c12831Arr2 = new C12831[i2];
        int i5 = 0;
        while (true) {
            int[] iArr4 = this.f15997;
            if (i4 < iArr4.length) {
                int i6 = iArr4[i4];
                if (i6 != 0) {
                    iArr2[i5] = i6;
                    c12831Arr[i5] = this.f16001[i4];
                    iArr3[i5] = this.f15996[i4];
                    c12831Arr2[i5] = this.f15999[i4];
                    i5++;
                }
                i4++;
            } else {
                this.f15997 = null;
                this.f16001 = null;
                this.f15996 = null;
                this.f15999 = null;
                return new C14913(this.f16000, this.f15998, iArr2, c12831Arr, iArr3, c12831Arr2, 0);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14176() {
        this.f15997 = null;
        this.f16001 = null;
        this.f15996 = null;
        this.f15999 = null;
    }
}
