package l;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76ID */
/* JADX INFO: loaded from: classes.dex */
public final class C21447 extends C16257 {

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f68403 = 0;

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public boolean f68404;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C6996 f68405;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f68406;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public float f68407;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public boolean f68408;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f68409;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final LinearLayout f68410;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public C8723 f68411;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final C17717 f68412;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public boolean f68413;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final C16434 f68414;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public float f68415;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public ImageView f68416;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final LinearLayout f68417;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public C18452 f68418;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f68419;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f68420;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f68421;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f68422;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f68423;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final GestureDetector f68424;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public boolean f68425;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final LinearLayout f68426;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public boolean f68427;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public final ScrollView f68428;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserverOnPreDrawListenerC16225 f68429;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f68430;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final C17695 f68431;

    @Override // l.C16257, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m48785(C21447 c21447) {
        if (c21447.m48786()) {
            return false;
        }
        c21447.getViewTreeObserver().removeOnPreDrawListener(c21447.f68429);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ܶܽܳ] */
    public C21447(ContextThemeWrapper contextThemeWrapper, C17695 c17695) {
        super(contextThemeWrapper);
        this.f68429 = new ViewTreeObserver.OnPreDrawListener() { // from class: l.ܶܽܳ
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return C21447.m48785(this.f52720);
            }
        };
        this.f68431 = c17695;
        setAlpha(c17695.m41429());
        C17717 c17717 = new C17717(contextThemeWrapper);
        this.f68412 = c17717;
        setBackground(c17717.m41483(-14670549, 8, -10919059));
        setElevation(m48772(7));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f68410 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(m48772(10), m48772(5), m48772(10), m48772(9));
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ScrollView scrollView = new ScrollView(getContext());
        this.f68428 = scrollView;
        scrollView.setFillViewport(false);
        linearLayout.addView(scrollView, new LinearLayout.LayoutParams(-1, -2, 1.0f));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f68417 = linearLayout2;
        linearLayout2.setOrientation(1);
        scrollView.addView(linearLayout2);
        LinearLayout linearLayoutM41487 = c17717.m41487(linearLayout);
        this.f68426 = linearLayoutM41487;
        TextView textViewM41488 = c17717.m41488(11, -5129275, getContext().getString(R.string.MT_Protector, Integer.valueOf(C17695.m41410())));
        linearLayoutM41487.addView(textViewM41488);
        C16434 c16434 = new C16434(contextThemeWrapper, null);
        this.f68414 = c16434;
        c16434.setMax(50);
        c16434.setProgress(C17695.m41410());
        c16434.setContentDescription(textViewM41488.getText());
        c16434.setThumbTintList(ColorStateList.valueOf(-13058049));
        c16434.setProgressTintList(ColorStateList.valueOf(-13058049));
        c16434.setMinimumHeight(m48772(40));
        linearLayoutM41487.addView(c16434, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayoutM41487.setVisibility(8);
        c16434.setOnSeekBarChangeListener(new C24431(this, textViewM41488, c17695));
        GestureDetector gestureDetector = new GestureDetector(contextThemeWrapper, new C4293(this));
        this.f68424 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        m38584(new C14733(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f68415 = motionEvent.getX();
            this.f68407 = motionEvent.getY();
            this.f68413 = false;
            C6996 c6996 = this.f68405;
            if (c6996 != null) {
                if (m48782(motionEvent.getX(), motionEvent.getY(), c6996.m19323())) {
                    this.f68413 = true;
                } else {
                    this.f68405.finish();
                }
            }
            this.f68409 = false;
            this.f68419 = this.f68426.getVisibility() == 0 && m48782(motionEvent.getX(), motionEvent.getY(), this.f68414);
        }
        if (actionMasked == 2 && !this.f68422 && !this.f68413) {
            View viewFindFocus = findFocus();
            if (viewFindFocus instanceof TextView) {
                TextView textView = (TextView) viewFindFocus;
                if (textView.isTextSelectable() && textView.hasSelection()) {
                    this.f68413 = m48782(this.f68415, this.f68407, viewFindFocus);
                }
            }
        }
        if (this.f68413) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.f68419) {
            boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (actionMasked != 1 && actionMasked != 3) {
                return zDispatchTouchEvent;
            }
            this.f68419 = false;
            return zDispatchTouchEvent;
        }
        if (this.f68409) {
            boolean zDispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
            if (actionMasked != 1 && actionMasked != 3) {
                return zDispatchTouchEvent2;
            }
            this.f68409 = false;
            return zDispatchTouchEvent2;
        }
        this.f68424.onTouchEvent(motionEvent);
        if (!this.f68422) {
            return super.dispatchTouchEvent(motionEvent);
        }
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() != 1 && motionEvent.getActionMasked() != 3) {
            return zOnTouchEvent;
        }
        this.f68422 = false;
        return zOnTouchEvent;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m48782(float f, float f2, View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this) {
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                offsetDescendantRectToMyCoords(view, rect);
                return rect.contains((int) f, (int) f2);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return m48773(view, callback);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        return m48773(view, callback);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C6996 m48773(View view, ActionMode.Callback callback) {
        if (!(view instanceof TextView) || !((TextView) view).isTextSelectable()) {
            return null;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this) {
                C6996 c6996 = this.f68405;
                if (c6996 != null) {
                    c6996.finish();
                }
                m48787();
                C6996 c6996M19317 = C6996.m19317(view, callback, new RunnableC3547(0, this));
                this.f68405 = c6996M19317;
                if (c6996M19317 != null) {
                    this.f68413 = true;
                }
                return c6996M19317;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48775(C21447 c21447, MotionEvent motionEvent) {
        if (c21447.isAttachedToWindow()) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            super.dispatchTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            c21447.f68422 = true;
            super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m48791(float f, float f2, View view) {
        if (!view.canScrollVertically(-1) && !view.canScrollVertically(1)) {
            if (!(view instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                float scrollX = (view.getScrollX() + f) - childAt.getLeft();
                float scrollY = (view.getScrollY() + f2) - childAt.getTop();
                if (childAt.getVisibility() != 0 || scrollX < 0.0f || scrollX >= childAt.getWidth() || scrollY < 0.0f || scrollY >= childAt.getHeight() || !m48791(scrollX, scrollY, childAt)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m48803() {
        C2012 c2012M41436 = this.f68431.m41436();
        if (c2012M41436 == null || !c2012M41436.m6925()) {
            m48793();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m48804() {
        LinearLayout linearLayout = this.f68426;
        linearLayout.setVisibility(linearLayout.getVisibility() == 0 ? 8 : 0);
        boolean zM48794 = m48794();
        ImageView imageView = this.f68416;
        if (imageView != null) {
            imageView.setSelected(zM48794);
        }
        C2012 c2012M41436 = this.f68431.m41436();
        if (c2012M41436 != null) {
            c2012M41436.m6924(zM48794);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48794() {
        return this.f68426.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m48799() {
        if (this.f68423 || this.f68408) {
            return false;
        }
        return this.f68420 || this.f68406;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m48802() {
        this.f68423 = true;
        this.f68408 = true;
        this.f68406 = false;
        m48787();
        mo38590();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m48801() {
        this.f68408 = true;
        this.f68406 = false;
        m48787();
        mo38590();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48800() {
        this.f68408 = false;
        m48793();
        if (!this.f68408 && !this.f68406 && !this.f68423) {
            mo38581();
        } else {
            mo38590();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48798(boolean z) {
        if (z) {
            this.f68406 = false;
            mo38590();
        }
        m48793();
        if (!this.f68408 && !this.f68406 && !this.f68423) {
            mo38581();
        } else {
            mo38590();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48797(RunnableC16181 runnableC16181) {
        this.f68406 = true;
        m48787();
        mo38590();
        C21576.m49068(runnableC16181);
    }

    @Override // l.C16257
    /* JADX INFO: renamed from: ۙ */
    public final void mo38581() {
        if (this.f68420 || getParent() != null) {
            return;
        }
        this.f68420 = true;
        try {
            super.mo38581();
            if (getParent() != null || isAttachedToWindow()) {
                return;
            }
            this.f68420 = false;
        } catch (RuntimeException e) {
            this.f68420 = false;
            throw e;
        }
    }

    @Override // l.C16257
    /* JADX INFO: renamed from: ᩸ */
    public final void mo38590() {
        C6996 c6996 = this.f68405;
        if (c6996 != null) {
            c6996.finish();
        }
        this.f68421 = true;
        try {
            if (getParent() != null) {
                ((WindowManager) getContext().getSystemService("window")).removeViewImmediate(this);
            }
        } finally {
            this.f68420 = false;
            this.f68421 = false;
        }
    }

    @Override // l.C16257, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.f68429);
    }

    @Override // l.C16257, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f68424.onTouchEvent(motionEventObtain);
        if (this.f68422) {
            super.onTouchEvent(motionEventObtain);
        }
        this.f68422 = false;
        this.f68419 = false;
        this.f68409 = false;
        this.f68413 = false;
        motionEventObtain.recycle();
        getViewTreeObserver().removeOnPreDrawListener(this.f68429);
        super.onDetachedFromWindow();
        if (this.f68421 || this.f68423) {
            return;
        }
        this.f68420 = false;
        C21576.m49068(new RunnableC9168(1, this));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m48793() {
        String string;
        String string2;
        m48787();
        LinearLayout linearLayout = this.f68417;
        linearLayout.removeAllViews();
        this.f68416 = null;
        C17695 c17695 = this.f68431;
        C2012 c2012M41436 = c17695.m41436();
        boolean z = c2012M41436 != null && c2012M41436.m6925();
        this.f68410.setPadding(m48772(10), m48772(5), m48772(z ? 10 : 2), m48772(9));
        this.f68426.setPadding(0, z ? m48772(8) : 0, 0, 0);
        if (z) {
            linearLayout.addView(c2012M41436);
        } else {
            C17717 c17717 = this.f68412;
            LinearLayout linearLayoutM41487 = c17717.m41487(linearLayout);
            linearLayoutM41487.addView(c17717.m41488(15, -920329, getContext().getString(R.string.MT_Protector)), new LinearLayout.LayoutParams(0, -2, 1.0f));
            this.f68412.m41485(linearLayoutM41487, R.drawable.MT_Protector, R.string.MT_Protector, new RunnableC20701(0, this), -13058049);
            this.f68416 = c17717.m41486(linearLayoutM41487, new Runnable() { // from class: l.ۨܽܳ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40128.m48804();
                }
            }, m48794());
            this.f68412.m41485(linearLayoutM41487, R.drawable.MT_Protector, R.string.MT_Protector, new RunnableC13368(4, c17695), -5129275);
            this.f68412.m41485(linearLayoutM41487, R.drawable.MT_Protector, R.string.MT_Protector, new RunnableC18779(1, c17695), -5129275);
            List listM41416 = c17695.m41416();
            boolean zIsEmpty = listM41416.isEmpty();
            boolean z2 = ApplicationC17729.f58258.getBoolean("isr", true);
            final ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                if (i >= Math.min(z2 ? 1 : 4, listM41416.size())) {
                    break;
                }
                arrayList.add(((C18463) listM41416.get(i)).f60090);
                i++;
            }
            View.OnLongClickListener onLongClickListener = new View.OnLongClickListener() { // from class: l.ۛܽܳ
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    C21447.m48776(this.f21947, arrayList, view);
                    return true;
                }
            };
            if (zIsEmpty) {
                string = getContext().getString(R.string.MT_Protector);
            } else {
                string = ((C18463) listM41416.get(0)).f60092;
            }
            TextView textViewM41488 = c17717.m41488(13, -13058049, string);
            textViewM41488.setGravity(8388611);
            linearLayout.addView(textViewM41488, new LinearLayout.LayoutParams(-1, -2));
            if (zIsEmpty) {
                string2 = getContext().getString(R.string.MT_Protector);
            } else {
                string2 = ((C18463) listM41416.get(0)).f60090;
            }
            TextView textViewM41489 = c17717.m41488(11, zIsEmpty ? -5129275 : -13058049, string2);
            if (!zIsEmpty) {
                textViewM41489.setTypeface(Typeface.MONOSPACE);
            }
            textViewM41489.setGravity(8388611);
            textViewM41489.setPadding(0, m48772(3), 0, m48772(5));
            linearLayout.addView(textViewM41489, new LinearLayout.LayoutParams(-1, -2));
            if (!zIsEmpty) {
                ViewOnClickListenerC2162 viewOnClickListenerC2162 = new ViewOnClickListenerC2162(2, this);
                textViewM41488.setOnClickListener(viewOnClickListenerC2162);
                textViewM41489.setOnClickListener(viewOnClickListenerC2162);
                textViewM41488.setOnLongClickListener(onLongClickListener);
                textViewM41489.setOnLongClickListener(onLongClickListener);
            }
            if (!z2) {
                for (int i2 = 1; i2 < Math.min(4, listM41416.size()); i2++) {
                    TextView textViewM414810 = c17717.m41488(11, -920329, ((C18463) listM41416.get(i2)).f60090);
                    textViewM414810.setTypeface(Typeface.MONOSPACE);
                    textViewM414810.setGravity(8388611);
                    textViewM414810.setPadding(0, m48772(3), 0, m48772(3));
                    textViewM414810.setOnLongClickListener(onLongClickListener);
                    linearLayout.addView(textViewM414810, new LinearLayout.LayoutParams(-1, -2));
                }
            }
        }
        this.f68428.scrollTo(0, 0);
        requestLayout();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48776(C21447 c21447, ArrayList arrayList, View view) {
        c21447.f68409 = true;
        if (arrayList.size() == 1) {
            C21576.m49067((CharSequence) arrayList.get(0));
            return;
        }
        C18452 c18452M48795 = c21447.m48795(view);
        C9898 c9898M42995 = c18452M48795.m42995();
        C0950.m3783(c9898M42995, R.string.MT_Protector);
        for (int i = 0; i < arrayList.size(); i++) {
            c9898M42995.add(0, i, i, (CharSequence) arrayList.get(i));
        }
        c18452M48795.m42994(new C10350(2, arrayList));
        C20231.m46504(C19198.m44467(c18452M48795));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48792(C21447 c21447) {
        ApplicationC17729.f58258.edit().putBoolean("isr", !ApplicationC17729.f58258.getBoolean("isr", true)).apply();
        c21447.m48793();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m48788(C21447 c21447) {
        c21447.f68431.m41419();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18452 m48795(View view) {
        m48787();
        C18452 c18452 = new C18452(new ContextThemeWrapper(getContext(), R.style.MT_Protector), view, 0);
        this.f68418 = c18452;
        return c18452;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48796(final C8723 c8723) {
        m48787();
        this.f68411 = c8723;
        c8723.m39947(new PopupWindow.OnDismissListener() { // from class: l.᩹ܽܳ
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C21447.m48777(this.f76805, c8723);
            }
        });
        c8723.show();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48777(C21447 c21447, C8723 c8723) {
        if (c21447.f68411 == c8723) {
            c21447.f68411 = null;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m48787() {
        C18452 c18452 = this.f68418;
        if (c18452 != null) {
            c18452.m42991();
            this.f68418 = null;
        }
        C8723 c8723 = this.f68411;
        if (c8723 != null) {
            c8723.dismiss();
            this.f68411 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean m48786() {
        if (!this.f68430 && isAttachedToWindow()) {
            this.f68430 = true;
            Point point = new Point();
            ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
            int[] iArr = new int[2];
            m38586(iArr);
            int iMax = this.f68427 ? Math.max(0, Math.min(iArr[0], point.x - getWidth())) : Math.max(0, (point.x - getWidth()) / 2);
            int iMax2 = this.f68427 ? Math.max(0, Math.min(iArr[1], point.y - getHeight())) : m48772(12);
            m38582(iMax, iMax2);
            this.f68430 = false;
            if (iMax != iArr[0] || iMax2 != iArr[1]) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        C21576.m49068(new RunnableC1784(2, this));
    }

    @Override // l.C16257, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f68431.m41437();
        requestLayout();
        C21576.m49068(new RunnableC1784(2, this));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Point point = new Point();
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
        C2012 c2012M41436 = this.f68431.m41436();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(m48772((c2012M41436 == null || !c2012M41436.m6925()) ? 280 : 360), point.x - m48772(16)), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(m48772(100), point.y - m48772(32)), Integer.MIN_VALUE));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m48772(int i) {
        return Math.round(i * getResources().getDisplayMetrics().density);
    }
}
