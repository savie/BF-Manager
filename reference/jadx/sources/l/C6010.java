package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۛۧۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28IA */
/* JADX INFO: loaded from: classes3.dex */
public final class C6010 extends AbstractC10492 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final int f20422 = Float.floatToIntBits(Float.NaN);

    @Override // l.AbstractC10492
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18958 mo16318(C18958 c18958) throws C8375 {
        int i = c18958.f61391;
        if (i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
            throw new C8375(c18958);
        }
        if (i != 4) {
            return new C18958(c18958.f61389, c18958.f61392, 4);
        }
        return C18958.f61388;
    }

    @Override // l.InterfaceC19664
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo16317(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM26625;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f35950.f61391;
        if (i2 == 21) {
            byteBufferM26625 = m26625((i / 3) * 4);
            while (iPosition < iLimit) {
                m16316(byteBufferM26625, ((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24));
                iPosition += 3;
            }
        } else if (i2 == 22) {
            byteBufferM26625 = m26625(i);
            while (iPosition < iLimit) {
                m16316(byteBufferM26625, (byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24));
                iPosition += 4;
            }
        } else if (i2 == 1342177280) {
            byteBufferM26625 = m26625((i / 3) * 4);
            while (iPosition < iLimit) {
                m16316(byteBufferM26625, ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24));
                iPosition += 3;
            }
        } else if (i2 == 1610612736) {
            byteBufferM26625 = m26625(i);
            while (iPosition < iLimit) {
                m16316(byteBufferM26625, (byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24));
                iPosition += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM26625.flip();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16316(ByteBuffer byteBuffer, int i) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f20422) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }
}
