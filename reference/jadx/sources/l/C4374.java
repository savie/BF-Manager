package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7FD */
/* JADX INFO: loaded from: classes3.dex */
public final class C4374 extends C12925 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C9398 f15617;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f15618;

    public C4374(C9398 c9398) {
        super(c9398.f20884, EnumC16783.f53750);
        this.f15618 = new ArrayList();
        this.f15617 = c9398;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12227(C15187 c15187, C15187 c15188, C15187 c15189, ArrayList arrayList) {
        int iM52516 = EnumC23839.m52516(EnumC23839.f77044, EnumC23839.f77049, EnumC23839.f77068);
        C9398 c9398 = this.f15617;
        C3150 c3150 = new C3150(c9398, c9398.m24134(iM52516, c15187, c15188));
        if (arrayList != null) {
            c3150.m17092(arrayList);
        }
        if (c15189 != null) {
            c3150.m17093(c15189);
        }
        this.f15618.add(c3150);
    }

    public final boolean isEmpty() {
        return this.f15618.isEmpty();
    }

    @Override // l.C12925, l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        super.mo2341(interfaceC19275);
        ArrayList arrayList = this.f15618;
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51770(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C3150) it.next()).m9545(c23509);
        }
    }

    @Override // l.C12925
    /* JADX INFO: renamed from: ۨ */
    public final int mo7125() {
        return C9030.stream(this.f15618).mapToInt(new C9502()).sum() + 2;
    }
}
