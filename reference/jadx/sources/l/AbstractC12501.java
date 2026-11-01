package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: l.۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1BE */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12501 extends AbstractC3472 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f41800;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f41801;

    /* JADX INFO: renamed from: ۙ */
    public void mo8330(C10842 c10842, int i, int i2) {
    }

    public AbstractC12501(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractC12501(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // l.AbstractC3472
    /* JADX INFO: renamed from: ۙ */
    public void mo8328(AttributeSet attributeSet) {
        super.mo8328(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16029.f51890);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f41800 = true;
                } else if (index == 13) {
                    this.f41801 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // l.AbstractC3472, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f41800 || this.f41801) && (parent = getParent()) != null && (parent instanceof C5444)) {
            C5444 c5444 = (C5444) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f12751; i++) {
                View viewById = c5444.getViewById(this.f12747[i]);
                if (viewById != null) {
                    if (this.f41800) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f41801 && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        m10196();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        m10196();
    }
}
