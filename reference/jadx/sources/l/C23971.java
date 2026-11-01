package l;

import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.᩻᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7Z6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23971 extends AbstractC14799 {
    @Override // l.AbstractC14799
    /* JADX INFO: renamed from: ۙ */
    public final String mo6638() {
        return OpenSSHPublicKeyUtil.RSA;
    }

    @Override // l.InterfaceC2845
    public final byte[] sign() {
        return this.f48391.sign();
    }
}
