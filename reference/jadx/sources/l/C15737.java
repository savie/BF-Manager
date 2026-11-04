package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܶ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28IA */
/* JADX INFO: loaded from: classes5.dex */
public final class C15737 extends AbstractC23020 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int f51175 = Float.floatToIntBits(Float.NaN);

    @Override // l.AbstractC23020
    /* JADX INFO: renamed from: ᩷ */
    public final C13565 mo32891(C13565 c13565) throws C5120 {
        int i = c13565.f43064;
        if (i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
            throw new C5120(c13565);
        }
        if (i != 4) {
            return new C13565(c13565.f43066, c13565.f43065, 4);
        }
        return C13565.f43062;
    }

    @Override // l.InterfaceC22274
    /* JADX INFO: renamed from: ۙ */
    public final void mo32890(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM51915;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f74705.f43064;
        if (i2 == 21) {
            byteBufferM51915 = m51915((i / 3) * 4);
            while (iPosition < iLimit) {
                m37645(byteBufferM51915, ((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24));
                iPosition += 3;
            }
        } else if (i2 == 22) {
            byteBufferM51915 = m51915(i);
            while (iPosition < iLimit) {
                m37645(byteBufferM51915, (byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24));
                iPosition += 4;
            }
        } else if (i2 == 1342177280) {
            byteBufferM51915 = m51915((i / 3) * 4);
            while (iPosition < iLimit) {
                m37645(byteBufferM51915, ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24));
                iPosition += 3;
            }
        } else if (i2 == 1610612736) {
            byteBufferM51915 = m51915(i);
            while (iPosition < iLimit) {
                m37645(byteBufferM51915, (byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24));
                iPosition += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM51915.flip();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37645(ByteBuffer byteBuffer, int i) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f51175) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }
}
