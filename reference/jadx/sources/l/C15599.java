package l;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.Iterator;
import net.engio.mbassy.listener.MessageHandler;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ܺ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1GQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15599 extends FrameLayout {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f50726;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public View.OnApplyWindowInsetsListener f50727;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f50728;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f50729;

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C13465.m32966(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C13465.m32966(view, "child");
        Object tag = view.getTag(R.id.MT_Protector);
        if ((tag instanceof ComponentCallbacksC22654 ? (ComponentCallbacksC22654) tag : null) == null) {
            throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C15844 c15844M14008;
        C13465.m32966(windowInsets, "insets");
        C15844 c15844M37669 = C15844.m37669(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f50727;
        if (onApplyWindowInsetsListener != null) {
            C13465.m32962(onApplyWindowInsetsListener);
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            C13465.m32967(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            c15844M14008 = C15844.m37669(null, windowInsetsOnApplyWindowInsets);
        } else {
            c15844M14008 = C5031.m14008(this, c15844M37669);
        }
        C13465.m32967(c15844M14008, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!c15844M14008.m37686()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C5031.m13978(getChildAt(i), c15844M14008);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C13465.m32966(canvas, "canvas");
        if (this.f50726) {
            Iterator it = this.f50729.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C13465.m32966(canvas, "canvas");
        C13465.m32966(view, "child");
        if (this.f50726) {
            ArrayList arrayList = this.f50729;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        C13465.m32966(onApplyWindowInsetsListener, MessageHandler.Properties.Listener);
        this.f50727 = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        C13465.m32966(view, "view");
        this.f50728.remove(view);
        if (this.f50729.remove(view)) {
            this.f50726 = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        C13465.m32966(view, "view");
        m37256(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        C13465.m32966(view, "view");
        m37256(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        C13465.m32966(view, "view");
        if (view.getParent() == this) {
            this.f50728.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15599(Context context) {
        super(context);
        C13465.m32966(context, d.R);
        this.f50729 = new ArrayList();
        this.f50728 = new ArrayList();
        this.f50726 = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C15599(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C13465.m32966(context, d.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15599(Context context, AttributeSet attributeSet, int i) {
        String str;
        super(context, attributeSet, i);
        C13465.m32966(context, d.R);
        this.f50729 = new ArrayList();
        this.f50728 = new ArrayList();
        this.f50726 = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11987.f40161, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = Name.LABEL;
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15599(Context context, AttributeSet attributeSet, AbstractC8894 abstractC8894) {
        super(context, attributeSet);
        C13465.m32966(context, d.R);
        C13465.m32966(attributeSet, "attrs");
        this.f50729 = new ArrayList();
        this.f50728 = new ArrayList();
        this.f50726 = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11987.f40161, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        ComponentCallbacksC22654 componentCallbacksC22654M23077 = abstractC8894.m23077(id);
        if (classAttribute != null && componentCallbacksC22654M23077 == null) {
            if (id == -1) {
                throw new IllegalStateException(C16523.m38890("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C0075 c0075M23108 = abstractC8894.m23108();
            context.getClassLoader();
            ComponentCallbacksC22654 componentCallbacksC22654Mo1008 = c0075M23108.mo1008(classAttribute);
            C13465.m32967(componentCallbacksC22654Mo1008, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            componentCallbacksC22654Mo1008.onInflate(context, attributeSet, (Bundle) null);
            C2813 c2813 = new C2813(abstractC8894);
            c2813.f38523 = true;
            componentCallbacksC22654Mo1008.mContainer = this;
            c2813.mo8555(getId(), componentCallbacksC22654Mo1008, string, 1);
            if (c2813.f38513) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c2813.f38519 = false;
            c2813.f10690.m23084(c2813, true);
        }
        abstractC8894.m23087(this);
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37257(boolean z) {
        this.f50726 = z;
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        C13465.m32967(childAt, "view");
        m37256(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C13465.m32967(childAt, "view");
            m37256(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C13465.m32967(childAt, "view");
            m37256(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                C13465.m32967(childAt, "view");
                m37256(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m37256(View view) {
        if (this.f50728.contains(view)) {
            this.f50729.add(view);
        }
    }
}
