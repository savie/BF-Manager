package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.ۢܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: N78B */
/* JADX INFO: loaded from: classes3.dex */
public final class C9639 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f32433;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f32434;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f32435;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f32436;

    public C9639(String str) {
        this.f32435 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9639 m24541(String str, byte[] bArr) throws IOException {
        if (bArr.length < 112 || bArr[0] != 100 || bArr[1] != 101 || bArr[2] != 120 || bArr[3] != 10 || bArr[7] != 0) {
            throw new IOException("Invalid dex header");
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        C9639 c9639 = new C9639(str);
        c9639.f32434 = true;
        c9639.f32433 = byteBufferOrder.getInt(56);
        byteBufferOrder.getInt(64);
        byteBufferOrder.getInt(72);
        byteBufferOrder.getInt(80);
        byteBufferOrder.getInt(88);
        c9639.f32436 = byteBufferOrder.getInt(96);
        return c9639;
    }
}
