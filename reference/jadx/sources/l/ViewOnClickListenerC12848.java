package l;

import android.view.View;

/* JADX INFO: renamed from: l.۫ۘ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: CAG8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC12848 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f41141;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f41142;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC0148 f41143;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC21941 f41144;

    public /* synthetic */ ViewOnClickListenerC12848(InterfaceC21941 interfaceC21941, AbstractC0148 abstractC0148, DialogInterfaceC8327 dialogInterfaceC8327, int i) {
        this.f41142 = i;
        this.f41144 = interfaceC21941;
        this.f41143 = abstractC0148;
        this.f41141 = dialogInterfaceC8327;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f41142) {
            case 0:
                C11356.m28666((C15085) this.f41144, (C11356) this.f41143, this.f41141);
                break;
            default:
                C13263.m32813((C7385) this.f41144, (C13263) this.f41143, this.f41141);
                break;
        }
    }
}
