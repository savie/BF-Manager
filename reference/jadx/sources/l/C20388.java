package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩶᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6OZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C20388 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int[] f66068;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C1337[] f66069;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f66070;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f66071;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C21093 f66072;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C16155 f66073;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f66074 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f66075;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C14744 f66076;

    public C20388(C14744 c14744, int i, int i2) {
        AbstractC0631[] abstractC0631Arr;
        int i3;
        C14744.m35328(i, i2, c14744.m35339());
        this.f66076 = c14744;
        this.f66070 = i;
        this.f66075 = i2;
        AbstractC0631 abstractC0631 = c14744.f48222;
        int i4 = abstractC0631 == null ? 0 : abstractC0631.f2724;
        this.f66069 = new C1337[i4];
        this.f66068 = new int[i4];
        C16072 c16072 = c14744.f48220;
        if (c16072 != null) {
            c16072.m38089();
        }
        if (i == i2 || abstractC0631 == null || abstractC0631.f2726 == 0) {
            return;
        }
        int i5 = 0;
        while (abstractC0631 instanceof C1337) {
            C1337 c1337 = (C1337) abstractC0631;
            int i6 = 0;
            while (true) {
                abstractC0631Arr = c1337.f5650;
                if (i6 >= abstractC0631Arr.length - 1 || i < (i3 = this.f66071 + abstractC0631Arr[i6].f2727)) {
                    break;
                }
                i6++;
                this.f66071 = i3;
            }
            this.f66069[i5] = c1337;
            this.f66068[i5] = i6;
            abstractC0631 = abstractC0631Arr[i6];
            i5++;
        }
        this.f66073 = (C16155) abstractC0631;
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
    public final int m46038() {
        C21093 c21093;
        C1337[] c1337Arr;
        int length;
        C1337 c1337;
        int[] iArr;
        int i;
        AbstractC0631[] abstractC0631Arr;
        int i2;
        AbstractC0631 abstractC0631;
        int i3;
        C1337 c1338;
        int i4;
        AbstractC0631[] abstractC0631Arr2;
        AbstractC0631 abstractC0632;
        if (this.f66076 == null) {
            throw new IllegalStateException("Line cursor is closed");
        }
        loop0: while (true) {
            C16155 c16155 = this.f66073;
            if (c16155 == null) {
                break;
            }
            int i5 = this.f66070;
            int i6 = this.f66075;
            if (i5 >= i6) {
                break;
            }
            if (c16155.f2726 != 0) {
                if (this.f66072 == null) {
                    C21093 c21093M38247 = c16155.m38247();
                    this.f66072 = c21093M38247;
                    this.f66074 = c21093M38247.f68721.m33315(this.f66070 - this.f66071);
                }
                int i7 = this.f66074;
                if (i7 < this.f66073.f2726) {
                    int i8 = this.f66071;
                    C13625 c13625 = this.f66072.f68721;
                    this.f66074 = i7 + 1;
                    int iM33312 = c13625.m33312(i7) + i8;
                    if (iM33312 >= i6) {
                        break;
                    }
                    this.f66070 = iM33312 + 1;
                    return iM33312;
                }
                c21093 = this.f66072;
                if (c21093 != null) {
                    c21093.close();
                    this.f66072 = null;
                }
                this.f66071 += this.f66073.f2727;
                c1337Arr = this.f66069;
                length = c1337Arr.length;
                while (true) {
                    length--;
                    if (length >= 0) {
                        break loop0;
                        break loop0;
                    }
                    c1337 = c1337Arr[length];
                    iArr = this.f66068;
                    i = iArr[length];
                    while (true) {
                        i++;
                        abstractC0631Arr = c1337.f5650;
                        if (i < abstractC0631Arr.length) {
                            i2 = this.f66071;
                            if (i2 >= i6) {
                                break loop0;
                                break loop0;
                            }
                            abstractC0631 = abstractC0631Arr[i];
                            if (abstractC0631.f2726 == 0) {
                                this.f66071 = i2 + abstractC0631.f2727;
                            }
                        }
                    }
                }
                iArr[length] = i;
                while (true) {
                    length++;
                    if (abstractC0631 instanceof C1337) {
                        break;
                        break;
                    }
                    c1338 = (C1337) abstractC0631;
                    i4 = 0;
                    while (true) {
                        abstractC0631Arr2 = c1338.f5650;
                        abstractC0632 = abstractC0631Arr2[i4];
                        if (abstractC0632.f2726 == 0) {
                            i4++;
                            this.f66071 += abstractC0632.f2727;
                        }
                    }
                    c1337Arr[length] = c1338;
                    iArr[length] = i4;
                    abstractC0631 = abstractC0631Arr2[i4];
                }
                i3 = this.f66071;
                if (i3 >= i6) {
                    break;
                    break;
                }
                this.f66073 = (C16155) abstractC0631;
                this.f66070 = i3;
            } else {
                c21093 = this.f66072;
                if (c21093 != null) {
                    c21093.close();
                    this.f66072 = null;
                }
                this.f66071 += this.f66073.f2727;
                c1337Arr = this.f66069;
                length = c1337Arr.length;
                while (true) {
                    length--;
                    if (length >= 0) {
                        break loop0;
                    }
                    c1337 = c1337Arr[length];
                    iArr = this.f66068;
                    i = iArr[length];
                    while (true) {
                        i++;
                        abstractC0631Arr = c1337.f5650;
                        if (i < abstractC0631Arr.length) {
                            i2 = this.f66071;
                            if (i2 >= i6) {
                                break loop0;
                            }
                            abstractC0631 = abstractC0631Arr[i];
                            if (abstractC0631.f2726 == 0) {
                                this.f66071 = i2 + abstractC0631.f2727;
                            }
                        }
                    }
                }
                iArr[length] = i;
                while (true) {
                    length++;
                    if (abstractC0631 instanceof C1337) {
                        break;
                    }
                    c1338 = (C1337) abstractC0631;
                    i4 = 0;
                    while (true) {
                        abstractC0631Arr2 = c1338.f5650;
                        abstractC0632 = abstractC0631Arr2[i4];
                        if (abstractC0632.f2726 == 0) {
                            i4++;
                            this.f66071 += abstractC0632.f2727;
                        }
                    }
                    c1337Arr[length] = c1338;
                    iArr[length] = i4;
                    abstractC0631 = abstractC0631Arr2[i4];
                }
                i3 = this.f66071;
                if (i3 >= i6) {
                    break;
                }
                this.f66073 = (C16155) abstractC0631;
                this.f66070 = i3;
            }
        }
        C21093 c21094 = this.f66072;
        if (c21094 != null) {
            c21094.close();
            this.f66072 = null;
        }
        this.f66073 = null;
        return -1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C14744 c14744 = this.f66076;
        if (c14744 == null) {
            return;
        }
        C16072 c16072 = c14744.f48220;
        this.f66076 = null;
        this.f66073 = null;
        Arrays.fill(this.f66069, (Object) null);
        try {
            C21093 c21093 = this.f66072;
            if (c21093 != null) {
                c21093.close();
                this.f66072 = null;
            }
        } finally {
            if (c16072 != null) {
                c16072.m38088();
            }
        }
    }
}
