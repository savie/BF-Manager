package l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ܽܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J55M */
/* JADX INFO: loaded from: classes4.dex */
public final class C16724 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C23780 f53555;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f53556;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11080[] f53557;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f53558;

    public C16724(byte[] bArr) throws C20252 {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f53556 = byteBufferWrap;
        byte[] bArr2 = new byte[16];
        byteBufferWrap.get(bArr2);
        if (bArr2[0] != 127 || bArr2[1] != 69 || bArr2[2] != 76 || bArr2[3] != 70) {
            throw new C20252("Invalid ELF signature");
        }
        byte b = bArr2[4];
        if (b == 1) {
            this.f53558 = false;
        } else {
            if (b != 2) {
                throw new C20252("Invalid ELF class");
            }
            this.f53558 = true;
        }
        byte b2 = bArr2[5];
        if (b2 == 1) {
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            if (b2 != 2) {
                throw new C20252("Invalid ELF endian");
            }
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        }
        if (bArr2[6] != 1) {
            throw new C20252("Invalid ELF version");
        }
        byteBufferWrap.getShort(16);
        byteBufferWrap.getShort(18);
        byteBufferWrap.getInt(20);
        if (this.f53558) {
            byteBufferWrap.getLong(24);
            byteBufferWrap.getInt(48);
            C11080[] c11080ArrM39212 = m39212(byteBufferWrap.getInt(40), byteBufferWrap.getShort(58) & HPKE.aead_EXPORT_ONLY, byteBufferWrap.getShort(60) & HPKE.aead_EXPORT_ONLY);
            this.f53557 = c11080ArrM39212;
            this.f53555 = (C23780) c11080ArrM39212[byteBufferWrap.getShort(62) & HPKE.aead_EXPORT_ONLY];
            return;
        }
        byteBufferWrap.getInt(24);
        byteBufferWrap.getInt(36);
        C11080[] c11080ArrM39213 = m39212(byteBufferWrap.getInt(32), byteBufferWrap.getShort(46) & HPKE.aead_EXPORT_ONLY, byteBufferWrap.getShort(48) & HPKE.aead_EXPORT_ONLY);
        this.f53557 = c11080ArrM39213;
        this.f53555 = (C23780) c11080ArrM39213[byteBufferWrap.getShort(50) & HPKE.aead_EXPORT_ONLY];
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0035  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C11080[] m39212(int i, int i2, int i3) {
        C11080 c6140;
        C11080[] c11080Arr = new C11080[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i4 * i2) + i;
            int i6 = this.f53556.getInt(i5 + 4);
            if (i6 == 0) {
                c6140 = null;
            } else if (i6 == 9) {
                c6140 = new C6140(this, i5);
            } else if (i6 == 11 || i6 == 2) {
                c6140 = new C9669(this, i5);
            } else if (i6 == 3) {
                c6140 = new C23780(this, i5);
            } else if (i6 == 4) {
                c6140 = new C6140(this, i5);
            } else {
                c6140 = new C11080(this, i5);
            }
            c11080Arr[i4] = c6140;
        }
        return c11080Arr;
    }
}
