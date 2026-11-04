package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.֨ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB0M */
/* JADX INFO: loaded from: classes2.dex */
public final class C1124 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f4186;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10072 f4188;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f4185 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f4187 = false;

    public C1124(C10072 c10072) {
        this.f4188 = c10072;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4168(AttributeSet attributeSet, int i) {
        int iM15660;
        int iM15661;
        C10072 c10072 = this.f4188;
        Context context = c10072.getContext();
        int[] iArr = C10401.f33075;
        C5204 c5204M15649 = C5204.m15649(context, attributeSet, iArr, i, 0);
        C22666.m51088(c10072, c10072.getContext(), iArr, attributeSet, c5204M15649.m15658(), i);
        try {
            if (c5204M15649.m15655(1) && (iM15661 = c5204M15649.m15660(1, 0)) != 0) {
                try {
                    c10072.setCheckMarkDrawable(C0385.m2186(c10072.getContext(), iM15661));
                } catch (Resources.NotFoundException unused) {
                    if (c5204M15649.m15655(0)) {
                        c10072.setCheckMarkDrawable(C0385.m2186(c10072.getContext(), iM15660));
                    }
                }
            } else if (c5204M15649.m15655(0) && (iM15660 = c5204M15649.m15660(0, 0)) != 0) {
                c10072.setCheckMarkDrawable(C0385.m2186(c10072.getContext(), iM15660));
            }
            if (c5204M15649.m15655(2)) {
                c10072.setCheckMarkTintList(c5204M15649.m15666(2));
            }
            if (c5204M15649.m15655(3)) {
                c10072.setCheckMarkTintMode(C21414.m48720(c5204M15649.m15657(3, -1), null));
            }
        } finally {
            c5204M15649.m15664();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4167() {
        C10072 c10072 = this.f4188;
        Drawable checkMarkDrawable = c10072.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f4185 || this.f4187) {
                Drawable drawableMutate = C0597.m2697(checkMarkDrawable).mutate();
                if (this.f4185) {
                    C0597.m2690(drawableMutate, (ColorStateList) null);
                }
                if (this.f4187) {
                    C0597.m2693(drawableMutate, (PorterDuff.Mode) null);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c10072.getDrawableState());
                }
                c10072.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4169() {
        if (this.f4186) {
            this.f4186 = false;
        } else {
            this.f4186 = true;
            m4167();
        }
    }
}
