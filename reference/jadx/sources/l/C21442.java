package l;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: renamed from: l.᩸۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 74MB */
/* JADX INFO: loaded from: classes4.dex */
public final class C21442 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Charset f69711 = Charset.defaultCharset();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Charset f69712;

    static {
        Charset charsetForName;
        Charset charsetForName2 = null;
        try {
            charsetForName = Charset.forName("SJIS");
        } catch (UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        f69712 = charsetForName;
        try {
            Charset.forName("GB2312");
        } catch (UnsupportedCharsetException unused2) {
        }
        try {
            charsetForName2 = Charset.forName("EUC_JP");
        } catch (UnsupportedCharsetException unused3) {
        }
        Charset charset = f69712;
        if ((charset == null || !charset.equals(f69711)) && charsetForName2 != null) {
            charsetForName2.equals(f69711);
        }
    }
}
