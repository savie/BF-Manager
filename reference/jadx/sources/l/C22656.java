package l;

import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: renamed from: l.᩸۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7XH */
/* JADX INFO: loaded from: classes.dex */
public class C22656 implements InterfaceC7299 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HMac f73574;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f73575;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f73576 = new byte[4];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public RIPEMD160Digest f73573 = new RIPEMD160Digest();

    @Override // l.InterfaceC7299
    public final int getBlockSize() {
        return 20;
    }

    @Override // l.InterfaceC7299
    public final void init(byte[] bArr) {
        if (bArr.length > 20) {
            byte[] bArr2 = new byte[20];
            System.arraycopy(bArr, 0, bArr2, 0, 20);
            bArr = bArr2;
        }
        KeyParameter keyParameter = new KeyParameter(bArr, 0, bArr.length);
        HMac hMac = new HMac(this.f73573);
        this.f73574 = hMac;
        hMac.init(keyParameter);
    }

    @Override // l.InterfaceC7299
    /* JADX INFO: renamed from: ۙ */
    public final void mo19965(int i) {
        byte[] bArr = this.f73576;
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
        mo19966(4, bArr);
    }

    @Override // l.InterfaceC7299
    /* JADX INFO: renamed from: ۙ */
    public final void mo19966(int i, byte[] bArr) {
        this.f73574.update(bArr, 0, i);
    }

    @Override // l.InterfaceC7299
    /* JADX INFO: renamed from: ᩷ */
    public final void mo19967(int i, byte[] bArr) {
        this.f73574.doFinal(bArr, i);
    }

    @Override // l.InterfaceC7299
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2726() {
        return this.f73575;
    }
}
