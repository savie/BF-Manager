package l;

import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֡ۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6OA */
/* JADX INFO: loaded from: classes2.dex */
public final class C0367 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C18503 f1824;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean[] f1825;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f1826;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16969 f1827;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f1828;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int[] f1829;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f1830;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C15891[] f1831;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f1832;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f1833;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f1834;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f1835;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15891[] f1836;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final CharSequence f1837;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m2095(int i) {
        return i == 31 || i == 48 || i == 46;
    }

    public C0367(CharSequence charSequence, ArrayList arrayList, String str, String str2, int i, C16969 c16969, C18503 c18503) {
        this.f1837 = charSequence;
        this.f1826 = arrayList;
        this.f1835 = str;
        this.f1828 = str2;
        this.f1833 = i;
        this.f1827 = c16969;
        this.f1824 = c18503;
        this.f1836 = new C15891[arrayList.size()];
        this.f1831 = new C15891[arrayList.size()];
        this.f1834 = new int[arrayList.size() + 1];
        this.f1829 = new int[arrayList.size()];
        this.f1825 = new boolean[arrayList.size()];
        int i2 = 0;
        while (i2 < arrayList.size()) {
            c16969.m39762();
            C20124 c20124 = (C20124) arrayList.get(i2);
            int length = c20124.f65345.length();
            int iCharCount = c20124.f65349;
            int i3 = 0;
            while (iCharCount < c20124.f65352) {
                int i4 = i3 + 1;
                if ((i3 & 1023) == 0) {
                    c16969.m39762();
                }
                int iCodePointAt = Character.codePointAt(this.f1837, iCharCount);
                if (iCodePointAt == 13 || iCodePointAt == 10) {
                    this.f1825[i2] = true;
                } else if (iCodePointAt != 65279) {
                    length += iCodePointAt == 9 ? this.f1833 : 1;
                }
                iCharCount += Character.charCount(iCodePointAt);
                i3 = i4;
            }
            int[] iArr = this.f1834;
            int i5 = i2 + 1;
            iArr[i5] = iArr[i2] + length;
            i2 = i5;
        }
        ArrayList arrayList2 = this.f1826;
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            this.f1827.m39762();
            C20124 c20125 = (C20124) arrayList2.get(i6);
            this.f1831[i6] = (C15891) arrayDeque.peek();
            if (!arrayDeque.isEmpty()) {
                C15891 c15891 = (C15891) arrayDeque.peek();
                boolean z = c15891.f51474;
                C20124 c20126 = (C20124) this.f1826.get(i6);
                c15891.f51474 = z | (c20126.f65353 || c20126.f65348 >= 0 || this.f1825[i6]);
                ((C15891) arrayDeque.peek()).f51473 |= c20125.f65351;
            }
            int i7 = c20125.f65354;
            if (i7 == 30 || i7 == 47 || i7 == 45) {
                C15891 c15892 = new C15891(i6, c20125.f65344);
                c15892.f51473 = c20125.f65351;
                this.f1836[i6] = c15892;
                arrayDeque.push(c15892);
            } else if (m2095(c20125.f65354)) {
                C15891 c15893 = (C15891) arrayDeque.pop();
                c15893.f51475 = i6;
                if (!arrayDeque.isEmpty()) {
                    ((C15891) arrayDeque.peek()).f51474 |= c15893.f51474;
                    C15891 c15894 = (C15891) arrayDeque.peek();
                    c15894.f51473 = c15893.f51473 | c15894.f51473;
                }
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c16969.m39762();
            this.f1829[size] = size;
            int i8 = size + 1;
            if (i8 < arrayList.size() && !this.f1825[size]) {
                C20124 c20127 = (C20124) this.f1826.get(i8);
                if (!c20127.f65353 && c20127.f65348 < 0 && !m2094(i8)) {
                    int[] iArr2 = this.f1829;
                    iArr2[size] = iArr2[i8];
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x013b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:78:0x0185  */
    /* JADX WARN: Code duplicated, block: B:82:0x018e  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2096() {
        boolean z;
        int i;
        C15891 c15891;
        ArrayDeque arrayDeque;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        ArrayDeque arrayDeque2 = new ArrayDeque();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f1826;
            int size = arrayList.size();
            CharSequence charSequence = this.f1837;
            if (i4 < size) {
                C16969 c16969 = this.f1827;
                c16969.m39762();
                C20124 c20124 = (C20124) arrayList.get(i4);
                C15891 c15892 = this.f1831[i4];
                int iMax = Math.max(c15892 == null ? 0 : c15892.f51476, arrayDeque2.isEmpty() ? 0 : ((C20829) arrayDeque2.peek()).f67693);
                int i6 = c20124.f65344 + iMax;
                int i7 = (c20124.f65351 || !c20124.f65347 || m2095(c20124.f65354) || (c15892 != null && c20124.f65344 <= c15892.f51477 + 1)) ? 0 : 1;
                boolean z4 = c15892 != null && c15892.f51478 && (i4 == c15892.f51479 + 1 || m2095(c20124.f65354) || (c20124.f65344 == c15892.f51477 + 1 && ((i3 = ((C20124) arrayList.get(i4 + (-1))).f65354) == 15 || i3 == 1)));
                boolean z5 = c20124.f65351;
                int[] iArr = this.f1834;
                int[] iArr2 = this.f1829;
                if (z5) {
                    z = false;
                } else {
                    if (!z4) {
                        if (m2094(i4)) {
                            if (((iArr[iArr2[i4] + 1] - iArr[i4]) - ((C20124) arrayList.get(i4)).f65345.length()) + c20124.f65345.length() + this.f1832 > 100) {
                            }
                        }
                        z = false;
                    }
                    z = true;
                }
                int i8 = c20124.f65348;
                ArrayDeque arrayDeque3 = arrayDeque2;
                String str = this.f1835;
                if (i8 >= 0) {
                    m2093(charSequence, i5, c20124.f65348);
                    i = i6 + i7;
                    for (int i9 = 0; i9 < i; i9++) {
                        c16969.m39762();
                        m2093(str, 0, str.length());
                    }
                } else {
                    if (c20124.f65353 || z) {
                        String str2 = this.f1828;
                        m2093(str2, 0, str2.length());
                        i = i6 + i7;
                        for (int i10 = 0; i10 < i; i10++) {
                            c16969.m39762();
                            m2093(str, 0, str.length());
                        }
                    } else {
                        m2093(c20124.f65345, 0, c20124.f65345.length());
                    }
                    c15891 = this.f1836[i4];
                    if (c15891 != null) {
                        boolean z6 = c15891.f51473;
                        if (c15892 == null && c15892.f51473) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c15891.f51473 = z6 | z2;
                        c15891.f51476 = Math.max(iMax, this.f1830 - c20124.f65344);
                        if (!c15891.f51473 || (i2 = c15891.f51475) <= i4 + 1) {
                            z3 = false;
                        } else {
                            if (!c15891.f51474) {
                                if (((iArr[iArr2[i2] + 1] - iArr[i4]) - ((C20124) arrayList.get(i4)).f65345.length()) + this.f1832 <= 100) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        }
                        c15891.f51478 = z3;
                    }
                    if (c20124.f65350 != 0) {
                        arrayDeque = arrayDeque3;
                        arrayDeque.push(new C20829(c20124.f65350, Math.max(iMax, this.f1830 - c20124.f65344)));
                    } else {
                        arrayDeque = arrayDeque3;
                    }
                    m2093(charSequence, c20124.f65349, c20124.f65352);
                    if (arrayDeque.isEmpty() && ((C20829) arrayDeque.peek()).f67692 == c20124.f65352) {
                        arrayDeque.pop();
                    }
                    i5 = c20124.f65352;
                    i4++;
                    arrayDeque2 = arrayDeque;
                }
                this.f1830 = i;
                c15891 = this.f1836[i4];
                if (c15891 != null) {
                    boolean z7 = c15891.f51473;
                    if (c15892 == null) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    c15891.f51473 = z7 | z2;
                    c15891.f51476 = Math.max(iMax, this.f1830 - c20124.f65344);
                    if (c15891.f51473) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    c15891.f51478 = z3;
                }
                if (c20124.f65350 != 0) {
                    arrayDeque = arrayDeque3;
                    arrayDeque.push(new C20829(c20124.f65350, Math.max(iMax, this.f1830 - c20124.f65344)));
                } else {
                    arrayDeque = arrayDeque3;
                }
                m2093(charSequence, c20124.f65349, c20124.f65352);
                if (arrayDeque.isEmpty()) {
                }
                i5 = c20124.f65352;
                i4++;
                arrayDeque2 = arrayDeque;
            } else {
                m2093(charSequence, i5, charSequence.length());
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m2094(int i) {
        if (i == 0) {
            return false;
        }
        C20124 c20124 = (C20124) this.f1826.get(i);
        if (c20124.f65351 || c20124.f65353 || m2095(c20124.f65354) || c20124.f65354 == 17) {
            return false;
        }
        C15891 c15891 = this.f1831[i];
        return c20124.f65346 || !(c15891 == null || c15891.f51473 || i != c15891.f51479 + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2093(CharSequence charSequence, int i, int i2) {
        int i3;
        int i4 = i2 - i;
        C18503 c18503 = this.f1824;
        if (i4 > 1048576 - c18503.length()) {
            throw C6385.m17523(EnumC8129.LIMIT, "Formatted source length limit exceeded");
        }
        c18503.m42896(i, i2, charSequence);
        int i5 = 0;
        while (i < i2) {
            int i6 = i5 + 1;
            if ((i5 & 1023) == 0) {
                this.f1827.m39762();
            }
            int iCodePointAt = Character.codePointAt(charSequence, i);
            if (iCodePointAt == 10 || iCodePointAt == 13) {
                this.f1832 = 0;
                this.f1830 = 0;
            } else if (iCodePointAt != 65279) {
                int i7 = this.f1832;
                if (iCodePointAt == 9) {
                    int i8 = this.f1833;
                    i3 = i8 - (i7 % i8);
                } else {
                    i3 = 1;
                }
                this.f1832 = i7 + i3;
            }
            i += Character.charCount(iCodePointAt);
            i5 = i6;
        }
    }
}
