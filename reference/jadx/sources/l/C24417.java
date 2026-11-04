package l;

import android.text.SpannableStringBuilder;
import android.text.method.MovementMethod;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩺ܺ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 78YF */
/* JADX INFO: loaded from: classes.dex */
public final class C24417 extends AbstractC24593 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13929 f79284;

    public C24417(C13929 c13929) {
        this.f79284 = c13929;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24417 m54638(C13929 c13929) {
        return new C24417(c13929);
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ */
    public final void mo9655(InterfaceC9674 interfaceC9674) {
        ((C4981) interfaceC9674.mo25247()).m15190();
    }

    @Override // l.AbstractC24593, l.InterfaceC2963
    /* JADX INFO: renamed from: ۙ */
    public final void mo9653(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        MovementMethod movementMethod = textView.getMovementMethod();
        C13929 c13929 = this.f79284;
        if (movementMethod != c13929) {
            textView.setMovementMethod(c13929);
        }
    }
}
