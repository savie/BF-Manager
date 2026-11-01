package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import bin.mt.plus.R;
import com.alipay.sdk.m.t0.b;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes3.dex */
public class C7022 implements InterfaceC6503 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public static Method f23594;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static Method f23595;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static Method f23596;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public View f23597;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public boolean f23598;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f23599;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public int f23600;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Handler f23601;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public PopupWindow f23602;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC5611 f23603;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f23604;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C6129 f23605;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC4199 f23606;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Rect f23607;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f23608;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public AdapterView.OnItemSelectedListener f23609;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f23610;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f23611;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public AdapterView.OnItemClickListener f23612;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f23613;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final Rect f23614;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ListAdapter f23615;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f23616;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f23617;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Context f23618;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final ViewOnTouchListenerC13373 f23619;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public DataSetObserver f23620;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final C1377 f23621;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f23622;

    static {
        int i = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i <= 28) {
            try {
                f23596 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f23594 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f23595 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public C7022(Context context) {
        this(context, null, R.attr.MT_Protector);
    }

    public C7022(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C7022(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C7022(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f23610 = -2;
        this.f23613 = -2;
        this.f23599 = b.c;
        this.f23616 = 0;
        this.f23600 = Integer.MAX_VALUE;
        this.f23606 = new RunnableC4199(this);
        this.f23619 = new ViewOnTouchListenerC13373(this);
        this.f23621 = new C1377(this);
        this.f23603 = new RunnableC5611(this);
        this.f23614 = new Rect();
        this.f23618 = context;
        this.f23601 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12108.f40534, i, 0);
        this.f23617 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f23608 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f23622 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C22587 c22587 = new C22587(context, attributeSet, i, 0);
        this.f23602 = c22587;
        c22587.setInputMethodMode(1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo18833(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f23620;
        if (dataSetObserver == null) {
            this.f23620 = new C22545(this);
        } else {
            ListAdapter listAdapter2 = this.f23615;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f23615 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f23620);
        }
        C6129 c6129 = this.f23605;
        if (c6129 != null) {
            c6129.setAdapter(this.f23615);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m18843() {
        this.f23604 = true;
        this.f23602.setFocusable(true);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m18837() {
        return this.f23604;
    }

    public final Drawable getBackground() {
        return this.f23602.getBackground();
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.f23602.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m18845() {
        this.f23602.setAnimationStyle(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18830(View view) {
        this.f23597 = view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m18826() {
        return this.f23617;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18828(int i) {
        this.f23617 = i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m18838() {
        if (this.f23622) {
            return this.f23608;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m18840(int i) {
        this.f23608 = i;
        this.f23622 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18829(Rect rect) {
        this.f23607 = rect != null ? new Rect(rect) : null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m18836(int i) {
        this.f23616 = i;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m18825() {
        return this.f23613;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m18824(int i) {
        Drawable background = this.f23602.getBackground();
        if (background == null) {
            this.f23613 = i;
            return;
        }
        Rect rect = this.f23614;
        background.getPadding(rect);
        this.f23613 = rect.left + rect.right + i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18831(AdapterView.OnItemClickListener onItemClickListener) {
        this.f23612 = onItemClickListener;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18832(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f23609 = onItemSelectedListener;
    }

    @Override // l.InterfaceC6503
    public final void dismiss() {
        PopupWindow popupWindow = this.f23602;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.f23605 = null;
        this.f23601.removeCallbacks(this.f23606);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18834(PopupWindow.OnDismissListener onDismissListener) {
        this.f23602.setOnDismissListener(onDismissListener);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m18841() {
        this.f23602.setInputMethodMode(2);
    }

    @Override // l.InterfaceC6503
    public final boolean isShowing() {
        return this.f23602.isShowing();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m18823() {
        if (this.f23602.isShowing()) {
            return this.f23605.getSelectedItemPosition();
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object m18835() {
        if (this.f23602.isShowing()) {
            return this.f23605.getSelectedItem();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final View m18839() {
        if (this.f23602.isShowing()) {
            return this.f23605.getSelectedView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m18844() {
        if (this.f23602.isShowing()) {
            return this.f23605.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    @Override // l.InterfaceC6503
    /* JADX INFO: renamed from: ۖ */
    public final ListView mo17704() {
        return this.f23605;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6129 mo18827(Context context, boolean z) {
        return new C6129(context, z);
    }

    @Override // l.InterfaceC6503
    public final void show() {
        int i;
        int iM29774;
        int iMakeMeasureSpec;
        int paddingBottom;
        C6129 c6129;
        C6129 c61210 = this.f23605;
        Context context = this.f23618;
        PopupWindow popupWindow = this.f23602;
        if (c61210 == null) {
            C6129 c6129Mo18827 = mo18827(context, !this.f23604);
            this.f23605 = c6129Mo18827;
            c6129Mo18827.setAdapter(this.f23615);
            this.f23605.setOnItemClickListener(this.f23612);
            this.f23605.setFocusable(true);
            this.f23605.setFocusableInTouchMode(true);
            this.f23605.setOnItemSelectedListener(new C14079(this));
            this.f23605.setOnScrollListener(this.f23621);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f23609;
            if (onItemSelectedListener != null) {
                this.f23605.setOnItemSelectedListener(onItemSelectedListener);
            }
            popupWindow.setContentView(this.f23605);
        }
        Drawable background = popupWindow.getBackground();
        Rect rect = this.f23614;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.f23622) {
                this.f23608 = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z = popupWindow.getInputMethodMode() == 2;
        View view = this.f23597;
        int i3 = this.f23608;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f23595;
            if (method != null) {
                try {
                    iM29774 = ((Integer) method.invoke(popupWindow, view, Integer.valueOf(i3), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    iM29774 = popupWindow.getMaxAvailableHeight(view, i3);
                }
            } else {
                iM29774 = popupWindow.getMaxAvailableHeight(view, i3);
            }
        } else {
            iM29774 = C11962.m29774(popupWindow, view, i3, z);
        }
        int i4 = this.f23610;
        if (i4 == -1) {
            paddingBottom = iM29774 + i;
        } else {
            int i5 = this.f23613;
            if (i5 != -2) {
                iMakeMeasureSpec = i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iMo17109 = this.f23605.mo17109(iMakeMeasureSpec, iM29774);
            paddingBottom = iMo17109 + (iMo17109 > 0 ? this.f23605.getPaddingBottom() + this.f23605.getPaddingTop() + i : 0);
        }
        boolean z2 = popupWindow.getInputMethodMode() == 2;
        C10057.m25464(popupWindow, this.f23599);
        if (popupWindow.isShowing()) {
            if (this.f23597.isAttachedToWindow()) {
                int width = this.f23613;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f23597.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    if (z2) {
                        popupWindow.setWidth(this.f23613 == -1 ? -1 : 0);
                        popupWindow.setHeight(0);
                    } else {
                        popupWindow.setWidth(this.f23613 == -1 ? -1 : 0);
                        popupWindow.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                popupWindow.setOutsideTouchable(true);
                View view2 = this.f23597;
                int i6 = this.f23617;
                int i7 = this.f23608;
                int i8 = width < 0 ? -1 : width;
                if (i4 < 0) {
                    i4 = -1;
                }
                popupWindow.update(view2, i6, i7, i8, i4);
                return;
            }
            return;
        }
        int width2 = this.f23613;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f23597.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        popupWindow.setWidth(width2);
        popupWindow.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f23596;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow, Boolean.TRUE);
                } catch (Exception unused2) {
                }
            }
        } else {
            C2788.m8466(popupWindow, true);
        }
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(this.f23619);
        if (this.f23611) {
            C10057.m25465(popupWindow, this.f23598);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f23594;
            if (method3 != null) {
                try {
                    method3.invoke(popupWindow, this.f23607);
                } catch (Exception unused3) {
                }
            }
        } else {
            C2788.m8465(popupWindow, this.f23607);
        }
        popupWindow.showAsDropDown(this.f23597, this.f23617, this.f23608, this.f23616);
        this.f23605.setSelection(-1);
        if ((!this.f23604 || this.f23605.isInTouchMode()) && (c6129 = this.f23605) != null) {
            c6129.m17110(true);
            c6129.requestLayout();
        }
        if (this.f23604) {
            return;
        }
        this.f23601.post(this.f23603);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m18842() {
        this.f23611 = true;
        this.f23598 = true;
    }
}
