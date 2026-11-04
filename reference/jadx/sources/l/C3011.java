package l;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۖ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O6K0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3011 extends MediaDataSource {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InputStream f9777;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f9778;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C23895 f9779;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC2386 f9780;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC18881 f9782;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6346 f9783;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final MediaDataSource f9785;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f9786;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f9784 = SystemClock.elapsedRealtime() + 2500;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f9781 = X931RNG.BLOCK128_RESEED_MAX;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f9786) {
            return;
        }
        this.f9786 = true;
        try {
            MediaDataSource mediaDataSource = this.f9785;
            if (mediaDataSource != null) {
                mediaDataSource.close();
            }
            InputStream inputStream = this.f9777;
            if (inputStream != null) {
                inputStream.close();
            }
            C23895 c23895 = this.f9779;
            if (c23895 != null) {
                c23895.close();
            }
        } catch (Throwable th) {
            C23895 c23896 = this.f9779;
            if (c23896 != null) {
                c23896.close();
            }
            throw th;
        }
    }

    @Override // android.media.MediaDataSource
    public final synchronized int readAt(long j, byte[] bArr, int i, int i2) {
        int at;
        AbstractC13057.m32543(this.f9783);
        if (this.f9786 || this.f9781 <= 0 || SystemClock.elapsedRealtime() > this.f9784) {
            throw new IOException("Video poster read limit reached");
        }
        if (i2 == 0) {
            return 0;
        }
        int iMin = (int) Math.min(i2, this.f9781);
        MediaDataSource mediaDataSource = this.f9785;
        if (mediaDataSource != null) {
            at = mediaDataSource.readAt(j, bArr, i, iMin);
        } else {
            InputStream inputStream = this.f9777;
            if (inputStream == null || j != this.f9778) {
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f9777 = null;
                this.f9777 = this.f9782.mo35570(j, this.f9780.getPath());
                this.f9778 = j;
            }
            at = this.f9777.read(bArr, i, iMin);
            if (at > 0) {
                this.f9778 += (long) at;
            }
        }
        if (at > 0) {
            this.f9781 -= (long) at;
        }
        AbstractC13057.m32543(this.f9783);
        return at;
    }

    public C3011(C0596 c0596, C23895 c23895, InterfaceC2386 interfaceC2386, C6346 c6346) {
        this.f9785 = c0596;
        this.f9779 = c23895;
        this.f9782 = c23895 == null ? null : (AbstractC18881) c23895.f77381;
        this.f9780 = interfaceC2386;
        this.f9783 = c6346;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3011 m9818(MediaMetadataRetriever mediaMetadataRetriever, AbstractC22044 abstractC22044, C6346 c6346) {
        C3011 c3011 = new C3011(new C0596(abstractC22044), null, null, c6346);
        try {
            mediaMetadataRetriever.setDataSource(c3011);
            return c3011;
        } catch (RuntimeException e) {
            c3011.close();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3011 m9817(MediaMetadataRetriever mediaMetadataRetriever, AbstractC18881 abstractC18881, InterfaceC2386 interfaceC2386, C6346 c6346) {
        C3011 c3011 = new C3011(null, new C23895(abstractC18881), interfaceC2386, c6346);
        try {
            mediaMetadataRetriever.setDataSource(c3011);
            return c3011;
        } catch (RuntimeException e) {
            c3011.close();
            throw e;
        }
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        MediaDataSource mediaDataSource = this.f9785;
        return mediaDataSource != null ? mediaDataSource.getSize() : this.f9780.getSize();
    }
}
