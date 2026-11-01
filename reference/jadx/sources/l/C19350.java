package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1AU */
/* JADX INFO: loaded from: classes5.dex */
public class C19350 extends AbstractC3472 implements InterfaceC17233 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f62391;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f62392;

    public C19350(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62391 = false;
        this.f62392 = false;
        mo8328(attributeSet);
    }

    public C19350(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f62391 = false;
        this.f62392 = false;
        mo8328(attributeSet);
    }

    @Override // l.AbstractC3472
    /* JADX INFO: renamed from: ۙ */
    public final void mo8328(AttributeSet attributeSet) {
        super.mo8328(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16029.f51895);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f62391 = typedArrayObtainStyledAttributes.getBoolean(index, this.f62391);
                } else if (index == 0) {
                    this.f62392 = typedArrayObtainStyledAttributes.getBoolean(index, this.f62392);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m44356() {
        return this.f62391;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m44355() {
        return this.f62392;
    }
}
