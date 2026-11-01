package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K5RM */
/* JADX INFO: loaded from: classes3.dex */
public final class C4071 implements InterfaceC7600 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f14968;

    @Override // l.InterfaceC9012
    /* JADX INFO: renamed from: ۙ */
    public final C2184 mo4153(C2184 c2184, C15592 c15592) {
        return c2184;
    }

    public C4071(HashMap map) {
        this.f14968 = map;
    }

    @Override // l.InterfaceC10423
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7124 mo4154(C2184 c2184) {
        AbstractC7124 abstractC7124 = (AbstractC7124) this.f14968.get(c2184);
        return abstractC7124 != null ? abstractC7124 : c2184;
    }
}
