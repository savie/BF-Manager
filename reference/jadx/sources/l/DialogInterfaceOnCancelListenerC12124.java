package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۨۙ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC12124 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38978;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f38979;

    public /* synthetic */ DialogInterfaceOnCancelListenerC12124(int i, Object obj) {
        this.f38978 = i;
        this.f38979 = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f38978) {
            case 0:
                ((InterfaceC18837) this.f38979).mo1268();
                break;
            default:
                ((InterfaceC1615) this.f38979).mo5708();
                break;
        }
    }
}
