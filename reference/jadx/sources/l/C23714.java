package l;

import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩹ܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: D6UD */
/* JADX INFO: loaded from: classes.dex */
public final class C23714 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C19238 f76847;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f76848;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f76849;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C21697 f76850;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C17746[] f76851;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C8051 f76852;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f76853;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f76854;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f76855;

    public C23714(C21697 c21697, int i) {
        this(c21697, 0, c21697.m49259(), i);
    }

    public C23714(C21697 c21697, int i, int i2, int i3) {
        C21697.m49248(i, i2, c21697.m49259());
        this.f76850 = c21697;
        this.f76855 = i;
        this.f76849 = i2;
        AbstractC1339 abstractC1339 = c21697.f69245;
        int i4 = abstractC1339 == null ? 0 : abstractC1339.f4791;
        this.f76851 = new C17746[i4];
        this.f76853 = new int[i4];
        C10046 c10046 = c21697.f69247;
        if (c10046 != null) {
            c10046.m25972();
        }
        try {
            m52962(i3);
        } catch (Error | RuntimeException e) {
            close();
            throw e;
        }
    }

    public final int position() {
        if (this.f76850 == null) {
            throw new IllegalStateException("Text cursor is closed");
        }
        return this.f76848 - this.f76855;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52962(int i) {
        AbstractC1339[] abstractC1339Arr;
        int i2;
        if (this.f76850 == null) {
            throw new IllegalStateException("Text cursor is closed");
        }
        int i3 = this.f76849;
        int i4 = this.f76855;
        C21697.m49248(i, i, i3 - i4);
        C8051 c8051 = this.f76852;
        if (c8051 != null) {
            c8051.close();
            this.f76852 = null;
        }
        int i5 = i + i4;
        this.f76848 = i5;
        AbstractC1339 abstractC1339 = this.f76850.f69245;
        if (abstractC1339 == null) {
            this.f76847 = null;
            this.f76854 = 0;
            return;
        }
        int i6 = 0;
        while (abstractC1339 instanceof C17746) {
            C17746 c17746 = (C17746) abstractC1339;
            int i7 = 0;
            while (true) {
                abstractC1339Arr = c17746.f58291;
                if (i7 >= abstractC1339Arr.length - 1 || i5 < (i2 = abstractC1339Arr[i7].f4794)) {
                    break;
                }
                i7++;
                i5 -= i2;
            }
            this.f76851[i6] = c17746;
            this.f76853[i6] = i7;
            abstractC1339 = abstractC1339Arr[i7];
            i6++;
        }
        this.f76847 = (C19238) abstractC1339;
        this.f76854 = i5;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52963(char[] cArr, int i, int i2) {
        if (this.f76850 == null) {
            throw new IllegalStateException("Text cursor is closed");
        }
        C8796.m23619(cArr, i, i2);
        int iMin = Math.min(i2, this.f76849 - this.f76848);
        while (iMin > 0) {
            if (this.f76854 == this.f76847.f4794) {
                m52961();
            }
            int iMin2 = Math.min(iMin, this.f76847.f4794 - this.f76854);
            if (this.f76852 == null) {
                this.f76852 = this.f76847.m44573();
            }
            C5311 c5311 = this.f76852.f26678;
            int i3 = this.f76854;
            c5311.m15953(i3, i3 + iMin2, cArr, i);
            this.f76854 += iMin2;
            this.f76848 += iMin2;
            i += iMin2;
            iMin -= iMin2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52964() {
        if (this.f76850 != null) {
            return this.f76848 < this.f76849;
        }
        throw new IllegalStateException("Text cursor is closed");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final char m52965() {
        if (!m52964()) {
            throw new NoSuchElementException();
        }
        if (this.f76854 == this.f76847.f4794) {
            m52961();
        }
        if (this.f76852 == null) {
            this.f76852 = this.f76847.m44573();
        }
        char cM15950 = this.f76852.f26678.m15950(this.f76854);
        this.f76854++;
        this.f76848++;
        return cM15950;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m52961() {
        C8051 c8051 = this.f76852;
        if (c8051 != null) {
            c8051.close();
            this.f76852 = null;
        }
        C17746[] c17746Arr = this.f76851;
        int length = c17746Arr.length;
        while (true) {
            length--;
            if (length >= 0) {
                C17746 c17746 = c17746Arr[length];
                int[] iArr = this.f76853;
                int i = iArr[length] + 1;
                if (i >= 0) {
                    AbstractC1339[] abstractC1339Arr = c17746.f58291;
                    if (i < abstractC1339Arr.length) {
                        iArr[length] = i;
                        AbstractC1339 abstractC1339 = abstractC1339Arr[i];
                        while (true) {
                            length++;
                            if (abstractC1339 instanceof C17746) {
                                C17746 c17747 = (C17746) abstractC1339;
                                AbstractC1339[] abstractC1339Arr2 = c17747.f58291;
                                c17746Arr[length] = c17747;
                                iArr[length] = 0;
                                abstractC1339 = abstractC1339Arr2[0];
                            } else {
                                this.f76847 = (C19238) abstractC1339;
                                this.f76854 = 0;
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
        C21697 c21697 = this.f76850;
        if (c21697 == null) {
            return;
        }
        C10046 c10046 = c21697.f69247;
        this.f76850 = null;
        this.f76847 = null;
        Arrays.fill(this.f76851, (Object) null);
        try {
            C8051 c8051 = this.f76852;
            if (c8051 != null) {
                c8051.close();
                this.f76852 = null;
            }
        } finally {
            if (c10046 != null) {
                c10046.m25975();
            }
        }
    }
}
