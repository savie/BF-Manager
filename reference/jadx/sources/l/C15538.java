package l;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: l.ܳᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AMY */
/* JADX INFO: loaded from: classes4.dex */
public final class C15538 implements Spannable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Spannable f50547;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f50548 = false;

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream chars() {
        return C16940.convert(chars());
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream codePoints() {
        return C16940.convert(codePoints());
    }

    public C15538(Spannable spannable) {
        this.f50547 = spannable;
    }

    public C15538(CharSequence charSequence) {
        this.f50547 = new SpannableString(charSequence);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m37220() {
        Spannable spannable = this.f50547;
        if (!this.f50548) {
            if ((Build.VERSION.SDK_INT < 28 ? new C22998() : new C20014()).mo46047(spannable)) {
                this.f50547 = new SpannableString(spannable);
            }
        }
        this.f50548 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Spannable m37221() {
        return this.f50547;
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        m37220();
        this.f50547.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m37220();
        this.f50547.removeSpan(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f50547.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f50547.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f50547.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f50547.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f50547.nextSpanTransition(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f50547.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f50547.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f50547.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f50547.toString();
    }

    @Override // java.lang.CharSequence
    public final InterfaceC17686 chars() {
        return C11063.m27949(this.f50547);
    }

    @Override // java.lang.CharSequence
    public final InterfaceC17686 codePoints() {
        return C11063.m27950(this.f50547);
    }
}
