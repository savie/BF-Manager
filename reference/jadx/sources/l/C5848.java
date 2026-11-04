package l;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z11M */
/* JADX INFO: loaded from: classes3.dex */
public class C5848 extends AbstractC11813 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public C20956 f20077;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public AbstractDialogInterfaceOnClickListenerC8552 f20078;

    public C5848(Context context) {
        super(context);
        m17035();
    }

    public C5848(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m17035();
    }

    public C5848(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m17035();
    }

    public C5848(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m17035();
    }

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    private void m17035() {
        AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) C3200.m10534(m12560());
        if (abstractActivityC17204 != null) {
            this.f20077 = ViewOnClickListenerC11499.m28899(abstractActivityC17204, new C0249(3, this));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17034(C5848 c5848, String str) {
        if (c5848.f20078 != null) {
            if (str.length() > 1 && str.endsWith("/")) {
                str = C1402.m5124(1, 0, str);
            }
            c5848.f20078.m22924((CharSequence) str);
            c5848.f20078.m22916();
        }
    }

    @Override // l.AbstractC11813
    /* JADX INFO: renamed from: ۙ */
    public final void mo2388(AbstractActivityC17204 abstractActivityC17204) {
        C13305 c13305 = new C13305(this, abstractActivityC17204);
        c13305.m22953((CharSequence) m12578().toString());
        c13305.m22942(1000);
        c13305.m22924((CharSequence) m29658().getString(m12557(), "/sdcard/MT2"));
        c13305.m22957(6);
        c13305.m22918();
        c13305.m22916();
        this.f20078 = c13305;
        if (this.f20077 != null) {
            c13305.m22926(new ViewOnClickListenerC16971(3, this));
        }
        this.f20078.m22955(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17033(C5848 c5848) {
        c5848.f20077.m37643(0, R.string.MT_Protector, c5848.f20078.m22914(), (String) null, (String[]) null, (Bundle) null);
    }
}
