package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4YL */
/* JADX INFO: loaded from: classes4.dex */
public final class C10821 implements InterfaceC9845 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f36851 = {R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f36850 = {R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f36852 = {R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f36849 = {R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f36853 = {R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f36848 = {R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ColorStateList m27131(Context context, int i) {
        if (i == R.drawable.MT_Protector) {
            return C10405.m26305(context, R.color.MT_Protector);
        }
        if (i == R.drawable.MT_Protector) {
            return C10405.m26305(context, R.color.MT_Protector);
        }
        if (i != R.drawable.MT_Protector) {
            if (i == R.drawable.MT_Protector) {
                return m27129(context, C17500.m40764(context, R.attr.MT_Protector));
            }
            if (i == R.drawable.MT_Protector) {
                return m27129(context, 0);
            }
            if (i == R.drawable.MT_Protector) {
                return m27129(context, C17500.m40764(context, R.attr.MT_Protector));
            }
            if (i == R.drawable.MT_Protector || i == R.drawable.MT_Protector) {
                return C10405.m26305(context, R.color.MT_Protector);
            }
            if (m27128(i, this.f36850)) {
                return C17500.m40763(context, R.attr.MT_Protector);
            }
            if (m27128(i, this.f36853)) {
                return C10405.m26305(context, R.color.MT_Protector);
            }
            if (m27128(i, this.f36848)) {
                return C10405.m26305(context, R.color.MT_Protector);
            }
            if (i == R.drawable.MT_Protector) {
                return C10405.m26305(context, R.color.MT_Protector);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM40763 = C17500.m40763(context, R.attr.MT_Protector);
        if (colorStateListM40763 != null && colorStateListM40763.isStateful()) {
            int[] iArr3 = C17500.f55661;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM40763.getColorForState(iArr3, 0);
            iArr[1] = C17500.f55658;
            iArr2[1] = C17500.m40764(context, R.attr.MT_Protector);
            iArr[2] = C17500.f55660;
            iArr2[2] = colorStateListM40763.getDefaultColor();
        } else {
            iArr[0] = C17500.f55661;
            iArr2[0] = C17500.m40761(context, R.attr.MT_Protector);
            iArr[1] = C17500.f55658;
            iArr2[1] = C17500.m40764(context, R.attr.MT_Protector);
            iArr[2] = C17500.f55660;
            iArr2[2] = C17500.m40764(context, R.attr.MT_Protector);
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m27129(Context context, int i) {
        int iM40764 = C17500.m40764(context, R.attr.MT_Protector);
        return new ColorStateList(new int[][]{C17500.f55661, C17500.f55659, C17500.f55657, C17500.f55660}, new int[]{C17500.m40761(context, R.attr.MT_Protector), C3224.m9670(iM40764, i), C3224.m9670(iM40764, i), i});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LayerDrawable m27132(C4800 c4800, Context context, int i) {
        if (i == R.drawable.MT_Protector) {
            return new LayerDrawable(new Drawable[]{c4800.m13329(context, R.drawable.MT_Protector), c4800.m13329(context, R.drawable.MT_Protector)});
        }
        if (i == R.drawable.MT_Protector) {
            return m27130(c4800, context, R.dimen.MT_Protector);
        }
        if (i == R.drawable.MT_Protector) {
            return m27130(c4800, context, R.dimen.MT_Protector);
        }
        if (i == R.drawable.MT_Protector) {
            return m27130(c4800, context, R.dimen.MT_Protector);
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static LayerDrawable m27130(C4800 c4800, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM13329 = c4800.m13329(context, R.drawable.MT_Protector);
        Drawable drawableM133210 = c4800.m13329(context, R.drawable.MT_Protector);
        if ((drawableM13329 instanceof BitmapDrawable) && drawableM13329.getIntrinsicWidth() == dimensionPixelSize && drawableM13329.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM13329;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM13329.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM13329.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM133210 instanceof BitmapDrawable) && drawableM133210.getIntrinsicWidth() == dimensionPixelSize && drawableM133210.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM133210;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM133210.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM133210.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27127(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C23521.f76122;
        }
        drawableMutate.setColorFilter(C23521.m51801(i, mode));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27133(Context context, int i, Drawable drawable) {
        if (i == R.drawable.MT_Protector) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            m27127(layerDrawable.findDrawableByLayerId(android.R.id.background), C17500.m40764(context, R.attr.MT_Protector), C23521.f76122);
            m27127(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), C17500.m40764(context, R.attr.MT_Protector), C23521.f76122);
            m27127(layerDrawable.findDrawableByLayerId(android.R.id.progress), C17500.m40764(context, R.attr.MT_Protector), C23521.f76122);
            return true;
        }
        if (i != R.drawable.MT_Protector && i != R.drawable.MT_Protector && i != R.drawable.MT_Protector) {
            return false;
        }
        LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
        m27127(layerDrawable2.findDrawableByLayerId(android.R.id.background), C17500.m40761(context, R.attr.MT_Protector), C23521.f76122);
        m27127(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), C17500.m40764(context, R.attr.MT_Protector), C23521.f76122);
        m27127(layerDrawable2.findDrawableByLayerId(android.R.id.progress), C17500.m40764(context, R.attr.MT_Protector), C23521.f76122);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27128(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063 A[RETURN] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m27134(Context context, int i, Drawable drawable) {
        int i2;
        int iRound;
        boolean z;
        int i3;
        Drawable drawableMutate;
        PorterDuff.Mode mode = C23521.f76122;
        if (m27128(i, this.f36851)) {
            i3 = R.attr.MT_Protector;
        } else if (m27128(i, this.f36852)) {
            i3 = R.attr.MT_Protector;
        } else {
            if (!m27128(i, this.f36849)) {
                if (i == R.drawable.MT_Protector) {
                    iRound = Math.round(40.8f);
                    z = true;
                    i2 = android.R.attr.colorForeground;
                } else if (i != R.drawable.MT_Protector) {
                    i2 = 0;
                    iRound = -1;
                    z = false;
                }
                if (z) {
                    return false;
                }
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(C23521.m51801(C17500.m40764(context, i2), mode));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                return true;
            }
            mode = PorterDuff.Mode.MULTIPLY;
            i3 = android.R.attr.colorBackground;
        }
        i2 = i3;
        iRound = -1;
        z = true;
        if (z) {
            return false;
        }
        drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(C23521.m51801(C17500.m40764(context, i2), mode));
        if (iRound != -1) {
            drawableMutate.setAlpha(iRound);
        }
        return true;
    }
}
