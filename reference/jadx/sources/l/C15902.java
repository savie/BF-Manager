package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ܺۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 19KT */
/* JADX INFO: loaded from: classes4.dex */
public final class C15902 implements InterfaceC18723 {
    @Override // l.InterfaceC18723
    /* JADX INFO: renamed from: ۙ */
    public final EnumC13785 mo2111() {
        return EnumC13785.FileBothDirectoryInformation;
    }

    @Override // l.InterfaceC18723
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC19429 mo2112(C10922 c10922) throws C17271 {
        long jM27394 = c10922.m27394();
        c10922.m27394();
        C9407.m24150(c10922);
        C9407.m24150(c10922);
        C9407.m24150(c10922);
        C9407.m24150(c10922);
        c10922.m27390();
        c10922.m27390();
        c10922.m27394();
        long jM27395 = c10922.m27394();
        c10922.m27394();
        byte bM27388 = c10922.m27388();
        c10922.m27388();
        byte[] bArr = new byte[24];
        c10922.m27397(24, bArr);
        Charset charset = C7393.f24570;
        new String(bArr, 0, bM27388, charset);
        return new C1083(jM27394, c10922.m27379(((int) jM27395) / 2, charset));
    }
}
