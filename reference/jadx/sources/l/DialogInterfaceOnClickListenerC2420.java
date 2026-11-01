package l;

import android.content.DialogInterface;
import android.content.Intent;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.ۖۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2420 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f9702;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9703;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f9704;

    public /* synthetic */ DialogInterfaceOnClickListenerC2420(int i, Object obj, Object obj2) {
        this.f9703 = i;
        this.f9704 = obj;
        this.f9702 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f9703) {
            case 0:
                AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) this.f9704;
                try {
                    abstractActivityC12483.startActivity((Intent) this.f9702);
                } catch (Exception e) {
                    abstractActivityC12483.m31002(e, (DialogInterface.OnDismissListener) null);
                    return;
                }
                break;
            default:
                ((PluginDialog.OnClickListener) this.f9702).onClick(((C15680) this.f9704).f50910, i);
                break;
        }
    }
}
