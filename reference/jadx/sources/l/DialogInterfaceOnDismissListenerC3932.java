package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.ۘۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC3932 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13422;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13423;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f13424;

    public /* synthetic */ DialogInterfaceOnDismissListenerC3932(int i, Object obj, Object obj2) {
        this.f13422 = i;
        this.f13424 = obj;
        this.f13423 = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f13422) {
            case 0:
                AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) this.f13424;
                abstractActivityC17204.getLifecycle().mo23078((InterfaceC22406) this.f13423);
                break;
            default:
                ((PluginDialog.OnDismissListener) this.f13423).onDismiss(((C5687) this.f13424).f19646);
                break;
        }
    }
}
