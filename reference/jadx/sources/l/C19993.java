package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.᩶ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5RA */
/* JADX INFO: loaded from: classes4.dex */
public final class C19993 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C23851 f63985;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C23851 f63987;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C23851 f63989;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final View f63990;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f63986 = -1;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23521 f63988 = C23521.m51803();

    public C19993(View view) {
        this.f63990 = view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45278(AttributeSet attributeSet, int i) {
        View view = this.f63990;
        Context context = view.getContext();
        int[] iArr = C12108.f40523;
        C1977 c1977M6353 = C1977.m6353(context, attributeSet, iArr, i, 0);
        C5031.m13983(view, view.getContext(), iArr, attributeSet, c1977M6353.m6382(), i);
        try {
            if (c1977M6353.m6383(0)) {
                this.f63986 = c1977M6353.m6387(0, -1);
                ColorStateList colorStateListM51806 = this.f63988.m51806(view.getContext(), this.f63986);
                if (colorStateListM51806 != null) {
                    m45276(colorStateListM51806);
                }
            }
            if (c1977M6353.m6383(1)) {
                C5031.m13984(view, c1977M6353.m6385(1));
            }
            if (c1977M6353.m6383(2)) {
                C5031.m13985(view, C20946.m47119(c1977M6353.m6381(2, -1), null));
            }
        } finally {
            c1977M6353.m6379();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45275(int i) {
        this.f63986 = i;
        C23521 c23521 = this.f63988;
        m45276(c23521 != null ? c23521.m51806(this.f63990.getContext(), i) : null);
        m45274();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m45273() {
        this.f63986 = -1;
        m45276((ColorStateList) null);
        m45274();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45281(ColorStateList colorStateList) {
        if (this.f63989 == null) {
            this.f63989 = new C23851();
        }
        C23851 c23851 = this.f63989;
        c23851.f77107 = colorStateList;
        c23851.f77106 = true;
        m45274();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ColorStateList m45280() {
        C23851 c23851 = this.f63989;
        if (c23851 != null) {
            return c23851.f77107;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45277(PorterDuff.Mode mode) {
        if (this.f63989 == null) {
            this.f63989 = new C23851();
        }
        C23851 c23851 = this.f63989;
        c23851.f77105 = mode;
        c23851.f77108 = true;
        m45274();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final PorterDuff.Mode m45279() {
        C23851 c23851 = this.f63989;
        if (c23851 != null) {
            return c23851.f77105;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45274() {
        View view = this.f63990;
        Drawable background = view.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 ? i == 21 : this.f63985 != null) {
                if (this.f63987 == null) {
                    this.f63987 = new C23851();
                }
                C23851 c23851 = this.f63987;
                c23851.f77107 = null;
                c23851.f77106 = false;
                c23851.f77105 = null;
                c23851.f77108 = false;
                ColorStateList colorStateListM14018 = C5031.m14018(view);
                if (colorStateListM14018 != null) {
                    c23851.f77106 = true;
                    c23851.f77107 = colorStateListM14018;
                }
                PorterDuff.Mode modeM13971 = C5031.m13971(view);
                if (modeM13971 != null) {
                    c23851.f77108 = true;
                    c23851.f77105 = modeM13971;
                }
                if (c23851.f77106 || c23851.f77108) {
                    int[] drawableState = view.getDrawableState();
                    int i2 = C23521.f76123;
                    C4800.m13325(background, c23851, drawableState);
                    return;
                }
            }
            C23851 c23852 = this.f63989;
            if (c23852 != null) {
                int[] drawableState2 = view.getDrawableState();
                int i3 = C23521.f76123;
                C4800.m13325(background, c23852, drawableState2);
            } else {
                C23851 c23853 = this.f63985;
                if (c23853 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    int i4 = C23521.f76123;
                    C4800.m13325(background, c23853, drawableState3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45276(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f63985 == null) {
                this.f63985 = new C23851();
            }
            C23851 c23851 = this.f63985;
            c23851.f77107 = colorStateList;
            c23851.f77106 = true;
        } else {
            this.f63985 = null;
        }
        m45274();
    }
}
