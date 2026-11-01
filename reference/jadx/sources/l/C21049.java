package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: P67K */
/* JADX INFO: loaded from: classes4.dex */
public final class C21049 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public LayoutInflater f68568;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f68569;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f68570;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public WeakReference f68571;

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public C21049(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C21049(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f68570 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12108.f40540, i, 0);
        this.f68569 = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f68570 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47463(LayoutInflater layoutInflater) {
        this.f68568 = layoutInflater;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        WeakReference weakReference = this.f68571;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m47462();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View m47462() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            int i = this.f68570;
            if (i != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflaterFrom = this.f68568;
                if (layoutInflaterFrom == null) {
                    layoutInflaterFrom = LayoutInflater.from(getContext());
                }
                View viewInflate = layoutInflaterFrom.inflate(i, viewGroup, false);
                int i2 = this.f68569;
                if (i2 != -1) {
                    viewInflate.setId(i2);
                }
                int iIndexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
                } else {
                    viewGroup.addView(viewInflate, iIndexOfChild);
                }
                this.f68571 = new WeakReference(viewInflate);
                return viewInflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }
}
