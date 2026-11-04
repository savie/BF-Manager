package l;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ܿ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public class C18185 extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Rect f59425;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f59426;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f59427;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC11800 f59428;

    public C18185(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59425 = new Rect();
        this.f59427 = true;
        this.f59426 = false;
    }

    public C18185(int i, int i2) {
        super(i, i2);
        this.f59425 = new Rect();
        this.f59427 = true;
        this.f59426 = false;
    }

    public C18185(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f59425 = new Rect();
        this.f59427 = true;
        this.f59426 = false;
    }

    public C18185(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f59425 = new Rect();
        this.f59427 = true;
        this.f59426 = false;
    }

    public C18185(C18185 c18185) {
        super((ViewGroup.LayoutParams) c18185);
        this.f59425 = new Rect();
        this.f59427 = true;
        this.f59426 = false;
    }
}
