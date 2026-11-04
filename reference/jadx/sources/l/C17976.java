package l;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܿ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17976 implements Closeable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f58906;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final MediaDataSource f58907;

    public C17976(MediaDataSource mediaDataSource) {
        this.f58907 = mediaDataSource;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41955(MediaMetadataRetriever mediaMetadataRetriever) throws IOException {
        mediaMetadataRetriever.setDataSource(this.f58907);
        MediaDataSource mediaDataSource = this.f58907;
        if (mediaDataSource instanceof C10797) {
            ((C10797) mediaDataSource).m27504();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f58906) {
            return;
        }
        this.f58906 = true;
        this.f58907.close();
    }
}
