package l;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: renamed from: l.᩸ۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B23 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21366 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22778 f69496;

    public C21366(EditText editText) {
        this.f69496 = new C22778(editText);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final KeyListener m47896(KeyListener keyListener) {
        this.f69496.getClass();
        if (keyListener instanceof C7255) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C7255(keyListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputConnection m47897(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f69496.m50431(inputConnection, editorInfo);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47899() {
        return this.f69496.m50433();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47898(boolean z) {
        this.f69496.m50432(z);
    }
}
