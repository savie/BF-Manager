package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ֫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes5.dex */
public final class C17034 implements InterfaceC6387 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f54417;

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ boolean mo2342() {
        return true;
    }

    @Override // l.InterfaceC4705
    /* JADX INFO: renamed from: ۙ */
    public final void mo2341(InterfaceC19275 interfaceC19275) throws IOException {
        C23509 c23509 = (C23509) interfaceC19275;
        c23509.m51765((int) EnumC3046.AE_ARRAY.m9142());
        ArrayList arrayList = this.f54417;
        c23509.m51770(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC4705) it.next()).mo2341(c23509);
        }
    }

    @Override // l.InterfaceC4705
    public final int getLength() {
        return C9030.stream(this.f54417).flatMapToInt(new C12096()).sum() + 3;
    }

    @Override // l.InterfaceC6387
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC4705 mo15810(C12738 c12738) {
        Iterator it = this.f54417.iterator();
        while (it.hasNext()) {
            C17676.m41156((InterfaceC4705) it.next(), c12738);
        }
        return this;
    }
}
