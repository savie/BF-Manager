package l;

import com.alipay.sdk.m.p.a;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۫᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8L0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13323 extends AbstractC23020 {
    @Override // l.AbstractC23020
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13565 mo32891(C13565 c13565) throws C5120 {
        int i = c13565.f43064;
        if (i != 3 && i != 2 && i != 268435456 && i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
            throw new C5120(c13565);
        }
        if (i != 2) {
            return new C13565(c13565.f43066, c13565.f43065, 2);
        }
        return C13565.f43062;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    @Override // l.InterfaceC22274
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo32890(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f74705.f43064;
        if (i2 == 3) {
            i *= 2;
        } else if (i2 != 4) {
            if (i2 != 21) {
                if (i2 == 22) {
                    i /= 2;
                } else if (i2 != 268435456) {
                    if (i2 != 1342177280) {
                        if (i2 != 1610612736) {
                            throw new IllegalStateException();
                        }
                        i /= 2;
                    }
                }
            }
            i /= 3;
            i *= 2;
        } else {
            i /= 2;
        }
        ByteBuffer byteBufferM51915 = m51915(i);
        int i3 = this.f74705.f43064;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferM51915.put((byte) 0);
                byteBufferM51915.put((byte) ((byteBuffer.get(iPosition) & 255) + a.g));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sM19457 = (short) (C7116.m19457(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferM51915.put((byte) (sM19457 & 255));
                byteBufferM51915.put((byte) ((sM19457 >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 21) {
            while (iPosition < iLimit) {
                byteBufferM51915.put(byteBuffer.get(iPosition + 1));
                byteBufferM51915.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 == 22) {
            while (iPosition < iLimit) {
                byteBufferM51915.put(byteBuffer.get(iPosition + 2));
                byteBufferM51915.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferM51915.put(byteBuffer.get(iPosition + 1));
                byteBufferM51915.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferM51915.put(byteBuffer.get(iPosition + 1));
                byteBufferM51915.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i3 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferM51915.put(byteBuffer.get(iPosition + 1));
                byteBufferM51915.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM51915.flip();
    }
}
