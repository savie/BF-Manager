package l;

import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩹ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7PV */
/* JADX INFO: loaded from: classes.dex */
public final class C23623 implements InterfaceC5723 {
    @Override // l.InterfaceC5723
    /* JADX INFO: renamed from: ۙ */
    public final void mo2466(C23255 c23255, TextView textView, Button button, C19147 c19147) {
        c23255.mo52335((CharSequence) c19147.mo11454());
        mo2465(c23255, textView, button);
    }

    @Override // l.InterfaceC5723
    /* JADX INFO: renamed from: ۙ */
    public final void mo2465(C23255 c23255, TextView textView, Button button) {
        c23255.setVisibility(0);
        button.setVisibility(8);
        textView.setVisibility(8);
    }

    @Override // l.InterfaceC5723
    /* JADX INFO: renamed from: ۙ */
    public final void mo2464(Button button, ActivityC5440 activityC5440) {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC5723
    /* JADX INFO: renamed from: ۙ */
    public final C19147 mo2463(int i, C23255 c23255, Button button) {
        String string = c23255.m54021().toString();
        if (string.isEmpty()) {
            c23255.requestFocus();
            ActivityC5440.m16262(c23255);
            C22673.m51152(R.string.MT_Protector);
            return null;
        }
        return new C3485(string);
    }
}
