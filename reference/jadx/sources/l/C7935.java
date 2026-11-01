package l;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import bin.mt.plus.R;
import com.google.android.material.snackbar.SnackbarManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Y169 */
/* JADX INFO: loaded from: classes3.dex */
public class C7935 extends View {

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static boolean f26061 = true;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f26062 = 0;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C22046 f26063;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f26064;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f26065;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public float f26066;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public View f26067;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f26068;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C17381 f26069;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public Drawable f26070;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public VelocityTracker f26071;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f26072;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final int f26073;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public int f26074;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public long f26075;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f26076;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f26077;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f26078;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public VelocityTracker f26079;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f26080;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f26081;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public View f26082;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f26083;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f26084;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final HandlerC10184 f26085;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public View f26086;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C12874 f26087;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f26088;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22752 f26089;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public EnumC18518 f26090;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Activity f26091;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C21340 f26092;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f26093;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f26094;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f26095;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20951(C7935 c7935, float f) {
        if (c7935.f26080 != f) {
            c7935.f26080 = f;
            c7935.invalidate();
        }
        C17381 c17381 = c7935.f26069;
        if (c17381 != null) {
            int iM40474 = c17381.m40474(c7935.f26082);
            int i = c7935.f26080 == 0.0f ? 0 : 1;
            if (iM40474 != i) {
                c7935.f26069.m40493(i, c7935.f26082);
            }
        }
    }

