package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: YAH9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18910 {
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m43906(C24132 c24132, boolean z) {
        int iLastIndexOf = TextUtils.lastIndexOf(c24132.m54021(), '\n', c24132.m53882() - 1) + 1;
        if (z) {
            c24132.mo52316(c24132.m53968(), iLastIndexOf);
        } else {
            c24132.mo52339(iLastIndexOf);
            c24132.m53880();
        }
        c24132.m53935(iLastIndexOf, false);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m43912(C24132 c24132, boolean z) {
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC19106M54021, '\n', c24132.m53882());
        if (iIndexOf == -1) {
            iIndexOf = interfaceC19106M54021.length();
        }
        if (z) {
            c24132.mo52316(c24132.m53968(), iIndexOf);
        } else {
            c24132.mo52339(iIndexOf);
            c24132.m53880();
        }
        c24132.m53935(iIndexOf, false);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m43908(C24132 c24132, boolean z) {
        if (z) {
            c24132.mo52316(c24132.m53968(), 0);
        } else {
            c24132.mo52339(0);
            c24132.m53880();
        }
        c24132.m53935(0, false);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m43917(C24132 c24132, boolean z) {
        int iM54099 = c24132.m54099();
        if (z) {
            c24132.mo52316(c24132.m53968(), iM54099);
        } else {
            c24132.mo52339(iM54099);
            c24132.m53880();
        }
        c24132.m53935(iM54099, false);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m43902(C24132 c24132) {
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        int[] iArrM53971 = c24132.m53971();
        int i = iArrM53971[0];
        int i2 = iArrM53971[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC19106M54021, '\n', i - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC19106M54021, '\n', i2);
        if (iIndexOf == -1) {
            iIndexOf = interfaceC19106M54021.length();
        }
        c24132.mo52316(iLastIndexOf, iIndexOf);
        String strMo15351 = interfaceC19106M54021.mo15351(iLastIndexOf, iIndexOf);
        if (!strMo15351.endsWith("\n")) {
            strMo15351 = strMo15351.concat("\n");
        }
        C21576.m49067((CharSequence) strMo15351);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m43916(C24132 c24132) {
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        int[] iArrM53971 = c24132.m53971();
        int i = iArrM53971[0];
        int i2 = iArrM53971[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC19106M54021, '\n', i - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC19106M54021, '\n', i2) + 1;
        if (iIndexOf == 0) {
            iIndexOf = interfaceC19106M54021.length();
        }
        String strMo15351 = interfaceC19106M54021.mo15351(iLastIndexOf, iIndexOf);
        if (!strMo15351.endsWith("\n")) {
            strMo15351 = strMo15351.concat("\n");
        }
        C21576.m49067((CharSequence) strMo15351);
        interfaceC19106M54021.delete(iLastIndexOf, iIndexOf);
        c24132.mo52339(iLastIndexOf);
        c24132.m53880();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m43918(C24132 c24132) {
        String strM49080 = C21576.m49080();
        if (strM49080 == null) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        if (!strM49080.endsWith("\n")) {
            strM49080 = strM49080.concat("\n");
        }
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        int[] iArrM53971 = c24132.m53971();
        int i = iArrM53971[0];
        int i2 = iArrM53971[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC19106M54021, '\n', i - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC19106M54021, '\n', i2) + 1;
        if (iIndexOf == 0) {
            iIndexOf = interfaceC19106M54021.length();
        }
        interfaceC19106M54021.replace(iLastIndexOf, iIndexOf, strM49080);
        c24132.mo52339(strM49080.length() + iLastIndexOf);
        c24132.m53880();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m43905(C24132 c24132) {
        int length;
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        int[] iArrM53971 = c24132.m53971();
        int i = iArrM53971[0];
        int i2 = iArrM53971[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC19106M54021, '\n', i - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC19106M54021, '\n', i2) + 1;
        if (iIndexOf == 0) {
            iIndexOf = interfaceC19106M54021.length();
            interfaceC19106M54021.append('\n');
            length = interfaceC19106M54021.length();
            iArrM53971[0] = iArrM53971[0] + 1;
            iArrM53971[1] = iArrM53971[1] + 1;
        } else {
            length = iIndexOf;
        }
        int i3 = iIndexOf - iLastIndexOf;
        interfaceC19106M54021.insert(length, interfaceC19106M54021.mo15351(iLastIndexOf, iIndexOf));
        c24132.mo52316(iArrM53971[0] + i3, iArrM53971[1] + i3);
        c24132.m54091(false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c A[PHI: r1
      0x002c: PHI (r1v5 int) = (r1v4 int), (r1v7 int) binds: [B:6:0x0023, B:8:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m43907(C24132 c24132) {
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        if (interfaceC19106M54021.length() == 0) {
            return;
        }
        int[] iArrM53971 = c24132.m53971();
        int i = iArrM53971[0];
        int i2 = iArrM53971[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC19106M54021, '\n', i - 1);
        int i3 = iLastIndexOf + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC19106M54021, '\n', i2) + 1;
        if (iIndexOf == 0) {
            iIndexOf = interfaceC19106M54021.length();
            if (i3 <= 0) {
                iLastIndexOf = i3;
            }
        } else {
            iLastIndexOf = i3;
        }
        interfaceC19106M54021.delete(iLastIndexOf, iIndexOf);
        c24132.mo52339(iLastIndexOf);
        c24132.m53880();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m43901(C24132 c24132) {
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        int[] iArrM53971 = c24132.m53971();
        int i = iArrM53971[0];
        int i2 = iArrM53971[1];
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC19106M54021, '\n', i - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC19106M54021, '\n', i2) + 1;
        if (iIndexOf == 0) {
            iIndexOf = interfaceC19106M54021.length();
        }
        int i3 = 0;
        for (int i4 = iLastIndexOf; i4 < iIndexOf; i4++) {
            if (interfaceC19106M54021.charAt(i4) == '\n') {
                i3++;
            }
        }
        int i5 = iIndexOf == interfaceC19106M54021.length() ? iLastIndexOf + i3 : (iLastIndexOf + i3) - 1;
        interfaceC19106M54021.replace(iLastIndexOf, iIndexOf, C24276.m54280('\n', i3));
        c24132.mo52339(i5);
        c24132.m54091(false);
        c24132.m53880();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43900(C24132 c24132, boolean z) {
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        int[] iArrM53971 = c24132.m53971();
        int i = iArrM53971[0];
        int i2 = iArrM53971[1];
        if (i == i2) {
            C22673.m51159(R.string.MT_Protector);
            return;
        }
        String strMo15351 = interfaceC19106M54021.mo15351(i, i2);
        interfaceC19106M54021.replace(i, i2, z ? strMo15351.toUpperCase() : strMo15351.toLowerCase());
        c24132.m54091(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43894(C24132 c24132) {
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        int[] iArrM53971 = c24132.m53971();
        int i = iArrM53971[0];
        int i2 = iArrM53971[1];
        int iM16214 = c24132.f78066.m16214();
        String str = "\t";
        if (i == i2) {
            if (c24132.m54049()) {
                interfaceC19106M54021.insert(i, "\t");
                return;
            }
            int i3 = 0;
            for (int iM43913 = m43913(i, interfaceC19106M54021); iM43913 < i; iM43913++) {
                i3 = interfaceC19106M54021.charAt(iM43913) == '\t' ? 0 : i3 + 1;
            }
            char[] cArr = new char[iM16214 - (i3 % iM16214)];
            Arrays.fill(cArr, ' ');
            interfaceC19106M54021.insert(i, new String(cArr));
            return;
        }
        if (!c24132.m54049()) {
            char[] cArr2 = new char[iM16214];
            Arrays.fill(cArr2, ' ');
            str = new String(cArr2);
        }
        interfaceC19106M54021.insert(m43913(i, interfaceC19106M54021), str);
        int length = str.length() + i;
        int length2 = str.length() + i2;
        int iM43895 = m43895(length, interfaceC19106M54021);
        while (true) {
            int i4 = iM43895 + 1;
            if (i4 <= length2) {
                interfaceC19106M54021.insert(i4, str);
                iM43895 = m43895(i4, interfaceC19106M54021);
                length2 += str.length();
            } else {
                c24132.mo52316(length, length2);
                c24132.m54091(false);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m43911(C24132 c24132) {
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        int[] iArrM53971 = c24132.m53971();
        int i = iArrM53971[0];
        int i2 = iArrM53971[1];
        int iM16214 = c24132.f78066.m16214();
        int iM43913 = m43913(i, interfaceC19106M54021);
        int iM43896 = m43896(interfaceC19106M54021, iM43913, iM16214);
        int iM43895 = m43895(iM43913, interfaceC19106M54021);
        int i3 = iM43913 + iM43896;
        int i4 = i >= i3 ? i - iM43896 : iM43913;
        if (i2 >= i3) {
            iM43913 = i2 - iM43896;
        }
        while (true) {
            int i5 = iM43895 + 1;
            if (i5 <= iM43913) {
                int iM43897 = m43896(interfaceC19106M54021, i5, iM16214);
                iM43895 = m43895(i5, interfaceC19106M54021);
                iM43913 = iM43913 >= i5 + iM43897 ? iM43913 - iM43897 : i5;
            } else {
                c24132.mo52316(i4, iM43913);
                c24132.m54091(false);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m43896(InterfaceC19106 interfaceC19106, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i + i4;
            if (i5 >= interfaceC19106.length()) {
                break;
            }
            char cCharAt = interfaceC19106.charAt(i5);
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
            interfaceC19106.delete(i, i + i3);
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m43904(C24132 c24132) {
        m43915(c24132, true);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m43909(C24132 c24132) {
        m43903(c24132, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43897(AbstractActivityC17204 abstractActivityC17204, C24132 c24132, Exception exc, boolean z, boolean z2, Runnable runnable) {
        if (z && (exc instanceof C5949)) {
            C5949 c5949 = (C5949) exc;
            C15301.m36736(c5949.m17328(), c5949.m17327() - 1).m36745(c24132);
            C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
            c2361BuildDialog.m8021(R.string.MT_Protector);
            c2361BuildDialog.m8008(abstractActivityC17204.getString(R.string.MT_Protector, Integer.valueOf(c5949.m17328()), Integer.valueOf(c5949.m17327()), c5949.getMessage()));
            c2361BuildDialog.m8018(z2 ? R.string.MT_Protector : R.string.MT_Protector, new DialogInterfaceOnClickListenerC3994(0, runnable));
            c2361BuildDialog.m8026(R.string.MT_Protector, null);
            c2361BuildDialog.m8016();
            return;
        }
        abstractActivityC17204.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43899(final C24132 c24132, final C8796 c8796) {
        InterfaceC12943 interfaceC12943;
        InterfaceC12943 interfaceC12944;
        final InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        final int iM53968 = c24132.m53968();
        try {
            if (!interfaceC19106M54021.mo11040(new Runnable() { // from class: l.ܰۜ᩸
                @Override // java.lang.Runnable
                public final void run() {
                    C24132 c24133 = c24132;
                    c24133.m54091(true);
                    InterfaceC19106 interfaceC19106 = interfaceC19106M54021;
                    int length = interfaceC19106.length();
                    C8796 c8797 = c8796;
                    interfaceC19106.replace(0, length, c8797);
                    c24133.mo52339(Math.min(iM53968, c8797.length()));
                    c24133.m54091(false);
                }
            })) {
                throw new IllegalStateException("Text editor is not ready for formatted output");
            }
            if (c24132.m54021() == interfaceC19106M54021 && (interfaceC12944 = c24132.f77988) != null) {
                interfaceC12944.mo15546(c24132.m53957(), c24132.m53999());
            }
            c24132.m53880();
        } catch (Throwable th) {
            if (c24132.m54021() == interfaceC19106M54021 && (interfaceC12943 = c24132.f77988) != null) {
                interfaceC12943.mo15546(c24132.m53957(), c24132.m53999());
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m43910(C24132 c24132) {
        List arrayList;
        InterfaceC7456 interfaceC7456;
        boolean z;
        List<InterfaceC7456> listM54095 = c24132.m54095();
        if (listM54095.isEmpty()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        InterfaceC19106 interfaceC19106M54021 = c24132.m54021();
        int[] iArrM53971 = c24132.m53971();
        int i = iArrM53971[0];
        boolean z2 = i == iArrM53971[1];
        int iM43913 = m43913(i, interfaceC19106M54021);
        int iM43895 = m43895(iArrM53971[0], interfaceC19106M54021);
        C14763 c14763 = new C14763();
        C14763 c14764 = new C14763();
        c14763.add(iM43913);
        c14764.add(iM43895);
        int i2 = 1;
        while (true) {
            int i3 = iM43895 + 1;
            if (i3 > iArrM53971[1]) {
                break;
            }
            int iM43896 = m43895(i3, interfaceC19106M54021);
            c14763.add(i3);
            c14764.add(iM43896);
            i2++;
            iM43895 = iM43896;
        }
        if (listM54095.size() == 1) {
            arrayList = listM54095;
        } else {
            arrayList = new ArrayList(listM54095);
            Collections.sort(arrayList);
        }
        Iterator it = arrayList.iterator();
        loop1: while (true) {
            if (!it.hasNext()) {
                interfaceC7456 = null;
                z = false;
                break;
            }
            interfaceC7456 = (InterfaceC7456) it.next();
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    z = true;
                    break loop1;
                } else if (!interfaceC7456.mo14441(interfaceC19106M54021, c14763.getInt(i4), c14764.getInt(i4))) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        if (interfaceC7456 == null) {
            for (InterfaceC7456 interfaceC7457 : listM54095) {
                if (interfaceC7457 instanceof C14167) {
                    interfaceC7456 = interfaceC7457;
                    break;
                }
            }
            if (interfaceC7456 == null) {
                interfaceC7456 = (InterfaceC7456) listM54095.get(0);
            }
        }
        C10375 c10375M44226 = interfaceC19106M54021.m44226();
        int iMo14442 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = c14763.getInt(i5) + iMo14442;
            int i7 = c14764.getInt(i5) + iMo14442;
            if (z) {
                iMo14442 -= interfaceC7456.mo14440(c10375M44226, i6, i7, iArrM53971);
            } else {
                iMo14442 = interfaceC7456.mo14442(c10375M44226, i6, i7, iArrM53971) + iMo14442;
            }
            if (i2 % 500 == 0) {
                c10375M44226.m26683();
            }
        }
        c10375M44226.m26683();
        if (z2) {
            int i8 = iArrM53971[0];
            int iM43897 = m43895(i8, interfaceC19106M54021) + 1;
            c24132.mo52339(Math.min((i8 - m43913(i8, interfaceC19106M54021)) + iM43897, m43895(iM43897, interfaceC19106M54021)));
            c24132.m53880();
        } else {
            c24132.mo52316(iArrM53971[0], iArrM53971[1]);
        }
        c24132.m54091(false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m43913(int i, CharSequence charSequence) {
        return TextUtils.lastIndexOf(charSequence, '\n', i - 1) + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m43895(int i, CharSequence charSequence) {
        int iIndexOf = TextUtils.indexOf(charSequence, '\n', i);
        return iIndexOf == -1 ? charSequence.length() : iIndexOf;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m43915(C24132 c24132, boolean z) {
        InterfaceC0855 interfaceC0855M4836 = c24132.f78033.m4836();
        if (interfaceC0855M4836 == null) {
            C22673.m51152(R.string.MT_Protector);
        } else {
            new C18164(c24132, (AbstractActivityC17204) C3200.m10534(c24132.getContext()), interfaceC0855M4836, z).m8197();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m43903(C24132 c24132, boolean z) {
        InterfaceC8313 interfaceC8313M4825 = c24132.f78033.m4825();
        if (interfaceC8313M4825 == null) {
            C22673.m51152(R.string.MT_Protector);
        } else {
            new C7723(c24132, (AbstractActivityC17204) C3200.m10534(c24132.getContext()), interfaceC8313M4825, z).m8197();
        }
    }
}
