package l;

import android.media.Image;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܳ᩷۬, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes4.dex */
public final class C14775 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f48305;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f48306;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f48307;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f48308;

    public C14775(Image.Plane plane) {
        ByteBuffer buffer = plane.getBuffer();
        this.f48308 = buffer;
        this.f48306 = buffer.position();
        this.f48305 = plane.getRowStride();
        this.f48307 = plane.getPixelStride();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m35411(C14775 c14775, int i, int i2) throws IOException {
        ByteBuffer byteBuffer = c14775.f48308;
        long j = c14775.f48306;
        long j2 = (((long) i) * ((long) c14775.f48307)) + (((long) i2) * ((long) c14775.f48305)) + j;
        if (j2 < j || j2 >= byteBuffer.limit()) {
            throw new IOException("MPEG-TS decoder plane is truncated");
        }
        return byteBuffer.get((int) j2) & 255;
    }
}
