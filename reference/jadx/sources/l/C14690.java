package l;

import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.TypefaceSpan;
import bin.mt.plugin.api.regex.Pattern;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.ܳᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: NATX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14690 implements Serializable, Pattern {
    public static final long serialVersionUID = 5073258162644648461L;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f48007;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile transient C4853 f48008;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f48009;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14690 m35219(String str) {
        return new C14690(str, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C14690 m35218(int i, String str) {
        return new C14690(str, i);
    }

    @Override // bin.mt.plugin.api.regex.Pattern
    public final String pattern() {
        return this.f48007;
    }

    public final String toString() {
        return this.f48007;
    }

    @Override // bin.mt.plugin.api.regex.Pattern
    public final C6222 matcher(CharSequence charSequence) {
        m35222();
        if (charSequence instanceof InterfaceC16806) {
            charSequence = ((InterfaceC16806) charSequence).mo7087();
        }
        return new C6222(this, charSequence);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m35225() {
        return m35222().f17089;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35223(int i) {
        return i > 0 && m35222().m13553(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3399 m35226() {
        return m35222().f17092;
    }

    @Override // bin.mt.plugin.api.regex.Pattern
    public final int flags() {
        C4853 c4853 = this.f48008;
        return c4853 == null ? this.f48009 : c4853.f17091;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m35220(String str) {
        int iIndexOf = str.indexOf("\\E");
        if (iIndexOf == -1) {
            return C16523.m38890("\\Q", str, "\\E");
        }
        int length = str.length();
        StringBuilder sbM40152 = C17214.m40152(length < 2147483639 - length ? length << 1 : 2147483639, "\\Q");
        int i = 0;
        do {
            sbM40152.append((CharSequence) str, i, iIndexOf);
            sbM40152.append("\\E\\\\E\\Q");
            i = iIndexOf + 2;
            iIndexOf = str.indexOf("\\E", i);
        } while (iIndexOf != -1);
        sbM40152.append((CharSequence) str, i, str.length());
        sbM40152.append("\\E");
        return sbM40152.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.f48007.isEmpty()) {
            this.f48008 = C4126.m11718(this.f48009, this.f48007);
        }
    }

    public C14690(String str, int i) {
        if ((i & (-1024)) != 0) {
            throw new IllegalArgumentException(C9576.m24440(new StringBuilder("Unknown flag 0x"), i));
        }
        this.f48007 = str;
        i = (i & 256) != 0 ? i | 64 : i;
        this.f48009 = i;
        this.f48008 = C4126.m11718(i, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SpannableStringBuilder m35217(PatternSyntaxException patternSyntaxException) {
        String message = patternSyntaxException.getMessage();
        C13638.requireNonNull(message);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(message);
        int iLastIndexOf = message.lastIndexOf(10);
        if (iLastIndexOf != -1) {
            iLastIndexOf = message.lastIndexOf(10, iLastIndexOf - 1);
        }
        if (iLastIndexOf != -1) {
            spannableStringBuilder.setSpan(new TypefaceSpan("monospace"), iLastIndexOf, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8f), iLastIndexOf, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4853 m35222() {
        C4853 c4853M11718;
        C4853 c4853 = this.f48008;
        if (c4853 != null) {
            return c4853;
        }
        synchronized (this) {
            c4853M11718 = this.f48008;
            if (c4853M11718 == null) {
                c4853M11718 = C4126.m11718(this.f48009, this.f48007);
                this.f48008 = c4853M11718;
            }
        }
        return c4853M11718;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Map m35224() {
        C4853 c4853 = this.f48008;
        return c4853 == null ? Collections.EMPTY_MAP : c4853.f17090;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Map m35221() {
        return m35224();
    }
}
