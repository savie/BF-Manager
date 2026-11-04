package l;

import java.security.MessageDigest;

/* JADX INFO: renamed from: l.֫ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes3.dex */
public final class C1754 extends AbstractC24129 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ MessageDigest f5986;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1754(InterfaceC7509 interfaceC7509, MessageDigest messageDigest) {
        super(interfaceC7509);
        this.f5986 = messageDigest;
    }

    @Override // l.AbstractC24129
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6198(byte[] bArr, int i, int i2) {
        this.f5986.update(bArr, i, i2);
    }
}
