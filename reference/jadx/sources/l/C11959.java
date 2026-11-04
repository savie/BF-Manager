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

/* JADX INFO: renamed from: l.ۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: F5X2 */
/* JADX INFO: loaded from: classes3.dex */
public class C11959 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int[] f38504 = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Bitmap f38505;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbsSeekBar f38506;

    public C11959(AbsSeekBar absSeekBar) {
        this.f38506 = absSeekBar;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo29937(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = this.f38506;
        C5204 c5204M15649 = C5204.m15649(absSeekBar.getContext(), attributeSet, f38504, i, 0);
        Drawable drawableM15663 = c5204M15649.m15663(0);
        if (drawableM15663 != null) {
            if (drawableM15663 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableM15663;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableM29936 = m29936(animationDrawable.getFrame(i2), true);
                    drawableM29936.setLevel(10000);
                    animationDrawable2.addFrame(drawableM29936, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableM15663 = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableM15663);
        }
        Drawable drawableM15664 = c5204M15649.m15663(1);
        if (drawableM15664 != null) {
            absSeekBar.setProgressDrawable(m29936(drawableM15664, false));
        }
        c5204M15649.m15664();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Drawable m29936(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC7309) {
            InterfaceC7309 interfaceC7309 = (InterfaceC7309) drawable;
            Drawable drawableMo20015 = interfaceC7309.mo20015();
            if (drawableMo20015 != null) {
                interfaceC7309.mo20016(m29936(drawableMo20015, z));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m29936(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    if (Build.VERSION.SDK_INT >= 23) {
                        C2265.m7691(layerDrawable, layerDrawable2, i2);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f38505 == null) {
                    this.f38505 = bitmap;
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
    public final Bitmap m29935() {
        return this.f38505;
    }
}
