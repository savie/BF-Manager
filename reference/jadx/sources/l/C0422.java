package l;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* JADX INFO: renamed from: l.֡۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C4UM */
/* JADX INFO: loaded from: classes2.dex */
public final class C0422 implements TransformationMethod {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Locale f1967;

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public C0422(Context context) {
        this.f1967 = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f1967);
        }
        return null;
    }
}
