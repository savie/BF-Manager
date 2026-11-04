package l;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes5.dex */
public final class C20040 implements InterfaceC16047 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2383 f64383;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f64384;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20283 f64385;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f64386;

    public C20040(C2383 c2383, C20283 c20283, String str, String str2) {
        this.f64383 = c2383;
        this.f64385 = c20283;
        this.f64384 = str;
        this.f64386 = str2;
    }

    @Override // l.InterfaceC16047
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11572 mo7395() {
        return this.f64383;
    }

    @Override // l.InterfaceC16047
    /* JADX INFO: renamed from: ۙ */
    public final void mo7396(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f64385.m46582(concurrentLinkedQueue, "", true, (Predicate) null);
    }

    @Override // l.InterfaceC16047
    /* JADX INFO: renamed from: ۙ */
    public final C1878 mo7394(ArrayList arrayList) {
        return new C1878("", "Usage: " + this.f64384 + "->" + this.f64386, arrayList);
    }
}
