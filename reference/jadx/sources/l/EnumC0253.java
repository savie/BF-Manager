package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.֡ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L7IG */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0253 {
    CR("\r"),
    CRLF("\r\n"),
    LF("\n");


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f1486;

    EnumC0253(String str) {
        C13638.requireNonNull(str, "lineSeparator");
        this.f1486 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] m1701(Charset charset) {
        return this.f1486.getBytes(charset);
    }

    public String getString() {
        return this.f1486;
    }
}
