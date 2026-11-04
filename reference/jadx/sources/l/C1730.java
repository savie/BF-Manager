package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ۛܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: T1MK */
/* JADX INFO: loaded from: classes2.dex */
public final class C1730 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21646 m6130(CharSequence charSequence, CharSequence charSequence2, C15087 c15087) {
        c15087.m36345();
        int[] iArrM6131 = m6131(charSequence);
        int[] iArrM6132 = m6131(charSequence2);
        final InterfaceC21646 interfaceC21646M35916 = C14932.m35916(iArrM6131, iArrM6132, c15087);
        C6730 c6730 = new C6730(charSequence.length(), charSequence2.length());
        int i = 0;
        int i2 = 0;
        for (C5393 c5393 : new Iterable() { // from class: l.᩵᩺ܶ
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return new C12695(interfaceC21646M35916);
            }
        }) {
            C22547 c22547 = (C22547) c5393.f18884;
            boolean zBooleanValue = ((Boolean) c5393.f18885).booleanValue();
            int i3 = c22547.f72891;
            int iCharCount = 0;
            for (int i4 = c22547.f72892; i4 < i3; i4++) {
                iCharCount += Character.charCount(iArrM6131[i4]);
            }
            int i5 = iCharCount + i;
            int i6 = c22547.f72893;
            int iCharCount2 = 0;
            for (int i7 = c22547.f72894; i7 < i6; i7++) {
                iCharCount2 += Character.charCount(iArrM6132[i7]);
            }
            int i8 = iCharCount2 + i2;
            if (zBooleanValue) {
                c6730.m54965(i, i2, i5, i8);
            }
            i2 = i8;
            i = i5;
        }
        return C14932.m35915(c6730.m18810());
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static InterfaceC21646 m6136(CharSequence charSequence, CharSequence charSequence2, C15087 c15087) {
        c15087.m36345();
        C5459 c5459M6135 = m6135(charSequence);
        C5459 c5459M6136 = m6135(charSequence2);
        return new C0238(c5459M6135, c5459M6136, charSequence, charSequence2, C14932.m35916(c5459M6135.f19055, c5459M6136.f19055, c15087), c15087).m43793();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static InterfaceC3746 m6134(CharSequence charSequence, CharSequence charSequence2, C15087 c15087) {
        int iM6129;
        int iM16292;
        int iM61210;
        int iM16293;
        c15087.m36345();
        C5459 c5459M6135 = m6135(charSequence);
        C5459 c5459M6136 = m6135(charSequence2);
        InterfaceC21646 interfaceC21646M35916 = C14932.m35916(c5459M6135.f19055, c5459M6136.f19055, c15087);
        ArrayList arrayList = new ArrayList();
        Iterator itMo3129 = interfaceC21646M35916.mo3127().f53297.mo3129();
        while (itMo3129.hasNext()) {
            C22547 c22547 = (C22547) itMo3129.next();
            int i = c22547.f72892;
            int i2 = c22547.f72891;
            if (i == i2) {
                iM6129 = m6129(c5459M6135, c5459M6136, charSequence, charSequence2, c22547, true);
                iM16292 = iM6129;
            } else {
                iM6129 = c5459M6135.f19056[i];
                iM16292 = c5459M6135.m16292(i2 - 1);
            }
            int i3 = c22547.f72894;
            int i4 = c22547.f72893;
            if (i3 == i4) {
                iM61210 = m6129(c5459M6135, c5459M6136, charSequence, charSequence2, c22547, false);
                iM16293 = iM61210;
            } else {
                iM61210 = c5459M6136.f19056[i3];
                iM16293 = c5459M6136.m16292(i4 - 1);
            }
            arrayList.add(new C22547(iM6129, iM16292, iM61210, iM16293));
        }
        return C14932.m35912(arrayList, charSequence.length(), charSequence2.length());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC21646 m6133(CharSequence charSequence, CharSequence charSequence2, C15087 c15087) {
        c15087.m36345();
        C5459 c5459M6132 = m6132(charSequence);
        C5459 c5459M6133 = m6132(charSequence2);
        InterfaceC21646 interfaceC21646M35916 = C14932.m35916(c5459M6132.f19055, c5459M6133.f19055, c15087);
        C6730 c6730 = new C6730(charSequence.length(), charSequence2.length());
        for (C22547 c22547 : interfaceC21646M35916.mo3131()) {
            int i = c22547.f72891;
            int i2 = c22547.f72892;
            int i3 = i - i2;
            for (int i4 = 0; i4 < i3; i4++) {
                c6730.m54961(c5459M6132.f19056[i2 + i4], c5459M6133.f19056[c22547.f72894 + i4], 1);
            }
        }
        return C14932.m35915(c6730.m18810());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m6129(C5459 c5459, C5459 c54510, CharSequence charSequence, CharSequence charSequence2, C22547 c22547, boolean z) {
        int i = c22547.f72892;
        int iM16292 = i == 0 ? 0 : c5459.m16292(i - 1);
        int i2 = c22547.f72894;
        int iM16293 = i2 == 0 ? 0 : c54510.m16292(i2 - 1);
        return (z ? iM16292 : iM16293) + C13441.m33069(charSequence, charSequence2, iM16292, iM16293, charSequence.length(), charSequence2.length());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int[] m6131(CharSequence charSequence) {
        C14763 c14763 = new C14763(charSequence.length());
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            int iCharCount = Character.charCount(iCodePointAt);
            c14763.add(iCodePointAt);
            i += iCharCount;
        }
        return c14763.mo2687();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C5459 m6135(CharSequence charSequence) {
        C14763 c14763 = new C14763(charSequence.length());
        C14763 c14764 = new C14763(charSequence.length());
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iCodePointAt = Character.codePointAt(charSequence, i);
            int iCharCount = Character.charCount(iCodePointAt);
            if (iCodePointAt >= 128 || !C7569.m20684((char) iCodePointAt)) {
                c14763.add(iCodePointAt);
                c14764.add(i);
            }
            i += iCharCount;
        }
        return new C5459(c14763.mo2687(), c14764.mo2687());
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C5459 m6132(CharSequence charSequence) {
        C14763 c14763 = new C14763(charSequence.length());
        C14763 c14764 = new C14763(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (C13441.m33071(cCharAt)) {
                c14763.add(cCharAt);
                c14764.add(i);
            }
        }
        return new C5459(c14763.mo2687(), c14764.mo2687());
    }
}
