package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ܳ۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: H6W9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14390 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float f47138;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f47139;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f47140;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float f47141;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f47142;

    public C14390(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        this.f47140 = byteBuffer;
        this.f47142 = byteBuffer2;
        this.f47139 = byteBuffer2.capacity() / 2;
        float fMin = Float.POSITIVE_INFINITY;
        float fMax = Float.NEGATIVE_INFINITY;
        for (int i = 2; i < byteBuffer.capacity(); i += 12) {
            float f = byteBuffer.getShort(i) / 256.0f;
            fMin = Math.min(fMin, f);
            fMax = Math.max(fMax, f);
        }
        this.f47138 = fMin;
        this.f47141 = fMax;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m34623(C17367 c17367) throws IOException {
        if (c17367.available() < 8 || c17367.readInt() != 1362318413) {
            throw new IOException("Invalid logo mesh header");
        }
        int i = c17367.readInt();
        if (i < 1 || i > 32) {
            throw new IOException("Invalid logo mesh count");
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (c17367.available() < 8) {
                throw new IOException("Truncated logo mesh");
            }
            int i3 = c17367.readInt();
            int i4 = c17367.readInt();
            long j = (((long) i4) * 2) + (((long) i3) * 12);
            if (i3 < 3 || i3 > 60000 || i4 < 3 || i4 % 3 != 0 || j > c17367.available()) {
                throw new IOException("Invalid logo mesh lengths");
            }
            ByteBuffer byteBufferM34622 = m34622(i3, 12, c17367);
            ByteBuffer byteBufferM34623 = m34622(i4, 2, c17367);
            for (int i5 = 0; i5 < byteBufferM34623.capacity(); i5 += 2) {
                if ((byteBufferM34623.getShort(i5) & HPKE.aead_EXPORT_ONLY) >= i3) {
                    throw new IOException("Invalid logo mesh index");
                }
            }
            arrayList.add(new C14390(byteBufferM34622, byteBufferM34623));
        }
        if (c17367.available() == 0) {
            return arrayList;
        }
        throw new IOException("Trailing logo mesh data");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m34622(int i, int i2, C17367 c17367) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i * i2).order(ByteOrder.LITTLE_ENDIAN);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 = (i4 + (c17367.readByte() & 255)) & 255;
                byteBufferOrder.put((i5 * i2) + i3, (byte) i4);
            }
        }
        return byteBufferOrder;
    }
}
