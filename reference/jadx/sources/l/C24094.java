package l;

import android.view.KeyEvent;
import bin.mt.plugin.api.ui.dialog.BaseCancelableDialog;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* JADX INFO: renamed from: l.᩺ۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: S7OD */
/* JADX INFO: loaded from: classes.dex */
public class C24094 implements PluginDialog.OnKeyListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f77897 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BaseCancelableDialog f77898;

    public C24094(BaseCancelableDialog baseCancelableDialog) {
        this.f77898 = baseCancelableDialog;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.OnKeyListener
    public boolean onKey(PluginDialog pluginDialog, int i, KeyEvent keyEvent) {
        if (!this.f77898.cancelable || keyEvent.getAction() != 0 || i != 4) {
            return false;
        }
        if (!this.f77898.canceled) {
            if (System.currentTimeMillis() - this.f77897 < 2000) {
                this.f77898.canceled = true;
                if (this.f77898.onCancelListener != null) {
                    this.f77898.onCancelListener.accept(this.f77898);
                }
            } else {
                this.f77898.pluginUI.showToast("{press_again_to_cancel}");
                this.f77897 = System.currentTimeMillis();
            }
        }
        return true;
    }
}
