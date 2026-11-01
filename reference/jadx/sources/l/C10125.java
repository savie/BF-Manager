package l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.ۤۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: L5HA */
/* JADX INFO: loaded from: classes3.dex */
public class C10125 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f34614;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f34615;

    public C10125(View view, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C5891.f20099, i, 0);
        this.f34614 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        this.f34615 = typedArrayObtainStyledAttributes.getInt(1, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public C10125() {
        this.f34614 = false;
        this.f34615 = -1;
    }
}
