package l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import bin.mt.plus.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘ۟ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3797 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ViewGroup f13679;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f13680;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final View f13683;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f13684;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ValueAnimator f13686;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ViewGroup f13687;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ValueAnimator f13689;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f13691;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f13693;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f13694;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C7409 f13696;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f13697;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final View f13698;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f13700;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f13701;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f13702;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final View f13703;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f13704;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ViewGroup f13705;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f13706;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final RunnableC20815 f13678 = new Runnable() { // from class: l.᩷ۤܰ
        @Override // java.lang.Runnable
        public final void run() {
            this.f67657.m11044();
        }
    };

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final RunnableC17287 f13681 = new Runnable() { // from class: l.ܿۤܰ
        @Override // java.lang.Runnable
        public final void run() {
            C3797.m11049(this.f55048);
        }
    };

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final RunnableC5998 f13699 = new Runnable() { // from class: l.ۛۤܰ
        @Override // java.lang.Runnable
        public final void run() {
            C3797.m11057(this.f20396);
        }
    };

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final RunnableC10938 f13695 = new Runnable() { // from class: l.ۧۤܰ
        @Override // java.lang.Runnable
        public final void run() {
            C3797.m11040(this.f37200);
        }
    };

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final RunnableC23638 f13685 = new Runnable() { // from class: l.᩻ۤܰ
        @Override // java.lang.Runnable
        public final void run() {
            C3797.m11062(this.f76562);
        }
    };

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ViewOnLayoutChangeListenerC14466 f13688 = new View.OnLayoutChangeListener() { // from class: l.ܳۤܰ
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C3797.m11053(this.f47438, view, i, i3, i5, i7);
        }
    };

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f13682 = true;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f13690 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f13692 = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v0, types: [l.᩷ۤܰ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ܿۤܰ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ۛۤܰ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ۧۤܰ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.᩻ۤܰ] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ܳۤܰ] */
    public C3797(C7409 c7409) {
        this.f13696 = c7409;
        this.f13683 = c7409.findViewById(R.id.MT_Protector);
        this.f13680 = (ViewGroup) c7409.findViewById(R.id.MT_Protector);
        this.f13687 = (ViewGroup) c7409.findViewById(R.id.MT_Protector);
        ViewGroup viewGroup = (ViewGroup) c7409.findViewById(R.id.MT_Protector);
        this.f13691 = viewGroup;
        this.f13684 = (ViewGroup) c7409.findViewById(R.id.MT_Protector);
        View viewFindViewById = c7409.findViewById(R.id.MT_Protector);
        this.f13698 = viewFindViewById;
        this.f13694 = (ViewGroup) c7409.findViewById(R.id.MT_Protector);
        this.f13705 = (ViewGroup) c7409.findViewById(R.id.MT_Protector);
        this.f13679 = (ViewGroup) c7409.findViewById(R.id.MT_Protector);
        View viewFindViewById2 = c7409.findViewById(R.id.MT_Protector);
        this.f13703 = viewFindViewById2;
        View viewFindViewById3 = c7409.findViewById(R.id.MT_Protector);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.֫ۤܰ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3797.m11052(this.f6897, view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.֫ۤܰ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3797.m11052(this.f6897, view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۢۤܰ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C3797.m11051(this.f32217, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C3175(this));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܺۤܰ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C3797.m11042(this.f51356, valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new C4503(this));
        Resources resources = c7409.getResources();
        float dimension = resources.getDimension(R.dimen.MT_Protector) - resources.getDimension(R.dimen.MT_Protector);
        float dimension2 = resources.getDimension(R.dimen.MT_Protector);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f13706 = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new C13677(this, c7409));
        animatorSet.play(valueAnimatorOfFloat).with(m11045(0.0f, dimension, viewFindViewById)).with(m11045(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f13704 = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new C11560(this, c7409));
        animatorSet2.play(m11045(dimension, dimension2, viewFindViewById)).with(m11045(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f13693 = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new C2386(this, c7409));
        animatorSet3.play(valueAnimatorOfFloat).with(m11045(0.0f, dimension2, viewFindViewById)).with(m11045(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f13697 = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new C5209(this));
        animatorSet4.play(valueAnimatorOfFloat2).with(m11045(dimension, 0.0f, viewFindViewById)).with(m11045(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f13702 = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new C22143(this));
        animatorSet5.play(valueAnimatorOfFloat2).with(m11045(dimension2, 0.0f, viewFindViewById)).with(m11045(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f13686 = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܽۤܰ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f53224.m11046(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat3.addListener(new C0975(this));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f13689 = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.۫ۤܰ
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f41257.m11046(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat4.addListener(new C12971(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11051(C3797 c3797, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = c3797.f13683;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = c3797.f13680;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = c3797.f13687;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11042(C3797 c3797, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = c3797.f13683;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = c3797.f13680;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = c3797.f13687;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m11080() {
        C7409 c7409 = this.f13696;
        if (!c7409.m19829()) {
            c7409.setVisibility(0);
            c7409.m19830();
            c7409.m19820();
        }
        m11044();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11073() {
        int i = this.f13690;
        if (i == 3 || i == 2) {
            return;
        }
        m11082();
        if (this.f13682) {
            if (this.f13690 != 1) {
                this.f13693.start();
                return;
            } else {
                this.f13704.start();
                return;
            }
        }
        m11047(2);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m11081() {
        int i = this.f13690;
        if (i == 3 || i == 2) {
            return;
        }
        m11082();
        m11047(2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11076(boolean z) {
        this.f13682 = z;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m11071() {
        if (this.f13690 == 3) {
            return;
        }
        m11082();
        int iM19823 = this.f13696.m19823();
        if (iM19823 > 0) {
            if (!this.f13682) {
                m11048(iM19823, this.f13685);
            } else if (this.f13690 == 1) {
                m11048(2000L, this.f13699);
            } else {
                m11048(iM19823, this.f13695);
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m11082() {
        RunnableC23638 runnableC23638 = this.f13685;
        C7409 c7409 = this.f13696;
        c7409.removeCallbacks(runnableC23638);
        c7409.removeCallbacks(this.f13681);
        c7409.removeCallbacks(this.f13695);
        c7409.removeCallbacks(this.f13699);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m11072() {
        this.f13696.addOnLayoutChangeListener(this.f13688);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m11078() {
        this.f13696.removeOnLayoutChangeListener(this.f13688);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m11079() {
        return this.f13690 == 0 && this.f13696.m19829();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11075(View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f13692;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f13700 && m11059(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11077(View view) {
        return view != null && this.f13692.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m11047(int i) {
        int i2 = this.f13690;
        this.f13690 = i;
        C7409 c7409 = this.f13696;
        if (i == 2) {
            c7409.setVisibility(8);
        } else if (i2 == 2) {
            c7409.setVisibility(0);
        }
        if (i2 != i) {
            c7409.m19835();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11074(int i, int i2, int i3, int i4) {
        View view = this.f13683;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11052(C3797 c3797, View view) {
        c3797.m11071();
        if (view.getId() == R.id.MT_Protector) {
            c3797.f13686.start();
        } else if (view.getId() == R.id.MT_Protector) {
            c3797.f13689.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void m11044() {
        if (!this.f13682) {
            m11047(0);
            m11071();
            return;
        }
        int i = this.f13690;
        if (i == 1) {
            this.f13697.start();
        } else if (i == 2) {
            this.f13702.start();
        } else if (i == 3) {
            this.f13701 = true;
        } else if (i == 4) {
            return;
        }
        m11071();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11049(C3797 c3797) {
        c3797.f13693.start();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m11057(C3797 c3797) {
        c3797.f13704.start();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static void m11040(C3797 c3797) {
        c3797.f13706.start();
        c3797.m11048(2000L, c3797.f13699);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m11062(C3797 c3797) {
        c3797.m11047(2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m11045(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11048(long j, Runnable runnable) {
        if (j >= 0) {
            this.f13696.postDelayed(runnable, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m11046(float f) {
        ViewGroup viewGroup = this.f13679;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f13684;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f13694;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11053(final C3797 c3797, View view, int i, int i2, int i3, int i4) {
        int paddingRight;
        int height;
        int paddingBottom;
        int i5;
        C7409 c7409 = c3797.f13696;
        int width = (c7409.getWidth() - c7409.getPaddingLeft()) - c7409.getPaddingRight();
        int height2 = (c7409.getHeight() - c7409.getPaddingBottom()) - c7409.getPaddingTop();
        ViewGroup viewGroup = c3797.f13680;
        int iM11061 = m11061(viewGroup);
        if (viewGroup != null) {
            paddingRight = viewGroup.getPaddingRight() + viewGroup.getPaddingLeft();
        } else {
            paddingRight = 0;
        }
        int i6 = iM11061 - paddingRight;
        if (viewGroup == null) {
            height = 0;
        } else {
            height = viewGroup.getHeight();
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
        }
        if (viewGroup != null) {
            paddingBottom = viewGroup.getPaddingBottom() + viewGroup.getPaddingTop();
        } else {
            paddingBottom = 0;
        }
        int i7 = height - paddingBottom;
        int iMax = Math.max(i6, m11061(c3797.f13684) + m11061(c3797.f13703));
        ViewGroup viewGroup2 = c3797.f13691;
        if (viewGroup2 == null) {
            i5 = 0;
        } else {
            int height3 = viewGroup2.getHeight();
            ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                i5 = height3 + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                i5 = height3;
            }
        }
        boolean z = width <= iMax || height2 <= (i5 * 2) + i7;
        if (c3797.f13700 != z) {
            c3797.f13700 = z;
            view.post(new Runnable() { // from class: l.᩶ۤܰ
                @Override // java.lang.Runnable
                public final void run() {
                    C3797.m11054(this.f65290);
                }
            });
        }
        boolean z2 = i2 - i != i4 - i3;
        if (c3797.f13700 || !z2) {
            return;
        }
        view.post(new Runnable() { // from class: l.֡ۤܰ
            @Override // java.lang.Runnable
            public final void run() {
                C3797.m11041(this.f1780);
            }
        });
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static void m11054(C3797 c3797) {
        View view = c3797.f13698;
        ViewGroup viewGroup = c3797.f13687;
        if (viewGroup != null) {
            viewGroup.setVisibility(c3797.f13700 ? 0 : 4);
        }
        if (view != null) {
            int dimensionPixelSize = c3797.f13696.getResources().getDimensionPixelSize(R.dimen.MT_Protector);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams != null) {
                if (c3797.f13700) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                view.setLayoutParams(marginLayoutParams);
            }
            if (view instanceof C3134) {
                C3134 c3134 = (C3134) view;
                if (c3797.f13700) {
                    c3134.m9503(true);
                } else {
                    int i = c3797.f13690;
                    if (i == 1) {
                        c3134.m9503(false);
                    } else if (i != 3) {
                        c3134.m9505();
                    }
                }
            }
        }
        for (View view2 : c3797.f13692) {
            view2.setVisibility((c3797.f13700 && m11059(view2)) ? 4 : 0);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m11059(View view) {
        int id = view.getId();
        return id == R.id.MT_Protector || id == R.id.MT_Protector || id == R.id.MT_Protector || id == R.id.MT_Protector || id == R.id.MT_Protector || id == R.id.MT_Protector || id == R.id.MT_Protector;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m11041(C3797 c3797) {
        int i;
        ValueAnimator valueAnimator = c3797.f13689;
        View view = c3797.f13703;
        C7409 c7409 = c3797.f13696;
        ViewGroup viewGroup = c3797.f13705;
        ViewGroup viewGroup2 = c3797.f13694;
        if (viewGroup2 == null || viewGroup == null) {
            return;
        }
        int width = (c7409.getWidth() - c7409.getPaddingLeft()) - c7409.getPaddingRight();
        while (true) {
            if (viewGroup.getChildCount() <= 1) {
                break;
            }
            int childCount = viewGroup.getChildCount() - 2;
            View childAt = viewGroup.getChildAt(childCount);
            viewGroup.removeViewAt(childCount);
            viewGroup2.addView(childAt, 0);
        }
        if (view != null) {
            view.setVisibility(8);
        }
        int iM11061 = m11061(c3797.f13684);
        int childCount2 = viewGroup2.getChildCount() - 1;
        for (int i2 = 0; i2 < childCount2; i2++) {
            iM11061 += m11061(viewGroup2.getChildAt(i2));
        }
        if (iM11061 > width) {
            if (view != null) {
                view.setVisibility(0);
                iM11061 += m11061(view);
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt2 = viewGroup2.getChildAt(i3);
                iM11061 -= m11061(childAt2);
                arrayList.add(childAt2);
                if (iM11061 <= width) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            viewGroup2.removeViews(0, arrayList.size());
            for (i = 0; i < arrayList.size(); i++) {
                viewGroup.addView((View) arrayList.get(i), viewGroup.getChildCount() - 1);
            }
            return;
        }
        ViewGroup viewGroup3 = c3797.f13679;
        if (viewGroup3 == null || viewGroup3.getVisibility() != 0 || valueAnimator.isStarted()) {
            return;
        }
        c3797.f13686.cancel();
        valueAnimator.start();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m11061(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }
}
