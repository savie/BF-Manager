package l;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TabHost;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J62A */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C4390 extends TabHost implements TabHost.OnTabChangeListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f15646;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f15647;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TabHost.OnTabChangeListener f15648;

    @Deprecated
    public C4390(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15646 = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.widget.TabHost
    @Deprecated
    public final void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Override // android.widget.TabHost
    @Deprecated
    public final void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f15648 = onTabChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getCurrentTabTag();
        ArrayList arrayList = this.f15646;
        if (arrayList.size() > 0) {
            ((C3248) arrayList.get(0)).getClass();
            throw null;
        }
        this.f15647 = true;
        m12252();
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15647 = false;
    }

    @Override // android.view.View
    @Deprecated
    public final Parcelable onSaveInstanceState() {
        C9600 c9600 = new C9600(super.onSaveInstanceState());
        c9600.f32347 = getCurrentTabTag();
        return c9600;
    }

    @Override // android.view.View
    @Deprecated
    public final void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof C9600)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C9600 c9600 = (C9600) parcelable;
        super.onRestoreInstanceState(c9600.getSuperState());
        setCurrentTabByTag(c9600.f32347);
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public final void onTabChanged(String str) {
        if (this.f15647) {
            m12252();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f15648;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC11447 m12252() {
        ArrayList arrayList = this.f15646;
        if (arrayList.size() <= 0) {
            return null;
        }
        ((C3248) arrayList.get(0)).getClass();
        throw null;
    }
}
