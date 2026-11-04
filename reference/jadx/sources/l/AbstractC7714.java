package l;

/* JADX INFO: renamed from: l.۟ۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K593 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7714 implements InterfaceC9376 {
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC9376 interfaceC9376 = (InterfaceC9376) obj;
        String strMo11196 = mo11196();
        if (strMo11196 == null) {
            if (interfaceC9376.mo11196() != null) {
                return 1;
            }
        } else {
            if (interfaceC9376.mo11196() == null) {
                return -1;
            }
            int iCompareTo = strMo11196.compareTo(interfaceC9376.mo11196());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.compare(mo11197(), interfaceC9376.mo11197());
    }

    @Override // l.InterfaceC9376
    /* JADX INFO: renamed from: ۢ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC19775 mo20989() {
        String strMo11196 = mo11196();
        if (strMo11196 == null) {
            return null;
        }
        return new C0256(strMo11196);
    }

    public final int hashCode() {
        String strMo11196 = mo11196();
        return mo11197() + ((strMo11196 == null ? 0 : strMo11196.hashCode()) * 31);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC9376) {
            InterfaceC9376 interfaceC9376 = (InterfaceC9376) obj;
            if (C17359.equals(mo11196(), interfaceC9376.mo11196()) && mo11197() == interfaceC9376.mo11197()) {
                return true;
            }
        }
        return false;
    }
}
