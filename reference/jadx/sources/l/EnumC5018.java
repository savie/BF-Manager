package l;

import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۙܺܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09J5 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC5018 implements InterfaceC22896 {
    SHA_512(1, XMSSKeyParameters.SHA_512);


    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f17410;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f17411;

    EnumC5018(long j, String str) {
        this.f17411 = j;
        this.f17410 = str;
    }

    @Override // l.InterfaceC22896
    public long getValue() {
        return this.f17411;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m15246() {
        return this.f17410;
    }
}
