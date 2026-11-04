package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ܿۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1AU */
/* JADX INFO: loaded from: classes5.dex */
public class C18299 extends AbstractC13143 implements InterfaceC13823 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f59663;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f59664;

    public C18299(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59663 = false;
        this.f59664 = false;
        mo19751(attributeSet);
    }

    public C18299(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f59663 = false;
        this.f59664 = false;
        mo19751(attributeSet);
    }

    @Override // l.AbstractC13143
    /* JADX INFO: renamed from: ۙ */
    public final void mo19751(AttributeSet attributeSet) {
        super.mo19751(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1211.f4441);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f59663 = typedArrayObtainStyledAttributes.getBoolean(index, this.f59663);
                } else if (index == 0) {
                    this.f59664 = typedArrayObtainStyledAttributes.getBoolean(index, this.f59664);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m42634() {
        return this.f59663;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m42635() {
        return this.f59664;
    }
}
