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

/* JADX INFO: renamed from: l.᩶۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6VB */
/* JADX INFO: loaded from: classes4.dex */
public final class TextureViewSurfaceTextureListenerC20034 extends FrameLayout implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f64152;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C1688 f64153;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextureView f64154;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC3062 f64155;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f64156;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f64157;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23562 f64158;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C8745 f64159;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ImageView f64160;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f64161;

    /* JADX WARN: Type inference failed for: r6v1, types: [l.ۡ۟᩺] */
    public TextureViewSurfaceTextureListenerC20034(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64159 = new InterfaceC5657() { // from class: l.ۡ۟᩺
            @Override // l.InterfaceC5657
            /* JADX INFO: renamed from: ۙ */
            public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
                this.f30059.m45366();
            }
        };
        ImageView imageView = new ImageView(context);
        this.f64160 = imageView;
        imageView.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImportantForAccessibility(2);
        setPadding(0, 0, 0, 0);
        TextureView textureView = new TextureView(context);
        this.f64154 = textureView;
        textureView.setOpaque(false);
        textureView.setImportantForAccessibility(2);
        textureView.setSurfaceTextureListener(this);
        this.f64158 = new C23562(textureView, new RunnableC7361(5, this));
        textureView.setOnTouchListener(new View.OnTouchListener() { // from class: l.ۤ۟᩺
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f34668.f64158.m51960(motionEvent);
            }
        });
        addView(textureView, new FrameLayout.LayoutParams(-1, -1));
        addView(imageView, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45380(C21111 c21111) {
        this.f64160.setImageDrawable(c21111);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ImageView m45377() {
        return this.f64160;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45379(AbstractActivityC12483 abstractActivityC12483) {
        AbstractC3062 abstractC3062 = this.f64155;
        C8745 c8745 = this.f64159;
        if (abstractC3062 != null) {
            abstractC3062.mo9172(c8745);
        }
        this.f64155 = abstractActivityC12483.getLifecycle();
        if (isAttachedToWindow()) {
            this.f64155.mo9171(c8745);
        }
        m45366();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45381(boolean z) {
        this.f64158.m51959(z);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45383() {
        this.f64158.m51958(420L, true);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m45382() {
        this.f64158.m51958(350L, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45370(TextureViewSurfaceTextureListenerC20034 textureViewSurfaceTextureListenerC20034) {
        C1688 c1688 = textureViewSurfaceTextureListenerC20034.f64153;
        if (c1688 != null) {
            c1688.m5604(textureViewSurfaceTextureListenerC20034.f64158.f76307);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45378(int i) {
        this.f64161 = i;
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        this.f64156 = fArr[1] != 0.0f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m45367(int i, int i2) {
        ImageView imageView = this.f64160;
        return Math.min(Math.max(1, (i - imageView.getPaddingLeft()) - imageView.getPaddingRight()), Math.max(1, (i2 - imageView.getPaddingTop()) - imageView.getPaddingBottom())) / Math.max(1, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f64152 = false;
        this.f64157 = false;
        this.f64158.m51961(false);
        this.f64160.setVisibility(0);
        TextureView textureView = this.f64154;
        textureView.setAlpha(1.0f);
        try {
            m45368(surfaceTexture, i, i2);
        } catch (LinkageError | OutOfMemoryError | RuntimeException unused) {
            this.f64153 = null;
            this.f64157 = true;
            textureView.setAlpha(0.0f);
            m45366();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45368(SurfaceTexture surfaceTexture, int i, int i2) {
        C1688 c1688 = new C1688(getContext().getAssets(), surfaceTexture, i, i2, m45367(i, i2), this.f64161, this.f64156, new C15801(this));
        this.f64153 = c1688;
        c1688.m5604(this.f64158.f76307);
        m45366();
        this.f64153.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m45369(C1688 c1688) {
        if (this.f64160.getVisibility() == 0 && this.f64153 == c1688 && c1688 != null && c1688.f6687 && this.f64152 && !this.f64157) {
            this.f64160.setVisibility(4);
            m45366();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C1688 c1688 = this.f64153;
        if (c1688 != null) {
            c1688.m5602(i, m45367(i, i2), i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C1688 c1688 = this.f64153;
        this.f64153 = null;
        this.f64152 = false;
        this.f64160.setVisibility(0);
        this.f64158.m51961(false);
        if (c1688 == null) {
            return true;
        }
        c1688.m5601();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f64152 = true;
        m45369(this.f64153);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m45366();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m45366();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m45366();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC3062 abstractC3062 = this.f64155;
        if (abstractC3062 != null) {
            abstractC3062.mo9171(this.f64159);
        }
        m45366();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        AbstractC3062 abstractC3062 = this.f64155;
        if (abstractC3062 != null) {
            abstractC3062.mo9172(this.f64159);
        }
        this.f64158.m51961(false);
        C1688 c1688 = this.f64153;
        if (c1688 != null) {
            c1688.m5603(false);
        }
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m45366() {
        C1688 c1688;
        AbstractC3062 abstractC3062;
        boolean z = false;
        boolean z2 = isAttachedToWindow() && getWindowVisibility() == 0 && isShown() && hasWindowFocus() && ((abstractC3062 = this.f64155) == null || abstractC3062.mo9170().m24173(EnumC9414.RESUMED));
        if (this.f64153 != null) {
            AbstractC3062 abstractC3063 = this.f64155;
            if (abstractC3063 == null || abstractC3063.mo9170() != EnumC9414.DESTROYED) {
                this.f64153.m5603(z2 && !this.f64157);
            } else {
                this.f64153.m5605();
            }
        }
        C23562 c23562 = this.f64158;
        if (c23562 != null) {
            if (z2 && !this.f64157 && (c1688 = this.f64153) != null && c1688.f6687 && this.f64152 && this.f64160.getVisibility() == 4) {
                z = true;
            }
            c23562.m51961(z);
        }
    }
}
