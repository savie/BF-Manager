package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩵᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 79X7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20816 extends C16340 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Charset f66656 = StandardCharsets.UTF_16LE;

    public C20816(byte[] bArr) {
        super(9, bArr);
    }

    public C20816(String str) {
        this(str.getBytes(f66656));
    }
}
