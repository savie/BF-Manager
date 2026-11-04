package l;

import android.content.Intent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬ۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13604 extends AbstractC10926 {
    @Override // l.AbstractC10926
    /* JADX INFO: renamed from: ۙ */
    public final void mo1477(AbstractActivityC17204 abstractActivityC17204) {
        if (!C18978.m44079()) {
            C22673.m51152(R.string.MT_Protector);
            new ViewOnClickListenerC16544(abstractActivityC17204);
        } else {
            abstractActivityC17204.startActivity(new Intent(abstractActivityC17204, (Class<?>) ActivityC3910.class));
        }
    }
}
