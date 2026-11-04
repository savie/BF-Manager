package l;

import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.DESedeParameters;

/* JADX INFO: renamed from: l.ܶ᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99JQ */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16402 implements InterfaceC7233 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public BufferedBlockCipher f53232;

    public AbstractC16402(BufferedBlockCipher bufferedBlockCipher) {
        this.f53232 = bufferedBlockCipher;
    }

    @Override // l.InterfaceC7233
    /* JADX INFO: renamed from: ۙ */
    public final void mo19835(EnumC8724 enumC8724, byte[] bArr) {
        this.f53232.init(enumC8724 == EnumC8724.ENCRYPT, new DESedeParameters(bArr));
    }

    @Override // l.InterfaceC7233
    /* JADX INFO: renamed from: ۙ */
    public final int mo19834(int i, byte[] bArr, byte[] bArr2) {
        return this.f53232.processBytes(bArr, 0, i, bArr2, 0);
    }

    @Override // l.InterfaceC7233
    public final int doFinal(byte[] bArr, int i) throws C11181 {
        try {
            return this.f53232.doFinal(bArr, i);
        } catch (InvalidCipherTextException e) {
            throw new C11181(e);
        }
    }
}
