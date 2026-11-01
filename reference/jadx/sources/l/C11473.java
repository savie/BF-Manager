package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۨۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H16C */
/* JADX INFO: loaded from: classes3.dex */
public final class C11473 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C18623 f38620 = new C18623();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C18623 f38621 = new C18623();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(((C11473) obj).f38621.size(), this.f38621.size());
    }

    public C11473(C7807 c7807, C5122 c5122) {
        m28661(c7807.getAnnotations(), c5122);
        for (InterfaceC17822 interfaceC17822 : c7807.getFields()) {
            m28661(interfaceC17822.getAnnotations(), c5122);
            this.f38620.add(c5122.m14273(interfaceC17822));
        }
        for (InterfaceC18528 interfaceC18528 : c7807.getMethods()) {
            this.f38621.add(c5122.m14272(interfaceC18528));
            m28661(interfaceC18528.getAnnotations(), c5122);
            Iterator it = interfaceC18528.getParameters().iterator();
            while (it.hasNext()) {
                m28661(((InterfaceC19234) it.next()).getAnnotations(), c5122);
            }
            InterfaceC7945 interfaceC7945Mo25747 = interfaceC18528.mo25747();
            if (interfaceC7945Mo25747 != null) {
                for (InterfaceC1594 interfaceC1594 : interfaceC7945Mo25747.mo11508()) {
                    if (interfaceC1594 instanceof InterfaceC13859) {
                        m28662(((InterfaceC13859) interfaceC1594).getReference(), c5122);
                        if (interfaceC1594 instanceof InterfaceC17117) {
                            m28662(((InterfaceC17117) interfaceC1594).mo3896(), c5122);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28662(InterfaceC7446 interfaceC7446, C5122 c5122) {
        if (interfaceC7446 instanceof InterfaceC8858) {
            this.f38621.add(c5122.m14272((InterfaceC8858) interfaceC7446));
            return;
        }
        if (interfaceC7446 instanceof InterfaceC18735) {
            this.f38620.add(c5122.m14273((InterfaceC18735) interfaceC7446));
            return;
        }
        if (interfaceC7446 instanceof InterfaceC8152) {
            m28662(((InterfaceC8152) interfaceC7446).mo20680(), c5122);
            return;
        }
        if (interfaceC7446 instanceof InterfaceC18029) {
            InterfaceC18029 interfaceC18029 = (InterfaceC18029) interfaceC7446;
            m28662(interfaceC18029.mo19719().mo20680(), c5122);
            Iterator it = interfaceC18029.mo19720().iterator();
            while (it.hasNext()) {
                m28663((InterfaceC10975) it.next(), c5122);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28661(Set set, C5122 c5122) {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((InterfaceC3710) it.next()).getElements().iterator();
            while (it2.hasNext()) {
                m28663(((InterfaceC6533) it2.next()).getValue(), c5122);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28663(InterfaceC10975 interfaceC10975, C5122 c5122) {
        int iMo2656 = interfaceC10975.mo2656();
        if (iMo2656 != 22) {
            switch (iMo2656) {
                case 25:
                    m28662(((InterfaceC14503) interfaceC10975).getValue(), c5122);
                    break;
                case 26:
                    m28662(((InterfaceC4354) interfaceC10975).getValue(), c5122);
                    break;
                case 27:
                    m28662(((InterfaceC23675) interfaceC10975).getValue(), c5122);
                    break;
                case 28:
                    Iterator it = ((InterfaceC0390) interfaceC10975).getValue().iterator();
                    while (it.hasNext()) {
                        m28663((InterfaceC10975) it.next(), c5122);
                    }
                    break;
                case 29:
                    Iterator it2 = ((InterfaceC20147) interfaceC10975).getElements().iterator();
                    while (it2.hasNext()) {
                        m28663(((InterfaceC6533) it2.next()).getValue(), c5122);
                    }
                    break;
            }
            return;
        }
        m28662(((InterfaceC13528) interfaceC10975).getValue(), c5122);
    }
}
