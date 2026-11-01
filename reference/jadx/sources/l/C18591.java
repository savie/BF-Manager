package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Surface;
import android.view.TextureView;
import android.widget.ImageView;
import com.google.android.material.chip.Chip;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.ᩴۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5IX */
/* JADX INFO: loaded from: classes4.dex */
public class C18591 extends TextureView {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final ImageView.ScaleType[] f59142 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ImageView.ScaleType f59143;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Matrix f59144;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AbstractC16475 f59145;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f59146;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C10125 f59147;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextureViewSurfaceTextureListenerC17885 f59148;

    @Override // android.view.TextureView
    public final TextureView.SurfaceTextureListener getSurfaceTextureListener() {
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m42991(AbstractC16475 abstractC16475) {
        this.f59148.m41513(this);
        try {
            this.f59148.join();
        } catch (InterruptedException unused) {
        }
        this.f59145 = abstractC16475;
        TextureViewSurfaceTextureListenerC17885 textureViewSurfaceTextureListenerC17885 = new TextureViewSurfaceTextureListenerC17885(this);
        this.f59148 = textureViewSurfaceTextureListenerC17885;
        if (abstractC16475 != null) {
            textureViewSurfaceTextureListenerC17885.start();
        } else {
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            if (surfaceTexture != null) {
                Surface surface = new Surface(surfaceTexture);
                try {
                    surface.unlockCanvasAndPost(surface.lockCanvas(null));
                    surface.release();
                } catch (Throwable th) {
                    surface.release();
                    throw th;
                }
            }
        }
    }

    public C18591(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59143 = ImageView.ScaleType.FIT_CENTER;
        this.f59144 = new Matrix();
        this.f59146 = 1.0f;
        m42985(attributeSet, 0);
    }

    public C18591(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f59143 = ImageView.ScaleType.FIT_CENTER;
        this.f59144 = new Matrix();
        this.f59146 = 1.0f;
        m42985(attributeSet, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m42985(AttributeSet attributeSet, int i) {
        AbstractC16475 c20708;
        AbstractC16475 abstractC16475;
        if (attributeSet != null) {
            int attributeIntValue = attributeSet.getAttributeIntValue(Chip.NAMESPACE_ANDROID, "scaleType", -1);
            if (attributeIntValue >= 0) {
                ImageView.ScaleType[] scaleTypeArr = f59142;
                if (attributeIntValue < scaleTypeArr.length) {
                    this.f59143 = scaleTypeArr[attributeIntValue];
                }
            }
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5891.f20098, i, 0);
            TypedValue typedValue = new TypedValue();
            if (typedArrayObtainStyledAttributes.getValue(0, typedValue)) {
                if (typedValue.resourceId != 0) {
                    String resourceTypeName = typedArrayObtainStyledAttributes.getResources().getResourceTypeName(typedValue.resourceId);
                    if (C7302.f24237.contains(resourceTypeName)) {
                        c20708 = new C0246(typedArrayObtainStyledAttributes.getResources(), typedValue.resourceId);
                    } else {
                        if (!"string".equals(resourceTypeName)) {
                            throw new IllegalArgumentException(C16523.m38890("Expected string, drawable, mipmap or raw resource type. '", resourceTypeName, "' is not supported"));
                        }
                        c20708 = new C20708(typedArrayObtainStyledAttributes.getResources().getAssets(), typedValue.string.toString());
                    }
                } else {
                    c20708 = new C20708(typedArrayObtainStyledAttributes.getResources().getAssets(), typedValue.string.toString());
                }
                abstractC16475 = c20708;
            } else {
                abstractC16475 = null;
            }
            this.f59145 = abstractC16475;
            super.setOpaque(typedArrayObtainStyledAttributes.getBoolean(1, false));
            typedArrayObtainStyledAttributes.recycle();
            this.f59147 = new C10125(this, attributeSet, i);
        } else {
            super.setOpaque(false);
            this.f59147 = new C10125();
        }
        if (isInEditMode()) {
            return;
        }
        TextureViewSurfaceTextureListenerC17885 textureViewSurfaceTextureListenerC17885 = new TextureViewSurfaceTextureListenerC17885(this);
        this.f59148 = textureViewSurfaceTextureListenerC17885;
        if (this.f59145 != null) {
            textureViewSurfaceTextureListenerC17885.start();
        }
    }

    @Override // android.view.TextureView
    public final void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        throw new UnsupportedOperationException("Changing SurfaceTextureListener is not supported");
    }

    @Override // android.view.TextureView
    public final void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        throw new UnsupportedOperationException("Changing SurfaceTexture is not supported");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42986(C18591 c18591, TextureView.SurfaceTextureListener surfaceTextureListener) {
        super.setSurfaceTextureListener(surfaceTextureListener);
    }

    @Override // android.view.TextureView
    public final void setOpaque(boolean z) {
        if (z != isOpaque()) {
            super.setOpaque(z);
            AbstractC16475 abstractC16475 = this.f59145;
            synchronized (this) {
                m42991(abstractC16475);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.f59148.m41513(this);
        super.onDetachedFromWindow();
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m42988(GifInfoHandle gifInfoHandle) {
        Matrix matrix = new Matrix();
        float width = getWidth();
        float height = getHeight();
        float fM52917 = gifInfoHandle.m52917() / width;
        float fM52922 = gifInfoHandle.m52922() / height;
        RectF rectF = new RectF(0.0f, 0.0f, gifInfoHandle.m52917(), gifInfoHandle.m52922());
        RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
        switch (C15064.f49117[this.f59143.ordinal()]) {
            case 1:
                matrix.setScale(fM52917, fM52922, width / 2.0f, height / 2.0f);
                break;
            case 2:
                float fMin = 1.0f / Math.min(fM52917, fM52922);
                matrix.setScale(fM52917 * fMin, fMin * fM52922, width / 2.0f, height / 2.0f);
                break;
            case 3:
                float fMin2 = (((float) gifInfoHandle.m52917()) > width || ((float) gifInfoHandle.m52922()) > height) ? Math.min(1.0f / fM52917, 1.0f / fM52922) : 1.0f;
                matrix.setScale(fM52917 * fMin2, fMin2 * fM52922, width / 2.0f, height / 2.0f);
                break;
            case 4:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                matrix.preScale(fM52917, fM52922);
                break;
            case 5:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                matrix.preScale(fM52917, fM52922);
                break;
            case 6:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                matrix.preScale(fM52917, fM52922);
                break;
            case 7:
                return;
            case 8:
                matrix.set(this.f59144);
                matrix.preScale(fM52917, fM52922);
                break;
        }
        super.setTransform(matrix);
    }

    @Override // android.view.TextureView
    public final void setTransform(Matrix matrix) {
        this.f59144.set(matrix);
        m42988(this.f59148.f56646);
    }

    @Override // android.view.TextureView
    public final Matrix getTransform(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        }
        matrix.set(this.f59144);
        return matrix;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        TextureViewSurfaceTextureListenerC17885 textureViewSurfaceTextureListenerC17885 = this.f59148;
        textureViewSurfaceTextureListenerC17885.f56645 = textureViewSurfaceTextureListenerC17885.f56646.m52923();
        return new C19297(super.onSaveInstanceState(), this.f59147.f34614 ? this.f59148.f56645 : null);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C19297)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C19297 c19297 = (C19297) parcelable;
        super.onRestoreInstanceState(c19297.getSuperState());
        this.f59148.f56645 = c19297.f62271[0];
    }
}
