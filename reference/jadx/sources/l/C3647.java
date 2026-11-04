package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ᩶֫, reason: contains not printable characters */
/* JADX INFO: compiled from: P418 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3647 {

    /* JADX INFO: renamed from: ۜ֫ܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f12475 = {9959, 24907, 24847, 24836, 24851, 24836, 5715, -10595, -10530, -10529, -10553, -10543, -10558, -10530, -10595, -10539, -10530, -10541, -10529, -10540, -10535, -10530, -10537, -10555, -10556, -10538, -10595, -10616, -10595, -10557, -10529, -10555, -10558, -10541, -10539, -10623, -10594, -10616, -10595, -10556, -10543, -10558, -10537, -10539, -10556, -10595, -10542, -10529, -10529, -10556, -10541, -10532, -10543, -10557, -10557, -10560, -10543, -10556, -10536, -10534, -10543, -10554, -10543, -10541, -10593, -10542, -10529, -10529, -10556, -10593, -10541, -10532, -10543, -10557, -10557, -10539, -10557, -10594, -10534, -10543, -10558, -10595, -10539, -10552, -10556, -10540, -10535, -10558, -10557, -10534, -10543, -10554, -10543, -10541, -10593, -10539, -10552, -10556, -10595, -10540, -10595, -10541, -10560, -10594, -10534, -10543, -10558, -10523, -10524, -10506, -10595, -10616, -10593, 1414, 29746, 5668, -15812, -15817, -15840, -15817, -15819, -15751, -15840, -15821, -15836, -15835, -15809, -15815, -15816, -15812, -15817, -15840, -15817, -15819, -15751, -15820, -15815, -15815, -15838, -15812, -15817, -15840, -15817, -15819, -15751, -15821, -15826, -15838, -15819, -15814, -15817, -15835, -15835, -15821, -15835, -15752, -15812, -15817, -15836, -15819, -15814, -15817, -15835, -15835, -15821, -15835, -15752, -15812, -15817, -15836, -15819, -15814, -15817, -15835, -15835, -15821, -15835, -15752, -15822, -15821, -15826, -15751, -15817, -15835, -15835, -15821, -15838, -15835, -15751, -15819, -15815, -15813, -15834, -15809, -15814, -15821, -15863, -15822, -15821, -15826};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized boolean m11818(InterfaceC25004 interfaceC25004) {
        int i;
        int i2;
        boolean z;
        short s = f12475[115];
        int i3 = (s * 21968) - ((s * s) + 120648256) > 0 ? 65506 : 49750;
        synchronized (C3647.class) {
            if (C2375.m8058(interfaceC25004)) {
                return false;
            }
            File file = new File(C21576.m49072(), C2702.m8881(f12475, 116, 13, i3));
            File file2 = new File(C21576.m49072(), C2834.m9343(f12475, 129, 10, i3));
            File file3 = new File(C21576.m49072(), RunnableC0334.m2049(f12475, 139, 9, i3));
            File file4 = new File(file2, C3734.m12149(f12475, 148, 11, i3));
            File file5 = new File(file3, C2023.m6966(f12475, 159, 11, i3));
            if (file.exists() && file.length() == 8) {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    i = fileInputStream.read() | (fileInputStream.read() << 8) | (fileInputStream.read() << 16) | (fileInputStream.read() << 24);
                    i2 = fileInputStream.read() | (fileInputStream.read() << 8) | (fileInputStream.read() << 16) | (fileInputStream.read() << 24);
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        RunnableC3646.m11799(th, th2);
                    }
                    throw th;
                }
            } else {
                i = -1;
                i2 = -1;
            }
            if (6 == i && C11850.m29691(file4)) {
                z = false;
            } else {
                if (!C11850.m29693(C21576.m49093(), C13047.m32485(), file4, interfaceC25004)) {
                    return false;
                }
                z = true;
            }
            if (C11235.m28304(interfaceC25004)) {
                return false;
            }
            if (18 != i2 || !file5.isFile()) {
                C0147.m1307(file3);
                file3.mkdirs();
                File file6 = new File(file3, C13473.m33137(f12475, 170, 11, i3));
                C0147.m1306(file6, C12149.m30355(C1146.m4222(f12475, 181, 19, i3)));
                C5918 c5918M17222 = C5918.m17222(new FileInputStream(file6));
                c5918M17222.m17227();
                c5918M17222.m17224(new FileOutputStream(file5));
                file6.delete();
                z = true;
            }
            if (C11235.m28304(interfaceC25004)) {
                return false;
            }
            if (z) {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(6);
                    fileOutputStream.write(0);
                    fileOutputStream.write(0);
                    fileOutputStream.write(0);
                    fileOutputStream.write(18);
                    fileOutputStream.write(0);
                    fileOutputStream.write(0);
                    fileOutputStream.write(0);
                    C0950.m3797(fileOutputStream);
                } catch (Throwable th3) {
                    try {
                        C4238.m13542(fileOutputStream);
                    } catch (Throwable th4) {
                        RunnableC3646.m11799(th3, th4);
                    }
                    throw th3;
                }
            }
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x01aa A[PHI: r1 r7 r8 r13
      0x01aa: PHI (r1v4 l.۬֡ۘ) = (r1v2 l.۬֡ۘ), (r1v1 l.۬֡ۘ), (r1v1 l.۬֡ۘ) binds: [B:54:0x01a8, B:47:0x0163, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r7v9 java.io.PrintWriter) = (r7v3 java.io.PrintWriter), (r7v2 java.io.PrintWriter), (r7v2 java.io.PrintWriter) binds: [B:54:0x01a8, B:47:0x0163, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r8v5 l.۟᩻ۘ) = (r8v2 l.۟᩻ۘ), (r8v4 l.۟᩻ۘ), (r8v2 l.۟᩻ۘ) binds: [B:54:0x01a8, B:47:0x0163, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x01aa: PHI (r13v7 l.ۘ᩺ۘ) = (r13v6 l.ۘ᩺ۘ), (r13v6 l.ۘ᩺ۘ), (r13v8 l.ۘ᩺ۘ) binds: [B:54:0x01a8, B:47:0x0163, B:8:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19113 m11814(CharSequence charSequence) {
        int iM2761;
        int i;
        int iM3169;
        int i2;
        C4747 c4747 = null;
        C13477 c13477 = null;
        C7312 c7312M20023 = null;
        C23785 c23785 = null;
        int i3 = -2035925554;
        int i4 = C2288.f7433;
        int i5 = RunnableC3055.f9898;
        int iM31610 = (i4 - C0773.m3169("ۢ᩺")) * 79;
        int i6 = ((iM31610 ^ i5) * (-11831)) ^ 2064281620;
        int i7 = iM31610 ^ (-844995556);
        PrintWriter printWriter = null;
        C8234 c8234 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        C4483 c4483M14186 = null;
        int i8 = i7;
        while (true) {
            i3 = i8 ^ ((((i3 ^ i5) * 1615) >> 31) & i6);
            switch (i3) {
                case -1699592681:
                case -228173244:
                    c4747 = new C4747();
                    if (C1343.f4799 == 0) {
                        iM2761 = C0773.m3169("ۤᩳ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-4681)) ^ (-420123546);
                        i = -1781913325;
                        i8 = iM2761 ^ i;
                    } else {
                        int iM31611 = (i5 - C0773.m3169("ۧۘ")) * 7;
                        i6 = 746218326 ^ ((iM31611 ^ i4) * (-11011));
                        i8 = iM31611 ^ (-64210731);
                        c8234 = null;
                    }
                    break;
                case -1696038352:
                case 321707966:
                    AbstractC0116.m1243();
                    if (C2834.m9344() >= 0) {
                        int iM31612 = C0773.m3169("ۢܶ") ^ i4;
                        i6 = (-908006189) ^ ((iM31612 ^ i5) * 29633);
                        i8 = iM31612 ^ (-1319241969);
                        printWriter = null;
                    } else {
                        iM3169 = (i5 - C0773.m3169("ܽܳ")) * 75;
                        i6 = 1569237305 ^ ((iM3169 ^ i4) * (-27193));
                        i2 = -160095509;
                        i8 = iM3169 ^ i2;
                    }
                    break;
                case -1619405386:
                case -296803332:
                    c7312M20023.m34530(c23785);
                    if (AbstractC3624.m11755() == 0) {
                        iM3169 = C0773.m3169("ܺۙ") ^ i5;
                        i6 = 656405379 ^ ((iM3169 ^ i4) * (-28605));
                        i2 = 369604835;
                        i8 = iM3169 ^ i2;
                    } else {
                        iM2761 = C0773.m3169("ܺᩴ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 20593) ^ 1854747096;
                        i = 1147766418;
                        i8 = iM2761 ^ i;
                    }
                    break;
                case -1489447088:
                case 563189083:
                    z2 = true;
                    z3 = false;
                    z = false;
                    if (C1783.f6087 > 0) {
                        iM3169 = (C0773.m3169("ۧ֫") ^ i5) * (-87);
                        i6 = 1553116404 ^ ((iM3169 ^ i4) * 19501);
                        i2 = -1508928774;
                        i8 = iM3169 ^ i2;
                    } else {
                        iM2761 = C0773.m3169("ܺᩴ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 20593) ^ 1854747096;
                        i = 1147766418;
                        i8 = iM2761 ^ i;
                    }
                    break;
                case -1345201751:
                case -65295944:
                    c4747.m14646(C7312.f24067, c7312M20023);
                    c4483M14186 = C4483.m14186(c4747);
                    if (C3734.m12152() < 0) {
                        iM3169 = (C0773.m3169("᩷֡") + i4) * (-65);
                        i6 = 1939299082 ^ ((iM3169 ^ i5) * 9717);
                        i2 = 700699010;
                        i8 = iM3169 ^ i2;
                    } else {
                        iM2761 = C0619.m2761("֨ۖ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-24705)) ^ (-265113872);
                        i = -1990802771;
                        i8 = iM2761 ^ i;
                    }
                    break;
                case -1308359459:
                case -140968383:
                    c13477 = C7312.f24066;
                    if (C2702.f8586 > 0) {
                        printWriter = new PrintWriter(new C16325());
                        if (RunnableC0334.m2063()) {
                            iM2761 = C0619.m2761("֨ۖ") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-24705)) ^ (-265113872);
                            i = -1990802771;
                        } else {
                            iM2761 = C0619.m2761("᩸ᩴ") ^ i5;
                            i6 = ((iM2761 ^ i4) * 18379) ^ (-1578915595);
                            i = 135336770;
                        }
                        i8 = iM2761 ^ i;
                    } else {
                        int iM31613 = C0773.m3169("ۢܶ") ^ i4;
                        i6 = (-908006189) ^ ((iM31613 ^ i5) * 29633);
                        i8 = iM31613 ^ (-1319241969);
                        printWriter = null;
                    }
                    break;
                case -1237865116:
                case 355236436:
                    c7312M20023 = C7312.m20023(c4747);
                    c23785 = new C23785(charSequence);
                    if (C1519.f5300 < 0) {
                        iM2761 = C0773.m3169("᩶᩹") ^ i4;
                        i6 = ((iM2761 ^ i5) * 2175) ^ 2051328172;
                        i = -1944171934;
                        i8 = iM2761 ^ i;
                    } else {
                        int iM31614 = C0773.m3169("ۢܶ") ^ i4;
                        i6 = (-908006189) ^ ((iM31614 ^ i5) * 29633);
                        i8 = iM31614 ^ (-1319241969);
                        printWriter = null;
                    }
                    break;
                case -927843048:
                case -753988410:
                    C17202.m40372();
                    C17202.m40372();
                    iM3169 = (i5 - C0773.m3169("ܽܳ")) * 75;
                    i6 = 1569237305 ^ ((iM3169 ^ i4) * (-27193));
                    i2 = -160095509;
                    i8 = iM3169 ^ i2;
                    break;
                case -698182694:
                case 2121720023:
                    return c4483M14186.m14187(charSequence, z, true, z2, z3).m53297();
                case -544888680:
                case -502355398:
                    c4747.m14646(c13477, printWriter);
                    int i9 = C2026.f6742;
                    if (C1826.f6190 > 0) {
                        c8234 = new C8234();
                        if (C1826.f6190 <= 0) {
                            iM2761 = C0619.m2761("֨ۖ") ^ i4;
                            i6 = ((iM2761 ^ i5) * (-24705)) ^ (-265113872);
                            i = -1990802771;
                        } else {
                            iM2761 = C0619.m2761("ۛᩴ") ^ i4;
                            i6 = ((iM2761 ^ i5) * 23623) ^ (-181887119);
                            i = -1745513411;
                        }
                        i8 = iM2761 ^ i;
                    } else {
                        int iM31615 = (i5 - C0773.m3169("ۧۘ")) * 7;
                        i6 = 746218326 ^ ((iM31615 ^ i4) * (-11011));
                        i8 = iM31615 ^ (-64210731);
                        c8234 = null;
                    }
                    break;
                case -352037922:
                case -220757849:
                    if (C0773.f2792 > 0) {
                        int iM31616 = (i5 - C0773.m3169("ۧۘ")) * 7;
                        i6 = 746218326 ^ ((iM31616 ^ i4) * (-11011));
                        i8 = iM31616 ^ (-64210731);
                        c8234 = null;
                    } else {
                        iM3169 = (i5 - C0773.m3169("ܽܳ")) * 75;
                        i6 = 1569237305 ^ ((iM3169 ^ i4) * (-27193));
                        i2 = -160095509;
                        i8 = iM3169 ^ i2;
                    }
                    break;
                case -326535160:
                case -173580903:
                    c4747.m14645(InterfaceC16722.class, (InterfaceC6766) c8234);
                    if (C0487.m2356() >= 0) {
                        iM2761 = C0773.m3169("ܺᩴ") ^ i4;
                        i6 = ((iM2761 ^ i5) * 20593) ^ 1854747096;
                        i = 1147766418;
                    } else {
                        iM2761 = C0773.m3169("᩷᩹") ^ i5;
                        i6 = ((iM2761 ^ i4) * 4577) ^ 1352805355;
                        i = 1546130434;
                    }
                    i8 = iM2761 ^ i;
                    break;
                case 1212276985:
                case 1615693905:
                    C17202.m40372();
                    return null;
                default:
                    if (C23916.f77426 > 0) {
                        iM2761 = C0619.m2761("֨ۖ") ^ i4;
                        i6 = ((iM2761 ^ i5) * (-24705)) ^ (-265113872);
                        i = -1990802771;
                        i8 = iM2761 ^ i;
                    } else {
                        int iM31617 = C0773.m3169("ۢܶ") ^ i4;
                        i6 = (-908006189) ^ ((iM31617 ^ i5) * 29633);
                        i8 = iM31617 ^ (-1319241969);
                        printWriter = null;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e9, code lost:
    
        if (l.C1080.f3865 >= 0) goto L18;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m11816(l.AbstractC22044 r39, l.AbstractC22044 r40, l.AbstractC22044 r41, l.AbstractC22044 r42) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3647.m11816(l.᩷ۨᩴ, l.᩷ۨᩴ, l.᩷ۨᩴ, l.᩷ۨᩴ):void");
    }

    /* JADX WARN: Code duplicated, block: B:63:0x021b A[PHI: r6 r7 r12
      0x021b: PHI (r6v3 short) = (r6v2 short), (r6v1 short) binds: [B:62:0x0219, B:24:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r7v3 int) = (r7v2 int), (r7v1 int) binds: [B:62:0x0219, B:24:0x0096] A[DONT_GENERATE, DONT_INLINE]
      0x021b: PHI (r12v2 int) = (r12v1 int), (r12v3 int) binds: [B:62:0x0219, B:24:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x024f A[PHI: r5 r9 r11
      0x024f: PHI (r5v3 char) = (r5v2 char), (r5v1 char), (r5v1 char), (r5v1 char) binds: [B:66:0x024d, B:54:0x01d9, B:28:0x00b3, B:7:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r9v3 short) = (r9v1 short), (r9v2 short), (r9v1 short), (r9v1 short) binds: [B:66:0x024d, B:54:0x01d9, B:28:0x00b3, B:7:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r11v3 short[]) = (r11v1 short[]), (r11v1 short[]), (r11v2 short[]), (r11v1 short[]) binds: [B:66:0x024d, B:54:0x01d9, B:28:0x00b3, B:7:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0285 A[PHI: r4
      0x0285: PHI (r4v3 short[]) = (r4v2 short[]), (r4v1 short[]), (r4v1 short[]), (r4v1 short[]) binds: [B:70:0x0283, B:15:0x0055, B:13:0x0051, B:7:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x02b4 A[PHI: r3 r8
      0x02b4: PHI (r3v3 java.lang.String) = 
      (r3v1 java.lang.String)
      (r3v1 java.lang.String)
      (r3v2 java.lang.String)
      (r3v1 java.lang.String)
      (r3v1 java.lang.String)
     binds: [B:74:0x02b2, B:58:0x01fa, B:32:0x00d8, B:13:0x0051, B:10:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x02b4: PHI (r8v3 int) = (r8v1 int), (r8v2 int), (r8v1 int), (r8v1 int), (r8v1 int) binds: [B:74:0x02b2, B:58:0x01fa, B:32:0x00d8, B:13:0x0051, B:10:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x02e4  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11815(AbstractC22044 abstractC22044, ArrayList arrayList) {
        int iM2761;
        int i;
        AbstractC22044 abstractC22045 = null;
        String strM5463 = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i2 = 0;
        int i3 = 0;
        short s2 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = 416721847;
        int i7 = RunnableC3055.f9898;
        int i8 = C2375.f7641;
        int iM2762 = (C0619.m2761("ۛۧ") ^ i8) * (-41);
        int i9 = ((iM2762 ^ i7) * 28259) ^ 886705777;
        int i10 = iM2762 ^ (-906121846);
        Iterator itM53423 = null;
        while (true) {
            i6 = i10 ^ (i9 & (((i6 ^ i7) * (-21081)) >> 31));
            switch (i6) {
                case -2120681431:
                case -1376485043:
                    if (C3099.f10023 <= 0) {
                        iM2761 = (i8 - C0773.m3169("۫᩻")) * (-81);
                        i9 = ((iM2761 ^ i7) * 11045) ^ 183125533;
                        i = -943645326;
                    } else {
                        iM2761 = (C0619.m2761("ۨ֫") + i8) * (-99);
                        i9 = ((iM2761 ^ i7) * (-28317)) ^ (-452463029);
                        i = -586147626;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case -1747127586:
                case -734767850:
                    c = 0;
                    if (C1146.f4234 >= 0) {
                        iM2761 = (i7 - C0619.m2761("ۛᩳ")) * (-49);
                        i9 = ((iM2761 ^ i8) * 27955) ^ (-995443061);
                        i = 785340699;
                    } else {
                        iM2761 = (i8 - C0773.m3169("ܺ۟")) * (-97);
                        i9 = ((iM2761 ^ i7) * (-24505)) ^ 1511690980;
                        i = 1381681491;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case -1608306547:
                case -102601691:
                    C1542.m5459();
                    if (C1783.f6087 > 0) {
                        iM2761 = C0619.m2761("ᩳۖ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 23879) ^ (-100422170);
                        i = 423396722;
                    } else {
                        iM2761 = (i7 - C0619.m2761("ۛᩳ")) * (-49);
                        i9 = ((iM2761 ^ i8) * 27955) ^ (-995443061);
                        i = 785340699;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case -1560158424:
                case 415654304:
                    if (C3077.m10035(strM5463, C3492.m11486(sArr2, i5, 5, i4))) {
                        int iM3169 = (i8 - C0773.m3169("֨֨")) * (-31);
                        i10 = iM3169 ^ (-11060107);
                        i9 = ((iM3169 ^ i7) * (-31811)) ^ (-626569534);
                    } else {
                        iM2761 = (C0773.m3169("۟ۢ") + i8) * (-85);
                        i9 = ((iM2761 ^ i7) * 6727) ^ (-42143647);
                        i = -1753290979;
                        i10 = iM2761 ^ i;
                    }
                    break;
                case -1498327447:
                case 922790552:
                    if (C1826.m6317(itM53423)) {
                        iM2761 = C0619.m2761("ۙۡ") ^ i7;
                        i9 = ((iM2761 ^ i8) * (-20523)) ^ 802438826;
                        i = -1692424057;
                    } else {
                        iM2761 = (C0773.m3169("᩸ᩴ") + i7) * 9;
                        i9 = ((iM2761 ^ i8) * (-16465)) ^ (-743348212);
                        i = -181175806;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case -1406861857:
                case -781475300:
                    sArr2 = f12475;
                    if (C11235.f35427 >= 0) {
                        iM2761 = (i7 - C0619.m2761("ۛᩳ")) * (-49);
                        i9 = ((iM2761 ^ i8) * 27955) ^ (-995443061);
                        i = 785340699;
                    } else {
                        iM2761 = (C0619.m2761("۬ۚ") + i7) * (-31);
                        i9 = ((iM2761 ^ i8) * (-10131)) ^ 1861441483;
                        i = -2112745022;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case -1394676074:
                case 995148932:
                    i3 = i2 + 142826401;
                    if (C23916.f77426 <= 0) {
                        iM2761 = (C0773.m3169("ۛ۠") + i7) * 123;
                        i9 = ((iM2761 ^ i8) * 23139) ^ 765737542;
                        i = 850319886;
                    } else {
                        iM2761 = C0773.m3169("ۚ۠") ^ i7;
                        i9 = ((iM2761 ^ i8) * 7141) ^ 1903767324;
                        i = -1594979679;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case -1239322312:
                case 1257416291:
                    s2 = 23902;
                    if (C3448.m11248() != 0) {
                        iM2761 = (i7 - C0619.m2761("ۛᩳ")) * (-49);
                        i9 = ((iM2761 ^ i8) * 27955) ^ (-995443061);
                        i = 785340699;
                    } else {
                        iM2761 = (C0619.m2761("ۡܿ") + i7) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i9 = ((iM2761 ^ i8) * (-4293)) ^ (-1268793263);
                        i = -1261651437;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case -1114604077:
                case -87077049:
                    i4 = 24933;
                    iM2761 = (C0773.m3169("ۚۤ") ^ i7) * 41;
                    i9 = ((iM2761 ^ i8) * (-20383)) ^ (-1349585295);
                    i = -1655465597;
                    i10 = iM2761 ^ i;
                    break;
                case -1038197547:
                case 1310011079:
                    C1519.m5403();
                    if (C0950.f3488 >= 0) {
                        iM2761 = C0619.m2761("ᩳۖ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 23879) ^ (-100422170);
                        i = 423396722;
                    } else {
                        iM2761 = (C0773.m3169("ۛ۠") + i7) * 123;
                        i9 = ((iM2761 ^ i8) * 23139) ^ 765737542;
                        i = 850319886;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case -837746558:
                case 1754942393:
                    break;
                case -569494127:
                case 2083317898:
                    i4 = 25283;
                    iM2761 = (C0773.m3169("ۚۤ") ^ i7) * 41;
                    i9 = ((iM2761 ^ i8) * (-20383)) ^ (-1349585295);
                    i = -1655465597;
                    i10 = iM2761 ^ i;
                    break;
                case -472861315:
                case -276367317:
                    itM53423 = C23916.m53423(abstractC22044.mo4299(true));
                    iM2761 = (C0773.m3169("۟ۢ") + i8) * (-85);
                    i9 = ((iM2761 ^ i7) * 6727) ^ (-42143647);
                    i = -1753290979;
                    i10 = iM2761 ^ i;
                    break;
                case -447297025:
                case -359382837:
                    strM5463 = C1542.m5463(C1826.m6311(abstractC22045));
                    if (C2287.f7432 >= 0) {
                        iM2761 = (C0773.m3169("ۛ۠") + i7) * 123;
                        i9 = ((iM2761 ^ i8) * 23139) ^ 765737542;
                        i = 850319886;
                    } else {
                        iM2761 = (C0773.m3169("ۨۢ") + i8) * 71;
                        i9 = ((iM2761 ^ i7) * 19251) ^ 1159884432;
                        i = -1198271239;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case -363072577:
                case 696096387:
                    s = sArr[c];
                    i2 = s * s;
                    if (C3998.f13671 != 0) {
                        iM2761 = (C0773.m3169("ۤ֡") + i8) * 5;
                        i9 = ((iM2761 ^ i7) * 31807) ^ (-1970004514);
                        i = -394387965;
                    } else {
                        iM2761 = (i8 - C0773.m3169("ۚܺ")) * 17;
                        i9 = ((iM2761 ^ i7) * 25193) ^ (-1919115737);
                        i = -102137107;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case -215791563:
                case 1277928417:
                    AbstractC0641.m2813();
                    C20932.m47848();
                    break;
                case -68786233:
                case 645319724:
                    C1519.m5406(arrayList, RunnableC3646.m11806(abstractC22045));
                    iM2761 = (C0773.m3169("۟ۢ") + i8) * (-85);
                    i9 = ((iM2761 ^ i7) * 6727) ^ (-42143647);
                    i = -1753290979;
                    i10 = iM2761 ^ i;
                    break;
                case 123019745:
                case 908220109:
                    if ((s * s2) - i3 > 0) {
                        iM2761 = C0773.m3169("᩷᩻") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-18709)) ^ 1181349608;
                        i = 150024727;
                    } else {
                        iM2761 = (i8 - C0773.m3169("ۤ۠")) * (-57);
                        i9 = ((iM2761 ^ i7) * 31501) ^ (-653149961);
                        i = 1194489208;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case 277315610:
                case 539731593:
                    if (C2288.f7433 <= 0) {
                        iM2761 = (C0773.m3169("ۛ۠") + i7) * 123;
                        i9 = ((iM2761 ^ i8) * 23139) ^ 765737542;
                        i = 850319886;
                    } else {
                        iM2761 = (C0773.m3169("ۖ᩵") + i7) * 13;
                        i9 = ((iM2761 ^ i8) * (-17895)) ^ 1325433691;
                        i = -1423224379;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case 462774999:
                case 1219493186:
                    sArr = f12475;
                    if (C3033.f9831 >= 0) {
                        iM2761 = C0619.m2761("ᩳۖ") ^ i7;
                        i9 = ((iM2761 ^ i8) * 23879) ^ (-100422170);
                        i = 423396722;
                    } else {
                        iM2761 = (C0619.m2761("ۜ۠") ^ i7) * 67;
                        i9 = ((iM2761 ^ i8) * (-6709)) ^ (-411833541);
                        i = -763136290;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case 475421171:
                case 510460975:
                    if (C3033.f9831 >= 0) {
                        iM2761 = (C0773.m3169("ۛ۠") + i7) * 123;
                        i9 = ((iM2761 ^ i8) * 23139) ^ 765737542;
                        i = 850319886;
                    } else {
                        iM2761 = (i8 - C0773.m3169("۫᩻")) * (-81);
                        i9 = ((iM2761 ^ i7) * 11045) ^ 183125533;
                        i = -943645326;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case 611395440:
                case 1405937876:
                    i5 = 1;
                    if (C23916.f77426 <= 0) {
                        iM2761 = (C0773.m3169("ۤ֡") + i8) * 5;
                        i9 = ((iM2761 ^ i7) * 31807) ^ (-1970004514);
                        i = -394387965;
                    } else {
                        iM2761 = C0619.m2761("᩷ᩴ") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-32697)) ^ (-893108888);
                        i = -673446516;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case 627039928:
                case 1896055851:
                    abstractC22045 = (AbstractC22044) C4238.m13529(itM53423);
                    if (C2878.m9481(abstractC22045)) {
                        iM2761 = C0619.m2761("᩶᩸") ^ i7;
                        i9 = ((iM2761 ^ i8) * 12677) ^ 1965502996;
                        i = -1099099064;
                    } else {
                        iM2761 = C0619.m2761("ܳ۠") ^ i8;
                        i9 = ((iM2761 ^ i7) * (-623)) ^ (-1419868732);
                        i = -1639304513;
                    }
                    i10 = iM2761 ^ i;
                    break;
                case 1325043709:
                case 1995303397:
                    C2354.m7983();
                    iM2761 = C0619.m2761("ᩳۖ") ^ i7;
                    i9 = ((iM2761 ^ i8) * 23879) ^ (-100422170);
                    i = 423396722;
                    i10 = iM2761 ^ i;
                    break;
                default:
                    m11815(abstractC22045, arrayList);
                    iM2761 = (C0773.m3169("۟ۢ") + i8) * (-85);
                    i9 = ((iM2761 ^ i7) * 6727) ^ (-42143647);
                    i = -1753290979;
                    i10 = iM2761 ^ i;
                    break;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0329 A[PHI: r6 r7 r17 r19
      0x0329: PHI (r6v2 short) = (r6v1 short), (r6v3 short) binds: [B:80:0x0327, B:72:0x02d7] A[DONT_GENERATE, DONT_INLINE]
      0x0329: PHI (r7v2 short) = (r7v1 short), (r7v3 short) binds: [B:80:0x0327, B:72:0x02d7] A[DONT_GENERATE, DONT_INLINE]
      0x0329: PHI (r17v17 java.lang.String) = (r17v15 java.lang.String), (r17v18 java.lang.String) binds: [B:80:0x0327, B:72:0x02d7] A[DONT_GENERATE, DONT_INLINE]
      0x0329: PHI (r19v9 java.lang.StringBuilder) = (r19v7 java.lang.StringBuilder), (r19v10 java.lang.StringBuilder) binds: [B:80:0x0327, B:72:0x02d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11817(AbstractC22044 abstractC22044, C25179 c25179, String str) throws IOException {
        int iM2761;
        int i;
        int iM3169;
        int i2;
        int i3;
        int i4;
        int iM2762;
        int i5;
        int i6;
        C25179 c251710 = c25179;
        StringBuilder sbM27333 = null;
        String strM6952 = null;
        Iterator itM53423 = null;
        short s = 0;
        short s2 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short[] sArr = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 453906693;
        int i13 = C2702.f8586;
        int i14 = C23916.f77426;
        int iM31610 = (C0773.m3169("ۢۧ") + i14) * 81;
        int i15 = ((iM31610 ^ i13) * (-29867)) ^ 467665529;
        int i16 = iM31610 ^ 671673539;
        short[] sArr2 = null;
        C8002 c8002 = null;
        while (true) {
            i12 = i16 ^ (i15 & (((i12 ^ i13) * (-1549)) >> 31));
            switch (i12) {
                case -2095279584:
                case -865937006:
                    RunnableC1848.m6360();
                    if (C1519.f5300 < 0) {
                        sbM27333 = sbM27333;
                        strM6952 = strM6952;
                        iM2761 = C0773.m3169("ۘᩳ") ^ i14;
                        i15 = ((iM2761 ^ i13) * (-29365)) ^ 1392300104;
                        i = 497512648;
                        int i17 = iM2761 ^ i;
                        strM6952 = strM6952;
                        sbM27333 = sbM27333;
                        i16 = i17;
                    } else {
                        int iM31611 = (C0773.m3169("ᩴۧ") + i13) * 109;
                        i16 = iM31611 ^ 1721055892;
                        i15 = ((iM31611 ^ i14) * (-6969)) ^ (-188669806);
                    }
                    c251710 = c25179;
                    break;
                case -2049775201:
                case 879143199:
                    m11817((AbstractC22044) C0950.m3796(itM53423), c251710, strM6952);
                    iM2762 = C0619.m2761("᩵ۗ") ^ i14;
                    i5 = ((iM2762 ^ i13) * (-15879)) ^ (-640688363);
                    i6 = 1920409659;
                    String str2 = strM6952;
                    i16 = iM2762 ^ i6;
                    i15 = i5;
                    strM6952 = str2;
                    break;
                case -1975793528:
                case 1732895986:
                    sbM27333 = sbM27333;
                    strM6952 = strM6952;
                    if (C1080.f3865 >= 0) {
                        iM2761 = (C0773.m3169("᩺ܰ") ^ i14) * (-115);
                        i15 = ((iM2761 ^ i13) * (-4153)) ^ 305656440;
                        i = -224451256;
                    } else {
                        iM2761 = C0773.m3169("۟ܽ") ^ i13;
                        i15 = ((iM2761 ^ i14) * 16813) ^ (-1017488387);
                        i = -1086227284;
                    }
                    int i18 = iM2761 ^ i;
                    strM6952 = strM6952;
                    sbM27333 = sbM27333;
                    i16 = i18;
                    c251710 = c25179;
                    break;
                case -1924314175:
                case -1768842960:
                    sbM27333 = sbM27333;
                    strM6952 = strM6952;
                    s = sArr2[113];
                    s2 = 1;
                    if (C2878.f9462) {
                        iM2761 = (C0773.m3169("᩺ܰ") ^ i14) * (-115);
                        i15 = ((iM2761 ^ i13) * (-4153)) ^ 305656440;
                        i = -224451256;
                    } else {
                        iM2761 = C0773.m3169("ۢܽ") ^ i13;
                        i15 = ((iM2761 ^ i14) * 23667) ^ (-1855849104);
                        i = -2057355746;
                    }
                    int i19 = iM2761 ^ i;
                    strM6952 = strM6952;
                    sbM27333 = sbM27333;
                    i16 = i19;
                    c251710 = c25179;
                    break;
                case -1854092326:
                case -697038426:
                    i9 = 45248;
                    iM2761 = (C0773.m3169("֨۫") + i13) * (-27);
                    i15 = ((iM2761 ^ i14) * (-4147)) ^ 1072148434;
                    i = 1007804902;
                    int i110 = iM2761 ^ i;
                    strM6952 = strM6952;
                    sbM27333 = sbM27333;
                    i16 = i110;
                    c251710 = c25179;
                    break;
                case -1675704940:
                case 1754194763:
                    itM53423 = C23916.m53423(abstractC22044.mo4299(true));
                    iM2762 = C0619.m2761("᩵ۗ") ^ i14;
                    i5 = ((iM2762 ^ i13) * (-15879)) ^ (-640688363);
                    i6 = 1920409659;
                    String str3 = strM6952;
                    i16 = iM2762 ^ i6;
                    i15 = i5;
                    strM6952 = str3;
                    break;
                case -1499546873:
                case 132318916:
                    sbM27333 = sbM27333;
                    strM6952 = strM6952;
                    c8002.setTime(0L);
                    c251710.m56125(c8002);
                    if (C13473.f42873 == 0) {
                        iM3169 = (C0773.m3169("ܽۢ") + i13) * (-61);
                        i2 = ((iM3169 ^ i14) * 31783) ^ (-832371497);
                        i3 = -910712106;
                        i4 = iM3169 ^ i3;
                        strM6952 = strM6952;
                        i16 = i4;
                        i15 = i2;
                        sbM27333 = sbM27333;
                    } else {
                        strM6952 = strM6952;
                        sbM27333 = sbM27333;
                        int iM31612 = (C0773.m3169("ᩴۧ") + i13) * 109;
                        i16 = iM31612 ^ 1721055892;
                        i15 = ((iM31612 ^ i14) * (-6969)) ^ (-188669806);
                        c251710 = c25179;
                    }
                    break;
                case -1381561146:
                case 1613477885:
                    sbM27333 = sbM27333;
                    strM6952 = strM6952;
                    if (C1564.m5506(abstractC22044)) {
                        iM2761 = C0773.m3169("ۘۚ") ^ i14;
                        i15 = ((iM2761 ^ i13) * 31627) ^ 90493426;
                        i = -106432954;
                    } else {
                        iM2761 = (C0619.m2761("ᩴܰ") + i14) * 11;
                        i15 = ((iM2761 ^ i13) * (-21861)) ^ (-331605824);
                        i = -1212166742;
                    }
                    int i111 = iM2761 ^ i;
                    strM6952 = strM6952;
                    sbM27333 = sbM27333;
                    i16 = i111;
                    c251710 = c25179;
                    break;
                case -1125558542:
                case 811069100:
                    sbM27333 = sbM27333;
                    strM6952 = strM6952;
                    StringBuilder sbM27334 = C10732.m27333(str);
                    C3779.m12258(sbM27334, C1826.m6311(abstractC22044));
                    if (C1343.f4799 == 0) {
                        c8002 = new C8002(C2023.m6952(sbM27334));
                        if (C3077.f9998) {
                            iM2761 = (i14 - C0619.m2761("֡ۘ")) * 115;
                            i15 = ((iM2761 ^ i13) * (-28201)) ^ (-1581969500);
                            i = -715936438;
                            int i112 = iM2761 ^ i;
                            strM6952 = strM6952;
                            sbM27333 = sbM27333;
                            i16 = i112;
                            c251710 = c25179;
                        }
                        strM6952 = strM6952;
                        sbM27333 = sbM27333;
                        int iM31613 = (C0773.m3169("ᩴۧ") + i13) * 109;
                        i16 = iM31613 ^ 1721055892;
                        i15 = ((iM31613 ^ i14) * (-6969)) ^ (-188669806);
                        c251710 = c25179;
                    } else {
                        int iM31614 = (C0773.m3169("ۙۚ") + i13) * 33;
                        i2 = ((iM31614 ^ i14) * (-2823)) ^ 74344682;
                        i4 = iM31614 ^ 138930925;
                        strM6952 = strM6952;
                        c8002 = null;
                        i16 = i4;
                        i15 = i2;
                        sbM27333 = sbM27333;
                    }
                    break;
                case -1018921262:
                case -518832744:
                    strM6952 = strM6952;
                    sbM27333 = C10732.m27333(str);
                    C1783.m6234(sbM27333, C1826.m6311(abstractC22044));
                    sArr = f12475;
                    if (AbstractC0116.f1064 > 0) {
                        iM2762 = C0619.m2761("ܺۘ") ^ i13;
                        i5 = ((iM2762 ^ i14) * 7337) ^ 1300248043;
                        i6 = 1497554843;
                        String str4 = strM6952;
                        i16 = iM2762 ^ i6;
                        i15 = i5;
                        strM6952 = str4;
                    } else {
                        strM6952 = strM6952;
                        int iM31615 = (C0773.m3169("ᩴۧ") + i13) * 109;
                        i16 = iM31615 ^ 1721055892;
                        i15 = ((iM31615 ^ i14) * (-6969)) ^ (-188669806);
                        c251710 = c25179;
                    }
                    break;
                case -1017955052:
                case -866727008:
                    break;
                case -969477550:
                case 1217874095:
                    if (C3998.m12923(itM53423)) {
                        iM2762 = C0773.m3169("ܳ᩸") ^ i14;
                        strM6952 = strM6952;
                        i5 = ((iM2762 ^ i13) * (-11073)) ^ (-1616115407);
                        i6 = -1087290452;
                    } else {
                        strM6952 = strM6952;
                        iM2762 = C0773.m3169("ۙ᩶") ^ i13;
                        i5 = ((iM2762 ^ i14) * (-13295)) ^ (-335958349);
                        i6 = -2076654943;
                    }
                    String str5 = strM6952;
                    i16 = iM2762 ^ i6;
                    i15 = i5;
                    strM6952 = str5;
                    break;
                case -852425415:
                case 460676042:
                    sbM27333 = sbM27333;
                    strM6952 = strM6952;
                    int i20 = s + s2;
                    i7 = i20 * i20;
                    i8 = s * 2;
                    if (RunnableC0334.f1808 <= 0) {
                        iM2761 = C0773.m3169("ۧۘ") ^ i13;
                        i15 = ((iM2761 ^ i14) * (-32573)) ^ (-1035518845);
                        i = -881678003;
                    } else {
                        iM2761 = (i14 - C0619.m2761("۬۠")) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        i15 = ((iM2761 ^ i13) * 25105) ^ 1089597239;
                        i = -1656807779;
                    }
                    int i113 = iM2761 ^ i;
                    strM6952 = strM6952;
                    sbM27333 = sbM27333;
                    i16 = i113;
                    c251710 = c25179;
                    break;
                case -232245880:
                case 1150755662:
                    C1783.m6234(sbM27333, RunnableC3646.m11809(sArr, i10, i11, i9));
                    strM6952 = C2023.m6952(sbM27333);
                    if (AbstractC0116.m1243() == 0) {
                        int iM2763 = (C0619.m2761("ܿۗ") + i14) * (-109);
                        sbM27333 = sbM27333;
                        i2 = ((iM2763 ^ i13) * 8627) ^ (-2015244387);
                        i16 = iM2763 ^ (-2074331071);
                        i15 = i2;
                        sbM27333 = sbM27333;
                    } else {
                        int iM31616 = (C0773.m3169("ᩴۧ") + i13) * 109;
                        i16 = iM31616 ^ 1721055892;
                        i15 = ((iM31616 ^ i14) * (-6969)) ^ (-188669806);
                        c251710 = c25179;
                    }
                    break;
                case -229434575:
                case 1961627157:
                    c251710.m56123(C4282.m13655(abstractC22044));
                    c25179.m56134();
                    break;
                case -147896530:
                case 1686730071:
                    sbM27333 = sbM27333;
                    strM6952 = strM6952;
                    sArr2 = f12475;
                    if (C20932.m47848() != 0) {
                        iM2761 = C0773.m3169("ۘᩳ") ^ i14;
                        i15 = ((iM2761 ^ i13) * (-29365)) ^ 1392300104;
                        i = 497512648;
                    } else {
                        iM2761 = C0773.m3169("ܰۘ") ^ i14;
                        i15 = ((iM2761 ^ i13) * (-11987)) ^ 725395243;
                        i = -1401802994;
                    }
                    int i114 = iM2761 ^ i;
                    strM6952 = strM6952;
                    sbM27333 = sbM27333;
                    i16 = i114;
                    c251710 = c25179;
                    break;
                case -65417418:
                case 1211549839:
                    sbM27333 = sbM27333;
                    strM6952 = strM6952;
                    if (i7 - (i8 + 1) >= 0) {
                        iM2761 = C0619.m2761("ۤ᩵") ^ i14;
                        i15 = ((iM2761 ^ i13) * (-11471)) ^ 349235564;
                        i = 475776308;
                    } else {
                        iM2761 = C0619.m2761("ۙۨ") ^ i13;
                        i15 = ((iM2761 ^ i14) * (-29875)) ^ (-1748641283);
                        i = -1642449611;
                    }
                    int i115 = iM2761 ^ i;
                    strM6952 = strM6952;
                    sbM27333 = sbM27333;
                    i16 = i115;
                    c251710 = c25179;
                    break;
                case 288153337:
                case 1223858182:
                    sbM27333 = sbM27333;
                    strM6952 = strM6952;
                    i10 = 114;
                    i11 = 1;
                    if (C3779.f12953 > 0) {
                        iM3169 = C0619.m2761("ۧ᩻") ^ i13;
                        i2 = ((iM3169 ^ i14) * (-25733)) ^ (-77998612);
                        i3 = 217658502;
                        i4 = iM3169 ^ i3;
                        strM6952 = strM6952;
                        i16 = i4;
                        i15 = i2;
                        sbM27333 = sbM27333;
                    } else {
                        iM2761 = C0773.m3169("ۧۘ") ^ i13;
                        i15 = ((iM2761 ^ i14) * (-32573)) ^ (-1035518845);
                        i = -881678003;
                        int i116 = iM2761 ^ i;
                        strM6952 = strM6952;
                        sbM27333 = sbM27333;
                        i16 = i116;
                        c251710 = c25179;
                    }
                    break;
                case 649619123:
                case 711147412:
                    i9 = 29725;
                    iM2761 = (C0773.m3169("֨۫") + i13) * (-27);
                    i15 = ((iM2761 ^ i14) * (-4147)) ^ 1072148434;
                    i = 1007804902;
                    int i117 = iM2761 ^ i;
                    strM6952 = strM6952;
                    sbM27333 = sbM27333;
                    i16 = i117;
                    c251710 = c25179;
                    break;
                case 658820549:
                case 2048136022:
                    C0269.m1775();
                    sbM27333 = sbM27333;
                    strM6952 = strM6952;
                    int iM31617 = (C0773.m3169("ۙۚ") + i13) * 33;
                    i2 = ((iM31617 ^ i14) * (-2823)) ^ 74344682;
                    i4 = iM31617 ^ 138930925;
                    strM6952 = strM6952;
                    c8002 = null;
                    i16 = i4;
                    i15 = i2;
                    sbM27333 = sbM27333;
                    break;
                case 1368807913:
                case 1580201104:
                    C3448.m11248();
                    break;
                case 1618117460:
                case 2142124456:
                    C3448.m11248();
                    if (RunnableC3055.f9898 < 0) {
                        sbM27333 = sbM27333;
                        strM6952 = strM6952;
                        iM2761 = C0773.m3169("ۧۘ") ^ i13;
                        i15 = ((iM2761 ^ i14) * (-32573)) ^ (-1035518845);
                        i = -881678003;
                        int i118 = iM2761 ^ i;
                        strM6952 = strM6952;
                        sbM27333 = sbM27333;
                        i16 = i118;
                        c251710 = c25179;
                    } else {
                        sbM27333 = sbM27333;
                        strM6952 = strM6952;
                        int iM31618 = (C0773.m3169("ۙۚ") + i13) * 33;
                        i2 = ((iM31618 ^ i14) * (-2823)) ^ 74344682;
                        i4 = iM31618 ^ 138930925;
                        strM6952 = strM6952;
                        c8002 = null;
                        i16 = i4;
                        i15 = i2;
                        sbM27333 = sbM27333;
                    }
                    break;
                default:
                    AbstractC0641.m2813();
                    if (C20932.m47848() == 0) {
                        sbM27333 = sbM27333;
                        strM6952 = strM6952;
                        iM2761 = C0773.m3169("ۘᩳ") ^ i14;
                        i15 = ((iM2761 ^ i13) * (-29365)) ^ 1392300104;
                        i = 497512648;
                        int i119 = iM2761 ^ i;
                        strM6952 = strM6952;
                        sbM27333 = sbM27333;
                        i16 = i119;
                        c251710 = c25179;
                    } else {
                        sbM27333 = sbM27333;
                        strM6952 = strM6952;
                        int iM31619 = (C0773.m3169("ۙۚ") + i13) * 33;
                        i2 = ((iM31619 ^ i14) * (-2823)) ^ 74344682;
                        i4 = iM31619 ^ 138930925;
                        strM6952 = strM6952;
                        c8002 = null;
                        i16 = i4;
                        i15 = i2;
                        sbM27333 = sbM27333;
                    }
                    break;
            }
            return;
        }
    }
}
