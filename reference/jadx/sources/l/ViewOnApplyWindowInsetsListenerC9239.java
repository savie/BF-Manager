package l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: l.ۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnApplyWindowInsetsListenerC9239 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7749 f30086;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C3977 f30087;

    public ViewOnApplyWindowInsetsListenerC9239(View view, AbstractC7749 abstractC7749) {
        this.f30086 = abstractC7749;
        C3977 c3977M51078 = C22666.m51078(view);
        this.f30087 = c3977M51078 != null ? new C15163(c3977M51078).m36477() : null;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.f30087 = C3977.m12812(view, windowInsets);
            return C2528.m8431(view, windowInsets);
        }
        C3977 c3977M12812 = C3977.m12812(view, windowInsets);
        if (this.f30087 == null) {
            this.f30087 = C22666.m51078(view);
        }
        if (this.f30087 == null) {
            this.f30087 = c3977M12812;
            return C2528.m8431(view, windowInsets);
        }
        AbstractC7749 abstractC7749M8433 = C2528.m8433(view);
        if (abstractC7749M8433 != null && C17359.equals(abstractC7749M8433.mDispachedInsets, windowInsets)) {
            return C2528.m8431(view, windowInsets);
        }
        C3977 c3977 = this.f30087;
        int i = 0;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if (!c3977M12812.m12817(i2).equals(c3977.m12817(i2))) {
                i |= i2;
            }
        }
        if (i == 0) {
            return C2528.m8431(view, windowInsets);
        }
        C3977 c3978 = this.f30087;
        C22623 c22623 = new C22623(i, C2528.m8432(i, c3977M12812, c3978), 160L);
        c22623.m50971(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c22623.m50970());
        C13275 c13275M12817 = c3977M12812.m12817(i);
        C13275 c13275M12818 = c3978.m12817(i);
        int iMin = Math.min(c13275M12817.f42407, c13275M12818.f42407);
        int i3 = c13275M12817.f42408;
        int i4 = c13275M12818.f42408;
        int iMin2 = Math.min(i3, i4);
        int i5 = c13275M12817.f42406;
        int i6 = c13275M12818.f42406;
        int iMin3 = Math.min(i5, i6);
        int i7 = c13275M12817.f42405;
        int i8 = i;
        int i9 = c13275M12818.f42405;
        C0291 c0291 = new C0291(C13275.m32819(iMin, iMin2, iMin3, Math.min(i7, i9)), C13275.m32819(Math.max(c13275M12817.f42407, c13275M12818.f42407), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        C2528.m8436(view, c22623, windowInsets, false);
        duration.addUpdateListener(new C18936(c22623, c3977M12812, c3978, i8, view));
        duration.addListener(new C9985(view, c22623));
        ViewTreeObserverOnPreDrawListenerC12794.m31683(view, new RunnableC1037(view, c22623, c0291, duration));
        this.f30087 = c3977M12812;
        return C2528.m8431(view, windowInsets);
    }
}
