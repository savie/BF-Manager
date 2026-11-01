package l;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ܰ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC13460 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ImageView f44524;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16148 f44525;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f44526;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC21926 f44527;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14745 f44528;

    public /* synthetic */ ViewOnClickListenerC13460(AbstractActivityC12483 abstractActivityC12483, C14745 c14745, ImageView imageView, InterfaceC21926 interfaceC21926, C16148 c16148) {
        this.f44526 = abstractActivityC12483;
        this.f44528 = c14745;
        this.f44524 = imageView;
        this.f44527 = interfaceC21926;
        this.f44525 = c16148;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DialogInterfaceOnClickListenerC18046 dialogInterfaceOnClickListenerC18046 = new DialogInterfaceOnClickListenerC18046(this.f44526, false);
        C14745 c14745 = this.f44528;
        dialogInterfaceOnClickListenerC18046.m42043(new C22191(c14745, this.f44524, this.f44527, this.f44525));
        dialogInterfaceOnClickListenerC18046.m42042(c14745.f48224);
    }
}
