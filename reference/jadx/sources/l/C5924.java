package l;

import java.util.IllegalFormatPrecisionException;
import java.util.UnknownFormatConversionException;

/* JADX INFO: renamed from: l.ۚ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T5CS */
/* JADX INFO: loaded from: classes3.dex */
public final class C5924 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f20267;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f20268;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f20269;

    public C5924(String str, int i) {
        String strM17240;
        this.f20269 = str;
        this.f20267 = i;
        if (m17239()) {
            strM17240 = m17240();
            if (m17238() == '$') {
                m17237();
            } else if (strM17240.charAt(0) == '0') {
                this.f20267 -= strM17240.length();
            }
            strM17240 = null;
        } else {
            strM17240 = null;
        }
        if (strM17240 == null) {
            while (",-(+# 0<".indexOf(m17238()) >= 0) {
                m17237();
            }
        }
        if (strM17240 == null && m17239()) {
            m17240();
        }
        if (m17238() == '.') {
            m17237();
            if (!m17239()) {
                throw new IllegalFormatPrecisionException(m17238());
            }
            m17240();
        }
        if (m17238() == 't' || m17238() == 'T') {
            m17237();
        }
        m17237();
        this.f20268 = str.substring(i - 1, this.f20267);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private String m17240() {
        int i = this.f20267;
        while (m17239()) {
            m17237();
        }
        return this.f20269.substring(i, this.f20267);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m17237() {
        if (this.f20267 == this.f20269.length()) {
            throw new UnknownFormatConversionException("End of String");
        }
        this.f20267++;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private char m17238() {
        int i = this.f20267;
        String str = this.f20269;
        if (i == str.length()) {
            throw new UnknownFormatConversionException("End of String");
        }
        return str.charAt(this.f20267);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private boolean m17239() {
        return this.f20267 != this.f20269.length() && Character.isDigit(m17238());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m17241() {
        return this.f20267;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m17242() {
        return this.f20268;
    }
}
