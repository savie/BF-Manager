package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺܺۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6NW */
/* JADX INFO: loaded from: classes5.dex */
public final class C16947 implements InterfaceC17693 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f55364;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f55365;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final CharSequence f55366;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f55367;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f55368;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f55369;

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ۙ */
    public final int mo11529() {
        return -1;
    }

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ۤ */
    public final void mo11533(int i) {
    }

    public C16947(CharSequence charSequence, Runnable runnable) {
        int i;
        C17359.requireNonNull(charSequence);
        this.f55366 = charSequence;
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            if ((i3 & 1023) == 0) {
                runnable.run();
            }
            if (Character.isHighSurrogate(charSequence.charAt(i2)) && (i = i2 + 1) < length && Character.isLowSurrogate(charSequence.charAt(i))) {
                int[] iArr = this.f55365;
                if (iArr == null) {
                    this.f55365 = new int[16];
                } else {
                    int i5 = this.f55368;
                    if (i5 == iArr.length) {
                        this.f55365 = Arrays.copyOf(iArr, i5 * 2);
                    }
                }
                int[] iArr2 = this.f55365;
                int i6 = this.f55368;
                iArr2[i6] = i2 - i6;
                this.f55368 = i6 + 1;
                i2 = i;
            }
            i2++;
            i3 = i4;
        }
        runnable.run();
        this.f55367 = length - this.f55368;
    }

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11538() {
        if (this.f55369 >= this.f55367) {
            throw new IllegalStateException("Cannot consume EOF");
        }
        int i = this.f55364;
        this.f55364 = Character.charCount(Character.codePointAt(this.f55366, i)) + i;
        this.f55369++;
    }

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ᩷ */
    public final int mo11537(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = this.f55369;
        long j = i2;
        if (i > 0) {
            i--;
        }
        long j2 = j + ((long) i);
        if (j2 < 0 || j2 >= this.f55367) {
            return -1;
        }
        return Character.codePointAt(this.f55366, j2 == ((long) i2) ? this.f55364 : m39920((int) j2));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m39920(int i) {
        int i2 = 0;
        int i3 = this.f55368;
        while (i2 < i3) {
            int i4 = (i2 + i3) >>> 1;
            if (this.f55365[i4] < i) {
                i2 = i4 + 1;
            } else {
                i3 = i4;
            }
        }
        return i + i2;
    }

    @Override // l.InterfaceC4269
    public final int index() {
        return this.f55369;
    }

    @Override // l.InterfaceC4269
    public final int size() {
        return this.f55367;
    }

    @Override // l.InterfaceC4269
    /* JADX INFO: renamed from: ۙ */
    public final void mo11530(int i) {
        if (i < 0 || i > this.f55367) {
            throw new IndexOutOfBoundsException(C13645.m33382(i, "Index: "));
        }
        this.f55369 = i;
        this.f55364 = m39920(i);
    }

    @Override // l.InterfaceC17693
    /* JADX INFO: renamed from: ۙ */
    public final String mo19728(C4467 c4467) {
        int i = c4467.f15984;
        int i2 = this.f55367;
        int iMin = Math.min(i, i2);
        int iMin2 = (int) Math.min(((long) c4467.f15985) + 1, i2);
        if (iMin < 0 || iMin2 < iMin) {
            throw new IndexOutOfBoundsException("Interval: " + c4467);
        }
        int iM39920 = m39920(iMin);
        int iM39921 = m39920(iMin2);
        CharSequence charSequence = this.f55366;
        if (charSequence instanceof String) {
            return ((String) charSequence).substring(iM39920, iM39921);
        }
        if (iM39920 == iM39921) {
            return "";
        }
        int i3 = iM39921 - iM39920;
        char[] cArr = new char[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            cArr[i4] = charSequence.charAt(iM39920 + i4);
        }
        return new String(cArr);
    }

    public final String toString() {
        return mo19728(C4467.m14163(0, this.f55367 - 1));
    }
}
