package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.᩹ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC23333 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75567;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75568;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75569;

    public /* synthetic */ DialogInterfaceOnClickListenerC23333(int i, Object obj, Object obj2) {
        this.f75567 = i;
        this.f75569 = obj;
        this.f75568 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f75567) {
            case 0:
                ActivityC0848.m3368((ActivityC0848) this.f75569, (C6002) this.f75568);
                break;
            default:
                ((PluginDialog.OnClickListener) this.f75568).onClick(((C5687) this.f75569).f19646, i);
                break;
        }
    }
}
