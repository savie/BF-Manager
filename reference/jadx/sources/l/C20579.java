package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩵۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 47F8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20579 implements InterfaceC3359 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ArrayList f65906 = new ArrayList();

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ boolean mo6416() {
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47171(C4171 c4171) {
        this.f65906.add(c4171);
    }

    @Override // l.InterfaceC3359
    /* JADX INFO: renamed from: ۙ */
    public final void mo1599(InterfaceC9397 interfaceC9397) throws IOException {
        ArrayList<C4171> arrayList = this.f65906;
        C11388 c11388 = (C11388) interfaceC9397;
        c11388.m28735(arrayList.size());
        for (C4171 c4171 : arrayList) {
            c11388.m28735(c4171.m13334());
            c11388.m28735(c4171.m13333());
        }
    }

    @Override // l.InterfaceC3359
    public final int getLength() {
        return (this.f65906.size() * 2) + 1;
    }

    public final String toString() {
        ArrayList arrayList = this.f65906;
        return arrayList.size() > 0 ? C8947.m23910(new StringBuilder("{ "), (String) C1170.stream(arrayList).map(new C6081(4)).collect(C2025.joining(", ")), " }") : "";
    }
}
