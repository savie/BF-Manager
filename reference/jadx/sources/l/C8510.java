package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.۠۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes3.dex */
public class C8510 extends ViewGroup.LayoutParams {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f27814;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f27815;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f27816;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f27817;

    public C8510() {
        super(-1, -1);
        this.f27817 = 0.0f;
    }

    public C8510(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27817 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15179.f49504);
        this.f27814 = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
    }
}
