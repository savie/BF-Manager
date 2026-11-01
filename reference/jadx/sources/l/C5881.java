package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.ۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4UL */
/* JADX INFO: loaded from: classes2.dex */
public final class C5881 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f20070;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CompoundButton f20073;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ColorStateList f20069 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f20072 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f20071 = false;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f20068 = false;

    public C5881(CompoundButton compoundButton) {
        this.f20073 = compoundButton;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16094(AttributeSet attributeSet, int i) {
        int iM6387;
        int iM6388;
        CompoundButton compoundButton = this.f20073;
        Context context = compoundButton.getContext();
        int[] iArr = C12108.f40532;
        C1977 c1977M6353 = C1977.m6353(context, attributeSet, iArr, i, 0);
        C5031.m13983(compoundButton, compoundButton.getContext(), iArr, attributeSet, c1977M6353.m6382(), i);
        try {
            if (c1977M6353.m6383(1) && (iM6388 = c1977M6353.m6387(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(C15945.m37904(compoundButton.getContext(), iM6388));
                } catch (Resources.NotFoundException unused) {
                    if (c1977M6353.m6383(0)) {
                        compoundButton.setButtonDrawable(C15945.m37904(compoundButton.getContext(), iM6387));
                    }
                }
            } else if (c1977M6353.m6383(0) && (iM6387 = c1977M6353.m6387(0, 0)) != 0) {
                compoundButton.setButtonDrawable(C15945.m37904(compoundButton.getContext(), iM6387));
            }
            if (c1977M6353.m6383(2)) {
                C11468.m28656(compoundButton, c1977M6353.m6385(2));
            }
            if (c1977M6353.m6383(3)) {
                C11468.m28657(compoundButton, C20946.m47119(c1977M6353.m6381(3, -1), null));
            }
        } finally {
            c1977M6353.m6379();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16092(ColorStateList colorStateList) {
        this.f20069 = colorStateList;
        this.f20071 = true;
        m16091();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ColorStateList m16096() {
        return this.f20069;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16093(PorterDuff.Mode mode) {
        this.f20072 = mode;
        this.f20068 = true;
        m16091();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final PorterDuff.Mode m16095() {
        return this.f20072;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m16090() {
        if (this.f20070) {
            this.f20070 = false;
        } else {
            this.f20070 = true;
            m16091();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16091() {
        CompoundButton compoundButton = this.f20073;
        Drawable drawableM28655 = C11468.m28655(compoundButton);
        if (drawableM28655 != null) {
            if (this.f20071 || this.f20068) {
                Drawable drawableMutate = C7603.m20139(drawableM28655).mutate();
                if (this.f20071) {
                    C7603.m20129(drawableMutate, this.f20069);
                }
                if (this.f20068) {
                    C7603.m20132(drawableMutate, this.f20072);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }
}
