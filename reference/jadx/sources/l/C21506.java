package l;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: renamed from: l.᩶ᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB2C */
/* JADX INFO: loaded from: classes.dex */
public final class C21506 implements TextWatcher {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f68734;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f68735;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EditText f68736;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC22340 f68737;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f68738 = true;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C21506(EditText editText) {
        this.f68736 = editText;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f68735 = i;
        this.f68734 = i3;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText = this.f68736;
        if (!editText.isInEditMode() && this.f68738 && C2203.m7518()) {
            int i = this.f68735;
            int i2 = this.f68734;
            if (i2 > 0) {
                int iM7521 = C2203.m7520().m7521();
                if (iM7521 != 0) {
                    if (iM7521 == 1) {
                        C2203.m7520().m7522(i, i2 + i, editable);
                        return;
                    } else if (iM7521 != 3) {
                        return;
                    }
                }
                C2203 c2203M7520 = C2203.m7520();
                if (this.f68737 == null) {
                    this.f68737 = new RunnableC14792(editText);
                }
                c2203M7520.m7525(this.f68737);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48917() {
        return this.f68738;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48916(boolean z) {
        if (this.f68738 != z) {
            if (this.f68737 != null) {
                C2203.m7520().m7528(this.f68737);
            }
            this.f68738 = z;
            if (z) {
                m48915(this.f68736, C2203.m7520().m7521());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48915(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C2203 c2203M7520 = C2203.m7520();
            if (editableText == null) {
                length = 0;
            } else {
                c2203M7520.getClass();
                length = editableText.length();
            }
            c2203M7520.m7522(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }
}
