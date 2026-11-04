package l;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: H56R */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC23850 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1696 f77230;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20866 f77231;

    public ViewOnClickListenerC23850(C20866 c20866) {
        this.f77231 = c20866;
        this.f77230 = new C1696(c20866.f66791.getContext(), c20866.f66792);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C20866 c20866 = this.f77231;
        Window.Callback callback = c20866.f66797;
        if (callback == null || !c20866.f66784) {
            return;
        }
        callback.onMenuItemSelected(0, this.f77230);
    }
}
