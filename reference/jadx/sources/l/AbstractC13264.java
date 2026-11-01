package l;

/* JADX INFO: renamed from: l.۬ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K593 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13264 implements InterfaceC21350 {
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC21350 interfaceC21350 = (InterfaceC21350) obj;
        String strMo6347 = mo6347();
        if (strMo6347 == null) {
            if (interfaceC21350.mo6347() != null) {
                return 1;
            }
        } else {
            if (interfaceC21350.mo6347() == null) {
                return -1;
            }
            int iCompareTo = strMo6347.compareTo(interfaceC21350.mo6347());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.compare(mo6346(), interfaceC21350.mo6346());
    }

    @Override // l.InterfaceC21350
    /* JADX INFO: renamed from: ۛܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC15914 mo32743() {
        String strMo6347 = mo6347();
        if (strMo6347 == null) {
            return null;
        }
        return new C1268(strMo6347);
    }

    public final int hashCode() {
        String strMo6347 = mo6347();
        return mo6346() + ((strMo6347 == null ? 0 : strMo6347.hashCode()) * 31);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC21350) {
            InterfaceC21350 interfaceC21350 = (InterfaceC21350) obj;
            if (C13638.equals(mo6347(), interfaceC21350.mo6347()) && mo6346() == interfaceC21350.mo6346()) {
                return true;
            }
        }
        return false;
    }
}
