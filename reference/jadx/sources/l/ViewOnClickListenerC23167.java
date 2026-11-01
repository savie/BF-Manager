package l;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: l.᩺ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H56R */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC23167 implements View.OnClickListener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1127 f75196;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21755 f75197;

    public ViewOnClickListenerC23167(C21755 c21755) {
        this.f75197 = c21755;
        this.f75196 = new C1127(c21755.f70507.getContext(), c21755.f70506);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C21755 c21755 = this.f75197;
        Window.Callback callback = c21755.f70508;
        if (callback == null || !c21755.f70499) {
            return;
        }
        callback.onMenuItemSelected(0, this.f75196);
    }
}
