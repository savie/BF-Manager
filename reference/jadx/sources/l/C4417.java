package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47F8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4417 implements InterfaceC4705 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f15716 = new ArrayList();

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo2342() {
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12344(C5123 c5123) {
        this.f15716.add(c5123);
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        ArrayList<C5123> arrayList = this.f15716;
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51765(arrayList.size());
        for (C5123 c5123 : arrayList) {
            c23509.m51765(c5123.m14275());
            c23509.m51765(c5123.m14274());
        }
    }

    @Override // l.InterfaceC4705
    public final int getLength() {
        return (this.f15716.size() * 2) + 1;
    }

    public final String toString() {
        ArrayList arrayList = this.f15716;
        return arrayList.size() > 0 ? C22697.m50267(new StringBuilder("{ "), (String) C9030.stream(arrayList).map(new C2963(0)).collect(C1890.joining(", ")), " }") : "";
    }
}
