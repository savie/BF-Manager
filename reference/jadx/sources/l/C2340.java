package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CY */
/* JADX INFO: loaded from: classes3.dex */
public class C2340 extends C12925 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f8275;

    public C2340(C12738 c12738, EnumC16783 enumC16783, List list) {
        super(c12738, enumC16783);
        this.f8275 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f8275.add(mo32011((C15187) it.next(), c12738));
        }
    }

    @Override // l.C12925
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo7125() {
        return (this.f8275.size() * 2) + 2;
    }

    @Override // l.C12925, l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        super.mo2341(interfaceC19275);
        ArrayList arrayList = this.f8275;
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51770(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c23509.m51770(((C15187) it.next()).f43854);
        }
    }
}
