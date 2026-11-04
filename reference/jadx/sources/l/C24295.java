package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺۫ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: H16C */
/* JADX INFO: loaded from: classes.dex */
public final class C24295 implements Comparable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C18037 f78631 = new C18037(0);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C18037 f78632 = new C18037(0);

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(((C24295) obj).f78632.size(), this.f78632.size());
    }

    public C24295(C22737 c22737, C14597 c14597) {
        m54309(c22737.getAnnotations(), c14597);
        for (InterfaceC2665 interfaceC2665 : c22737.getFields()) {
            m54309(interfaceC2665.getAnnotations(), c14597);
            this.f78631.add(c14597.m35236(interfaceC2665));
        }
        for (InterfaceC8631 interfaceC8631 : c22737.getMethods()) {
            this.f78632.add(c14597.m35235(interfaceC8631));
            m54309(interfaceC8631.getAnnotations(), c14597);
            Iterator it = interfaceC8631.getParameters().iterator();
            while (it.hasNext()) {
                m54309(((InterfaceC13851) it.next()).getAnnotations(), c14597);
            }
            InterfaceC7140 interfaceC7140Mo13175 = interfaceC8631.mo13175();
            if (interfaceC7140Mo13175 != null) {
                for (InterfaceC23331 interfaceC23331 : interfaceC7140Mo13175.mo2840()) {
                    if (interfaceC23331 instanceof InterfaceC6177) {
                        m54310(((InterfaceC6177) interfaceC23331).getReference(), c14597);
                        if (interfaceC23331 instanceof InterfaceC11396) {
                            m54310(((InterfaceC11396) interfaceC23331).mo2769(), c14597);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54310(InterfaceC10824 interfaceC10824, C14597 c14597) {
        if (interfaceC10824 instanceof InterfaceC4859) {
            this.f78632.add(c14597.m35235((InterfaceC4859) interfaceC10824));
            return;
        }
        if (interfaceC10824 instanceof InterfaceC8304) {
            this.f78631.add(c14597.m35236((InterfaceC8304) interfaceC10824));
            return;
        }
        if (interfaceC10824 instanceof InterfaceC6813) {
            m54310(((InterfaceC6813) interfaceC10824).mo17434(), c14597);
            return;
        }
        if (interfaceC10824 instanceof InterfaceC2338) {
            InterfaceC2338 interfaceC2338 = (InterfaceC2338) interfaceC10824;
            m54310(interfaceC2338.mo7875().mo17434(), c14597);
            Iterator it = interfaceC2338.mo7876().iterator();
            while (it.hasNext()) {
                m54311((InterfaceC16791) it.next(), c14597);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54309(Set set, C14597 c14597) {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((InterfaceC7886) it.next()).getElements().iterator();
            while (it2.hasNext()) {
                m54311(((InterfaceC19073) it2.next()).getValue(), c14597);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54311(InterfaceC16791 interfaceC16791, C14597 c14597) {
        int iMo5414 = interfaceC16791.mo5414();
        if (iMo5414 != 22) {
            switch (iMo5414) {
                case 25:
                    m54310(((InterfaceC16045) interfaceC16791).getValue(), c14597);
                    break;
                case 26:
                    m54310(((InterfaceC12316) interfaceC16791).getValue(), c14597);
                    break;
                case 27:
                    m54310(((InterfaceC17537) interfaceC16791).getValue(), c14597);
                    break;
                case 28:
                    Iterator it = ((InterfaceC13062) interfaceC16791).getValue().iterator();
                    while (it.hasNext()) {
                        m54311((InterfaceC16791) it.next(), c14597);
                    }
                    break;
                case 29:
                    Iterator it2 = ((InterfaceC15299) interfaceC16791).getElements().iterator();
                    while (it2.hasNext()) {
                        m54311(((InterfaceC19073) it2.next()).getValue(), c14597);
                    }
                    break;
            }
            return;
        }
        m54310(((InterfaceC6351) interfaceC16791).getValue(), c14597);
    }
}
