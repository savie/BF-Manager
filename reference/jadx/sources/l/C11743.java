package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ۧܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11743 extends C8015 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14854 f37973;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11743(Object obj, C14854 c14854) {
        super(obj);
        this.f37973 = c14854;
    }

    @Override // l.C8015
    /* JADX INFO: renamed from: ᩸ */
    public final void mo7060() {
        int iM21879 = m21879() & 2;
        C14854 c14854 = this.f37973;
        if (iM21879 != 0) {
            c14854.m35782(-1, null);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", null);
        c14854.m35782(0, bundle);
    }
}
