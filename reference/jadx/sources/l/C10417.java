package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C6I0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10417 extends AbstractC6683 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m26729(List list, C2551 c2551, InterfaceC18213 interfaceC18213) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C12971 c12971 = (C12971) it.next();
            C21943 c21943M32379 = c12971.m32379();
            if (interfaceC18213.mo19035().contains(c21943M32379)) {
                if (!m26730(interfaceC18213, c12971, c21943M32379)) {
                    c2551.m31136("Can't wrap try/catch for region: " + interfaceC18213);
                }
                list.remove(c12971);
                return !list.isEmpty();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m26730(InterfaceC18213 interfaceC18213, C12971 c12971, C21943 c21943) {
        if (interfaceC18213 != null) {
            if (interfaceC18213 instanceof C6831) {
                return m26730(((C6831) interfaceC18213).m19038(), c12971, c21943);
            }
            if (interfaceC18213 instanceof InterfaceC3297) {
                return m26730(interfaceC18213.getParent(), c12971, c21943);
            }
            C12050 c12050 = new C12050(interfaceC18213);
            List listMo19035 = interfaceC18213.mo19035();
            Iterator it = listMo19035.iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC6281 interfaceC6281 = (InterfaceC6281) it.next();
                if (C20531.m47072(c21943, interfaceC6281)) {
                    Iterator it2 = c12971.m32377().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z = false;
                            break;
                        }
                        C21943 c21943M45368 = ((C19684) it2.next()).m45368();
                        if (c21943M45368 != null && !c21943M45368.mo17865(EnumC1763.REMOVE)) {
                            C21943 c21943M47065 = C20531.m47065(interfaceC6281);
                            if (c21943M47065 != null ? C23231.m52193(c21943M45368, c21943M47065) : false) {
                                break;
                            }
                        }
                    }
                    if (!z) {
                        c12050.m30228(interfaceC6281);
                    }
                }
            }
            if (!((ArrayList) c12050.mo19035()).isEmpty()) {
                C18017 c18017 = new C18017(interfaceC18213, c12050);
                c12050.mo42361((AbstractC20255) c18017);
                c18017.m41997(c12971);
                if (interfaceC18213.mo19029((InterfaceC6281) ((ArrayList) c12050.mo19035()).get(0), c18017)) {
                    listMo19035.removeAll(c12050.mo19035());
                    for (InterfaceC6281 interfaceC6282 : (ArrayList) c12050.mo19035()) {
                        if (interfaceC6282 instanceof AbstractC20255) {
                            ((AbstractC20255) interfaceC6282).mo42361((AbstractC20255) c12050);
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
