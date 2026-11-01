package l;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: renamed from: l.֨֨ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8TR */
/* JADX INFO: loaded from: classes2.dex */
public final class C0789 extends Surface {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean f3372;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int f3373;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f3374;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f3375;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HandlerThreadC21957 f3376;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized boolean m3332(Context context) {
        int i;
        if (!f3372) {
            try {
                if (C17942.m41765(context)) {
                    i = C17942.m41767() ? 1 : 2;
                } else {
                    i = 0;
                }
            } catch (C21470 e) {
                C0303.m1853("Failed to determine secure mode due to GL error: " + e.getMessage());
            }
            f3373 = i;
            f3372 = true;
        }
        return f3373 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0789 m3331(Context context, boolean z) {
        C2023.m6510(!z || m3332(context));
        return new HandlerThreadC21957("ExoPlayer:PlaceholderSurface").m48789(z ? f3373 : 0);
    }

    public C0789(HandlerThreadC21957 handlerThreadC21957, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f3376 = handlerThreadC21957;
        this.f3375 = z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f3376) {
            if (!this.f3374) {
                this.f3376.m48790();
                this.f3374 = true;
            }
        }
    }
}
