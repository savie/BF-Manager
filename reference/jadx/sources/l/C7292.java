package l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S696 */
/* JADX INFO: loaded from: classes3.dex */
public class C7292 extends ViewGroup {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C19287 f24213;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f24214;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C7022 f24215;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final FrameLayout f24216;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final View f24217;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC8704 f24218;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final FrameLayout f24219;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Drawable f24220;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserver.OnGlobalLayoutListener f24221;

    public C7292(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C7292(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new C15054(this);
        this.f24221 = new ViewTreeObserverOnGlobalLayoutListenerC21403(this);
        int[] iArr = C12108.f40516;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C5031.m13983(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        typedArrayObtainStyledAttributes.getInt(1, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, (ViewGroup) this, true);
        ViewOnClickListenerC8704 viewOnClickListenerC8704 = new ViewOnClickListenerC8704(this);
        this.f24218 = viewOnClickListenerC8704;
        View viewFindViewById = findViewById(R.id.MT_Protector);
        this.f24217 = viewFindViewById;
        this.f24220 = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.MT_Protector);
        this.f24216 = frameLayout;
        frameLayout.setOnClickListener(viewOnClickListenerC8704);
        frameLayout.setOnLongClickListener(viewOnClickListenerC8704);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.MT_Protector);
        frameLayout2.setOnClickListener(viewOnClickListenerC8704);
        frameLayout2.setAccessibilityDelegate(new C17875());
        frameLayout2.setOnTouchListener(new C18581(this, frameLayout2));
        this.f24219 = frameLayout2;
        ((ImageView) frameLayout2.findViewById(R.id.MT_Protector)).setImageDrawable(drawable);
        C19287 c19287 = new C19287(this);
        this.f24213 = c19287;
        c19287.registerDataSetObserver(new C7998(this));
        Resources resources = context.getResources();
        Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.MT_Protector));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19434() {
        if (m19436().f23602.isShowing()) {
            m19436().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f24221);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m19435() {
        if (m19436().f23602.isShowing() || !this.f24214) {
            return;
        }
        this.f24213.getClass();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24213.getClass();
        this.f24214 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f24213.getClass();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f24221);
        }
        if (m19436().f23602.isShowing()) {
            m19434();
        }
        this.f24214 = false;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f24216.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        View view = this.f24217;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f24217.layout(0, 0, i3 - i, i4 - i2);
        if (m19436().f23602.isShowing()) {
            return;
        }
        m19434();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7022 m19436() {
        if (this.f24215 == null) {
            C7022 c7022 = new C7022(getContext());
            this.f24215 = c7022;
            c7022.mo18833(this.f24213);
            this.f24215.m18830(this);
            this.f24215.m18843();
            C7022 c7023 = this.f24215;
            ViewOnClickListenerC8704 viewOnClickListenerC8704 = this.f24218;
            c7023.m18831((AdapterView.OnItemClickListener) viewOnClickListenerC8704);
            this.f24215.m18834((PopupWindow.OnDismissListener) viewOnClickListenerC8704);
        }
        return this.f24215;
    }
}
