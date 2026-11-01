package l;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10702 implements InterfaceC7879 {
    @Override // l.InterfaceC7879
    /* JADX INFO: renamed from: ۙ */
    public final void mo1164(EditText editText, TextView textView, Button button, C13607 c13607) {
        button.setTag(R.id.MT_Protector, c13607);
        mo1163(editText, textView, button);
    }

    @Override // l.InterfaceC7879
    /* JADX INFO: renamed from: ۙ */
    public final void mo1163(EditText editText, TextView textView, Button button) {
        editText.setVisibility(8);
        button.setVisibility(0);
        Object tag = button.getTag(R.id.MT_Protector);
        if (tag instanceof C14230) {
            textView.setVisibility(0);
            textView.setText(((C14230) tag).m34336());
        } else {
            textView.setVisibility(8);
        }
    }

    @Override // l.InterfaceC7879
    /* JADX INFO: renamed from: ۙ */
    public final void mo1162(Button button, ActivityC19749 activityC19749) {
        new C5762(button, activityC19749).m10243();
    }

    @Override // l.InterfaceC7879
    /* JADX INFO: renamed from: ۙ */
    public final C13607 mo1161(int i, EditText editText, Button button) {
        C13607 c13607 = (C13607) button.getTag(R.id.MT_Protector);
        if (c13607 != null) {
            return c13607;
        }
        ActivityC19749.m44919(button);
        return null;
    }
}
