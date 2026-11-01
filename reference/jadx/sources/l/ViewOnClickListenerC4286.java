package l;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۙ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC4286 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC21926 f15449;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14745 f15450;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16148 f15451;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ImageView f15452;

    public /* synthetic */ ViewOnClickListenerC4286(C14745 c14745, ImageView imageView, InterfaceC21926 interfaceC21926, C16148 c16148) {
        this.f15450 = c14745;
        this.f15452 = imageView;
        this.f15449 = interfaceC21926;
        this.f15451 = c16148;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC16214 abstractC16214 = C0690.f2913;
        int iMo38327 = abstractC16214.mo38327();
        C14745 c14745 = this.f15450;
        c14745.f48224 = iMo38327;
        c14745.f48225 = EnumC23917.m52739(abstractC16214);
        this.f15452.setImageBitmap(this.f15449.mo40846(c14745));
        C16148 c16148 = this.f15451;
        if (c16148.mo38231()) {
            c16148.m38232();
            ((DialogInterfaceC19356) c16148.mo7338()).m44372(false);
        }
    }
}
