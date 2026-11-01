package l;

import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: renamed from: l.ۘܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7WT */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4026 implements InterfaceC1142 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DefaultBufferedBlockCipher f14889;

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2384(int i) {
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2387(byte[] bArr) {
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۚ */
    public final /* synthetic */ boolean mo2389() {
        return false;
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ boolean mo2390() {
        return false;
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ int mo2391() {
        return 0;
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void mo2392(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۙ */
    public void mo2386(int i, byte[] bArr, byte[] bArr2) throws Exception {
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
            DefaultBufferedBlockCipher defaultBufferedBlockCipher = new DefaultBufferedBlockCipher(CBCBlockCipher.newInstance(new TwofishEngine()));
            this.f14889 = defaultBufferedBlockCipher;
            defaultBufferedBlockCipher.init(i == 0, parametersWithIV);
        } catch (Exception e) {
            this.f14889 = null;
            throw e;
        }
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۙ */
    public void mo2385(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        this.f14889.processBytes(bArr, i, i2, bArr2, i3);
    }
}
