package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܶᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5TS */
/* JADX INFO: loaded from: classes5.dex */
public final class C16267 extends AbstractC13284 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC1702 f52853;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15258 f52854;

    public C16267(int i, C15258 c15258, InterfaceC1702 interfaceC1702) {
        super(i, -1);
        this.f52853 = interfaceC1702;
        this.f52854 = c15258;
    }

    @Override // l.AbstractC19734
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4982(C2161 c2161) throws IOException {
        c2161.getClass();
        c2161.write(".local ", 0, 7);
        InterfaceC1702 interfaceC1702 = this.f52853;
        this.f52854.m36610(c2161, interfaceC1702.mo6062());
        String name = interfaceC1702.getName();
        String type = interfaceC1702.getType();
        String signature = interfaceC1702.getSignature();
        if (name == null && type == null && signature == null) {
            return true;
        }
        c2161.write(", ", 0, 2);
        C25219.m56227(c2161, name, type, signature);
        return true;
    }
}
