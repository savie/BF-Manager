package l;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: l.᩹ۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AMY */
/* JADX INFO: loaded from: classes.dex */
public final class C22072 implements Spannable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Spannable f71521;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f71522 = false;

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream chars() {
        return C4340.convert(chars());
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream codePoints() {
        return C4340.convert(codePoints());
    }

    public C22072(Spannable spannable) {
        this.f71521 = spannable;
    }

    public C22072(CharSequence charSequence) {
        this.f71521 = new SpannableString(charSequence);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m49021() {
        Spannable spannable = this.f71521;
        if (!this.f71522) {
            if ((Build.VERSION.SDK_INT < 28 ? new C2315() : new C5138()).mo7057(spannable)) {
                this.f71521 = new SpannableString(spannable);
            }
        }
        this.f71522 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Spannable m49022() {
        return this.f71521;
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        m49021();
        this.f71521.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m49021();
        this.f71521.removeSpan(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f71521.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f71521.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f71521.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f71521.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f71521.nextSpanTransition(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f71521.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f71521.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f71521.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f71521.toString();
    }

    @Override // java.lang.CharSequence
    public final InterfaceC13514 chars() {
        return C11489.m28675(this.f71521);
    }

    @Override // java.lang.CharSequence
    public final InterfaceC13514 codePoints() {
        return C11489.m28676(this.f71521);
    }
}
