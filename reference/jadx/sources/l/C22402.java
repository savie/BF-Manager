package l;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: OB0Y */
/* JADX INFO: loaded from: classes.dex */
public final class C22402 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4352 f72547;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TextView f72548;

    public C22402(TextView textView) {
        this.f72548 = textView;
        this.f72547 = new C4352(textView);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50477(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f72548.getContext().obtainStyledAttributes(attributeSet, C10401.f33068, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m50481(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50481(boolean z) {
        this.f72547.m13860(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50479() {
        return this.f72547.m13858();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputFilter[] m50480(InputFilter[] inputFilterArr) {
        return this.f72547.m13859(inputFilterArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50478(boolean z) {
        this.f72547.m13857(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TransformationMethod m50476(TransformationMethod transformationMethod) {
        return this.f72547.m13856(transformationMethod);
    }
}
