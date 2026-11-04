package l;

import javax.crypto.spec.GCMParameterSpec;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.params.AEADParameters;

/* JADX INFO: renamed from: l.ۚ᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9IQ */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5962 implements InterfaceC2758 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AEADBlockCipher f20410;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AEADParameters mo17348(byte[] bArr, GCMParameterSpec gCMParameterSpec);

    public AbstractC5962(AEADBlockCipher aEADBlockCipher) {
        this.f20410 = aEADBlockCipher;
    }

    @Override // l.InterfaceC2758
    /* JADX INFO: renamed from: ۙ */
    public final void mo9103(EnumC8724 enumC8724, byte[] bArr, GCMParameterSpec gCMParameterSpec) {
        this.f20410.init(enumC8724 == EnumC8724.ENCRYPT, mo17348(bArr, gCMParameterSpec));
    }

    @Override // l.InterfaceC2758
    /* JADX INFO: renamed from: ۙ */
    public final void mo9104(byte[] bArr) {
        this.f20410.processAADBytes(bArr, 0, 32);
    }

    @Override // l.InterfaceC2758
    public final byte[] update(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[this.f20410.getUpdateOutputSize(i2)];
        this.f20410.processBytes(bArr, i, i2, bArr2, 0);
        return bArr2;
    }

    @Override // l.InterfaceC2758
    /* JADX INFO: renamed from: ᩷ */
    public final byte[] mo9105(int i, byte[] bArr) throws C11181 {
        AEADBlockCipher aEADBlockCipher = this.f20410;
        byte[] bArr2 = new byte[aEADBlockCipher.getOutputSize(i)];
        try {
            aEADBlockCipher.doFinal(bArr2, aEADBlockCipher.processBytes(bArr, 0, i, bArr2, 0));
            return bArr2;
        } catch (InvalidCipherTextException e) {
            throw new C11181(e);
        }
    }
}
