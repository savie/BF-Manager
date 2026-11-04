package l;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.֫᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T5CS */
/* JADX INFO: loaded from: classes2.dex */
public final class C2195 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LinkedHashSet m7502(String str) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = str.length();
            int iM17241 = 0;
            while (iM17241 < length) {
                int iIndexOf = str.indexOf(37, iM17241);
                if (str.charAt(iM17241) != '%') {
                    iM17241 = iIndexOf == -1 ? length : iIndexOf;
                } else {
                    C5924 c5924 = new C5924(str, iM17241 + 1);
                    linkedHashSet.add(c5924.m17242());
                    iM17241 = c5924.m17241();
                }
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return null;
        }
    }
}
