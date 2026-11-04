package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5RA */
/* JADX INFO: loaded from: classes2.dex */
public final class C0378 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f1910 = -1;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C8581 f1911 = C8581.m23071();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final View f1912;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C7221 f1913;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C7221 f1914;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C7221 f1915;

    public C0378(View view) {
        this.f1912 = view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2178(AttributeSet attributeSet, int i) {
        View view = this.f1912;
        Context context = view.getContext();
        int[] iArr = C10401.f33057;
        C5204 c5204M15649 = C5204.m15649(context, attributeSet, iArr, i, 0);
        C22666.m51088(view, view.getContext(), iArr, attributeSet, c5204M15649.m15658(), i);
        try {
            if (c5204M15649.m15655(0)) {
                this.f1910 = c5204M15649.m15660(0, -1);
                ColorStateList colorStateListM23074 = this.f1911.m23074(view.getContext(), this.f1910);
                if (colorStateListM23074 != null) {
                    m2176(colorStateListM23074);
                }
            }
            if (c5204M15649.m15655(1)) {
                C22666.m51089(view, c5204M15649.m15666(1));
            }
            if (c5204M15649.m15655(2)) {
                C22666.m51090(view, C21414.m48720(c5204M15649.m15657(2, -1), null));
            }
        } finally {
            c5204M15649.m15664();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2175(int i) {
        this.f1910 = i;
        C8581 c8581 = this.f1911;
        m2176(c8581 != null ? c8581.m23074(this.f1912.getContext(), i) : null);
        m2174();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m2182() {
        this.f1910 = -1;
        m2176((ColorStateList) null);
        m2174();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m2181(ColorStateList colorStateList) {
        if (this.f1914 == null) {
            this.f1914 = new C7221();
        }
        C7221 c7221 = this.f1914;
        c7221.f23817 = colorStateList;
        c7221.f23816 = true;
        m2174();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ColorStateList m2180() {
        C7221 c7221 = this.f1914;
        if (c7221 != null) {
            return c7221.f23817;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2177(PorterDuff.Mode mode) {
        if (this.f1914 == null) {
            this.f1914 = new C7221();
        }
        C7221 c7221 = this.f1914;
        c7221.f23819 = mode;
        c7221.f23818 = true;
        m2174();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final PorterDuff.Mode m2179() {
        C7221 c7221 = this.f1914;
        if (c7221 != null) {
            return c7221.f23819;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2174() {
        View view = this.f1912;
        Drawable background = view.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 ? i == 21 : this.f1915 != null) {
                if (this.f1913 == null) {
                    this.f1913 = new C7221();
                }
                C7221 c7221 = this.f1913;
                c7221.f23817 = null;
                c7221.f23816 = false;
                c7221.f23819 = null;
                c7221.f23818 = false;
                ColorStateList colorStateListM51111 = C22666.m51111(view);
                if (colorStateListM51111 != null) {
                    c7221.f23816 = true;
                    c7221.f23817 = colorStateListM51111;
                }
                PorterDuff.Mode modeM51110 = C22666.m51110(view);
                if (modeM51110 != null) {
                    c7221.f23818 = true;
                    c7221.f23819 = modeM51110;
                }
                if (c7221.f23816 || c7221.f23818) {
                    int[] drawableState = view.getDrawableState();
                    int i2 = C8581.f28059;
                    C22884.m51611(background, c7221, drawableState);
                    return;
                }
            }
            C7221 c7222 = this.f1914;
            if (c7222 != null) {
                int[] drawableState2 = view.getDrawableState();
                int i3 = C8581.f28059;
                C22884.m51611(background, c7222, drawableState2);
            } else {
                C7221 c7223 = this.f1915;
                if (c7223 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    int i4 = C8581.f28059;
                    C22884.m51611(background, c7223, drawableState3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2176(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1915 == null) {
                this.f1915 = new C7221();
            }
            C7221 c7221 = this.f1915;
            c7221.f23817 = colorStateList;
            c7221.f23816 = true;
        } else {
            this.f1915 = null;
        }
        m2174();
    }
}
