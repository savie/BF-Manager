package l;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.᩸ۢ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: O6K0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21498 extends MediaDataSource {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC12233 f69855;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f69856;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 f69857;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11621 f69858;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C3630 f69859;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InputStream f69860;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final MediaDataSource f69861;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f69862;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f69854 = SystemClock.elapsedRealtime() + 2500;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f69863 = X931RNG.BLOCK128_RESEED_MAX;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f69862) {
            return;
        }
        this.f69862 = true;
        try {
            MediaDataSource mediaDataSource = this.f69861;
            if (mediaDataSource != null) {
                mediaDataSource.close();
            }
            InputStream inputStream = this.f69860;
            if (inputStream != null) {
                inputStream.close();
            }
            C11621 c11621 = this.f69858;
            if (c11621 != null) {
                c11621.close();
            }
        } catch (Throwable th) {
            C11621 c11622 = this.f69858;
            if (c11622 != null) {
                c11622.close();
            }
            throw th;
        }
    }

    @Override // android.media.MediaDataSource
    public final synchronized int readAt(long j, byte[] bArr, int i, int i2) {
        int at;
        AbstractC1886.m6135(this.f69859);
        if (this.f69862 || this.f69863 <= 0 || SystemClock.elapsedRealtime() > this.f69854) {
            throw new IOException("Video poster read limit reached");
        }
        if (i2 == 0) {
            return 0;
        }
        int iMin = (int) Math.min(i2, this.f69863);
        MediaDataSource mediaDataSource = this.f69861;
        if (mediaDataSource != null) {
            at = mediaDataSource.readAt(j, bArr, i, iMin);
        } else {
            InputStream inputStream = this.f69860;
            if (inputStream == null || j != this.f69856) {
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f69860 = null;
                this.f69860 = this.f69855.mo10262(j, this.f69857.getPath());
                this.f69856 = j;
            }
            at = this.f69860.read(bArr, i, iMin);
            if (at > 0) {
                this.f69856 += (long) at;
            }
        }
        if (at > 0) {
            this.f69863 -= (long) at;
        }
        AbstractC1886.m6135(this.f69859);
        return at;
    }

    public C21498(C1667 c1667, C11621 c11621, InterfaceC2557 interfaceC2557, C3630 c3630) {
        this.f69861 = c1667;
        this.f69858 = c11621;
        this.f69855 = c11621 == null ? null : (AbstractC12233) c11621.f39035;
        this.f69857 = interfaceC2557;
        this.f69859 = c3630;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21498 m48135(MediaMetadataRetriever mediaMetadataRetriever, AbstractC20745 abstractC20745, C3630 c3630) {
        C21498 c21498 = new C21498(new C1667(abstractC20745), null, null, c3630);
        try {
            mediaMetadataRetriever.setDataSource(c21498);
            return c21498;
        } catch (RuntimeException e) {
            c21498.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21498 m48134(MediaMetadataRetriever mediaMetadataRetriever, AbstractC12233 abstractC12233, InterfaceC2557 interfaceC2557, C3630 c3630) {
        C21498 c21498 = new C21498(null, new C11621(abstractC12233), interfaceC2557, c3630);
        try {
            mediaMetadataRetriever.setDataSource(c21498);
            return c21498;
        } catch (RuntimeException e) {
            c21498.close();
            throw e;
        }
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        MediaDataSource mediaDataSource = this.f69861;
        return mediaDataSource != null ? mediaDataSource.getSize() : this.f69857.getSize();
    }
}
