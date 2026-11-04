package l;

/* JADX INFO: renamed from: l.ۤ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D94Y */
/* JADX INFO: loaded from: classes4.dex */
public class C10746 extends C4781 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int m27407(int i, CharSequence charSequence, String str, boolean z) {
        C15243.m36590(charSequence, "<this>");
        C15243.m36590(str, "string");
        if (z || !(charSequence instanceof String)) {
            return m27409(charSequence, (CharSequence) str, i, charSequence.length(), z, false);
        }
        return ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int m27408(CharSequence charSequence) {
        C15243.m36590(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int m27409(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C18973 c18973;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            c18973 = new C1074(i, i2, 1);
        } else {
            int iM27408 = m27408(charSequence);
            if (i > iM27408) {
                i = iM27408;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            c18973 = new C18973(i, i2, -1);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int first = c18973.getFirst();
            int last = c18973.getLast();
            int iM44068 = c18973.m44068();
            if ((iM44068 > 0 && first <= last) || (iM44068 < 0 && last <= first)) {
                while (true) {
                    String str = (String) charSequence2;
                    if (C4781.m14757(0, first, str.length(), str, (String) charSequence, z)) {
                        return first;
                    }
                    if (first != last) {
                        first += iM44068;
                    }
                }
            }
        } else {
            int first2 = c18973.getFirst();
            int last2 = c18973.getLast();
            int iM44069 = c18973.m44068();
            if ((iM44069 > 0 && first2 <= last2) || (iM44069 < 0 && last2 <= first2)) {
                while (true) {
                    int length2 = charSequence2.length();
                    C15243.m36590(charSequence, "other");
                    if (first2 >= 0 && charSequence2.length() - length2 >= 0 && first2 <= charSequence.length() - length2) {
                        for (int i3 = 0; i3 < length2; i3++) {
                            if (C14301.m34743(charSequence2.charAt(i3), charSequence.charAt(first2 + i3), z)) {
                            }
                        }
                        return first2;
                    }
                    if (first2 != last2) {
                        first2 += iM44069;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ int m27410(int i, CharSequence charSequence, String str, boolean z) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m27407(0, charSequence, str, z);
    }
}
