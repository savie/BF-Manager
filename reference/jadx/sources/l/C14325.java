package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M6NW */
/* JADX INFO: loaded from: classes4.dex */
public final class C14325 implements InterfaceC1623 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f46932;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f46933;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f46934;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f46935;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f46936;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CharSequence f46937;

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ۙ */
    public final int mo11328() {
        return -1;
    }

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ۨ */
    public final void mo11331(int i) {
    }

    public C14325(CharSequence charSequence, Runnable runnable) {
        int i;
        C13638.requireNonNull(charSequence);
        this.f46937 = charSequence;
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            if ((i3 & 1023) == 0) {
                runnable.run();
            }
            if (Character.isHighSurrogate(charSequence.charAt(i2)) && (i = i2 + 1) < length && Character.isLowSurrogate(charSequence.charAt(i))) {
                int[] iArr = this.f46935;
                if (iArr == null) {
                    this.f46935 = new int[16];
                } else {
                    int i5 = this.f46936;
                    if (i5 == iArr.length) {
                        this.f46935 = Arrays.copyOf(iArr, i5 * 2);
                    }
                }
                int[] iArr2 = this.f46935;
                int i6 = this.f46936;
                iArr2[i6] = i2 - i6;
                this.f46936 = i6 + 1;
                i2 = i;
            }
            i2++;
            i3 = i4;
        }
        runnable.run();
        this.f46934 = length - this.f46936;
    }

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ܰ */
    public final void mo11333() {
        if (this.f46932 >= this.f46934) {
            throw new IllegalStateException("Cannot consume EOF");
        }
        int i = this.f46933;
        this.f46933 = Character.charCount(Character.codePointAt(this.f46937, i)) + i;
        this.f46932++;
    }

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ܰ */
    public final int mo11332(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = this.f46932;
        long j = i2;
        if (i > 0) {
            i--;
        }
        long j2 = j + ((long) i);
        if (j2 < 0 || j2 >= this.f46934) {
            return -1;
        }
        return Character.codePointAt(this.f46937, j2 == ((long) i2) ? this.f46933 : m34581((int) j2));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private int m34581(int i) {
        int i2 = 0;
        int i3 = this.f46936;
        while (i2 < i3) {
            int i4 = (i2 + i3) >>> 1;
            if (this.f46935[i4] < i) {
                i2 = i4 + 1;
            } else {
                i3 = i4;
            }
        }
        return i + i2;
    }

    @Override // l.InterfaceC22583
    public final int index() {
        return this.f46932;
    }

    @Override // l.InterfaceC22583
    public final int size() {
        return this.f46934;
    }

    @Override // l.InterfaceC22583
    /* JADX INFO: renamed from: ۙ */
    public final void mo11329(int i) {
        if (i < 0 || i > this.f46934) {
            throw new IndexOutOfBoundsException(C8479.m22141(i, "Index: "));
        }
        this.f46932 = i;
        this.f46933 = m34581(i);
    }

    @Override // l.InterfaceC1623
    /* JADX INFO: renamed from: ۙ */
    public final String mo5499(C22043 c22043) {
        int i = c22043.f71443;
        int i2 = this.f46934;
        int iMin = Math.min(i, i2);
        int iMin2 = (int) Math.min(((long) c22043.f71444) + 1, i2);
        if (iMin < 0 || iMin2 < iMin) {
            throw new IndexOutOfBoundsException("Interval: " + c22043);
        }
        int iM34581 = m34581(iMin);
        int iM34582 = m34581(iMin2);
        CharSequence charSequence = this.f46937;
        if (charSequence instanceof String) {
            return ((String) charSequence).substring(iM34581, iM34582);
        }
        if (iM34581 == iM34582) {
            return "";
        }
        int i3 = iM34582 - iM34581;
        char[] cArr = new char[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            cArr[i4] = charSequence.charAt(iM34581 + i4);
        }
        return new String(cArr);
    }

    public final String toString() {
        return mo5499(C22043.m48958(0, this.f46934 - 1));
    }
}
