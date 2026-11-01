package l;

import android.text.TextUtils;
import bin.mt.plugin.api.editor.BufferedText;
import bin.mt.plugin.api.regex.Matcher;
import bin.mt.plugin.api.regex.Pattern;

/* JADX INFO: renamed from: l.ۖۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P7QH */
/* JADX INFO: loaded from: classes2.dex */
public final class C2334 implements BufferedText, InterfaceC16806 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5157 f8264;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC2916 f8265;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20597 f8266;

    public C2334(C5157 c5157) {
        this.f8264 = c5157;
        InterfaceC2916 interfaceC2916M17000 = c5157.f17903.m17000();
        this.f8265 = interfaceC2916M17000;
        this.f8266 = new C20597(interfaceC2916M17000);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int indexOf(char c) {
        return this.f8266.indexOf(c, 0);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int indexOf(char c, int i) {
        return this.f8266.indexOf(c, i);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int indexOf(char c, int i, int i2) {
        return this.f8266.indexOf(c, i, i2);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int indexOf(String str) {
        if (str.length() == 1) {
            return this.f8266.indexOf(str.charAt(0), 0);
        }
        return TextUtils.indexOf(this.f8266, str);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int indexOf(String str, int i) {
        if (str.length() == 1) {
            return this.f8266.indexOf(str.charAt(0), i);
        }
        return TextUtils.indexOf(this.f8266, str, i);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int indexOf(String str, int i, int i2) {
        if (str.length() == 1) {
            return this.f8266.indexOf(str.charAt(0), i, i2);
        }
        return TextUtils.indexOf(this.f8266, str, i, i2);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(char c) {
        C20597 c20597 = this.f8266;
        return c20597.lastIndexOf(c, 0, c20597.length());
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(char c, int i) {
        return this.f8266.lastIndexOf(c, 0, i + 1);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(char c, int i, int i2) {
        return this.f8266.lastIndexOf(c, i, i2);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(String str) {
        if (str.length() == 1) {
            return this.f8266.lastIndexOf(str.charAt(0), 0, this.f8266.length());
        }
        C20597 c20597 = this.f8266;
        return C17874.m41456(0, c20597.length(), c20597, str);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(String str, int i) {
        if (str.length() != 1) {
            return C17874.m41456(0, i + 1, this.f8266, str);
        }
        return this.f8266.lastIndexOf(str.charAt(0), 0, i + 1);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(String str, int i, int i2) {
        if (str.length() == 1) {
            return this.f8266.lastIndexOf(str.charAt(0), i, i2);
        }
        return C17874.m41456(i, i2, this.f8266, str);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final void reset() {
        C5157 c5157 = this.f8264;
        C5157.m14304(c5157);
        InterfaceC2916 interfaceC2916M17000 = c5157.f17903.m17000();
        if (interfaceC2916M17000 != this.f8265) {
            this.f8266 = new C20597(interfaceC2916M17000);
            this.f8265 = interfaceC2916M17000;
        } else {
            this.f8266.reset();
        }
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int count(int i, int i2, char c) {
        return this.f8266.count(i, i2, c);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int findLineStart(int i) {
        return this.f8266.lastIndexOf('\n', 0, i) + 1;
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int findLineEnd(int i) {
        int iIndexOf = this.f8266.indexOf('\n', i);
        return iIndexOf == -1 ? this.f8266.length() : iIndexOf;
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final Matcher matcher(Pattern pattern) {
        return pattern.matcher(this.f8266);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final Matcher matcher(String str) {
        return C14690.m35219(str).matcher((CharSequence) this.f8266);
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        this.f8266.getChars(i, i2, cArr, i3);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f8266.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f8266.length();
    }

    @Override // bin.mt.plugin.api.editor.BufferedText, java.lang.CharSequence
    public final String toString() {
        return this.f8266.subSequence(0, this.f8266.length()).toString();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f8266.subSequence(i, i2);
    }

    @Override // l.InterfaceC16806
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CharSequence mo7087() {
        return this.f8266;
    }
}
