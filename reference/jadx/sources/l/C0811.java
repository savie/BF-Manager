package l;

import android.text.SpannableStringBuilder;
import android.text.method.MovementMethod;
import android.widget.TextView;

/* JADX INFO: renamed from: l.֨֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78YF */
/* JADX INFO: loaded from: classes3.dex */
public final class C0811 extends AbstractC0770 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20878 f3433;

    public C0811(C20878 c20878) {
        this.f3433 = c20878;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0811 m3383(C20878 c20878) {
        return new C0811(c20878);
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ۙ */
    public final void mo3312(InterfaceC19116 interfaceC19116) {
        ((C16064) interfaceC19116.mo5123()).m38068();
    }

    @Override // l.AbstractC0770, l.InterfaceC8533
    /* JADX INFO: renamed from: ۙ */
    public final void mo1042(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        MovementMethod movementMethod = textView.getMovementMethod();
        C20878 c20878 = this.f3433;
        if (movementMethod != c20878) {
            textView.setMovementMethod(c20878);
        }
    }
}
