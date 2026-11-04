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

/* JADX INFO: renamed from: l.ۡۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9191 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f29974;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f29977;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final View f29978;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f29980;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ValueAnimator f29981;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f29983;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f29984;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ViewGroup f29987;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12921 f29988;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f29989;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f29992;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final View f29994;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final View f29995;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f29996;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f29997;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ViewGroup f29998;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ViewGroup f29999;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f30000;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ValueAnimator f30001;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f30002;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final RunnableC5464 f29993 = new Runnable() { // from class: l.ۚۛ᩷
        @Override // java.lang.Runnable
        public final void run() {
            this.f19063.m24313();
        }
    };

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final RunnableC15904 f29976 = new Runnable() { // from class: l.ܶۛ᩷
        @Override // java.lang.Runnable
        public final void run() {
            C9191.m24319(this.f51675);
        }
    };

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final RunnableC23364 f29990 = new Runnable() { // from class: l.᩹ۛ᩷
        @Override // java.lang.Runnable
        public final void run() {
            C9191.m24325(this.f75650);
        }
    };

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final RunnableC3226 f29991 = new Runnable() { // from class: l.ۗۛ᩷
        @Override // java.lang.Runnable
        public final void run() {
            C9191.m24329(this.f10525);
        }
    };

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final RunnableC20380 f29985 = new Runnable() { // from class: l.᩵ۛ᩷
        @Override // java.lang.Runnable
        public final void run() {
            C9191.m24337(this.f65355);
        }
    };

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ViewOnLayoutChangeListenerC12175 f29986 = new View.OnLayoutChangeListener() { // from class: l.ۨۛ᩷
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C9191.m24323(this.f39157, view, i, i3, i5, i7);
        }
    };

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f29979 = true;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f29975 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayList f29982 = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ۚۛ᩷] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ܶۛ᩷] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.᩹ۛ᩷] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ۗۛ᩷] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.᩵ۛ᩷] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ۨۛ᩷] */
    public C9191(C12921 c12921) {
        this.f29988 = c12921;
        this.f29995 = c12921.findViewById(R.id.MT_Protector);
        this.f29999 = (ViewGroup) c12921.findViewById(R.id.MT_Protector);
        this.f29977 = (ViewGroup) c12921.findViewById(R.id.MT_Protector);
        ViewGroup viewGroup = (ViewGroup) c12921.findViewById(R.id.MT_Protector);
        this.f29984 = viewGroup;
        this.f29983 = (ViewGroup) c12921.findViewById(R.id.MT_Protector);
        View viewFindViewById = c12921.findViewById(R.id.MT_Protector);
        this.f29994 = viewFindViewById;
        this.f29998 = (ViewGroup) c12921.findViewById(R.id.MT_Protector);
        this.f29989 = (ViewGroup) c12921.findViewById(R.id.MT_Protector);
        this.f29987 = (ViewGroup) c12921.findViewById(R.id.MT_Protector);
        View viewFindViewById2 = c12921.findViewById(R.id.MT_Protector);
        this.f29978 = viewFindViewById2;
        View viewFindViewById3 = c12921.findViewById(R.id.MT_Protector);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.ۛۛ᩷
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C9191.m24322(this.f21128, view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.ۛۛ᩷
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C9191.m24322(this.f21128, view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.᩺ۛ᩷
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9191.m24321(this.f77942, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new C3972(this));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.֫ۛ᩷
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C9191.m24340(this.f5934, valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new C14412(this));
        Resources resources = c12921.getResources();
        float dimension = resources.getDimension(R.dimen.MT_Protector) - resources.getDimension(R.dimen.MT_Protector);
        float dimension2 = resources.getDimension(R.dimen.MT_Protector);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f30002 = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new C21126(this, c12921));
        animatorSet.play(valueAnimatorOfFloat).with(m24315(0.0f, dimension, viewFindViewById)).with(m24315(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f29992 = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new C18142(this, c12921));
        animatorSet2.play(m24315(dimension, dimension2, viewFindViewById)).with(m24315(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f29980 = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new C0243(this, c12921));
        animatorSet3.play(valueAnimatorOfFloat).with(m24315(0.0f, dimension2, viewFindViewById)).with(m24315(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f29974 = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new C7701(this));
        animatorSet4.play(valueAnimatorOfFloat2).with(m24315(dimension, 0.0f, viewFindViewById)).with(m24315(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f29997 = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new C18888(this));
        animatorSet5.play(valueAnimatorOfFloat2).with(m24315(dimension2, 0.0f, viewFindViewById)).with(m24315(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f30001 = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܺۛ᩷
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f53798.m24316(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat3.addListener(new C9937(this));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f29981 = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܽۛ᩷
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f56566.m24316(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat4.addListener(new C0989(this));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24321(C9191 c9191, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = c9191.f29995;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = c9191.f29999;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = c9191.f29977;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24340(C9191 c9191, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = c9191.f29995;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = c9191.f29999;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = c9191.f29977;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m24348() {
        C12921 c12921 = this.f29988;
        if (!c12921.m32072()) {
            c12921.setVisibility(0);
            c12921.m32069();
            c12921.m32070();
        }
        m24313();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24343() {
        int i = this.f29975;
        if (i == 3 || i == 2) {
            return;
        }
        m24351();
        if (this.f29979) {
            if (this.f29975 != 1) {
                this.f29980.start();
                return;
            } else {
                this.f29992.start();
                return;
            }
        }
        m24317(2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m24353() {
        int i = this.f29975;
        if (i == 3 || i == 2) {
            return;
        }
        m24351();
        m24317(2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24346(boolean z) {
        this.f29979 = z;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m24350() {
        if (this.f29975 == 3) {
            return;
        }
        m24351();
        int iM32061 = this.f29988.m32061();
        if (iM32061 > 0) {
            if (!this.f29979) {
                m24318(iM32061, this.f29985);
            } else if (this.f29975 == 1) {
                m24318(2000L, this.f29990);
            } else {
                m24318(iM32061, this.f29991);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m24351() {
        RunnableC20380 runnableC20380 = this.f29985;
        C12921 c12921 = this.f29988;
        c12921.removeCallbacks(runnableC20380);
        c12921.removeCallbacks(this.f29976);
        c12921.removeCallbacks(this.f29991);
        c12921.removeCallbacks(this.f29990);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m24354() {
        this.f29988.addOnLayoutChangeListener(this.f29986);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m24352() {
        this.f29988.removeOnLayoutChangeListener(this.f29986);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m24349() {
        return this.f29975 == 0 && this.f29988.m32072();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24345(View view, boolean z) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f29982;
        if (!z) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f30000 && m24327(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24347(View view) {
        return view != null && this.f29982.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m24317(int i) {
        int i2 = this.f29975;
        this.f29975 = i;
        C12921 c12921 = this.f29988;
        if (i == 2) {
            c12921.setVisibility(8);
        } else if (i2 == 2) {
            c12921.setVisibility(0);
        }
        if (i2 != i) {
            c12921.m32071();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24344(int i, int i2, int i3, int i4) {
        View view = this.f29995;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24322(C9191 c9191, View view) {
        c9191.m24350();
        if (view.getId() == R.id.MT_Protector) {
            c9191.f30001.start();
        } else if (view.getId() == R.id.MT_Protector) {
            c9191.f29981.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m24313() {
        if (!this.f29979) {
            m24317(0);
            m24350();
            return;
        }
        int i = this.f29975;
        if (i == 1) {
            this.f29974.start();
        } else if (i == 2) {
            this.f29997.start();
        } else if (i == 3) {
            this.f29996 = true;
        } else if (i == 4) {
            return;
        }
        m24350();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24319(C9191 c9191) {
        c9191.f29980.start();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m24325(C9191 c9191) {
        c9191.f29992.start();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static void m24329(C9191 c9191) {
        c9191.f30002.start();
        c9191.m24318(2000L, c9191.f29990);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m24337(C9191 c9191) {
        c9191.m24317(2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ObjectAnimator m24315(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24318(long j, Runnable runnable) {
        if (j >= 0) {
            this.f29988.postDelayed(runnable, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m24316(float f) {
        ViewGroup viewGroup = this.f29987;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f29983;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f29998;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24323(final C9191 c9191, View view, int i, int i2, int i3, int i4) {
        int paddingRight;
        int height;
        int paddingBottom;
        int i5;
        C12921 c12921 = c9191.f29988;
        int width = (c12921.getWidth() - c12921.getPaddingLeft()) - c12921.getPaddingRight();
        int height2 = (c12921.getHeight() - c12921.getPaddingBottom()) - c12921.getPaddingTop();
        ViewGroup viewGroup = c9191.f29999;
        int iM24336 = m24336(viewGroup);
        if (viewGroup != null) {
            paddingRight = viewGroup.getPaddingRight() + viewGroup.getPaddingLeft();
        } else {
            paddingRight = 0;
        }
        int i6 = iM24336 - paddingRight;
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
        int iMax = Math.max(i6, m24336(c9191.f29983) + m24336(c9191.f29978));
        ViewGroup viewGroup2 = c9191.f29984;
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
        if (c9191.f30000 != z) {
            c9191.f30000 = z;
            view.post(new Runnable() { // from class: l.ۧۛ᩷
                @Override // java.lang.Runnable
                public final void run() {
                    C9191.m24334(this.f35936);
                }
            });
        }
        boolean z2 = i2 - i != i4 - i3;
        if (c9191.f30000 || !z2) {
            return;
        }
        view.post(new Runnable() { // from class: l.᩻ۛ᩷
            @Override // java.lang.Runnable
            public final void run() {
                C9191.m24339(this.f80457);
            }
        });
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m24334(C9191 c9191) {
        View view = c9191.f29994;
        ViewGroup viewGroup = c9191.f29977;
        if (viewGroup != null) {
            viewGroup.setVisibility(c9191.f30000 ? 0 : 4);
        }
        if (view != null) {
            int dimensionPixelSize = c9191.f29988.getResources().getDimensionPixelSize(R.dimen.MT_Protector);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams != null) {
                if (c9191.f30000) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                view.setLayoutParams(marginLayoutParams);
            }
            if (view instanceof C4146) {
                C4146 c4146 = (C4146) view;
                if (c9191.f30000) {
                    c4146.m13286(true);
                } else {
                    int i = c9191.f29975;
                    if (i == 1) {
                        c4146.m13286(false);
                    } else if (i != 3) {
                        c4146.m13288();
                    }
                }
            }
        }
        for (View view2 : c9191.f29982) {
            view2.setVisibility((c9191.f30000 && m24327(view2)) ? 4 : 0);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m24327(View view) {
        int id = view.getId();
        return id == R.id.MT_Protector || id == R.id.MT_Protector || id == R.id.MT_Protector || id == R.id.MT_Protector || id == R.id.MT_Protector || id == R.id.MT_Protector || id == R.id.MT_Protector;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m24339(C9191 c9191) {
        int i;
        ValueAnimator valueAnimator = c9191.f29981;
        View view = c9191.f29978;
        C12921 c12921 = c9191.f29988;
        ViewGroup viewGroup = c9191.f29989;
        ViewGroup viewGroup2 = c9191.f29998;
        if (viewGroup2 == null || viewGroup == null) {
            return;
        }
        int width = (c12921.getWidth() - c12921.getPaddingLeft()) - c12921.getPaddingRight();
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
        int iM24336 = m24336(c9191.f29983);
        int childCount2 = viewGroup2.getChildCount() - 1;
        for (int i2 = 0; i2 < childCount2; i2++) {
            iM24336 += m24336(viewGroup2.getChildAt(i2));
        }
        if (iM24336 > width) {
            if (view != null) {
                view.setVisibility(0);
                iM24336 += m24336(view);
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt2 = viewGroup2.getChildAt(i3);
                iM24336 -= m24336(childAt2);
                arrayList.add(childAt2);
                if (iM24336 <= width) {
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
        ViewGroup viewGroup3 = c9191.f29987;
        if (viewGroup3 == null || viewGroup3.getVisibility() != 0 || valueAnimator.isStarted()) {
            return;
        }
        c9191.f30001.cancel();
        valueAnimator.start();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m24336(View view) {
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
