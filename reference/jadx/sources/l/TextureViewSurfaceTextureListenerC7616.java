package l;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.۟ۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: D5IX */
/* JADX INFO: loaded from: classes3.dex */
public final class TextureViewSurfaceTextureListenerC7616 extends Thread implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long[] f25142;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11344 f25143;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final WeakReference f25144;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public GifInfoHandle f25145;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public TextureViewSurfaceTextureListenerC7616(C18803 c18803) {
        super("GifRenderThread");
        this.f25143 = new C11344();
        this.f25145 = new GifInfoHandle();
        this.f25144 = new WeakReference(c18803);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            C18803 c18803 = (C18803) this.f25144.get();
            if (c18803 == null) {
                return;
            }
            GifInfoHandle gifInfoHandleMo15528 = c18803.f61064.mo15528();
            this.f25145 = gifInfoHandleMo15528;
            gifInfoHandleMo15528.m56804(c18803.isOpaque(), (char) 1);
            if (c18803.f61066.f7707 >= 0) {
                this.f25145.m56801(c18803.f61066.f7707);
            }
            C18803 c18804 = (C18803) this.f25144.get();
            if (c18804 == null) {
                this.f25145.m56816();
                return;
            }
            C18803.m43592(c18804, this);
            boolean zIsAvailable = c18804.isAvailable();
            C11344 c11344 = this.f25143;
            synchronized (c11344) {
                try {
                    if (zIsAvailable) {
                        c11344.m28642();
                    } else {
                        c11344.m28643();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zIsAvailable) {
                c18804.post(new RunnableC0158(this, c18804));
            }
            this.f25145.m56800(c18804.f61062);
            while (!isInterrupted()) {
                try {
                    this.f25143.m28641();
                    C18803 c18805 = (C18803) this.f25144.get();
                    if (c18805 == null) {
                        break;
                    }
                    SurfaceTexture surfaceTexture = c18805.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        Surface surface = new Surface(surfaceTexture);
                        try {
                            this.f25145.m56803(surface, this.f25142);
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
            this.f25145.m56816();
            this.f25145 = new GifInfoHandle();
        } catch (IOException unused2) {
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C18803 c18803 = (C18803) this.f25144.get();
        if (c18803 != null) {
            c18803.m43594(this.f25145);
        }
        this.f25143.m28642();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f25143.m28643();
        this.f25145.m56796();
        interrupt();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20814(C18803 c18803) {
        this.f25143.m28643();
        C18803.m43592(c18803, (TextureView.SurfaceTextureListener) null);
        this.f25145.m56796();
        interrupt();
    }
}
