package l;

/* JADX INFO: renamed from: l.ᩳ۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F4XQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18944 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f61433;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f61434;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f61435;

    public C18944() {
        this(10);
    }

    public C18944(int i) {
        this.f61433 = new int[i];
        this.f61434 = new int[i];
        this.f61435 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43967(int i, int i2) {
        int[] iArr = this.f61433;
        int i3 = this.f61435;
        int i4 = -1;
        int i5 = i3;
        while (i5 - i4 > 1) {
            int i6 = (i5 + i4) / 2;
            if (iArr[i6] < i) {
                i4 = i6;
            } else {
                i5 = i6;
            }
        }
        if (i5 == i3) {
            i5 = ~i3;
        } else if (iArr[i5] != i) {
            i5 = ~i5;
        }
        if (i5 >= 0) {
            this.f61434[i5] = i2;
            return;
        }
        int i7 = ~i5;
        int i8 = this.f61435;
        int[] iArr2 = this.f61433;
        if (i8 >= iArr2.length) {
            int iMax = Math.max(i8 + 1, iArr2.length * 2);
            int[] iArr3 = new int[iMax];
            int[] iArr4 = new int[iMax];
            int[] iArr5 = this.f61433;
            System.arraycopy(iArr5, 0, iArr3, 0, iArr5.length);
            int[] iArr6 = this.f61434;
            System.arraycopy(iArr6, 0, iArr4, 0, iArr6.length);
            this.f61433 = iArr3;
            this.f61434 = iArr4;
        }
        int i9 = this.f61435;
        if (i9 - i7 != 0) {
            int[] iArr7 = this.f61433;
            int i10 = i7 + 1;
            System.arraycopy(iArr7, i7, iArr7, i10, i9 - i7);
            int[] iArr8 = this.f61434;
            System.arraycopy(iArr8, i7, iArr8, i10, this.f61435 - i7);
        }
        this.f61433[i7] = i;
        this.f61434[i7] = i2;
        this.f61435++;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] m43969() {
        int i = this.f61435;
        int[] iArr = new int[i];
        System.arraycopy(this.f61433, 0, iArr, 0, i);
        return iArr;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] m43970() {
        int i = this.f61435;
        int[] iArr = new int[i];
        System.arraycopy(this.f61434, 0, iArr, 0, i);
        return iArr;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m43968() {
        return this.f61435;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m43966() {
        return this.f61433[0];
    }
}
