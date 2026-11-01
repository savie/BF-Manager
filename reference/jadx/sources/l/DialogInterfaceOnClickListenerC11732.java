package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.ui.dialog.PluginDialog;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC11732 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f39431;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39432;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f39433;

    public /* synthetic */ DialogInterfaceOnClickListenerC11732(int i, Object obj, Object obj2) {
        this.f39432 = i;
        this.f39433 = obj;
        this.f39431 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f39432) {
            case 0:
                C22315.m49479((C22315) this.f39433, (AbstractActivityC12483) this.f39431);
                break;
            case 1:
                ApplicationC0716.f2992.edit().putString("stid", ((InterfaceC11883) ((List) this.f39433).get(((int[]) this.f39431)[0])).mo8259()).apply();
                dialogInterface.dismiss();
                break;
            default:
                ((PluginDialog.OnClickListener) this.f39431).onClick(((C15680) this.f39433).f50910, i);
                break;
        }
    }
}