    public C7935(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [l.۬ۘ᩺] */
    public C7935(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26078 = new ArrayList(5);
        this.f26092 = new C21340();
        this.f26090 = EnumC18518.STATE_1;
        this.f26079 = VelocityTracker.obtain();
        this.f26071 = VelocityTracker.obtain();
        this.f26087 = new InterfaceC0878() { // from class: l.۬ۘ᩺
            @Override // l.InterfaceC0878
            /* JADX INFO: renamed from: ۙ */
            public final void mo3550(float f) {
                C7935.m20951(this.f42820, f);
            }
        };
        this.f26084 = true;
        this.f26085 = new HandlerC10184(this, new C3012());
        this.f26093 = new Rect();
        this.f26073 = ViewConfiguration.get(context).getScaledTouchSlop();
        if (!isInEditMode()) {
            m20968();
            if (f26061) {
                f26061 = false;
                postDelayed(new RunnableC3700(), 62124L);
            }
        }
        this.f26091 = C8703.m22527(context);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20963(boolean z) {
        if (this.f26084 != z) {
            this.f26084 = z;
            if (getPaddingBottom() != 0) {
                requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m20966() {
        return Math.max(getHeight() - (this.f26084 ? getPaddingBottom() : 0), 0);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20970(int i) {
        if (i != getPaddingBottom()) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i);
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m20973() {
        Activity activity;
        String string = ApplicationC0716.f2988.getString("bottom_toolbar_padding_type", "0");
        string.getClass();
        switch (string) {
            case "0":
                if (Build.VERSION.SDK_INT >= 24 && (activity = this.f26091) != null && activity.isInMultiWindowMode()) {
                    m20970(0);
                    break;
                } else {
                    if (C3202.m9622(getContext())) {
                        m20970(C13932.m33769(ApplicationC0716.f2988.getInt("bottom_toolbar_padding_bottom", 12)));
                    } else {
                        m20970(0);
                    }
                    break;
                }
                break;
            case "1":
                m20970(C13932.m33769(ApplicationC0716.f2988.getInt("bottom_toolbar_padding_bottom", 12)));
                break;
            case "2":
                m20970(0);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002d A[PHI: r6
      0x002d: PHI (r6v7 int) = (r6v3 int), (r6v11 int) binds: [B:14:0x0050, B:7:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin;
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int paddingBottom = 0;
        if (mode == Integer.MIN_VALUE) {
            iMin = Math.min((int) getContext().getResources().getDimension(R.dimen.MT_Protector), size - (this.f26084 ? getPaddingBottom() : 0));
            if (this.f26084) {
                paddingBottom = getPaddingBottom();
            }
            size = iMin + paddingBottom;
        } else if (mode != 1073741824) {
            iMin = (int) getContext().getResources().getDimension(R.dimen.MT_Protector);
            if (this.f26084) {
                paddingBottom = getPaddingBottom();
            }
            size = iMin + paddingBottom;
        }
        setMeasuredDimension(defaultSize, size);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m20968() {
        Context context = getContext();
        PorterDuffColorFilter porterDuffColorFilterM24638 = C9682.m24638(C16631.m39095(context.getResources(), R.color.MT_Protector, context.getTheme()));
        this.f26077 = porterDuffColorFilterM24638;
        Drawable drawable = this.f26070;
        if (drawable != null) {
            drawable.setColorFilter(porterDuffColorFilterM24638);
        }
        this.f26092.m47874(C20368.m45983(-12566464, -2697514));
        Iterator it = this.f26078.iterator();
        while (it.hasNext()) {
            ((AbstractC22752) it.next()).mo35970();
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m20972() {
        return this.f26090 == EnumC18518.STATE_1;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m20954() {
        return this.f26090 == EnumC18518.STATE_2;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m20956() {
        EnumC18518 enumC18518 = this.f26090;
        if (enumC18518 == EnumC18518.STATE_2 || enumC18518 == EnumC18518.STATE_1_2) {
            this.f26090 = EnumC18518.STATE_2_1;
            this.f26075 = System.currentTimeMillis();
            int i = C5031.f17539;
            postInvalidateOnAnimation();
            return;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m20965() {
        EnumC18518 enumC18518 = this.f26090;
        if (enumC18518 == EnumC18518.STATE_1 || enumC18518 == EnumC18518.STATE_2_1) {
            this.f26090 = EnumC18518.STATE_1_2;
            this.f26075 = System.currentTimeMillis();
            int i = C5031.f17539;
            postInvalidateOnAnimation();
            return;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m20967(int i, int i2) {
        String string = getContext().getString(i2);
        C12667 c12667 = new C12667(getContext());
        float width = getWidth() / this.f26078.size();
        c12667.mo26444(this, (int) ((width * i) + (width / 2.0f)), m20966() / 2, true, string);
        C16737.m39274(new RunnableC1774(2, c12667), SnackbarManager.SHORT_DURATION_MS);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m20955() {
        return this.f26074;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22752 m20959(int i) {
        return (AbstractC22752) this.f26078.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20960() {
        this.f26078.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14991 m20957(int i, int i2) {
        C14991 c14991 = new C14991(this, C10405.m26304(getContext(), i), C10405.m26304(getContext(), i2));
        this.f26078.add(c14991);
        return c14991;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14991 m20958(C18583 c18583) {
        C14991 c14991 = new C14991(this, c18583, C10405.m26304(getContext(), R.drawable.MT_Protector));
        this.f26078.add(c14991);
        return c14991;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20971(int i, int i2) {
        this.f26078.add(new C17812(this, C10405.m26304(getContext(), i), i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20961(C17381 c17381) {
        if (c17381 == null) {
            this.f26069 = null;
            this.f26082 = null;
            this.f26067 = null;
            return;
        }
        View viewM16500 = C6092.m16500(c17381, 8388611);
        View viewM16501 = C6092.m16500(c17381, 8388613);
        if (viewM16500 == null && viewM16501 == null) {
            throw new RuntimeException();
        }
        this.f26069 = c17381;
        this.f26082 = viewM16500;
        this.f26067 = viewM16501;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20962(C22046 c22046) {
        C22046 c22047 = this.f26063;
        if (c22047 == c22046) {
            this.f26086 = c22046.findViewById(R.id.MT_Protector);
            return;
        }
        C12874 c12874 = this.f26087;
        if (c22047 != null) {
            c22047.m48985(c12874);
        }
        this.f26063 = c22046;
        this.f26080 = 0.0f;
        if (c22046 != null) {
            this.f26086 = c22046.findViewById(R.id.MT_Protector);
            c22046.m48984((InterfaceC0878) c12874);
            if (this.f26070 == null) {
                Drawable drawableM26304 = C10405.m26304(getContext(), R.drawable.MT_Protector);
                this.f26070 = drawableM26304;
                drawableM26304.setColorFilter(this.f26077);
                return;
            }
            return;
        }
        this.f26086 = null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22046 m20969() {
        return this.f26063;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20950(C7935 c7935) {
        if (c7935.f26068) {
            return;
        }
        c7935.f26068 = true;
        if (c7935.performLongClick()) {
            c7935.performHapticFeedback(0);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m20964() {
        return this.f26094;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C17381 c17381;
        View view;
        C17381 c17382;
        View view2;
        AbstractC22752 abstractC22752;
        if (motionEvent.getAction() == 0) {
            this.f26095 = motionEvent.getY() > ((float) m20966());
        }
        if (!this.f26095) {
            int action = motionEvent.getAction();
            HandlerC10184 handlerC10184 = this.f26085;
            C21340 c21340 = this.f26092;
            float f = 0.0f;
            if (action == 0) {
                this.f26065 = motionEvent.getX();
                this.f26076 = motionEvent.getY();
                if (this.f26080 != 0.0f) {
                    this.f26068 = false;
                    this.f26083 = true;
                    this.f26089 = null;
                    c21340.m47877();
                } else {
                    this.f26083 = false;
                    ArrayList arrayList = this.f26078;
                    if (!arrayList.isEmpty()) {
                        int width = (int) (this.f26065 / (getWidth() / arrayList.size()));
                        this.f26074 = width;
                        if (width >= 0 && width < arrayList.size()) {
                            this.f26068 = false;
                            AbstractC22752 abstractC22753 = (AbstractC22752) arrayList.get(this.f26074);
                            this.f26089 = abstractC22753;
                            boolean zMo35971 = abstractC22753.mo35971();
                            boolean zMo35966 = this.f26089.mo35966();
                            if (zMo35971 || zMo35966) {
                                c21340.m47877();
                                this.f26088 = this.f26074;
                            }
                            if (zMo35966) {
                                handlerC10184.sendEmptyMessageDelayed(0, ViewConfiguration.getLongPressTimeout());
                            }
                        } else {
                            this.f26089 = null;
                        }
                    } else {
                        this.f26089 = null;
                    }
                }
                invalidate();
                return true;
            }
            VelocityTracker velocityTracker = this.f26071;
            VelocityTracker velocityTracker2 = this.f26079;
            if (action == 1) {
                handlerC10184.removeMessages(0);
                if (this.f26072) {
                    velocityTracker2.computeCurrentVelocity(1000);
                    float xVelocity = velocityTracker2.getXVelocity();
                    if (xVelocity >= 1000.0f) {
                        c17382 = this.f26069;
                        view2 = this.f26082;
                    } else if (xVelocity > -1000.0f && this.f26066 > 0.4f) {
                        c17382 = this.f26069;
                        view2 = this.f26082;
                    } else {
                        c17381 = this.f26069;
                        view = this.f26082;
                        c17381.m40479(view, true);
                    }
                    c17382.m40487(view2);
                } else if (this.f26081) {
                    velocityTracker2.computeCurrentVelocity(1000);
                    float f2 = -velocityTracker2.getXVelocity();
                    if (f2 >= 1000.0f) {
                        c17382 = this.f26069;
                        view2 = this.f26067;
                    } else if (f2 > -1000.0f && this.f26066 > 0.4f) {
                        c17382 = this.f26069;
                        view2 = this.f26067;
                    } else {
                        c17381 = this.f26069;
                        view = this.f26067;
                        c17381.m40479(view, true);
                    }
                    c17382.m40487(view2);
                } else if (this.f26083) {
                    if (!this.f26068) {
                        this.f26063.m48988();
                    }
                    c21340.m47873();
                } else if (this.f26064) {
                    velocityTracker.computeCurrentVelocity(1000);
                    float yVelocity = velocityTracker.getYVelocity();
                    if (yVelocity <= -1000.0f) {
                        this.f26063.m48989();
                    } else if (yVelocity < 1000.0f && this.f26080 > 0.4f) {
                        this.f26063.m48989();
                    } else {
                        this.f26063.m48988();
                    }
                }
                c21340.m47872();
                if (!this.f26068 && (abstractC22752 = this.f26089) != null && abstractC22752.mo35971()) {
                    performClick();
                }
                this.f26072 = false;
                this.f26081 = false;
                velocityTracker2.clear();
                this.f26066 = 0.0f;
                this.f26064 = false;
                velocityTracker.clear();
                invalidate();
                return true;
            }
            if (action == 2) {
                if (!this.f26068) {
                    float x = this.f26065 - motionEvent.getX();
                    float y = this.f26076 - motionEvent.getY();
                    float fAbs = Math.abs(x);
                    float fAbs2 = Math.abs(y);
                    float f3 = this.f26073;
                    if (fAbs > f3 || fAbs2 > f3) {
                        if (this.f26083) {
                            c21340.m47873();
                        } else if (this.f26069 != null && fAbs > fAbs2) {
                            View view3 = this.f26082;
                            if (view3 == null || this.f26067 == null) {
                                if (view3 != null) {
                                    this.f26072 = true;
                                } else if (this.f26067 != null) {
                                    this.f26081 = true;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else if (x < 0.0f) {
                                this.f26072 = true;
                            } else {
                                this.f26081 = true;
                            }
                            c21340.m47872();
                        } else if (this.f26063 != null && fAbs <= fAbs2) {
                            this.f26064 = true;
                            c21340.m47873();
                            this.f26094 = this.f26065 < ((float) getWidth()) / 2.0f;
                        }
                        this.f26068 = true;
                        handlerC10184.removeMessages(0);
                        invalidate();
                    }
                }
                float f4 = 1.0f;
                if (this.f26072) {
                    velocityTracker2.addMovement(motionEvent);
                    float x2 = (motionEvent.getX() - this.f26065) / (getWidth() / 2.0f);
                    if (x2 <= 1.0f) {
                        f4 = x2 < 0.0f ? 0.0f : x2;
                    }
                    if (f4 == 0.0f) {
                        if (this.f26082.getVisibility() == 0) {
                            this.f26082.setVisibility(4);
                        }
                    } else if (this.f26082.getVisibility() == 4) {
                        this.f26082.setVisibility(0);
                    }
                    this.f26066 = f4;
                    C6092.m16501(this.f26069, this.f26082, f4);
                    return true;
                }
                if (this.f26081) {
                    velocityTracker2.addMovement(motionEvent);
                    float x3 = (this.f26065 - motionEvent.getX()) / (getWidth() / 2.0f);
                    if (x3 <= 1.0f) {
                        f4 = x3 < 0.0f ? 0.0f : x3;
                    }
                    if (f4 == 0.0f) {
                        if (this.f26067.getVisibility() == 0) {
                            this.f26067.setVisibility(4);
                        }
                    } else if (this.f26067.getVisibility() == 4) {
                        this.f26067.setVisibility(0);
                    }
                    this.f26066 = f4;
                    C6092.m16501(this.f26069, this.f26067, f4);
                    return true;
                }
                if (this.f26064) {
                    velocityTracker.addMovement(motionEvent);
                    View view4 = this.f26086;
                    float height = view4 == null ? 0.0f : view4.getHeight() / 1.5f;
                    if (height == 0.0f) {
                        height = m20966() * 2.0f;
                    }
                    float y2 = (this.f26076 - motionEvent.getY()) / height;
                    if (y2 > 1.0f) {
                        f = 1.0f;
                    } else if (y2 >= 0.0f) {
                        f = y2;
                    }
                    this.f26063.m48991(f);
                }
            } else if (action == 3) {
                if (this.f26072) {
                    this.f26069.m40487(this.f26082);
                }
                if (this.f26081) {
                    this.f26069.m40487(this.f26067);
                }
                if (this.f26064) {
                    this.f26063.m48988();
                    c21340.m47873();
                }
                c21340.m47872();
                handlerC10184.removeMessages(0);
                this.f26072 = false;
                this.f26081 = false;
                velocityTracker2.clear();
                this.f26066 = 0.0f;
                this.f26064 = false;
                velocityTracker.clear();
                invalidate();
                return true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        ArrayList<AbstractC22752> arrayList = this.f26078;
        if (arrayList.isEmpty()) {
            return;
        }
        int iM20966 = m20966();
        float width = getWidth() / arrayList.size();
        float f3 = width / 2.0f;
        float f4 = iM20966 / 2.0f;
        canvas.clipRect(0, 0, getWidth(), iM20966);
        int i = C6523.f21978[this.f26090.ordinal()];
        if (i != 1) {
            if (i == 2) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f26075;
                if (jCurrentTimeMillis >= 250) {
                    this.f26090 = EnumC18518.STATE_2;
                    f2 = 1.0f;
                } else {
                    f2 = jCurrentTimeMillis / 250.0f;
                    int i2 = C5031.f17539;
                    postInvalidateOnAnimation();
                }
            } else if (i == 3) {
                f2 = 1.0f;
            } else if (i != 4) {
                f2 = 0.0f;
            } else {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f26075;
                if (jCurrentTimeMillis2 >= 250) {
                    this.f26090 = EnumC18518.STATE_1;
                    f2 = 0.0f;
                } else {
                    int i3 = C5031.f17539;
                    postInvalidateOnAnimation();
                    f2 = 1.0f - (jCurrentTimeMillis2 / 250.0f);
                }
            }
            f = 2.0f;
        } else {
            f = 2.0f;
            f2 = 0.0f;
        }
        C21340 c21340 = this.f26092;
        if (c21340.m47876()) {
            if (this.f26083) {
                float width2 = getWidth() / f;
                if (c21340.m47875(canvas, (int) Math.round(Math.sqrt((width2 * width2) + (f4 * f4))), width2, f4)) {
                    int i4 = C5031.f17539;
                    postInvalidateOnAnimation();
                }
            } else {
                if (c21340.m47875(canvas, (int) Math.round(Math.sqrt((f3 * f3) + (f4 * f4))), (this.f26088 * width) + f3, f4)) {
                    int i5 = C5031.f17539;
                    postInvalidateOnAnimation();
                }
            }
        }
        float f5 = this.f26080;
        Rect rect = this.f26093;
        if (f5 <= 0.5f) {
            float f6 = 1.0f - (f5 * f);
            for (AbstractC22752 abstractC22752 : arrayList) {
                int iMo35972 = abstractC22752.mo35972();
                int iMo35967 = abstractC22752.mo35967();
                if (f5 != 0.0f) {
                    iMo35967 = (int) (iMo35967 * f6);
                }
                int i6 = (int) (f3 - (iMo35972 / f));
                rect.left = i6;
                rect.right = i6 + iMo35972;
                int i7 = (int) (f4 - (iMo35967 / f));
                rect.top = i7;
                rect.bottom = i7 + iMo35967;
                abstractC22752.mo35968(canvas, rect, f2, f6);
                f3 += width;
            }
        }
        if (f5 >= 0.5f) {
            Drawable drawable = this.f26070;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = (int) (((f5 * f) - 1.0f) * drawable.getIntrinsicHeight());
            int width3 = (getWidth() - intrinsicWidth) / 2;
            rect.left = width3;
            rect.right = width3 + intrinsicWidth;
            int i8 = (iM20966 - intrinsicHeight) / 2;
            rect.top = i8;
            rect.bottom = i8 + intrinsicHeight;
            drawable.setBounds(rect);
            drawable.setAlpha((int) ((f5 - 0.5f) * 153.0f * f));
            drawable.draw(canvas);
        }
    }
}
