package l;

import android.view.View;

/* JADX INFO: renamed from: l.֡ܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0491 implements InterfaceC16438 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC19136 f2134;

    public C0491(DialogInterfaceOnCancelListenerC19136 dialogInterfaceOnCancelListenerC19136) {
        this.f2134 = dialogInterfaceOnCancelListenerC19136;
    }

    @Override // l.InterfaceC16438
    /* JADX INFO: renamed from: ۙ */
    public final void mo1486(Object obj) {
        if (((InterfaceC11217) obj) != null) {
            DialogInterfaceOnCancelListenerC19136 dialogInterfaceOnCancelListenerC19136 = this.f2134;
            if (dialogInterfaceOnCancelListenerC19136.mShowsDialog) {
                View viewRequireView = dialogInterfaceOnCancelListenerC19136.requireView();
                if (viewRequireView.getParent() == null) {
                    if (dialogInterfaceOnCancelListenerC19136.mDialog != null) {
                        if (AbstractC3191.m10427(3)) {
                            C17359.toString(dialogInterfaceOnCancelListenerC19136.mDialog);
                        }
                        dialogInterfaceOnCancelListenerC19136.mDialog.setContentView(viewRequireView);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }
}
