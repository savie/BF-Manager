package l;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۗۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAVX */
/* JADX INFO: loaded from: classes2.dex */
public final class C2939 implements InterfaceC7879 {
    @Override // l.InterfaceC7879
    /* JADX INFO: renamed from: ۙ */
    public final void mo1164(EditText editText, TextView textView, Button button, C13607 c13607) {
        mo1163(editText, textView, button);
    }

    @Override // l.InterfaceC7879
    /* JADX INFO: renamed from: ۙ */
    public final void mo1163(EditText editText, TextView textView, Button button) {
        editText.setVisibility(8);
        button.setVisibility(8);
        textView.setVisibility(8);
    }

    @Override // l.InterfaceC7879
    /* JADX INFO: renamed from: ۙ */
    public final void mo1162(Button button, ActivityC19749 activityC19749) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC7879
    /* JADX INFO: renamed from: ۙ */
    public final C13607 mo1161(int i, EditText editText, Button button) {
        return new C13607(i);
    }
}
