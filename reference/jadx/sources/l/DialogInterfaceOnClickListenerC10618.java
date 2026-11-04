package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.ۤۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC10618 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f33702;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f33703;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f33704;

    public /* synthetic */ DialogInterfaceOnClickListenerC10618(int i, Object obj, Object obj2) {
        this.f33702 = i;
        this.f33704 = obj;
        this.f33703 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f33702) {
            case 0:
                C7941 c7941 = (C7941) this.f33704;
                ActivityC18143 activityC18143 = (ActivityC18143) this.f33703;
                c7941.m21629(activityC18143, new RunnableC22836(2, activityC18143));
                break;
            case 1:
                C4636 c4636 = (C4636) this.f33704;
                PluginDialog.OnClickListener onClickListener = (PluginDialog.OnClickListener) this.f33703;
                c4636.getClass();
                onClickListener.onClick(c4636, i);
                break;
            default:
                C25240.m56377((C25240) this.f33704, (boolean[]) this.f33703);
                break;
        }
    }
}
