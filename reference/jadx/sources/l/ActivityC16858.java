package l;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: l.ܽ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: V22O */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC16858 extends Activity implements InterfaceC1423, InterfaceC7791 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C4245 f53926;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C13465.m32966(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        C13465.m32967(decorView, "window.decorView");
        if (C21196.m47654(decorView, keyEvent)) {
            return true;
        }
        return C21196.m47655(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C13465.m32966(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        C13465.m32967(decorView, "window.decorView");
        if (C21196.m47654(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C13465.m32966(bundle, "outState");
        this.f53926.m11903(EnumC9414.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Override // l.InterfaceC7791
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo20463(KeyEvent keyEvent) {
        C13465.m32966(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public ActivityC16858() {
        new C12274();
        this.f53926 = new C4245(this);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = FragmentC9891.f33768;
        C24002.m52831(this);
    }

    public AbstractC3062 getLifecycle() {
        return this.f53926;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        onPostResume();
    }
}
