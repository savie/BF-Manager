package l;

import java.io.EOFException;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: renamed from: l.۟ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7439 extends AbstractC20845 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f24813;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f24814;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f24815;

    @Override // l.AbstractC20845
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AlgorithmParameterSpec mo19925() {
        return null;
    }

    @Override // l.AbstractC20845
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo19926() {
        return 28;
    }

    public C7439(int i, String str, String str2) {
        this.f24813 = i;
        this.f24814 = str;
        this.f24815 = str2;
    }

    @Override // l.AbstractC20845
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo19923() {
        return this.f24813;
    }

    @Override // l.AbstractC20845
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String mo19927() {
        return this.f24814;
    }

    @Override // l.AbstractC20845
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String mo19922() {
        return this.f24815;
    }

    @Override // l.AbstractC20845
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19924(InterfaceC19248 interfaceC19248, InterfaceC19248 interfaceC19249, InterfaceC19248 interfaceC192410, InterfaceC5614 interfaceC5614) throws EOFException {
        byte[] bArrM41313 = new C17753(new byte[8]).m41313(interfaceC19248, interfaceC19249, interfaceC192410, interfaceC5614);
        if (interfaceC5614.mo2357()) {
            return;
        }
        byte[] bArr = new byte[bArrM41313.length + 8];
        System.arraycopy(bArrM41313, 0, bArr, 0, bArrM41313.length);
        C1856.m6057(interfaceC192410.size() + interfaceC19249.size() + interfaceC19248.size(), bArrM41313.length, bArr);
        this.f67729 = bArr;
    }
}
