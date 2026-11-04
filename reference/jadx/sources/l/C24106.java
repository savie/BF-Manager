package l;

/* JADX INFO: renamed from: l.᩺ۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBF2 */
/* JADX INFO: loaded from: classes.dex */
public final class C24106 extends C12763 implements Comparable {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C24106 f77933 = new C24106(0);

    @Override // l.C12763, l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return m53657("", "");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m53657(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        int size = size();
        sb.append(str);
        sb.append(str2);
        sb.append("catch ");
        for (int i = 0; i < size; i++) {
            C6206 c6206 = (C6206) m31593(i);
            if (i != 0) {
                C22121.m50078(sb, ",\n", str, EnumC7687.f25319);
            }
            if (i == size - 1 && m53656()) {
                sb.append("<any>");
            } else {
                sb.append(c6206.m17845().mo1843());
            }
            sb.append(" -> ");
            int iM17843 = c6206.m17843();
            sb.append(iM17843 == ((char) iM17843) ? C5306.m15934(iM17843) : C5306.m15938(iM17843));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m53656() {
        int size = size();
        if (size == 0) {
            return false;
        }
        return ((C6206) m31593(size - 1)).m17845().equals(C1028.f3733);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53655(int i, C1028 c1028, int i2) {
        m31596(i, new C6206(c1028, i2));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C24106 c24106) {
        if (this == c24106) {
            return 0;
        }
        int size = size();
        int size2 = c24106.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = ((C6206) m31593(i)).compareTo((C6206) c24106.m31593(i));
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
