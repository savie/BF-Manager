package l;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: renamed from: l.֡ܳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N8TR */
/* JADX INFO: loaded from: classes2.dex */
public final class C0504 extends Surface {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static int f2179;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static boolean f2180;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f2181;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f2182;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HandlerThreadC18403 f2183;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized boolean m2471(Context context) {
        int i;
        if (!f2180) {
            try {
                if (C7357.m20178(context)) {
                    i = C7357.m20180() ? 1 : 2;
                } else {
                    i = 0;
                }
            } catch (C8848 e) {
                C1896.m6515("Failed to determine secure mode due to GL error: " + e.getMessage());
            }
            f2179 = i;
            f2180 = true;
        }
        return f2179 != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0504 m2470(Context context, boolean z) {
        C20782.m47568(!z || m2471(context));
        return new HandlerThreadC18403("ExoPlayer:PlaceholderSurface").m42916(z ? f2179 : 0);
    }

    public C0504(HandlerThreadC18403 handlerThreadC18403, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f2183 = handlerThreadC18403;
        this.f2181 = z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f2183) {
            if (!this.f2182) {
                this.f2183.m42917();
                this.f2182 = true;
            }
        }
    }
}
