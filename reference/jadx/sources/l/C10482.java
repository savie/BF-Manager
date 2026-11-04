package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6ZS */
/* JADX INFO: loaded from: classes3.dex */
public final class C10482 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f33362 = 1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f33363;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C19433 f33364;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f33365;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f33366;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int[] f33367;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f33368;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C16800[] f33369;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f33370;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f33371;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f33372;

    public C10482(int i, int i2, int i3, C16800 c16800) {
        int[] iArr = new int[8];
        this.f33366 = iArr;
        int[] iArr2 = new int[8];
        this.f33365 = iArr2;
        int[] iArr3 = new int[8];
        this.f33367 = iArr3;
        C16800[] c16800Arr = new C16800[8];
        this.f33369 = c16800Arr;
        if (i < 0) {
            throw new IllegalArgumentException("Negative syntax context text length");
        }
        if (i2 < 0 || i3 < i2 || i3 > i) {
            throw new IndexOutOfBoundsException("Syntax context coverage is outside the document");
        }
        this.f33372 = i;
        this.f33370 = i2;
        this.f33363 = i3;
        iArr[0] = 0;
        iArr2[0] = i;
        iArr3[0] = -1;
        C17359.requireNonNull(c16800, "rootLanguage");
        c16800Arr[0] = c16800;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m26947() {
        m26935();
        return this.f33362;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m26949() {
        m26935();
        return this.f33372;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26940(int i) {
        m26935();
        return this.f33365[C17359.checkIndex(i, this.f33362)];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26941(int i, int i2, int i3, C16800 c16800) {
        int i4;
        int i5;
        m26935();
        int iCheckIndex = C17359.checkIndex(i3, this.f33362);
        if (i < 0 || i2 < i || i2 > this.f33372) {
            throw new IllegalArgumentException(C6934.m19217("Invalid syntax context range: ", i, i2, ".."));
        }
        int[] iArr = this.f33366;
        if (i < iArr[iCheckIndex] || i2 > this.f33365[iCheckIndex]) {
            throw new IllegalArgumentException("Syntax context is outside its parent");
        }
        if (i == i2 || (i4 = this.f33370) == (i5 = this.f33363) || i2 <= i4 || i >= i5) {
            return iCheckIndex;
        }
        int i6 = this.f33362;
        if (i6 >= iArr.length) {
            int iMin = (int) Math.min(2147483647L, ((long) i6) + ((long) (i6 >> 1)));
            if (iMin <= this.f33362) {
                throw new OutOfMemoryError("Syntax context recorder capacity exceeded");
            }
            this.f33366 = Arrays.copyOf(this.f33366, iMin);
            this.f33365 = Arrays.copyOf(this.f33365, iMin);
            this.f33367 = Arrays.copyOf(this.f33367, iMin);
            this.f33369 = (C16800[]) Arrays.copyOf(this.f33369, iMin);
        }
        int i7 = this.f33362;
        this.f33362 = i7 + 1;
        this.f33366[i7] = i;
        this.f33365[i7] = i2;
        this.f33367[i7] = iCheckIndex;
        this.f33369[i7] = c16800;
        return i7;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26945(int i, int i2, int i3, int i4, C16800 c16800) {
        m26935();
        return this.f33362 == i && m26941(i2, i3, i4, c16800) == i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26944(int i, int i2) {
        m26935();
        int iCheckIndex = C17359.checkIndex(i, this.f33362);
        if (iCheckIndex == 0) {
            throw new IllegalArgumentException("Cannot update syntax context root");
        }
        int i3 = this.f33367[iCheckIndex];
        if (i2 > this.f33366[iCheckIndex]) {
            int[] iArr = this.f33365;
            if (i2 <= iArr[i3]) {
                iArr[iCheckIndex] = i2;
                this.f33368 = true;
                return;
            }
        }
        throw new IllegalArgumentException(C13645.m33382(i2, "Invalid syntax context end: "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19433 m26943(int i, int i2, int i3, int i4) {
        m26935();
        if (i < 1 || i > i2 || i2 > this.f33362) {
            throw new IllegalArgumentException("Invalid syntax context clip nodes");
        }
        if (i3 < 0 || i4 < i3 || i4 > this.f33372) {
            throw new IllegalArgumentException("Invalid syntax context clip range");
        }
        C19433 c19433 = new C19433(this, i, i2, i3, i4);
        this.f33364 = c19433;
        return c19433;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m26948(int i) {
        int i2;
        m26935();
        if (i < 1 || i > (i2 = this.f33362)) {
            StringBuilder sbM12235 = C3769.m12235(i, "Invalid syntax context mark: ", ", size=");
            sbM12235.append(this.f33362);
            throw new IllegalArgumentException(sbM12235.toString());
        }
        Arrays.fill(this.f33369, i, i2, (Object) null);
        this.f33362 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8246 m26942() {
        m26935();
        int[] iArrCopyOf = Arrays.copyOf(this.f33366, this.f33362);
        int[] iArrCopyOf2 = Arrays.copyOf(this.f33365, this.f33362);
        int[] iArrCopyOf3 = Arrays.copyOf(this.f33367, this.f33362);
        C16800[] c16800Arr = (C16800[]) Arrays.copyOf(this.f33369, this.f33362);
        int i = this.f33363;
        int i2 = this.f33370;
        if (i2 != 0 || i != this.f33372) {
            iArrCopyOf[0] = 0;
            iArrCopyOf2[0] = i - i2;
            for (int i3 = 1; i3 < this.f33362; i3++) {
                iArrCopyOf[i3] = Math.max(iArrCopyOf[i3], i2) - i2;
                iArrCopyOf2[i3] = Math.min(iArrCopyOf2[i3], i) - i2;
            }
        }
        return new C8246(i - i2, this.f33362, iArrCopyOf, iArrCopyOf2, iArrCopyOf3, c16800Arr);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14957 m26946() {
        m26935();
        C14957 c14957 = new C14957(this.f33372, this.f33370, this.f33363, this.f33362, this.f33366, this.f33365, this.f33367, this.f33369, this.f33368);
        this.f33371 = true;
        this.f33367 = null;
        this.f33365 = null;
        this.f33366 = null;
        this.f33369 = null;
        this.f33362 = 0;
        return c14957;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m26935() {
        if (this.f33371) {
            throw new IllegalStateException("Syntax context recorder is finished");
        }
        if (this.f33364 != null) {
            throw new IllegalStateException("Syntax context range clip is active");
        }
    }
}
