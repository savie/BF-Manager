package l;

import bin.mt.plugin.api.ui.dialog.LoadingDialog;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܰۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 55FS */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC14396 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final WeakReference f45375;

    public RunnableC14396(LoadingDialog loadingDialog) {
        this.f45375 = new WeakReference(loadingDialog);
    }

    @Override // java.lang.Runnable
    public void run() {
        LoadingDialog loadingDialog = (LoadingDialog) this.f45375.get();
        if (loadingDialog == null || !loadingDialog.delayShow) {
            return;
        }
        loadingDialog.delayShow = false;
        loadingDialog.dialog.show();
    }
}
