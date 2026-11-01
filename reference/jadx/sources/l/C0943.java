package l;

import android.view.MenuItem;

/* JADX INFO: renamed from: l.֨ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8VQ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0943 implements InterfaceC10597 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3747;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3748;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3749;

    public /* synthetic */ C0943(int i, Object obj, Object obj2) {
        this.f3748 = i;
        this.f3749 = obj;
        this.f3747 = obj2;
    }

    @Override // l.InterfaceC10597
    /* JADX INFO: renamed from: ۙ */
    public final void mo1473(Object obj) {
        switch (this.f3748) {
            case 0:
                C15056 c15056 = (C15056) this.f3749;
                ((MenuItem) this.f3747).setEnabled(((Boolean) c15056.f49068.m44956()).booleanValue() || ((Boolean) c15056.f49079.m44956()).booleanValue());
                break;
            default:
                C8432.m22083((C8432) this.f3749, (C12665) this.f3747);
                break;
        }
    }
}
