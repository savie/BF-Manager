package l;

/* JADX INFO: renamed from: l.ۧۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U50M */
/* JADX INFO: loaded from: classes4.dex */
public final class C11390 extends AbstractViewOnTouchListenerC5028 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC16611 f35849;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11390(ViewOnClickListenerC16611 viewOnClickListenerC16611) {
        super(viewOnClickListenerC16611);
        this.f35849 = viewOnClickListenerC16611;
    }

    @Override // l.AbstractViewOnTouchListenerC5028
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC16501 mo12194() {
        AbstractC24817 abstractC24817 = this.f35849.f53720;
        if (abstractC24817 != null) {
            return abstractC24817.mo18987();
        }
        return null;
    }

    @Override // l.AbstractViewOnTouchListenerC5028
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo12195() {
        InterfaceC16501 interfaceC16501Mo12194;
        ViewOnClickListenerC16611 viewOnClickListenerC16611 = this.f35849;
        InterfaceC18849 interfaceC18849 = viewOnClickListenerC16611.f53722;
        return interfaceC18849 != null && interfaceC18849.mo12636(viewOnClickListenerC16611.f53719) && (interfaceC16501Mo12194 = mo12194()) != null && interfaceC16501Mo12194.isShowing();
    }
}
