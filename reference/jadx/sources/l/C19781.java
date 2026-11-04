package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ᩴۧܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19KT */
/* JADX INFO: loaded from: classes5.dex */
public final class C19781 implements InterfaceC8310 {
    @Override // l.InterfaceC8310
    /* JADX INFO: renamed from: ۙ */
    public final EnumC6073 mo6458() {
        return EnumC6073.FileBothDirectoryInformation;
    }

    @Override // l.InterfaceC8310
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC13530 mo6459(C25134 c25134) throws C2013 {
        long jM56012 = c25134.m56012();
        c25134.m56012();
        C3089.m10063(c25134);
        C3089.m10063(c25134);
        C3089.m10063(c25134);
        C3089.m10063(c25134);
        c25134.m56016();
        c25134.m56016();
        c25134.m56012();
        long jM56013 = c25134.m56012();
        c25134.m56012();
        byte bM56020 = c25134.m56020();
        c25134.m56020();
        byte[] bArr = new byte[24];
        c25134.m56024(24, bArr);
        Charset charset = C22150.f71350;
        new String(bArr, 0, bM56020, charset);
        return new C18005(jM56012, c25134.m56003(((int) jM56013) / 2, charset));
    }
}
