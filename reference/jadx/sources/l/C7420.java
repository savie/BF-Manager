package l;

import android.media.MediaMetadataRetriever;

/* JADX INFO: renamed from: l.ۜ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7420 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f24431;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final MediaMetadataRetriever f24432;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9026 f24433;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m20334(C7420 c7420) {
        c7420.getClass();
        try {
            c7420.f24432.release();
        } catch (Throwable unused) {
        }
        C20244.m46520(c7420.f24433);
    }

    public C7420(int i, MediaMetadataRetriever mediaMetadataRetriever, C9026 c9026) {
        this.f24431 = i;
        this.f24432 = mediaMetadataRetriever;
        this.f24433 = c9026;
    }
}
