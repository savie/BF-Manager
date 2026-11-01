package l;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.Button;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܶܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z11M */
/* JADX INFO: loaded from: classes5.dex */
public class C15347 extends AbstractC18168 {

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public AbstractDialogInterfaceOnClickListenerC17341 f49959;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public C23566 f49960;

    public C15347(Context context) {
        super(context);
        m36744();
    }

    public C15347(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m36744();
    }

    public C15347(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m36744();
    }

    public C15347(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m36744();
    }

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    private void m36744() {
        AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) C8703.m22527(m13133());
        if (abstractActivityC12483 != null) {
            this.f49960 = ViewOnClickListenerC8374.m21926(abstractActivityC12483, new C2544(this));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m36743(C15347 c15347, String str) {
        if (c15347.f49959 != null) {
            if (str.length() > 1 && str.endsWith("/")) {
                str = C20630.m46498(1, 0, str);
            }
            c15347.f49959.m40346((CharSequence) str);
            c15347.f49959.m40371();
        }
    }

    @Override // l.AbstractC18168
    /* JADX INFO: renamed from: ۙ */
    public final void mo950(AbstractActivityC12483 abstractActivityC12483) {
        C23108 c23108 = new C23108(this, abstractActivityC12483);
        c23108.m40366((CharSequence) m13158().toString());
        c23108.m40375(1000);
        c23108.m40346((CharSequence) m42292().getString(m13157(), "/sdcard/MT2"));
        c23108.m40336(6);
        c23108.m40340();
        c23108.m40371();
        this.f49959 = c23108;
        if (this.f49960 != null) {
            Button buttonM40349 = c23108.m40349();
            buttonM40349.setVisibility(0);
            buttonM40349.setOnClickListener(new ViewOnClickListenerC4450(3, this));
        }
        this.f49959.m40368(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36742(C15347 c15347) {
        c15347.f49960.m46684(0, R.string.MT_Protector, c15347.f49959.m40352(), (String) null, (String[]) null, (Bundle) null);
    }
}
