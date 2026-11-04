package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W9TA */
/* JADX INFO: loaded from: classes2.dex */
public final class C5263 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f18546;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f18547;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f18548;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f18549;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f18550;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f18551;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f18552;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List f18553;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f18554;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f18555;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f18556;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f18557;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C19161 f18545 = C19161.m44409("0");

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C19161 f18543 = C19161.m44409("0123456789");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C19161 f18544 = C19161.m44409(".0123456789");

    public C5263(String str, String str2, String str3) {
        List listAsList = Arrays.asList(str.toLowerCase().split("\\|"));
        this.f18549 = listAsList.contains("2");
        this.f18556 = listAsList.contains("8");
        this.f18547 = listAsList.contains("10");
        this.f18555 = listAsList.contains("16");
        this.f18552 = listAsList.contains("f");
        this.f18554 = listAsList.contains("e");
        this.f18551 = listAsList.contains(am.ax);
        this.f18546 = listAsList.contains("_");
        this.f18548 = listAsList.contains("'");
        String[] strArrSplit = str2.toLowerCase().split("\\|");
        String[] strArrSplit2 = str3.toLowerCase().split("\\|");
        Arrays.sort(strArrSplit, new C14713(1));
        Arrays.sort(strArrSplit2, new C13816());
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str4 : strArrSplit) {
            C17359.requireNonNull(str4);
            arrayList.add(str4);
        }
        this.f18553 = C4681.unmodifiableList(arrayList);
        ArrayList arrayList2 = new ArrayList(strArrSplit2.length);
        for (String str5 : strArrSplit2) {
            C17359.requireNonNull(str5);
            arrayList2.add(str5);
        }
        this.f18550 = C4681.unmodifiableList(arrayList2);
    }

    public C5263(C5263 c5263) {
        this.f18549 = c5263.f18549;
        this.f18556 = c5263.f18556;
        this.f18547 = c5263.f18547;
        this.f18555 = c5263.f18555;
        this.f18552 = c5263.f18552;
        this.f18554 = c5263.f18554;
        this.f18551 = c5263.f18551;
        this.f18546 = c5263.f18546;
        this.f18548 = c5263.f18548;
        this.f18553 = c5263.f18553;
        this.f18550 = c5263.f18550;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5263 m15848() {
        return new C5263(this);
    }

    public C5263(C20348 c20348) {
        int iM46749 = c20348.m46749();
        this.f18549 = (iM46749 & 1) != 0;
        this.f18556 = (iM46749 & 2) != 0;
        this.f18547 = (iM46749 & 4) != 0;
        this.f18555 = (iM46749 & 8) != 0;
        this.f18552 = (iM46749 & 16) != 0;
        this.f18554 = (iM46749 & 32) != 0;
        this.f18551 = (iM46749 & 64) != 0;
        this.f18546 = (iM46749 & 128) != 0;
        this.f18548 = (iM46749 & 256) != 0;
        String[] strArrSplit = c20348.m46743().split("\\|");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str : strArrSplit) {
            C17359.requireNonNull(str);
            arrayList.add(str);
        }
        this.f18553 = C4681.unmodifiableList(arrayList);
        String[] strArrSplit2 = c20348.m46743().split("\\|");
        ArrayList arrayList2 = new ArrayList(strArrSplit2.length);
        for (String str2 : strArrSplit2) {
            C17359.requireNonNull(str2);
            arrayList2.add(str2);
        }
        this.f18550 = C4681.unmodifiableList(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15849(C6178 c6178) {
        boolean z = this.f18556;
        boolean z2 = this.f18549;
        ?? r1 = z2;
        if (z) {
            r1 = (z2 ? 1 : 0) | 2;
        }
        ?? r2 = r1;
        if (this.f18547) {
            r2 = (r1 == true ? 1 : 0) | 4;
        }
        ?? r3 = r2;
        if (this.f18555) {
            r3 = (r2 == true ? 1 : 0) | 8;
        }
        ?? r4 = r3;
        if (this.f18552) {
            r4 = (r3 == true ? 1 : 0) | 16;
        }
        ?? r5 = r4;
        if (this.f18554) {
            r5 = (r4 == true ? 1 : 0) | 32;
        }
        ?? r6 = r5;
        if (this.f18551) {
            r6 = (r5 == true ? 1 : 0) | 64;
        }
        ?? r7 = r6;
        if (this.f18546) {
            r7 = (r6 == true ? 1 : 0) | 128;
        }
        int i = r7;
        if (this.f18548) {
            i = (r7 == true ? 1 : 0) | 256;
        }
        c6178.mo17812(i);
        c6178.m17810(C24276.m54283(this.f18553, "|"));
        c6178.m17810(C24276.m54283(this.f18550, "|"));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m15850() {
        ArrayList arrayList = new ArrayList();
        if (this.f18549) {
            arrayList.add("2");
        }
        if (this.f18556) {
            arrayList.add("8");
        }
        if (this.f18547) {
            arrayList.add("10");
        }
        if (this.f18555) {
            arrayList.add("16");
        }
        if (this.f18552) {
            arrayList.add("F");
        }
        if (this.f18554) {
            arrayList.add("E");
        }
        if (this.f18551) {
            arrayList.add("P");
        }
        if (this.f18546) {
            arrayList.add("_");
        }
        if (this.f18548) {
            arrayList.add("'");
        }
        return C24276.m54283(arrayList, "|");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m15854() {
        return C24276.m54283(this.f18553, "|");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m15853() {
        return C24276.m54283(this.f18550, "|");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m15851() {
        return this.f18557;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C19161 m15852() {
        if (this.f18552 || this.f18554) {
            return f18544;
        }
        if (this.f18547) {
            return f18543;
        }
        if (this.f18549 || this.f18556 || this.f18555 || this.f18551) {
            return f18545;
        }
        return C19161.f61998;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0133  */
    /* JADX WARN: Code duplicated, block: B:105:0x0136  */
    /* JADX WARN: Code duplicated, block: B:117:0x0153 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x0158  */
    /* JADX WARN: Code duplicated, block: B:125:0x0167 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x0169  */
    /* JADX WARN: Code duplicated, block: B:130:0x0177  */
    /* JADX WARN: Code duplicated, block: B:132:0x0181  */
    /* JADX WARN: Code duplicated, block: B:133:0x0185  */
    /* JADX WARN: Code duplicated, block: B:134:0x0187  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ac A[ADDED_TO_REGION, PHI: r5
      0x01ac: PHI (r5v8 int) = (r5v7 int), (r5v11 int) binds: [B:143:0x01a1, B:145:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:151:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091 A[PHI: r4
      0x0091: PHI (r4v39 int) = (r4v28 int), (r4v36 int), (r4v43 int) binds: [B:106:0x0137, B:59:0x00b2, B:48:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:92:0x0117  */
    /* JADX WARN: Code duplicated, block: B:96:0x011d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15847(int i, CharSequence charSequence) {
        int iM15840;
        int i2;
        int iM15839;
        int i3;
        char cCharAt;
        int i4;
        int iM15841;
        int iM15842;
        int i5;
        int i6;
        int iM158310;
        int i7;
        int iM15843;
        int i8;
        int iM15844;
        int i9;
        int iM15846;
        this.f18557 = false;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            return -1;
        }
        boolean z = this.f18551;
        boolean z2 = this.f18554;
        boolean z3 = this.f18552;
        boolean z4 = this.f18555;
        boolean z5 = this.f18547;
        boolean z6 = this.f18556;
        boolean z7 = this.f18549;
        if (i == length) {
            if ((z7 || z6 || z5 || z4 || z3 || z2 || z) && !m15844(i, charSequence)) {
                this.f18557 = true;
            }
            return -1;
        }
        if (!m15845(charSequence, i, false)) {
            return -1;
        }
        int length2 = charSequence.length();
        int i10 = i + 1;
        char cCharAt2 = charSequence.charAt(i);
        List list = this.f18553;
        if (cCharAt2 == '0') {
            if (i10 == length2) {
                this.f18557 = z7 || z6 || z5 || z4 || z3 || z2 || z;
                if (z5) {
                    i5 = -1;
                    i2 = 1;
                } else {
                    i5 = -1;
                    i2 = -1;
                }
            } else {
                char cCharAt3 = charSequence.charAt(i10);
                if (z7 && (cCharAt3 == 'b' || cCharAt3 == 'B')) {
                    int i11 = i + 2;
                    int iM158311 = m15839(charSequence, i11, 2, true);
                    iM15844 = iM158311 == -1 ? -1 : iM158311 + m15841(list, charSequence, i11 + iM158311);
                    if (iM15844 == -1) {
                        if (z6) {
                            if (!z4) {
                                i6 = i + 2;
                                iM158310 = m15839(charSequence, i6, 16, true);
                                if (iM158310 == -1) {
                                    i8 = -1;
                                } else {
                                    i7 = i6 + iM158310;
                                    if (z4) {
                                        iM15843 = m15841(list, charSequence, i7) + iM158310;
                                    } else {
                                        iM15843 = -1;
                                    }
                                    if (z) {
                                        i8 = -1;
                                        if (z4) {
                                            iM15844 = iM15843;
                                        }
                                    } else {
                                        i8 = -1;
                                        if (z4) {
                                            iM15844 = iM15843;
                                        }
                                    }
                                    if (iM15844 != i8) {
                                    }
                                    i5 = -1;
                                }
                                iM15844 = -1;
                                if (iM15844 != i8) {
                                }
                                i5 = -1;
                            } else {
                                i6 = i + 2;
                                iM158310 = m15839(charSequence, i6, 16, true);
                                if (iM158310 == -1) {
                                    i8 = -1;
                                } else {
                                    i7 = i6 + iM158310;
                                    if (z4) {
                                        iM15843 = m15841(list, charSequence, i7) + iM158310;
                                    } else {
                                        iM15843 = -1;
                                    }
                                    if (z) {
                                        i8 = -1;
                                        if (z4) {
                                            iM15844 = iM15843;
                                        }
                                    } else {
                                        i8 = -1;
                                        if (z4) {
                                            iM15844 = iM15843;
                                        }
                                    }
                                    if (iM15844 != i8) {
                                    }
                                    i5 = -1;
                                }
                                iM15844 = -1;
                                if (iM15844 != i8) {
                                }
                                i5 = -1;
                            }
                            if (z5) {
                                i3 = i + iM15839;
                                if (!z3) {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM15841 = m15840(charSequence, i3 + 1, true);
                                        if (iM15841 != -1) {
                                            i2 = iM15839 + 1 + iM15841;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM15842 = m15841(list, charSequence, i3);
                                    if (iM15842 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM15839 + iM15842;
                                    i2 = i4;
                                    i5 = -1;
                                } else {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM15841 = m15840(charSequence, i3 + 1, true);
                                        if (iM15841 != -1) {
                                            i2 = iM15839 + 1 + iM15841;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM15842 = m15841(list, charSequence, i3);
                                    if (iM15842 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM15839 + iM15842;
                                    i2 = i4;
                                    i5 = -1;
                                }
                            } else {
                                i3 = i + iM15839;
                                if (!z3) {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM15841 = m15840(charSequence, i3 + 1, true);
                                        if (iM15841 != -1) {
                                            i2 = iM15839 + 1 + iM15841;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM15842 = m15841(list, charSequence, i3);
                                    if (iM15842 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM15839 + iM15842;
                                    i2 = i4;
                                    i5 = -1;
                                } else {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM15841 = m15840(charSequence, i3 + 1, true);
                                        if (iM15841 != -1) {
                                            i2 = iM15839 + 1 + iM15841;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM15842 = m15841(list, charSequence, i3);
                                    if (iM15842 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM15839 + iM15842;
                                    i2 = i4;
                                    i5 = -1;
                                }
                            }
                        } else {
                            if (!z4) {
                                i6 = i + 2;
                                iM158310 = m15839(charSequence, i6, 16, true);
                                if (iM158310 == -1) {
                                    i8 = -1;
                                } else {
                                    i7 = i6 + iM158310;
                                    if (z4) {
                                        iM15843 = m15841(list, charSequence, i7) + iM158310;
                                    } else {
                                        iM15843 = -1;
                                    }
                                    if (z) {
                                        i8 = -1;
                                        if (z4) {
                                            iM15844 = iM15843;
                                        }
                                    } else {
                                        i8 = -1;
                                        if (z4) {
                                            iM15844 = iM15843;
                                        }
                                    }
                                    if (iM15844 != i8) {
                                    }
                                    i5 = -1;
                                }
                                iM15844 = -1;
                                if (iM15844 != i8) {
                                }
                                i5 = -1;
                            } else {
                                i6 = i + 2;
                                iM158310 = m15839(charSequence, i6, 16, true);
                                if (iM158310 == -1) {
                                    i8 = -1;
                                } else {
                                    i7 = i6 + iM158310;
                                    if (z4) {
                                        iM15843 = m15841(list, charSequence, i7) + iM158310;
                                    } else {
                                        iM15843 = -1;
                                    }
                                    if (z) {
                                        i8 = -1;
                                        if (z4) {
                                            iM15844 = iM15843;
                                        }
                                    } else {
                                        i8 = -1;
                                        if (z4) {
                                            iM15844 = iM15843;
                                        }
                                    }
                                    if (iM15844 != i8) {
                                    }
                                    i5 = -1;
                                }
                                iM15844 = -1;
                                if (iM15844 != i8) {
                                }
                                i5 = -1;
                            }
                            if (z5) {
                                i3 = i + iM15839;
                                if (!z3) {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM15841 = m15840(charSequence, i3 + 1, true);
                                        if (iM15841 != -1) {
                                            i2 = iM15839 + 1 + iM15841;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM15842 = m15841(list, charSequence, i3);
                                    if (iM15842 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM15839 + iM15842;
                                    i2 = i4;
                                    i5 = -1;
                                } else {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM15841 = m15840(charSequence, i3 + 1, true);
                                        if (iM15841 != -1) {
                                            i2 = iM15839 + 1 + iM15841;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM15842 = m15841(list, charSequence, i3);
                                    if (iM15842 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM15839 + iM15842;
                                    i2 = i4;
                                    i5 = -1;
                                }
                            } else {
                                i3 = i + iM15839;
                                if (!z3) {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM15841 = m15840(charSequence, i3 + 1, true);
                                        if (iM15841 != -1) {
                                            i2 = iM15839 + 1 + iM15841;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM15842 = m15841(list, charSequence, i3);
                                    if (iM15842 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM15839 + iM15842;
                                    i2 = i4;
                                    i5 = -1;
                                } else {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM15841 = m15840(charSequence, i3 + 1, true);
                                        if (iM15841 != -1) {
                                            i2 = iM15839 + 1 + iM15841;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM15842 = m15841(list, charSequence, i3);
                                    if (iM15842 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM15839 + iM15842;
                                    i2 = i4;
                                    i5 = -1;
                                }
                            }
                        }
                    }
                    i2 = iM15844 + 2;
                    i5 = -1;
                } else if (z6 || !(cCharAt3 == 'o' || cCharAt3 == 'O')) {
                    if ((!z4 || z) && (cCharAt3 == 'x' || cCharAt3 == 'X')) {
                        i6 = i + 2;
                        iM158310 = m15839(charSequence, i6, 16, true);
                        if (iM158310 == -1) {
                            i8 = -1;
                        } else {
                            i7 = i6 + iM158310;
                            if (z4) {
                                iM15843 = m15841(list, charSequence, i7) + iM158310;
                            } else {
                                iM15843 = -1;
                            }
                            if (z || i7 >= charSequence.length()) {
                                i8 = -1;
                                if (z4) {
                                    iM15844 = iM15843;
                                }
                            } else {
                                int i12 = i7 + 1;
                                char cCharAt4 = charSequence.charAt(i7);
                                if (cCharAt4 == '.') {
                                    int iM158312 = m15839(charSequence, i12, 16, false);
                                    if (iM158312 != -1) {
                                        int i13 = i12 + iM158312;
                                        if (i13 < charSequence.length()) {
                                            int i14 = i13 + 1;
                                            char cCharAt5 = charSequence.charAt(i13);
                                            if (cCharAt5 == 'p' || cCharAt5 == 'P') {
                                                int iM15847 = m15846(i14, charSequence);
                                                iM15846 = iM15847 != -1 ? iM158312 + 1 + iM15847 : -1;
                                                if (iM15846 == i9) {
                                                    i8 = i9;
                                                    if (z4) {
                                                        iM15844 = iM15843;
                                                    }
                                                }
                                            }
                                        }
                                        i9 = -1;
                                        iM15846 = -1;
                                        if (iM15846 == i9) {
                                            i8 = i9;
                                            if (z4) {
                                                iM15844 = iM15843;
                                            }
                                        }
                                    }
                                    i9 = -1;
                                    if (iM15846 == i9) {
                                        i8 = i9;
                                        if (z4) {
                                            iM15844 = iM15843;
                                        }
                                    }
                                } else {
                                    i9 = -1;
                                    if ((cCharAt4 != 'p' && cCharAt4 != 'P') || (iM15846 = m15846(i12, charSequence)) == -1) {
                                        i8 = -1;
                                        if (z4) {
                                            iM15844 = iM15843;
                                        }
                                    }
                                }
                                int i15 = i9;
                                iM15844 = iM15846 + iM158310 + 1;
                                i8 = i15;
                            }
                            if (iM15844 != i8) {
                                i2 = iM15844 + 2;
                            }
                            i5 = -1;
                        }
                        iM15844 = -1;
                        if (iM15844 != i8) {
                            i2 = iM15844 + 2;
                        }
                        i5 = -1;
                    }
                    if ((z5 || z3 || z2) && (iM15839 = m15839(charSequence, i, 10, false)) != -1) {
                        i3 = i + iM15839;
                        if ((!z3 || z2) && i3 < charSequence.length()) {
                            cCharAt = charSequence.charAt(i3);
                            if (cCharAt == '.') {
                                iM15841 = m15840(charSequence, i3 + 1, true);
                                if (iM15841 != -1) {
                                    i2 = iM15839 + 1 + iM15841;
                                }
                                i5 = -1;
                            } else if (!z2 && (cCharAt == 'e' || cCharAt == 'E')) {
                                int iM15845 = m15843(i3 + 1, charSequence);
                                if (iM15845 != -1) {
                                    i4 = iM15839 + 1 + iM15845;
                                    i2 = i4;
                                    i5 = -1;
                                }
                            }
                            iM15842 = m15841(list, charSequence, i3);
                            if ((iM15842 != 0 && (iM15842 = m15841(this.f18550, charSequence, i3)) != 0) || z5) {
                                i4 = iM15839 + iM15842;
                                i2 = i4;
                                i5 = -1;
                            }
                        } else {
                            iM15842 = m15841(list, charSequence, i3);
                            if (iM15842 != 0) {
                            }
                            i4 = iM15839 + iM15842;
                            i2 = i4;
                            i5 = -1;
                        }
                    }
                    i5 = -1;
                    i2 = -1;
                } else {
                    int i16 = i + 2;
                    int iM158313 = m15839(charSequence, i16, 8, true);
                    iM15844 = iM158313 == -1 ? -1 : m15841(list, charSequence, i16 + iM158313) + iM158313;
                    if (iM15844 == -1) {
                        if (!z4) {
                            i6 = i + 2;
                            iM158310 = m15839(charSequence, i6, 16, true);
                            if (iM158310 == -1) {
                                i8 = -1;
                            } else {
                                i7 = i6 + iM158310;
                                if (z4) {
                                    iM15843 = m15841(list, charSequence, i7) + iM158310;
                                } else {
                                    iM15843 = -1;
                                }
                                if (z) {
                                    i8 = -1;
                                    if (z4) {
                                        iM15844 = iM15843;
                                    }
                                } else {
                                    i8 = -1;
                                    if (z4) {
                                        iM15844 = iM15843;
                                    }
                                }
                                if (iM15844 != i8) {
                                }
                                i5 = -1;
                            }
                            iM15844 = -1;
                            if (iM15844 != i8) {
                            }
                            i5 = -1;
                        } else {
                            i6 = i + 2;
                            iM158310 = m15839(charSequence, i6, 16, true);
                            if (iM158310 == -1) {
                                i8 = -1;
                            } else {
                                i7 = i6 + iM158310;
                                if (z4) {
                                    iM15843 = m15841(list, charSequence, i7) + iM158310;
                                } else {
                                    iM15843 = -1;
                                }
                                if (z) {
                                    i8 = -1;
                                    if (z4) {
                                        iM15844 = iM15843;
                                    }
                                } else {
                                    i8 = -1;
                                    if (z4) {
                                        iM15844 = iM15843;
                                    }
                                }
                                if (iM15844 != i8) {
                                }
                                i5 = -1;
                            }
                            iM15844 = -1;
                            if (iM15844 != i8) {
                            }
                            i5 = -1;
                        }
                        if (z5) {
                            i3 = i + iM15839;
                            if (!z3) {
                                cCharAt = charSequence.charAt(i3);
                                if (cCharAt == '.') {
                                    iM15841 = m15840(charSequence, i3 + 1, true);
                                    if (iM15841 != -1) {
                                        i2 = iM15839 + 1 + iM15841;
                                    }
                                    i5 = -1;
                                } else if (!z2) {
                                }
                                iM15842 = m15841(list, charSequence, i3);
                                if (iM15842 != 0) {
                                    i5 = -1;
                                    i2 = -1;
                                } else {
                                    i5 = -1;
                                    i2 = -1;
                                }
                                i4 = iM15839 + iM15842;
                                i2 = i4;
                                i5 = -1;
                            } else {
                                cCharAt = charSequence.charAt(i3);
                                if (cCharAt == '.') {
                                    iM15841 = m15840(charSequence, i3 + 1, true);
                                    if (iM15841 != -1) {
                                        i2 = iM15839 + 1 + iM15841;
                                    }
                                    i5 = -1;
                                } else if (!z2) {
                                }
                                iM15842 = m15841(list, charSequence, i3);
                                if (iM15842 != 0) {
                                    i5 = -1;
                                    i2 = -1;
                                } else {
                                    i5 = -1;
                                    i2 = -1;
                                }
                                i4 = iM15839 + iM15842;
                                i2 = i4;
                                i5 = -1;
                            }
                        } else {
                            i3 = i + iM15839;
                            if (!z3) {
                                cCharAt = charSequence.charAt(i3);
                                if (cCharAt == '.') {
                                    iM15841 = m15840(charSequence, i3 + 1, true);
                                    if (iM15841 != -1) {
                                        i2 = iM15839 + 1 + iM15841;
                                    }
                                    i5 = -1;
                                } else if (!z2) {
                                }
                                iM15842 = m15841(list, charSequence, i3);
                                if (iM15842 != 0) {
                                    i5 = -1;
                                    i2 = -1;
                                } else {
                                    i5 = -1;
                                    i2 = -1;
                                }
                                i4 = iM15839 + iM15842;
                                i2 = i4;
                                i5 = -1;
                            } else {
                                cCharAt = charSequence.charAt(i3);
                                if (cCharAt == '.') {
                                    iM15841 = m15840(charSequence, i3 + 1, true);
                                    if (iM15841 != -1) {
                                        i2 = iM15839 + 1 + iM15841;
                                    }
                                    i5 = -1;
                                } else if (!z2) {
                                }
                                iM15842 = m15841(list, charSequence, i3);
                                if (iM15842 != 0) {
                                    i5 = -1;
                                    i2 = -1;
                                } else {
                                    i5 = -1;
                                    i2 = -1;
                                }
                                i4 = iM15839 + iM15842;
                                i2 = i4;
                                i5 = -1;
                            }
                        }
                    }
                    i2 = iM15844 + 2;
                    i5 = -1;
                }
            }
        } else if (cCharAt2 == '.') {
            if ((z3 || z2) && (iM15840 = m15840(charSequence, i10, false)) != -1) {
                i2 = iM15840 + 1;
                i5 = -1;
            } else {
                i5 = -1;
                i2 = -1;
            }
        } else if (z5) {
            i3 = i + iM15839;
            if (!z3) {
                cCharAt = charSequence.charAt(i3);
                if (cCharAt == '.') {
                    iM15841 = m15840(charSequence, i3 + 1, true);
                    if (iM15841 != -1) {
                        i2 = iM15839 + 1 + iM15841;
                    }
                    i5 = -1;
                } else if (!z2) {
                }
                iM15842 = m15841(list, charSequence, i3);
                if (iM15842 != 0) {
                    i5 = -1;
                    i2 = -1;
                } else {
                    i5 = -1;
                    i2 = -1;
                }
                i4 = iM15839 + iM15842;
                i2 = i4;
                i5 = -1;
            } else {
                cCharAt = charSequence.charAt(i3);
                if (cCharAt == '.') {
                    iM15841 = m15840(charSequence, i3 + 1, true);
                    if (iM15841 != -1) {
                        i2 = iM15839 + 1 + iM15841;
                    }
                    i5 = -1;
                } else if (!z2) {
                }
                iM15842 = m15841(list, charSequence, i3);
                if (iM15842 != 0) {
                    i5 = -1;
                    i2 = -1;
                } else {
                    i5 = -1;
                    i2 = -1;
                }
                i4 = iM15839 + iM15842;
                i2 = i4;
                i5 = -1;
            }
        } else {
            i3 = i + iM15839;
            if (!z3) {
                cCharAt = charSequence.charAt(i3);
                if (cCharAt == '.') {
                    iM15841 = m15840(charSequence, i3 + 1, true);
                    if (iM15841 != -1) {
                        i2 = iM15839 + 1 + iM15841;
                    }
                    i5 = -1;
                } else if (!z2) {
                }
                iM15842 = m15841(list, charSequence, i3);
                if (iM15842 != 0) {
                    i5 = -1;
                    i2 = -1;
                } else {
                    i5 = -1;
                    i2 = -1;
                }
                i4 = iM15839 + iM15842;
                i2 = i4;
                i5 = -1;
            } else {
                cCharAt = charSequence.charAt(i3);
                if (cCharAt == '.') {
                    iM15841 = m15840(charSequence, i3 + 1, true);
                    if (iM15841 != -1) {
                        i2 = iM15839 + 1 + iM15841;
                    }
                    i5 = -1;
                } else if (!z2) {
                }
                iM15842 = m15841(list, charSequence, i3);
                if (iM15842 != 0) {
                    i5 = -1;
                    i2 = -1;
                } else {
                    i5 = -1;
                    i2 = -1;
                }
                i4 = iM15839 + iM15842;
                i2 = i4;
                i5 = -1;
            }
        }
        return (i2 != i5 && m15845(charSequence, i + i2, true)) ? i2 : i5;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m15846(int i, CharSequence charSequence) {
        char cCharAt;
        int i2 = (i >= charSequence.length() || !((cCharAt = charSequence.charAt(i)) == '-' || cCharAt == '+')) ? 0 : 1;
        int iM15839 = m15839(charSequence, i + i2, 10, false);
        if (iM15839 == -1) {
            return -1;
        }
        int i3 = iM15839 + i2;
        return i3 + m15841(this.f18550, charSequence, i + i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m15840(CharSequence charSequence, int i, boolean z) {
        int iM15841;
        char cCharAt;
        int i2 = 0;
        int iM15839 = m15839(charSequence, i, 10, false);
        if (iM15839 == -1) {
            if (z) {
            }
            return -1;
        }
        i2 = iM15839;
        int i3 = i + i2;
        if (this.f18554 && i3 < charSequence.length() && ((cCharAt = charSequence.charAt(i3)) == 'e' || cCharAt == 'E')) {
            if (i3 < charSequence.length() - 1) {
                iM15841 = m15843(i3 + 1, charSequence);
                if (iM15841 != -1) {
                    i2++;
                    return i2 + iM15841;
                }
                return -1;
            }
            this.f18557 = true;
        }
        if (this.f18552) {
            iM15841 = m15841(this.f18550, charSequence, i3);
            return i2 + iM15841;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m15843(int i, CharSequence charSequence) {
        char cCharAt;
        int i2 = (i >= charSequence.length() || !((cCharAt = charSequence.charAt(i)) == '-' || cCharAt == '+')) ? 0 : 1;
        int iM15839 = m15839(charSequence, i + i2, 10, false);
        if (iM15839 == -1) {
            return -1;
        }
        int i3 = iM15839 + i2;
        return i3 + m15841(this.f18550, charSequence, i + i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m15839(CharSequence charSequence, int i, int i2, boolean z) {
        int length = charSequence.length();
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            if (i < length) {
                int i4 = i + 1;
                char cCharAt = charSequence.charAt(i);
                if (('0' <= cCharAt && cCharAt <= '9' && cCharAt - '0' < i2) || (('a' <= cCharAt && cCharAt <= 'f' && cCharAt - 'W' < i2) || ('A' <= cCharAt && cCharAt <= 'F' && cCharAt - '7' < i2))) {
                    i3++;
                    z2 = false;
                } else {
                    if ((!this.f18546 || cCharAt != '_') && (!this.f18548 || cCharAt != '\'')) {
                        break;
                    }
                    if (!z && i3 == 0) {
                        return -1;
                    }
                    i3++;
                    z2 = true;
                }
                i = i4;
            } else {
                this.f18557 = true;
                break;
            }
        }
        if (i3 == 0 || z2) {
            return -1;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m15841(List list, CharSequence charSequence, int i) {
        if (list.isEmpty() || ((String) list.get(0)).isEmpty() || i == charSequence.length()) {
            return 0;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = (String) list.get(i2);
            int length = str.length();
            if (i >= 0 && i <= charSequence.length()) {
                int length2 = charSequence.length() - i;
                int iMin = Math.min(length, length2);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        if (length <= length2) {
                            return str.length();
                        }
                        this.f18557 = true;
                        break;
                    }
                    if (Character.toLowerCase(charSequence.charAt(i + i3)) != str.charAt(i3)) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x005e A[RETURN] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m15845(CharSequence charSequence, int i, boolean z) {
        boolean z2;
        boolean zM15844 = m15844(i, charSequence);
        if (i < charSequence.length()) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            if (z && i == charSequence.length() - 1 && Character.isHighSurrogate((char) iCodePointAt)) {
                this.f18557 = true;
            }
            if (iCodePointAt != 95 && iCodePointAt != 46 && !m15842(iCodePointAt)) {
                if (Character.getType(iCodePointAt) == 6) {
                    while (true) {
                        if (i >= 0) {
                            int iCodePointAt2 = Character.codePointAt(charSequence, i);
                            if (!m15842(iCodePointAt2)) {
                                if (Character.getType(iCodePointAt2) == 6) {
                                    i--;
                                }
                            }
                        }
                    }
                }
            }
            z2 = true;
            if (zM15844 != z2) {
                return true;
            }
            return false;
        }
        if (z && i == charSequence.length()) {
            this.f18557 = true;
        }
        z2 = false;
        if (zM15844 != z2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m15844(int i, CharSequence charSequence) {
        if (i <= 0) {
            return false;
        }
        int iCodePointBefore = Character.codePointBefore(charSequence, i);
        if (iCodePointBefore == 95 || iCodePointBefore == 46 || m15842(iCodePointBefore)) {
            return true;
        }
        if (Character.getType(iCodePointBefore) != 6) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int iCodePointAt = Character.codePointAt(charSequence, i2);
            if (m15842(iCodePointAt)) {
                return true;
            }
            if (Character.getType(iCodePointAt) != 6) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m15842(int i) {
        if (i > 127) {
            return Character.isLetterOrDigit(i);
        }
        if (97 <= i && i <= 122) {
            return true;
        }
        if (65 > i || i > 90) {
            return 48 <= i && i <= 57;
        }
        return true;
    }
}
