package l;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.᩺ۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35IJ */
/* JADX INFO: loaded from: classes.dex */
public final class C22714 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C2830 f73978;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f73979;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Canvas f73980;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f73981;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f73982;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Paint f73983;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f73984;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f73985;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Bitmap f73987;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f73989;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f73990;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f73991;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f73992;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C6111 f73993;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f73994;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C16900 f73995;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C19805 f73976 = new C19805(1);

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final int f73975 = C13932.m33769(2.5f);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f73977 = true;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f73988 = true;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public HandlerC10184 f73986 = new HandlerC10184(this, new C4327(this));

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50346(C22714 c22714, final C22714 c22715) {
        Window window;
        final int i = c22714.f73979;
        final int i2 = c22714.f73982;
        C6111 c6111 = c22715.f73993;
        if (!c6111.isAttachedToWindow() || c22715.f73981) {
            return;
        }
        final View rootView = c6111.getRootView();
        if (Build.VERSION.SDK_INT < 28) {
            c22715.m50344(rootView, i, i2);
            return;
        }
        if (f73977) {
            try {
                Field declaredField = rootView.getClass().getDeclaredField("mWindow");
                declaredField.setAccessible(true);
                window = (Window) declaredField.get(rootView);
            } catch (Exception unused) {
                f73977 = false;
                window = null;
            }
        } else {
            window = null;
        }
        if (window == null) {
            c22715.m50344(rootView, i, i2);
            return;
        }
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        Bitmap bitmapCreateBitmap = (Bitmap) f73976.m45009();
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != width || bitmapCreateBitmap.getHeight() != height) {
            if (bitmapCreateBitmap != null) {
                bitmapCreateBitmap.recycle();
            }
            bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        } else {
            bitmapCreateBitmap.eraseColor(0);
        }
        final Bitmap bitmap = bitmapCreateBitmap;
        PixelCopy.request(window, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: l.ۜۗۖ
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i3) {
                C22714.m50345(this.f21877, bitmap, i, i2, rootView, i3);
            }
        }, C16737.m39278());
    }

    public C22714(C6111 c6111) {
        Paint paint = new Paint(1);
        this.f73983 = paint;
        this.f73993 = c6111;
        Context context = c6111.getContext();
        this.f73991 = C16135.m38193(context.getTheme(), R.attr.windowBackground);
        paint.setColor(-65536);
        C16900 c16900 = new C16900(context, null, bin.mt.plus.R.attr.MT_Protector);
        this.f73995 = c16900;
        int iM33769 = C13932.m33769(90.0f);
        this.f73990 = iM33769;
        int iM337610 = C13932.m33769(35.0f);
        this.f73994 = iM337610;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (iM33769 * 1.5f), (int) (iM337610 * 1.5f), Bitmap.Config.ARGB_8888);
        this.f73987 = bitmapCreateBitmap;
        this.f73980 = new Canvas(bitmapCreateBitmap);
        this.f73985 = C13932.m33769(110.0f);
        c16900.setBackgroundDrawable(context.getResources().getDrawable(C20368.m45983(bin.mt.plus.R.drawable.MT_Protector, bin.mt.plus.R.drawable.MT_Protector)));
        c16900.setWidth(-2);
        c16900.setHeight(-2);
        Rect rect = new Rect();
        c16900.getBackground().getPadding(rect);
        int i = rect.left;
        int i2 = iM33769 * 3;
        this.f73992 = (i2 / 4) + i;
        this.f73989 = (i2 / 2) + i + rect.right;
        c16900.setFocusable(false);
        c16900.setTouchable(true);
        c16900.setOutsideTouchable(true);
        c16900.setClippingEnabled(false);
        C2830 c2830 = new C2830(c6111.getContext());
        this.f73978 = c2830;
        c2830.setImageResource(bin.mt.plus.R.mipmap.MT_Protector);
        c16900.setContentView(c2830);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50348(float f) {
        this.f73988 = ((float) this.f73994) / f > 1.1f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50347() {
        C16900 c16900 = this.f73995;
        this.f73981 = true;
        this.f73986.removeMessages(0);
        try {
            if (c16900.isShowing()) {
                c16900.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50349(int i, int i2, int i3) {
        if (this.f73988) {
            if (this.f73981) {
                this.f73981 = false;
            }
            this.f73984 = i3;
            this.f73979 = i;
            this.f73982 = i2;
            HandlerC10184 handlerC10184 = this.f73986;
            if (handlerC10184.hasMessages(0)) {
                return;
            }
            C6111 c6111 = this.f73993;
            if (c6111.f20845) {
                if (c6111.f20766 <= f73975) {
                    handlerC10184.sendEmptyMessageDelayed(0, 10L);
                    return;
                } else {
                    handlerC10184.sendEmptyMessageDelayed(0, 50L);
                    return;
                }
            }
            handlerC10184.sendEmptyMessage(0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50345(C22714 c22714, Bitmap bitmap, int i, int i2, View view, int i3) {
        boolean z = c22714.f73981;
        C19805 c19805 = f73976;
        if (z) {
            if (c19805.m45011(bitmap)) {
                return;
            }
            bitmap.recycle();
        } else {
            if (i3 == 0) {
                c22714.m50343(bitmap, i, i2);
            } else {
                c22714.m50344(view, i, i2);
            }
            if (c19805.m45011(bitmap)) {
                return;
            }
            bitmap.recycle();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50344(View view, int i, int i2) {
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            view.setDrawingCacheEnabled(false);
        } else {
            m50343(drawingCache, i, i2);
            view.setDrawingCacheEnabled(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50343(Bitmap bitmap, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        C16900 c16900 = this.f73995;
        C6111 c6111 = this.f73993;
        View rootView = c6111.getRootView();
        int i7 = this.f73990;
        int i8 = i - (i7 / 2);
        int i9 = this.f73994;
        int height = i2 - (i9 / 2);
        if (rootView != c6111) {
            int[] iArr = new int[2];
            c6111.getLocationInWindow(iArr);
            int i10 = iArr[0];
            i8 += i10;
            int i11 = iArr[1];
            height += i11;
            i3 = i + i10;
            i4 = i2 + i11;
        } else {
            i3 = i;
            i4 = i2;
        }
        if (i8 < 0) {
            i6 = i7 + i8;
            i5 = i8;
            i8 = 0;
        } else {
            int i12 = i8 + i7;
            if (i12 > bitmap.getWidth()) {
                int width = i12 - bitmap.getWidth();
                int i13 = i7 - width;
                int width2 = bitmap.getWidth() - i13;
                i5 = width;
                i8 = width2;
                i6 = i13;
            } else {
                i5 = 0;
                i6 = i7;
            }
        }
        if (height < 0) {
            height = 0;
        } else if (height + i9 > bitmap.getHeight()) {
            height = bitmap.getHeight() - i9;
        }
        if (i6 <= 0 || i9 <= 0) {
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i8, height, i6, i9);
        Bitmap bitmap2 = this.f73987;
        bitmap2.eraseColor(0);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight());
        Paint paint = this.f73983;
        paint.setXfermode(null);
        Canvas canvas = this.f73980;
        canvas.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.save();
        canvas.scale(1.5f, 1.5f);
        if (i5 != 0) {
            int color = paint.getColor();
            paint.setColor(this.f73991);
            canvas.drawRect(0.0f, 0.0f, i7, i9, paint);
            paint.setColor(color);
            canvas.drawBitmap(bitmapCreateBitmap, i5 < 0 ? -i5 : 0.0f, 0.0f, paint);
        } else {
            canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
        }
        canvas.restore();
        bitmapCreateBitmap.recycle();
        int width3 = i3 - this.f73992;
        int i14 = i4 - this.f73985;
        if (width3 < 0) {
            width3 = (width3 * 3) / 4;
        } else {
            int width4 = rootView.getWidth();
            int i15 = this.f73989;
            if (width3 > width4 - i15) {
                width3 += ((rootView.getWidth() - i15) - width3) / 4;
            }
        }
        this.f73978.setImageBitmap(bitmap2);
        try {
            if (c16900.isShowing()) {
                c16900.update(width3, i14 + this.f73984, c16900.getWidth(), c16900.getHeight());
            } else {
                c16900.showAtLocation(rootView, 8388659, width3, i14 + this.f73984);
            }
        } catch (Exception unused) {
        }
    }
}
