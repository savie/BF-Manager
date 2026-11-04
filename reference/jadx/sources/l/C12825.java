package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.util.List;

/* JADX INFO: renamed from: l.۫ۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8F1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12825 extends AbstractC15808 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final SeekableByteChannel f41065;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final List f41066;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f41067;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5368 f41068;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f41069;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7450 f41070;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12825(C5368 c5368, C7450 c7450, C13961 c13961, List list) throws IOException {
        super(c7450.m20451(), c7450.m20449());
        this.f41068 = c5368;
        if (c13961.length() - c7450.m20439() < c7450.m20451()) {
            throw new IOException("entry size exceeds archive size");
        }
        this.f41070 = c7450;
        this.f41065 = c13961;
        this.f41066 = list;
    }

    @Override // l.AbstractC15808
    /* JADX INFO: renamed from: ۙ */
    public final int mo10210(long j, ByteBuffer byteBuffer) throws IOException {
        int iM31793;
        long j2 = this.f41069;
        C7450 c7450 = this.f41070;
        if (j2 >= c7450.m20449()) {
            return -1;
        }
        if (c7450.m20433()) {
            iM31793 = m31792(byteBuffer.limit(), this.f41069, byteBuffer);
        } else {
            iM31793 = m31793(j, byteBuffer);
        }
        if (iM31793 == -1) {
            if (byteBuffer.array().length > 0) {
                throw new IOException("Truncated TAR archive");
            }
            this.f41068.m16034();
            return iM31793;
        }
        this.f41069 += (long) iM31793;
        byteBuffer.flip();
        return iM31793;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m31793(long j, ByteBuffer byteBuffer) {
        int i;
        synchronized (this.f41065) {
            this.f41065.position(j);
            i = this.f41065.read(byteBuffer);
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m31792(int i, long j, ByteBuffer byteBuffer) throws IOException {
        List list = this.f41066;
        if (list.isEmpty()) {
            return m31793(this.f41070.m20451() + j, byteBuffer);
        }
        if (this.f41067 >= list.size()) {
            return -1;
        }
        byte[] bArr = new byte[i];
        int i2 = ((InputStream) list.get(this.f41067)).read(bArr);
        if (i2 != -1) {
            byteBuffer.put(bArr, 0, i2);
        }
        if (this.f41067 == list.size() - 1) {
            return i2;
        }
        if (i2 == -1) {
            this.f41067++;
            return m31792(i, j, byteBuffer);
        }
        if (i2 >= i) {
            return i2;
        }
        this.f41067++;
        int iM31792 = m31792(i - i2, j + ((long) i2), byteBuffer);
        return iM31792 == -1 ? i2 : i2 + iM31792;
    }
}
