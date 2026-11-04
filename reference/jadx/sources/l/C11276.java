package l;

import android.text.TextUtils;
import bin.mt.plugin.api.editor.BufferedText;
import bin.mt.plugin.api.regex.Matcher;
import bin.mt.plugin.api.regex.Pattern;

/* JADX INFO: renamed from: l.ۧ֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P7QH */
/* JADX INFO: loaded from: classes4.dex */
public final class C11276 implements BufferedText, InterfaceC12448 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC19106 f35573;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24703 f35574;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C25313 f35575;

    public C11276(C24703 c24703) {
        this.f35574 = c24703;
        InterfaceC19106 interfaceC19106M54021 = c24703.f79919.m54021();
        this.f35573 = interfaceC19106M54021;
        this.f35575 = new C25313(interfaceC19106M54021);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int indexOf(char c) {
        return this.f35575.indexOf(c, 0);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int indexOf(char c, int i) {
        return this.f35575.indexOf(c, i);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int indexOf(char c, int i, int i2) {
        return this.f35575.indexOf(c, i, i2);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int indexOf(String str) {
        if (str.length() == 1) {
            return this.f35575.indexOf(str.charAt(0), 0);
        }
        return TextUtils.indexOf(this.f35575, str);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int indexOf(String str, int i) {
        if (str.length() == 1) {
            return this.f35575.indexOf(str.charAt(0), i);
        }
        return TextUtils.indexOf(this.f35575, str, i);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int indexOf(String str, int i, int i2) {
        if (str.length() == 1) {
            return this.f35575.indexOf(str.charAt(0), i, i2);
        }
        return TextUtils.indexOf(this.f35575, str, i, i2);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(char c) {
        C25313 c25313 = this.f35575;
        return c25313.lastIndexOf(c, 0, c25313.length());
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(char c, int i) {
        return this.f35575.lastIndexOf(c, 0, i + 1);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(char c, int i, int i2) {
        return this.f35575.lastIndexOf(c, i, i2);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(String str) {
        if (str.length() == 1) {
            return this.f35575.lastIndexOf(str.charAt(0), 0, this.f35575.length());
        }
        C25313 c25313 = this.f35575;
        return C17370.m40797(c25313, str, 0, c25313.length());
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(String str, int i) {
        if (str.length() != 1) {
            return C17370.m40797(this.f35575, str, 0, i + 1);
        }
        return this.f35575.lastIndexOf(str.charAt(0), 0, i + 1);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int lastIndexOf(String str, int i, int i2) {
        if (str.length() == 1) {
            return this.f35575.lastIndexOf(str.charAt(0), i, i2);
        }
        return C17370.m40797(this.f35575, str, i, i2);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final void reset() {
        C24703 c24703 = this.f35574;
        C24703.m55057(c24703);
        InterfaceC19106 interfaceC19106M54021 = c24703.f79919.m54021();
        if (interfaceC19106M54021 != this.f35573) {
            this.f35575 = new C25313(interfaceC19106M54021);
            this.f35573 = interfaceC19106M54021;
        } else {
            this.f35575.reset();
        }
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int count(int i, int i2, char c) {
        return this.f35575.count(i, i2, c);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int findLineStart(int i) {
        return this.f35575.lastIndexOf('\n', 0, i) + 1;
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final int findLineEnd(int i) {
        int iIndexOf = this.f35575.indexOf('\n', i);
        return iIndexOf == -1 ? this.f35575.length() : iIndexOf;
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final Matcher matcher(Pattern pattern) {
        return pattern.matcher(this.f35575);
    }

    @Override // bin.mt.plugin.api.editor.BufferedText
    public final Matcher matcher(String str) {
        return C18415.m42925(str).matcher((CharSequence) this.f35575);
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        this.f35575.getChars(i, i2, cArr, i3);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f35575.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f35575.length();
    }

    @Override // bin.mt.plugin.api.editor.BufferedText, java.lang.CharSequence
    public final String toString() {
        return this.f35575.subSequence(0, this.f35575.length()).toString();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f35575.subSequence(i, i2);
    }

    @Override // l.InterfaceC12448
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CharSequence mo28528() {
        return this.f35575;
    }
}
