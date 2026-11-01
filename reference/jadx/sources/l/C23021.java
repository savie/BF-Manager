package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.᩺۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23021 extends AbstractC15260 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f74812;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f74813;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f74814;

    public C23021(C17367 c17367) {
        super(8);
        this.f74812 = c17367.m40458();
        this.f74813 = c17367.m40454();
        this.f74814 = c17367.m40458();
    }

    @Override // l.AbstractC15260
    /* JADX INFO: renamed from: ۙ */
    public final void mo4217(AbstractActivityC12483 abstractActivityC12483) {
        byte[] bArrM24526 = C9616.m24526(this.f74813, this.f74814);
        if (bArrM24526 != null) {
            Intent intent = new Intent(abstractActivityC12483, (Class<?>) ActivityC15966.class);
            intent.putExtra("title", this.f74812);
            intent.putExtra("markdown", bArrM24526);
            abstractActivityC12483.startActivity(intent);
            return;
        }
        new C6792(this, abstractActivityC12483).m10243();
    }
}
