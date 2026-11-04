package l;

import android.view.Surface;

/* JADX INFO: renamed from: l.֫۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 68R4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1931 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m6632(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            C1896.m6516("Failed to call Surface.setFrameRate", e);
        }
    }
}
