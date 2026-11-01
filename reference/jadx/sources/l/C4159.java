package l;

import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۘ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6UD */
/* JADX INFO: loaded from: classes2.dex */
public final class C4159 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int[] f15189;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C1337[] f15190;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f15191;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f15192;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C21093 f15193;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C16155 f15194;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f15195;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f15196;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C14744 f15197;

    public C4159(C14744 c14744, int i) {
        this(c14744, 0, c14744.m35339(), i);
    }

    public C4159(C14744 c14744, int i, int i2, int i3) {
        C14744.m35328(i, i2, c14744.m35339());
        this.f15197 = c14744;
        this.f15196 = i;
        this.f15192 = i2;
        AbstractC0631 abstractC0631 = c14744.f48222;
        int i4 = abstractC0631 == null ? 0 : abstractC0631.f2724;
        this.f15190 = new C1337[i4];
        this.f15189 = new int[i4];
        C16072 c16072 = c14744.f48220;
        if (c16072 != null) {
            c16072.m38089();
        }
        try {
            m11799(i3);
        } catch (Error | RuntimeException e) {
            close();
            throw e;
        }
    }

    public final int position() {
        if (this.f15197 == null) {
            throw new IllegalStateException("Text cursor is closed");
        }
        return this.f15191 - this.f15196;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11799(int i) {
        AbstractC0631[] abstractC0631Arr;
        int i2;
        if (this.f15197 == null) {
            throw new IllegalStateException("Text cursor is closed");
        }
        int i3 = this.f15192;
        int i4 = this.f15196;
        C14744.m35328(i, i, i3 - i4);
        C21093 c21093 = this.f15193;
        if (c21093 != null) {
            c21093.close();
            this.f15193 = null;
        }
        int i5 = i + i4;
        this.f15191 = i5;
        AbstractC0631 abstractC0631 = this.f15197.f48222;
        if (abstractC0631 == null) {
            this.f15194 = null;
            this.f15195 = 0;
            return;
        }
        int i6 = 0;
        while (abstractC0631 instanceof C1337) {
            C1337 c1337 = (C1337) abstractC0631;
            int i7 = 0;
            while (true) {
                abstractC0631Arr = c1337.f5650;
                if (i7 >= abstractC0631Arr.length - 1 || i5 < (i2 = abstractC0631Arr[i7].f2727)) {
                    break;
                }
                i7++;
                i5 -= i2;
            }
            this.f15190[i6] = c1337;
            this.f15189[i6] = i7;
            abstractC0631 = abstractC0631Arr[i7];
            i6++;
        }
        this.f15194 = (C16155) abstractC0631;
        this.f15195 = i5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11800(char[] cArr, int i, int i2) {
        if (this.f15197 == null) {
            throw new IllegalStateException("Text cursor is closed");
        }
        C17565.m40836(cArr, i, i2);
        int iMin = Math.min(i2, this.f15192 - this.f15191);
        while (iMin > 0) {
            if (this.f15195 == this.f15194.f2727) {
                m11798();
            }
            int iMin2 = Math.min(iMin, this.f15194.f2727 - this.f15195);
            if (this.f15193 == null) {
                this.f15193 = this.f15194.m38247();
            }
            C13625 c13625 = this.f15193.f68721;
            int i3 = this.f15195;
            c13625.m33309(i3, i3 + iMin2, cArr, i);
            this.f15195 += iMin2;
            this.f15191 += iMin2;
            i += iMin2;
            iMin -= iMin2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11801() {
        if (this.f15197 != null) {
            return this.f15191 < this.f15192;
        }
        throw new IllegalStateException("Text cursor is closed");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final char m11802() {
        if (!m11801()) {
            throw new NoSuchElementException();
        }
        if (this.f15195 == this.f15194.f2727) {
            m11798();
        }
        if (this.f15193 == null) {
            this.f15193 = this.f15194.m38247();
        }
        char cM33306 = this.f15193.f68721.m33306(this.f15195);
        this.f15195++;
        this.f15191++;
        return cM33306;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m11798() {
        C21093 c21093 = this.f15193;
        if (c21093 != null) {
            c21093.close();
            this.f15193 = null;
        }
        C1337[] c1337Arr = this.f15190;
        int length = c1337Arr.length;
        while (true) {
            length--;
            if (length >= 0) {
                C1337 c1337 = c1337Arr[length];
                int[] iArr = this.f15189;
                int i = iArr[length] + 1;
                if (i >= 0) {
                    AbstractC0631[] abstractC0631Arr = c1337.f5650;
                    if (i < abstractC0631Arr.length) {
                        iArr[length] = i;
                        AbstractC0631 abstractC0631 = abstractC0631Arr[i];
                        while (true) {
                            length++;
                            if (abstractC0631 instanceof C1337) {
                                C1337 c1338 = (C1337) abstractC0631;
                                AbstractC0631[] abstractC0631Arr2 = c1338.f5650;
                                c1337Arr[length] = c1338;
                                iArr[length] = 0;
                                abstractC0631 = abstractC0631Arr2[0];
                            } else {
                                this.f15194 = (C16155) abstractC0631;
                                this.f15195 = 0;
                                return;
                            }
                        }
                    }
                }
            } else {
                throw new AssertionError("Missing adjacent leaf");
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C14744 c14744 = this.f15197;
        if (c14744 == null) {
            return;
        }
        C16072 c16072 = c14744.f48220;
        this.f15197 = null;
        this.f15194 = null;
        Arrays.fill(this.f15190, (Object) null);
        try {
            C21093 c21093 = this.f15193;
            if (c21093 != null) {
                c21093.close();
                this.f15193 = null;
            }
        } finally {
            if (c16072 != null) {
                c16072.m38088();
            }
        }
    }
}
