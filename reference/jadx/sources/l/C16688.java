package l;

import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.engines.SEEDEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: renamed from: l.ܺ۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7XO */
/* JADX INFO: loaded from: classes5.dex */
public final class C16688 implements InterfaceC21360 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DefaultBufferedBlockCipher f53931;

    @Override // l.InterfaceC21360
    public final int getBlockSize() {
        return 16;
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3921(int i) {
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3924(byte[] bArr) {
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3925() {
        return true;
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
    /* JADX INFO: renamed from: ᩸ */
    public final int mo3930() {
        return 16;
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public final void mo3923(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr2.length > 16) {
            byte[] bArr3 = new byte[16];
            System.arraycopy(bArr2, 0, bArr3, 0, 16);
            bArr2 = bArr3;
        }
        if (bArr.length > 16) {
            byte[] bArr4 = new byte[16];
            System.arraycopy(bArr, 0, bArr4, 0, 16);
            bArr = bArr4;
        }
        try {
            ParametersWithIV parametersWithIV = new ParametersWithIV(new KeyParameter(bArr, 0, bArr.length), bArr2, 0, bArr2.length);
            DefaultBufferedBlockCipher defaultBufferedBlockCipher = new DefaultBufferedBlockCipher(CBCBlockCipher.newInstance(new SEEDEngine()));
            this.f53931 = defaultBufferedBlockCipher;
            defaultBufferedBlockCipher.init(i == 0, parametersWithIV);
        } catch (Exception e) {
            this.f53931 = null;
            throw e;
        }
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public final void mo3922(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        this.f53931.processBytes(bArr, i, i2, bArr2, i3);
    }
}
