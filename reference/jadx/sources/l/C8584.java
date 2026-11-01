package l;

import android.text.Spannable;
import android.text.SpannableString;

/* JADX INFO: renamed from: l.ۡۖۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB0P */
/* JADX INFO: loaded from: classes3.dex */
public final class C8584 implements InterfaceC9995 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0821 f29682;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C22072 f29683;

    public C8584(C22072 c22072, InterfaceC0821 interfaceC0821) {
        this.f29683 = c22072;
        this.f29682 = interfaceC0821;
    }

    @Override // l.InterfaceC9995
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19103(CharSequence charSequence, int i, int i2, C4432 c4432) {
        Spannable spannableString;
        if (c4432.m12374()) {
            return true;
        }
        if (this.f29683 == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.f29683 = new C22072(spannableString);
        }
        ((C4349) this.f29682).getClass();
        this.f29683.setSpan(new C13606(c4432), i, i2, 33);
        return true;
    }

    @Override // l.InterfaceC9995
    /* JADX INFO: renamed from: ۙ */
    public final Object mo19102() {
        return this.f29683;
    }
}
