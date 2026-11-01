package l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: l.ܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnApplyWindowInsetsListenerC14205 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17026 f46589;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15844 f46590;

    public ViewOnApplyWindowInsetsListenerC14205(View view, AbstractC17026 abstractC17026) {
        this.f46589 = abstractC17026;
        C15844 c15844M13974 = C5031.m13974(view);
        this.f46590 = c15844M13974 != null ? new C1025(c15844M13974).m3869() : null;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.f46590 = C15844.m37669(view, windowInsets);
            return C1503.m5189(view, windowInsets);
        }
        C15844 c15844M37669 = C15844.m37669(view, windowInsets);
        if (this.f46590 == null) {
            this.f46590 = C5031.m13974(view);
        }
        if (this.f46590 == null) {
            this.f46590 = c15844M37669;
            return C1503.m5189(view, windowInsets);
        }
        AbstractC17026 abstractC17026M5191 = C1503.m5191(view);
        if (abstractC17026M5191 != null && C13638.equals(abstractC17026M5191.mDispachedInsets, windowInsets)) {
            return C1503.m5189(view, windowInsets);
        }
        C15844 c15844 = this.f46590;
        int i = 0;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if (!c15844M37669.m37673(i2).equals(c15844.m37673(i2))) {
                i |= i2;
            }
        }
        if (i == 0) {
            return C1503.m5189(view, windowInsets);
        }
        C15844 c15845 = this.f46590;
        C5259 c5259 = new C5259(i, C1503.m5190(i, c15844M37669, c15845), 160L);
        c5259.m14530(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c5259.m14529());
        C13954 c13954M37673 = c15844M37669.m37673(i);
        C13954 c13954M37674 = c15845.m37673(i);
        int iMin = Math.min(c13954M37673.f45915, c13954M37674.f45915);
        int i3 = c13954M37673.f45912;
        int i4 = c13954M37674.f45912;
        int iMin2 = Math.min(i3, i4);
        int i5 = c13954M37673.f45914;
        int i6 = c13954M37674.f45914;
        int iMin3 = Math.min(i5, i6);
        int i7 = c13954M37673.f45913;
        int i8 = i;
        int i9 = c13954M37674.f45913;
        C12088 c12088 = new C12088(C13954.m33793(iMin, iMin2, iMin3, Math.min(i7, i9)), C13954.m33793(Math.max(c13954M37673.f45915, c13954M37674.f45915), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        C1503.m5193(view, c5259, windowInsets, false);
        duration.addUpdateListener(new C5737(c5259, c15844M37669, c15845, i8, view));
        duration.addListener(new C10677(view, c5259));
        ViewTreeObserverOnPreDrawListenerC22337.m49503(view, new RunnableC23377(view, c5259, c12088, duration));
        this.f46590 = c15844M37669;
        return C1503.m5189(view, windowInsets);
    }
}
