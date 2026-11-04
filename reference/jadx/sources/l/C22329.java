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
import android.os.Message;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.᩷᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35IJ */
/* JADX INFO: loaded from: classes.dex */
public final class C22329 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Canvas f72275;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f72276;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f72277;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Bitmap f72278;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Paint f72280;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f72281;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15688 f72282;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f72283;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f72284;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f72285;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C24132 f72286;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f72287;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f72288;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f72290;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f72291;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C10247 f72292;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C20528 f72273 = new C20528(1);

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final int f72274 = C6907.m19160(2.5f);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static boolean f72272 = true;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f72289 = true;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HandlerC13547 f72279 = new HandlerC13547(this, new InterfaceC6836() { // from class: l.۬ۙᩴ
        @Override // l.InterfaceC6836
        /* JADX INFO: renamed from: ۙ */
        public final void mo14768(Object obj, Message message) {
            C22329.m50394(this.f43268, (C22329) obj);
        }
    });

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50394(C22329 c22329, final C22329 c223210) {
        Window window;
        final int i = c22329.f72290;
        final int i2 = c22329.f72287;
        C24132 c24132 = c223210.f72286;
        if (!c24132.isAttachedToWindow() || c223210.f72277) {
            return;
        }
        final View rootView = c24132.getRootView();
        if (Build.VERSION.SDK_INT < 28) {
            c223210.m50392(rootView, i, i2);
            return;
        }
        if (f72272) {
            try {
                Field declaredField = rootView.getClass().getDeclaredField("mWindow");
                declaredField.setAccessible(true);
                window = (Window) declaredField.get(rootView);
            } catch (Exception unused) {
                f72272 = false;
                window = null;
            }
        } else {
            window = null;
        }
        if (window == null) {
            c223210.m50392(rootView, i, i2);
            return;
        }
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        Bitmap bitmapCreateBitmap = (Bitmap) f72273.m47061();
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != width || bitmapCreateBitmap.getHeight() != height) {
            if (bitmapCreateBitmap != null) {
                bitmapCreateBitmap.recycle();
            }
            bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        } else {
            bitmapCreateBitmap.eraseColor(0);
        }
        final Bitmap bitmap = bitmapCreateBitmap;
        PixelCopy.request(window, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: l.ۙ᩷ᩴ
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i3) {
                C22329.m50393(this.f18073, bitmap, i, i2, rootView, i3);
            }
        }, C21576.m49077());
    }

    public C22329(C24132 c24132) {
        Paint paint = new Paint(1);
        this.f72280 = paint;
        this.f72286 = c24132;
        Context context = c24132.getContext();
        this.f72291 = C23434.m52632(context.getTheme(), R.attr.windowBackground);
        paint.setColor(-65536);
        C10247 c10247 = new C10247(context, null, bin.mt.plus.R.attr.MT_Protector);
        this.f72292 = c10247;
        int iM19160 = C6907.m19160(90.0f);
        this.f72284 = iM19160;
        int iM19161 = C6907.m19160(35.0f);
        this.f72283 = iM19161;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (iM19160 * 1.5f), (int) (iM19161 * 1.5f), Bitmap.Config.ARGB_8888);
        this.f72278 = bitmapCreateBitmap;
        this.f72275 = new Canvas(bitmapCreateBitmap);
        this.f72281 = C6907.m19160(110.0f);
        c10247.setBackgroundDrawable(context.getResources().getDrawable(C3296.m10871(bin.mt.plus.R.drawable.MT_Protector, bin.mt.plus.R.drawable.MT_Protector)));
        c10247.setWidth(-2);
        c10247.setHeight(-2);
        Rect rect = new Rect();
        c10247.getBackground().getPadding(rect);
        int i = rect.left;
        int i2 = iM19160 * 3;
        this.f72288 = (i2 / 4) + i;
        this.f72285 = (i2 / 2) + i + rect.right;
        c10247.setFocusable(false);
        c10247.setTouchable(true);
        c10247.setOutsideTouchable(true);
        c10247.setClippingEnabled(false);
        C15688 c15688 = new C15688(c24132.getContext());
        this.f72282 = c15688;
        c15688.setImageResource(bin.mt.plus.R.mipmap.MT_Protector);
        c10247.setContentView(c15688);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50396(float f) {
        this.f72289 = ((float) this.f72283) / f > 1.1f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50395() {
        C10247 c10247 = this.f72292;
        this.f72277 = true;
        this.f72279.removeMessages(0);
        try {
            if (c10247.isShowing()) {
                c10247.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50397(int i, int i2, int i3) {
        if (this.f72289) {
            if (this.f72277) {
                this.f72277 = false;
            }
            this.f72276 = i3;
            this.f72290 = i;
            this.f72287 = i2;
            HandlerC13547 handlerC13547 = this.f72279;
            if (handlerC13547.hasMessages(0)) {
                return;
            }
            C24132 c24132 = this.f72286;
            if (c24132.f78075) {
                if (c24132.f78015 <= f72274) {
                    handlerC13547.sendEmptyMessageDelayed(0, 10L);
                    return;
                } else {
                    handlerC13547.sendEmptyMessageDelayed(0, 50L);
                    return;
                }
            }
            handlerC13547.sendEmptyMessage(0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50393(C22329 c22329, Bitmap bitmap, int i, int i2, View view, int i3) {
        boolean z = c22329.f72277;
        C20528 c20528 = f72273;
        if (z) {
            if (c20528.m47060(bitmap)) {
                return;
            }
            bitmap.recycle();
        } else {
            if (i3 == 0) {
                c22329.m50391(bitmap, i, i2);
            } else {
                c22329.m50392(view, i, i2);
            }
            if (c20528.m47060(bitmap)) {
                return;
            }
            bitmap.recycle();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50392(View view, int i, int i2) {
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            view.setDrawingCacheEnabled(false);
        } else {
            m50391(drawingCache, i, i2);
            view.setDrawingCacheEnabled(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50391(Bitmap bitmap, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        C10247 c10247 = this.f72292;
        C24132 c24132 = this.f72286;
        View rootView = c24132.getRootView();
        int i7 = this.f72284;
        int i8 = i - (i7 / 2);
        int i9 = this.f72283;
        int height = i2 - (i9 / 2);
        if (rootView != c24132) {
            int[] iArr = new int[2];
            c24132.getLocationInWindow(iArr);
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
        Bitmap bitmap2 = this.f72278;
        bitmap2.eraseColor(0);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight());
        Paint paint = this.f72280;
        paint.setXfermode(null);
        Canvas canvas = this.f72275;
        canvas.drawRoundRect(rectF, 6.0f, 6.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.save();
        canvas.scale(1.5f, 1.5f);
        if (i5 != 0) {
            int color = paint.getColor();
            paint.setColor(this.f72291);
            canvas.drawRect(0.0f, 0.0f, i7, i9, paint);
            paint.setColor(color);
            canvas.drawBitmap(bitmapCreateBitmap, i5 < 0 ? -i5 : 0.0f, 0.0f, paint);
        } else {
            canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
        }
        canvas.restore();
        bitmapCreateBitmap.recycle();
        int width3 = i3 - this.f72288;
        int i14 = i4 - this.f72281;
        if (width3 < 0) {
            width3 = (width3 * 3) / 4;
        } else {
            int width4 = rootView.getWidth();
            int i15 = this.f72285;
            if (width3 > width4 - i15) {
                width3 += ((rootView.getWidth() - i15) - width3) / 4;
            }
        }
        this.f72282.setImageBitmap(bitmap2);
        try {
            if (c10247.isShowing()) {
                c10247.update(width3, i14 + this.f72276, c10247.getWidth(), c10247.getHeight());
            } else {
                c10247.showAtLocation(rootView, 8388659, width3, i14 + this.f72276);
            }
        } catch (Exception unused) {
        }
    }
}
