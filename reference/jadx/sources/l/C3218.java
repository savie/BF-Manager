package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ۗۨᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49K9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3218 extends AbstractC12392 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C12828 f12020;

    public C3218(C6396 c6396, C9570 c9570, C11748 c11748) {
        super(c6396, c9570, c11748);
        this.f12020 = new C12828(c9570, c6396, c11748.m29354());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12851 m9644(long j, int i, byte[] bArr) {
        return this.f12020.m31829(j, i, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m9641(C12851 c12851) throws IOException {
        try {
            return ((Long) c12851.get(this.f41413.m47754(), TimeUnit.MILLISECONDS)).longValue();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("SMB write interrupted", e);
        } catch (CancellationException e2) {
            throw new IOException("SMB write canceled", e2);
        } catch (ExecutionException e3) {
            throw new IOException("SMB write failed", e3);
        } catch (TimeoutException e4) {
            throw new IOException("SMB write timed out", e4);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m9643() {
        return this.f41413.m47751();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m9638() {
        return this.f41413.m47752();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m9640(long j, byte[] bArr, int i, int i2) {
        C2225 c2225M47747 = this.f41413.m47747(this.f41412, j, i2);
        if (((C1186) c2225M47747.mo25478()).m4349() == EnumC3055.STATUS_END_OF_FILE.getValue()) {
            return -1;
        }
        int iMin = Math.min(i2, c2225M47747.m6845());
        c2225M47747.m6847(0, bArr, i, iMin);
        return iMin;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InputStream m9639(long j) {
        C9570 c9570 = this.f41413;
        return new C11417(this, c9570.m47751(), c9570.m47745(), j, -1L, 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m9642(long j, int i, long j2) {
        C9570 c9570 = this.f41413;
        return new C11417(this, c9570.m47751(), c9570.m47745(), j, j2, i);
    }

    public final String toString() {
        return "File{fileId=" + this.f41412 + ", fileName='" + this.f41411.m29354() + "'}";
    }
}
