package l;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.᩹ܿܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes.dex */
public class C22432 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC12554 f73212;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f73213;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f73214;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f73215;

    public C22432(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f73213 = new Rect();
        this.f73215 = true;
        this.f73214 = false;
    }

    public C22432(int i, int i2) {
        super(i, i2);
        this.f73213 = new Rect();
        this.f73215 = true;
        this.f73214 = false;
    }

    public C22432(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f73213 = new Rect();
        this.f73215 = true;
        this.f73214 = false;
    }

    public C22432(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f73213 = new Rect();
        this.f73215 = true;
        this.f73214 = false;
    }

    public C22432(C22432 c22432) {
        super((ViewGroup.LayoutParams) c22432);
        this.f73213 = new Rect();
        this.f73215 = true;
        this.f73214 = false;
    }
}
