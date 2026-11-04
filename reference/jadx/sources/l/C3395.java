package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ۗۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49K9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3395 extends AbstractC5633 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C18311 f11046;

    public C3395(C25398 c25398, C23533 c23533, C6117 c6117) {
        super(c25398, c23533, c6117);
        this.f11046 = new C18311(c23533, c25398, c6117.m17653());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18420 m11113(long j, int i, byte[] bArr) {
        return this.f11046.m42696(j, i, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m11109(C18420 c18420) throws IOException {
        try {
            return ((Long) c18420.get(this.f19479.m4269(), TimeUnit.MILLISECONDS)).longValue();
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m11112() {
        return this.f19479.m4270();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m11111() {
        return this.f19479.m4265();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m11108(long j, byte[] bArr, int i, int i2) {
        C4272 c4272M4259 = this.f19479.m4259(this.f19480, j, i2);
        if (((C18684) c4272M4259.mo3632()).m43472() == EnumC20243.STATUS_END_OF_FILE.getValue()) {
            return -1;
        }
        int iMin = Math.min(i2, c4272M4259.m13613());
        c4272M4259.m13615(0, bArr, i, iMin);
        return iMin;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InputStream m11114(long j) {
        C23533 c23533 = this.f19479;
        return new C6379(this, c23533.m4270(), c23533.m4266(), j, -1L, 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m11110(long j, int i, long j2) {
        C23533 c23533 = this.f19479;
        return new C6379(this, c23533.m4270(), c23533.m4266(), j, j2, i);
    }

    public final String toString() {
        return "File{fileId=" + this.f19480 + ", fileName='" + this.f19481.m17653() + "'}";
    }
}
