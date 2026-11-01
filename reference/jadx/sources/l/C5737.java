package l;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۛ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes2.dex */
public final class C5737 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15844 f19513;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5259 f19514;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f19515;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15844 f19516;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19517;

    public C5737(C5259 c5259, C15844 c15844, C15844 c15845, int i, View view) {
        this.f19514 = c5259;
        this.f19513 = c15844;
        this.f19516 = c15845;
        this.f19517 = i;
        this.f19515 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C5259 c5259 = this.f19514;
        c5259.m14530(animatedFraction);
        float fM14532 = c5259.m14532();
        int i = C1503.f6076;
        C15844 c15844 = this.f19513;
        C1025 c1025 = new C1025(c15844);
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((this.f19517 & i2) == 0) {
                c1025.m3870(i2, c15844.m37673(i2));
            } else {
                C13954 c13954M37673 = c15844.m37673(i2);
                C13954 c13954M37674 = this.f19516.m37673(i2);
                float f = 1.0f - fM14532;
                c1025.m3870(i2, C15844.m37668(c13954M37673, (int) (((double) ((c13954M37673.f45915 - c13954M37674.f45915) * f)) + 0.5d), (int) (((double) ((c13954M37673.f45912 - c13954M37674.f45912) * f)) + 0.5d), (int) (((double) ((c13954M37673.f45914 - c13954M37674.f45914) * f)) + 0.5d), (int) (((double) ((c13954M37673.f45913 - c13954M37674.f45913) * f)) + 0.5d)));
            }
        }
        C1503.m5195(this.f19515, c1025.m3869(), Collections.singletonList(c5259));
    }
}
