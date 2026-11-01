package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ܳ᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66ND */
/* JADX INFO: loaded from: classes4.dex */
public final class C14853 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean[] f48537;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f48538;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean[] f48539;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean[] f48540;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f48541;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final CharSequence f48542;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean[] f48543;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean[] f48544;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C16969 f48545;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean[] f48546;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f48547;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f48548;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean[] f48549;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f48550;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f48551;

    /* JADX WARN: Code duplicated, block: B:136:0x0284  */
    public C14853(CharSequence charSequence, List list, C23320 c23320, C12052 c12052, String str, C16969 c16969) {
        String string;
        int i;
        C16969 c169610;
        List list2;
        boolean z;
        int i2;
        int i3;
        this.f48542 = charSequence;
        this.f48547 = list;
        this.f48545 = c16969;
        this.f48538 = new int[list.size()];
        this.f48541 = new int[list.size()];
        this.f48540 = new boolean[list.size()];
        this.f48549 = new boolean[list.size()];
        this.f48546 = new boolean[list.size()];
        this.f48537 = new boolean[list.size()];
        this.f48539 = new boolean[list.size()];
        this.f48544 = new boolean[list.size()];
        this.f48543 = new boolean[list.size()];
        int iMax = Math.max(1, Math.min(16, c12052.m29953()));
        this.f48551 = iMax;
        if (c12052.m29954()) {
            string = "\t";
        } else {
            if (iMax < 0) {
                throw new IllegalArgumentException(C8479.m22141(iMax, "count is negative: "));
            }
            if (iMax == 0) {
                string = "";
            } else if (iMax == 1) {
                string = " ";
            } else {
                if (1 > Integer.MAX_VALUE / iMax) {
                    throw new OutOfMemoryError(C2271.m6966(iMax, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(iMax);
                for (int i4 = 0; i4 < iMax; i4++) {
                    sb.append(" ");
                }
                string = sb.toString();
            }
        }
        this.f48548 = string;
        this.f48550 = str;
        boolean[] zArr = this.f48539;
        boolean[] zArr2 = this.f48546;
        int[] iArr = this.f48538;
        boolean[] zArr3 = this.f48540;
        C16969 c169611 = this.f48545;
        boolean[] zArr4 = this.f48549;
        List list3 = this.f48547;
        int[] iArr2 = new int[list3.size()];
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(new C24025(c23320, 0, false));
        while (!arrayDeque.isEmpty()) {
            c169611.m39762();
            C24025 c24025 = (C24025) arrayDeque.pop();
            C23289 c23289 = c24025.f77839;
            int iMo1058 = c23289.mo1058();
            if (iMo1058 == 18) {
                this.f48541[c23289.f75536.mo22511()] = c23289.f75537.mo22510() + 1;
            }
            if ((iMo1058 == 3 || iMo1058 == 6) && c23289.f75536.getType() != 1) {
                zArr3[c23289.f75536.mo22511()] = true;
            }
            if (iMo1058 == 5 && c23289.getChildCount() > 0) {
                String text = c23289.mo22136(1).getText();
                if (!text.equals("const") && !text.equals("close")) {
                    throw new C19418(EnumC8129.SYNTAX, c23289.f75536.getLine(), c23289.f75536.mo22509(), "Unknown local attribute: ".concat(text));
                }
            }
            int childCount = c23289.getChildCount() - 1;
            while (childCount >= 0) {
                InterfaceC14988 interfaceC14988Mo22136 = c23289.mo22136(childCount);
                if (interfaceC14988Mo22136 instanceof C23289) {
                    C23289 c232810 = (C23289) interfaceC14988Mo22136;
                    int i5 = c24025.f77840;
                    c169610 = c169611;
                    list2 = list3;
                    if (c232810.mo1058() == 2 && iMo1058 != 1) {
                        i5++;
                        int iMo22511 = ((InterfaceC17809) c23289.mo22136(childCount - 1)).mo41396().mo22511() + 1;
                        int iMo22512 = ((InterfaceC17809) c23289.mo22136(childCount + 1)).mo41396().mo22511();
                        iArr2[iMo22511] = iArr2[iMo22511] + 1;
                        iArr2[iMo22512] = iArr2[iMo22512] - 1;
                    }
                    int iMo1059 = c232810.mo1058();
                    arrayDeque.push(new C24025(c232810, i5, iMo1059 != 2 && (c24025.f77841 || iMo1059 == 12 || iMo1059 == 14 || iMo1059 == 11 || iMo1059 == 20 || iMo1059 == 10 || iMo1059 == 4 || iMo1059 == 9)));
                } else {
                    c169610 = c169611;
                    list2 = list3;
                    if (interfaceC14988Mo22136 instanceof InterfaceC17809) {
                        InterfaceC19761 interfaceC19761Mo41396 = ((InterfaceC17809) interfaceC14988Mo22136).mo41396();
                        int iMo22513 = interfaceC19761Mo41396.mo22511();
                        int type = interfaceC19761Mo41396.getType();
                        iArr[iMo22513] = c24025.f77840;
                        this.f48543[iMo22513] = c24025.f77841;
                        if (type == 6 || type == 13 || type == 12 || type == 9) {
                            zArr3[iMo22513] = true;
                        }
                        if (type == 30 && (iMo1058 == 17 || iMo1058 == 19)) {
                            z = true;
                            zArr4[iMo22513] = true;
                        } else {
                            z = true;
                        }
                        if (type == 47 && iMo1058 != 23) {
                            zArr4[iMo22513] = z;
                        }
                        if (iMo1058 == 5) {
                            if (type == 19) {
                                zArr2[iMo22513] = z;
                            }
                            if (type == 20) {
                                zArr4[iMo22513] = z;
                            }
                        }
                        if (iMo1058 == 12 && childCount == 0) {
                            if (type == 28 || type == 27 || type == 29) {
                                zArr2[iMo22513] = true;
                            } else {
                                i3 = 12;
                                i2 = 1;
                            }
                            if (iMo1058 == i3 && childCount == i2 && (c23289.mo22136(0) instanceof C23652)) {
                                zArr[iMo22513] = true;
                            }
                            if (iMo1058 == 15 && (type == 26 || type == 38)) {
                                zArr[iMo22513] = true;
                            }
                            if (type != 15 || iMo1058 == 24 || type == 2 || type == 21) {
                                this.f48544[iMo22513] = true;
                            }
                        }
                        i2 = 1;
                        i3 = 12;
                        if (iMo1058 == i3) {
                            zArr[iMo22513] = true;
                        }
                        if (iMo1058 == 15) {
                            zArr[iMo22513] = true;
                        }
                        if (type != 15) {
                            this.f48544[iMo22513] = true;
                        } else {
                            this.f48544[iMo22513] = true;
                        }
                    }
                }
                childCount--;
                c169611 = c169610;
                list3 = list2;
            }
        }
        C16969 c169612 = c169611;
        List list4 = list3;
        int i6 = 0;
        int i7 = 0;
        while (i7 < list4.size()) {
            if ((i7 & 1023) == 0) {
                c169612.m39762();
            }
            i6 += iArr2[i7];
            List list5 = list4;
            if (m35538((InterfaceC19761) list5.get(i7))) {
                iArr[i7] = i6;
            }
            i7++;
            list4 = list5;
        }
        int i8 = 0;
        C6012 c6012 = (C6012) ((C10952) c23320.m51374(C10952.class, 0)).m51374(C6012.class, 0);
        List list6 = this.f48547;
        ArrayList arrayList = new ArrayList(c6012.m51372(C15559.class));
        if (((C7091) c6012.m51374(C7091.class, 0)) != null) {
            arrayList.add((C7091) c6012.m51374(C7091.class, 0));
        }
        int iMo22514 = 0;
        while (i8 < arrayList.size()) {
            this.f48545.m39762();
            C23289 c232811 = (C23289) arrayList.get(i8);
            i8++;
            int iMo22515 = i8 < arrayList.size() ? ((C23289) arrayList.get(i8)).f75536.mo22511() : list6.size();
            while (true) {
                if (iMo22514 >= iMo22515) {
                    i = 1;
                    break;
                } else {
                    if (m35538((InterfaceC19761) list6.get(iMo22514))) {
                        i = 1;
                        Arrays.fill(this.f48537, c232811.f75536.mo22511(), c232811.f75537.mo22511() + 1, true);
                        break;
                    }
                    iMo22514++;
                }
            }
            iMo22514 = c232811.f75537.mo22511() + i;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m35536(CharSequence charSequence, C16969 c16969) {
        for (int i = 0; i < charSequence.length(); i++) {
            if ((i & 1023) == 0) {
                c16969.m39762();
            }
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\r' || cCharAt == '\n') {
                int i2 = i + 1;
                if (i2 < charSequence.length()) {
                    if (charSequence.charAt(i2) == (cCharAt != '\r' ? '\r' : '\n')) {
                        return cCharAt == '\r' ? "\r\n" : "\n\r";
                    }
                }
                return String.valueOf(cCharAt);
            }
        }
        return "\n";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35539(C18503 c18503) {
        int i;
        String str;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC19761 interfaceC19761 : this.f48547) {
            if (interfaceC19761.getType() != 65 && interfaceC19761.getType() != -1) {
                arrayList.add(interfaceC19761);
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        InterfaceC19761 interfaceC19762 = null;
        int i2 = 0;
        int iMo22510 = 0;
        while (true) {
            int size = arrayList.size();
            C16969 c16969 = this.f48545;
            if (i2 < size) {
                c16969.m39762();
                InterfaceC19761 interfaceC19763 = (InterfaceC19761) arrayList.get(i2);
                int iMo22511 = interfaceC19763.mo22511();
                int type = interfaceC19763.getType();
                int i3 = this.f48538[iMo22511];
                if (type == 31 || type == 48 || type == 46) {
                    arrayDeque.pop();
                }
                int i4 = arrayDeque.isEmpty() ? 0 : ((C11325) arrayDeque.peek()).f38223;
                int i5 = i3 + i4;
                int iMo22508 = interfaceC19763.mo22508();
                CharSequence charSequence = this.f48542;
                if (m35537(iMo22510, iMo22508, charSequence)) {
                    int iMo22509 = interfaceC19763.mo22508();
                    while (iMo22509 > iMo22510) {
                        int i6 = iMo22509 - 1;
                        if (charSequence.charAt(i6) == '\n' || charSequence.charAt(i6) == '\r') {
                            break;
                        } else {
                            iMo22509--;
                        }
                    }
                    i = iMo22509;
                } else {
                    i = -1;
                }
                boolean[] zArr = this.f48537;
                boolean z = zArr[iMo22511] || m35538(interfaceC19763) || (interfaceC19762 != null && (zArr[interfaceC19762.mo22511()] || m35538(interfaceC19762)));
                String str2 = "";
                if (interfaceC19762 == null || interfaceC19762.getType() == 67) {
                    str = str2;
                } else {
                    int type2 = interfaceC19762.getType();
                    int type3 = interfaceC19763.getType();
                    if (m35538(interfaceC19763)) {
                        str2 = EnumC19730.f63352;
                    } else {
                        str = " ";
                        if ((type2 == 28 && type3 == 28) || (type2 == 47 && (type3 == 47 || type3 == 59))) {
                            str2 = " ";
                        } else if (type3 == 15 || type3 == 1 || type3 == 31 || type3 == 48 || type3 == 46 || type3 == 26 || type3 == 38 || type2 == 26 || type2 == 38 || type2 == 30 || type2 == 47 || type2 == 45 || type2 == 22 || type3 == 22 || this.f48549[interfaceC19763.mo22511()] || this.f48546[interfaceC19762.mo22511()]) {
                        }
                    }
                    str = str2;
                }
                boolean[] zArr2 = this.f48540;
                ArrayList arrayList3 = arrayList;
                arrayList2.add(new C20124(interfaceC19763.mo22508(), interfaceC19763.mo22510() + 1, type, i5, i, str, (interfaceC19762 == null || interfaceC19762.getType() == 67 || !zArr2[iMo22511] || z) ? false : true, z, this.f48539[iMo22511] || (interfaceC19762 != null && this.f48544[interfaceC19762.mo22511()]), this.f48543[iMo22511] && !zArr2[iMo22511], this.f48541[iMo22511]));
                if (type == 30 || type == 47 || type == 45) {
                    arrayDeque.push(new C11325(i4 + 1));
                }
                iMo22510 = interfaceC19763.mo22510() + 1;
                i2++;
                interfaceC19762 = interfaceC19763;
                arrayList = arrayList3;
            } else {
                new C0367(this.f48542, arrayList2, this.f48548, this.f48550, this.f48551, c16969, c18503).m2096();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35538(InterfaceC19761 interfaceC19761) {
        return interfaceC19761.getType() == 64 || interfaceC19761.getType() == 66;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35537(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            if ((i & 1023) == 0) {
                C3894.m11326();
            }
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\r' || cCharAt == '\n') {
                return true;
            }
            i++;
        }
        return false;
    }
}
