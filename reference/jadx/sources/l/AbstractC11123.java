package l;

import android.graphics.Canvas;
import android.view.View;
import android.view.animation.Interpolator;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧܽܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11123 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f37756 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Interpolator f37755 = new InterpolatorC17472();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Interpolator f37754 = new InterpolatorC6183();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m28049(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m28050(int i, int i2) {
        int i3 = i2 | i;
        return (i << 16) | (i2 << 8) | i3;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m28051(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float mo28052() {
        return 0.5f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo28057(AbstractC12554 abstractC12554) {
        return true;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo8535(C17492 c17492, AbstractC12554 abstractC12554, AbstractC12554 abstractC12555);

    /* JADX INFO: renamed from: ۨ */
    public abstract void mo8536(AbstractC12554 abstractC12554);

    /* JADX INFO: renamed from: ۨ */
    public boolean mo8537() {
        return true;
    }

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo8538(AbstractC12554 abstractC12554);

    /* JADX INFO: renamed from: ܰ */
    public boolean mo8539() {
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28053(C17492 c17492, int i, int i2, long j) {
        if (this.f37756 == -1) {
            this.f37756 = c17492.getResources().getDimensionPixelSize(R.dimen.MT_Protector);
        }
        int iSignum = (int) (((int) (((int) Math.signum(i2)) * this.f37756 * ((InterpolatorC6183) f37754).getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)))) * ((InterpolatorC17472) f37755).getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f));
        if (iSignum == 0) {
            return i2 > 0 ? 1 : -1;
        }
        return iSignum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo28056(C17492 c17492, AbstractC12554 abstractC12554, int i, AbstractC12554 abstractC12555, int i2, int i3, int i4) {
        AbstractC5498 layoutManager = c17492.getLayoutManager();
        if (layoutManager instanceof InterfaceC3360) {
            ((InterfaceC3360) layoutManager).prepareForDrop(abstractC12554.itemView, abstractC12555.itemView, i3, i4);
            return;
        }
        if (layoutManager.canScrollHorizontally()) {
            if (layoutManager.getDecoratedLeft(abstractC12555.itemView) <= c17492.getPaddingLeft()) {
                c17492.scrollToPosition(i2);
            }
            if (layoutManager.getDecoratedRight(abstractC12555.itemView) >= c17492.getWidth() - c17492.getPaddingRight()) {
                c17492.scrollToPosition(i2);
            }
        }
        if (layoutManager.canScrollVertically()) {
            if (layoutManager.getDecoratedTop(abstractC12555.itemView) <= c17492.getPaddingTop()) {
                c17492.scrollToPosition(i2);
            }
            if (layoutManager.getDecoratedBottom(abstractC12555.itemView) >= c17492.getHeight() - c17492.getPaddingBottom()) {
                c17492.scrollToPosition(i2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo28055(C17492 c17492, AbstractC12554 abstractC12554) {
        View view = abstractC12554.itemView;
        Object tag = view.getTag(R.id.MT_Protector);
        if (tag instanceof Float) {
            C5031.m13982(view, ((Float) tag).floatValue());
        }
        view.setTag(R.id.MT_Protector, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo28054(Canvas canvas, C17492 c17492, AbstractC12554 abstractC12554, float f, float f2, int i, boolean z) {
        View view = abstractC12554.itemView;
        if (z && view.getTag(R.id.MT_Protector) == null) {
            Float fValueOf = Float.valueOf(C5031.m14006(view));
            int childCount = c17492.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = c17492.getChildAt(i2);
                if (childAt != view) {
                    float fM14006 = C5031.m14006(childAt);
                    if (fM14006 > f3) {
                        f3 = fM14006;
                    }
                }
            }
            C5031.m13982(view, f3 + 1.0f);
            view.setTag(R.id.MT_Protector, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }
}
