package l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻ۛۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18H2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23505 extends AbstractC10492 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int[] f76091;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int[] f76092;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51756(int[] iArr) {
        this.f76092 = iArr;
    }

    @Override // l.AbstractC10492
    /* JADX INFO: renamed from: ܰ */
    public final C18958 mo16318(C18958 c18958) throws C8375 {
        int i = c18958.f61391;
        int[] iArr = this.f76092;
        if (iArr == null) {
            return C18958.f61388;
        }
        int i2 = c18958.f61392;
        if (!C17983.m41853(i)) {
            throw new C8375(c18958);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new C8375("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", c18958);
            }
            z |= i4 != i3;
            i3++;
        }
        if (z) {
            return new C18958(c18958.f61389, iArr.length, i);
        }
        return C18958.f61388;
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
    @Override // l.InterfaceC19664
    /* JADX INFO: renamed from: ۙ */
    public final void mo16317(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int[] iArr = this.f76091;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM26625 = m26625(((iLimit - iPosition) / this.f35950.f61390) * this.f35949.f61390);
        while (iPosition < iLimit) {
            for (int i5 : iArr) {
                int iM41849 = (C17983.m41849(this.f35950.f61391) * i5) + iPosition;
                int i6 = this.f35950.f61391;
                if (i6 == 2) {
                    byteBufferM26625.putShort(byteBuffer.getShort(iM41849));
                } else if (i6 == 3) {
                    byteBufferM26625.put(byteBuffer.get(iM41849));
                } else if (i6 == 4) {
                    byteBufferM26625.putFloat(byteBuffer.getFloat(iM41849));
                } else if (i6 != 21) {
                    if (i6 != 22) {
                        if (i6 == 268435456) {
                            byteBufferM26625.putShort(byteBuffer.getShort(iM41849));
                        } else if (i6 == 1342177280) {
                            byteOrderOrder = byteBuffer.order();
                            byteOrder = ByteOrder.BIG_ENDIAN;
                            if (byteOrderOrder == byteOrder) {
                                i = iM41849;
                            } else {
                                i = iM41849 + 2;
                            }
                            byte b = byteBuffer.get(i);
                            byte b2 = byteBuffer.get(iM41849 + 1);
                            if (byteBuffer.order() == byteOrder) {
                                iM41849 += 2;
                            }
                            i2 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(iM41849) << 8) & 65280)) >> 8;
                            if ((i2 & (-16777216)) != 0) {
                                z = true;
                            } else {
                                z = true;
                            }
                            C2023.m6506("Value out of range of 24-bit integer: " + Integer.toHexString(i2), z);
                            if (byteBufferM26625.remaining() >= 3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            C2023.m6507(z2);
                            if (byteBufferM26625.order() == byteOrder) {
                                i3 = (i2 & 16711680) >> 16;
                            } else {
                                i3 = i2 & 255;
                            }
                            byte b3 = (byte) i3;
                            byte b4 = (byte) ((i2 & 65280) >> 8);
                            if (byteBufferM26625.order() == byteOrder) {
                                i4 = i2 & 255;
                            } else {
                                i4 = (i2 & 16711680) >> 16;
                            }
                            byteBufferM26625.put(b3).put(b4).put((byte) i4);
                        } else if (i6 != 1610612736) {
                            throw new IllegalStateException("Unexpected encoding: " + this.f35950.f61391);
                        }
                    }
                    byteBufferM26625.putInt(byteBuffer.getInt(iM41849));
                } else {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iM41849;
                    } else {
                        i = iM41849 + 2;
                    }
                    byte b5 = byteBuffer.get(i);
                    byte b6 = byteBuffer.get(iM41849 + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iM41849 += 2;
                    }
                    i2 = ((((b5 << 24) & (-16777216)) | ((b6 << 16) & 16711680)) | ((byteBuffer.get(iM41849) << 8) & 65280)) >> 8;
                    if ((i2 & (-16777216)) != 0 || (i2 & (-8388608)) == -8388608) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C2023.m6506("Value out of range of 24-bit integer: " + Integer.toHexString(i2), z);
                    if (byteBufferM26625.remaining() >= 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C2023.m6507(z2);
                    if (byteBufferM26625.order() == byteOrder) {
                        i3 = (i2 & 16711680) >> 16;
                    } else {
                        i3 = i2 & 255;
                    }
                    byte b7 = (byte) i3;
                    byte b8 = (byte) ((i2 & 65280) >> 8);
                    if (byteBufferM26625.order() == byteOrder) {
                        i4 = i2 & 255;
                    } else {
                        i4 = (i2 & 16711680) >> 16;
                    }
                    byteBufferM26625.put(b7).put(b8).put((byte) i4);
                }
            }
            iPosition += this.f35950.f61390;
        }
        byteBuffer.position(iLimit);
        byteBufferM26625.flip();
    }

    @Override // l.AbstractC10492
    /* JADX INFO: renamed from: ᩹ */
    public final void mo26632() {
        this.f76091 = this.f76092;
    }

    @Override // l.AbstractC10492
    /* JADX INFO: renamed from: ۬ */
    public final void mo26630() {
        this.f76091 = null;
        this.f76092 = null;
    }
}
