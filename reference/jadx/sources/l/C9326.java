package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4UL */
/* JADX INFO: loaded from: classes3.dex */
public final class C9326 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final CompoundButton f30308;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f30309;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ColorStateList f30306 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f30310 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f30307 = false;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f30311 = false;

    public C9326(CompoundButton compoundButton) {
        this.f30308 = compoundButton;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24571(AttributeSet attributeSet, int i) {
        int iM15660;
        int iM15661;
        CompoundButton compoundButton = this.f30308;
        Context context = compoundButton.getContext();
        int[] iArr = C10401.f33073;
        C5204 c5204M15649 = C5204.m15649(context, attributeSet, iArr, i, 0);
        C22666.m51088(compoundButton, compoundButton.getContext(), iArr, attributeSet, c5204M15649.m15658(), i);
        try {
            if (c5204M15649.m15655(1) && (iM15661 = c5204M15649.m15660(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(C0385.m2186(compoundButton.getContext(), iM15661));
                } catch (Resources.NotFoundException unused) {
                    if (c5204M15649.m15655(0)) {
                        compoundButton.setButtonDrawable(C0385.m2186(compoundButton.getContext(), iM15660));
                    }
                }
            } else if (c5204M15649.m15655(0) && (iM15660 = c5204M15649.m15660(0, 0)) != 0) {
                compoundButton.setButtonDrawable(C0385.m2186(compoundButton.getContext(), iM15660));
            }
            if (c5204M15649.m15655(2)) {
                C4661.m14519(compoundButton, c5204M15649.m15666(2));
            }
            if (c5204M15649.m15655(3)) {
                C4661.m14520(compoundButton, C21414.m48720(c5204M15649.m15657(3, -1), null));
            }
        } finally {
            c5204M15649.m15664();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24569(ColorStateList colorStateList) {
        this.f30306 = colorStateList;
        this.f30307 = true;
        m24568();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ColorStateList m24573() {
        return this.f30306;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24570(PorterDuff.Mode mode) {
        this.f30310 = mode;
        this.f30311 = true;
        m24568();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final PorterDuff.Mode m24572() {
        return this.f30310;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m24574() {
        if (this.f30309) {
            this.f30309 = false;
        } else {
            this.f30309 = true;
            m24568();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24568() {
        CompoundButton compoundButton = this.f30308;
        Drawable drawableM14518 = C4661.m14518(compoundButton);
        if (drawableM14518 != null) {
            if (this.f30307 || this.f30311) {
                Drawable drawableMutate = C0597.m2697(drawableM14518).mutate();
                if (this.f30307) {
                    C0597.m2690(drawableMutate, this.f30306);
                }
                if (this.f30311) {
                    C0597.m2693(drawableMutate, this.f30310);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }
}
