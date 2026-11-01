package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.ۖ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2558 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f10106;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10107;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f10108;

    public /* synthetic */ DialogInterfaceOnClickListenerC2558(int i, Object obj, Object obj2) {
        this.f10107 = i;
        this.f10108 = obj;
        this.f10106 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f10107) {
            case 0:
                C22315.m49477((C22315) this.f10108, (AbstractActivityC12483) this.f10106);
                break;
            default:
                ((PluginDialog.OnClickListener) this.f10106).onClick(((C15680) this.f10108).f50910, i);
                break;
        }
    }
}
