package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.᩷᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7IG */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC22279 {
    CR("\r"),
    CRLF("\r\n"),
    LF("\n");


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f72149;

    EnumC22279(String str) {
        C17359.requireNonNull(str, "lineSeparator");
        this.f72149 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte[] m50347(Charset charset) {
        return this.f72149.getBytes(charset);
    }

    public String getString() {
        return this.f72149;
    }
}
