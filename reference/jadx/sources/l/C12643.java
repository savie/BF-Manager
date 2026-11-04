package l;

import android.text.Spannable;
import android.text.SpannableString;

/* JADX INFO: renamed from: l.ۨ᩸ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB0P */
/* JADX INFO: loaded from: classes4.dex */
public final class C12643 implements InterfaceC6678 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5932 f40558;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C15538 f40559;

    public C12643(C15538 c15538, InterfaceC5932 interfaceC5932) {
        this.f40559 = c15538;
        this.f40558 = interfaceC5932;
    }

    @Override // l.InterfaceC6678
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18673(CharSequence charSequence, int i, int i2, C5098 c5098) {
        Spannable spannableString;
        if (c5098.m15414()) {
            return true;
        }
        if (this.f40559 == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.f40559 = new C15538(spannableString);
        }
        ((C13783) this.f40558).getClass();
        this.f40559.setSpan(new C22252(c5098), i, i2, 33);
        return true;
    }

    @Override // l.InterfaceC6678
    /* JADX INFO: renamed from: ۙ */
    public final Object mo18672() {
        return this.f40559;
    }
}
