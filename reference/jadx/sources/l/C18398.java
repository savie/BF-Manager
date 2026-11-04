package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܿܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4PY */
/* JADX INFO: loaded from: classes5.dex */
public final class C18398 implements InterfaceC10939 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f59936;

    @Override // l.InterfaceC4974
    /* JADX INFO: renamed from: ۙ */
    public final C4448 mo5056(C4448 c4448, C20022 c20022) {
        return c4448;
    }

    public C18398(HashMap map) {
        this.f59936 = map;
    }

    @Override // l.InterfaceC22128
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo5057(C4448 c4448) {
        AbstractC11071 abstractC11071 = (AbstractC11071) this.f59936.get(c4448);
        return abstractC11071 == null ? c4448 : abstractC11071.clone();
    }
}
