package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1EB */
/* JADX INFO: loaded from: classes4.dex */
public class C10320 implements InterfaceC8829 {
    @Override // l.InterfaceC8829
    /* JADX INFO: renamed from: ۙ */
    public void mo2774(InterfaceC18525 interfaceC18525, InterfaceC8697 interfaceC8697, C2863 c2863, C1372 c1372) {
        if (!interfaceC8697.mo18155()) {
            throw new RuntimeException();
        }
        interfaceC18525.mo14234("complex");
        interfaceC18525.mo14233("name", interfaceC8697.mo18156());
        if (interfaceC8697.getParent() != 0) {
            interfaceC18525.mo14233("parent", C11293.m28557(interfaceC8697.getParent()));
        }
        C14049.m34216(interfaceC18525, interfaceC8697, c1372);
        Iterator it = interfaceC8697.values().iterator();
        while (it.hasNext()) {
            m26592(interfaceC18525, (InterfaceC5650) it.next(), c2863);
        }
        interfaceC18525.mo14232("complex");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26592(InterfaceC18525 interfaceC18525, InterfaceC5650 interfaceC5650, C2863 c2863) {
        String strM34212 = C14049.m34212(interfaceC5650);
        interfaceC18525.mo14234(strM34212);
        if (interfaceC5650.mo16637() != -1) {
            interfaceC18525.mo14233("id", C11293.m28557(interfaceC5650.mo16637()));
        }
        C14049.m34213(interfaceC18525, C14049.m34210(c2863, interfaceC5650));
        interfaceC18525.mo14232(strM34212);
    }
}
