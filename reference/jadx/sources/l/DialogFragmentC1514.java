package l;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.io.Serializable;

/* JADX INFO: renamed from: l.֨᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S4SM */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DialogFragmentC1514 extends AbstractDialogFragmentC18076 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public CharSequence f5281;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public EditText f5282;

    @Deprecated
    public DialogFragmentC1514() {
    }

    @Override // l.AbstractDialogFragmentC18076, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f5281 = ((C10462) m42110()).m26889();
        } else {
            this.f5281 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // l.AbstractDialogFragmentC18076, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f5281);
    }

    @Override // l.AbstractDialogFragmentC18076
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5384(View view) {
        super.mo5384(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f5282 = editText;
        editText.requestFocus();
        EditText editText2 = this.f5282;
        if (editText2 == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText2.setText(this.f5281);
        EditText editText3 = this.f5282;
        editText3.setSelection(editText3.getText().length());
    }

    @Override // l.AbstractDialogFragmentC18076
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5385(boolean z) {
        if (z) {
            String string = this.f5282.getText().toString();
            ((C10462) m42110()).m12566((Serializable) string);
            ((C10462) m42110()).m26888(string);
        }
    }
}
