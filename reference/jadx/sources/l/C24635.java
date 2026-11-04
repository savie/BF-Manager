package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 05VZ */
/* JADX INFO: loaded from: classes.dex */
public class C24635 extends AbstractC5901 {

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final C6735 f79761;

    public C24635(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f79761 = new C6735(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9430.f30598, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(5);
        m17141(string == null ? typedArrayObtainStyledAttributes.getString(0) : string);
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        m17137(string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2);
        m17136(typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public C24635(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2506.m8385(context, R.attr.MT_Protector, android.R.attr.checkBoxPreferenceStyle));
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo12570(C1228 c1228) {
        super.mo12570(c1228);
        m54972(c1228.m4463(android.R.id.checkbox));
        m17140(c1228.m4463(android.R.id.summary));
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo12565(View view) {
        super.mo12565(view);
        if (((AccessibilityManager) m12560().getSystemService("accessibility")).isEnabled()) {
            m54972(view.findViewById(android.R.id.checkbox));
            m17140(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m54972(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f20203);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f79761);
        }
    }
}
