package l;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ۫ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8FO */
/* JADX INFO: loaded from: classes4.dex */
public final class C18327 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f59783;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f59784;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f59785;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f59786;

    public C18327(C0428 c0428, String str, String str2, List list, String str3) {
        this.f59783 = c0428.m2233(str);
        this.f59785 = c0428.m2233(str2);
        this.f59784 = new int[list.size()];
        this.f59786 = c0428.m2233(str3);
        for (int i = 0; i < list.size(); i++) {
            this.f59784[i] = c0428.m2233(((CharSequence) list.get(i)).toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18327.class == obj.getClass()) {
            C18327 c18327 = (C18327) obj;
            if (this.f59783 == c18327.f59783 && this.f59785 == c18327.f59785 && this.f59786 == c18327.f59786 && Arrays.equals(this.f59784, c18327.f59784)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f59784) + (((this.f59783 * 31) + this.f59785) * 31)) * 31) + this.f59786;
    }
}
