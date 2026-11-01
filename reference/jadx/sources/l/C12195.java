package l;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: renamed from: l.۫ۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB2C */
/* JADX INFO: loaded from: classes3.dex */
public final class C12195 implements TextWatcher {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC11406 f40795;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EditText f40796;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f40797 = true;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C12195(EditText editText) {
        this.f40796 = editText;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.f40796;
        if (!editText.isInEditMode() && this.f40797 && C12817.m31812() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iM31814 = C12817.m31807().m31814();
            if (iM31814 != 0) {
                if (iM31814 == 1) {
                    C12817.m31807().m31815(i, i3 + i, (Spannable) charSequence);
                    return;
                } else if (iM31814 != 3) {
                    return;
                }
            }
            C12817 c12817M31807 = C12817.m31807();
            if (this.f40795 == null) {
                this.f40795 = new C16428(editText);
            }
            c12817M31807.m31818(this.f40795);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30299() {
        return this.f40797;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30298(boolean z) {
        if (this.f40797 != z) {
            if (this.f40795 != null) {
                C12817.m31807().m31821(this.f40795);
            }
            this.f40797 = z;
            if (z) {
                m30297(this.f40796, C12817.m31807().m31814());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30297(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C12817 c12817M31807 = C12817.m31807();
            if (editableText == null) {
                length = 0;
            } else {
                c12817M31807.getClass();
                length = editableText.length();
            }
            c12817M31807.m31815(0, length, editableText);
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
