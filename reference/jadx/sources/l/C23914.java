package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.᩻᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes.dex */
public final class C23914 implements InterfaceC14742 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Intent f77475;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractServiceC13457 f77476;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f77477;

    public C23914(AbstractServiceC13457 abstractServiceC13457, Intent intent, int i) {
        this.f77476 = abstractServiceC13457;
        this.f77475 = intent;
        this.f77477 = i;
    }

    @Override // l.InterfaceC14742
    public final Intent getIntent() {
        return this.f77475;
    }

    @Override // l.InterfaceC14742
    /* JADX INFO: renamed from: ۙ */
    public final void mo6535() {
        this.f77476.stopSelf(this.f77477);
    }
}
