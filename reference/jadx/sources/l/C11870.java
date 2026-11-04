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

/* JADX INFO: renamed from: l.ۧ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y169 */
/* JADX INFO: loaded from: classes3.dex */
public class C11870 extends View {

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f38250 = 0;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static boolean f38251 = true;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public View f38252;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f38253;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f38254;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f38255;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public int f38256;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C8147 f38257;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f38258;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public PorterDuffColorFilter f38259;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f38260;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f38261;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f38262;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f38263;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public VelocityTracker f38264;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public VelocityTracker f38265;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean f38266;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public long f38267;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f38268;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public View f38269;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HandlerC13547 f38270;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final Rect f38271;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f38272;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f38273;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final C13362 f38274;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7198 f38275;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C5159 f38276;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public Drawable f38277;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public EnumC2176 f38278;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Activity f38279;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public View f38280;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public float f38281;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20075 f38282;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final int f38283;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public boolean f38284;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29734(C11870 c11870, float f) {
        if (c11870.f38261 != f) {
            c11870.f38261 = f;
            c11870.invalidate();
        }
        C8147 c8147 = c11870.f38257;
        if (c8147 != null) {
            int iM22034 = c8147.m22034(c11870.f38280);
            int i = c11870.f38261 == 0.0f ? 0 : 1;
            if (iM22034 != i) {
                c11870.f38257.m22055(i, c11870.f38280);
            }
        }
    }

