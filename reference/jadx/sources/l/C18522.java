package l;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: renamed from: l.ܿᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: BB1T */
/* JADX INFO: loaded from: classes4.dex */
public final class C18522 implements TransformationMethod {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TransformationMethod f60217;

    public C18522(TransformationMethod transformationMethod) {
        this.f60217 = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f60217;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C2203.m7520().m7521() != 1) {
            return charSequence;
        }
        C2203 c2203M7520 = C2203.m7520();
        c2203M7520.getClass();
        return c2203M7520.m7522(0, charSequence.length(), charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f60217;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TransformationMethod m43106() {
        return this.f60217;
    }
}
