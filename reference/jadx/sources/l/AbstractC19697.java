package l;

/* JADX INFO: renamed from: l.ᩴ۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AXL */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19697 extends C15374 implements InterfaceC4825, InterfaceC2543 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11536 f63422;

    @Override // l.InterfaceC4825
    /* JADX INFO: renamed from: ۙ */
    public final void mo8188(Object obj) {
        Throwable thM51055 = C22660.m51055(obj);
        if (thM51055 != null) {
            obj = new C12238(thM51055, false);
        }
        Object objM36826 = m36826(obj);
        if (objM36826 == C13137.f42023) {
            return;
        }
        mo5179(objM36826);
    }

    @Override // l.C15374
    /* JADX INFO: renamed from: ۙ */
    public final String mo36818() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public AbstractC19697(InterfaceC11536 interfaceC11536, boolean z) {
        super(z);
        m36820((InterfaceC9211) interfaceC11536.mo5005(C1009.f3674));
        this.f63422 = interfaceC11536.mo5006(this);
    }

    @Override // l.InterfaceC4825
    public final InterfaceC11536 getContext() {
        return this.f63422;
    }

    @Override // l.C15374
    /* JADX INFO: renamed from: ۫ */
    public final void mo36825(Object obj) {
        if (obj instanceof C12238) {
            ((C12238) obj).m30570();
        }
    }

    @Override // l.C15374
    /* JADX INFO: renamed from: ۙ */
    public final void mo36821(C13377 c13377) {
        C9254.m24437(c13377, this.f63422);
    }
}
