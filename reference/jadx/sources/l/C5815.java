package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.util.List;

/* JADX INFO: renamed from: l.ۛۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8F1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5815 extends AbstractC4486 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f19743;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f19744;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f19745;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final SeekableByteChannel f19746;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C10049 f19747;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10755 f19748;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5815(C10755 c10755, C10049 c10049, C1388 c1388, List list) throws IOException {
        super(c10049.m25425(), c10049.m25417());
        this.f19748 = c10755;
        if (c1388.length() - c10049.m25435() < c10049.m25425()) {
            throw new IOException("entry size exceeds archive size");
        }
        this.f19747 = c10049;
        this.f19746 = c1388;
        this.f19744 = list;
    }

    @Override // l.AbstractC4486
    /* JADX INFO: renamed from: ۙ */
    public final int mo12514(long j, ByteBuffer byteBuffer) throws IOException {
        int iM15993;
        long j2 = this.f19743;
        C10049 c10049 = this.f19747;
        if (j2 >= c10049.m25417()) {
            return -1;
        }
        if (c10049.m25428()) {
            iM15993 = m15992(byteBuffer.limit(), this.f19743, byteBuffer);
        } else {
            iM15993 = m15993(j, byteBuffer);
        }
        if (iM15993 == -1) {
            if (byteBuffer.array().length > 0) {
                throw new IOException("Truncated TAR archive");
            }
            this.f19748.m27056();
            return iM15993;
        }
        this.f19743 += (long) iM15993;
        byteBuffer.flip();
        return iM15993;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m15993(long j, ByteBuffer byteBuffer) {
        int i;
        synchronized (this.f19746) {
            this.f19746.position(j);
            i = this.f19746.read(byteBuffer);
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m15992(int i, long j, ByteBuffer byteBuffer) throws IOException {
        List list = this.f19744;
        if (list.isEmpty()) {
            return m15993(this.f19747.m25425() + j, byteBuffer);
        }
        if (this.f19745 >= list.size()) {
            return -1;
        }
        byte[] bArr = new byte[i];
        int i2 = ((InputStream) list.get(this.f19745)).read(bArr);
        if (i2 != -1) {
            byteBuffer.put(bArr, 0, i2);
        }
        if (this.f19745 == list.size() - 1) {
            return i2;
        }
        if (i2 == -1) {
            this.f19745++;
            return m15992(i, j, byteBuffer);
        }
        if (i2 >= i) {
            return i2;
        }
        this.f19745++;
        int iM15992 = m15992(i - i2, j + ((long) i2), byteBuffer);
        return iM15992 == -1 ? i2 : i2 + iM15992;
    }
}
