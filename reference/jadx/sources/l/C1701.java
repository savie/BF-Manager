package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.֫ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N78B */
/* JADX INFO: loaded from: classes2.dex */
public final class C1701 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f5833;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f5834;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f5835;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f5836;

    public C1701(String str) {
        this.f5834 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1701 m6061(String str, byte[] bArr) throws IOException {
        if (bArr.length < 112 || bArr[0] != 100 || bArr[1] != 101 || bArr[2] != 120 || bArr[3] != 10 || bArr[7] != 0) {
            throw new IOException("Invalid dex header");
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        C1701 c1701 = new C1701(str);
        c1701.f5833 = true;
        c1701.f5836 = byteBufferOrder.getInt(56);
        byteBufferOrder.getInt(64);
        byteBufferOrder.getInt(72);
        byteBufferOrder.getInt(80);
        byteBufferOrder.getInt(88);
        c1701.f5835 = byteBufferOrder.getInt(96);
        return c1701;
    }
}
