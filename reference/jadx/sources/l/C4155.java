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

/* JADX INFO: renamed from: l.ۘ۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4155 extends FrameLayout {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f14107;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public View.OnApplyWindowInsetsListener f14108;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f14109;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f14110;

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C15243.m36590(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C15243.m36590(view, "child");
        Object tag = view.getTag(R.id.MT_Protector);
        if ((tag instanceof ComponentCallbacksC11612 ? (ComponentCallbacksC11612) tag : null) == null) {
            throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C3977 c3977M51118;
        C15243.m36590(windowInsets, "insets");
        C3977 c3977M12812 = C3977.m12812(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f14108;
        if (onApplyWindowInsetsListener != null) {
            C15243.m36586(onApplyWindowInsetsListener);
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            C15243.m36591(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            c3977M51118 = C3977.m12812(null, windowInsetsOnApplyWindowInsets);
        } else {
            c3977M51118 = C22666.m51118(this, c3977M12812);
        }
        C15243.m36591(c3977M51118, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!c3977M51118.m12828()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C22666.m51083(getChildAt(i), c3977M51118);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C15243.m36590(canvas, "canvas");
        if (this.f14109) {
            Iterator it = this.f14110.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C15243.m36590(canvas, "canvas");
        C15243.m36590(view, "child");
        if (this.f14109) {
            ArrayList arrayList = this.f14110;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        C15243.m36590(onApplyWindowInsetsListener, MessageHandler.Properties.Listener);
        this.f14108 = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        C15243.m36590(view, "view");
        this.f14107.remove(view);
        if (this.f14110.remove(view)) {
            this.f14109 = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        C15243.m36590(view, "view");
        m13307(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        C15243.m36590(view, "view");
        m13307(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        C15243.m36590(view, "view");
        if (view.getParent() == this) {
            this.f14107.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4155(Context context) {
        super(context);
        C15243.m36590(context, d.R);
        this.f14110 = new ArrayList();
        this.f14107 = new ArrayList();
        this.f14109 = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4155(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C15243.m36590(context, d.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4155(Context context, AttributeSet attributeSet, int i) {
        String str;
        super(context, attributeSet, i);
        C15243.m36590(context, d.R);
        this.f14110 = new ArrayList();
        this.f14107 = new ArrayList();
        this.f14109 = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4966.f17289, 0, 0);
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
    public C4155(Context context, AttributeSet attributeSet, AbstractC3191 abstractC3191) {
        super(context, attributeSet);
        C15243.m36590(context, d.R);
        C15243.m36590(attributeSet, "attrs");
        this.f14110 = new ArrayList();
        this.f14107 = new ArrayList();
        this.f14109 = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4966.f17289, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        ComponentCallbacksC11612 componentCallbacksC11612M10441 = abstractC3191.m10441(id);
        if (classAttribute != null && componentCallbacksC11612M10441 == null) {
            if (id == -1) {
                throw new IllegalStateException(C14442.m34865("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C21309 c21309M10476 = abstractC3191.m10476();
            context.getClassLoader();
            ComponentCallbacksC11612 componentCallbacksC11612Mo27138 = c21309M10476.mo27138(classAttribute);
            C15243.m36591(componentCallbacksC11612Mo27138, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            componentCallbacksC11612Mo27138.onInflate(context, attributeSet, (Bundle) null);
            C22120 c22120 = new C22120(abstractC3191);
            c22120.f16271 = true;
            componentCallbacksC11612Mo27138.mContainer = this;
            c22120.mo14354(getId(), componentCallbacksC11612Mo27138, string, 1);
            if (c22120.f16263) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c22120.f16273 = false;
            c22120.f71289.m10457(c22120, true);
        }
        abstractC3191.m10447(this);
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13308(boolean z) {
        this.f14109 = z;
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        C15243.m36591(childAt, "view");
        m13307(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C15243.m36591(childAt, "view");
            m13307(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C15243.m36591(childAt, "view");
            m13307(childAt);
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
                C15243.m36591(childAt, "view");
                m13307(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m13307(View view) {
        if (this.f14107.contains(view)) {
            this.f14110.add(view);
        }
    }
}
