package l;

import android.media.MediaMetadataRetriever;

/* JADX INFO: renamed from: l.ܽ۫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16642 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f53369;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final MediaMetadataRetriever f53370;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5250 f53371;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m39105(C16642 c16642) {
        c16642.getClass();
        try {
            c16642.f53370.release();
        } catch (Throwable unused) {
        }
        C19431.m44468(c16642.f53371);
    }

    public C16642(int i, MediaMetadataRetriever mediaMetadataRetriever, C5250 c5250) {
        this.f53369 = i;
        this.f53370 = mediaMetadataRetriever;
        this.f53371 = c5250;
    }
}
