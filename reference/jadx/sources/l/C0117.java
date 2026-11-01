package l;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡ۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7PV */
/* JADX INFO: loaded from: classes2.dex */
public final class C0117 implements InterfaceC7879 {
    @Override // l.InterfaceC7879
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1164(EditText editText, TextView textView, Button button, C13607 c13607) {
        editText.setText(c13607.mo33246());
        mo1163(editText, textView, button);
    }

    @Override // l.InterfaceC7879
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1163(EditText editText, TextView textView, Button button) {
        editText.setVisibility(0);
        button.setVisibility(8);
        textView.setVisibility(8);
    }

    @Override // l.InterfaceC7879
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1162(Button button, ActivityC19749 activityC19749) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC7879
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13607 mo1161(int i, EditText editText, Button button) {
        String string = editText.getText().toString();
        if (string.isEmpty()) {
            editText.requestFocus();
            ActivityC19749.m44919(editText);
            C15829.m37611(R.string.MT_Protector);
            return null;
        }
        return new C16346(string);
    }
}
