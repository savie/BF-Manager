package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۜۢܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes2.dex */
public class C6682 extends ViewGroup.LayoutParams {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f22547;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f22548;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f22549;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f22550;

    public C6682() {
        super(-1, -1);
        this.f22547 = 0.0f;
    }

    public C6682(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22547 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19383.f62469);
        this.f22548 = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
    }
}
