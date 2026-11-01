package l;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;

/* JADX INFO: renamed from: l.۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F5X2 */
/* JADX INFO: loaded from: classes3.dex */
public class C13415 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int[] f44374 = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f44375;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbsSeekBar f44376;

    public C13415(AbsSeekBar absSeekBar) {
        this.f44376 = absSeekBar;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo32902(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = this.f44376;
        C1977 c1977M6353 = C1977.m6353(absSeekBar.getContext(), attributeSet, f44374, i, 0);
        Drawable drawableM6378 = c1977M6353.m6378(0);
        if (drawableM6378 != null) {
            if (drawableM6378 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableM6378;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableM32901 = m32901(animationDrawable.getFrame(i2), true);
                    drawableM32901.setLevel(10000);
                    animationDrawable2.addFrame(drawableM32901, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableM6378 = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableM6378);
        }
        Drawable drawableM6379 = c1977M6353.m6378(1);
        if (drawableM6379 != null) {
            absSeekBar.setProgressDrawable(m32901(drawableM6379, false));
        }
        c1977M6353.m6379();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable m32901(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC6191) {
            InterfaceC6191 interfaceC6191 = (InterfaceC6191) drawable;
            Drawable drawableMo17199 = interfaceC6191.mo17199();
            if (drawableMo17199 != null) {
                interfaceC6191.mo17200(m32901(drawableMo17199, z));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m32901(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    if (Build.VERSION.SDK_INT >= 23) {
                        C1419.m4965(layerDrawable, layerDrawable2, i2);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f44375 == null) {
                    this.f44375 = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap m32900() {
        return this.f44375;
    }
}
