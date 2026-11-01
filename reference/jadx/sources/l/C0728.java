package l;

import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: renamed from: l.֡᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7XH */
/* JADX INFO: loaded from: classes2.dex */
public class C0728 implements InterfaceC10130 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f3016 = new byte[4];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public RIPEMD160Digest f3017 = new RIPEMD160Digest();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public HMac f3018;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f3019;

    @Override // l.InterfaceC10130
    public final int getBlockSize() {
        return 20;
    }

    @Override // l.InterfaceC10130
    public final void init(byte[] bArr) {
        if (bArr.length > 20) {
            byte[] bArr2 = new byte[20];
            System.arraycopy(bArr, 0, bArr2, 0, 20);
            bArr = bArr2;
        }
        KeyParameter keyParameter = new KeyParameter(bArr, 0, bArr.length);
        HMac hMac = new HMac(this.f3017);
        this.f3018 = hMac;
        hMac.init(keyParameter);
    }

    @Override // l.InterfaceC10130
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3161(int i) {
        byte[] bArr = this.f3016;
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
        mo3162(4, bArr);
    }

    @Override // l.InterfaceC10130
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3162(int i, byte[] bArr) {
        this.f3018.update(bArr, 0, i);
    }

    @Override // l.InterfaceC10130
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo3164(int i, byte[] bArr) {
        this.f3018.doFinal(bArr, i);
    }

    @Override // l.InterfaceC10130
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo3163() {
        return this.f3019;
    }
}
