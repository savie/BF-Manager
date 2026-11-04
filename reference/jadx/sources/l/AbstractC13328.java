package l;

import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.۫᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IO */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13328 extends AbstractC20041 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f42513;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f42514;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15565 f42515;

    static {
        InterfaceC12394[] interfaceC12394Arr = C24517.f79501;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32893(AbstractC13328 abstractC13328, int i) {
        int i2 = abstractC13328.f42514;
        if (i > i2) {
            throw new IllegalArgumentException(String.format("Request %,d exceeds maximum %,d", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32894() {
        m32893(this.f42515.f50624, 8192);
        this.f42513 = 8192;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m32896() {
        return this.f42513;
    }

    public AbstractC13328() {
        super(6);
        this.f42513 = 8192;
        this.f42514 = Integer.MAX_VALUE;
        Charset.defaultCharset();
        Charset.defaultCharset();
        this.f42515 = new C15565(this);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InputStream m32895() {
        return ((C11090) m46098()).f74717;
    }
}
