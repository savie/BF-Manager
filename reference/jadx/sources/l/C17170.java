package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB0M */
/* JADX INFO: loaded from: classes4.dex */
public final class C17170 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12232 f54737;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f54739;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f54738 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f54740 = false;

    public C17170(C12232 c12232) {
        this.f54737 = c12232;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40097(AttributeSet attributeSet, int i) {
        int iM6387;
        int iM6388;
        C12232 c12232 = this.f54737;
        Context context = c12232.getContext();
        int[] iArr = C12108.f40537;
        C1977 c1977M6353 = C1977.m6353(context, attributeSet, iArr, i, 0);
        C5031.m13983(c12232, c12232.getContext(), iArr, attributeSet, c1977M6353.m6382(), i);
        try {
            if (c1977M6353.m6383(1) && (iM6388 = c1977M6353.m6387(1, 0)) != 0) {
                try {
                    c12232.setCheckMarkDrawable(C15945.m37904(c12232.getContext(), iM6388));
                } catch (Resources.NotFoundException unused) {
                    if (c1977M6353.m6383(0)) {
                        c12232.setCheckMarkDrawable(C15945.m37904(c12232.getContext(), iM6387));
                    }
                }
            } else if (c1977M6353.m6383(0) && (iM6387 = c1977M6353.m6387(0, 0)) != 0) {
                c12232.setCheckMarkDrawable(C15945.m37904(c12232.getContext(), iM6387));
            }
            if (c1977M6353.m6383(2)) {
                c12232.setCheckMarkTintList(c1977M6353.m6385(2));
            }
            if (c1977M6353.m6383(3)) {
                c12232.setCheckMarkTintMode(C20946.m47119(c1977M6353.m6381(3, -1), null));
            }
        } finally {
            c1977M6353.m6379();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40096() {
        C12232 c12232 = this.f54737;
        Drawable checkMarkDrawable = c12232.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f54738 || this.f54740) {
                Drawable drawableMutate = C7603.m20139(checkMarkDrawable).mutate();
                if (this.f54738) {
                    C7603.m20129(drawableMutate, (ColorStateList) null);
                }
                if (this.f54740) {
                    C7603.m20132(drawableMutate, (PorterDuff.Mode) null);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c12232.getDrawableState());
                }
                c12232.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m40098() {
        if (this.f54739) {
            this.f54739 = false;
        } else {
            this.f54739 = true;
            m40096();
        }
    }
}
