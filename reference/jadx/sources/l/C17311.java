package l;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.util.TypedValue;
import android.widget.MediaController;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.crypto.params.DHParameters;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: renamed from: l.ܽۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P5QW */
/* JADX INFO: loaded from: classes4.dex */
public class C17311 extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f56374 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final HandlerC23036 f56375;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final GifInfoHandle f56376;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Paint f56377;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f56378;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f56379;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f56380;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C13339 f56381;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f56382;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ConcurrentLinkedQueue f56383;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public ColorStateList f56384;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f56385;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Bitmap f56386;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ScheduledThreadPoolExecutor f56387;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f56388;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f56389;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Rect f56390;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f56391;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f56392;

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        return 100;
    }

    public C17311(int i, Resources resources) {
        this(new GifInfoHandle(resources.openRawResourceFd(i)), null, true);
        List list = C8361.f27427;
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.density;
        if (i2 == 0) {
            i2 = DHParameters.DEFAULT_MINIMUM_LENGTH;
        } else if (i2 == 65535) {
            i2 = 0;
        }
        int i3 = resources.getDisplayMetrics().densityDpi;
        float f = (i2 <= 0 || i3 <= 0) ? 1.0f : i3 / i2;
        this.f56385 = (int) (this.f56376.m56811() * f);
        this.f56378 = (int) (this.f56376.m56813() * f);
    }

    public C17311(byte[] bArr) {
        this(new GifInfoHandle(bArr), null, true);
    }

    public C17311(ContentResolver contentResolver, Uri uri) throws IOException {
        GifInfoHandle gifInfoHandle;
        int i = GifInfoHandle.f82019;
        if ("file".equals(uri.getScheme())) {
            gifInfoHandle = new GifInfoHandle(uri.getPath());
        } else {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IOException("Could not open AssetFileDescriptor for " + uri);
            }
            gifInfoHandle = new GifInfoHandle(assetFileDescriptorOpenAssetFileDescriptor);
        }
        this(gifInfoHandle, null, true);
    }

    public C17311(GifInfoHandle gifInfoHandle, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z) {
        this.f56388 = true;
        this.f56382 = Long.MIN_VALUE;
        this.f56390 = new Rect();
        this.f56377 = new Paint(6);
        this.f56383 = new ConcurrentLinkedQueue();
        C13339 c13339 = new C13339(this);
        this.f56381 = c13339;
        this.f56380 = z;
        if (scheduledThreadPoolExecutor == null) {
            int i = C14327.f45203;
            scheduledThreadPoolExecutor = C3887.f13255;
        }
        this.f56387 = scheduledThreadPoolExecutor;
        this.f56376 = gifInfoHandle;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gifInfoHandle.m56813(), gifInfoHandle.m56811(), Bitmap.Config.ARGB_8888);
        this.f56386 = bitmapCreateBitmap;
        bitmapCreateBitmap.setHasAlpha(!gifInfoHandle.m56812());
        this.f56391 = new Rect(0, 0, gifInfoHandle.m56813(), gifInfoHandle.m56811());
        this.f56375 = new HandlerC23036(this);
        c13339.mo17109();
        this.f56378 = gifInfoHandle.m56813();
        this.f56385 = gifInfoHandle.m56811();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m40658() {
        this.f56388 = false;
        this.f56375.removeMessages(-1);
        this.f56376.m56816();
        this.f56386.recycle();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        if (this.f56380 && this.f56388) {
            long j = this.f56382;
            if (j != Long.MIN_VALUE) {
                long jMax = Math.max(0L, j - SystemClock.uptimeMillis());
                this.f56382 = Long.MIN_VALUE;
                this.f56387.remove(this.f56381);
                this.f56379 = this.f56387.schedule(this.f56381, jMax, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f56385;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f56378;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f56377.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f56377.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return (!this.f56376.m56812() || this.f56377.getAlpha() < 255) ? -2 : -1;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        synchronized (this) {
            if (this.f56388) {
                return;
            }
            this.f56388 = true;
            m40657(this.f56376.m56806());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40657(long j) {
        boolean z = this.f56380;
        HandlerC23036 handlerC23036 = this.f56375;
        if (z) {
            this.f56382 = 0L;
            handlerC23036.sendEmptyMessageAtTime(-1, 0L);
            return;
        }
        ScheduledFuture scheduledFuture = this.f56379;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        handlerC23036.removeMessages(-1);
        this.f56379 = this.f56387.schedule(this.f56381, Math.max(j, 0L), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40655() {
        this.f56387.execute(new C24771(this, this));
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        synchronized (this) {
            if (this.f56388) {
                this.f56388 = false;
                ScheduledFuture scheduledFuture = this.f56379;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f56375.removeMessages(-1);
                this.f56376.m56820();
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f56388;
    }

    public final String toString() {
        Locale locale = Locale.ENGLISH;
        GifInfoHandle gifInfoHandle = this.f56376;
        int iM56813 = gifInfoHandle.m56813();
        int iM56811 = gifInfoHandle.m56811();
        int iM56808 = gifInfoHandle.m56808();
        int iM56795 = gifInfoHandle.m56795();
        StringBuilder sbM5126 = C1402.m5126("GIF: size: ", iM56813, "x", ", frames: ", iM56811);
        sbM5126.append(iM56808);
        sbM5126.append(", error: ");
        sbM5126.append(iM56795);
        return sbM5126.toString();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return this.f56376.m56808() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return this.f56376.m56808() > 1;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m40661() {
        return this.f56376.m56808();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC3141 m40664() {
        return EnumC3141.m10260(this.f56376.m56795());
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        stop();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.f56376.m56815();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.f56376.m56818();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        this.f56387.execute(new C16565(this, this, i));
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        return this.f56388;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m40656() {
        return this.f56376.m56798() + ((long) this.f56386.getAllocationByteCount());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long m40662() {
        return this.f56376.m56805();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f56390.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.f56392;
        Paint paint = this.f56377;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f56392);
            z = true;
        }
        canvas.drawBitmap(this.f56386, this.f56391, this.f56390, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f56377.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f56377.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.f56377.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f56377.getColorFilter();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Bitmap m40663() {
        Bitmap bitmap = this.f56386;
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), bitmap.isMutable());
        bitmapCopy.setHasAlpha(bitmap.hasAlpha());
        return bitmapCopy;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private PorterDuffColorFilter m40654(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f56384 = colorStateList;
        this.f56392 = m40654(colorStateList, this.f56389);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f56389 = mode;
        this.f56392 = m40654(this.f56384, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f56384;
        if (colorStateList == null || (mode = this.f56389) == null) {
            return false;
        }
        this.f56392 = m40654(colorStateList, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f56384;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!this.f56380) {
            if (z) {
                if (z2) {
                    m40655();
                }
                if (visible) {
                    start();
                    return visible;
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m40659() {
        return this.f56376.m56817();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m40660() {
        return this.f56376.m56814();
    }
}
