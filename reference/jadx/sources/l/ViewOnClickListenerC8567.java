package l;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.۠ۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC8567 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC20106 f27968;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13558 f27969;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9312 f27970;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ImageView f27971;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9312 f27972;

    public /* synthetic */ ViewOnClickListenerC8567(C9312 c9312, C9312 c9313, ImageView imageView, InterfaceC20106 interfaceC20106, C13558 c13558) {
        this.f27970 = c9312;
        this.f27972 = c9313;
        this.f27971 = imageView;
        this.f27968 = interfaceC20106;
        this.f27969 = c13558;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C9312 c9312 = this.f27972;
        int i = c9312.f30254;
        C9312 c9313 = this.f27970;
        c9313.f30254 = i;
        c9313.f30256 = c9312.f30256;
        c9313.f30255 = c9312.f30255;
        this.f27971.setImageBitmap(this.f27968.mo21304(c9313));
        C13558 c13558 = this.f27969;
        if (c13558.mo14758()) {
            c13558.m33269();
            ((DialogInterfaceC8327) c13558.mo2556()).m22431(false);
        }
    }
}
