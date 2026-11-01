package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۧۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38MG */
/* JADX INFO: loaded from: classes4.dex */
public final class C10950 extends AbstractC10492 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f37236 = C17983.f57507;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f37237;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f37238;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f37239;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f37240;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f37241;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f37242;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27489(int i, int i2) {
        this.f37239 = i;
        this.f37241 = i2;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m27490() {
        this.f37240 = 0L;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m27488() {
        return this.f37240;
    }

    @Override // l.AbstractC10492
    /* JADX INFO: renamed from: ܰ */
    public final C18958 mo16318(C18958 c18958) throws C8375 {
        if (!C17983.m41853(c18958.f61391)) {
            throw new C8375(c18958);
        }
        this.f37238 = true;
        return (this.f37239 == 0 && this.f37241 == 0) ? C18958.f61388 : c18958;
    }

    @Override // l.InterfaceC19664
    /* JADX INFO: renamed from: ۙ */
    public final void mo16317(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f37242);
        this.f37240 += (long) (iMin / this.f35950.f61390);
        this.f37242 -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f37242 > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f37237 + i2) - this.f37236.length;
        ByteBuffer byteBufferM26625 = m26625(length);
        int iM41813 = C17983.m41813(length, 0, this.f37237);
        byteBufferM26625.put(this.f37236, 0, iM41813);
        int iM41814 = C17983.m41813(length - iM41813, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iM41814);
        byteBufferM26625.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iM41814;
        int i4 = this.f37237 - iM41813;
        this.f37237 = i4;
        byte[] bArr = this.f37236;
        System.arraycopy(bArr, iM41813, bArr, 0, i4);
        byteBuffer.get(this.f37236, this.f37237, i3);
        this.f37237 += i3;
        byteBufferM26625.flip();
    }

    @Override // l.AbstractC10492, l.InterfaceC19664
    /* JADX INFO: renamed from: ۖ */
    public final ByteBuffer mo26624() {
        int i;
        if (super.mo26631() && (i = this.f37237) > 0) {
            m26625(i).put(this.f37236, 0, this.f37237).flip();
            this.f37237 = 0;
        }
        return super.mo26624();
    }

    @Override // l.AbstractC10492, l.InterfaceC19664
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo26631() {
        return super.mo26631() && this.f37237 == 0;
    }

    @Override // l.AbstractC10492
    /* JADX INFO: renamed from: ֨ */
    public final void mo26623() {
        if (this.f37238) {
            int i = this.f37237;
            if (i > 0) {
                this.f37240 += (long) (i / this.f35950.f61390);
            }
            this.f37237 = 0;
        }
    }

    @Override // l.AbstractC10492
    /* JADX INFO: renamed from: ᩹ */
    public final void mo26632() {
        if (this.f37238) {
            this.f37238 = false;
            int i = this.f37241;
            int i2 = this.f35950.f61390;
            this.f37236 = new byte[i * i2];
            this.f37242 = this.f37239 * i2;
        }
        this.f37237 = 0;
    }

    @Override // l.AbstractC10492
    /* JADX INFO: renamed from: ۬ */
    public final void mo26630() {
        this.f37236 = C17983.f57507;
    }
}
