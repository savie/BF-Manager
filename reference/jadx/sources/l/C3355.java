package l;

/* JADX INFO: renamed from: l.ۗܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: D94Y */
/* JADX INFO: loaded from: classes3.dex */
public class C3355 extends C1944 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int m10009(int i, CharSequence charSequence, String str, boolean z) {
        C13465.m32966(charSequence, "<this>");
        C13465.m32966(str, "string");
        if (z || !(charSequence instanceof String)) {
            return m10012(charSequence, (CharSequence) str, i, charSequence.length(), z, false);
        }
        return ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int m10010(CharSequence charSequence) {
        C13465.m32966(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int m10012(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C19815 c19815;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            c19815 = new C16287(i, i2, 1);
        } else {
            int iM10010 = m10010(charSequence);
            if (i > iM10010) {
                i = iM10010;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            c19815 = new C19815(i, i2, -1);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int first = c19815.getFirst();
            int last = c19815.getLast();
            int iM45056 = c19815.m45056();
            if ((iM45056 > 0 && first <= last) || (iM45056 < 0 && last <= first)) {
                while (true) {
                    String str = (String) charSequence2;
                    if (C1944.m6305(0, first, str.length(), str, (String) charSequence, z)) {
                        return first;
                    }
                    if (first != last) {
                        first += iM45056;
                    }
                }
            }
        } else {
            int first2 = c19815.getFirst();
            int last2 = c19815.getLast();
            int iM45057 = c19815.m45056();
            if ((iM45057 > 0 && first2 <= last2) || (iM45057 < 0 && last2 <= first2)) {
                while (true) {
                    int length2 = charSequence2.length();
                    C13465.m32966(charSequence, "other");
                    if (first2 >= 0 && charSequence2.length() - length2 >= 0 && first2 <= charSequence.length() - length2) {
                        for (int i3 = 0; i3 < length2; i3++) {
                            if (C10413.m26319(charSequence2.charAt(i3), charSequence.charAt(first2 + i3), z)) {
                            }
                        }
                        return first2;
                    }
                    if (first2 != last2) {
                        first2 += iM45057;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ int m10013(int i, CharSequence charSequence, String str, boolean z) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m10009(0, charSequence, str, z);
    }
}
