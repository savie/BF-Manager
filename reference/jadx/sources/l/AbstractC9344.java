package l;

import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: renamed from: l.ۢۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W5CQ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9344 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1581 m23996(Charset charset) {
        return new C14283(charset);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1581 m23995(String str) {
        Charset charsetDefaultCharset;
        try {
            int i = C22832.f74282;
            charsetDefaultCharset = Charset.defaultCharset();
            if (str != null) {
                charsetDefaultCharset = Charset.forName(str);
            }
        } catch (UnsupportedCharsetException unused) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        return new C14283(charsetDefaultCharset);
    }
}
