package l;

import android.text.GetChars;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: l.᩹ۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B94 */
/* JADX INFO: loaded from: classes.dex */
public class C23338 implements CharSequence, GetChars {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f75598;

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream chars() {
        return C16940.convert(chars());
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream codePoints() {
        return C16940.convert(codePoints());
    }

    public C23338(String str) {
        this.f75598 = str;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f75598.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f75598.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f75598.substring(i, i2);
    }

    @Override // java.lang.CharSequence
    public final InterfaceC17686 chars() {
        return C25146.convert(this.f75598.chars());
    }

    @Override // java.lang.CharSequence
    public final InterfaceC17686 codePoints() {
        return C25146.convert(this.f75598.codePoints());
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f75598;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        this.f75598.getChars(i, i2, cArr, i3);
    }
}
