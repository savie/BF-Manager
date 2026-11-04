package l;

import android.media.Image;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۤ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes3.dex */
public final class C10888 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f34463;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f34464;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f34465;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f34466;

    public C10888(Image.Plane plane) {
        ByteBuffer buffer = plane.getBuffer();
        this.f34465 = buffer;
        this.f34463 = buffer.position();
        this.f34466 = plane.getRowStride();
        this.f34464 = plane.getPixelStride();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m27636(C10888 c10888, int i, int i2) throws IOException {
        ByteBuffer byteBuffer = c10888.f34465;
        long j = c10888.f34463;
        long j2 = (((long) i) * ((long) c10888.f34464)) + (((long) i2) * ((long) c10888.f34466)) + j;
        if (j2 < j || j2 >= byteBuffer.limit()) {
            throw new IOException("MPEG-TS decoder plane is truncated");
        }
        return byteBuffer.get((int) j2) & 255;
    }
}
