package l;

import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۡۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes3.dex */
public final class C8779 implements AutoCloseable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final MediaMetadataRetriever f30198 = new MediaMetadataRetriever();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22852(MediaDataSource mediaDataSource) {
        this.f30198.setDataSource(mediaDataSource);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap m22850(int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        MediaMetadataRetriever mediaMetadataRetriever = this.f30198;
        if (i3 >= 27) {
            return mediaMetadataRetriever.getScaledFrameAtTime(-1L, 2, i, i2);
        }
        return C16540.m38918(mediaMetadataRetriever.getFrameAtTime(-1L, 2), i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m22851(int i) {
        return this.f30198.extractMetadata(i);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f30198.release();
    }
}
