package l;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: renamed from: l.ܺۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: W5CQ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16554 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC24760 m39196(Charset charset) {
        return new C11333(charset);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC24760 m39195(String str) {
        Charset charsetDefaultCharset;
        try {
            int i = C18046.f59088;
            charsetDefaultCharset = Charset.defaultCharset();
            if (str != null) {
                charsetDefaultCharset = Charset.forName(str);
            }
        } catch (UnsupportedCharsetException unused) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        return new C11333(charsetDefaultCharset);
    }
}
