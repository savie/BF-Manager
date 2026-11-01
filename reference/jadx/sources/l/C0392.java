package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.֡ۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 45G7 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0392 implements InterfaceC7359, InterfaceC20544, InterfaceC15954, InterfaceC0380, InterfaceC16602 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f1871;

    public /* synthetic */ C0392(Object obj) {
        this.f1871 = obj;
    }

    @Override // l.InterfaceC15954
    public Object apply(Object obj) {
        return (FutureC12075) this.f1871;
    }

    @Override // l.InterfaceC16602
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void mo2119() {
        ActivityC23892.m52651((ActivityC23892) this.f1871);
    }

    @Override // l.InterfaceC0380
    /* JADX INFO: renamed from: ۙ */
    public void mo1825(Object obj) {
        ((ActivityC5677) this.f1871).m15602((InterfaceC6432) obj);
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        ((InterfaceC19333) obj).mo2598((C5221) this.f1871);
    }

    @Override // l.InterfaceC20544
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo2120(String str) {
        return (str == null || ((HashSet) this.f1871).add(str)) ? false : true;
    }
}
