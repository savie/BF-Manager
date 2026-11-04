package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩶᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZR */
/* JADX INFO: loaded from: classes4.dex */
public class C11120 extends AbstractC5901 {

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public String f35066;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final C22309 f35067;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public String f35068;

    public C11120(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f35067 = new C22309(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9430.f30596, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(7);
        m17141(string == null ? typedArrayObtainStyledAttributes.getString(0) : string);
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        m17137(string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2);
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.f35066 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        mo7306();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f35068 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        mo7306();
        m17136(typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public C11120(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2506.m8385(context, R.attr.MT_Protector, android.R.attr.switchPreferenceStyle));
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo12570(C1228 c1228) {
        super.mo12570(c1228);
        m28070(c1228.m4463(android.R.id.switch_widget));
        m17140(c1228.m4463(android.R.id.summary));
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۙ */
    public final void mo12565(View view) {
        super.mo12565(view);
        if (((AccessibilityManager) m12560().getSystemService("accessibility")).isEnabled()) {
            m28070(view.findViewById(android.R.id.switch_widget));
            m17140(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m28070(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f20203);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.f35066);
            r4.setTextOff(this.f35068);
            r4.setOnCheckedChangeListener(this.f35067);
        }
    }
}
