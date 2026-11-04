package l;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: l.۠᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC8866 extends Activity implements InterfaceC11217, InterfaceC4041 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20168 f28956;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C15243.m36590(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        C15243.m36591(decorView, "window.decorView");
        if (C14481.m34958(decorView, keyEvent)) {
            return true;
        }
        return C14481.m34959(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C15243.m36590(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        C15243.m36591(decorView, "window.decorView");
        if (C14481.m34958(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C15243.m36590(bundle, "outState");
        this.f28956.m46394(EnumC2619.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Override // l.InterfaceC4041
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13007(KeyEvent keyEvent) {
        C15243.m36590(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public ActivityC8866() {
        new C9086();
        this.f28956 = new C20168(this);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = FragmentC19422.f62761;
        C18676.m43426(this);
    }

    public AbstractC8585 getLifecycle() {
        return this.f28956;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        onPostResume();
    }
}
