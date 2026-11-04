package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩴ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S5T9 */
/* JADX INFO: loaded from: classes5.dex */
public class C20071 extends AbstractC5901 {

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public String f64528;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final C23055 f64529;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public String f64530;

    public C20071(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f64529 = new C23055(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9430.f30594, i, i2);
        String string = typedArrayObtainStyledAttributes.getString(7);
        m17141(string == null ? typedArrayObtainStyledAttributes.getString(0) : string);
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        m17137(string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2);
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.f64528 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        mo7306();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f64530 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        mo7306();
        m17136(typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public C20071(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C20071(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C20071(Context context) {
        this(context, null);
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo12570(C1228 c1228) {
        super.mo12570(c1228);
        m46202(c1228.m4463(R.id.MT_Protector));
        m17140(c1228.m4463(android.R.id.summary));
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo12565(View view) {
        super.mo12565(view);
        if (((AccessibilityManager) m12560().getSystemService("accessibility")).isEnabled()) {
            m46202(view.findViewById(R.id.MT_Protector));
            m17140(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m46202(View view) {
        boolean z = view instanceof C1255;
        if (z) {
            ((C1255) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f20203);
        }
        if (z) {
            C1255 c1255 = (C1255) view;
            c1255.setTextOn(this.f64528);
            c1255.setTextOff(this.f64530);
            c1255.setOnCheckedChangeListener(this.f64529);
        }
    }
}
