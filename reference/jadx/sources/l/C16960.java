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
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import bin.mt.plus.R;
import com.alipay.sdk.m.t0.b;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25PA */
/* JADX INFO: loaded from: classes5.dex */
public class C16960 implements InterfaceC16501 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public static Method f55397;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static Method f55398;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static Method f55399;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f55400;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f55401;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public PopupWindow f55402;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f55403;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC13231 f55404;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f55405;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Rect f55406;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f55407;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f55408;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f55409;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C9479 f55410;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public AdapterView.OnItemSelectedListener f55411;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public View f55412;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f55413;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Handler f55414;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public ListAdapter f55415;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public DataSetObserver f55416;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final ViewOnTouchListenerC11739 f55417;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final C2045 f55418;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final Rect f55419;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public View f55420;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f55421;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public boolean f55422;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Context f55423;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public AdapterView.OnItemClickListener f55424;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public int f55425;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC25166 f55426;

    static {
        int i = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i <= 28) {
            try {
                f55397 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f55398 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f55399 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public C16960(Context context) {
        this(context, null, R.attr.MT_Protector);
    }

    public C16960(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C16960(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C16960(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f55407 = -2;
        this.f55403 = -2;
        this.f55408 = b.c;
        this.f55400 = 0;
        this.f55425 = Integer.MAX_VALUE;
        this.f55426 = new RunnableC25166(this);
        this.f55417 = new ViewOnTouchListenerC11739(this);
        this.f55418 = new C2045(this);
        this.f55404 = new RunnableC13231(this);
        this.f55419 = new Rect();
        this.f55423 = context;
        this.f55414 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10401.f33079, i, 0);
        this.f55421 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f55401 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f55409 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C5994 c5994 = new C5994(context, attributeSet, i, 0);
        this.f55402 = c5994;
        c5994.setInputMethodMode(1);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo18835(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f55416;
        if (dataSetObserver == null) {
            this.f55416 = new C5774(this);
        } else {
            ListAdapter listAdapter2 = this.f55415;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f55415 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f55416);
        }
        C9479 c9479 = this.f55410;
        if (c9479 != null) {
            c9479.setAdapter(this.f55415);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m39956() {
        this.f55422 = true;
        this.f55402.setFocusable(true);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m39950() {
        return this.f55422;
    }

    public final Drawable getBackground() {
        return this.f55402.getBackground();
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.f55402.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m39962() {
        this.f55402.setAnimationStyle(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39944(View view) {
        this.f55420 = view;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39941() {
        return this.f55421;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39942(int i) {
        this.f55421 = i;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m39949() {
        if (this.f55409) {
            return this.f55401;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39959(int i) {
        this.f55401 = i;
        this.f55409 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39943(Rect rect) {
        this.f55406 = rect != null ? new Rect(rect) : null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m39958(int i) {
        this.f55400 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39940() {
        return this.f55403;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m39961(int i) {
        Drawable background = this.f55402.getBackground();
        if (background == null) {
            this.f55403 = i;
            return;
        }
        Rect rect = this.f55419;
        background.getPadding(rect);
        this.f55403 = rect.left + rect.right + i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39945(AdapterView.OnItemClickListener onItemClickListener) {
        this.f55424 = onItemClickListener;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39946(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f55411 = onItemSelectedListener;
    }

    @Override // l.InterfaceC16501
    public final void dismiss() {
        PopupWindow popupWindow = this.f55402;
        popupWindow.dismiss();
        View view = this.f55412;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f55412);
            }
        }
        popupWindow.setContentView(null);
        this.f55410 = null;
        this.f55414.removeCallbacks(this.f55426);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39947(PopupWindow.OnDismissListener onDismissListener) {
        this.f55402.setOnDismissListener(onDismissListener);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m39955() {
        this.f55402.setInputMethodMode(2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m39953(int i) {
        C9479 c9479 = this.f55410;
        if (!this.f55402.isShowing() || c9479 == null) {
            return;
        }
        c9479.m24863(false);
        c9479.setSelection(i);
        if (c9479.getChoiceMode() != 0) {
            c9479.setItemChecked(i, true);
        }
    }

    @Override // l.InterfaceC16501
    public final boolean isShowing() {
        return this.f55402.isShowing();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final View m39948() {
        if (this.f55402.isShowing()) {
            return this.f55410.getSelectedView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m39951() {
        if (this.f55402.isShowing()) {
            return this.f55410.getSelectedItemPosition();
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m39952() {
        if (this.f55402.isShowing()) {
            return this.f55410.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object m39957() {
        if (this.f55402.isShowing()) {
            return this.f55410.getSelectedItem();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39960(View view) {
        View view2;
        boolean zIsShowing = this.f55402.isShowing();
        if (zIsShowing && (view2 = this.f55412) != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f55412);
            }
        }
        this.f55412 = view;
        if (zIsShowing) {
            show();
        }
    }

    @Override // l.InterfaceC16501
    /* JADX INFO: renamed from: ᩸ */
    public final ListView mo39127() {
        return this.f55410;
    }

    /* JADX INFO: renamed from: ۙ */
    public C9479 mo18396(Context context, boolean z) {
        return new C9479(context, z);
    }

    @Override // l.InterfaceC16501
    public void show() {
        int measuredHeight;
        int i;
        int iM45868;
        int iMakeMeasureSpec;
        int i2;
        boolean z;
        C9479 c9479;
        View view;
        int i3;
        C9479 c94710 = this.f55410;
        Context context = this.f55423;
        PopupWindow popupWindow = this.f55402;
        if (c94710 == null) {
            C9479 c9479Mo18396 = mo18396(context, !this.f55422);
            this.f55410 = c9479Mo18396;
            c9479Mo18396.setAdapter(this.f55415);
            this.f55410.setOnItemClickListener(this.f55424);
            this.f55410.setFocusable(true);
            this.f55410.setFocusableInTouchMode(true);
            this.f55410.setOnItemSelectedListener(new C22928(this));
            this.f55410.setOnScrollListener(this.f55418);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f55411;
            if (onItemSelectedListener != null) {
                this.f55410.setOnItemSelectedListener(onItemSelectedListener);
            }
            C9479 c94711 = this.f55410;
            View view2 = this.f55412;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                linearLayout.addView(view2);
                linearLayout.addView(c94711, layoutParams);
                int i4 = this.f55403;
                if (i4 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i4, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = c94711;
            }
            popupWindow.setContentView(view);
        } else {
            View view3 = this.f55412;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = layoutParams3.bottomMargin + view3.getMeasuredHeight() + layoutParams3.topMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = popupWindow.getBackground();
        Rect rect = this.f55419;
        if (background != null) {
            background.getPadding(rect);
            int i5 = rect.top;
            i = rect.bottom + i5;
            if (!this.f55409) {
                this.f55401 = -i5;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z2 = popupWindow.getInputMethodMode() == 2;
        View view4 = this.f55420;
        int i6 = this.f55401;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f55399;
            if (method != null) {
                try {
                    iM45868 = ((Integer) method.invoke(popupWindow, view4, Integer.valueOf(i6), Boolean.valueOf(z2))).intValue();
                } catch (Exception unused) {
                    iM45868 = popupWindow.getMaxAvailableHeight(view4, i6);
                }
            } else {
                iM45868 = popupWindow.getMaxAvailableHeight(view4, i6);
            }
        } else {
            iM45868 = C19944.m45868(popupWindow, view4, i6, z2);
        }
        int i7 = this.f55407;
        if (i7 == -1) {
            i2 = iM45868 + i;
        } else {
            int i8 = this.f55403;
            if (i8 != -2) {
                iMakeMeasureSpec = i8 != -1 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iMo24862 = this.f55410.mo24862(iMakeMeasureSpec, iM45868 - measuredHeight);
            if (iMo24862 > 0) {
                measuredHeight += this.f55410.getPaddingBottom() + this.f55410.getPaddingTop() + i;
            }
            i2 = iMo24862 + measuredHeight;
        }
        boolean z3 = popupWindow.getInputMethodMode() == 2;
        C20323.m46664(popupWindow, this.f55408);
        if (popupWindow.isShowing()) {
            if (this.f55420.isAttachedToWindow()) {
                int width = this.f55403;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f55420.getWidth();
                }
                if (i7 == -1) {
                    i7 = z3 ? i2 : -1;
                    if (z3) {
                        popupWindow.setWidth(this.f55403 == -1 ? -1 : 0);
                        popupWindow.setHeight(0);
                    } else {
                        popupWindow.setWidth(this.f55403 == -1 ? -1 : 0);
                        popupWindow.setHeight(-1);
                    }
                } else if (i7 == -2) {
                    i7 = i2;
                }
                popupWindow.setOutsideTouchable(true);
                popupWindow.update(this.f55420, this.f55421, this.f55401, width < 0 ? -1 : width, i7 < 0 ? -1 : i7);
                return;
            }
            return;
        }
        int width2 = this.f55403;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f55420.getWidth();
        }
        if (i7 == -1) {
            i7 = -1;
        } else if (i7 == -2) {
            i7 = i2;
        }
        popupWindow.setWidth(width2);
        popupWindow.setHeight(i7);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f55397;
            if (method2 != null) {
                try {
                    method2.invoke(popupWindow, Boolean.TRUE);
                } catch (Exception unused2) {
                }
            }
            z = true;
        } else {
            z = true;
            C15468.m37026(popupWindow, true);
        }
        popupWindow.setOutsideTouchable(z);
        popupWindow.setTouchInterceptor(this.f55417);
        if (this.f55405) {
            C20323.m46665(popupWindow, this.f55413);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f55398;
            if (method3 != null) {
                try {
                    method3.invoke(popupWindow, this.f55406);
                } catch (Exception unused3) {
                }
            }
        } else {
            C15468.m37025(popupWindow, this.f55406);
        }
        popupWindow.showAsDropDown(this.f55420, this.f55421, this.f55401, this.f55400);
        this.f55410.setSelection(-1);
        if ((!this.f55422 || this.f55410.isInTouchMode()) && (c9479 = this.f55410) != null) {
            c9479.m24863(true);
            c9479.requestLayout();
        }
        if (this.f55422) {
            return;
        }
        this.f55414.post(this.f55404);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m39954() {
        this.f55405 = true;
        this.f55413 = true;
    }
}
