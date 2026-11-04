package l;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֫᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes3.dex */
public final class C2141 implements InterfaceC16047 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13569 f7069;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f7070;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20283 f7071;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f7072;

    public C2141(C13569 c13569, C20283 c20283, String str, String str2) {
        this.f7069 = c13569;
        this.f7071 = c20283;
        this.f7070 = str;
        this.f7072 = str2;
    }

    @Override // l.InterfaceC16047
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11572 mo7395() {
        return this.f7069;
    }

    @Override // l.InterfaceC16047
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7396(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f7071.m46582(concurrentLinkedQueue, "", true, (Predicate) null);
    }

    @Override // l.InterfaceC16047
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1878 mo7394(ArrayList arrayList) {
        return new C1878("", "Override: " + this.f7070 + "->" + this.f7072, arrayList);
    }
}
