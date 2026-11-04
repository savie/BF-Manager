package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JO */
/* JADX INFO: loaded from: classes5.dex */
public final class C17013 extends AbstractC13284 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC12888 f55584;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15258 f55585;

    public C17013(int i, C15258 c15258, InterfaceC12888 interfaceC12888) {
        super(i, -1);
        this.f55584 = interfaceC12888;
        this.f55585 = c15258;
    }

    @Override // l.AbstractC19734
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4982(C2161 c2161) throws IOException {
        c2161.getClass();
        c2161.write(".restart local ", 0, 15);
        InterfaceC12888 interfaceC12888 = this.f55584;
        this.f55585.m36610(c2161, interfaceC12888.mo6025());
        String name = interfaceC12888.getName();
        String type = interfaceC12888.getType();
        String signature = interfaceC12888.getSignature();
        if (name == null && type == null && signature == null) {
            return true;
        }
        c2161.write("  # ", 0, 4);
        C25219.m56227(c2161, name, type, signature);
        return true;
    }
}
