package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۨ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: J4YO */
/* JADX INFO: loaded from: classes3.dex */
public final class C12004 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ImageView f40229;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C23851 f40230;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C23851 f40231;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f40232 = 0;

    public C12004(ImageView imageView) {
        this.f40229 = imageView;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29900(AttributeSet attributeSet, int i) {
        int iM6387;
        ImageView imageView = this.f40229;
        Context context = imageView.getContext();
        int[] iArr = C12108.f40512;
        C1977 c1977M6353 = C1977.m6353(context, attributeSet, iArr, i, 0);
        C5031.m13983(imageView, imageView.getContext(), iArr, attributeSet, c1977M6353.m6382(), i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (iM6387 = c1977M6353.m6387(1, -1)) != -1 && (drawable = C15945.m37904(imageView.getContext(), iM6387)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C20946.m47120(drawable);
            }
            if (c1977M6353.m6383(2)) {
                C3705.m10875(imageView, c1977M6353.m6385(2));
            }
            if (c1977M6353.m6383(3)) {
                C3705.m10876(imageView, C20946.m47119(c1977M6353.m6381(3, -1), null));
            }
        } finally {
            c1977M6353.m6379();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29896(int i) {
        ImageView imageView = this.f40229;
        if (i != 0) {
            Drawable drawableM37904 = C15945.m37904(imageView.getContext(), i);
            if (drawableM37904 != null) {
                C20946.m47120(drawableM37904);
            }
            imageView.setImageDrawable(drawableM37904);
        } else {
            imageView.setImageDrawable(null);
        }
        m29903();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m29901() {
        return !(this.f40229.getBackground() instanceof RippleDrawable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29897(ColorStateList colorStateList) {
        if (this.f40230 == null) {
            this.f40230 = new C23851();
        }
        C23851 c23851 = this.f40230;
        c23851.f77107 = colorStateList;
        c23851.f77106 = true;
        m29903();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ColorStateList m29902() {
        C23851 c23851 = this.f40230;
        if (c23851 != null) {
            return c23851.f77107;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29898(PorterDuff.Mode mode) {
        if (this.f40230 == null) {
            this.f40230 = new C23851();
        }
        C23851 c23851 = this.f40230;
        c23851.f77105 = mode;
        c23851.f77108 = true;
        m29903();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final PorterDuff.Mode m29894() {
        C23851 c23851 = this.f40230;
        if (c23851 != null) {
            return c23851.f77105;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m29903() {
        ImageView imageView = this.f40229;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            C20946.m47120(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 && i == 21) {
                if (this.f40231 == null) {
                    this.f40231 = new C23851();
                }
                C23851 c23851 = this.f40231;
                c23851.f77107 = null;
                c23851.f77106 = false;
                c23851.f77105 = null;
                c23851.f77108 = false;
                ColorStateList colorStateListM10874 = C3705.m10874(imageView);
                if (colorStateListM10874 != null) {
                    c23851.f77106 = true;
                    c23851.f77107 = colorStateListM10874;
                }
                PorterDuff.Mode modeM10877 = C3705.m10877(imageView);
                if (modeM10877 != null) {
                    c23851.f77108 = true;
                    c23851.f77105 = modeM10877;
                }
                if (c23851.f77106 || c23851.f77108) {
                    int[] drawableState = imageView.getDrawableState();
                    int i2 = C23521.f76123;
                    C4800.m13325(drawable, c23851, drawableState);
                    return;
                }
            }
            C23851 c23852 = this.f40230;
            if (c23852 != null) {
                int[] drawableState2 = imageView.getDrawableState();
                int i3 = C23521.f76123;
                C4800.m13325(drawable, c23852, drawableState2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29899(Drawable drawable) {
        this.f40232 = drawable.getLevel();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29895() {
        ImageView imageView = this.f40229;
        if (imageView.getDrawable() != null) {
            imageView.getDrawable().setLevel(this.f40232);
        }
    }
}
