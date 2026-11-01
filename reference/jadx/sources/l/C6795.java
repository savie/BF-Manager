package l;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۜܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5CS */
/* JADX INFO: loaded from: classes2.dex */
public final class C6795 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static LinkedHashSet m18399(String str) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = str.length();
            int iM11468 = 0;
            while (iM11468 < length) {
                int iIndexOf = str.indexOf(37, iM11468);
                if (str.charAt(iM11468) != '%') {
                    iM11468 = iIndexOf == -1 ? length : iIndexOf;
                } else {
                    C3972 c3972 = new C3972(str, iM11468 + 1);
                    linkedHashSet.add(c3972.m11469());
                    iM11468 = c3972.m11468();
                }
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return null;
        }
    }
}
