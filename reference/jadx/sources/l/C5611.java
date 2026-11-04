package l;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۚۧܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19KT */
/* JADX INFO: loaded from: classes3.dex */
public final class C5611 implements InterfaceC8310 {
    @Override // l.InterfaceC8310
    /* JADX INFO: renamed from: ۙ */
    public final EnumC6073 mo6458() {
        return EnumC6073.FileIdBothDirectoryInformation;
    }

    @Override // l.InterfaceC8310
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC13530 mo6459(C25134 c25134) throws C2013 {
        long jM56012 = c25134.m56012();
        c25134.m56012();
        C3089.m10063(c25134);
        C3089.m10063(c25134);
        C23227 c23227M10063 = C3089.m10063(c25134);
        C23227 c23227M10064 = C3089.m10063(c25134);
        long jM56016 = c25134.m56016();
        c25134.m56016();
        long jM56013 = c25134.m56012();
        long jM56014 = c25134.m56012();
        c25134.m56012();
        byte bM56020 = c25134.m56020();
        c25134.m56020();
        byte[] bArr = new byte[24];
        c25134.m56024(24, bArr);
        Charset charset = C22150.f71350;
        new String(bArr, 0, bM56020, charset);
        c25134.m56017();
        c25134.m56018();
        return new C9055(jM56012, c25134.m56003(((int) jM56014) / 2, charset), c23227M10063, c23227M10064, jM56016, jM56013);
    }
}
