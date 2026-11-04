package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.ۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 268P */
/* JADX INFO: loaded from: classes4.dex */
public final class C11015 implements InterfaceC22950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Intent f34789;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractServiceC2067 f34790;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f34791;

    public C11015(AbstractServiceC2067 abstractServiceC2067, Intent intent, int i) {
        this.f34790 = abstractServiceC2067;
        this.f34789 = intent;
        this.f34791 = i;
    }

    @Override // l.InterfaceC22950
    public final Intent getIntent() {
        return this.f34789;
    }

    @Override // l.InterfaceC22950
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27881() {
        this.f34790.stopSelf(this.f34791);
    }
}
