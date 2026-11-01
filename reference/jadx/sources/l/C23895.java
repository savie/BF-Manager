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

/* JADX INFO: renamed from: l.᩻᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2APP */
/* JADX INFO: loaded from: classes.dex */
public class C23895 extends ViewGroup {

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f77406 = 0;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f77407 = new WeakHashMap();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Context f77408;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public float f77409;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f77410;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final TabLayout f77411;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f77412;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f77413;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final float f77414;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f77415;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Paint f77416;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f77417;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC7021 f77418;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int[] f77419;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public VelocityTracker f77420;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C13708 f77421;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f77422;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C10940 f77423;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f77424;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f77425;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f77426;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public float f77427;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f77428;

    public C23895(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C23895(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f77418 = new ViewOnLongClickListenerC7021(1);
        this.f77419 = new int[2];
        this.f77420 = VelocityTracker.obtain();
        this.f77414 = ViewConfiguration.get(context).getScaledTouchSlop();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TabLayout tabLayout = (TabLayout) layoutInflaterFrom.inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        this.f77411 = tabLayout;
        C10940 c10940 = (C10940) layoutInflaterFrom.inflate(R.layout.MT_Protector, (ViewGroup) this, false);
        this.f77423 = c10940;
        C13708 c13708 = new C13708(context, null);
        this.f77421 = c13708;
        addView(tabLayout);
        addView(c10940);
        addView(c13708, -1, -2);
        tabLayout.setupWithViewPager(c13708);
        c13708.m44421(new InterfaceC15150() { // from class: l.ܿ᩵ۖ
            @Override // l.InterfaceC15150
            public final void onAdapterChanged(C19383 c19383, AbstractC14217 abstractC14217, AbstractC14217 abstractC14218) {
                C23895.m52670(this.f55768, c19383);
            }
        });
        Activity activityM22527 = C8703.m22527(context);
        this.f77408 = activityM22527 != null ? activityM22527 : context;
        Paint paint = new Paint();
        this.f77416 = paint;
        paint.setStyle(Paint.Style.FILL);
        m52674();
        m52671();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52670(C23895 c23895, C19383 c19383) {
        C10940 c10940 = c23895.f77423;
        c10940.getClass();
        C13465.m32966(c19383, "viewPager");
        AbstractC0977.m3767(c10940, c19383);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m52674() {
        int i;
        int i2;
        if (isInEditMode()) {
            i = 1;
        } else {
            int i3 = C7754.f25604;
            i = ApplicationC0716.f2992.getInt("text_function_min_line", 1);
        }
        if (isInEditMode()) {
            i2 = 1;
        } else {
            int i4 = C7754.f25604;
            i2 = ApplicationC0716.f2992.getInt("text_function_max_line", 4);
        }
        int i5 = i >= 1 ? i : 1;
        if (i2 < i5) {
            i2 = i5;
        }
        if (this.f77422 == i5 && this.f77415 == i2) {
            return;
        }
        this.f77422 = i5;
        this.f77415 = i2;
        requestLayout();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m52671() {
        int i;
        if (isInEditMode()) {
            i = 0;
        } else {
            int i2 = C7754.f25604;
            i = ApplicationC0716.f2992.getInt("tfgi", 0);
        }
        C10940 c10940 = this.f77423;
        TabLayout tabLayout = this.f77411;
        if (i == 0) {
            tabLayout.setVisibility(0);
            c10940.setVisibility(8);
        } else if (i == 1) {
            tabLayout.setVisibility(8);
            c10940.setVisibility(0);
        } else {
            if (i != 2) {
                return;
            }
            tabLayout.setVisibility(8);
            c10940.setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int i3;
        boolean zM39484;
        if (this.f77424) {
            this.f77424 = false;
            if (this.f77412 == i && View.MeasureSpec.getMode(i2) == 1073741824) {
                setMeasuredDimension(getMeasuredWidth(), View.MeasureSpec.getSize(i2));
                return;
            }
        }
        this.f77412 = i;
        C13708 c13708 = this.f77421;
        c13708.measure(i, 0);
        View view = this.f77411;
        if (view.getVisibility() != 8) {
            view.measure(i, View.MeasureSpec.makeMeasureSpec(view.getLayoutParams().height, 1073741824));
        } else {
            view = this.f77423;
            if (view.getVisibility() != 8) {
                view.measure(View.MeasureSpec.makeMeasureSpec(c13708.getMeasuredWidth(), Integer.MIN_VALUE), 0);
            } else {
                view = null;
            }
        }
        C4534 c4534M33411 = c13708.m33411();
        if (isInEditMode()) {
            int iM33415 = c13708.m33415();
            measuredHeight = c13708.getMeasuredHeight();
            i3 = iM33415;
        } else {
            int i4 = C7754.f25604;
            if (ApplicationC0716.f2992.getBoolean("tfugh", true)) {
                int iM33416 = c13708.m33415();
                measuredHeight = c13708.getMeasuredHeight();
                i3 = iM33416;
            } else if (c4534M33411 != null) {
                i3 = c4534M33411.f16130;
                measuredHeight = c4534M33411.f16127;
            } else {
                i3 = 0;
                measuredHeight = 0;
            }
        }
        int measuredHeight2 = view != null ? view.getMeasuredHeight() : 0;
        int iMin = Math.min(measuredHeight, this.f77422 * i3);
        int iMin2 = Math.min(measuredHeight, i3 * this.f77415);
        this.f77417 = iMin2;
        this.f77425 = iMin2 + measuredHeight2;
        this.f77428 = iMin;
        if (C16839.m39487()) {
            zM39484 = C16839.m39484();
        } else {
            zM39484 = f77407.get(this.f77408) == Boolean.TRUE;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), zM39484 ? this.f77425 : this.f77428);
        if (c4534M33411 != null) {
            C14723 c14723 = c4534M33411.f16129;
            int iMax = Math.max(0, c4534M33411.f16127 - this.f77417);
            if (c14723.getScrollY() > iMax) {
                c14723.setScrollY(iMax);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TabLayout tabLayout = this.f77411;
        int visibility = tabLayout.getVisibility();
        C13708 c13708 = this.f77421;
        if (visibility != 8) {
            int i5 = i4 - i2;
            int i6 = this.f77428;
            float f = (i5 - i6) / (this.f77425 - i6);
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
                        tabView.setOnLongClickListener(this.f77418);
                    }
                }
            }
            int measuredHeight = (int) (tabLayout.getMeasuredHeight() * f);
            c13708.layout(0, measuredHeight, i7, this.f77417 + measuredHeight);
            return;
        }
        int i9 = i3 - i;
        c13708.layout(0, 0, i9, this.f77417);
        C10940 c10940 = this.f77423;
        if (c10940.getVisibility() != 8) {
            int measuredWidth = c10940.getMeasuredWidth();
            int i10 = (i9 - measuredWidth) / 2;
            c10940.layout(i10, this.f77417, measuredWidth + i10, this.f77425);
            int[] iArr = this.f77419;
            getLocationOnScreen(iArr);
            if (getHeight() + iArr[1] == C13932.f45878.y) {
                if (c10940.getPaddingTop() == 0) {
                    int iM33769 = C13932.m33769(4.0f);
                    c10940.setPadding(0, iM33769, 0, iM33769);
                    return;
                }
                return;
            }
            if (c10940.getPaddingTop() != 0) {
                c10940.setPadding(0, 0, 0, 0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C4534 c4534M33411 = this.f77421.m33411();
        if (c4534M33411 != null) {
            C14723 c14723 = c4534M33411.f16129;
            int iMax = Math.max(0, c4534M33411.f16127 - this.f77417);
            if (this.f77428 == this.f77425 && iMax == 0) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 2) {
                    m52668(motionEvent);
                    float fAbs = Math.abs(motionEvent.getRawX() - this.f77427);
                    float fAbs2 = Math.abs(motionEvent.getRawY() - this.f77409);
                    if (fAbs2 > this.f77414 && fAbs2 > fAbs) {
                        this.f77426 = true;
                        this.f77413 = motionEvent.getRawY();
                        return true;
                    }
                }
                return false;
            }
            this.f77426 = false;
            this.f77427 = motionEvent.getRawX();
            this.f77409 = motionEvent.getRawY();
            c14723.m35247();
            this.f77420.clear();
            m52668(motionEvent);
            if (m52667() == this.f77425 && iMax != 0) {
                if (c14723.getScrollY() != 0 || this.f77425 == this.f77428) {
                    this.f77410 = 2;
                    return false;
                }
                this.f77410 = 0;
                return false;
            }
            this.f77410 = 1;
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C4534 c4534M33411 = this.f77421.m33411();
        int i = 0;
        if (c4534M33411 != null) {
            C14723 c14723 = c4534M33411.f16129;
            int iMax = Math.max(0, c4534M33411.f16127 - this.f77417);
            if (!this.f77426) {
                if (this.f77428 != this.f77425 || iMax != 0) {
                    onInterceptTouchEvent(motionEvent);
                    return true;
                }
            } else {
                int action = motionEvent.getAction();
                if (action != 1) {
                    if (action == 2) {
                        m52668(motionEvent);
                        float rawY = motionEvent.getRawY() - this.f77413;
                        if (this.f77410 == 0) {
                            if (rawY > 0.0f) {
                                this.f77410 = 1;
                            } else if (rawY < 0.0f) {
                                this.f77410 = 2;
                            }
                        }
                        int i2 = this.f77410;
                        if (i2 == 1) {
                            int iM52667 = (int) (m52667() - (rawY * 1.2f));
                            int i3 = this.f77425;
                            if (iM52667 > i3 || iM52667 < (i3 = this.f77428)) {
                                iM52667 = i3;
                            }
                            m52672(iM52667);
                        } else if (i2 == 2) {
                            int scrollY = (int) (c14723.getScrollY() - rawY);
                            if (scrollY > iMax) {
                                i = iMax;
                            } else if (scrollY >= 0) {
                                i = scrollY;
                            }
                            if (i != c14723.getScrollY()) {
                                c14723.setScrollY(i);
                            } else if (rawY > 0.0f && i == 0) {
                                c14723.m35252(rawY / getHeight(), motionEvent.getX() / getWidth());
                            } else if (rawY < 0.0f && i == iMax) {
                                c14723.m35248((-rawY) / getHeight(), 1.0f - (motionEvent.getX() / getWidth()));
                            }
                        }
                        this.f77413 = motionEvent.getRawY();
                        return true;
                    }
                    if (action != 3) {
                        return true;
                    }
                }
                this.f77426 = false;
                c14723.m35250();
                VelocityTracker velocityTracker = this.f77420;
                velocityTracker.computeCurrentVelocity(1000);
                float yVelocity = velocityTracker.getYVelocity();
                if (this.f77410 == 2) {
                    c14723.m35249((int) (-yVelocity), iMax);
                    return true;
                }
                if (yVelocity <= -800.0f) {
                    m52680();
                    return true;
                }
                if (yVelocity >= 800.0f) {
                    m52675();
                    return true;
                }
                if (m52681() > 0.4f) {
                    m52680();
                    return true;
                }
                m52675();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m52668(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getMetaState());
        this.f77420.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m52672(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams.height != i) {
            int i2 = this.f77428;
            Context context = this.f77408;
            WeakHashMap weakHashMap = f77407;
            if (i == i2) {
                weakHashMap.put(context, Boolean.FALSE);
                C16839.m39491(false);
            } else if (i == this.f77425) {
                weakHashMap.put(context, Boolean.TRUE);
                C16839.m39491(true);
            }
            layoutParams.height = i;
            this.f77424 = true;
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private int m52667() {
        int i = getLayoutParams().height;
        return i < 0 ? getHeight() : i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52679(InterfaceC21499 interfaceC21499) {
        this.f77421.m44422(interfaceC21499);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52676(int i) {
        this.f77421.m44413(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m52681() {
        int iM52667 = m52667();
        int i = this.f77428;
        float f = iM52667 - i;
        float f2 = this.f77425 - i;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f / f2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m52680() {
        int iM52667 = m52667();
        int i = this.f77425;
        if (iM52667 != i) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iM52667, i);
            valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfInt.setDuration((long) ((1.0f - m52681()) * 250.0f));
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۧ᩵ۖ
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f37902.m52672(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            valueAnimatorOfInt.start();
        }
        this.f77421.m33412();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52675() {
        int iM52667 = m52667();
        int i = this.f77428;
        if (iM52667 != i) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iM52667, i);
            valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfInt.setDuration((long) (m52681() * 250.0f));
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۛ᩵ۖ
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f21216.m52672(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            valueAnimatorOfInt.start();
        }
        this.f77421.m33412();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52678(ArrayList arrayList, InterfaceC4433 interfaceC4433, C10948 c10948, C10948 c10949) {
        this.f77421.m33414(arrayList, interfaceC4433, c10948, c10949);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52677(ArrayList arrayList) {
        this.f77421.m33413(arrayList);
        m52674();
        m52671();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = -2;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i = C20368.f66006;
        Paint paint = this.f77416;
        paint.setColor(i);
        float scrollX = getScrollX();
        float width = scrollX + getWidth();
        float scrollY = getScrollY();
        canvas.drawRect(scrollX, scrollY, width, scrollY + 1.0f, paint);
    }
}
