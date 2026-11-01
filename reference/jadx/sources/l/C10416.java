package l;

/* JADX INFO: renamed from: l.ۤܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10416 implements InterfaceC17295 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC16060 f35609;

    public /* synthetic */ C10416(ViewOnClickListenerC16060 viewOnClickListenerC16060) {
        this.f35609 = viewOnClickListenerC16060;
    }

    @Override // l.InterfaceC17295
    public final void accept(Object obj) {
        ActivityC20293 activityC20293 = this.f35609.f51955;
        activityC20293.f65754 = ((AbstractC20745) obj).getName();
        ActivityC20293.m45803(activityC20293);
    }
}
