package l;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.PSSParameterSpec;

/* JADX INFO: renamed from: l.ۤۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VV */
/* JADX INFO: loaded from: classes3.dex */
public final class C10262 extends AbstractC20845 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f34983;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f34984;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f34985;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AlgorithmParameterSpec f34986;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f34987;

    @Override // l.AbstractC20845
    /* JADX INFO: renamed from: ۨ */
    public final int mo19926() {
        return 24;
    }

    public C10262(int i, String str, String str2, String str3, PSSParameterSpec pSSParameterSpec) {
        this.f34985 = i;
        this.f34984 = str;
        this.f34987 = str2;
        this.f34983 = str3;
        this.f34986 = pSSParameterSpec;
    }

    @Override // l.AbstractC20845
    /* JADX INFO: renamed from: ۙ */
    public final int mo19923() {
        return this.f34985;
    }

    @Override // l.AbstractC20845
    /* JADX INFO: renamed from: ܰ */
    public final String mo19927() {
        return this.f34987;
    }

    @Override // l.AbstractC20845
    /* JADX INFO: renamed from: ۖ */
    public final String mo19922() {
        return this.f34983;
    }

    @Override // l.AbstractC20845
    /* JADX INFO: renamed from: ۚ */
    public final AlgorithmParameterSpec mo19925() {
        return this.f34986;
    }

    @Override // l.AbstractC20845
    /* JADX INFO: renamed from: ۙ */
    public final void mo19924(InterfaceC19248 interfaceC19248, InterfaceC19248 interfaceC19249, InterfaceC19248 interfaceC192410, InterfaceC5614 interfaceC5614) throws NoSuchAlgorithmException, IOException {
        String str = this.f34984;
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        MessageDigest messageDigest2 = MessageDigest.getInstance(str);
        int iM46866 = AbstractC20845.m46866(interfaceC19248.size()) + AbstractC20845.m46866(interfaceC19249.size()) + AbstractC20845.m46866(interfaceC192410.size());
        C8851 c8851 = new C8851(messageDigest2);
        byte[] bArr = new byte[5];
        bArr[0] = 90;
        C1856.m6056(iM46866, 1, bArr);
        c8851.write(bArr);
        AbstractC20845.m46868(messageDigest, interfaceC19248, c8851, interfaceC5614);
        if (interfaceC5614.mo2357()) {
            return;
        }
        AbstractC20845.m46868(messageDigest, interfaceC19249, c8851, interfaceC5614);
        if (interfaceC5614.mo2357()) {
            return;
        }
        AbstractC20845.m46868(messageDigest, interfaceC192410, c8851, interfaceC5614);
        if (interfaceC5614.mo2357()) {
            return;
        }
        this.f67729 = messageDigest2.digest();
    }
}
