package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.ۡ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6G1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9671 extends AbstractC11821 {
    @Override // l.AbstractC11821, l.InterfaceC14892
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo7323(C2551 c2551, InterfaceC18213 interfaceC18213) {
        super.mo7323(c2551, interfaceC18213);
        return !(interfaceC18213 instanceof C14287);
    }

    @Override // l.AbstractC11821
    /* JADX INFO: renamed from: ۙ */
    public final void mo2799(C2551 c2551, InterfaceC23435 interfaceC23435, InterfaceC18213 interfaceC18213) {
        InterfaceC6281 interfaceC6281;
        if (interfaceC23435.getClass() != C21943.class) {
            return;
        }
        C21943 c21943 = (C21943) interfaceC23435;
        if (c21943.mo17865(EnumC1763.RETURN)) {
            ArrayList arrayList = (ArrayList) c21943.mo1986();
            if (arrayList.size() == 1) {
                if (c2551.m8528() != 0) {
                    if (c2551.m8548(c21943) != null) {
                        return;
                    }
                    Iterator it = m29668().iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC18213) it.next()).getClass() == C6831.class) {
                            return;
                        }
                    }
                }
                InterfaceC6281 interfaceC6282 = c21943;
                for (InterfaceC18213 interfaceC18214 : m29668()) {
                    if (!(interfaceC18214 instanceof InterfaceC3297)) {
                        List listMo19035 = interfaceC18214.mo19035();
                        if (listMo19035.isEmpty()) {
                            continue;
                        } else {
                            ListIterator listIterator = listMo19035.listIterator(listMo19035.size());
                            while (listIterator.hasPrevious() && (interfaceC6281 = (InterfaceC6281) listIterator.previous()) != interfaceC6282) {
                                if (!m25245(interfaceC6281)) {
                                    return;
                                }
                            }
                        }
                    }
                    interfaceC6282 = interfaceC18214;
                }
                arrayList.remove(0);
                c21943.m39418(EnumC1763.RETURN);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m25245(InterfaceC6281 interfaceC6281) {
        if (interfaceC6281 instanceof InterfaceC23435) {
            InterfaceC23435 interfaceC23435 = (InterfaceC23435) interfaceC6281;
            return interfaceC23435.mo1986().isEmpty() || interfaceC23435.mo17865(EnumC1763.RETURN);
        }
        if (interfaceC6281 instanceof InterfaceC18213) {
            Iterator it = ((InterfaceC18213) interfaceC6281).mo19035().iterator();
            while (it.hasNext()) {
                if (!m25245((InterfaceC6281) it.next())) {
                    return false;
                }
            }
            return true;
        }
        throw new C8597("Unknown container type: " + interfaceC6281.getClass());
    }
}
