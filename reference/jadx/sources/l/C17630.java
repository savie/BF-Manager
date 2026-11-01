package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܿ᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17630 implements InterfaceC10597 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC11281 f56036;

    public C17630(DialogInterfaceOnCancelListenerC11281 dialogInterfaceOnCancelListenerC11281) {
        this.f56036 = dialogInterfaceOnCancelListenerC11281;
    }

    @Override // l.InterfaceC10597
    /* JADX INFO: renamed from: ۙ */
    public final void mo1473(Object obj) {
        if (((InterfaceC1423) obj) != null) {
            DialogInterfaceOnCancelListenerC11281 dialogInterfaceOnCancelListenerC11281 = this.f56036;
            if (dialogInterfaceOnCancelListenerC11281.mShowsDialog) {
                View viewRequireView = dialogInterfaceOnCancelListenerC11281.requireView();
                if (viewRequireView.getParent() == null) {
                    if (dialogInterfaceOnCancelListenerC11281.mDialog != null) {
                        if (AbstractC8894.m23060(3)) {
                            C13638.toString(dialogInterfaceOnCancelListenerC11281.mDialog);
                        }
                        dialogInterfaceOnCancelListenerC11281.mDialog.setContentView(viewRequireView);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }
}
