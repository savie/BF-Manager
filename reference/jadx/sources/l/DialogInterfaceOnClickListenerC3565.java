package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.ۗܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 14V2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC3565 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f12212;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f12213;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f12214;

    public /* synthetic */ DialogInterfaceOnClickListenerC3565(int i, Object obj, Object obj2) {
        this.f12212 = i;
        this.f12214 = obj;
        this.f12213 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f12212) {
            case 0:
                ActivityC24449.m54695((ActivityC24449) this.f12214, (C18099) this.f12213);
                break;
            default:
                ((PluginDialog.OnClickListener) this.f12213).onClick(((C5687) this.f12214).f19646, i);
                break;
        }
    }
}
