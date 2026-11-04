package l;

import android.graphics.Canvas;
import android.view.View;
import android.view.animation.Interpolator;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16474 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f53431 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Interpolator f53430 = new InterpolatorC11253();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Interpolator f53429 = new InterpolatorC24680();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m39082(int i, int i2) {
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m39083(int i, int i2) {
        int i3 = i2 | i;
        return (i << 16) | (i2 << 8) | i3;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m39084(int i, int i2) {
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

    /* JADX INFO: renamed from: ۙ */
    public float mo27641() {
        return 0.5f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo39086(AbstractC11800 abstractC11800) {
        return true;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo9676(C25227 c25227, AbstractC11800 abstractC11800, AbstractC11800 abstractC11801);

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo9677(AbstractC11800 abstractC11800);

    /* JADX INFO: renamed from: ۤ */
    public boolean mo17826() {
        return true;
    }

    /* JADX INFO: renamed from: ᩷ */
    public abstract int mo9678(AbstractC11800 abstractC11800);

    /* JADX INFO: renamed from: ᩷ */
    public boolean mo17827() {
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39085(C25227 c25227, int i, int i2, long j) {
        if (this.f53431 == -1) {
            this.f53431 = c25227.getResources().getDimensionPixelSize(R.dimen.MT_Protector);
        }
        int iSignum = (int) (((int) (((int) Math.signum(i2)) * this.f53431 * ((InterpolatorC24680) f53429).getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)))) * ((InterpolatorC11253) f53430).getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f));
        if (iSignum == 0) {
            return i2 > 0 ? 1 : -1;
        }
        return iSignum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ */
    public void mo25774(C25227 c25227, AbstractC11800 abstractC11800, int i, AbstractC11800 abstractC11801, int i2, int i3, int i4) {
        AbstractC21169 layoutManager = c25227.getLayoutManager();
        if (layoutManager instanceof InterfaceC20204) {
            ((InterfaceC20204) layoutManager).prepareForDrop(abstractC11800.itemView, abstractC11801.itemView, i3, i4);
            return;
        }
        if (layoutManager.canScrollHorizontally()) {
            if (layoutManager.getDecoratedLeft(abstractC11801.itemView) <= c25227.getPaddingLeft()) {
                c25227.scrollToPosition(i2);
            }
            if (layoutManager.getDecoratedRight(abstractC11801.itemView) >= c25227.getWidth() - c25227.getPaddingRight()) {
                c25227.scrollToPosition(i2);
            }
        }
        if (layoutManager.canScrollVertically()) {
            if (layoutManager.getDecoratedTop(abstractC11801.itemView) <= c25227.getPaddingTop()) {
                c25227.scrollToPosition(i2);
            }
            if (layoutManager.getDecoratedBottom(abstractC11801.itemView) >= c25227.getHeight() - c25227.getPaddingBottom()) {
                c25227.scrollToPosition(i2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo25773(C25227 c25227, AbstractC11800 abstractC11800) {
        View view = abstractC11800.itemView;
        Object tag = view.getTag(R.id.MT_Protector);
        if (tag instanceof Float) {
            C22666.m51087(view, ((Float) tag).floatValue());
        }
        view.setTag(R.id.MT_Protector, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo27642(Canvas canvas, C25227 c25227, AbstractC11800 abstractC11800, float f, float f2, int i, boolean z) {
        View view = abstractC11800.itemView;
        if (z && view.getTag(R.id.MT_Protector) == null) {
            Float fValueOf = Float.valueOf(C22666.m51105(view));
            int childCount = c25227.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = c25227.getChildAt(i2);
                if (childAt != view) {
                    float fM51105 = C22666.m51105(childAt);
                    if (fM51105 > f3) {
                        f3 = fM51105;
                    }
                }
            }
            C22666.m51087(view, f3 + 1.0f);
            view.setTag(R.id.MT_Protector, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }
}
