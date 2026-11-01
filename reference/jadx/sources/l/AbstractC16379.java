package l;

import javax.crypto.spec.GCMParameterSpec;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.params.AEADParameters;

/* JADX INFO: renamed from: l.ܽۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G9IQ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16379 implements InterfaceC17789 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AEADBlockCipher f52708;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AEADParameters mo38565(byte[] bArr, GCMParameterSpec gCMParameterSpec);

    public AbstractC16379(AEADBlockCipher aEADBlockCipher) {
        this.f52708 = aEADBlockCipher;
    }

    @Override // l.InterfaceC17789
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo38566(EnumC18495 enumC18495, byte[] bArr, GCMParameterSpec gCMParameterSpec) {
        this.f52708.init(enumC18495 == EnumC18495.ENCRYPT, mo38565(bArr, gCMParameterSpec));
    }

    @Override // l.InterfaceC17789
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo38567(byte[] bArr) {
        this.f52708.processAADBytes(bArr, 0, 32);
    }

    @Override // l.InterfaceC17789
    public final byte[] update(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[this.f52708.getUpdateOutputSize(i2)];
        this.f52708.processBytes(bArr, i, i2, bArr2, 0);
        return bArr2;
    }

    @Override // l.InterfaceC17789
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] mo38568(int i, byte[] bArr) throws C7206 {
        AEADBlockCipher aEADBlockCipher = this.f52708;
        byte[] bArr2 = new byte[aEADBlockCipher.getOutputSize(i)];
        try {
            aEADBlockCipher.doFinal(bArr2, aEADBlockCipher.processBytes(bArr, 0, i, bArr2, 0));
            return bArr2;
        } catch (InvalidCipherTextException e) {
            throw new C7206(e);
        }
    }
}
