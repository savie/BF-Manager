package l;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.PSSParameterSpec;

/* JADX INFO: renamed from: l.ۨۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VV */
/* JADX INFO: loaded from: classes4.dex */
public final class C12306 extends AbstractC24241 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AlgorithmParameterSpec f39570;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f39571;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f39572;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f39573;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f39574;

    @Override // l.AbstractC24241
    /* JADX INFO: renamed from: ۤ */
    public final int mo18065() {
        return 24;
    }

    public C12306(int i, String str, String str2, String str3, PSSParameterSpec pSSParameterSpec) {
        this.f39573 = i;
        this.f39574 = str;
        this.f39572 = str2;
        this.f39571 = str3;
        this.f39570 = pSSParameterSpec;
    }

    @Override // l.AbstractC24241
    /* JADX INFO: renamed from: ۙ */
    public final int mo18063() {
        return this.f39573;
    }

    @Override // l.AbstractC24241
    /* JADX INFO: renamed from: ᩷ */
    public final String mo18067() {
        return this.f39572;
    }

    @Override // l.AbstractC24241
    /* JADX INFO: renamed from: ᩸ */
    public final String mo18068() {
        return this.f39571;
    }

    @Override // l.AbstractC24241
    /* JADX INFO: renamed from: ᩴ */
    public final AlgorithmParameterSpec mo18066() {
        return this.f39570;
    }

    @Override // l.AbstractC24241
    /* JADX INFO: renamed from: ۙ */
    public final void mo18064(InterfaceC17044 interfaceC17044, InterfaceC17044 interfaceC17045, InterfaceC17044 interfaceC17046, InterfaceC7509 interfaceC7509) throws NoSuchAlgorithmException, IOException {
        String str = this.f39574;
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        MessageDigest messageDigest2 = MessageDigest.getInstance(str);
        int iM54236 = AbstractC24241.m54236(interfaceC17044.size()) + AbstractC24241.m54236(interfaceC17045.size()) + AbstractC24241.m54236(interfaceC17046.size());
        C20511 c20511 = new C20511(messageDigest2);
        byte[] bArr = new byte[5];
        bArr[0] = 90;
        C2940.m9617(iM54236, 1, bArr);
        c20511.write(bArr);
        AbstractC24241.m54238(messageDigest, interfaceC17044, c20511, interfaceC7509);
        if (interfaceC7509.mo924()) {
            return;
        }
        AbstractC24241.m54238(messageDigest, interfaceC17045, c20511, interfaceC7509);
        if (interfaceC7509.mo924()) {
            return;
        }
        AbstractC24241.m54238(messageDigest, interfaceC17046, c20511, interfaceC7509);
        if (interfaceC7509.mo924()) {
            return;
        }
        this.f78516 = messageDigest2.digest();
    }
}
