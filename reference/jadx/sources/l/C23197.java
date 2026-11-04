package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩹֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38MG */
/* JADX INFO: loaded from: classes.dex */
public final class C23197 extends AbstractC23020 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f75164 = C7116.f23453;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f75165;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f75166;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f75167;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f75168;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f75169;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f75170;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52127(int i, int i2) {
        this.f75166 = i;
        this.f75168 = i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52128() {
        this.f75169 = 0L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m52126() {
        return this.f75169;
    }

    @Override // l.AbstractC23020
    /* JADX INFO: renamed from: ᩷ */
    public final C13565 mo32891(C13565 c13565) throws C5120 {
        if (!C7116.m19494(c13565.f43064)) {
            throw new C5120(c13565);
        }
        this.f75167 = true;
        return (this.f75166 == 0 && this.f75168 == 0) ? C13565.f43062 : c13565;
    }

    @Override // l.InterfaceC22274
    /* JADX INFO: renamed from: ۙ */
    public final void mo32890(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f75170);
        this.f75169 += (long) (iMin / this.f74705.f43063);
        this.f75170 -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f75170 > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f75165 + i2) - this.f75164.length;
        ByteBuffer byteBufferM51915 = m51915(length);
        int iM19460 = C7116.m19460(length, 0, this.f75165);
        byteBufferM51915.put(this.f75164, 0, iM19460);
        int iM19461 = C7116.m19460(length - iM19460, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iM19461);
        byteBufferM51915.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iM19461;
        int i4 = this.f75165 - iM19460;
        this.f75165 = i4;
        byte[] bArr = this.f75164;
        System.arraycopy(bArr, iM19460, bArr, 0, i4);
        byteBuffer.get(this.f75164, this.f75165, i3);
        this.f75165 += i3;
        byteBufferM51915.flip();
    }

    @Override // l.AbstractC23020, l.InterfaceC22274
    /* JADX INFO: renamed from: ᩸ */
    public final ByteBuffer mo37284() {
        int i;
        if (super.mo37283() && (i = this.f75165) > 0) {
            m51915(i).put(this.f75164, 0, this.f75165).flip();
            this.f75165 = 0;
        }
        return super.mo37284();
    }

    @Override // l.AbstractC23020, l.InterfaceC22274
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo37283() {
        return super.mo37283() && this.f75165 == 0;
    }

    @Override // l.AbstractC23020
    /* JADX INFO: renamed from: ۫ */
    public final void mo40470() {
        if (this.f75167) {
            int i = this.f75165;
            if (i > 0) {
                this.f75169 += (long) (i / this.f74705.f43063);
            }
            this.f75165 = 0;
        }
    }

    @Override // l.AbstractC23020
    /* JADX INFO: renamed from: ܳ */
    public final void mo40471() {
        if (this.f75167) {
            this.f75167 = false;
            int i = this.f75168;
            int i2 = this.f74705.f43063;
            this.f75164 = new byte[i * i2];
            this.f75170 = this.f75166 * i2;
        }
        this.f75165 = 0;
    }

    @Override // l.AbstractC23020
    /* JADX INFO: renamed from: ۚ */
    public final void mo40469() {
        this.f75164 = C7116.f23453;
    }
}
