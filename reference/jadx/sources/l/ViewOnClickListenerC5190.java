package l;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۙ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V933 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5190 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC20106 f18101;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13558 f18102;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f18103;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ImageView f18104;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9312 f18105;

    public /* synthetic */ ViewOnClickListenerC5190(AbstractActivityC17204 abstractActivityC17204, C9312 c9312, ImageView imageView, InterfaceC20106 interfaceC20106, C13558 c13558) {
        this.f18103 = abstractActivityC17204;
        this.f18105 = c9312;
        this.f18104 = imageView;
        this.f18101 = interfaceC20106;
        this.f18102 = c13558;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DialogInterfaceOnClickListenerC6316 dialogInterfaceOnClickListenerC6316 = new DialogInterfaceOnClickListenerC6316(this.f18103, false);
        final C9312 c9312 = this.f18105;
        final ImageView imageView = this.f18104;
        final InterfaceC20106 interfaceC20106 = this.f18101;
        final C13558 c13558 = this.f18102;
        dialogInterfaceOnClickListenerC6316.m18031(new InterfaceC12281() { // from class: l.ۤ᩸ۧ
            @Override // l.InterfaceC12281
            /* JADX INFO: renamed from: ۙ */
            public final void mo17031(int i) {
                EnumC1110 enumC1110 = EnumC1110.IMMUTABLE;
                C9312 c9313 = c9312;
                c9313.f30254 = i;
                c9313.f30255 = enumC1110;
                imageView.setImageBitmap(interfaceC20106.mo21304(c9313));
                C13558 c13559 = c13558;
                if (c13559.mo14758()) {
                    c13559.m33269();
                    ((DialogInterfaceC8327) c13559.mo2556()).m22431(false);
                }
            }
        });
        dialogInterfaceOnClickListenerC6316.m18030(c9312.f30254);
    }
}
