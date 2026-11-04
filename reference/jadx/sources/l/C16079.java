package l;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import bin.mt.plus.R;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ܶۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 2APP */
/* JADX INFO: loaded from: classes4.dex */
public class C16079 extends ViewGroup {

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f52096 = 0;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f52097 = new WeakHashMap();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f52098;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f52099;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f52100;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f52101;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public VelocityTracker f52102;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Paint f52103;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int[] f52104;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f52105;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f52106;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f52107;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC11604 f52108;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public float f52109;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f52110;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C5676 f52111;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public float f52112;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Context f52113;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f52114;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final float f52115;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f52116;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C4147 f52117;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final TabLayout f52118;

    public C16079(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C16079(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52108 = new ViewOnLongClickListenerC11604();
        this.f52104 = new int[2];
        this.f52102 = VelocityTracker.obtain();
        this.f52115 = ViewConfiguration.get(context).getScaledTouchSlop();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TabLayout tabLayout = (TabLayout) layoutInflaterFrom.inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        this.f52118 = tabLayout;
        C5676 c5676 = (C5676) layoutInflaterFrom.inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        this.f52111 = c5676;
        C4147 c4147 = new C4147(context, null);
        this.f52117 = c4147;
        addView(tabLayout);
        addView(c5676);
        addView(c4147, -1, -2);
        tabLayout.setupWithViewPager(c4147);
        c4147.m36515(new InterfaceC13730() { // from class: l.᩻ۨ᩸
            @Override // l.InterfaceC13730
            public final void onAdapterChanged(C15179 c15179, AbstractC6274 abstractC6274, AbstractC6274 abstractC6275) {
                C16079.m38229(this.f80997, c15179);
            }
        });
        Activity activityM10534 = C3200.m10534(context);
        this.f52113 = activityM10534 != null ? activityM10534 : context;
        Paint paint = new Paint();
        this.f52103 = paint;
        paint.setStyle(Paint.Style.FILL);
        m38230();
        m38231();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38229(C16079 c16079, C15179 c15179) {
        C5676 c5676 = c16079.f52111;
        c5676.getClass();
        C15243.m36590(c15179, "viewPager");
        AbstractC6422.m18186(c5676, c15179);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m38230() {
        int i;
        int i2;
        if (isInEditMode()) {
            i = 1;
        } else {
            int i3 = C24832.f80322;
            i = ApplicationC17729.f58258.getInt("text_function_min_line", 1);
        }
        if (isInEditMode()) {
            i2 = 1;
        } else {
            int i4 = C24832.f80322;
            i2 = ApplicationC17729.f58258.getInt("text_function_max_line", 4);
        }
        int i5 = i >= 1 ? i : 1;
        if (i2 < i5) {
            i2 = i5;
        }
        if (this.f52100 == i5 && this.f52107 == i2) {
            return;
        }
        this.f52100 = i5;
        this.f52107 = i2;
        requestLayout();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m38231() {
        int i;
        if (isInEditMode()) {
            i = 0;
        } else {
            int i2 = C24832.f80322;
            i = ApplicationC17729.f58258.getInt("tfgi", 0);
        }
        C5676 c5676 = this.f52111;
        TabLayout tabLayout = this.f52118;
        if (i == 0) {
            tabLayout.setVisibility(0);
            c5676.setVisibility(8);
        } else if (i == 1) {
            tabLayout.setVisibility(8);
            c5676.setVisibility(0);
        } else {
            if (i != 2) {
                return;
            }
            tabLayout.setVisibility(8);
            c5676.setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int i3;
        boolean zM16624;
        if (this.f52098) {
            this.f52098 = false;
            if (this.f52110 == i && View.MeasureSpec.getMode(i2) == 1073741824) {
                setMeasuredDimension(getMeasuredWidth(), View.MeasureSpec.getSize(i2));
                return;
            }
        }
        this.f52110 = i;
        C4147 c4147 = this.f52117;
        c4147.measure(i, 0);
        View view = this.f52118;
        if (view.getVisibility() != 8) {
            view.measure(i, View.MeasureSpec.makeMeasureSpec(view.getLayoutParams().height, 1073741824));
        } else {
            view = this.f52111;
            if (view.getVisibility() != 8) {
                view.measure(View.MeasureSpec.makeMeasureSpec(c4147.getMeasuredWidth(), Integer.MIN_VALUE), 0);
            } else {
                view = null;
            }
        }
        C24285 c24285M13300 = c4147.m13300();
        if (isInEditMode()) {
            int iM13299 = c4147.m13299();
            measuredHeight = c4147.getMeasuredHeight();
            i3 = iM13299;
        } else {
            int i4 = C24832.f80322;
            if (ApplicationC17729.f58258.getBoolean("tfugh", true)) {
                int iM132910 = c4147.m13299();
                measuredHeight = c4147.getMeasuredHeight();
                i3 = iM132910;
            } else if (c24285M13300 != null) {
                i3 = c24285M13300.f78604;
                measuredHeight = c24285M13300.f78608;
            } else {
                i3 = 0;
                measuredHeight = 0;
            }
        }
        int measuredHeight2 = view != null ? view.getMeasuredHeight() : 0;
        int iMin = Math.min(measuredHeight, this.f52100 * i3);
        int iMin2 = Math.min(measuredHeight, i3 * this.f52107);
        this.f52099 = iMin2;
        this.f52114 = iMin2 + measuredHeight2;
        this.f52106 = iMin;
        if (C5639.m16621()) {
            zM16624 = C5639.m16624();
        } else {
            zM16624 = f52097.get(this.f52113) == Boolean.TRUE;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), zM16624 ? this.f52114 : this.f52106);
        if (c24285M13300 != null) {
            C23539 c23539 = c24285M13300.f78606;
            int iMax = Math.max(0, c24285M13300.f78608 - this.f52099);
            if (c23539.getScrollY() > iMax) {
                c23539.setScrollY(iMax);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TabLayout tabLayout = this.f52118;
        int visibility = tabLayout.getVisibility();
        C4147 c4147 = this.f52117;
        if (visibility != 8) {
            int i5 = i4 - i2;
            int i6 = this.f52106;
            float f = (i5 - i6) / (this.f52114 - i6);
            int i7 = i3 - i;
            tabLayout.layout(0, 0, i7, tabLayout.getMeasuredHeight());
            tabLayout.setAlpha(Math.max(0.0f, (f - 0.5f) * 2.0f));
            if (f == 0.0f) {
                if (tabLayout.getVisibility() != 4) {
                    tabLayout.setVisibility(4);
                }
            } else if (tabLayout.getVisibility() != 0) {
                tabLayout.setVisibility(0);
            }
            if (f == 1.0f) {
                for (int i8 = 0; i8 < tabLayout.getTabCount(); i8++) {
                    TabLayout.Tab tabAt = tabLayout.getTabAt(i8);
                    if (tabAt != null) {
                        TabLayout.TabView tabView = tabAt.view;
                        tabView.setTag(R.id.tabLayout, Integer.valueOf(i8));
                        tabView.setOnLongClickListener(this.f52108);
                    }
                }
            }
            int measuredHeight = (int) (tabLayout.getMeasuredHeight() * f);
            c4147.layout(0, measuredHeight, i7, this.f52099 + measuredHeight);
            return;
        }
        int i9 = i3 - i;
        c4147.layout(0, 0, i9, this.f52099);
        C5676 c5676 = this.f52111;
        if (c5676.getVisibility() != 8) {
            int measuredWidth = c5676.getMeasuredWidth();
            int i10 = (i9 - measuredWidth) / 2;
            c5676.layout(i10, this.f52099, measuredWidth + i10, this.f52114);
            int[] iArr = this.f52104;
            getLocationOnScreen(iArr);
            if (getHeight() + iArr[1] == C6907.f22901.y) {
                if (c5676.getPaddingTop() == 0) {
                    int iM19160 = C6907.m19160(4.0f);
                    c5676.setPadding(0, iM19160, 0, iM19160);
                    return;
                }
                return;
            }
            if (c5676.getPaddingTop() != 0) {
                c5676.setPadding(0, 0, 0, 0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C24285 c24285M13300 = this.f52117.m13300();
        if (c24285M13300 != null) {
            C23539 c23539 = c24285M13300.f78606;
            int iMax = Math.max(0, c24285M13300.f78608 - this.f52099);
            if (this.f52106 == this.f52114 && iMax == 0) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 2) {
                    m38227(motionEvent);
                    float fAbs = Math.abs(motionEvent.getRawX() - this.f52112);
                    float fAbs2 = Math.abs(motionEvent.getRawY() - this.f52109);
                    if (fAbs2 > this.f52115 && fAbs2 > fAbs) {
                        this.f52116 = true;
                        this.f52101 = motionEvent.getRawY();
                        return true;
                    }
                }
                return false;
            }
            this.f52116 = false;
            this.f52112 = motionEvent.getRawX();
            this.f52109 = motionEvent.getRawY();
            c23539.m52742();
            this.f52102.clear();
            m38227(motionEvent);
            if (m38234() == this.f52114 && iMax != 0) {
                if (c23539.getScrollY() != 0 || this.f52114 == this.f52106) {
                    this.f52105 = 2;
                    return false;
                }
                this.f52105 = 0;
                return false;
            }
            this.f52105 = 1;
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C24285 c24285M13300 = this.f52117.m13300();
        int i = 0;
        if (c24285M13300 != null) {
            C23539 c23539 = c24285M13300.f78606;
            int iMax = Math.max(0, c24285M13300.f78608 - this.f52099);
            if (!this.f52116) {
                if (this.f52106 != this.f52114 || iMax != 0) {
                    onInterceptTouchEvent(motionEvent);
                    return true;
                }
            } else {
                int action = motionEvent.getAction();
                if (action != 1) {
                    if (action == 2) {
                        m38227(motionEvent);
                        float rawY = motionEvent.getRawY() - this.f52101;
                        if (this.f52105 == 0) {
                            if (rawY > 0.0f) {
                                this.f52105 = 1;
                            } else if (rawY < 0.0f) {
                                this.f52105 = 2;
                            }
                        }
                        int i2 = this.f52105;
                        if (i2 == 1) {
                            int iM38234 = (int) (m38234() - (rawY * 1.2f));
                            int i3 = this.f52114;
                            if (iM38234 > i3 || iM38234 < (i3 = this.f52106)) {
                                iM38234 = i3;
                            }
                            m38232(iM38234);
                        } else if (i2 == 2) {
                            int scrollY = (int) (c23539.getScrollY() - rawY);
                            if (scrollY > iMax) {
                                i = iMax;
                            } else if (scrollY >= 0) {
                                i = scrollY;
                            }
                            if (i != c23539.getScrollY()) {
                                c23539.setScrollY(i);
                            } else if (rawY > 0.0f && i == 0) {
                                c23539.m52747(rawY / getHeight(), motionEvent.getX() / getWidth());
                            } else if (rawY < 0.0f && i == iMax) {
                                c23539.m52743((-rawY) / getHeight(), 1.0f - (motionEvent.getX() / getWidth()));
                            }
                        }
                        this.f52101 = motionEvent.getRawY();
                        return true;
                    }
                    if (action != 3) {
                        return true;
                    }
                }
                this.f52116 = false;
                c23539.m52745();
                VelocityTracker velocityTracker = this.f52102;
                velocityTracker.computeCurrentVelocity(1000);
                float yVelocity = velocityTracker.getYVelocity();
                if (this.f52105 == 2) {
                    c23539.m52744((int) (-yVelocity), iMax);
                    return true;
                }
                if (yVelocity <= -800.0f) {
                    m38240();
                    return true;
                }
                if (yVelocity >= 800.0f) {
                    m38235();
                    return true;
                }
                if (m38241() > 0.4f) {
                    m38240();
                    return true;
                }
                m38235();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38227(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getMetaState());
        this.f52102.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m38232(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams.height != i) {
            int i2 = this.f52106;
            Context context = this.f52113;
            WeakHashMap weakHashMap = f52097;
            if (i == i2) {
                weakHashMap.put(context, Boolean.FALSE);
                C5639.m16623(false);
            } else if (i == this.f52114) {
                weakHashMap.put(context, Boolean.TRUE);
                C5639.m16623(true);
            }
            layoutParams.height = i;
            this.f52098 = true;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private int m38234() {
        int i = getLayoutParams().height;
        return i < 0 ? getHeight() : i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38239(InterfaceC4739 interfaceC4739) {
        this.f52117.m36513(interfaceC4739);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38236(int i) {
        this.f52117.m36527(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m38241() {
        int iM38234 = m38234();
        int i = this.f52106;
        float f = iM38234 - i;
        float f2 = this.f52114 - i;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f / f2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m38240() {
        int iM38234 = m38234();
        int i = this.f52114;
        if (iM38234 != i) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iM38234, i);
            valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfInt.setDuration((long) ((1.0f - m38241()) * 250.0f));
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܽۨ᩸
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f57094.m38232(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            valueAnimatorOfInt.start();
        }
        this.f52117.m13298();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38235() {
        int iM38234 = m38234();
        int i = this.f52106;
        if (iM38234 != i) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iM38234, i);
            valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfInt.setDuration((long) (m38241() * 250.0f));
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ܺۨ᩸
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f54284.m38232(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            valueAnimatorOfInt.start();
        }
        this.f52117.m13298();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38238(ArrayList arrayList, InterfaceC7960 interfaceC7960, C23255 c23255, C23255 c23256) {
        this.f52117.m13297(arrayList, interfaceC7960, c23255, c23256);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38237(ArrayList arrayList) {
        this.f52117.m13296(arrayList);
        m38230();
        m38231();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = -2;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i = C3296.f10757;
        Paint paint = this.f52103;
        paint.setColor(i);
        float scrollX = getScrollX();
        float width = scrollX + getWidth();
        float scrollY = getScrollY();
        canvas.drawRect(scrollX, scrollY, width, scrollY + 1.0f, paint);
    }
}
