package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۧۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7UV */
/* JADX INFO: loaded from: classes4.dex */
public final class C10836 extends AbstractC0251 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f36880 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27157(C3073 c3073, C5376 c5376, String str, boolean z) {
        m1690(z);
        this.f36880 = str;
        super.mo1688(c3073, c5376);
        C14904 c14904 = new C14904();
        C7307 c7307 = new C7307(c14904);
        c7307.m19501();
        c14904.m35630((byte) 98);
        c14904.m35644(c5376.f25821);
        byte[] bArr = C8491.f29422;
        Charset charset = StandardCharsets.UTF_8;
        c14904.m35627("subsystem".getBytes(charset));
        c14904.m35630(m1691() ? (byte) 1 : (byte) 0);
        c14904.m35627(C8491.m22175(this.f36880, charset));
        m1689(c7307);
    }
}
