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

/* JADX INFO: renamed from: l.ᩳۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: D5IX */
/* JADX INFO: loaded from: classes4.dex */
public class C18803 extends TextureView {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final ImageView.ScaleType[] f61061 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f61062;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Matrix f61063;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC11101 f61064;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ImageView.ScaleType f61065;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2395 f61066;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextureViewSurfaceTextureListenerC7616 f61067;

    @Override // android.view.TextureView
    public final TextureView.SurfaceTextureListener getSurfaceTextureListener() {
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m43597(AbstractC11101 abstractC11101) {
        this.f61067.m20814(this);
        try {
            this.f61067.join();
        } catch (InterruptedException unused) {
        }
        this.f61064 = abstractC11101;
        TextureViewSurfaceTextureListenerC7616 textureViewSurfaceTextureListenerC7616 = new TextureViewSurfaceTextureListenerC7616(this);
        this.f61067 = textureViewSurfaceTextureListenerC7616;
        if (abstractC11101 != null) {
            textureViewSurfaceTextureListenerC7616.start();
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

    public C18803(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61065 = ImageView.ScaleType.FIT_CENTER;
        this.f61063 = new Matrix();
        this.f61062 = 1.0f;
        m43591(attributeSet, 0);
    }

    public C18803(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f61065 = ImageView.ScaleType.FIT_CENTER;
        this.f61063 = new Matrix();
        this.f61062 = 1.0f;
        m43591(attributeSet, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m43591(AttributeSet attributeSet, int i) {
        AbstractC11101 c6870;
        AbstractC11101 abstractC11101;
        if (attributeSet != null) {
            int attributeIntValue = attributeSet.getAttributeIntValue(Chip.NAMESPACE_ANDROID, "scaleType", -1);
            if (attributeIntValue >= 0) {
                ImageView.ScaleType[] scaleTypeArr = f61061;
                if (attributeIntValue < scaleTypeArr.length) {
                    this.f61065 = scaleTypeArr[attributeIntValue];
                }
            }
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C15576.f50655, i, 0);
            TypedValue typedValue = new TypedValue();
            if (typedArrayObtainStyledAttributes.getValue(0, typedValue)) {
                if (typedValue.resourceId != 0) {
                    String resourceTypeName = typedArrayObtainStyledAttributes.getResources().getResourceTypeName(typedValue.resourceId);
                    if (C8361.f27427.contains(resourceTypeName)) {
                        c6870 = new C22290(typedValue.resourceId, typedArrayObtainStyledAttributes.getResources());
                    } else {
                        if (!"string".equals(resourceTypeName)) {
                            throw new IllegalArgumentException(C14442.m34865("Expected string, drawable, mipmap or raw resource type. '", resourceTypeName, "' is not supported"));
                        }
                        c6870 = new C6870(typedArrayObtainStyledAttributes.getResources().getAssets(), typedValue.string.toString());
                    }
                } else {
                    c6870 = new C6870(typedArrayObtainStyledAttributes.getResources().getAssets(), typedValue.string.toString());
                }
                abstractC11101 = c6870;
            } else {
                abstractC11101 = null;
            }
            this.f61064 = abstractC11101;
            super.setOpaque(typedArrayObtainStyledAttributes.getBoolean(1, false));
            typedArrayObtainStyledAttributes.recycle();
            this.f61066 = new C2395(this, attributeSet, i);
        } else {
            super.setOpaque(false);
            this.f61066 = new C2395();
        }
        if (isInEditMode()) {
            return;
        }
        TextureViewSurfaceTextureListenerC7616 textureViewSurfaceTextureListenerC7616 = new TextureViewSurfaceTextureListenerC7616(this);
        this.f61067 = textureViewSurfaceTextureListenerC7616;
        if (this.f61064 != null) {
            textureViewSurfaceTextureListenerC7616.start();
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
    public static void m43592(C18803 c18803, TextureView.SurfaceTextureListener surfaceTextureListener) {
        super.setSurfaceTextureListener(surfaceTextureListener);
    }

    @Override // android.view.TextureView
    public final void setOpaque(boolean z) {
        if (z != isOpaque()) {
            super.setOpaque(z);
            AbstractC11101 abstractC11101 = this.f61064;
            synchronized (this) {
                m43597(abstractC11101);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.f61067.m20814(this);
        super.onDetachedFromWindow();
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m43594(GifInfoHandle gifInfoHandle) {
        Matrix matrix = new Matrix();
        float width = getWidth();
        float height = getHeight();
        float fM56813 = gifInfoHandle.m56813() / width;
        float fM56811 = gifInfoHandle.m56811() / height;
        RectF rectF = new RectF(0.0f, 0.0f, gifInfoHandle.m56813(), gifInfoHandle.m56811());
        RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
        switch (C18057.f59122[this.f61065.ordinal()]) {
            case 1:
                matrix.setScale(fM56813, fM56811, width / 2.0f, height / 2.0f);
                break;
            case 2:
                float fMin = 1.0f / Math.min(fM56813, fM56811);
                matrix.setScale(fM56813 * fMin, fMin * fM56811, width / 2.0f, height / 2.0f);
                break;
            case 3:
                float fMin2 = (((float) gifInfoHandle.m56813()) > width || ((float) gifInfoHandle.m56811()) > height) ? Math.min(1.0f / fM56813, 1.0f / fM56811) : 1.0f;
                matrix.setScale(fM56813 * fMin2, fMin2 * fM56811, width / 2.0f, height / 2.0f);
                break;
            case 4:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                matrix.preScale(fM56813, fM56811);
                break;
            case 5:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                matrix.preScale(fM56813, fM56811);
                break;
            case 6:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                matrix.preScale(fM56813, fM56811);
                break;
            case 7:
                return;
            case 8:
                matrix.set(this.f61063);
                matrix.preScale(fM56813, fM56811);
                break;
        }
        super.setTransform(matrix);
    }

    @Override // android.view.TextureView
    public final void setTransform(Matrix matrix) {
        this.f61063.set(matrix);
        m43594(this.f61067.f25145);
    }

    @Override // android.view.TextureView
    public final Matrix getTransform(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        }
        matrix.set(this.f61063);
        return matrix;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        TextureViewSurfaceTextureListenerC7616 textureViewSurfaceTextureListenerC7616 = this.f61067;
        textureViewSurfaceTextureListenerC7616.f25142 = textureViewSurfaceTextureListenerC7616.f25145.m56821();
        return new C0904(super.onSaveInstanceState(), this.f61066.f7706 ? this.f61067.f25142 : null);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0904)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0904 c0904 = (C0904) parcelable;
        super.onRestoreInstanceState(c0904.getSuperState());
        this.f61067.f25142 = c0904.f3394[0];
    }
}
