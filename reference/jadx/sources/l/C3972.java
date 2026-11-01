package l;

import java.util.IllegalFormatPrecisionException;
import java.util.UnknownFormatConversionException;

/* JADX INFO: renamed from: l.ۘܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5CS */
/* JADX INFO: loaded from: classes2.dex */
public final class C3972 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f14740;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f14741;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f14742;

    public C3972(String str, int i) {
        String strM11464;
        this.f14742 = str;
        this.f14740 = i;
        if (m11465()) {
            strM11464 = m11464();
            if (m11467() == '$') {
                m11466();
            } else if (strM11464.charAt(0) == '0') {
                this.f14740 -= strM11464.length();
            }
            strM11464 = null;
        } else {
            strM11464 = null;
        }
        if (strM11464 == null) {
            while (",-(+# 0<".indexOf(m11467()) >= 0) {
                m11466();
            }
        }
        if (strM11464 == null && m11465()) {
            m11464();
        }
        if (m11467() == '.') {
            m11466();
            if (!m11465()) {
                throw new IllegalFormatPrecisionException(m11467());
            }
            m11464();
        }
        if (m11467() == 't' || m11467() == 'T') {
            m11466();
        }
        m11466();
        this.f14741 = str.substring(i - 1, this.f14740);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private String m11464() {
        int i = this.f14740;
        while (m11465()) {
            m11466();
        }
        return this.f14742.substring(i, this.f14740);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private boolean m11465() {
        return this.f14740 != this.f14742.length() && Character.isDigit(m11467());
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m11466() {
        if (this.f14740 == this.f14742.length()) {
            throw new UnknownFormatConversionException("End of String");
        }
        this.f14740++;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private char m11467() {
        int i = this.f14740;
        String str = this.f14742;
        if (i == str.length()) {
            throw new UnknownFormatConversionException("End of String");
        }
        return str.charAt(this.f14740);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m11468() {
        return this.f14740;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m11469() {
        return this.f14741;
    }
}
