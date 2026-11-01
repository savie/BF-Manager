package l;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;

/* JADX INFO: renamed from: l.۠ۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB20 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7961 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18544 f26151;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EditText f26152;

    public C7961(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C18544 c18544 = new C18544();
        super(inputConnection, false);
        this.f26152 = editText;
        this.f26151 = c18544;
        if (C12817.m31812()) {
            C12817.m31807().m31816(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f26152.getEditableText();
        this.f26151.getClass();
        return C12817.m31811(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f26152.getEditableText();
        this.f26151.getClass();
        return C12817.m31811(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
