package l;

import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ۧۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7Z6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11532 extends AbstractC24959 {
    @Override // l.AbstractC24959
    /* JADX INFO: renamed from: ۙ */
    public final String mo10973() {
        return OpenSSHPublicKeyUtil.RSA;
    }

    @Override // l.InterfaceC11994
    public final byte[] sign() {
        return this.f80822.sign();
    }
}
