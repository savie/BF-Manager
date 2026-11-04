package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܶۙ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC15853 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f51552;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f51553;

    public /* synthetic */ ViewOnClickListenerC15853(int i, Object obj) {
        this.f51552 = i;
        this.f51553 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f51552) {
            case 0:
                C0938.m3742((AbstractActivityC17204) this.f51553, view).mo21878();
                break;
            case 1:
                ((AbstractDialogInterfaceOnClickListenerC8552) this.f51553).m22924((CharSequence) C22482.m50718(System.currentTimeMillis()));
                break;
            default:
                ((DialogInterfaceC8327) this.f51553).dismiss();
                break;
        }
    }
}
