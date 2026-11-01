package l;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵ۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes5.dex */
public final class C19438 implements InterfaceC0737 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f62601;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3914 f62602;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f62603;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6094 f62604;

    public C19438(C3914 c3914, C6094 c6094, String str, String str2) {
        this.f62602 = c3914;
        this.f62604 = c6094;
        this.f62603 = str;
        this.f62601 = str2;
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7794 mo3200() {
        return this.f62602;
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۙ */
    public final void mo3202(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f62604.m16539(concurrentLinkedQueue, "", true, (Predicate) null);
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۙ */
    public final C10617 mo3201(ArrayList arrayList) {
        return new C10617("", "Override: " + this.f62603 + "->" + this.f62601, arrayList);
    }
}
