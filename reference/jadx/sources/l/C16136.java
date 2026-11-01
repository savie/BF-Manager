package l;

import com.alipay.sdk.m.p.a;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܺ᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8L0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16136 extends AbstractC10492 {
    @Override // l.AbstractC10492
    /* JADX INFO: renamed from: ܰ */
    public final C18958 mo16318(C18958 c18958) throws C8375 {
        int i = c18958.f61391;
        if (i != 3 && i != 2 && i != 268435456 && i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
            throw new C8375(c18958);
        }
        if (i != 2) {
            return new C18958(c18958.f61389, c18958.f61392, 2);
        }
        return C18958.f61388;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    @Override // l.InterfaceC19664
    /* JADX INFO: renamed from: ۙ */
    public final void mo16317(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f35950.f61391;
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
        ByteBuffer byteBufferM26625 = m26625(i);
        int i3 = this.f35950.f61391;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferM26625.put((byte) 0);
                byteBufferM26625.put((byte) ((byteBuffer.get(iPosition) & 255) + a.g));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sM41810 = (short) (C17983.m41810(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferM26625.put((byte) (sM41810 & 255));
                byteBufferM26625.put((byte) ((sM41810 >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 21) {
            while (iPosition < iLimit) {
                byteBufferM26625.put(byteBuffer.get(iPosition + 1));
                byteBufferM26625.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 == 22) {
            while (iPosition < iLimit) {
                byteBufferM26625.put(byteBuffer.get(iPosition + 2));
                byteBufferM26625.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferM26625.put(byteBuffer.get(iPosition + 1));
                byteBufferM26625.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferM26625.put(byteBuffer.get(iPosition + 1));
                byteBufferM26625.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else {
            if (i3 != 1610612736) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferM26625.put(byteBuffer.get(iPosition + 1));
                byteBufferM26625.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM26625.flip();
    }
}
