package l;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: renamed from: l.ܿۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: BB1T */
/* JADX INFO: loaded from: classes4.dex */
public final class C17133 implements TransformationMethod {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final TransformationMethod f54646;

    public C17133(TransformationMethod transformationMethod) {
        this.f54646 = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f54646;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C12817.m31807().m31814() != 1) {
            return charSequence;
        }
        C12817 c12817M31807 = C12817.m31807();
        c12817M31807.getClass();
        return c12817M31807.m31815(0, charSequence.length(), charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f54646;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final TransformationMethod m40039() {
        return this.f54646;
    }
}
