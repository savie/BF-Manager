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

/* JADX INFO: renamed from: l.ܺۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: E5ZZ */
/* JADX INFO: loaded from: classes4.dex */
public class C15697 extends C2830 {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f50955 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Paint f50958;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f50959;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Matrix f50960;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public long f50961;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f50962;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f50963;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f50964;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public float f50965;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final RectF f50966;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f50967;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f50968;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Bitmap f50969;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f50970;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ColorFilter f50971;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Canvas f50972;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final RectF f50973;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final ImageView.ScaleType f50957 = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final Bitmap.Config f50956 = Bitmap.Config.ARGB_8888;

    public C15697(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C15697(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50973 = new RectF();
        this.f50966 = new RectF();
        this.f50960 = new Matrix();
        Paint paint = new Paint();
        this.f50958 = paint;
        Paint paint2 = new Paint();
        Paint paint3 = new Paint();
        this.f50968 = 255;
        this.f50967 = false;
        this.f50965 = 0.0f;
        this.f50959 = true;
        super.setScaleType(f50957);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setAlpha(this.f50968);
        paint.setColorFilter(this.f50971);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(-16777216);
        paint2.setStrokeWidth(0);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        paint3.setColor(0);
        setOutlineProvider(new C20635(this));
    }

    @Override // android.widget.ImageView
    public final void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == f50957) {
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
        C19568 c19568 = drawable instanceof C19568 ? (C19568) drawable : null;
        float f = this.f50965;
        if (this.f50967) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j = this.f50961;
            if (jUptimeMillis >= j) {
                f += c19568 == null ? 0.5f : 1.25f;
                if (f >= 360.0f) {
                    f -= 360.0f;
                }
                this.f50965 = f;
                this.f50961 = jUptimeMillis + 15;
                postInvalidateDelayed(15L);
            } else {
                postInvalidateDelayed(j - jUptimeMillis);
            }
        }
        float f2 = f;
        if (c19568 != null) {
            c19568.m44669(canvas, getWidth(), getHeight(), f2, true, C20368.m45991());
            return;
        }
        if (f2 != 0.0f) {
            canvas.rotate(f2, getWidth() / 2.0f, getHeight() / 2.0f);
        }
        if (this.f50969 != null) {
            if (this.f50962 && this.f50972 != null) {
                this.f50962 = false;
                Drawable drawable2 = getDrawable();
                drawable2.setBounds(0, 0, this.f50972.getWidth(), this.f50972.getHeight());
                drawable2.draw(this.f50972);
            }
            boolean z = this.f50963;
            Paint paint = this.f50958;
            if (z) {
                this.f50963 = false;
                Bitmap bitmap = this.f50969;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                bitmapShader.setLocalMatrix(this.f50960);
                paint.setShader(bitmapShader);
            }
            RectF rectF = this.f50973;
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), this.f50964, paint);
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f50962 = true;
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m37399();
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        m37399();
        invalidate();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        m37399();
        invalidate();
    }

    @Override // l.C2830, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m37397();
        invalidate();
    }

    @Override // l.C2830, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m37397();
        invalidate();
    }

    @Override // l.C2830, android.widget.ImageView
    public final void setImageResource(int i) {
        super.setImageResource(i);
        m37397();
        invalidate();
    }

    @Override // l.C2830, android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m37397();
        invalidate();
    }

    @Override // android.widget.ImageView
    public final void setImageAlpha(int i) {
        int i2 = i & 255;
        if (i2 == this.f50968) {
            return;
        }
        this.f50968 = i2;
        if (this.f50959) {
            this.f50958.setAlpha(i2);
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public final int getImageAlpha() {
        return this.f50968;
    }

    @Override // android.widget.ImageView
    public final void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.f50971) {
            return;
        }
        this.f50971 = colorFilter;
        if (this.f50959) {
            this.f50958.setColorFilter(colorFilter);
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public final ColorFilter getColorFilter() {
        return this.f50971;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m37397() {
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
                Bitmap.Config config = f50956;
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
        this.f50969 = bitmap;
        if (bitmap != null && bitmap.isMutable()) {
            this.f50972 = new Canvas(this.f50969);
        } else {
            this.f50972 = null;
        }
        if (this.f50959) {
            if (this.f50969 != null) {
                m37400();
            } else {
                this.f50958.setShader(null);
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m37399() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int iMin = Math.min(width, height);
        float paddingLeft = ((width - iMin) / 2.0f) + getPaddingLeft();
        float paddingTop = ((height - iMin) / 2.0f) + getPaddingTop();
        float f = iMin;
        RectF rectF = new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
        RectF rectF2 = this.f50966;
        rectF2.set(rectF);
        float f2 = 0;
        this.f50970 = Math.min((rectF2.height() - f2) / 2.0f, (rectF2.width() - f2) / 2.0f);
        RectF rectF3 = this.f50973;
        rectF3.set(rectF2);
        this.f50964 = Math.min(rectF3.height() / 2.0f, rectF3.width() / 2.0f);
        m37400();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m37400() {
        float fWidth;
        float fHeight;
        if (this.f50969 == null) {
            return;
        }
        Matrix matrix = this.f50960;
        matrix.set(null);
        int height = this.f50969.getHeight();
        float width = this.f50969.getWidth();
        RectF rectF = this.f50973;
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
        this.f50963 = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RectF rectF = this.f50966;
        if (!rectF.isEmpty()) {
            if (Math.pow(y - rectF.centerY(), 2.0d) + Math.pow(x - rectF.centerX(), 2.0d) > Math.pow(this.f50970, 2.0d)) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m37402() {
        this.f50965 = 0.0f;
        this.f50961 = SystemClock.uptimeMillis() + 200;
        invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37401(boolean z) {
        this.f50967 = z;
        if (z) {
            invalidate();
        }
    }
}
