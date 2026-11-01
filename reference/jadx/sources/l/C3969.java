package l;

import android.content.Intent;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3969 extends AbstractC15260 {
    @Override // l.AbstractC15260
    /* JADX INFO: renamed from: ۙ */
    public final void mo4217(AbstractActivityC12483 abstractActivityC12483) {
        if (!C1709.m5692()) {
            C15829.m37611(R.string.MT_Protector);
            new ViewOnClickListenerC19680(abstractActivityC12483);
        } else {
            abstractActivityC12483.startActivity(new Intent(abstractActivityC12483, (Class<?>) ActivityC23376.class));
        }
    }
}
