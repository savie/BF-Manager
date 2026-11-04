package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.ۖۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: L5HA */
/* JADX INFO: loaded from: classes2.dex */
public class C2395 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f7706;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f7707;

    public C2395(View view, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C15576.f50656, i, 0);
        this.f7706 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.f7707 = typedArrayObtainStyledAttributes.getInt(1, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public C2395() {
        this.f7706 = false;
        this.f7707 = -1;
    }
}
