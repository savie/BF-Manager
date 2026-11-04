package l;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TabHost;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J62A */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class C6920 extends TabHost implements TabHost.OnTabChangeListener {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f22918;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f22919;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TabHost.OnTabChangeListener f22920;

    @Deprecated
    public C6920(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22919 = new ArrayList();
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
        this.f22920 = onTabChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getCurrentTabTag();
        ArrayList arrayList = this.f22919;
        if (arrayList.size() > 0) {
            ((C8411) arrayList.get(0)).getClass();
            throw null;
        }
        this.f22918 = true;
        m19205();
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22918 = false;
    }

    @Override // android.view.View
    @Deprecated
    public final Parcelable onSaveInstanceState() {
        C2445 c2445 = new C2445(super.onSaveInstanceState());
        c2445.f7829 = getCurrentTabTag();
        return c2445;
    }

    @Override // android.view.View
    @Deprecated
    public final void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof C2445)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2445 c2445 = (C2445) parcelable;
        super.onRestoreInstanceState(c2445.getSuperState());
        setCurrentTabByTag(c2445.f7829);
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public final void onTabChanged(String str) {
        if (this.f22918) {
            m19205();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f22920;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC4573 m19205() {
        ArrayList arrayList = this.f22919;
        if (arrayList.size() <= 0) {
            return null;
        }
        ((C8411) arrayList.get(0)).getClass();
        throw null;
    }
}
