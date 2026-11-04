package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ᩳ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H6W9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19109 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f61841;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float f61842;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f61843;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f61844;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float f61845;

    public C19109(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        this.f61843 = byteBuffer;
        this.f61844 = byteBuffer2;
        this.f61841 = byteBuffer2.capacity() / 2;
        float fMin = Float.POSITIVE_INFINITY;
        float fMax = Float.NEGATIVE_INFINITY;
        for (int i = 2; i < byteBuffer.capacity(); i += 12) {
            float f = byteBuffer.getShort(i) / 256.0f;
            fMin = Math.min(fMin, f);
            fMax = Math.max(fMax, f);
        }
        this.f61845 = fMin;
        this.f61842 = fMax;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m44228(C20348 c20348) throws IOException {
        if (c20348.available() < 8 || c20348.readInt() != 1362318413) {
            throw new IOException("Invalid logo mesh header");
        }
        int i = c20348.readInt();
        if (i < 1 || i > 32) {
            throw new IOException("Invalid logo mesh count");
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (c20348.available() < 8) {
                throw new IOException("Truncated logo mesh");
            }
            int i3 = c20348.readInt();
            int i4 = c20348.readInt();
            long j = (((long) i4) * 2) + (((long) i3) * 12);
            if (i3 < 3 || i3 > 60000 || i4 < 3 || i4 % 3 != 0 || j > c20348.available()) {
                throw new IOException("Invalid logo mesh lengths");
            }
            ByteBuffer byteBufferM44227 = m44227(i3, 12, c20348);
            ByteBuffer byteBufferM44228 = m44227(i4, 2, c20348);
            for (int i5 = 0; i5 < byteBufferM44228.capacity(); i5 += 2) {
                if ((byteBufferM44228.getShort(i5) & HPKE.aead_EXPORT_ONLY) >= i3) {
                    throw new IOException("Invalid logo mesh index");
                }
            }
            arrayList.add(new C19109(byteBufferM44227, byteBufferM44228));
        }
        if (c20348.available() == 0) {
            return arrayList;
        }
        throw new IOException("Trailing logo mesh data");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m44227(int i, int i2, C20348 c20348) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i * i2).order(ByteOrder.LITTLE_ENDIAN);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 = (i4 + (c20348.readByte() & 255)) & 255;
                byteBufferOrder.put((i5 * i2) + i3, (byte) i4);
            }
        }
        return byteBufferOrder;
    }
}
