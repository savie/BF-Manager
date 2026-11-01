package l;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۘ᩷ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4SM */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DialogFragmentC4191 extends AbstractDialogFragmentC2634 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence f15244;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public EditText f15245;

    @Deprecated
    public DialogFragmentC4191() {
    }

    @Override // l.AbstractDialogFragmentC2634, android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f15244 = ((C13365) m8118()).m32863();
        } else {
            this.f15244 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // l.AbstractDialogFragmentC2634, android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f15244);
    }

    @Override // l.AbstractDialogFragmentC2634
    /* JADX INFO: renamed from: ۙ */
    public final void mo8120(View view) {
        super.mo8120(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f15245 = editText;
        editText.requestFocus();
        EditText editText2 = this.f15245;
        if (editText2 == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText2.setText(this.f15244);
        EditText editText3 = this.f15245;
        editText3.setSelection(editText3.getText().length());
    }

    @Override // l.AbstractDialogFragmentC2634
    @Deprecated
    /* JADX INFO: renamed from: ۙ */
    public final void mo8121(boolean z) {
        if (z) {
            String string = this.f15245.getText().toString();
            ((C13365) m8118()).m13140((Serializable) string);
            ((C13365) m8118()).m32862(string);
        }
    }
}
