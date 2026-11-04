package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۛ۬ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37CY */
/* JADX INFO: loaded from: classes3.dex */
public class C6416 extends C14618 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f21636;

    public C6416(C15291 c15291, EnumC13127 enumC13127, List list) {
        super(c15291, enumC13127);
        this.f21636 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f21636.add(mo35261((C7660) it.next(), c15291));
        }
    }

    @Override // l.C14618
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1603() {
        return (this.f21636.size() * 2) + 2;
    }

    @Override // l.C14618, l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        super.mo1599(interfaceC9397);
        ArrayList arrayList = this.f21636;
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28740(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c11388.m28740(((C7660) it.next()).f67820);
        }
    }
}
