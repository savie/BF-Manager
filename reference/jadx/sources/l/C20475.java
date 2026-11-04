package l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ۢۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18H2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20475 extends AbstractC23020 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f65599;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f65600;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46978(int[] iArr) {
        this.f65600 = iArr;
    }

    @Override // l.AbstractC23020
    /* JADX INFO: renamed from: ᩷ */
    public final C13565 mo32891(C13565 c13565) throws C5120 {
        int i = c13565.f43064;
        int[] iArr = this.f65600;
        if (iArr == null) {
            return C13565.f43062;
        }
        int i2 = c13565.f43065;
        if (!C7116.m19494(i)) {
            throw new C5120(c13565);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new C5120("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", c13565);
            }
            z |= i4 != i3;
            i3++;
        }
        if (z) {
            return new C13565(c13565.f43066, iArr.length, i);
        }
        return C13565.f43062;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00da  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:55:0x011c  */
    @Override // l.InterfaceC22274
    /* JADX INFO: renamed from: ۙ */
    public final void mo32890(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int[] iArr = this.f65599;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM51915 = m51915(((iLimit - iPosition) / this.f74705.f43063) * this.f74708.f43063);
        while (iPosition < iLimit) {
            for (int i5 : iArr) {
                int iM19495 = (C7116.m19495(this.f74705.f43064) * i5) + iPosition;
                int i6 = this.f74705.f43064;
                if (i6 == 2) {
                    byteBufferM51915.putShort(byteBuffer.getShort(iM19495));
                } else if (i6 == 3) {
                    byteBufferM51915.put(byteBuffer.get(iM19495));
                } else if (i6 == 4) {
                    byteBufferM51915.putFloat(byteBuffer.getFloat(iM19495));
                } else if (i6 != 21) {
                    if (i6 != 22) {
                        if (i6 == 268435456) {
                            byteBufferM51915.putShort(byteBuffer.getShort(iM19495));
                        } else if (i6 == 1342177280) {
                            byteOrderOrder = byteBuffer.order();
                            byteOrder = ByteOrder.BIG_ENDIAN;
                            if (byteOrderOrder == byteOrder) {
                                i = iM19495;
                            } else {
                                i = iM19495 + 2;
                            }
                            byte b = byteBuffer.get(i);
                            byte b2 = byteBuffer.get(iM19495 + 1);
                            if (byteBuffer.order() == byteOrder) {
                                iM19495 += 2;
                            }
                            i2 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(iM19495) << 8) & 65280)) >> 8;
                            if ((i2 & (-16777216)) != 0) {
                                z = true;
                            } else {
                                z = true;
                            }
                            C20782.m47564("Value out of range of 24-bit integer: " + Integer.toHexString(i2), z);
                            if (byteBufferM51915.remaining() >= 3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            C20782.m47565(z2);
                            if (byteBufferM51915.order() == byteOrder) {
                                i3 = (i2 & 16711680) >> 16;
                            } else {
                                i3 = i2 & 255;
                            }
                            byte b3 = (byte) i3;
                            byte b4 = (byte) ((i2 & 65280) >> 8);
                            if (byteBufferM51915.order() == byteOrder) {
                                i4 = i2 & 255;
                            } else {
                                i4 = (i2 & 16711680) >> 16;
                            }
                            byteBufferM51915.put(b3).put(b4).put((byte) i4);
                        } else if (i6 != 1610612736) {
                            throw new IllegalStateException("Unexpected encoding: " + this.f74705.f43064);
                        }
                    }
                    byteBufferM51915.putInt(byteBuffer.getInt(iM19495));
                } else {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iM19495;
                    } else {
                        i = iM19495 + 2;
                    }
                    byte b5 = byteBuffer.get(i);
                    byte b6 = byteBuffer.get(iM19495 + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iM19495 += 2;
                    }
                    i2 = ((((b5 << 24) & (-16777216)) | ((b6 << 16) & 16711680)) | ((byteBuffer.get(iM19495) << 8) & 65280)) >> 8;
                    if ((i2 & (-16777216)) != 0 || (i2 & (-8388608)) == -8388608) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C20782.m47564("Value out of range of 24-bit integer: " + Integer.toHexString(i2), z);
                    if (byteBufferM51915.remaining() >= 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C20782.m47565(z2);
                    if (byteBufferM51915.order() == byteOrder) {
                        i3 = (i2 & 16711680) >> 16;
                    } else {
                        i3 = i2 & 255;
                    }
                    byte b7 = (byte) i3;
                    byte b8 = (byte) ((i2 & 65280) >> 8);
                    if (byteBufferM51915.order() == byteOrder) {
                        i4 = i2 & 255;
                    } else {
                        i4 = (i2 & 16711680) >> 16;
                    }
                    byteBufferM51915.put(b7).put(b8).put((byte) i4);
                }
            }
            iPosition += this.f74705.f43063;
        }
        byteBuffer.position(iLimit);
        byteBufferM51915.flip();
    }

    @Override // l.AbstractC23020
    /* JADX INFO: renamed from: ܳ */
    public final void mo40471() {
        this.f65599 = this.f65600;
    }

    @Override // l.AbstractC23020
    /* JADX INFO: renamed from: ۚ */
    public final void mo40469() {
        this.f65599 = null;
        this.f65600 = null;
    }
}
