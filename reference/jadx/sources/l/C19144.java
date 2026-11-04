package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ᩳܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94T8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19144 implements InterfaceC10939 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f61959;

    @Override // l.InterfaceC4974
    /* JADX INFO: renamed from: ۙ */
    public final C4448 mo5056(C4448 c4448, C20022 c20022) {
        return c4448;
    }

    public C19144(HashMap map) {
        this.f61959 = map;
    }

    @Override // l.InterfaceC22128
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11071 mo5057(C4448 c4448) {
        C4448 c4449 = (C4448) this.f61959.get(c4448);
        return c4449 == null ? c4448 : c4449;
    }
}
