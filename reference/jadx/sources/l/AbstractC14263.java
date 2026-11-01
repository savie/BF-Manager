package l;

import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.DESedeParameters;

/* JADX INFO: renamed from: l.ܳۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 99JQ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14263 implements InterfaceC7912 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public BufferedBlockCipher f46678;

    public AbstractC14263(BufferedBlockCipher bufferedBlockCipher) {
        this.f46678 = bufferedBlockCipher;
    }

    @Override // l.InterfaceC7912
    /* JADX INFO: renamed from: ۙ */
    public final void mo5340(EnumC18495 enumC18495, byte[] bArr) {
        this.f46678.init(enumC18495 == EnumC18495.ENCRYPT, new DESedeParameters(bArr));
    }

    @Override // l.InterfaceC7912
    /* JADX INFO: renamed from: ۙ */
    public final int mo5339(int i, byte[] bArr, byte[] bArr2) {
        return this.f46678.processBytes(bArr, 0, i, bArr2, 0);
    }

    @Override // l.InterfaceC7912
    public final int doFinal(byte[] bArr, int i) throws C7206 {
        try {
            return this.f46678.doFinal(bArr, i);
        } catch (InvalidCipherTextException e) {
            throw new C7206(e);
        }
    }
}
