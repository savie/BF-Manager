package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.ۜۘ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6893 extends AbstractC10926 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f22868;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f22869;

    public C6893(C20348 c20348) {
        super(4);
        this.f22868 = c20348.m46758();
        this.f22869 = C15768.m37705(c20348.m46758());
    }

    @Override // l.AbstractC10926
    /* JADX INFO: renamed from: ۙ */
    public final void mo1477(AbstractActivityC17204 abstractActivityC17204) {
        Intent intent = new Intent(abstractActivityC17204, (Class<?>) ActivityC16147.class);
        intent.putExtra("title", this.f22868);
        intent.putExtra("markdown", this.f22869);
        abstractActivityC17204.startActivity(intent);
    }
}
