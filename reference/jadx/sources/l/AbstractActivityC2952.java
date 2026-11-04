package l;

import android.os.Bundle;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۖ᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S54T */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC2952 extends AbstractActivityC17204 {

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public static final HashSet f9637;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f9638 = 0;

    /* JADX INFO: renamed from: ᩸᩷, reason: not valid java name and contains not printable characters */
    public final int f9639;

    /* JADX INFO: renamed from: ۙ */
    public void mo6716(C9663 c9663, C10176 c10176) {
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo6717(C9663 c9663, C3906 c3906, Object obj) {
        return false;
    }

    static {
        HashSet hashSetM30738 = C12324.m30738(2);
        Collections.addAll(hashSetM30738, "bottom_toolbar_padding_type", "keep_in_editor_options");
        f9637 = hashSetM30738;
    }

    public AbstractActivityC2952(int i) {
        this.f9639 = i;
        m40394();
    }

    @Override // l.AbstractActivityC17204, l.ActivityC7405, l.ActivityC3409, l.ActivityC5577, l.ActivityC8866, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m40418(R.string.MT_Protector);
        m40418(R.layout.MT_Protector);
        C16390 c16390 = (C16390) m40418(R.id.MT_Protector);
        this.f56046 = c16390;
        m40407(c16390);
        m40393();
        this.f56046.setNavigationOnClickListener(new ViewOnClickListenerC25177(3, this));
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("layoutID", this.f9639);
            String stringExtra = getIntent().getStringExtra("scrollTo");
            if (stringExtra != null) {
                bundle2.putString("scrollTo", stringExtra);
            }
            C9663 c9663 = new C9663();
            c9663.setArguments(bundle2);
            AbstractC4573 abstractC4573M10492 = m11155().m10492();
            abstractC4573M10492.m14353(R.id.MT_Protector, c9663, null);
            abstractC4573M10492.mo14363();
        }
    }
}
