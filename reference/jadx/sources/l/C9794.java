package l;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۢ᩵۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes3.dex */
public final class C9794 implements Closeable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f33518;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final MediaDataSource f33519;

    public C9794(MediaDataSource mediaDataSource) {
        this.f33519 = mediaDataSource;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24902(MediaMetadataRetriever mediaMetadataRetriever) throws IOException {
        mediaMetadataRetriever.setDataSource(this.f33519);
        MediaDataSource mediaDataSource = this.f33519;
        if (mediaDataSource instanceof C23347) {
            ((C23347) mediaDataSource).m51469();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f33518) {
            return;
        }
        this.f33518 = true;
        this.f33519.close();
    }
}
