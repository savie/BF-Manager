package l;

import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ۡܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 09J5 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC8949 implements InterfaceC15861 {
    SHA_512(1, XMSSKeyParameters.SHA_512);


    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f30676;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f30677;

    EnumC8949(long j, String str) {
        this.f30677 = j;
        this.f30676 = str;
    }

    @Override // l.InterfaceC15861
    public long getValue() {
        return this.f30677;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String m23249() {
        return this.f30676;
    }
}
