package l;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: l.᩵ᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B11 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20760 implements KeyListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final KeyListener f66502;

    public C20760(KeyListener keyListener) {
        this.f66502 = keyListener;
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f66502.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f66502.onKeyUp(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f66502.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f66502.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return C2203.m7516(editable, i, keyEvent) || this.f66502.onKeyDown(view, editable, i, keyEvent);
    }
}
