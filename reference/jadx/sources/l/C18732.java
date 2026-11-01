package l;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes5.dex */
public final class C18732 implements InterfaceC0737 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f60763;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7794 f60764;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f60765;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6094 f60766;

    public C18732(InterfaceC7794 interfaceC7794, C6094 c6094, String str, String str2) {
        this.f60764 = interfaceC7794;
        this.f60766 = c6094;
        this.f60765 = str;
        this.f60763 = str2;
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7794 mo3200() {
        return this.f60764;
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۙ */
    public final void mo3202(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f60766.m16539(concurrentLinkedQueue, "", true, (Predicate) null);
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۙ */
    public final C10617 mo3201(ArrayList arrayList) {
        return new C10617("", "Usage: " + this.f60765 + "->" + this.f60763, arrayList);
    }
}
