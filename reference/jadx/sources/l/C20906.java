package l;

import android.content.Intent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 22BV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20906 extends AbstractC11026 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11672 f67936;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20906(C11672 c11672) {
        super(R.string.MT_Protector, R.drawable.MT_Protector);
        this.f67936 = c11672;
    }

    @Override // l.AbstractC11026
    /* JADX INFO: renamed from: ۙ */
    public final void mo2267(C11545 c11545) {
        Intent intent = new Intent(c11545.m28824(), (Class<?>) ViewOnLayoutChangeListenerC3333.class);
        intent.putExtra("PATH", this.f67936.m28640());
        c11545.m28824().startActivity(intent);
    }
}
