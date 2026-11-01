package l;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۠ۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes3.dex */
public final class C8149 implements InterfaceC0737 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14415 f28499;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f28500;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6094 f28501;

    public C8149(C14415 c14415, C6094 c6094, String str) {
        this.f28499 = c14415;
        this.f28501 = c6094;
        this.f28500 = str;
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7794 mo3200() {
        return this.f28499;
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۙ */
    public final void mo3202(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f28501.m16539(concurrentLinkedQueue, "", true, (Predicate) null);
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۙ */
    public final C10617 mo3201(ArrayList arrayList) {
        return new C10617("", "Subclasses: " + this.f28500, arrayList);
    }
}
