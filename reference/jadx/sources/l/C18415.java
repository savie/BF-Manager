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

/* JADX INFO: renamed from: l.ܿܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: NATX */
/* JADX INFO: loaded from: classes5.dex */
public final class C18415 implements Serializable, Pattern {
    public static final long serialVersionUID = 5073258162644648461L;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile transient C9093 f59985;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f59986;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f59987;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18415 m42925(String str) {
        return new C18415(str, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18415 m42924(int i, String str) {
        return new C18415(str, i);
    }

    @Override // bin.mt.plugin.api.regex.Pattern
    public final String pattern() {
        return this.f59986;
    }

    public final String toString() {
        return this.f59986;
    }

    @Override // bin.mt.plugin.api.regex.Pattern
    public final C4245 matcher(CharSequence charSequence) {
        m42927();
        if (charSequence instanceof InterfaceC12448) {
            charSequence = ((InterfaceC12448) charSequence).mo28528();
        }
        return new C4245(this, charSequence);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m42929() {
        return m42927().f29537;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42928(int i) {
        return i > 0 && m42927().m24236(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19161 m42931() {
        return m42927().f29541;
    }

    @Override // bin.mt.plugin.api.regex.Pattern
    public final int flags() {
        C9093 c9093 = this.f59985;
        return c9093 == null ? this.f59987 : c9093.f29543;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m42926(String str) {
        int iIndexOf = str.indexOf("\\E");
        if (iIndexOf == -1) {
            return C14442.m34865("\\Q", str, "\\E");
        }
        int length = str.length();
        StringBuilder sbM3018 = C0703.m3018(length < 2147483639 - length ? length << 1 : 2147483639, "\\Q");
        int i = 0;
        do {
            sbM3018.append((CharSequence) str, i, iIndexOf);
            sbM3018.append("\\E\\\\E\\Q");
            i = iIndexOf + 2;
            iIndexOf = str.indexOf("\\E", i);
        } while (iIndexOf != -1);
        sbM3018.append((CharSequence) str, i, str.length());
        sbM3018.append("\\E");
        return sbM3018.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        if (this.f59986.isEmpty()) {
            this.f59985 = C11176.m28153(this.f59987, this.f59986);
        }
    }

    public C18415(String str, int i) {
        if ((i & (-1024)) != 0) {
            throw new IllegalArgumentException(C4791.m14766(new StringBuilder("Unknown flag 0x"), i));
        }
        this.f59986 = str;
        i = (i & 256) != 0 ? i | 64 : i;
        this.f59987 = i;
        this.f59985 = C11176.m28153(i, str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static SpannableStringBuilder m42923(PatternSyntaxException patternSyntaxException) {
        String message = patternSyntaxException.getMessage();
        C17359.requireNonNull(message);
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
    public final C9093 m42927() {
        C9093 c9093M28153;
        C9093 c9093 = this.f59985;
        if (c9093 != null) {
            return c9093;
        }
        synchronized (this) {
            c9093M28153 = this.f59985;
            if (c9093M28153 == null) {
                c9093M28153 = C11176.m28153(this.f59987, this.f59986);
                this.f59985 = c9093M28153;
            }
        }
        return c9093M28153;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Map m42930() {
        C9093 c9093 = this.f59985;
        return c9093 == null ? Collections.EMPTY_MAP : c9093.f29536;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Map m42932() {
        return m42930();
    }
}
