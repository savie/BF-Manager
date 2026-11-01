package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ܿۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47VB */
/* JADX INFO: loaded from: classes4.dex */
public final class C17185 extends AbstractC0251 {
    @Override // l.AbstractC0251
    /* JADX INFO: renamed from: ۙ */
    public final void mo1688(C3073 c3073, AbstractC7848 abstractC7848) {
        super.mo1688(c3073, abstractC7848);
        C14904 c14904 = new C14904();
        C7307 c7307 = new C7307(c14904);
        c7307.m19501();
        c14904.m35630((byte) 98);
        c14904.m35644(abstractC7848.f25821);
        byte[] bArr = C8491.f29422;
        Charset charset = StandardCharsets.UTF_8;
        c14904.m35627("subsystem".getBytes(charset));
        c14904.m35630(m1691() ? (byte) 1 : (byte) 0);
        c14904.m35627("sftp".getBytes(charset));
        m1689(c7307);
    }
}
