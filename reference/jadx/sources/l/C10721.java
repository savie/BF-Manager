package l;

import java.nio.ByteBuffer;
import javax.crypto.AEADBadTagException;
import org.bouncycastle.crypto.engines.ChaChaEngine;
import org.bouncycastle.crypto.macs.Poly1305;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: renamed from: l.ۤ۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37WC */
/* JADX INFO: loaded from: classes4.dex */
public final class C10721 implements InterfaceC21360 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public KeyParameter f34043;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ChaChaEngine f34044;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Poly1305 f34045;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f34046;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public KeyParameter f34047;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ChaChaEngine f34048;

    @Override // l.InterfaceC21360
    public final int getBlockSize() {
        return 64;
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3924(byte[] bArr) {
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3925() {
        return false;
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo3926() {
        return true;
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo3927() {
        return true;
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ᩷ */
    public final int mo3928() {
        return 16;
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ᩸ */
    public final int mo3930() {
        return 8;
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public final void mo3923(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr.length > 64) {
            byte[] bArr3 = new byte[64];
            System.arraycopy(bArr, 0, bArr3, 0, 64);
            bArr = bArr3;
        }
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[32];
        System.arraycopy(bArr, 32, bArr4, 0, 32);
        System.arraycopy(bArr, 0, bArr5, 0, 32);
        this.f34046 = i;
        try {
            this.f34043 = new KeyParameter(bArr4, 0, 32);
            this.f34047 = new KeyParameter(bArr5, 0, 32);
            this.f34044 = new ChaChaEngine();
            this.f34048 = new ChaChaEngine();
            this.f34045 = new Poly1305();
        } catch (Exception e) {
            this.f34044 = null;
            this.f34048 = null;
            this.f34043 = null;
            this.f34047 = null;
            throw e;
        }
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public final void mo3921(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(0, i);
        this.f34044.init(this.f34046 == 0, new ParametersWithIV(this.f34043, byteBufferAllocate.array(), 0, byteBufferAllocate.array().length));
        this.f34048.init(this.f34046 == 0, new ParametersWithIV(this.f34047, byteBufferAllocate.array(), 0, byteBufferAllocate.array().length));
        byte[] bArr = new byte[64];
        this.f34048.processBytes(bArr, 0, 64, bArr, 0);
        this.f34045.init(new KeyParameter(bArr, 0, 32));
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public final void mo3922(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        this.f34044.processBytes(bArr, i, i2, bArr2, i3);
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ᩷ */
    public final void mo3929(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws AEADBadTagException {
        if (this.f34046 == 1) {
            byte[] bArr3 = new byte[16];
            System.arraycopy(bArr, i2, bArr3, 0, 16);
            byte[] bArr4 = new byte[16];
            if (i < 0) {
                this.f34045.update(bArr, i + 4, i2);
            } else {
                this.f34045.update(bArr, i, i2);
            }
            this.f34045.doFinal(bArr4, 0);
            int i4 = 0;
            for (int i5 = 0; i5 < 16; i5++) {
                i4 |= bArr3[i5] ^ bArr4[i5];
            }
            if (i4 != 0) {
                throw new AEADBadTagException("Tag mismatch");
            }
        }
        if (i < 0) {
            this.f34048.processBytes(bArr, i + 4, (i2 - 4) - i, bArr2, i3 + 4 + i);
        } else {
            this.f34048.processBytes(bArr, i + 4, i2 - 4, bArr2, i3 + 4);
        }
        if (this.f34046 == 0) {
            this.f34045.update(bArr2, i3, i2);
            this.f34045.doFinal(bArr2, i2);
        }
    }
}
