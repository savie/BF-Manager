package l;

import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7R3 */
/* JADX INFO: loaded from: classes.dex */
public final class C24369 implements InterfaceC5723 {
    @Override // l.InterfaceC5723
    /* JADX INFO: renamed from: ۙ */
    public final void mo2466(C23255 c23255, TextView textView, Button button, C19147 c19147) {
        button.setTag(R.id.MT_Protector, c19147);
        mo2465(c23255, textView, button);
    }

    @Override // l.InterfaceC5723
    /* JADX INFO: renamed from: ۙ */
    public final void mo2465(C23255 c23255, TextView textView, Button button) {
        c23255.setVisibility(8);
        button.setVisibility(0);
        Object tag = button.getTag(R.id.MT_Protector);
        if (tag instanceof C14671) {
            textView.setVisibility(0);
            textView.setText(((C14671) tag).m35298());
        } else {
            textView.setVisibility(8);
        }
    }

    @Override // l.InterfaceC5723
    /* JADX INFO: renamed from: ۙ */
    public final void mo2464(Button button, ActivityC5440 activityC5440) {
        new C6469(button, activityC5440).m8197();
    }

    @Override // l.InterfaceC5723
    /* JADX INFO: renamed from: ۙ */
    public final C19147 mo2463(int i, C23255 c23255, Button button) {
        C19147 c19147 = (C19147) button.getTag(R.id.MT_Protector);
        if (c19147 != null) {
            return c19147;
        }
        ActivityC5440.m16262(button);
        return null;
    }
}
