package l;

import java.util.Map;

/* JADX INFO: renamed from: l.᩺֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes2.dex */
public final class C22639 extends AbstractC14878 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8528 f73775;

    @Override // l.AbstractC11350
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC11350 mo6775(C4603 c4603, AbstractC5930 abstractC5930) {
        C8378 c8378 = (C8378) this.f38291;
        Map map = this.f38293;
        return new C22639(this.f73775, (C8378) abstractC5930, c4603, c8378, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22639(C8528 c8528, C8378 c8378, C4603 c4603, C8378 c8379, Map map) {
        super(c8528, c8378, c4603, c8379, map);
        this.f73775 = c8528;
    }

    @Override // l.AbstractC14878
    /* JADX INFO: renamed from: ۨ */
    public final C1116 mo35573(C1116 c1116) {
        C6761 c6761 = this.f73775.f29530;
        C8378 c8378 = (C8378) this.f38291;
        AbstractC0618 abstractC0618 = c8378.f29095.f30190.f53222;
        InterfaceC18195 interfaceC18195 = c1116.f5037;
        c6761.getClass();
        return c1116.mo4136(new C12531(c6761, interfaceC18195, c8378, abstractC0618));
    }

    @Override // l.AbstractC14878
    /* JADX INFO: renamed from: ۛۙ */
    public final AbstractC16579 mo35572() {
        AbstractC16579 abstractC16579 = ((C8378) this.f38291).f29100;
        return abstractC16579 != null ? abstractC16579.mo5593() : this.f73775.f29529.f14261;
    }
}
