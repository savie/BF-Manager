package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֫ܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAH9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1877 {
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m6121(C6111 c6111, boolean z) {
        int iLastIndexOf = TextUtils.lastIndexOf(c6111.m17000(), '\n', c6111.m17020() - 1) + 1;
        if (z) {
            c6111.mo16839(c6111.m16916(), iLastIndexOf);
        } else {
            c6111.mo17029(iLastIndexOf);
            c6111.m16835();
        }
        c6111.m16890(iLastIndexOf, false);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m6124(C6111 c6111, boolean z) {
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC2916M17000, '\n', c6111.m17020());
        if (iIndexOf == -1) {
            iIndexOf = interfaceC2916M17000.length();
        }
        if (z) {
            c6111.mo16839(c6111.m16916(), iIndexOf);
        } else {
            c6111.mo17029(iIndexOf);
            c6111.m16835();
        }
        c6111.m16890(iIndexOf, false);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m6113(C6111 c6111, boolean z) {
        if (z) {
            c6111.mo16839(c6111.m16916(), 0);
        } else {
            c6111.mo17029(0);
            c6111.m16835();
        }
        c6111.m16890(0, false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m6128(C6111 c6111, boolean z) {
        int iM16842 = c6111.m16842();
        if (z) {
            c6111.mo16839(c6111.m16916(), iM16842);
        } else {
            c6111.mo17029(iM16842);
            c6111.m16835();
        }
        c6111.m16890(iM16842, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6117(C6111 c6111) {
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        int[] iArrM16971 = c6111.m16971();
        int i = iArrM16971[0];
        int i2 = iArrM16971[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC2916M17000, '\n', i - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC2916M17000, '\n', i2);
        if (iIndexOf == -1) {
            iIndexOf = interfaceC2916M17000.length();
        }
        c6111.mo16839(iLastIndexOf, iIndexOf);
        String strMo2396 = interfaceC2916M17000.mo2396(iLastIndexOf, iIndexOf);
        if (!strMo2396.endsWith("\n")) {
            strMo2396 = strMo2396.concat("\n");
        }
        C16737.m39272((CharSequence) strMo2396);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m6127(C6111 c6111) {
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        int[] iArrM16971 = c6111.m16971();
        int i = iArrM16971[0];
        int i2 = iArrM16971[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC2916M17000, '\n', i - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC2916M17000, '\n', i2) + 1;
        if (iIndexOf == 0) {
            iIndexOf = interfaceC2916M17000.length();
        }
        String strMo2396 = interfaceC2916M17000.mo2396(iLastIndexOf, iIndexOf);
        if (!strMo2396.endsWith("\n")) {
            strMo2396 = strMo2396.concat("\n");
        }
        C16737.m39272((CharSequence) strMo2396);
        interfaceC2916M17000.delete(iLastIndexOf, iIndexOf);
        c6111.mo17029(iLastIndexOf);
        c6111.m16835();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m6114(C6111 c6111) {
        String strM39296 = C16737.m39296();
        if (strM39296 == null) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        if (!strM39296.endsWith("\n")) {
            strM39296 = strM39296.concat("\n");
        }
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        int[] iArrM16971 = c6111.m16971();
        int i = iArrM16971[0];
        int i2 = iArrM16971[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC2916M17000, '\n', i - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC2916M17000, '\n', i2) + 1;
        if (iIndexOf == 0) {
            iIndexOf = interfaceC2916M17000.length();
        }
        interfaceC2916M17000.replace(iLastIndexOf, iIndexOf, strM39296);
        c6111.mo17029(strM39296.length() + iLastIndexOf);
        c6111.m16835();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m6120(C6111 c6111) {
        int length;
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        int[] iArrM16971 = c6111.m16971();
        int i = iArrM16971[0];
        int i2 = iArrM16971[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC2916M17000, '\n', i - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC2916M17000, '\n', i2) + 1;
        if (iIndexOf == 0) {
            iIndexOf = interfaceC2916M17000.length();
            interfaceC2916M17000.append('\n');
            length = interfaceC2916M17000.length();
            iArrM16971[0] = iArrM16971[0] + 1;
            iArrM16971[1] = iArrM16971[1] + 1;
        } else {
            length = iIndexOf;
        }
        int i3 = iIndexOf - iLastIndexOf;
        interfaceC2916M17000.insert(length, interfaceC2916M17000.mo2396(iLastIndexOf, iIndexOf));
        c6111.mo16839(iArrM16971[0] + i3, iArrM16971[1] + i3);
        c6111.m16827(false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c A[PHI: r1
      0x002c: PHI (r1v5 int) = (r1v4 int), (r1v7 int) binds: [B:6:0x0023, B:8:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m6112(C6111 c6111) {
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        if (interfaceC2916M17000.length() == 0) {
            return;
        }
        int[] iArrM16971 = c6111.m16971();
        int i = iArrM16971[0];
        int i2 = iArrM16971[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC2916M17000, '\n', i - 1);
        int i3 = iLastIndexOf + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC2916M17000, '\n', i2) + 1;
        if (iIndexOf == 0) {
            iIndexOf = interfaceC2916M17000.length();
            if (i3 <= 0) {
                iLastIndexOf = i3;
            }
        } else {
            iLastIndexOf = i3;
        }
        interfaceC2916M17000.delete(iLastIndexOf, iIndexOf);
        c6111.mo17029(iLastIndexOf);
        c6111.m16835();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m6129(C6111 c6111) {
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        int[] iArrM16971 = c6111.m16971();
        int i = iArrM16971[0];
        int i2 = iArrM16971[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC2916M17000, '\n', i - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC2916M17000, '\n', i2) + 1;
        if (iIndexOf == 0) {
            iIndexOf = interfaceC2916M17000.length();
        }
        int i3 = 0;
        for (int i4 = iLastIndexOf; i4 < iIndexOf; i4++) {
            if (interfaceC2916M17000.charAt(i4) == '\n') {
                i3++;
            }
        }
        int i5 = iIndexOf == interfaceC2916M17000.length() ? iLastIndexOf + i3 : (iLastIndexOf + i3) - 1;
        interfaceC2916M17000.replace(iLastIndexOf, iIndexOf, C6851.m18454('\n', i3));
        c6111.mo17029(i5);
        c6111.m16827(false);
        c6111.m16835();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6119(C6111 c6111, boolean z) {
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        int[] iArrM16971 = c6111.m16971();
        int i = iArrM16971[0];
        int i2 = iArrM16971[1];
        if (i == i2) {
            C15829.m37618(R.string.MT_Protector);
            return;
        }
        String strMo2396 = interfaceC2916M17000.mo2396(i, i2);
        interfaceC2916M17000.replace(i, i2, z ? strMo2396.toUpperCase() : strMo2396.toLowerCase());
        c6111.m16827(false);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m6111(C6111 c6111) {
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        int[] iArrM16971 = c6111.m16971();
        int i = iArrM16971[0];
        int i2 = iArrM16971[1];
        int iM17881 = c6111.f20794.m17881();
        String str = "\t";
        if (i == i2) {
            if (c6111.m17014()) {
                interfaceC2916M17000.insert(i, "\t");
                return;
            }
            int i3 = 0;
            for (int iM6126 = m6126(i, interfaceC2916M17000); iM6126 < i; iM6126++) {
                i3 = interfaceC2916M17000.charAt(iM6126) == '\t' ? 0 : i3 + 1;
            }
            char[] cArr = new char[iM17881 - (i3 % iM17881)];
            Arrays.fill(cArr, ' ');
            interfaceC2916M17000.insert(i, new String(cArr));
            return;
        }
        if (!c6111.m17014()) {
            char[] cArr2 = new char[iM17881];
            Arrays.fill(cArr2, ' ');
            str = new String(cArr2);
        }
        interfaceC2916M17000.insert(m6126(i, interfaceC2916M17000), str);
        int length = str.length() + i;
        int length2 = str.length() + i2;
        int iM6115 = m6115(length, interfaceC2916M17000);
        while (true) {
            int i4 = iM6115 + 1;
            if (i4 <= length2) {
                interfaceC2916M17000.insert(i4, str);
                iM6115 = m6115(i4, interfaceC2916M17000);
                length2 += str.length();
            } else {
                c6111.mo16839(length, length2);
                c6111.m16827(false);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m6123(C6111 c6111) {
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        int[] iArrM16971 = c6111.m16971();
        int i = iArrM16971[0];
        int i2 = iArrM16971[1];
        int iM17881 = c6111.f20794.m17881();
        int iM6126 = m6126(i, interfaceC2916M17000);
        int iM6116 = m6116(interfaceC2916M17000, iM6126, iM17881);
        int iM6115 = m6115(iM6126, interfaceC2916M17000);
        int i3 = iM6126 + iM6116;
        int i4 = i >= i3 ? i - iM6116 : iM6126;
        if (i2 >= i3) {
            iM6126 = i2 - iM6116;
        }
        while (true) {
            int i5 = iM6115 + 1;
            if (i5 <= iM6126) {
                int iM6117 = m6116(interfaceC2916M17000, i5, iM17881);
                iM6115 = m6115(i5, interfaceC2916M17000);
                iM6126 = iM6126 >= i5 + iM6117 ? iM6126 - iM6117 : i5;
            } else {
                c6111.mo16839(i4, iM6126);
                c6111.m16827(false);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m6116(InterfaceC2916 interfaceC2916, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i + i4;
            if (i5 >= interfaceC2916.length()) {
                break;
            }
            char cCharAt = interfaceC2916.charAt(i5);
            if (cCharAt != ' ') {
                if (cCharAt != '\t') {
                    break;
                }
                i3++;
                break;
            }
            i3++;
        }
        if (i3 != 0) {
            interfaceC2916.delete(i, i + i3);
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6118(final C6111 c6111, final C17565 c17565) {
        InterfaceC8228 interfaceC8228;
        InterfaceC8228 interfaceC8229;
        final InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        final int iM16916 = c6111.m16916();
        try {
            if (!interfaceC2916M17000.mo8724(new Runnable() { // from class: l.ۧܳۖ
                @Override // java.lang.Runnable
                public final void run() {
                    C6111 c6112 = c6111;
                    c6112.m16827(true);
                    InterfaceC2916 interfaceC2916 = interfaceC2916M17000;
                    int length = interfaceC2916.length();
                    C17565 c17566 = c17565;
                    interfaceC2916.replace(0, length, c17566);
                    c6112.mo17029(Math.min(iM16916, c17566.length()));
                    c6112.m16827(false);
                }
            })) {
                throw new IllegalStateException("Text editor is not ready for formatted output");
            }
            if (c6111.m17000() == interfaceC2916M17000 && (interfaceC8229 = c6111.f20726) != null) {
                interfaceC8229.mo3561(c6111.m16938(), c6111.m17037());
            }
            c6111.m16835();
        } catch (Throwable th) {
            if (c6111.m17000() == interfaceC2916M17000 && (interfaceC8228 = c6111.f20726) != null) {
                interfaceC8228.mo3561(c6111.m16938(), c6111.m17037());
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static void m6130(C6111 c6111) {
        List arrayList;
        InterfaceC8334 interfaceC8334;
        boolean z;
        List<InterfaceC8334> listM16834 = c6111.m16834();
        if (listM16834.isEmpty()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        InterfaceC2916 interfaceC2916M17000 = c6111.m17000();
        int[] iArrM16971 = c6111.m16971();
        int i = iArrM16971[0];
        boolean z2 = i == iArrM16971[1];
        int iM6126 = m6126(i, interfaceC2916M17000);
        int iM6115 = m6115(iArrM16971[0], interfaceC2916M17000);
        C15070 c15070 = new C15070();
        C15070 c15071 = new C15070();
        c15070.add(iM6126);
        c15071.add(iM6115);
        int i2 = 1;
        while (true) {
            int i3 = iM6115 + 1;
            if (i3 > iArrM16971[1]) {
                break;
            }
            int iM6116 = m6115(i3, interfaceC2916M17000);
            c15070.add(i3);
            c15071.add(iM6116);
            i2++;
            iM6115 = iM6116;
        }
        if (listM16834.size() == 1) {
            arrayList = listM16834;
        } else {
            arrayList = new ArrayList(listM16834);
            Collections.sort(arrayList);
        }
        Iterator it = arrayList.iterator();
        loop1: while (true) {
            if (!it.hasNext()) {
                interfaceC8334 = null;
                z = false;
                break;
            }
            interfaceC8334 = (InterfaceC8334) it.next();
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    z = true;
                    break loop1;
                } else if (!interfaceC8334.mo21763(interfaceC2916M17000, c15070.getInt(i4), c15071.getInt(i4))) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        if (interfaceC8334 == null) {
            for (InterfaceC8334 interfaceC8335 : listM16834) {
                if (interfaceC8335 instanceof C19623) {
                    interfaceC8334 = interfaceC8335;
                    break;
                }
            }
            if (interfaceC8334 == null) {
                interfaceC8334 = (InterfaceC8334) listM16834.get(0);
            }
        }
        C16031 c16031M8729 = interfaceC2916M17000.m8729();
        int iMo21764 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = c15070.getInt(i5) + iMo21764;
            int i7 = c15071.getInt(i5) + iMo21764;
            if (z) {
                iMo21764 -= interfaceC8334.mo21762(c16031M8729, i6, i7, iArrM16971);
            } else {
                iMo21764 = interfaceC8334.mo21764(c16031M8729, i6, i7, iArrM16971) + iMo21764;
            }
            if (i2 % 500 == 0) {
                c16031M8729.m38023();
            }
        }
        c16031M8729.m38023();
        if (z2) {
            int i8 = iArrM16971[0];
            int iM6117 = m6115(i8, interfaceC2916M17000) + 1;
            c6111.mo17029(Math.min((i8 - m6126(i8, interfaceC2916M17000)) + iM6117, m6115(iM6117, interfaceC2916M17000)));
            c6111.m16835();
        } else {
            c6111.mo16839(iArrM16971[0], iArrM16971[1]);
        }
        c6111.m16827(false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m6126(int i, CharSequence charSequence) {
        return TextUtils.lastIndexOf(charSequence, '\n', i - 1) + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m6115(int i, CharSequence charSequence) {
        int iIndexOf = TextUtils.indexOf(charSequence, '\n', i);
        return iIndexOf == -1 ? charSequence.length() : iIndexOf;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static void m6125(C6111 c6111) {
        InterfaceC5366 interfaceC5366M32619 = c6111.f20770.m32619();
        if (interfaceC5366M32619 == null) {
            C15829.m37611(R.string.MT_Protector);
        } else {
            new C23751(c6111, (AbstractActivityC12483) C8703.m22527(c6111.getContext()), interfaceC5366M32619).m10243();
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m6122(C6111 c6111) {
        InterfaceC13128 interfaceC13128M32639 = c6111.f20770.m32639();
        if (interfaceC13128M32639 == null) {
            C15829.m37611(R.string.MT_Protector);
        } else {
            new C14579(c6111, (AbstractActivityC12483) C8703.m22527(c6111.getContext()), interfaceC13128M32639).m10243();
        }
    }
}
