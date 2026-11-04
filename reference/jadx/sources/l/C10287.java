package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۢܿ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: M6OZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10287 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C19238 f32853;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f32854;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f32855;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C21697 f32856;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C17746[] f32857;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C8051 f32858;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f32859;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f32860 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f32861;

    public C10287(C21697 c21697, int i, int i2) {
        AbstractC1339[] abstractC1339Arr;
        int i3;
        C21697.m49248(i, i2, c21697.m49259());
        this.f32856 = c21697;
        this.f32854 = i;
        this.f32861 = i2;
        AbstractC1339 abstractC1339 = c21697.f69245;
        int i4 = abstractC1339 == null ? 0 : abstractC1339.f4791;
        this.f32857 = new C17746[i4];
        this.f32859 = new int[i4];
        C10046 c10046 = c21697.f69247;
        if (c10046 != null) {
            c10046.m25972();
        }
        if (i == i2 || abstractC1339 == null || abstractC1339.f4792 == 0) {
            return;
        }
        int i5 = 0;
        while (abstractC1339 instanceof C17746) {
            C17746 c17746 = (C17746) abstractC1339;
            int i6 = 0;
            while (true) {
                abstractC1339Arr = c17746.f58291;
                if (i6 >= abstractC1339Arr.length - 1 || i < (i3 = this.f32855 + abstractC1339Arr[i6].f4794)) {
                    break;
                }
                i6++;
                this.f32855 = i3;
            }
            this.f32857[i5] = c17746;
            this.f32859[i5] = i6;
            abstractC1339 = abstractC1339Arr[i6];
            i5++;
        }
        this.f32853 = (C19238) abstractC1339;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[LOOP:2: B:27:0x0069->B:34:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094 A[LOOP:4: B:39:0x008c->B:41:0x0094, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00aa A[LOOP:0: B:4:0x0004->B:46:0x00aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b2 A[EDGE_INSN: B:57:0x00b2->B:47:0x00b2 BREAK  A[LOOP:0: B:4:0x0004->B:46:0x00aa, LOOP_LABEL: LOOP:0: B:4:0x0004->B:46:0x00aa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2 A[EDGE_INSN: B:58:0x00b2->B:47:0x00b2 BREAK  A[LOOP:0: B:4:0x0004->B:46:0x00aa, LOOP_LABEL: LOOP:0: B:4:0x0004->B:46:0x00aa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2 A[EDGE_INSN: B:59:0x00b2->B:47:0x00b2 BREAK  A[LOOP:0: B:4:0x0004->B:46:0x00aa], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[LOOP:1: B:24:0x005f->B:61:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5 A[EDGE_INSN: B:62:0x00a5->B:43:0x00a5 BREAK  A[LOOP:3: B:36:0x0083->B:42:0x009e], SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26520() {
        C8051 c8051;
        C17746[] c17746Arr;
        int length;
        C17746 c17746;
        int[] iArr;
        int i;
        AbstractC1339[] abstractC1339Arr;
        int i2;
        AbstractC1339 abstractC1339;
        int i3;
        C17746 c17747;
        int i4;
        AbstractC1339[] abstractC1339Arr2;
        AbstractC1339 abstractC13310;
        if (this.f32856 == null) {
            throw new IllegalStateException("Line cursor is closed");
        }
        loop0: while (true) {
            C19238 c19238 = this.f32853;
            if (c19238 == null) {
                break;
            }
            int i5 = this.f32854;
            int i6 = this.f32861;
            if (i5 >= i6) {
                break;
            }
            if (c19238.f4792 != 0) {
                if (this.f32858 == null) {
                    C8051 c8051M44573 = c19238.m44573();
                    this.f32858 = c8051M44573;
                    this.f32860 = c8051M44573.f26678.m15959(this.f32854 - this.f32855);
                }
                int i7 = this.f32860;
                if (i7 < this.f32853.f4792) {
                    int i8 = this.f32855;
                    C5311 c5311 = this.f32858.f26678;
                    this.f32860 = i7 + 1;
                    int iM15955 = c5311.m15955(i7) + i8;
                    if (iM15955 >= i6) {
                        break;
                    }
                    this.f32854 = iM15955 + 1;
                    return iM15955;
                }
                c8051 = this.f32858;
                if (c8051 != null) {
                    c8051.close();
                    this.f32858 = null;
                }
                this.f32855 += this.f32853.f4794;
                c17746Arr = this.f32857;
                length = c17746Arr.length;
                while (true) {
                    length--;
                    if (length >= 0) {
                        break loop0;
                        break loop0;
                    }
                    c17746 = c17746Arr[length];
                    iArr = this.f32859;
                    i = iArr[length];
                    while (true) {
                        i++;
                        abstractC1339Arr = c17746.f58291;
                        if (i < abstractC1339Arr.length) {
                            i2 = this.f32855;
                            if (i2 >= i6) {
                                break loop0;
                                break loop0;
                            }
                            abstractC1339 = abstractC1339Arr[i];
                            if (abstractC1339.f4792 == 0) {
                                this.f32855 = i2 + abstractC1339.f4794;
                            }
                        }
                    }
                }
                iArr[length] = i;
                while (true) {
                    length++;
                    if (abstractC1339 instanceof C17746) {
                        break;
                        break;
                    }
                    c17747 = (C17746) abstractC1339;
                    i4 = 0;
                    while (true) {
                        abstractC1339Arr2 = c17747.f58291;
                        abstractC13310 = abstractC1339Arr2[i4];
                        if (abstractC13310.f4792 == 0) {
                            i4++;
                            this.f32855 += abstractC13310.f4794;
                        }
                    }
                    c17746Arr[length] = c17747;
                    iArr[length] = i4;
                    abstractC1339 = abstractC1339Arr2[i4];
                }
                i3 = this.f32855;
                if (i3 >= i6) {
                    break;
                    break;
                }
                this.f32853 = (C19238) abstractC1339;
                this.f32854 = i3;
            } else {
                c8051 = this.f32858;
                if (c8051 != null) {
                    c8051.close();
                    this.f32858 = null;
                }
                this.f32855 += this.f32853.f4794;
                c17746Arr = this.f32857;
                length = c17746Arr.length;
                while (true) {
                    length--;
                    if (length >= 0) {
                        break loop0;
                    }
                    c17746 = c17746Arr[length];
                    iArr = this.f32859;
                    i = iArr[length];
                    while (true) {
                        i++;
                        abstractC1339Arr = c17746.f58291;
                        if (i < abstractC1339Arr.length) {
                            i2 = this.f32855;
                            if (i2 >= i6) {
                                break loop0;
                            }
                            abstractC1339 = abstractC1339Arr[i];
                            if (abstractC1339.f4792 == 0) {
                                this.f32855 = i2 + abstractC1339.f4794;
                            }
                        }
                    }
                }
                iArr[length] = i;
                while (true) {
                    length++;
                    if (abstractC1339 instanceof C17746) {
                        break;
                    }
                    c17747 = (C17746) abstractC1339;
                    i4 = 0;
                    while (true) {
                        abstractC1339Arr2 = c17747.f58291;
                        abstractC13310 = abstractC1339Arr2[i4];
                        if (abstractC13310.f4792 == 0) {
                            i4++;
                            this.f32855 += abstractC13310.f4794;
                        }
                    }
                    c17746Arr[length] = c17747;
                    iArr[length] = i4;
                    abstractC1339 = abstractC1339Arr2[i4];
                }
                i3 = this.f32855;
                if (i3 >= i6) {
                    break;
                }
                this.f32853 = (C19238) abstractC1339;
                this.f32854 = i3;
            }
        }
        C8051 c8052 = this.f32858;
        if (c8052 != null) {
            c8052.close();
            this.f32858 = null;
        }
        this.f32853 = null;
        return -1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C21697 c21697 = this.f32856;
        if (c21697 == null) {
            return;
        }
        C10046 c10046 = c21697.f69247;
        this.f32856 = null;
        this.f32853 = null;
        Arrays.fill(this.f32857, (Object) null);
        try {
            C8051 c8051 = this.f32858;
            if (c8051 != null) {
                c8051.close();
                this.f32858 = null;
            }
        } finally {
            if (c10046 != null) {
                c10046.m25975();
            }
        }
    }
}
