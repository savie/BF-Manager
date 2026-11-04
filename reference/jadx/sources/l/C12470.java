package l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۨܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: J55M */
/* JADX INFO: loaded from: classes3.dex */
public final class C12470 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f40054;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14707[] f40055;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f40056;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21421 f40057;

    public C12470(byte[] bArr) throws C3521 {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f40054 = byteBufferWrap;
        byte[] bArr2 = new byte[16];
        byteBufferWrap.get(bArr2);
        if (bArr2[0] != 127 || bArr2[1] != 69 || bArr2[2] != 76 || bArr2[3] != 70) {
            throw new C3521("Invalid ELF signature");
        }
        byte b = bArr2[4];
        if (b == 1) {
            this.f40056 = false;
        } else {
            if (b != 2) {
                throw new C3521("Invalid ELF class");
            }
            this.f40056 = true;
        }
        byte b2 = bArr2[5];
        if (b2 == 1) {
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            if (b2 != 2) {
                throw new C3521("Invalid ELF endian");
            }
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        }
        if (bArr2[6] != 1) {
            throw new C3521("Invalid ELF version");
        }
        byteBufferWrap.getShort(16);
        byteBufferWrap.getShort(18);
        byteBufferWrap.getInt(20);
        if (this.f40056) {
            byteBufferWrap.getLong(24);
            byteBufferWrap.getInt(48);
            C14707[] c14707ArrM30964 = m30964(byteBufferWrap.getInt(40), byteBufferWrap.getShort(58) & HPKE.aead_EXPORT_ONLY, byteBufferWrap.getShort(60) & HPKE.aead_EXPORT_ONLY);
            this.f40055 = c14707ArrM30964;
            this.f40057 = (C21421) c14707ArrM30964[byteBufferWrap.getShort(62) & HPKE.aead_EXPORT_ONLY];
            return;
        }
        byteBufferWrap.getInt(24);
        byteBufferWrap.getInt(36);
        C14707[] c14707ArrM30965 = m30964(byteBufferWrap.getInt(32), byteBufferWrap.getShort(46) & HPKE.aead_EXPORT_ONLY, byteBufferWrap.getShort(48) & HPKE.aead_EXPORT_ONLY);
        this.f40055 = c14707ArrM30965;
        this.f40057 = (C21421) c14707ArrM30965[byteBufferWrap.getShort(50) & HPKE.aead_EXPORT_ONLY];
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C14707[] m30964(int i, int i2, int i3) {
        C14707 c4267;
        C14707[] c14707Arr = new C14707[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i4 * i2) + i;
            int i6 = this.f40054.getInt(i5 + 4);
            if (i6 == 0) {
                c4267 = null;
            } else if (i6 == 9) {
                c4267 = new C4267(this, i5);
            } else if (i6 == 11 || i6 == 2) {
                c4267 = new C7996(this, i5);
            } else if (i6 == 3) {
                c4267 = new C21421(this, i5);
            } else if (i6 == 4) {
                c4267 = new C4267(this, i5);
            } else {
                c4267 = new C14707(this, i5);
            }
            c14707Arr[i4] = c4267;
        }
        return c14707Arr;
    }
}
