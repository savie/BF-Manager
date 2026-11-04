package l;

import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.crypto.modes.CTRModeCipher;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: renamed from: l.ܿ۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07ZJ */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18180 implements InterfaceC21360 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CTRModeCipher f59417;

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3921(int i) {
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3924(byte[] bArr) {
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ boolean mo3926() {
        return false;
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ boolean mo3927() {
        return false;
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ int mo3928() {
        return 0;
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ void mo3929(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public void mo3923(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr2.length > 16) {
            byte[] bArr3 = new byte[16];
            System.arraycopy(bArr2, 0, bArr3, 0, 16);
            bArr2 = bArr3;
        }
        int blockSize = getBlockSize();
        if (bArr.length > blockSize) {
            byte[] bArr4 = new byte[blockSize];
            System.arraycopy(bArr, 0, bArr4, 0, blockSize);
            bArr = bArr4;
        }
        try {
            ParametersWithIV parametersWithIV = new ParametersWithIV(new KeyParameter(bArr, 0, bArr.length), bArr2, 0, bArr2.length);
            CTRModeCipher cTRModeCipherNewInstance = SICBlockCipher.newInstance(new TwofishEngine());
            this.f59417 = cTRModeCipherNewInstance;
            cTRModeCipherNewInstance.init(i == 0, parametersWithIV);
        } catch (Exception e) {
            this.f59417 = null;
            throw e;
        }
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public void mo3922(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        this.f59417.processBytes(bArr, i, i2, bArr2, i3);
    }
}
