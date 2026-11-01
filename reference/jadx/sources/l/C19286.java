package l;

import android.text.GetChars;
import java.util.stream.IntStream;

/* JADX INFO: renamed from: l.᩵ۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B94 */
/* JADX INFO: loaded from: classes4.dex */
public class C19286 implements CharSequence, GetChars {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f62242;

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream chars() {
        return C4340.convert(chars());
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream codePoints() {
        return C4340.convert(codePoints());
    }

    public C19286(String str) {
        this.f62242 = str;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f62242.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f62242.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f62242.substring(i, i2);
    }

    @Override // java.lang.CharSequence
    public final InterfaceC13514 chars() {
        return C3301.convert(this.f62242.chars());
    }

    @Override // java.lang.CharSequence
    public final InterfaceC13514 codePoints() {
        return C3301.convert(this.f62242.codePoints());
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f62242;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        this.f62242.getChars(i, i2, cArr, i3);
    }
}
