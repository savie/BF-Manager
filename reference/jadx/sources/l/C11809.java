package l;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: renamed from: l.ۧᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B23 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11809 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EditText f38132;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C21506 f38133;

    public C11809(EditText editText) {
        this.f38132 = editText;
        C21506 c21506 = new C21506(editText);
        this.f38133 = c21506;
        editText.addTextChangedListener(c21506);
        editText.setEditableFactory(C25236.getInstance());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static KeyListener m29651(KeyListener keyListener) {
        if (keyListener instanceof C20760) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C20760(keyListener);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputConnection m29652(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return inputConnection instanceof C17776 ? inputConnection : new C17776(this.f38132, inputConnection, editorInfo);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29654() {
        return this.f38133.m48917();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29653(boolean z) {
        this.f38133.m48916(z);
    }
}
