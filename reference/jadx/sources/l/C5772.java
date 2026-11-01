package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۛۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1MK */
/* JADX INFO: loaded from: classes2.dex */
public final class C5772 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13409 m15896(CharSequence charSequence, CharSequence charSequence2, C16936 c16936) {
        c16936.m39631();
        int[] iArrM15897 = m15897(charSequence);
        int[] iArrM15898 = m15897(charSequence2);
        final InterfaceC13409 interfaceC13409M4945 = C1413.m4945(iArrM15897, iArrM15898, c16936);
        C2824 c2824 = new C2824(charSequence.length(), charSequence2.length());
        int i = 0;
        int i2 = 0;
        for (C17641 c17641 : new Iterable() { // from class: l.ܰ᩹ᩳ
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return new C11998(interfaceC13409M4945);
            }
        }) {
            C20464 c20464 = (C20464) c17641.f56076;
            boolean zBooleanValue = ((Boolean) c17641.f56077).booleanValue();
            int i3 = c20464.f66400;
            int iCharCount = 0;
            for (int i4 = c20464.f66401; i4 < i3; i4++) {
                iCharCount += Character.charCount(iArrM15897[i4]);
            }
            int i5 = iCharCount + i;
            int i6 = c20464.f66402;
            int iCharCount2 = 0;
            for (int i7 = c20464.f66399; i7 < i6; i7++) {
                iCharCount2 += Character.charCount(iArrM15898[i7]);
            }
            int i8 = iCharCount2 + i2;
            if (zBooleanValue) {
                c2824.m15544(i, i2, i5, i8);
            }
            i2 = i8;
            i = i5;
        }
        return C1413.m4944(c2824.m8577());
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13409 m15894(CharSequence charSequence, CharSequence charSequence2, C16936 c16936) {
        c16936.m39631();
        C17061 c17061M15901 = m15901(charSequence);
        C17061 c17061M15902 = m15901(charSequence2);
        return new C6560(c17061M15901, c17061M15902, charSequence, charSequence2, C1413.m4945(c17061M15901.f54470, c17061M15902.f54470, c16936), c16936).m36014();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4941 m15900(CharSequence charSequence, CharSequence charSequence2, C16936 c16936) {
        int iM15895;
        int iM39844;
        int iM15896;
        int iM39845;
        c16936.m39631();
        C17061 c17061M15901 = m15901(charSequence);
        C17061 c17061M15902 = m15901(charSequence2);
        InterfaceC13409 interfaceC13409M4945 = C1413.m4945(c17061M15901.f54470, c17061M15902.f54470, c16936);
        ArrayList arrayList = new ArrayList();
        Iterator itMo11890 = interfaceC13409M4945.mo11886().f31762.mo11890();
        while (itMo11890.hasNext()) {
            C20464 c20464 = (C20464) itMo11890.next();
            int i = c20464.f66401;
            int i2 = c20464.f66400;
            if (i == i2) {
                iM15895 = m15895(c17061M15901, c17061M15902, charSequence, charSequence2, c20464, true);
                iM39844 = iM15895;
            } else {
                iM15895 = c17061M15901.f54471[i];
                iM39844 = c17061M15901.m39844(i2 - 1);
            }
            int i3 = c20464.f66399;
            int i4 = c20464.f66402;
            if (i3 == i4) {
                iM15896 = m15895(c17061M15901, c17061M15902, charSequence, charSequence2, c20464, false);
                iM39845 = iM15896;
            } else {
                iM15896 = c17061M15902.f54471[i3];
                iM39845 = c17061M15902.m39844(i4 - 1);
            }
            arrayList.add(new C20464(iM15895, iM39844, iM15896, iM39845));
        }
        return C1413.m4941(arrayList, charSequence.length(), charSequence2.length());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13409 m15898(CharSequence charSequence, CharSequence charSequence2, C16936 c16936) {
        c16936.m39631();
        C17061 c17061M15899 = m15899(charSequence);
        C17061 c17061M158910 = m15899(charSequence2);
        InterfaceC13409 interfaceC13409M4945 = C1413.m4945(c17061M15899.f54470, c17061M158910.f54470, c16936);
        C2824 c2824 = new C2824(charSequence.length(), charSequence2.length());
        for (C20464 c20464 : interfaceC13409M4945.mo11889()) {
            int i = c20464.f66400;
            int i2 = c20464.f66401;
            int i3 = i - i2;
            for (int i4 = 0; i4 < i3; i4++) {
                c2824.m15540(c17061M15899.f54471[i2 + i4], c17061M158910.f54471[c20464.f66399 + i4], 1);
            }
        }
        return C1413.m4944(c2824.m8577());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m15895(C17061 c17061, C17061 c17062, CharSequence charSequence, CharSequence charSequence2, C20464 c20464, boolean z) {
        int i = c20464.f66401;
        int iM39844 = i == 0 ? 0 : c17061.m39844(i - 1);
        int i2 = c20464.f66399;
        int iM39845 = i2 == 0 ? 0 : c17062.m39844(i2 - 1);
        return (z ? iM39844 : iM39845) + C12206.m30309(charSequence, charSequence2, iM39844, iM39845, charSequence.length(), charSequence2.length());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m15897(CharSequence charSequence) {
        C15070 c15070 = new C15070(charSequence.length());
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            int iCharCount = Character.charCount(iCodePointAt);
            c15070.add(iCodePointAt);
            i += iCharCount;
        }
        return c15070.mo3181();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C17061 m15901(CharSequence charSequence) {
        C15070 c15070 = new C15070(charSequence.length());
        C15070 c15071 = new C15070(charSequence.length());
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            int iCharCount = Character.charCount(iCodePointAt);
            if (iCodePointAt >= 128 || !C13571.m33170((char) iCodePointAt)) {
                c15070.add(iCodePointAt);
                c15071.add(i);
            }
            i += iCharCount;
        }
        return new C17061(c15070.mo3181(), c15071.mo3181());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C17061 m15899(CharSequence charSequence) {
        C15070 c15070 = new C15070(charSequence.length());
        C15070 c15071 = new C15070(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (C12206.m30311(cCharAt)) {
                c15070.add(cCharAt);
                c15071.add(i);
            }
        }
        return new C17061(c15070.mo3181(), c15071.mo3181());
    }
}
