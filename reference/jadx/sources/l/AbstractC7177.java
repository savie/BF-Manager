package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: l.ۜܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1BE */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7177 extends AbstractC13143 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f23705;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f23706;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo19752(C21789 c21789, int i, int i2) {
    }

    public AbstractC7177(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractC7177(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // l.AbstractC13143
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo19751(AttributeSet attributeSet) {
        super.mo19751(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1211.f4439);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f23705 = true;
                } else if (index == 13) {
                    this.f23706 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // l.AbstractC13143, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f23705 || this.f23706) && (parent = getParent()) != null && (parent instanceof C16872)) {
            C16872 c16872 = (C16872) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f42035; i++) {
                View viewById = c16872.getViewById(this.f42036[i]);
                if (viewById != null) {
                    if (this.f23705) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f23706 && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        m32668();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        m32668();
    }
}
