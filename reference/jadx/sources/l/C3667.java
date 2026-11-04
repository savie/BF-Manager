package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۗ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E5ZZ */
/* JADX INFO: loaded from: classes3.dex */
public class C3667 extends C15688 {

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final ImageView.ScaleType f12584 = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final Bitmap.Config f12585 = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f12586 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f12587;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f12588;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f12589;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public long f12590;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f12591;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final RectF f12592;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f12593;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final RectF f12594;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f12595;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public float f12596;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Matrix f12597;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Bitmap f12598;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Paint f12599;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ColorFilter f12600;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Canvas f12601;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f12602;

    public C3667(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3667(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12594 = new RectF();
        this.f12592 = new RectF();
        this.f12597 = new Matrix();
        Paint paint = new Paint();
        this.f12599 = paint;
        Paint paint2 = new Paint();
        Paint paint3 = new Paint();
        this.f12589 = 255;
        this.f12602 = false;
        this.f12596 = 0.0f;
        this.f12593 = true;
        super.setScaleType(f12584);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setAlpha(this.f12589);
        paint.setColorFilter(this.f12600);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(-16777216);
        paint2.setStrokeWidth(0);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        paint3.setColor(0);
        setOutlineProvider(new C23805(this));
    }

    @Override // android.widget.ImageView
    public final void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == f12584) {
            return;
        }
        throw new IllegalArgumentException("ScaleType " + scaleType + " not supported.");
    }

    @Override // android.widget.ImageView
    public final void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        C21331 c21331 = drawable instanceof C21331 ? (C21331) drawable : null;
        float f = this.f12596;
        if (this.f12602) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j = this.f12590;
            if (jUptimeMillis >= j) {
                f += c21331 == null ? 0.5f : 1.25f;
                if (f >= 360.0f) {
                    f -= 360.0f;
                }
                this.f12596 = f;
                this.f12590 = jUptimeMillis + 15;
                postInvalidateDelayed(15L);
            } else {
                postInvalidateDelayed(j - jUptimeMillis);
            }
        }
        float f2 = f;
        if (c21331 != null) {
            c21331.m48558(canvas, getWidth(), getHeight(), f2, true, C3296.m10878());
            return;
        }
        if (f2 != 0.0f) {
            canvas.rotate(f2, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        if (this.f12598 != null) {
            if (this.f12595 && this.f12601 != null) {
                this.f12595 = false;
                Drawable drawable2 = getDrawable();
                drawable2.setBounds(0, 0, this.f12601.getWidth(), this.f12601.getHeight());
                drawable2.draw(this.f12601);
            }
            boolean z = this.f12591;
            Paint paint = this.f12599;
            if (z) {
                this.f12591 = false;
                Bitmap bitmap = this.f12598;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                bitmapShader.setLocalMatrix(this.f12597);
                paint.setShader(bitmapShader);
            }
            RectF rectF = this.f12594;
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.f12588, paint);
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f12595 = true;
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m11920();
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        m11920();
        invalidate();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        m11920();
        invalidate();
    }

    @Override // l.C15688, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m11921();
        invalidate();
    }

    @Override // l.C15688, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m11921();
        invalidate();
    }

    @Override // l.C15688, android.widget.ImageView
    public final void setImageResource(int i) {
        super.setImageResource(i);
        m11921();
        invalidate();
    }

    @Override // l.C15688, android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m11921();
        invalidate();
    }

    @Override // android.widget.ImageView
    public final void setImageAlpha(int i) {
        int i2 = i & 255;
        if (i2 == this.f12589) {
            return;
        }
        this.f12589 = i2;
        if (this.f12593) {
            this.f12599.setAlpha(i2);
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public final int getImageAlpha() {
        return this.f12589;
    }

    @Override // android.widget.ImageView
    public final void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.f12600) {
            return;
        }
        this.f12600 = colorFilter;
        if (this.f12593) {
            this.f12599.setColorFilter(colorFilter);
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public final ColorFilter getColorFilter() {
        return this.f12600;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m11921() {
        Bitmap bitmap;
        Bitmap bitmapCreateBitmap;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            bitmap = null;
        } else if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            try {
                boolean z = drawable instanceof ColorDrawable;
                Bitmap.Config config = f12585;
                if (z) {
                    bitmapCreateBitmap = Bitmap.createBitmap(2, 2, config);
                } else {
                    bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), config);
                }
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                bitmap = bitmapCreateBitmap;
            } catch (Exception unused) {
                bitmap = null;
            }
        }
        this.f12598 = bitmap;
        if (bitmap != null && bitmap.isMutable()) {
            this.f12601 = new Canvas(this.f12598);
        } else {
            this.f12601 = null;
        }
        if (this.f12593) {
            if (this.f12598 != null) {
                m11919();
            } else {
                this.f12599.setShader(null);
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m11920() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int iMin = Math.min(width, height);
        float paddingLeft = ((width - iMin) / 2.0f) + getPaddingLeft();
        float paddingTop = ((height - iMin) / 2.0f) + getPaddingTop();
        float f = iMin;
        RectF rectF = new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
        RectF rectF2 = this.f12592;
        rectF2.set(rectF);
        float f2 = 0;
        this.f12587 = Math.min((rectF2.height() - f2) / 2.0f, (rectF2.width() - f2) / 2.0f);
        RectF rectF3 = this.f12594;
        rectF3.set(rectF2);
        this.f12588 = Math.min(rectF3.height() / 2.0f, rectF3.width() / 2.0f);
        m11919();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m11919() {
        float fWidth;
        float fHeight;
        if (this.f12598 == null) {
            return;
        }
        Matrix matrix = this.f12597;
        matrix.set(null);
        int height = this.f12598.getHeight();
        float width = this.f12598.getWidth();
        RectF rectF = this.f12594;
        float f = height;
        float fWidth2 = 0.0f;
        if (rectF.height() * width > rectF.width() * f) {
            fWidth = rectF.height() / f;
            fWidth2 = (rectF.width() - (width * fWidth)) * 0.5f;
            fHeight = 0.0f;
        } else {
            fWidth = rectF.width() / width;
            fHeight = (rectF.height() - (f * fWidth)) * 0.5f;
        }
        matrix.setScale(fWidth, fWidth);
        matrix.postTranslate(((int) (fWidth2 + 0.5f)) + rectF.left, ((int) (fHeight + 0.5f)) + rectF.top);
        this.f12591 = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RectF rectF = this.f12592;
        if (!rectF.isEmpty()) {
            if (Math.pow(y - rectF.centerY(), 2.0d) + Math.pow(x - rectF.centerX(), 2.0d) > Math.pow(this.f12587, 2.0d)) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m11923() {
        this.f12596 = 0.0f;
        this.f12590 = SystemClock.uptimeMillis() + 200;
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11922(boolean z) {
        this.f12602 = z;
        if (z) {
            invalidate();
        }
    }
}
