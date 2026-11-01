package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩸ۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W9TA */
/* JADX INFO: loaded from: classes4.dex */
public final class C21325 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean f69401;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f69402;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f69403;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f69404;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f69405;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List f69406;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f69407;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f69408;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f69409;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final List f69410;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f69411;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f69412;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C3399 f69399 = C3399.m10075("0");

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C3399 f69398 = C3399.m10075("0123456789");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C3399 f69400 = C3399.m10075(".0123456789");

    public C21325(String str, String str2, String str3) {
        List listAsList = Arrays.asList(str.toLowerCase().split("\\|"));
        this.f69407 = listAsList.contains("2");
        this.f69402 = listAsList.contains("8");
        this.f69404 = listAsList.contains("10");
        this.f69409 = listAsList.contains("16");
        this.f69411 = listAsList.contains("f");
        this.f69405 = listAsList.contains("e");
        this.f69401 = listAsList.contains(am.ax);
        this.f69403 = listAsList.contains("_");
        this.f69408 = listAsList.contains("'");
        String[] strArrSplit = str2.toLowerCase().split("\\|");
        String[] strArrSplit2 = str3.toLowerCase().split("\\|");
        Arrays.sort(strArrSplit, new C17057(1));
        Arrays.sort(strArrSplit2, new C14976());
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str4 : strArrSplit) {
            C13638.requireNonNull(str4);
            arrayList.add(str4);
        }
        this.f69410 = C0561.unmodifiableList(arrayList);
        ArrayList arrayList2 = new ArrayList(strArrSplit2.length);
        for (String str5 : strArrSplit2) {
            C13638.requireNonNull(str5);
            arrayList2.add(str5);
        }
        this.f69406 = C0561.unmodifiableList(arrayList2);
    }

    public C21325(C21325 c21325) {
        this.f69407 = c21325.f69407;
        this.f69402 = c21325.f69402;
        this.f69404 = c21325.f69404;
        this.f69409 = c21325.f69409;
        this.f69411 = c21325.f69411;
        this.f69405 = c21325.f69405;
        this.f69401 = c21325.f69401;
        this.f69403 = c21325.f69403;
        this.f69408 = c21325.f69408;
        this.f69410 = c21325.f69410;
        this.f69406 = c21325.f69406;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21325 m47830() {
        return new C21325(this);
    }

    public C21325(C17367 c17367) {
        int iM40462 = c17367.m40462();
        this.f69407 = (iM40462 & 1) != 0;
        this.f69402 = (iM40462 & 2) != 0;
        this.f69404 = (iM40462 & 4) != 0;
        this.f69409 = (iM40462 & 8) != 0;
        this.f69411 = (iM40462 & 16) != 0;
        this.f69405 = (iM40462 & 32) != 0;
        this.f69401 = (iM40462 & 64) != 0;
        this.f69403 = (iM40462 & 128) != 0;
        this.f69408 = (iM40462 & 256) != 0;
        String[] strArrSplit = c17367.m40459().split("\\|");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str : strArrSplit) {
            C13638.requireNonNull(str);
            arrayList.add(str);
        }
        this.f69410 = C0561.unmodifiableList(arrayList);
        String[] strArrSplit2 = c17367.m40459().split("\\|");
        ArrayList arrayList2 = new ArrayList(strArrSplit2.length);
        for (String str2 : strArrSplit2) {
            C13638.requireNonNull(str2);
            arrayList2.add(str2);
        }
        this.f69406 = C0561.unmodifiableList(arrayList2);
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
    public final void m47831(C11018 c11018) {
        boolean z = this.f69402;
        boolean z2 = this.f69407;
        ?? r1 = z2;
        if (z) {
            r1 = (z2 ? 1 : 0) | 2;
        }
        ?? r2 = r1;
        if (this.f69404) {
            r2 = (r1 == true ? 1 : 0) | 4;
        }
        ?? r3 = r2;
        if (this.f69409) {
            r3 = (r2 == true ? 1 : 0) | 8;
        }
        ?? r4 = r3;
        if (this.f69411) {
            r4 = (r3 == true ? 1 : 0) | 16;
        }
        ?? r5 = r4;
        if (this.f69405) {
            r5 = (r4 == true ? 1 : 0) | 32;
        }
        ?? r6 = r5;
        if (this.f69401) {
            r6 = (r5 == true ? 1 : 0) | 64;
        }
        ?? r7 = r6;
        if (this.f69403) {
            r7 = (r6 == true ? 1 : 0) | 128;
        }
        int i = r7;
        if (this.f69408) {
            i = (r7 == true ? 1 : 0) | 256;
        }
        c11018.mo24508(i);
        c11018.m27776(C6851.m18456(this.f69410, "|"));
        c11018.m27776(C6851.m18456(this.f69406, "|"));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m47833() {
        ArrayList arrayList = new ArrayList();
        if (this.f69407) {
            arrayList.add("2");
        }
        if (this.f69402) {
            arrayList.add("8");
        }
        if (this.f69404) {
            arrayList.add("10");
        }
        if (this.f69409) {
            arrayList.add("16");
        }
        if (this.f69411) {
            arrayList.add("F");
        }
        if (this.f69405) {
            arrayList.add("E");
        }
        if (this.f69401) {
            arrayList.add("P");
        }
        if (this.f69403) {
            arrayList.add("_");
        }
        if (this.f69408) {
            arrayList.add("'");
        }
        return C6851.m18456(arrayList, "|");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m47828() {
        return C6851.m18456(this.f69410, "|");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m47834() {
        return C6851.m18456(this.f69406, "|");
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m47835() {
        return this.f69412;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C3399 m47832() {
        if (this.f69411 || this.f69405) {
            return f69400;
        }
        if (this.f69404) {
            return f69398;
        }
        if (this.f69407 || this.f69402 || this.f69409 || this.f69401) {
            return f69399;
        }
        return C3399.f12540;
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
    public final int m47829(int i, CharSequence charSequence) {
        int iM47821;
        int i2;
        int iM47822;
        int i3;
        char cCharAt;
        int i4;
        int iM47823;
        int iM47824;
        int i5;
        int i6;
        int iM47825;
        int i7;
        int iM47826;
        int i8;
        int iM47827;
        int i9;
        int iM47820;
        this.f69412 = false;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            return -1;
        }
        boolean z = this.f69401;
        boolean z2 = this.f69405;
        boolean z3 = this.f69411;
        boolean z4 = this.f69409;
        boolean z5 = this.f69404;
        boolean z6 = this.f69402;
        boolean z7 = this.f69407;
        if (i == length) {
            if ((z7 || z6 || z5 || z4 || z3 || z2 || z) && !m47826(i, charSequence)) {
                this.f69412 = true;
            }
            return -1;
        }
        if (!m47827(i, charSequence, false)) {
            return -1;
        }
        int length2 = charSequence.length();
        int i10 = i + 1;
        char cCharAt2 = charSequence.charAt(i);
        List list = this.f69410;
        if (cCharAt2 == '0') {
            if (i10 == length2) {
                this.f69412 = z7 || z6 || z5 || z4 || z3 || z2 || z;
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
                    int iM47828 = m47822(charSequence, i11, 2, true);
                    iM47827 = iM47828 == -1 ? -1 : iM47828 + m47823(list, charSequence, i11 + iM47828);
                    if (iM47827 == -1) {
                        if (z6) {
                            if (!z4) {
                                i6 = i + 2;
                                iM47825 = m47822(charSequence, i6, 16, true);
                                if (iM47825 == -1) {
                                    i8 = -1;
                                } else {
                                    i7 = i6 + iM47825;
                                    if (z4) {
                                        iM47826 = m47823(list, charSequence, i7) + iM47825;
                                    } else {
                                        iM47826 = -1;
                                    }
                                    if (z) {
                                        i8 = -1;
                                        if (z4) {
                                            iM47827 = iM47826;
                                        }
                                    } else {
                                        i8 = -1;
                                        if (z4) {
                                            iM47827 = iM47826;
                                        }
                                    }
                                    if (iM47827 != i8) {
                                    }
                                    i5 = -1;
                                }
                                iM47827 = -1;
                                if (iM47827 != i8) {
                                }
                                i5 = -1;
                            } else {
                                i6 = i + 2;
                                iM47825 = m47822(charSequence, i6, 16, true);
                                if (iM47825 == -1) {
                                    i8 = -1;
                                } else {
                                    i7 = i6 + iM47825;
                                    if (z4) {
                                        iM47826 = m47823(list, charSequence, i7) + iM47825;
                                    } else {
                                        iM47826 = -1;
                                    }
                                    if (z) {
                                        i8 = -1;
                                        if (z4) {
                                            iM47827 = iM47826;
                                        }
                                    } else {
                                        i8 = -1;
                                        if (z4) {
                                            iM47827 = iM47826;
                                        }
                                    }
                                    if (iM47827 != i8) {
                                    }
                                    i5 = -1;
                                }
                                iM47827 = -1;
                                if (iM47827 != i8) {
                                }
                                i5 = -1;
                            }
                            if (z5) {
                                i3 = i + iM47822;
                                if (!z3) {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM47823 = m47821(i3 + 1, charSequence, true);
                                        if (iM47823 != -1) {
                                            i2 = iM47822 + 1 + iM47823;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM47824 = m47823(list, charSequence, i3);
                                    if (iM47824 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM47822 + iM47824;
                                    i2 = i4;
                                    i5 = -1;
                                } else {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM47823 = m47821(i3 + 1, charSequence, true);
                                        if (iM47823 != -1) {
                                            i2 = iM47822 + 1 + iM47823;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM47824 = m47823(list, charSequence, i3);
                                    if (iM47824 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM47822 + iM47824;
                                    i2 = i4;
                                    i5 = -1;
                                }
                            } else {
                                i3 = i + iM47822;
                                if (!z3) {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM47823 = m47821(i3 + 1, charSequence, true);
                                        if (iM47823 != -1) {
                                            i2 = iM47822 + 1 + iM47823;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM47824 = m47823(list, charSequence, i3);
                                    if (iM47824 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM47822 + iM47824;
                                    i2 = i4;
                                    i5 = -1;
                                } else {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM47823 = m47821(i3 + 1, charSequence, true);
                                        if (iM47823 != -1) {
                                            i2 = iM47822 + 1 + iM47823;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM47824 = m47823(list, charSequence, i3);
                                    if (iM47824 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM47822 + iM47824;
                                    i2 = i4;
                                    i5 = -1;
                                }
                            }
                        } else {
                            if (!z4) {
                                i6 = i + 2;
                                iM47825 = m47822(charSequence, i6, 16, true);
                                if (iM47825 == -1) {
                                    i8 = -1;
                                } else {
                                    i7 = i6 + iM47825;
                                    if (z4) {
                                        iM47826 = m47823(list, charSequence, i7) + iM47825;
                                    } else {
                                        iM47826 = -1;
                                    }
                                    if (z) {
                                        i8 = -1;
                                        if (z4) {
                                            iM47827 = iM47826;
                                        }
                                    } else {
                                        i8 = -1;
                                        if (z4) {
                                            iM47827 = iM47826;
                                        }
                                    }
                                    if (iM47827 != i8) {
                                    }
                                    i5 = -1;
                                }
                                iM47827 = -1;
                                if (iM47827 != i8) {
                                }
                                i5 = -1;
                            } else {
                                i6 = i + 2;
                                iM47825 = m47822(charSequence, i6, 16, true);
                                if (iM47825 == -1) {
                                    i8 = -1;
                                } else {
                                    i7 = i6 + iM47825;
                                    if (z4) {
                                        iM47826 = m47823(list, charSequence, i7) + iM47825;
                                    } else {
                                        iM47826 = -1;
                                    }
                                    if (z) {
                                        i8 = -1;
                                        if (z4) {
                                            iM47827 = iM47826;
                                        }
                                    } else {
                                        i8 = -1;
                                        if (z4) {
                                            iM47827 = iM47826;
                                        }
                                    }
                                    if (iM47827 != i8) {
                                    }
                                    i5 = -1;
                                }
                                iM47827 = -1;
                                if (iM47827 != i8) {
                                }
                                i5 = -1;
                            }
                            if (z5) {
                                i3 = i + iM47822;
                                if (!z3) {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM47823 = m47821(i3 + 1, charSequence, true);
                                        if (iM47823 != -1) {
                                            i2 = iM47822 + 1 + iM47823;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM47824 = m47823(list, charSequence, i3);
                                    if (iM47824 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM47822 + iM47824;
                                    i2 = i4;
                                    i5 = -1;
                                } else {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM47823 = m47821(i3 + 1, charSequence, true);
                                        if (iM47823 != -1) {
                                            i2 = iM47822 + 1 + iM47823;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM47824 = m47823(list, charSequence, i3);
                                    if (iM47824 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM47822 + iM47824;
                                    i2 = i4;
                                    i5 = -1;
                                }
                            } else {
                                i3 = i + iM47822;
                                if (!z3) {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM47823 = m47821(i3 + 1, charSequence, true);
                                        if (iM47823 != -1) {
                                            i2 = iM47822 + 1 + iM47823;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM47824 = m47823(list, charSequence, i3);
                                    if (iM47824 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM47822 + iM47824;
                                    i2 = i4;
                                    i5 = -1;
                                } else {
                                    cCharAt = charSequence.charAt(i3);
                                    if (cCharAt == '.') {
                                        iM47823 = m47821(i3 + 1, charSequence, true);
                                        if (iM47823 != -1) {
                                            i2 = iM47822 + 1 + iM47823;
                                        }
                                        i5 = -1;
                                    } else if (!z2) {
                                    }
                                    iM47824 = m47823(list, charSequence, i3);
                                    if (iM47824 != 0) {
                                        i5 = -1;
                                        i2 = -1;
                                    } else {
                                        i5 = -1;
                                        i2 = -1;
                                    }
                                    i4 = iM47822 + iM47824;
                                    i2 = i4;
                                    i5 = -1;
                                }
                            }
                        }
                    }
                    i2 = iM47827 + 2;
                    i5 = -1;
                } else if (z6 || !(cCharAt3 == 'o' || cCharAt3 == 'O')) {
                    if ((!z4 || z) && (cCharAt3 == 'x' || cCharAt3 == 'X')) {
                        i6 = i + 2;
                        iM47825 = m47822(charSequence, i6, 16, true);
                        if (iM47825 == -1) {
                            i8 = -1;
                        } else {
                            i7 = i6 + iM47825;
                            if (z4) {
                                iM47826 = m47823(list, charSequence, i7) + iM47825;
                            } else {
                                iM47826 = -1;
                            }
                            if (z || i7 >= charSequence.length()) {
                                i8 = -1;
                                if (z4) {
                                    iM47827 = iM47826;
                                }
                            } else {
                                int i12 = i7 + 1;
                                char cCharAt4 = charSequence.charAt(i7);
                                if (cCharAt4 == '.') {
                                    int iM47829 = m47822(charSequence, i12, 16, false);
                                    if (iM47829 != -1) {
                                        int i13 = i12 + iM47829;
                                        if (i13 < charSequence.length()) {
                                            int i14 = i13 + 1;
                                            char cCharAt5 = charSequence.charAt(i13);
                                            if (cCharAt5 == 'p' || cCharAt5 == 'P') {
                                                int iM478210 = m47820(i14, charSequence);
                                                iM47820 = iM478210 != -1 ? iM47829 + 1 + iM478210 : -1;
                                                if (iM47820 == i9) {
                                                    i8 = i9;
                                                    if (z4) {
                                                        iM47827 = iM47826;
                                                    }
                                                }
                                            }
                                        }
                                        i9 = -1;
                                        iM47820 = -1;
                                        if (iM47820 == i9) {
                                            i8 = i9;
                                            if (z4) {
                                                iM47827 = iM47826;
                                            }
                                        }
                                    }
                                    i9 = -1;
                                    if (iM47820 == i9) {
                                        i8 = i9;
                                        if (z4) {
                                            iM47827 = iM47826;
                                        }
                                    }
                                } else {
                                    i9 = -1;
                                    if ((cCharAt4 != 'p' && cCharAt4 != 'P') || (iM47820 = m47820(i12, charSequence)) == -1) {
                                        i8 = -1;
                                        if (z4) {
                                            iM47827 = iM47826;
                                        }
                                    }
                                }
                                int i15 = i9;
                                iM47827 = iM47820 + iM47825 + 1;
                                i8 = i15;
                            }
                            if (iM47827 != i8) {
                                i2 = iM47827 + 2;
                            }
                            i5 = -1;
                        }
                        iM47827 = -1;
                        if (iM47827 != i8) {
                            i2 = iM47827 + 2;
                        }
                        i5 = -1;
                    }
                    if ((z5 || z3 || z2) && (iM47822 = m47822(charSequence, i, 10, false)) != -1) {
                        i3 = i + iM47822;
                        if ((!z3 || z2) && i3 < charSequence.length()) {
                            cCharAt = charSequence.charAt(i3);
                            if (cCharAt == '.') {
                                iM47823 = m47821(i3 + 1, charSequence, true);
                                if (iM47823 != -1) {
                                    i2 = iM47822 + 1 + iM47823;
                                }
                                i5 = -1;
                            } else if (!z2 && (cCharAt == 'e' || cCharAt == 'E')) {
                                int iM478211 = m47825(i3 + 1, charSequence);
                                if (iM478211 != -1) {
                                    i4 = iM47822 + 1 + iM478211;
                                    i2 = i4;
                                    i5 = -1;
                                }
                            }
                            iM47824 = m47823(list, charSequence, i3);
                            if ((iM47824 != 0 && (iM47824 = m47823(this.f69406, charSequence, i3)) != 0) || z5) {
                                i4 = iM47822 + iM47824;
                                i2 = i4;
                                i5 = -1;
                            }
                        } else {
                            iM47824 = m47823(list, charSequence, i3);
                            if (iM47824 != 0) {
                            }
                            i4 = iM47822 + iM47824;
                            i2 = i4;
                            i5 = -1;
                        }
                    }
                    i5 = -1;
                    i2 = -1;
                } else {
                    int i16 = i + 2;
                    int iM478212 = m47822(charSequence, i16, 8, true);
                    iM47827 = iM478212 == -1 ? -1 : m47823(list, charSequence, i16 + iM478212) + iM478212;
                    if (iM47827 == -1) {
                        if (!z4) {
                            i6 = i + 2;
                            iM47825 = m47822(charSequence, i6, 16, true);
                            if (iM47825 == -1) {
                                i8 = -1;
                            } else {
                                i7 = i6 + iM47825;
                                if (z4) {
                                    iM47826 = m47823(list, charSequence, i7) + iM47825;
                                } else {
                                    iM47826 = -1;
                                }
                                if (z) {
                                    i8 = -1;
                                    if (z4) {
                                        iM47827 = iM47826;
                                    }
                                } else {
                                    i8 = -1;
                                    if (z4) {
                                        iM47827 = iM47826;
                                    }
                                }
                                if (iM47827 != i8) {
                                }
                                i5 = -1;
                            }
                            iM47827 = -1;
                            if (iM47827 != i8) {
                            }
                            i5 = -1;
                        } else {
                            i6 = i + 2;
                            iM47825 = m47822(charSequence, i6, 16, true);
                            if (iM47825 == -1) {
                                i8 = -1;
                            } else {
                                i7 = i6 + iM47825;
                                if (z4) {
                                    iM47826 = m47823(list, charSequence, i7) + iM47825;
                                } else {
                                    iM47826 = -1;
                                }
                                if (z) {
                                    i8 = -1;
                                    if (z4) {
                                        iM47827 = iM47826;
                                    }
                                } else {
                                    i8 = -1;
                                    if (z4) {
                                        iM47827 = iM47826;
                                    }
                                }
                                if (iM47827 != i8) {
                                }
                                i5 = -1;
                            }
                            iM47827 = -1;
                            if (iM47827 != i8) {
                            }
                            i5 = -1;
                        }
                        if (z5) {
                            i3 = i + iM47822;
                            if (!z3) {
                                cCharAt = charSequence.charAt(i3);
                                if (cCharAt == '.') {
                                    iM47823 = m47821(i3 + 1, charSequence, true);
                                    if (iM47823 != -1) {
                                        i2 = iM47822 + 1 + iM47823;
                                    }
                                    i5 = -1;
                                } else if (!z2) {
                                }
                                iM47824 = m47823(list, charSequence, i3);
                                if (iM47824 != 0) {
                                    i5 = -1;
                                    i2 = -1;
                                } else {
                                    i5 = -1;
                                    i2 = -1;
                                }
                                i4 = iM47822 + iM47824;
                                i2 = i4;
                                i5 = -1;
                            } else {
                                cCharAt = charSequence.charAt(i3);
                                if (cCharAt == '.') {
                                    iM47823 = m47821(i3 + 1, charSequence, true);
                                    if (iM47823 != -1) {
                                        i2 = iM47822 + 1 + iM47823;
                                    }
                                    i5 = -1;
                                } else if (!z2) {
                                }
                                iM47824 = m47823(list, charSequence, i3);
                                if (iM47824 != 0) {
                                    i5 = -1;
                                    i2 = -1;
                                } else {
                                    i5 = -1;
                                    i2 = -1;
                                }
                                i4 = iM47822 + iM47824;
                                i2 = i4;
                                i5 = -1;
                            }
                        } else {
                            i3 = i + iM47822;
                            if (!z3) {
                                cCharAt = charSequence.charAt(i3);
                                if (cCharAt == '.') {
                                    iM47823 = m47821(i3 + 1, charSequence, true);
                                    if (iM47823 != -1) {
                                        i2 = iM47822 + 1 + iM47823;
                                    }
                                    i5 = -1;
                                } else if (!z2) {
                                }
                                iM47824 = m47823(list, charSequence, i3);
                                if (iM47824 != 0) {
                                    i5 = -1;
                                    i2 = -1;
                                } else {
                                    i5 = -1;
                                    i2 = -1;
                                }
                                i4 = iM47822 + iM47824;
                                i2 = i4;
                                i5 = -1;
                            } else {
                                cCharAt = charSequence.charAt(i3);
                                if (cCharAt == '.') {
                                    iM47823 = m47821(i3 + 1, charSequence, true);
                                    if (iM47823 != -1) {
                                        i2 = iM47822 + 1 + iM47823;
                                    }
                                    i5 = -1;
                                } else if (!z2) {
                                }
                                iM47824 = m47823(list, charSequence, i3);
                                if (iM47824 != 0) {
                                    i5 = -1;
                                    i2 = -1;
                                } else {
                                    i5 = -1;
                                    i2 = -1;
                                }
                                i4 = iM47822 + iM47824;
                                i2 = i4;
                                i5 = -1;
                            }
                        }
                    }
                    i2 = iM47827 + 2;
                    i5 = -1;
                }
            }
        } else if (cCharAt2 == '.') {
            if ((z3 || z2) && (iM47821 = m47821(i10, charSequence, false)) != -1) {
                i2 = iM47821 + 1;
                i5 = -1;
            } else {
                i5 = -1;
                i2 = -1;
            }
        } else if (z5) {
            i3 = i + iM47822;
            if (!z3) {
                cCharAt = charSequence.charAt(i3);
                if (cCharAt == '.') {
                    iM47823 = m47821(i3 + 1, charSequence, true);
                    if (iM47823 != -1) {
                        i2 = iM47822 + 1 + iM47823;
                    }
                    i5 = -1;
                } else if (!z2) {
                }
                iM47824 = m47823(list, charSequence, i3);
                if (iM47824 != 0) {
                    i5 = -1;
                    i2 = -1;
                } else {
                    i5 = -1;
                    i2 = -1;
                }
                i4 = iM47822 + iM47824;
                i2 = i4;
                i5 = -1;
            } else {
                cCharAt = charSequence.charAt(i3);
                if (cCharAt == '.') {
                    iM47823 = m47821(i3 + 1, charSequence, true);
                    if (iM47823 != -1) {
                        i2 = iM47822 + 1 + iM47823;
                    }
                    i5 = -1;
                } else if (!z2) {
                }
                iM47824 = m47823(list, charSequence, i3);
                if (iM47824 != 0) {
                    i5 = -1;
                    i2 = -1;
                } else {
                    i5 = -1;
                    i2 = -1;
                }
                i4 = iM47822 + iM47824;
                i2 = i4;
                i5 = -1;
            }
        } else {
            i3 = i + iM47822;
            if (!z3) {
                cCharAt = charSequence.charAt(i3);
                if (cCharAt == '.') {
                    iM47823 = m47821(i3 + 1, charSequence, true);
                    if (iM47823 != -1) {
                        i2 = iM47822 + 1 + iM47823;
                    }
                    i5 = -1;
                } else if (!z2) {
                }
                iM47824 = m47823(list, charSequence, i3);
                if (iM47824 != 0) {
                    i5 = -1;
                    i2 = -1;
                } else {
                    i5 = -1;
                    i2 = -1;
                }
                i4 = iM47822 + iM47824;
                i2 = i4;
                i5 = -1;
            } else {
                cCharAt = charSequence.charAt(i3);
                if (cCharAt == '.') {
                    iM47823 = m47821(i3 + 1, charSequence, true);
                    if (iM47823 != -1) {
                        i2 = iM47822 + 1 + iM47823;
                    }
                    i5 = -1;
                } else if (!z2) {
                }
                iM47824 = m47823(list, charSequence, i3);
                if (iM47824 != 0) {
                    i5 = -1;
                    i2 = -1;
                } else {
                    i5 = -1;
                    i2 = -1;
                }
                i4 = iM47822 + iM47824;
                i2 = i4;
                i5 = -1;
            }
        }
        return (i2 != i5 && m47827(i + i2, charSequence, true)) ? i2 : i5;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private int m47820(int i, CharSequence charSequence) {
        char cCharAt;
        int i2 = (i >= charSequence.length() || !((cCharAt = charSequence.charAt(i)) == '-' || cCharAt == '+')) ? 0 : 1;
        int iM47822 = m47822(charSequence, i + i2, 10, false);
        if (iM47822 == -1) {
            return -1;
        }
        int i3 = iM47822 + i2;
        return i3 + m47823(this.f69406, charSequence, i + i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m47821(int i, CharSequence charSequence, boolean z) {
        int iM47823;
        char cCharAt;
        int i2 = 0;
        int iM47822 = m47822(charSequence, i, 10, false);
        if (iM47822 == -1) {
            if (z) {
            }
            return -1;
        }
        i2 = iM47822;
        int i3 = i + i2;
        if (this.f69405 && i3 < charSequence.length() && ((cCharAt = charSequence.charAt(i3)) == 'e' || cCharAt == 'E')) {
            if (i3 < charSequence.length() - 1) {
                iM47823 = m47825(i3 + 1, charSequence);
                if (iM47823 != -1) {
                    i2++;
                    return i2 + iM47823;
                }
                return -1;
            }
            this.f69412 = true;
        }
        if (this.f69411) {
            iM47823 = m47823(this.f69406, charSequence, i3);
            return i2 + iM47823;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m47825(int i, CharSequence charSequence) {
        char cCharAt;
        int i2 = (i >= charSequence.length() || !((cCharAt = charSequence.charAt(i)) == '-' || cCharAt == '+')) ? 0 : 1;
        int iM47822 = m47822(charSequence, i + i2, 10, false);
        if (iM47822 == -1) {
            return -1;
        }
        int i3 = iM47822 + i2;
        return i3 + m47823(this.f69406, charSequence, i + i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m47822(CharSequence charSequence, int i, int i2, boolean z) {
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
                    if ((!this.f69403 || cCharAt != '_') && (!this.f69408 || cCharAt != '\'')) {
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
                this.f69412 = true;
                break;
            }
        }
        if (i3 == 0 || z2) {
            return -1;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m47823(List list, CharSequence charSequence, int i) {
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
                        this.f69412 = true;
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
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m47827(int i, CharSequence charSequence, boolean z) {
        boolean z2;
        boolean zM47826 = m47826(i, charSequence);
        if (i < charSequence.length()) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            if (z && i == charSequence.length() - 1 && Character.isHighSurrogate((char) iCodePointAt)) {
                this.f69412 = true;
            }
            if (iCodePointAt != 95 && iCodePointAt != 46 && !m47824(iCodePointAt)) {
                if (Character.getType(iCodePointAt) == 6) {
                    while (true) {
                        if (i >= 0) {
                            int iCodePointAt2 = Character.codePointAt(charSequence, i);
                            if (!m47824(iCodePointAt2)) {
                                if (Character.getType(iCodePointAt2) == 6) {
                                    i--;
                                }
                            }
                        }
                    }
                }
            }
            z2 = true;
            if (zM47826 != z2) {
                return true;
            }
            return false;
        }
        if (z && i == charSequence.length()) {
            this.f69412 = true;
        }
        z2 = false;
        if (zM47826 != z2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m47826(int i, CharSequence charSequence) {
        if (i <= 0) {
            return false;
        }
        int iCodePointBefore = Character.codePointBefore(charSequence, i);
        if (iCodePointBefore == 95 || iCodePointBefore == 46 || m47824(iCodePointBefore)) {
            return true;
        }
        if (Character.getType(iCodePointBefore) != 6) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int iCodePointAt = Character.codePointAt(charSequence, i2);
            if (m47824(iCodePointAt)) {
                return true;
            }
            if (Character.getType(iCodePointAt) != 6) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47824(int i) {
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
