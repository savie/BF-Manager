package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩵᩶ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZR */
/* JADX INFO: loaded from: classes5.dex */
public class C19694 extends AbstractC16166 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public String f63238;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public String f63239;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final C8405 f63240;

    public C19694(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f63240 = new C8405(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6993.f23533, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(7);
        m38260(string == null ? typedArrayObtainStyledAttributes.getString(0) : string);
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        m38261(string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2);
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.f63239 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        mo8453();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f63238 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        mo8453();
        m38262(typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public C19694(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12398.m30832(context, R.attr.MT_Protector, android.R.attr.switchPreferenceStyle));
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo8452(C4170 c4170) {
        super.mo8452(c4170);
        m44821(c4170.m11813(android.R.id.switch_widget));
        m38264(c4170.m11813(android.R.id.summary));
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo9283(View view) {
        super.mo9283(view);
        if (((AccessibilityManager) m13133().getSystemService("accessibility")).isEnabled()) {
            m44821(view.findViewById(android.R.id.switch_widget));
            m38264(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m44821(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f52240);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.f63239);
            r4.setTextOff(this.f63238);
            r4.setOnCheckedChangeListener(this.f63240);
        }
    }
}
