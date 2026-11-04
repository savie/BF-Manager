package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۚᩴ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes3.dex */
public final class C5860 implements InterfaceC5597 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f20100;

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean mo6416() {
        return true;
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28735((int) EnumC15863.AE_ARRAY.m37827());
        ArrayList arrayList = this.f20100;
        c11388.m28740(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC3359) it.next()).mo1599(c11388);
        }
    }

    @Override // l.InterfaceC3359
    public final int getLength() {
        return C1170.stream(this.f20100).flatMapToInt(new C13317()).sum() + 3;
    }

    @Override // l.InterfaceC5597
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC3359 mo7367(C15291 c15291) {
        Iterator it = this.f20100.iterator();
        while (it.hasNext()) {
            C13054.m32519((InterfaceC3359) it.next(), c15291);
        }
        return this;
    }
}