    public C11870(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [l.ۙ᩶᩻] */
    public C11870(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38253 = new ArrayList(5);
        this.f38274 = new C13362();
        this.f38278 = EnumC2176.STATE_1;
        this.f38265 = VelocityTracker.obtain();
        this.f38264 = VelocityTracker.obtain();
        this.f38276 = new InterfaceC13909() { // from class: l.ۙ᩶᩻
            @Override // l.InterfaceC13909
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final void mo15578(float f) {
                C11870.m29734(this.f18003, f);
            }
        };
        this.f38273 = true;
        this.f38270 = new HandlerC13547(this, new C22313());
        this.f38271 = new Rect();
        this.f38283 = ViewConfiguration.get(context).getScaledTouchSlop();
        if (!isInEditMode()) {
            m29745();
            if (f38251) {
                f38251 = false;
                postDelayed(new RunnableC11124(), 62124L);
            }
        }
        this.f38279 = C3200.m10534(context);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29744(boolean z) {
        if (this.f38273 != z) {
            this.f38273 = z;
            if (getPaddingBottom() != 0) {
                requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m29746() {
        return Math.max(getHeight() - (this.f38273 ? getPaddingBottom() : 0), 0);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29753(int i) {
        if (i != getPaddingBottom()) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i);
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m29756() {
        Activity activity;
        String string = ApplicationC17729.f58262.getString("bottom_toolbar_padding_type", "0");
        string.getClass();
        switch (string) {
            case "0":
                if (Build.VERSION.SDK_INT >= 24 && (activity = this.f38279) != null && activity.isInMultiWindowMode()) {
                    m29753(0);
                    break;
                } else {
                    if (C13531.m33236(getContext())) {
                        m29753(C6907.m19160(ApplicationC17729.f58262.getInt("bottom_toolbar_padding_bottom", 12)));
                    } else {
                        m29753(0);
                    }
                    break;
                }
                break;
            case "1":
                m29753(C6907.m19160(ApplicationC17729.f58262.getInt("bottom_toolbar_padding_bottom", 12)));
                break;
            case "2":
                m29753(0);
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
            iMin = Math.min((int) getContext().getResources().getDimension(R.dimen.MT_Protector), size - (this.f38273 ? getPaddingBottom() : 0));
            if (this.f38273) {
                paddingBottom = getPaddingBottom();
            }
            size = iMin + paddingBottom;
        } else if (mode != 1073741824) {
            iMin = (int) getContext().getResources().getDimension(R.dimen.MT_Protector);
            if (this.f38273) {
                paddingBottom = getPaddingBottom();
            }
            size = iMin + paddingBottom;
        }
        setMeasuredDimension(defaultSize, size);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m29745() {
        Context context = getContext();
        PorterDuffColorFilter porterDuffColorFilterM9575 = C2930.m9575(C9217.m24386(context.getResources(), R.color.MT_Protector, context.getTheme()));
        this.f38259 = porterDuffColorFilterM9575;
        Drawable drawable = this.f38277;
        if (drawable != null) {
            drawable.setColorFilter(porterDuffColorFilterM9575);
        }
        this.f38274.m32940(C3296.m10871(-12566464, -2697514));
        Iterator it = this.f38253.iterator();
        while (it.hasNext()) {
            ((AbstractC20075) it.next()).mo17146();
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m29750() {
        return this.f38278 == EnumC2176.STATE_1;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m29749() {
        return this.f38278 == EnumC2176.STATE_2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29737() {
        EnumC2176 enumC2176 = this.f38278;
        if (enumC2176 == EnumC2176.STATE_2 || enumC2176 == EnumC2176.STATE_1_2) {
            this.f38278 = EnumC2176.STATE_2_1;
            this.f38267 = System.currentTimeMillis();
            int i = C22666.f73603;
            postInvalidateOnAnimation();
            return;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29748() {
        EnumC2176 enumC2176 = this.f38278;
        if (enumC2176 == EnumC2176.STATE_1 || enumC2176 == EnumC2176.STATE_2_1) {
            this.f38278 = EnumC2176.STATE_1_2;
            this.f38267 = System.currentTimeMillis();
            int i = C22666.f73603;
            postInvalidateOnAnimation();
            return;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m29747(int i, int i2) {
        String string = getContext().getString(i2);
        C1299 c1299 = new C1299(getContext());
        float width = getWidth() / this.f38253.size();
        c1299.mo4706(this, (int) ((width * i) + (width / 2.0f)), m29746() / 2, true, string);
        C21576.m49069(new RunnableC13815(1, c1299), SnackbarManager.SHORT_DURATION_MS);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m29755() {
        return this.f38256;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20075 m29740(int i) {
        return (AbstractC20075) this.f38253.get(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29741() {
        this.f38253.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15599 m29738(int i, int i2) {
        C15599 c15599 = new C15599(this, C7508.m20563(getContext(), i), C7508.m20563(getContext(), i2));
        this.f38253.add(c15599);
        return c15599;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15599 m29739(C16803 c16803) {
        C15599 c15599 = new C15599(this, c16803, C7508.m20563(getContext(), R.drawable.MT_Protector));
        this.f38253.add(c15599);
        return c15599;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29754(int i, int i2) {
        this.f38253.add(new C5905(this, C7508.m20563(getContext(), i), i2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29743(C8147 c8147) {
        if (c8147 == null) {
            this.f38257 = null;
            this.f38280 = null;
            this.f38269 = null;
            return;
        }
        View viewM44722 = C19334.m44722(c8147, 8388611);
        View viewM44723 = C19334.m44722(c8147, 8388613);
        if (viewM44722 == null && viewM44723 == null) {
            throw new RuntimeException();
        }
        this.f38257 = c8147;
        this.f38280 = viewM44722;
        this.f38269 = viewM44723;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29742(C7198 c7198) {
        C7198 c7199 = this.f38275;
        if (c7199 == c7198) {
            this.f38252 = c7198.findViewById(R.id.MT_Protector);
            return;
        }
        C5159 c5159 = this.f38276;
        if (c7199 != null) {
            c7199.m19776(c5159);
        }
        this.f38275 = c7198;
        this.f38261 = 0.0f;
        if (c7198 != null) {
            this.f38252 = c7198.findViewById(R.id.MT_Protector);
            c7198.m19777((InterfaceC13909) c5159);
            if (this.f38277 == null) {
                Drawable drawableM20563 = C7508.m20563(getContext(), R.drawable.MT_Protector);
                this.f38277 = drawableM20563;
                drawableM20563.setColorFilter(this.f38259);
                return;
            }
            return;
        }
        this.f38252 = null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7198 m29752() {
        return this.f38275;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29733(C11870 c11870) {
        if (c11870.f38254) {
            return;
        }
        c11870.f38254 = true;
        if (c11870.performLongClick()) {
            c11870.performHapticFeedback(0);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m29751() {
        return this.f38284;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C8147 c8147;
        View view;
        C8147 c8148;
        View view2;
        AbstractC20075 abstractC20075;
        if (motionEvent.getAction() == 0) {
            this.f38263 = motionEvent.getY() > ((float) m29746());
        }
        if (!this.f38263) {
            int action = motionEvent.getAction();
            HandlerC13547 handlerC13547 = this.f38270;
            C13362 c13362 = this.f38274;
            float f = 0.0f;
            if (action == 0) {
                this.f38262 = motionEvent.getX();
                this.f38260 = motionEvent.getY();
                if (this.f38261 != 0.0f) {
                    this.f38254 = false;
                    this.f38255 = true;
                    this.f38282 = null;
                    c13362.m32943();
                } else {
                    this.f38255 = false;
                    ArrayList arrayList = this.f38253;
                    if (!arrayList.isEmpty()) {
                        int width = (int) (this.f38262 / (getWidth() / arrayList.size()));
                        this.f38256 = width;
                        if (width >= 0 && width < arrayList.size()) {
                            this.f38254 = false;
                            AbstractC20075 abstractC20076 = (AbstractC20075) arrayList.get(this.f38256);
                            this.f38282 = abstractC20076;
                            boolean zMo17145 = abstractC20076.mo17145();
                            boolean zMo17148 = this.f38282.mo17148();
                            if (zMo17145 || zMo17148) {
                                c13362.m32943();
                                this.f38272 = this.f38256;
                            }
                            if (zMo17148) {
                                handlerC13547.sendEmptyMessageDelayed(0, ViewConfiguration.getLongPressTimeout());
                            }
                        } else {
                            this.f38282 = null;
                        }
                    } else {
                        this.f38282 = null;
                    }
                }
                invalidate();
                return true;
            }
            VelocityTracker velocityTracker = this.f38264;
            VelocityTracker velocityTracker2 = this.f38265;
            if (action == 1) {
                handlerC13547.removeMessages(0);
                if (this.f38266) {
                    velocityTracker2.computeCurrentVelocity(1000);
                    float xVelocity = velocityTracker2.getXVelocity();
                    if (xVelocity >= 1000.0f) {
                        c8148 = this.f38257;
                        view2 = this.f38280;
                    } else if (xVelocity > -1000.0f && this.f38281 > 0.4f) {
                        c8148 = this.f38257;
                        view2 = this.f38280;
                    } else {
                        c8147 = this.f38257;
                        view = this.f38280;
                        c8147.m22039(view, true);
                    }
                    c8148.m22047(view2);
                } else if (this.f38258) {
                    velocityTracker2.computeCurrentVelocity(1000);
                    float f2 = -velocityTracker2.getXVelocity();
                    if (f2 >= 1000.0f) {
                        c8148 = this.f38257;
                        view2 = this.f38269;
                    } else if (f2 > -1000.0f && this.f38281 > 0.4f) {
                        c8148 = this.f38257;
                        view2 = this.f38269;
                    } else {
                        c8147 = this.f38257;
                        view = this.f38269;
                        c8147.m22039(view, true);
                    }
                    c8148.m22047(view2);
                } else if (this.f38255) {
                    if (!this.f38254) {
                        this.f38275.m19780();
                    }
                    c13362.m32939();
                } else if (this.f38268) {
                    velocityTracker.computeCurrentVelocity(1000);
                    float yVelocity = velocityTracker.getYVelocity();
                    if (yVelocity <= -1000.0f) {
                        this.f38275.m19779();
                    } else if (yVelocity < 1000.0f && this.f38261 > 0.4f) {
                        this.f38275.m19779();
                    } else {
                        this.f38275.m19780();
                    }
                }
                c13362.m32944();
                if (!this.f38254 && (abstractC20075 = this.f38282) != null && abstractC20075.mo17145()) {
                    performClick();
                }
                this.f38266 = false;
                this.f38258 = false;
                velocityTracker2.clear();
                this.f38281 = 0.0f;
                this.f38268 = false;
                velocityTracker.clear();
                invalidate();
                return true;
            }
            if (action == 2) {
                if (!this.f38254) {
                    float x = this.f38262 - motionEvent.getX();
                    float y = this.f38260 - motionEvent.getY();
                    float fAbs = Math.abs(x);
                    float fAbs2 = Math.abs(y);
                    float f3 = this.f38283;
                    if (fAbs > f3 || fAbs2 > f3) {
                        if (this.f38255) {
                            c13362.m32939();
                        } else if (this.f38257 != null && fAbs > fAbs2) {
                            View view3 = this.f38280;
                            if (view3 == null || this.f38269 == null) {
                                if (view3 != null) {
                                    this.f38266 = true;
                                } else if (this.f38269 != null) {
                                    this.f38258 = true;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else if (x < 0.0f) {
                                this.f38266 = true;
                            } else {
                                this.f38258 = true;
                            }
                            c13362.m32944();
                        } else if (this.f38275 != null && fAbs <= fAbs2) {
                            this.f38268 = true;
                            c13362.m32939();
                            this.f38284 = this.f38262 < ((float) getWidth()) / 2.0f;
                        }
                        this.f38254 = true;
                        handlerC13547.removeMessages(0);
                        invalidate();
                    }
                }
                float f4 = 1.0f;
                if (this.f38266) {
                    velocityTracker2.addMovement(motionEvent);
                    float x2 = (motionEvent.getX() - this.f38262) / (getWidth() / 2.0f);
                    if (x2 <= 1.0f) {
                        f4 = x2 < 0.0f ? 0.0f : x2;
                    }
                    if (f4 == 0.0f) {
                        if (this.f38280.getVisibility() == 0) {
                            this.f38280.setVisibility(4);
                        }
                    } else if (this.f38280.getVisibility() == 4) {
                        this.f38280.setVisibility(0);
                    }
                    this.f38281 = f4;
                    C19334.m44723(this.f38257, this.f38280, f4);
                    return true;
                }
                if (this.f38258) {
                    velocityTracker2.addMovement(motionEvent);
                    float x3 = (this.f38262 - motionEvent.getX()) / (getWidth() / 2.0f);
                    if (x3 <= 1.0f) {
                        f4 = x3 < 0.0f ? 0.0f : x3;
                    }
                    if (f4 == 0.0f) {
                        if (this.f38269.getVisibility() == 0) {
                            this.f38269.setVisibility(4);
                        }
                    } else if (this.f38269.getVisibility() == 4) {
                        this.f38269.setVisibility(0);
                    }
                    this.f38281 = f4;
                    C19334.m44723(this.f38257, this.f38269, f4);
                    return true;
                }
                if (this.f38268) {
                    velocityTracker.addMovement(motionEvent);
                    View view4 = this.f38252;
                    float height = view4 == null ? 0.0f : view4.getHeight() / 1.5f;
                    if (height == 0.0f) {
                        height = m29746() * 2.0f;
                    }
                    float y2 = (this.f38260 - motionEvent.getY()) / height;
                    if (y2 > 1.0f) {
                        f = 1.0f;
                    } else if (y2 >= 0.0f) {
                        f = y2;
                    }
                    this.f38275.m19785(f);
                }
            } else if (action == 3) {
                if (this.f38266) {
                    this.f38257.m22047(this.f38280);
                }
                if (this.f38258) {
                    this.f38257.m22047(this.f38269);
                }
                if (this.f38268) {
                    this.f38275.m19780();
                    c13362.m32939();
                }
                c13362.m32944();
                handlerC13547.removeMessages(0);
                this.f38266 = false;
                this.f38258 = false;
                velocityTracker2.clear();
                this.f38281 = 0.0f;
                this.f38268 = false;
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
        ArrayList<AbstractC20075> arrayList = this.f38253;
        if (arrayList.isEmpty()) {
            return;
        }
        int iM29746 = m29746();
        float width = getWidth() / arrayList.size();
        float f3 = width / 2.0f;
        float f4 = iM29746 / 2.0f;
        canvas.clipRect(0, 0, getWidth(), iM29746);
        int i = C23059.f74810[this.f38278.ordinal()];
        if (i != 1) {
            if (i == 2) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f38267;
                if (jCurrentTimeMillis >= 250) {
                    this.f38278 = EnumC2176.STATE_2;
                    f2 = 1.0f;
                } else {
                    f2 = jCurrentTimeMillis / 250.0f;
                    int i2 = C22666.f73603;
                    postInvalidateOnAnimation();
                }
            } else if (i == 3) {
                f2 = 1.0f;
            } else if (i != 4) {
                f2 = 0.0f;
            } else {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f38267;
                if (jCurrentTimeMillis2 >= 250) {
                    this.f38278 = EnumC2176.STATE_1;
                    f2 = 0.0f;
                } else {
                    int i3 = C22666.f73603;
                    postInvalidateOnAnimation();
                    f2 = 1.0f - (jCurrentTimeMillis2 / 250.0f);
                }
            }
            f = 2.0f;
        } else {
            f = 2.0f;
            f2 = 0.0f;
        }
        C13362 c13362 = this.f38274;
        if (c13362.m32942()) {
            if (this.f38255) {
                float width2 = getWidth() / f;
                if (c13362.m32941(canvas, (int) Math.round(Math.sqrt((width2 * width2) + (f4 * f4))), width2, f4)) {
                    int i4 = C22666.f73603;
                    postInvalidateOnAnimation();
                }
            } else {
                if (c13362.m32941(canvas, (int) Math.round(Math.sqrt((f3 * f3) + (f4 * f4))), (this.f38272 * width) + f3, f4)) {
                    int i5 = C22666.f73603;
                    postInvalidateOnAnimation();
                }
            }
        }
        float f5 = this.f38261;
        Rect rect = this.f38271;
        if (f5 <= 0.5f) {
            float f6 = 1.0f - (f5 * f);
            for (AbstractC20075 abstractC20075 : arrayList) {
                int iMo17147 = abstractC20075.mo17147();
                int iMo17142 = abstractC20075.mo17142();
                if (f5 != 0.0f) {
                    iMo17142 = (int) (iMo17142 * f6);
                }
                int i6 = (int) (f3 - (iMo17147 / f));
                rect.left = i6;
                rect.right = i6 + iMo17147;
                int i7 = (int) (f4 - (iMo17142 / f));
                rect.top = i7;
                rect.bottom = i7 + iMo17142;
                abstractC20075.mo17143(canvas, rect, f2, f6);
                f3 += width;
            }
        }
        if (f5 >= 0.5f) {
            Drawable drawable = this.f38277;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = (int) (((f5 * f) - 1.0f) * drawable.getIntrinsicHeight());
            int width3 = (getWidth() - intrinsicWidth) / 2;
            rect.left = width3;
            rect.right = width3 + intrinsicWidth;
            int i8 = (iM29746 - intrinsicHeight) / 2;
            rect.top = i8;
            rect.bottom = i8 + intrinsicHeight;
            drawable.setBounds(rect);
            drawable.setAlpha((int) ((f5 - 0.5f) * 153.0f * f));
            drawable.draw(canvas);
        }
    }
}
