package l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۛ۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6VB */
/* JADX INFO: loaded from: classes3.dex */
public final class TextureViewSurfaceTextureListenerC6431 extends FrameLayout implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C7922 f21652;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final TextureView f21653;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f21654;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC8585 f21655;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f21656;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C10158 f21657;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f21658;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f21659;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16125 f21660;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f21661;

    /* JADX WARN: Type inference failed for: r6v1, types: [l.ܶ۬᩻] */
    public TextureViewSurfaceTextureListenerC6431(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21660 = new InterfaceC5252() { // from class: l.ܶ۬᩻
            @Override // l.InterfaceC5252
            /* JADX INFO: renamed from: ۙ */
            public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
                this.f52402.m18200();
            }
        };
        ImageView imageView = new ImageView(context);
        this.f21661 = imageView;
        imageView.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImportantForAccessibility(2);
        setPadding(0, 0, 0, 0);
        TextureView textureView = new TextureView(context);
        this.f21653 = textureView;
        textureView.setOpaque(false);
        textureView.setImportantForAccessibility(2);
        textureView.setSurfaceTextureListener(this);
        this.f21652 = new C7922(textureView, new RunnableC4839(4, this));
        textureView.setOnTouchListener(new View.OnTouchListener() { // from class: l.᩹۬᩻
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f76582.f21652.m21502(motionEvent);
            }
        });
        addView(textureView, new FrameLayout.LayoutParams(-1, -1));
        addView(imageView, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18204(C24236 c24236) {
        this.f21661.setImageDrawable(c24236);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ImageView m18201() {
        return this.f21661;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18203(AbstractActivityC17204 abstractActivityC17204) {
        AbstractC8585 abstractC8585 = this.f21655;
        C16125 c16125 = this.f21660;
        if (abstractC8585 != null) {
            abstractC8585.mo23078(c16125);
        }
        this.f21655 = abstractActivityC17204.getLifecycle();
        if (isAttachedToWindow()) {
            this.f21655.mo23077(c16125);
        }
        m18200();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18205(boolean z) {
        this.f21652.m21501(z);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18207() {
        this.f21652.m21500(420L, true);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m18206() {
        this.f21652.m21500(350L, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18190(TextureViewSurfaceTextureListenerC6431 textureViewSurfaceTextureListenerC6431) {
        C10158 c10158 = textureViewSurfaceTextureListenerC6431.f21657;
        if (c10158 != null) {
            c10158.m26270(textureViewSurfaceTextureListenerC6431.f21652.f26310);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18202(int i) {
        this.f21656 = i;
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        this.f21654 = fArr[1] != 0.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m18188(int i, int i2) {
        ImageView imageView = this.f21661;
        return Math.min(Math.max(1, (i - imageView.getPaddingLeft()) - imageView.getPaddingRight()), Math.max(1, (i2 - imageView.getPaddingTop()) - imageView.getPaddingBottom())) / Math.max(1, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f21659 = false;
        this.f21658 = false;
        this.f21652.m21503(false);
        this.f21661.setVisibility(0);
        TextureView textureView = this.f21653;
        textureView.setAlpha(1.0f);
        try {
            m18189(surfaceTexture, i, i2);
        } catch (LinkageError | OutOfMemoryError | RuntimeException unused) {
            this.f21657 = null;
            this.f21658 = true;
            textureView.setAlpha(0.0f);
            m18200();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m18189(SurfaceTexture surfaceTexture, int i, int i2) {
        C10158 c10158 = new C10158(getContext().getAssets(), surfaceTexture, i, i2, m18188(i, i2), this.f21656, this.f21654, new C12396(this));
        this.f21657 = c10158;
        c10158.m26270(this.f21652.f26310);
        m18200();
        this.f21657.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m18192(C10158 c10158) {
        if (this.f21661.getVisibility() == 0 && this.f21657 == c10158 && c10158 != null && c10158.f32529 && this.f21659 && !this.f21658) {
            this.f21661.setVisibility(4);
            m18200();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C10158 c10158 = this.f21657;
        if (c10158 != null) {
            c10158.m26268(i, m18188(i, i2), i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C10158 c10158 = this.f21657;
        this.f21657 = null;
        this.f21659 = false;
        this.f21661.setVisibility(0);
        this.f21652.m21503(false);
        if (c10158 == null) {
            return true;
        }
        c10158.m26267();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f21659 = true;
        m18192(this.f21657);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m18200();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m18200();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m18200();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC8585 abstractC8585 = this.f21655;
        if (abstractC8585 != null) {
            abstractC8585.mo23077(this.f21660);
        }
        m18200();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC8585 abstractC8585 = this.f21655;
        if (abstractC8585 != null) {
            abstractC8585.mo23078(this.f21660);
        }
        this.f21652.m21503(false);
        C10158 c10158 = this.f21657;
        if (c10158 != null) {
            c10158.m26269(false);
        }
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m18200() {
        C10158 c10158;
        AbstractC8585 abstractC8585;
        boolean z = false;
        boolean z2 = isAttachedToWindow() && getWindowVisibility() == 0 && isShown() && hasWindowFocus() && ((abstractC8585 = this.f21655) == null || abstractC8585.mo23076().m8762(EnumC2619.RESUMED));
        if (this.f21657 != null) {
            AbstractC8585 abstractC8586 = this.f21655;
            if (abstractC8586 == null || abstractC8586.mo23076() != EnumC2619.DESTROYED) {
                this.f21657.m26269(z2 && !this.f21658);
            } else {
                this.f21657.m26271();
            }
        }
        C7922 c7922 = this.f21652;
        if (c7922 != null) {
            if (z2 && !this.f21658 && (c10158 = this.f21657) != null && c10158.f32529 && this.f21659 && this.f21661.getVisibility() == 4) {
                z = true;
            }
            c7922.m21503(z);
        }
    }
}
