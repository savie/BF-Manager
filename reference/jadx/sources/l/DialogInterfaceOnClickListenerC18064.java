package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.ᩳ۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57RA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC18064 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f57772;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f57773;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f57774;

    public /* synthetic */ DialogInterfaceOnClickListenerC18064(int i, Object obj, Object obj2) {
        this.f57773 = i;
        this.f57774 = obj;
        this.f57772 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f57773) {
            case 0:
                C18770 c18770 = (C18770) this.f57774;
                PluginDialog.OnClickListener onClickListener = (PluginDialog.OnClickListener) this.f57772;
                c18770.getClass();
                onClickListener.onClick(c18770, i);
                break;
            default:
                ViewOnClickListenerC15847.m37723((ViewOnClickListenerC15847) this.f57774, (C11381) this.f57772);
                break;
        }
    }
}
