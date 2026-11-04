package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۚᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4KR */
/* JADX INFO: loaded from: classes3.dex */
public final class C5827 extends AbstractC13284 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C15258 f20044;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22585 f20045;

    public C5827(int i, C15258 c15258, InterfaceC22585 interfaceC22585) {
        super(i, -1);
        this.f20045 = interfaceC22585;
        this.f20044 = c15258;
    }

    @Override // l.AbstractC19734
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4982(C2161 c2161) throws IOException {
        c2161.getClass();
        c2161.write(".end local ", 0, 11);
        InterfaceC22585 interfaceC22585 = this.f20045;
        this.f20044.m36610(c2161, interfaceC22585.mo26041());
        String name = interfaceC22585.getName();
        String type = interfaceC22585.getType();
        String signature = interfaceC22585.getSignature();
        if (name == null && type == null && signature == null) {
            return true;
        }
        c2161.write("  # ", 0, 4);
        C25219.m56227(c2161, name, type, signature);
        return true;
    }
}
