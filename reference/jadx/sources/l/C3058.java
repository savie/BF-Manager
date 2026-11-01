package l;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: l.ۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: OB0Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C3058 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0199 f11525;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextView f11526;

    public C3058(TextView textView) {
        this.f11526 = textView;
        this.f11525 = new C0199(textView);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9165(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f11526.getContext().obtainStyledAttributes(attributeSet, C12108.f40518, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m9169(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m9169(boolean z) {
        this.f11525.m1472(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9167() {
        return this.f11525.m1470();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputFilter[] m9168(InputFilter[] inputFilterArr) {
        return this.f11525.m1471(inputFilterArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9166(boolean z) {
        this.f11525.m1469(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TransformationMethod m9164(TransformationMethod transformationMethod) {
        return this.f11525.m1468(transformationMethod);
    }
}
