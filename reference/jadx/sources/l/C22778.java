package l;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: renamed from: l.᩺ۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B23 */
/* JADX INFO: loaded from: classes.dex */
public final class C22778 extends C15017 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EditText f74156;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12195 f74157;

    public C22778(EditText editText) {
        this.f74156 = editText;
        C12195 c12195 = new C12195(editText);
        this.f74157 = c12195;
        editText.addTextChangedListener(c12195);
        editText.setEditableFactory(C17838.getInstance());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputConnection m50431(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection instanceof C7961 ? inputConnection : new C7961(this.f74156, inputConnection, editorInfo);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50432(boolean z) {
        this.f74157.m30298(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50433() {
        return this.f74157.m30299();
    }
}
