package l;

import org.bouncycastle.crypto.engines.RC4Engine;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: renamed from: l.᩹᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99JQ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23862 implements InterfaceC7233 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public RC4Engine f77254;

    public AbstractC23862(RC4Engine rC4Engine) {
        this.f77254 = rC4Engine;
    }

    @Override // l.InterfaceC7233
    /* JADX INFO: renamed from: ۙ */
    public final void mo19835(EnumC8724 enumC8724, byte[] bArr) {
        this.f77254.init(enumC8724 == EnumC8724.ENCRYPT, new KeyParameter(bArr));
    }

    @Override // l.InterfaceC7233
    /* JADX INFO: renamed from: ۙ */
    public final int mo19834(int i, byte[] bArr, byte[] bArr2) {
        return this.f77254.processBytes(bArr, 0, i, bArr2, 0);
    }

    @Override // l.InterfaceC7233
    public final int doFinal(byte[] bArr, int i) {
        this.f77254.reset();
        return 0;
    }
}
