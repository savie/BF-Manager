package l;

/* JADX INFO: renamed from: l.᩺ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 950L */
/* JADX INFO: loaded from: classes.dex */
public final class C22915 implements InterfaceC2568 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15154 f74487;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74488;

    public C22915(C15154 c15154, int i) {
        this.f74487 = c15154;
        this.f74488 = i;
    }

    @Override // l.InterfaceC2568
    public final int getKey() {
        return this.f74487.f49498 + this.f74488;
    }

    @Override // l.InterfaceC2568
    /* JADX INFO: renamed from: ۙ */
    public final int mo8019() {
        C15154 c15154 = this.f74487;
        return c15154.f49497.f22552.m41166().mo5859((this.f74488 * 4) + c15154.f49497.f22553 + 8);
    }
}
