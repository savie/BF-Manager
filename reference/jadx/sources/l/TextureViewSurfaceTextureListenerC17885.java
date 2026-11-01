package l;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.ᩳۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5IX */
/* JADX INFO: loaded from: classes4.dex */
public final class TextureViewSurfaceTextureListenerC17885 extends Thread implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final WeakReference f56643;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1574 f56644;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long[] f56645;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public GifInfoHandle f56646;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public TextureViewSurfaceTextureListenerC17885(C18591 c18591) {
        super("GifRenderThread");
        this.f56644 = new C1574();
        this.f56646 = new GifInfoHandle();
        this.f56643 = new WeakReference(c18591);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            C18591 c18591 = (C18591) this.f56643.get();
            if (c18591 == null) {
                return;
            }
            GifInfoHandle gifInfoHandleMo1681 = c18591.f59145.mo1681();
            this.f56646 = gifInfoHandleMo1681;
            gifInfoHandleMo1681.m52907(c18591.isOpaque(), (char) 1);
            if (c18591.f59147.f34615 >= 0) {
                this.f56646.m52904(c18591.f59147.f34615);
            }
            C18591 c18592 = (C18591) this.f56643.get();
            if (c18592 == null) {
                this.f56646.m52920();
                return;
            }
            C18591.m42986(c18592, this);
            boolean zIsAvailable = c18592.isAvailable();
            C1574 c1574 = this.f56644;
            synchronized (c1574) {
                try {
                    if (zIsAvailable) {
                        c1574.m5378();
                    } else {
                        c1574.m5379();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zIsAvailable) {
                c18592.post(new RunnableC21413(this, c18592));
            }
            this.f56646.m52903(c18592.f59146);
            while (!isInterrupted()) {
                try {
                    this.f56644.m5377();
                    C18591 c18593 = (C18591) this.f56643.get();
                    if (c18593 == null) {
                        break;
                    }
                    SurfaceTexture surfaceTexture = c18593.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        Surface surface = new Surface(surfaceTexture);
                        try {
                            this.f56646.m52906(surface, this.f56645);
                            surface.release();
                        } catch (Throwable th2) {
                            surface.release();
                            throw th2;
                        }
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            this.f56646.m52920();
            this.f56646 = new GifInfoHandle();
        } catch (IOException unused2) {
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C18591 c18591 = (C18591) this.f56643.get();
        if (c18591 != null) {
            c18591.m42988(this.f56646);
        }
        this.f56644.m5378();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f56644.m5379();
        this.f56646.m52911();
        interrupt();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41513(C18591 c18591) {
        this.f56644.m5379();
        C18591.m42986(c18591, (TextureView.SurfaceTextureListener) null);
        this.f56646.m52911();
        interrupt();
    }
}
