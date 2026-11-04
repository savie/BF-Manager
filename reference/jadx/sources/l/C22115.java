package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.᩷ܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22115 extends AbstractC10926 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f71283;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f71284;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f71285;

    public C22115(C20348 c20348) {
        super(8);
        this.f71285 = c20348.m46758();
        this.f71283 = c20348.m46741();
        this.f71284 = c20348.m46758();
    }

    @Override // l.AbstractC10926
    /* JADX INFO: renamed from: ۙ */
    public final void mo1477(AbstractActivityC17204 abstractActivityC17204) {
        byte[] bArrM2346 = C0486.m2346(this.f71283, this.f71284);
        if (bArrM2346 != null) {
            Intent intent = new Intent(abstractActivityC17204, (Class<?>) ActivityC16147.class);
            intent.putExtra("title", this.f71285);
            intent.putExtra("markdown", bArrM2346);
            abstractActivityC17204.startActivity(intent);
            return;
        }
        new C4961(this, abstractActivityC17204).m8197();
    }
}
