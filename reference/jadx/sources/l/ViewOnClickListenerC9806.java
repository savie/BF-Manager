package l;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۢ᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC9806 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ImageView f33542;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16148 f33543;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14745 f33544;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC21926 f33545;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14745 f33546;

    public /* synthetic */ ViewOnClickListenerC9806(C14745 c14745, C14745 c14746, ImageView imageView, InterfaceC21926 interfaceC21926, C16148 c16148) {
        this.f33544 = c14745;
        this.f33546 = c14746;
        this.f33542 = imageView;
        this.f33545 = interfaceC21926;
        this.f33543 = c16148;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C14745 c14745 = this.f33546;
        int i = c14745.f48224;
        C14745 c14746 = this.f33544;
        c14746.f48224 = i;
        c14746.f48226 = c14745.f48226;
        c14746.f48225 = c14745.f48225;
        this.f33542.setImageBitmap(this.f33545.mo40846(c14746));
        C16148 c16148 = this.f33543;
        if (c16148.mo38231()) {
            c16148.m38232();
            ((DialogInterfaceC19356) c16148.mo7338()).m44372(false);
        }
    }
}
