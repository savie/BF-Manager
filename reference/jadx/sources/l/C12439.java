package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: S7FD */
/* JADX INFO: loaded from: classes4.dex */
public final class C12439 extends C14618 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f39988;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C17355 f39989;

    public C12439(C17355 c17355) {
        super(c17355.f20376, EnumC13127.f41966);
        this.f39988 = new ArrayList();
        this.f39989 = c17355;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30912(C7660 c7660, C7660 c7661, C7660 c7662, ArrayList arrayList) {
        int iM39773 = EnumC16856.m39773(EnumC16856.f54368, EnumC16856.f54378, EnumC16856.f54345);
        C17355 c17355 = this.f39989;
        C20644 c20644 = new C20644(c17355, c17355.m40772(iM39773, c7660, c7661));
        if (arrayList != null) {
            c20644.m17323(arrayList);
        }
        if (c7662 != null) {
            c20644.m17324(c7662);
        }
        this.f39988.add(c20644);
    }

    public final boolean isEmpty() {
        return this.f39988.isEmpty();
    }

    @Override // l.C14618, l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        super.mo1599(interfaceC9397);
        ArrayList arrayList = this.f39988;
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28740(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C20644) it.next()).m47261(c11388);
        }
    }

    @Override // l.C14618
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1603() {
        return C1170.stream(this.f39988).mapToInt(new C3490()).sum() + 2;
    }
}
