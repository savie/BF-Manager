package l;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: l.᩹ܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: S135 */
/* JADX INFO: loaded from: classes.dex */
public final class C23659 implements InterfaceC16199 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final MessageDigest f76738;

    public C23659(String str) {
        try {
            this.f76738 = MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.InterfaceC16199
    /* JADX INFO: renamed from: ۙ */
    public final void mo38424(C5759 c5759) {
        this.f76738.update(c5759.m16831(), 0, c5759.m16833());
    }

    @Override // l.InterfaceC16199
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo38425() {
        return this.f76738.digest();
    }

    public final String toString() {
        return this.f76738.getAlgorithm();
    }
}
