package l;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ܽᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB20 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17776 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17030 f58363;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TextView f58364;

    public C17776(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C17030 c17030 = new C17030();
        super(inputConnection, false);
        this.f58364 = editText;
        this.f58363 = c17030;
        if (C2203.m7518()) {
            C2203.m7520().m7523(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f58364.getEditableText();
        this.f58363.getClass();
        return C2203.m7517(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f58364.getEditableText();
        this.f58363.getClass();
        return C2203.m7517(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
