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

/* JADX INFO: renamed from: l.ܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S696 */
/* JADX INFO: loaded from: classes4.dex */
public class C14547 extends ViewGroup {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC24245 f45848;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C16960 f45849;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final FrameLayout f45850;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserver.OnGlobalLayoutListener f45851;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f45852;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View f45853;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6345 f45854;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final FrameLayout f45855;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Drawable f45856;

    public C14547(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C14547(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new C16039(this);
        this.f45851 = new ViewTreeObserverOnGlobalLayoutListenerC23499(this);
        int[] iArr = C10401.f33078;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C22666.m51088(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        typedArrayObtainStyledAttributes.getInt(1, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector, (ViewGroup) this, true);
        ViewOnClickListenerC24245 viewOnClickListenerC24245 = new ViewOnClickListenerC24245(this);
        this.f45848 = viewOnClickListenerC24245;
        View viewFindViewById = findViewById(R.id.MT_Protector);
        this.f45853 = viewFindViewById;
        this.f45856 = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.MT_Protector);
        this.f45850 = frameLayout;
        frameLayout.setOnClickListener(viewOnClickListenerC24245);
        frameLayout.setOnLongClickListener(viewOnClickListenerC24245);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.MT_Protector);
        frameLayout2.setOnClickListener(viewOnClickListenerC24245);
        frameLayout2.setAccessibilityDelegate(new C3361());
        frameLayout2.setOnTouchListener(new C20515(this, frameLayout2));
        this.f45855 = frameLayout2;
        ((ImageView) frameLayout2.findViewById(R.id.MT_Protector)).setImageDrawable(drawable);
        C6345 c6345 = new C6345(this);
        this.f45854 = c6345;
        c6345.registerDataSetObserver(new C12310(this));
        Resources resources = context.getResources();
        Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.MT_Protector));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35098() {
        if (m35100().f55402.isShowing()) {
            m35100().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f45851);
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m35099() {
        if (m35100().f55402.isShowing() || !this.f45852) {
            return;
        }
        this.f45854.getClass();
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45854.getClass();
        this.f45852 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45854.getClass();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f45851);
        }
        if (m35100().f55402.isShowing()) {
            m35098();
        }
        this.f45852 = false;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f45850.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        View view = this.f45853;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f45853.layout(0, 0, i3 - i, i4 - i2);
        if (m35100().f55402.isShowing()) {
            return;
        }
        m35098();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16960 m35100() {
        if (this.f45849 == null) {
            C16960 c16960 = new C16960(getContext());
            this.f45849 = c16960;
            c16960.mo18835(this.f45854);
            this.f45849.m39944(this);
            this.f45849.m39956();
            C16960 c16961 = this.f45849;
            ViewOnClickListenerC24245 viewOnClickListenerC24245 = this.f45848;
            c16961.m39945((AdapterView.OnItemClickListener) viewOnClickListenerC24245);
            this.f45849.m39947((PopupWindow.OnDismissListener) viewOnClickListenerC24245);
        }
        return this.f45849;
    }
}
