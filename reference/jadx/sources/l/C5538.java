package l;

import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۚۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes2.dex */
public final class C5538 implements AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final MediaMetadataRetriever f19251 = new MediaMetadataRetriever();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16450(MediaDataSource mediaDataSource) {
        this.f19251.setDataSource(mediaDataSource);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap m16448(int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        MediaMetadataRetriever mediaMetadataRetriever = this.f19251;
        if (i3 >= 27) {
            return mediaMetadataRetriever.getScaledFrameAtTime(-1L, 2, i, i2);
        }
        return C23438.m52633(mediaMetadataRetriever.getFrameAtTime(-1L, 2), i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m16449(int i) {
        return this.f19251.extractMetadata(i);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f19251.release();
    }
}
