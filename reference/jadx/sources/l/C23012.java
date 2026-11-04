package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;
import java.nio.ByteBuffer;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.᩸ᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: OB8U */
/* JADX INFO: loaded from: classes.dex */
public final class C23012 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f74678;

    public C23012(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new NullPointerException("buf == null");
        }
        this.f74678 = byteBuffer;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14148 m51905() throws C5112 {
        int iPosition;
        int iPosition2;
        int i;
        byte b;
        ByteBuffer byteBuffer = this.f74678;
        int iPosition3 = byteBuffer.position();
        if (!byteBuffer.hasRemaining()) {
            return null;
        }
        byte b2 = byteBuffer.get();
        int i2 = b2 & bo.j;
        if (i2 == 31) {
            i2 = 0;
            do {
                if (!byteBuffer.hasRemaining()) {
                    throw new C5112("Truncated tag number");
                }
                b = byteBuffer.get();
                if (i2 > 16777215) {
                    throw new C5112("Tag number too large");
                }
                i2 = (i2 << 7) | (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            } while ((b & GCMSIVBlockCipher.MASK) != 0);
        }
        boolean z = (b2 & UTF8.S_CS3) != 0;
        if (!byteBuffer.hasRemaining()) {
            throw new C5112("Missing length");
        }
        byte b3 = byteBuffer.get();
        int i3 = b3 & 255;
        if ((b3 & GCMSIVBlockCipher.MASK) == 0) {
            i = b3 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
            iPosition2 = byteBuffer.position() - iPosition3;
            m51904(i);
        } else if (i3 != 128) {
            int i4 = b3 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
            if (i4 > 4) {
                throw new C5112(C14442.m34864(i4, "Length too large: ", " bytes"));
            }
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                if (!byteBuffer.hasRemaining()) {
                    throw new C5112("Truncated length");
                }
                byte b4 = byteBuffer.get();
                if (i5 > 8388607) {
                    throw new C5112("Length too large");
                }
                i5 = (i5 << 8) | (b4 & 255);
            }
            int iPosition4 = byteBuffer.position() - iPosition3;
            m51904(i5);
            iPosition2 = iPosition4;
            i = i5;
        } else {
            int iPosition5 = byteBuffer.position() - iPosition3;
            if (z) {
                int iPosition6 = byteBuffer.position();
                while (true) {
                    if (!byteBuffer.hasRemaining()) {
                        throw new C5112("Truncated indefinite-length contents: " + (byteBuffer.position() - iPosition6) + " bytes read");
                    }
                    if (byteBuffer.remaining() > 1 && byteBuffer.getShort(byteBuffer.position()) == 0) {
                        iPosition = byteBuffer.position() - iPosition6;
                        byteBuffer.position(byteBuffer.position() + 2);
                        break;
                    }
                    m51905();
                }
            } else {
                int i7 = 0;
                boolean z2 = false;
                while (true) {
                    if (!byteBuffer.hasRemaining()) {
                        throw new C5112(C14442.m34864(i7, "Truncated indefinite-length contents: ", " bytes read"));
                    }
                    byte b5 = byteBuffer.get();
                    int i8 = i7 + 1;
                    if (i8 < 0) {
                        throw new C5112("Indefinite-length contents too long");
                    }
                    if (b5 != 0) {
                        z2 = false;
                    } else {
                        if (z2) {
                            iPosition = i7 - 1;
                            break;
                        }
                        z2 = true;
                    }
                    i7 = i8;
                }
            }
            int i9 = iPosition;
            iPosition2 = iPosition5;
            i = i9;
        }
        int iPosition7 = byteBuffer.position();
        byteBuffer.position(iPosition3);
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(iPosition7);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBuffer.position(byteBuffer.limit());
        byteBuffer.limit(iLimit);
        byteBufferSlice.position(iPosition2);
        byteBufferSlice.limit(iPosition2 + i);
        ByteBuffer byteBufferSlice2 = byteBufferSlice.slice();
        byteBufferSlice.clear();
        return new C14148(byteBufferSlice, byteBufferSlice2, (b2 & 255) >> 6, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51904(int i) throws C5112 {
        ByteBuffer byteBuffer = this.f74678;
        if (byteBuffer.remaining() >= i) {
            byteBuffer.position(byteBuffer.position() + i);
        } else {
            StringBuilder sbM12235 = C3769.m12235(i, "Truncated contents. Need: ", " bytes, available: ");
            sbM12235.append(byteBuffer.remaining());
            throw new C5112(sbM12235.toString());
        }
    }
}
