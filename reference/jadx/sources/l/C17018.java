package l;

import android.view.Surface;

/* JADX INFO: renamed from: l.ܿ֨ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68R4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17018 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39784(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            C0303.m1854("Failed to call Surface.setFrameRate", e);
        }
    }
}
