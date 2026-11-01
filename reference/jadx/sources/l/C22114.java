package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩹ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6ZS */
/* JADX INFO: loaded from: classes.dex */
public final class C22114 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int[] f71594;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f71595;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f71596 = 1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f71597;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C20889[] f71598;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int[] f71599;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f71600;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C5180 f71601;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f71602;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f71603;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f71604;

    public C22114(int i, int i2, int i3, C20889 c20889) {
        int[] iArr = new int[8];
        this.f71599 = iArr;
        int[] iArr2 = new int[8];
        this.f71600 = iArr2;
        int[] iArr3 = new int[8];
        this.f71594 = iArr3;
        C20889[] c20889Arr = new C20889[8];
        this.f71598 = c20889Arr;
        if (i < 0) {
            throw new IllegalArgumentException("Negative syntax context text length");
        }
        if (i2 < 0 || i3 < i2 || i3 > i) {
            throw new IndexOutOfBoundsException("Syntax context coverage is outside the document");
        }
        this.f71604 = i;
        this.f71602 = i2;
        this.f71597 = i3;
        iArr[0] = 0;
        iArr2[0] = i;
        iArr3[0] = -1;
        C13638.requireNonNull(c20889, "rootLanguage");
        c20889Arr[0] = c20889;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m49067() {
        m49051();
        return this.f71596;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m49059() {
        m49051();
        return this.f71604;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m49060(int i) {
        m49051();
        return this.f71600[C13638.checkIndex(i, this.f71596)];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m49061(int i, int i2, int i3, C20889 c20889) {
        int i4;
        int i5;
        m49051();
        int iCheckIndex = C13638.checkIndex(i3, this.f71596);
        if (i < 0 || i2 < i || i2 > this.f71604) {
            throw new IllegalArgumentException(C2271.m6967("Invalid syntax context range: ", i, i2, ".."));
        }
        int[] iArr = this.f71599;
        if (i < iArr[iCheckIndex] || i2 > this.f71600[iCheckIndex]) {
            throw new IllegalArgumentException("Syntax context is outside its parent");
        }
        if (i == i2 || (i4 = this.f71602) == (i5 = this.f71597) || i2 <= i4 || i >= i5) {
            return iCheckIndex;
        }
        int i6 = this.f71596;
        if (i6 >= iArr.length) {
            int iMin = (int) Math.min(2147483647L, ((long) i6) + ((long) (i6 >> 1)));
            if (iMin <= this.f71596) {
                throw new OutOfMemoryError("Syntax context recorder capacity exceeded");
            }
            this.f71599 = Arrays.copyOf(this.f71599, iMin);
            this.f71600 = Arrays.copyOf(this.f71600, iMin);
            this.f71594 = Arrays.copyOf(this.f71594, iMin);
            this.f71598 = (C20889[]) Arrays.copyOf(this.f71598, iMin);
        }
        int i7 = this.f71596;
        this.f71596 = i7 + 1;
        this.f71599[i7] = i;
        this.f71600[i7] = i2;
        this.f71594[i7] = iCheckIndex;
        this.f71598[i7] = c20889;
        return i7;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49065(int i, int i2, int i3, int i4, C20889 c20889) {
        m49051();
        return this.f71596 == i && m49061(i2, i3, i4, c20889) == i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49064(int i, int i2) {
        m49051();
        int iCheckIndex = C13638.checkIndex(i, this.f71596);
        if (iCheckIndex == 0) {
            throw new IllegalArgumentException("Cannot update syntax context root");
        }
        int i3 = this.f71594[iCheckIndex];
        if (i2 > this.f71599[iCheckIndex]) {
            int[] iArr = this.f71600;
            if (i2 <= iArr[i3]) {
                iArr[iCheckIndex] = i2;
                this.f71603 = true;
                return;
            }
        }
        throw new IllegalArgumentException(C8479.m22141(i2, "Invalid syntax context end: "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5180 m49063(int i, int i2, int i3, int i4) {
        m49051();
        if (i < 1 || i > i2 || i2 > this.f71596) {
            throw new IllegalArgumentException("Invalid syntax context clip nodes");
        }
        if (i3 < 0 || i4 < i3 || i4 > this.f71604) {
            throw new IllegalArgumentException("Invalid syntax context clip range");
        }
        C5180 c5180 = new C5180(this, i, i2, i3, i4);
        this.f71601 = c5180;
        return c5180;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m49068(int i) {
        int i2;
        m49051();
        if (i < 1 || i > (i2 = this.f71596)) {
            StringBuilder sbM40153 = C17214.m40153(i, "Invalid syntax context mark: ", ", size=");
            sbM40153.append(this.f71596);
            throw new IllegalArgumentException(sbM40153.toString());
        }
        Arrays.fill(this.f71598, i, i2, (Object) null);
        this.f71596 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2357 m49062() {
        m49051();
        int[] iArrCopyOf = Arrays.copyOf(this.f71599, this.f71596);
        int[] iArrCopyOf2 = Arrays.copyOf(this.f71600, this.f71596);
        int[] iArrCopyOf3 = Arrays.copyOf(this.f71594, this.f71596);
        C20889[] c20889Arr = (C20889[]) Arrays.copyOf(this.f71598, this.f71596);
        int i = this.f71597;
        int i2 = this.f71602;
        if (i2 != 0 || i != this.f71604) {
            iArrCopyOf[0] = 0;
            iArrCopyOf2[0] = i - i2;
            for (int i3 = 1; i3 < this.f71596; i3++) {
                iArrCopyOf[i3] = Math.max(iArrCopyOf[i3], i2) - i2;
                iArrCopyOf2[i3] = Math.min(iArrCopyOf2[i3], i) - i2;
            }
        }
        return new C2357(i - i2, this.f71596, iArrCopyOf, iArrCopyOf2, iArrCopyOf3, c20889Arr);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2980 m49066() {
        m49051();
        C2980 c2980 = new C2980(this.f71604, this.f71602, this.f71597, this.f71596, this.f71599, this.f71600, this.f71594, this.f71598, this.f71603);
        this.f71595 = true;
        this.f71594 = null;
        this.f71600 = null;
        this.f71599 = null;
        this.f71598 = null;
        this.f71596 = 0;
        return c2980;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m49051() {
        if (this.f71595) {
            throw new IllegalStateException("Syntax context recorder is finished");
        }
        if (this.f71601 != null) {
            throw new IllegalStateException("Syntax context range clip is active");
        }
    }
}
