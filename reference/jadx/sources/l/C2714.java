package l;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۖᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W403 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2714 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C16576 f10447 = new C16576();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12260 f10448 = new C14005();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC12260 f10449;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashMap f10450;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C2714 m8268(C12343 c12343) {
        C16576 c16576 = f10447;
        C2714 c2714 = (C2714) c12343.m30656(c16576);
        if (c2714 != null) {
            return c2714;
        }
        C2714 c2715 = new C2714();
        c2715.f10450 = new HashMap();
        c12343.m30659(c16576, c2715);
        c2715.f10449 = f10448;
        return c2715;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8272(InterfaceC11888 interfaceC11888) {
        HashMap map = this.f10450;
        InterfaceC12260 interfaceC12260 = this.f10449;
        if (interfaceC12260 == f10448) {
            interfaceC11888.mo5925();
            return;
        }
        C19003 c19003 = (C19003) map.get(interfaceC12260);
        if (c19003 == null) {
            InterfaceC12260 interfaceC12261 = this.f10449;
            C19003 c19004 = new C19003();
            map.put(interfaceC12261, c19004);
            c19003 = c19004;
        }
        c19003.m43723(interfaceC11888);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8271(AbstractC8774 abstractC8774) {
        HashMap map = this.f10450;
        C19003 c19003 = (C19003) map.get(abstractC8774);
        if (c19003 != null) {
            Iterator it = c19003.iterator();
            while (it.hasNext()) {
                ((InterfaceC11888) it.next()).mo5925();
            }
            map.remove(abstractC8774);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12260 m8269() {
        InterfaceC12260 interfaceC12260 = this.f10449;
        this.f10449 = f10448;
        return interfaceC12260;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12260 m8270(InterfaceC12260 interfaceC12260) {
        InterfaceC12260 interfaceC12261 = this.f10449;
        this.f10449 = interfaceC12260;
        return interfaceC12261;
    }
}
