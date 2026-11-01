package l;

import android.view.KeyEvent;
import bin.mt.plugin.api.ui.dialog.BaseCancelableDialog;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.֫᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7OD */
/* JADX INFO: loaded from: classes2.dex */
public class C2106 implements PluginDialog.OnKeyListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f7757 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BaseCancelableDialog f7758;

    public C2106(BaseCancelableDialog baseCancelableDialog) {
        this.f7758 = baseCancelableDialog;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.OnKeyListener
    public boolean onKey(PluginDialog pluginDialog, int i, KeyEvent keyEvent) {
        if (!this.f7758.cancelable || keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        if (!this.f7758.canceled) {
            if (System.currentTimeMillis() - this.f7757 < 2000) {
                this.f7758.canceled = true;
                if (this.f7758.onCancelListener != null) {
                    this.f7758.onCancelListener.mo42471accept(this.f7758);
                }
            } else {
                this.f7758.pluginUI.showToast("{press_again_to_cancel}");
                this.f7757 = System.currentTimeMillis();
            }
        }
        return true;
    }
}
