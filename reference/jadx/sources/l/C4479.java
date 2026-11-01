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

/* JADX INFO: renamed from: l.ۙۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5QW */
/* JADX INFO: loaded from: classes2.dex */
public class C4479 extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15930 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ScheduledThreadPoolExecutor f15931;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10831 f15932;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f15933;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f15934;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f15935;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f15936;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ConcurrentLinkedQueue f15937;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f15938;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final GifInfoHandle f15939;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public ColorStateList f15940;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f15941;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final Rect f15942;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Paint f15943;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Bitmap f15944;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HandlerC12242 f15945;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile boolean f15946;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Rect f15947;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f15948;

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

    public C4479(Resources resources, int i) {
        this(new GifInfoHandle(resources.openRawResourceFd(i)), null, true);
        List list = C7302.f24237;
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
        this.f15934 = (int) (this.f15939.m52922() * f);
        this.f15935 = (int) (this.f15939.m52917() * f);
    }

    public C4479(byte[] bArr) {
        this(new GifInfoHandle(bArr), null, true);
    }

    public C4479(ContentResolver contentResolver, Uri uri) throws IOException {
        GifInfoHandle gifInfoHandle;
        int i = GifInfoHandle.f77903;
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

    public C4479(GifInfoHandle gifInfoHandle, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z) {
        this.f15946 = true;
        this.f15948 = Long.MIN_VALUE;
        this.f15947 = new Rect();
        this.f15943 = new Paint(6);
        this.f15937 = new ConcurrentLinkedQueue();
        C10831 c10831 = new C10831(this);
        this.f15932 = c10831;
        this.f15941 = z;
        if (scheduledThreadPoolExecutor == null) {
            int i = C6596.f22217;
            scheduledThreadPoolExecutor = C3773.f13638;
        }
        this.f15931 = scheduledThreadPoolExecutor;
        this.f15939 = gifInfoHandle;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gifInfoHandle.m52917(), gifInfoHandle.m52922(), Bitmap.Config.ARGB_8888);
        this.f15944 = bitmapCreateBitmap;
        bitmapCreateBitmap.setHasAlpha(!gifInfoHandle.m52918());
        this.f15942 = new Rect(0, 0, gifInfoHandle.m52917(), gifInfoHandle.m52922());
        this.f15945 = new HandlerC12242(this);
        c10831.mo8900();
        this.f15935 = gifInfoHandle.m52917();
        this.f15934 = gifInfoHandle.m52922();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m12506() {
        this.f15946 = false;
        this.f15945.removeMessages(-1);
        this.f15939.m52920();
        this.f15944.recycle();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        if (this.f15941 && this.f15946) {
            long j = this.f15948;
            if (j != Long.MIN_VALUE) {
                long jMax = Math.max(0L, j - SystemClock.uptimeMillis());
                this.f15948 = Long.MIN_VALUE;
                this.f15931.remove(this.f15932);
                this.f15938 = this.f15931.schedule(this.f15932, jMax, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f15934;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f15935;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f15943.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15943.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return (!this.f15939.m52918() || this.f15943.getAlpha() < 255) ? -2 : -1;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public final void start() {
        synchronized (this) {
            if (this.f15946) {
                return;
            }
            this.f15946 = true;
            m12503(this.f15939.m52913());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12503(long j) {
        boolean z = this.f15941;
        HandlerC12242 handlerC12242 = this.f15945;
        if (z) {
            this.f15948 = 0L;
            handlerC12242.sendEmptyMessageAtTime(-1, 0L);
            return;
        }
        ScheduledFuture scheduledFuture = this.f15938;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        handlerC12242.removeMessages(-1);
        this.f15938 = this.f15931.schedule(this.f15932, Math.max(j, 0L), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m12501() {
        this.f15931.execute(new C9337(this, this));
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        synchronized (this) {
            if (this.f15946) {
                this.f15946 = false;
                ScheduledFuture scheduledFuture = this.f15938;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f15945.removeMessages(-1);
                this.f15939.m52910();
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f15946;
    }

    public final String toString() {
        Locale locale = Locale.ENGLISH;
        GifInfoHandle gifInfoHandle = this.f15939;
        int iM52917 = gifInfoHandle.m52917();
        int iM52922 = gifInfoHandle.m52922();
        int iM52909 = gifInfoHandle.m52909();
        int iM52899 = gifInfoHandle.m52899();
        StringBuilder sbM2791 = C0589.m2791("GIF: size: ", iM52917, "x", ", frames: ", iM52922);
        sbM2791.append(iM52909);
        sbM2791.append(", error: ");
        sbM2791.append(iM52899);
        return sbM2791.toString();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return this.f15939.m52909() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return this.f15939.m52909() > 1;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m12508() {
        return this.f15939.m52909();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC2362 m12500() {
        return EnumC2362.m7181(this.f15939.m52899());
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        stop();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.f15939.m52908();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.f15939.m52898();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        this.f15931.execute(new C2985(this, this, i));
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        return this.f15946;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m12502() {
        return this.f15939.m52901() + ((long) this.f15944.getAllocationByteCount());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m12504() {
        return this.f15939.m52915();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f15947.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        PorterDuffColorFilter porterDuffColorFilter = this.f15933;
        Paint paint = this.f15943;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f15933);
            z = true;
        }
        canvas.drawBitmap(this.f15944, this.f15942, this.f15947, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f15943.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f15943.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.f15943.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f15943.getColorFilter();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Bitmap m12507() {
        Bitmap bitmap = this.f15944;
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), bitmap.isMutable());
        bitmapCopy.setHasAlpha(bitmap.hasAlpha());
        return bitmapCopy;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private PorterDuffColorFilter m12498(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f15940 = colorStateList;
        this.f15933 = m12498(colorStateList, this.f15936);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f15936 = mode;
        this.f15933 = m12498(this.f15940, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f15940;
        if (colorStateList == null || (mode = this.f15936) == null) {
            return false;
        }
        this.f15933 = m12498(colorStateList, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f15940;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!this.f15941) {
            if (z) {
                if (z2) {
                    m12501();
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m12505() {
        return this.f15939.m52916();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m12499() {
        return this.f15939.m52921();
    }
}
