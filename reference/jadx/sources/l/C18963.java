package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩳۡۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q9CF */
/* JADX INFO: loaded from: classes4.dex */
public final class C18963 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4597 f61481;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f61482;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object[] f61483;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f61484;

    public C18963(String str, String str2, C4597 c4597, Object... objArr) {
        this.f61484 = str;
        this.f61482 = str2;
        this.f61481 = c4597;
        this.f61483 = objArr;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m44050() {
        return this.f61484;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m44053() {
        return this.f61482;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4597 m44048() {
        return this.f61481;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m44051() {
        return this.f61483.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m44047(int i) {
        return this.f61483[i];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object[] m44049() {
        return this.f61483;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18963)) {
            return false;
        }
        C18963 c18963 = (C18963) obj;
        return this.f61484.equals(c18963.f61484) && this.f61482.equals(c18963.f61482) && this.f61481.equals(c18963.f61481) && Arrays.equals(this.f61483, c18963.f61483);
    }

    public final int hashCode() {
        return ((this.f61484.hashCode() ^ Integer.rotateLeft(this.f61482.hashCode(), 8)) ^ Integer.rotateLeft(this.f61481.hashCode(), 16)) ^ Integer.rotateLeft(Arrays.hashCode(this.f61483), 24);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!m44046(sb)) {
            sb.setLength(16381);
            sb.append("...");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m44046(StringBuilder sb) {
        if (sb.length() < 16384) {
            sb.append(this.f61484);
            sb.append(" : ");
            sb.append(this.f61482);
            sb.append(' ');
            sb.append(this.f61481);
            sb.append(' ');
            for (Object obj : this.f61483) {
                if (obj instanceof C18963) {
                    if (!((C18963) obj).m44046(sb)) {
                    }
                } else {
                    sb.append(obj);
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m44052(int i) {
        int iM44052 = i - 1;
        if (iM44052 <= 0) {
            return 0;
        }
        for (Object obj : this.f61483) {
            if ((obj instanceof C18963) && (iM44052 = ((C18963) obj).m44052(iM44052)) <= 0) {
                return 0;
            }
        }
        return iM44052;
    }
}
