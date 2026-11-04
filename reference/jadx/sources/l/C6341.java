package l;

import java.io.EOFException;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: renamed from: l.ۛۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B1VV */
/* JADX INFO: loaded from: classes3.dex */
public final class C6341 extends AbstractC24241 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f21465;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f21466;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f21467;

    @Override // l.AbstractC24241
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo18065() {
        return 28;
    }

    @Override // l.AbstractC24241
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AlgorithmParameterSpec mo18066() {
        return null;
    }

    public C6341(int i, String str, String str2) {
        this.f21467 = i;
        this.f21466 = str;
        this.f21465 = str2;
    }

    @Override // l.AbstractC24241
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo18063() {
        return this.f21467;
    }

    @Override // l.AbstractC24241
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String mo18067() {
        return this.f21466;
    }

    @Override // l.AbstractC24241
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String mo18068() {
        return this.f21465;
    }

    @Override // l.AbstractC24241
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18064(InterfaceC17044 interfaceC17044, InterfaceC17044 interfaceC17045, InterfaceC17044 interfaceC17046, InterfaceC7509 interfaceC7509) throws EOFException {
        byte[] bArrM7566 = new C2217(new byte[8]).m7566(interfaceC17044, interfaceC17045, interfaceC17046, interfaceC7509);
        if (interfaceC7509.mo924()) {
            return;
        }
        byte[] bArr = new byte[bArrM7566.length + 8];
        System.arraycopy(bArrM7566, 0, bArr, 0, bArrM7566.length);
        C2940.m9618(interfaceC17046.size() + interfaceC17045.size() + interfaceC17044.size(), bArrM7566.length, bArr);
        this.f78516 = bArr;
    }
}
