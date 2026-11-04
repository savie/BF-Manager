package l;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Collections;

/* JADX INFO: renamed from: l.ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18936 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22623 f61420;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3977 f61421;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f61422;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61423;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3977 f61424;

    public C18936(C22623 c22623, C3977 c3977, C3977 c3978, int i, View view) {
        this.f61420 = c22623;
        this.f61424 = c3977;
        this.f61421 = c3978;
        this.f61423 = i;
        this.f61422 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C22623 c22623 = this.f61420;
        c22623.m50971(animatedFraction);
        float fM50973 = c22623.m50973();
        int i = C2528.f8077;
        C3977 c3977 = this.f61424;
        C15163 c15163 = new C15163(c3977);
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((this.f61423 & i2) == 0) {
                c15163.m36478(i2, c3977.m12817(i2));
            } else {
                C13275 c13275M12817 = c3977.m12817(i2);
                C13275 c13275M12818 = this.f61421.m12817(i2);
                float f = 1.0f - fM50973;
                c15163.m36478(i2, C3977.m12813(c13275M12817, (int) (((double) ((c13275M12817.f42407 - c13275M12818.f42407) * f)) + 0.5d), (int) (((double) ((c13275M12817.f42408 - c13275M12818.f42408) * f)) + 0.5d), (int) (((double) ((c13275M12817.f42406 - c13275M12818.f42406) * f)) + 0.5d), (int) (((double) ((c13275M12817.f42405 - c13275M12818.f42405) * f)) + 0.5d)));
            }
        }
        C2528.m8434(this.f61422, c15163.m36477(), Collections.singletonList(c22623));
    }
}
