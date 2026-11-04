package l;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۜۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC7076 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13558 f23305;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9312 f23306;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC20106 f23307;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ImageView f23308;

    public /* synthetic */ ViewOnClickListenerC7076(C9312 c9312, ImageView imageView, InterfaceC20106 interfaceC20106, C13558 c13558) {
        this.f23306 = c9312;
        this.f23308 = imageView;
        this.f23307 = interfaceC20106;
        this.f23305 = c13558;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC23597 abstractC23597 = C20613.f66104;
        int iMo32682 = abstractC23597.mo32682();
        C9312 c9312 = this.f23306;
        c9312.f30254 = iMo32682;
        c9312.f30255 = EnumC1110.m4117(abstractC23597);
        this.f23308.setImageBitmap(this.f23307.mo21304(c9312));
        C13558 c13558 = this.f23305;
        if (c13558.mo14758()) {
            c13558.m33269();
            ((DialogInterfaceC8327) c13558.mo2556()).m22431(false);
        }
    }
}
