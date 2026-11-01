package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۗ۟ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05VZ */
/* JADX INFO: loaded from: classes3.dex */
public class C3092 extends AbstractC16166 {

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final C9444 f11680;

    public C3092(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f11680 = new C9444(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6993.f23530, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(5);
        m38260(string == null ? typedArrayObtainStyledAttributes.getString(0) : string);
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        m38261(string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2);
        m38262(typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public C3092(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C12398.m30832(context, R.attr.MT_Protector, android.R.attr.checkBoxPreferenceStyle));
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ */
    public final void mo8452(C4170 c4170) {
        super.mo8452(c4170);
        m9282(c4170.m11813(android.R.id.checkbox));
        m38264(c4170.m11813(android.R.id.summary));
    }

    @Override // l.C4751
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9283(View view) {
        super.mo9283(view);
        if (((AccessibilityManager) m13133().getSystemService("accessibility")).isEnabled()) {
            m9282(view.findViewById(android.R.id.checkbox));
            m38264(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m9282(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f52240);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f11680);
        }
    }
}
