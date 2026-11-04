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

/* JADX INFO: renamed from: l.ۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4YL */
/* JADX INFO: loaded from: classes3.dex */
public final class C2615 implements InterfaceC22138 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f8397 = {R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] f8399 = {R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f8400 = {R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f8396 = {R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f8398 = {R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f8401 = {R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector, R.drawable.MT_Protector};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ColorStateList m8754(Context context, int i) {
        if (i == R.drawable.MT_Protector) {
            return C7508.m20564(context, R.color.MT_Protector);
        }
        if (i == R.drawable.MT_Protector) {
            return C7508.m20564(context, R.color.MT_Protector);
        }
        if (i != R.drawable.MT_Protector) {
            if (i == R.drawable.MT_Protector) {
                return m8752(context, C9457.m24833(context, R.attr.MT_Protector));
            }
            if (i == R.drawable.MT_Protector) {
                return m8752(context, 0);
            }
            if (i == R.drawable.MT_Protector) {
                return m8752(context, C9457.m24833(context, R.attr.MT_Protector));
            }
            if (i == R.drawable.MT_Protector || i == R.drawable.MT_Protector) {
                return C7508.m20564(context, R.color.MT_Protector);
            }
            if (m8751(i, this.f8399)) {
                return C9457.m24832(context, R.attr.MT_Protector);
            }
            if (m8751(i, this.f8398)) {
                return C7508.m20564(context, R.color.MT_Protector);
            }
            if (m8751(i, this.f8401)) {
                return C7508.m20564(context, R.color.MT_Protector);
            }
            if (i == R.drawable.MT_Protector) {
                return C7508.m20564(context, R.color.MT_Protector);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListM24832 = C9457.m24832(context, R.attr.MT_Protector);
        if (colorStateListM24832 != null && colorStateListM24832.isStateful()) {
            int[] iArr3 = C9457.f30662;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListM24832.getColorForState(iArr3, 0);
            iArr[1] = C9457.f30657;
            iArr2[1] = C9457.m24833(context, R.attr.MT_Protector);
            iArr[2] = C9457.f30658;
            iArr2[2] = colorStateListM24832.getDefaultColor();
        } else {
            iArr[0] = C9457.f30662;
            iArr2[0] = C9457.m24830(context, R.attr.MT_Protector);
            iArr[1] = C9457.f30657;
            iArr2[1] = C9457.m24833(context, R.attr.MT_Protector);
            iArr[2] = C9457.f30658;
            iArr2[2] = C9457.m24833(context, R.attr.MT_Protector);
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ColorStateList m8752(Context context, int i) {
        int iM24833 = C9457.m24833(context, R.attr.MT_Protector);
        return new ColorStateList(new int[][]{C9457.f30662, C9457.f30661, C9457.f30663, C9457.f30658}, new int[]{C9457.m24830(context, R.attr.MT_Protector), C19988.m45966(iM24833, i), C19988.m45966(iM24833, i), i});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LayerDrawable m8755(C22884 c22884, Context context, int i) {
        if (i == R.drawable.MT_Protector) {
            return new LayerDrawable(new Drawable[]{c22884.m51616(context, R.drawable.MT_Protector), c22884.m51616(context, R.drawable.MT_Protector)});
        }
        if (i == R.drawable.MT_Protector) {
            return m8753(c22884, context, R.dimen.MT_Protector);
        }
        if (i == R.drawable.MT_Protector) {
            return m8753(c22884, context, R.dimen.MT_Protector);
        }
        if (i == R.drawable.MT_Protector) {
            return m8753(c22884, context, R.dimen.MT_Protector);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static LayerDrawable m8753(C22884 c22884, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableM51616 = c22884.m51616(context, R.drawable.MT_Protector);
        Drawable drawableM51617 = c22884.m51616(context, R.drawable.MT_Protector);
        if ((drawableM51616 instanceof BitmapDrawable) && drawableM51616.getIntrinsicWidth() == dimensionPixelSize && drawableM51616.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableM51616;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM51616.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM51616.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableM51617 instanceof BitmapDrawable) && drawableM51617.getIntrinsicWidth() == dimensionPixelSize && drawableM51617.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableM51617;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableM51617.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableM51617.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8750(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = C8581.f28058;
        }
        drawableMutate.setColorFilter(C8581.m23069(i, mode));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m8756(Context context, int i, Drawable drawable) {
        if (i == R.drawable.MT_Protector) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            m8750(layerDrawable.findDrawableByLayerId(android.R.id.background), C9457.m24833(context, R.attr.MT_Protector), C8581.f28058);
            m8750(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), C9457.m24833(context, R.attr.MT_Protector), C8581.f28058);
            m8750(layerDrawable.findDrawableByLayerId(android.R.id.progress), C9457.m24833(context, R.attr.MT_Protector), C8581.f28058);
            return true;
        }
        if (i != R.drawable.MT_Protector && i != R.drawable.MT_Protector && i != R.drawable.MT_Protector) {
            return false;
        }
        LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
        m8750(layerDrawable2.findDrawableByLayerId(android.R.id.background), C9457.m24830(context, R.attr.MT_Protector), C8581.f28058);
        m8750(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), C9457.m24833(context, R.attr.MT_Protector), C8581.f28058);
        m8750(layerDrawable2.findDrawableByLayerId(android.R.id.progress), C9457.m24833(context, R.attr.MT_Protector), C8581.f28058);
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m8751(int i, int[] iArr) {
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
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m8757(Context context, int i, Drawable drawable) {
        int i2;
        int iRound;
        boolean z;
        int i3;
        Drawable drawableMutate;
        PorterDuff.Mode mode = C8581.f28058;
        if (m8751(i, this.f8397)) {
            i3 = R.attr.MT_Protector;
        } else if (m8751(i, this.f8400)) {
            i3 = R.attr.MT_Protector;
        } else {
            if (!m8751(i, this.f8396)) {
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
                drawableMutate.setColorFilter(C8581.m23069(C9457.m24833(context, i2), mode));
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
        drawableMutate.setColorFilter(C8581.m23069(C9457.m24833(context, i2), mode));
        if (iRound != -1) {
            drawableMutate.setAlpha(iRound);
        }
        return true;
    }
}
