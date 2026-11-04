package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J4YO */
/* JADX INFO: loaded from: classes5.dex */
public final class C20164 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7221 f64770;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C7221 f64771;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f64772 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ImageView f64773;

    public C20164(ImageView imageView) {
        this.f64773 = imageView;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46380(AttributeSet attributeSet, int i) {
        int iM15660;
        ImageView imageView = this.f64773;
        Context context = imageView.getContext();
        int[] iArr = C10401.f33070;
        C5204 c5204M15649 = C5204.m15649(context, attributeSet, iArr, i, 0);
        C22666.m51088(imageView, imageView.getContext(), iArr, attributeSet, c5204M15649.m15658(), i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (iM15660 = c5204M15649.m15660(1, -1)) != -1 && (drawable = C0385.m2186(imageView.getContext(), iM15660)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C21414.m48721(drawable);
            }
            if (c5204M15649.m15655(2)) {
                C12864.m31899(imageView, c5204M15649.m15666(2));
            }
            if (c5204M15649.m15655(3)) {
                C12864.m31900(imageView, C21414.m48720(c5204M15649.m15657(3, -1), null));
            }
        } finally {
            c5204M15649.m15664();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46376(int i) {
        ImageView imageView = this.f64773;
        if (i != 0) {
            Drawable drawableM2186 = C0385.m2186(imageView.getContext(), i);
            if (drawableM2186 != null) {
                C21414.m48721(drawableM2186);
            }
            imageView.setImageDrawable(drawableM2186);
        } else {
            imageView.setImageDrawable(null);
        }
        m46383();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m46382() {
        return !(this.f64773.getBackground() instanceof RippleDrawable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46377(ColorStateList colorStateList) {
        if (this.f64770 == null) {
            this.f64770 = new C7221();
        }
        C7221 c7221 = this.f64770;
        c7221.f23817 = colorStateList;
        c7221.f23816 = true;
        m46383();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ColorStateList m46381() {
        C7221 c7221 = this.f64770;
        if (c7221 != null) {
            return c7221.f23817;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46378(PorterDuff.Mode mode) {
        if (this.f64770 == null) {
            this.f64770 = new C7221();
        }
        C7221 c7221 = this.f64770;
        c7221.f23819 = mode;
        c7221.f23818 = true;
        m46383();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final PorterDuff.Mode m46384() {
        C7221 c7221 = this.f64770;
        if (c7221 != null) {
            return c7221.f23819;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46383() {
        ImageView imageView = this.f64773;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            C21414.m48721(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 && i == 21) {
                if (this.f64771 == null) {
                    this.f64771 = new C7221();
                }
                C7221 c7221 = this.f64771;
                c7221.f23817 = null;
                c7221.f23816 = false;
                c7221.f23819 = null;
                c7221.f23818 = false;
                ColorStateList colorStateListM31898 = C12864.m31898(imageView);
                if (colorStateListM31898 != null) {
                    c7221.f23816 = true;
                    c7221.f23817 = colorStateListM31898;
                }
                PorterDuff.Mode modeM31901 = C12864.m31901(imageView);
                if (modeM31901 != null) {
                    c7221.f23818 = true;
                    c7221.f23819 = modeM31901;
                }
                if (c7221.f23816 || c7221.f23818) {
                    int[] drawableState = imageView.getDrawableState();
                    int i2 = C8581.f28059;
                    C22884.m51611(drawable, c7221, drawableState);
                    return;
                }
            }
            C7221 c7222 = this.f64770;
            if (c7222 != null) {
                int[] drawableState2 = imageView.getDrawableState();
                int i3 = C8581.f28059;
                C22884.m51611(drawable, c7222, drawableState2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46379(Drawable drawable) {
        this.f64772 = drawable.getLevel();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46375() {
        ImageView imageView = this.f64773;
        if (imageView.getDrawable() != null) {
            imageView.getDrawable().setLevel(this.f64772);
        }
    }
}
