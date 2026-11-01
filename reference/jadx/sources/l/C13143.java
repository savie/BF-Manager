package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.۬۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13143 extends AbstractC15260 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f43751;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f43752;

    public C13143(C17367 c17367) {
        super(4);
        this.f43751 = c17367.m40458();
        this.f43752 = C18019.m41967(c17367.m40458());
    }

    @Override // l.AbstractC15260
    /* JADX INFO: renamed from: ۙ */
    public final void mo4217(AbstractActivityC12483 abstractActivityC12483) {
        Intent intent = new Intent(abstractActivityC12483, (Class<?>) ActivityC15966.class);
        intent.putExtra("title", this.f43751);
        intent.putExtra("markdown", this.f43752);
        abstractActivityC12483.startActivity(intent);
    }
}
