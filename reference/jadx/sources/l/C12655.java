package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 36GE */
/* JADX INFO: loaded from: classes4.dex */
public final class C12655 extends AbstractC6683 {
    @Override // l.AbstractC6683, l.InterfaceC14892
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo7323(C2551 c2551, InterfaceC18213 interfaceC18213) {
        if (!(interfaceC18213 instanceof C12050)) {
            return true;
        }
        C1170.removeIf((ArrayList) ((C12050) interfaceC18213).mo19035(), new C20860());
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m31429(InterfaceC6281 interfaceC6281) {
        if (interfaceC6281.mo17865(EnumC1763.DONT_GENERATE)) {
            return true;
        }
        if (interfaceC6281 instanceof C21943) {
            return ((ArrayList) ((C21943) interfaceC6281).mo1986()).isEmpty();
        }
        if (((interfaceC6281 instanceof C6831) && ((C6831) interfaceC6281).m19033()) || !(interfaceC6281 instanceof InterfaceC18213)) {
            return false;
        }
        Iterator it = ((InterfaceC18213) interfaceC6281).mo19035().iterator();
        while (it.hasNext()) {
            if (!m31429((InterfaceC6281) it.next())) {
                return false;
            }
        }
        return true;
    }
}
