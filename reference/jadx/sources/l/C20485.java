package l;

import java.nio.ByteBuffer;
import javax.crypto.AEADBadTagException;
import org.bouncycastle.crypto.engines.ChaChaEngine;
import org.bouncycastle.crypto.macs.Poly1305;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: renamed from: l.᩶᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37WC */
/* JADX INFO: loaded from: classes5.dex */
public final class C20485 implements InterfaceC1142 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ChaChaEngine f66432;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public KeyParameter f66433;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f66434;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ChaChaEngine f66435;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public KeyParameter f66436;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Poly1305 f66437;

    @Override // l.InterfaceC1142
    public final int getBlockSize() {
        return 64;
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۖ */
    public final int mo2383() {
        return 8;
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2387(byte[] bArr) {
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2388() {
        return false;
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo2389() {
        return true;
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo2390() {
        return true;
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ܰ */
    public final int mo2391() {
        return 16;
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۙ */
    public final void mo2386(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr.length > 64) {
            byte[] bArr3 = new byte[64];
            System.arraycopy(bArr, 0, bArr3, 0, 64);
            bArr = bArr3;
        }
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[32];
        System.arraycopy(bArr, 32, bArr4, 0, 32);
        System.arraycopy(bArr, 0, bArr5, 0, 32);
        this.f66434 = i;
        try {
            this.f66433 = new KeyParameter(bArr4, 0, 32);
            this.f66436 = new KeyParameter(bArr5, 0, 32);
            this.f66435 = new ChaChaEngine();
            this.f66432 = new ChaChaEngine();
            this.f66437 = new Poly1305();
        } catch (Exception e) {
            this.f66435 = null;
            this.f66432 = null;
            this.f66433 = null;
            this.f66436 = null;
            throw e;
        }
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۙ */
    public final void mo2384(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(0, i);
        this.f66435.init(this.f66434 == 0, new ParametersWithIV(this.f66433, byteBufferAllocate.array(), 0, byteBufferAllocate.array().length));
        this.f66432.init(this.f66434 == 0, new ParametersWithIV(this.f66436, byteBufferAllocate.array(), 0, byteBufferAllocate.array().length));
        byte[] bArr = new byte[64];
        this.f66432.processBytes(bArr, 0, 64, bArr, 0);
        this.f66437.init(new KeyParameter(bArr, 0, 32));
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۙ */
    public final void mo2385(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        this.f66435.processBytes(bArr, i, i2, bArr2, i3);
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ܰ */
    public final void mo2392(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws AEADBadTagException {
        if (this.f66434 == 1) {
            byte[] bArr3 = new byte[16];
            System.arraycopy(bArr, i2, bArr3, 0, 16);
            byte[] bArr4 = new byte[16];
            if (i < 0) {
                this.f66437.update(bArr, i + 4, i2);
            } else {
                this.f66437.update(bArr, i, i2);
            }
            this.f66437.doFinal(bArr4, 0);
            int i4 = 0;
            for (int i5 = 0; i5 < 16; i5++) {
                i4 |= bArr3[i5] ^ bArr4[i5];
            }
            if (i4 != 0) {
                throw new AEADBadTagException("Tag mismatch");
            }
        }
        if (i < 0) {
            this.f66432.processBytes(bArr, i + 4, (i2 - 4) - i, bArr2, i3 + 4 + i);
        } else {
            this.f66432.processBytes(bArr, i + 4, i2 - 4, bArr2, i3 + 4);
        }
        if (this.f66434 == 0) {
            this.f66437.update(bArr2, i3, i2);
            this.f66437.doFinal(bArr2, i2);
        }
    }
}
