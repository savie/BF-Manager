package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩶ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5T9 */
/* JADX INFO: loaded from: classes4.dex */
public class C10522 extends AbstractC16166 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public String f36016;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public String f36017;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final C9111 f36018;

    public C10522(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f36018 = new C9111(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6993.f23532, i, i2);
        String string = typedArrayObtainStyledAttributes.getString(7);
        m38260(string == null ? typedArrayObtainStyledAttributes.getString(0) : string);
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        m38261(string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2);
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.f36017 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        mo8453();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f36016 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        mo8453();
        m38262(typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public C10522(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C10522(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector);
    }

    public C10522(Context context) {
        this(context, null);
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo8452(C4170 c4170) {
        super.mo8452(c4170);
        m26661(c4170.m11813(R.id.MT_Protector));
        m38264(c4170.m11813(android.R.id.summary));
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo9283(View view) {
        super.mo9283(view);
        if (((AccessibilityManager) m13133().getSystemService("accessibility")).isEnabled()) {
            m26661(view.findViewById(R.id.MT_Protector));
            m38264(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m26661(View view) {
        boolean z = view instanceof C12562;
        if (z) {
            ((C12562) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f52240);
        }
        if (z) {
            C12562 c12562 = (C12562) view;
            c12562.setTextOn(this.f36017);
            c12562.setTextOff(this.f36016);
            c12562.setOnCheckedChangeListener(this.f36018);
        }
    }
}
