package l;

/* JADX INFO: renamed from: l.᩺᩵۬, reason: contains not printable characters */
/* JADX INFO: compiled from: H8BL */
/* JADX INFO: loaded from: classes.dex */
public final class C23200 extends C19113 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15439 f75301;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23200(C15439 c15439) {
        super(InterfaceC8530.f29532);
        this.f75301 = c15439;
    }

    @Override // l.C19113, l.InterfaceC7824
    /* JADX INFO: renamed from: ܰ */
    public final void mo18749(C13689 c13689, Exception exc) {
        boolean zM48547 = C21788.m48547(exc);
        C15439 c15439 = this.f75301;
        if (!zM48547 && !c15439.f50310 && !c15439.mo20296()) {
            C15439.m36950(c15439, c13689, c15439.f50313, c15439.f50318, c15439.f50320);
            return;
        }
        c15439.f50312 = false;
        c15439.f50316 = false;
        super.mo18749(c13689, exc);
    }

    @Override // l.C19113, l.InterfaceC7824
    /* JADX INFO: renamed from: ۙ */
    public final void mo18747(C13689 c13689, Exception exc) {
        C15439 c15439 = this.f75301;
        if (!c15439.f50310 && !c15439.mo20296()) {
            C15439.m36950(c15439, c13689, c15439.f50313, c15439.f50318, c15439.f50320);
            return;
        }
        c15439.f50312 = false;
        c15439.f50316 = false;
        super.mo18747(c13689, exc);
    }

    @Override // l.C19113, l.InterfaceC7824
    /* JADX INFO: renamed from: ۙ */
    public final void mo18748(C13689 c13689, C20979 c20979, long j) {
        C15439 c15439 = this.f75301;
        c15439.f50312 = false;
        c15439.f50316 = true;
        super.mo18748(c13689, c20979, j);
    }
}
