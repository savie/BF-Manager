package l;

/* JADX INFO: renamed from: l.ۡۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBF2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8677 extends C5541 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C8677 f29876 = new C8677(0);

    @Override // l.C5541, l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return m22504("", "");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m22504(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        int size = size();
        sb.append(str);
        sb.append(str2);
        sb.append("catch ");
        for (int i = 0; i < size; i++) {
            C19260 c19260 = (C19260) m15249(i);
            if (i != 0) {
                C0219.m1594(sb, ",\n", str, EnumC19730.f63352);
            }
            if (i == size - 1 && m22503()) {
                sb.append("<any>");
            } else {
                sb.append(c19260.m44204().mo2376());
            }
            sb.append(" -> ");
            int iM44202 = c19260.m44202();
            sb.append(iM44202 == ((char) iM44202) ? C22475.m49982(iM44202) : C22475.m49978(iM44202));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m22503() {
        int size = size();
        if (size == 0) {
            return false;
        }
        return ((C19260) m15249(size - 1)).m44204().equals(C6143.f20966);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22502(int i, C6143 c6143, int i2) {
        m15252(i, new C19260(c6143, i2));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C8677 c8677) {
        if (this == c8677) {
            return 0;
        }
        int size = size();
        int size2 = c8677.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = ((C19260) m15249(i)).compareTo((C19260) c8677.m15249(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (size < size2) {
            return -1;
        }
        return size > size2 ? 1 : 0;
    }
}
