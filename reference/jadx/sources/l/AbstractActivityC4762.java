package l;

import android.os.Bundle;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۙܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S54T */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC4762 extends AbstractActivityC12483 {

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f16776 = 0;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public static final HashSet f16777;

    /* JADX INFO: renamed from: ۖܰ, reason: not valid java name and contains not printable characters */
    public final int f16778;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo13231(C2875 c2875, C13344 c13344) {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo13232(C2875 c2875, C4751 c4751, Object obj) {
        return false;
    }

    static {
        HashSet hashSetM47669 = C21209.m47669(2);
        Collections.addAll(hashSetM47669, "bottom_toolbar_padding_type", "keep_in_editor_options");
        f16777 = hashSetM47669;
    }

    public AbstractActivityC4762(int i) {
        this.f16778 = i;
        m31013();
    }

    @Override // l.AbstractActivityC12483, l.ActivityC4866, l.ActivityC19126, l.ActivityC1086, l.ActivityC16858, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m31016(R.string.MT_Protector);
        m31016(R.layout.MT_Protector);
        C6938 c6938 = (C6938) m31016(R.id.MT_Protector);
        this.f41645 = c6938;
        m31004(c6938);
        m31017();
        this.f41645.setNavigationOnClickListener(new ViewOnClickListenerC9227(0, this));
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("layoutID", this.f16778);
            String stringExtra = getIntent().getStringExtra("scrollTo");
            if (stringExtra != null) {
                bundle2.putString("scrollTo", stringExtra);
            }
            C2875 c2875 = new C2875();
            c2875.setArguments(bundle2);
            AbstractC11447 abstractC11447M23118 = m43943().m23118();
            abstractC11447M23118.m28562(R.id.MT_Protector, c2875, null);
            abstractC11447M23118.mo8560();
        }
    }
}
