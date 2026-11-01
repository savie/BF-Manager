package l;

/* JADX INFO: renamed from: l.۬۬, reason: contains not printable characters */
/* JADX INFO: compiled from: U50M */
/* JADX INFO: loaded from: classes4.dex */
public final class C13123 extends AbstractViewOnTouchListenerC9658 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC6772 f43704;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13123(ViewOnClickListenerC6772 viewOnClickListenerC6772) {
        super(viewOnClickListenerC6772);
        this.f43704 = viewOnClickListenerC6772;
    }

    @Override // l.AbstractViewOnTouchListenerC9658
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6503 mo23973() {
        AbstractC3949 abstractC3949 = this.f43704.f22867;
        if (abstractC3949 != null) {
            return abstractC3949.mo11433();
        }
        return null;
    }

    @Override // l.AbstractViewOnTouchListenerC9658
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo23975() {
        InterfaceC6503 interfaceC6503Mo23973;
        ViewOnClickListenerC6772 viewOnClickListenerC6772 = this.f43704;
        InterfaceC16651 interfaceC16651 = viewOnClickListenerC6772.f22868;
        return interfaceC16651 != null && interfaceC16651.mo26120(viewOnClickListenerC6772.f22871) && (interfaceC6503Mo23973 = mo23973()) != null && interfaceC6503Mo23973.isShowing();
    }
}
