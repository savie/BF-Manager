package l;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes4.dex */
public final class C13327 implements InterfaceC16047 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC11572 f42509;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f42510;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20283 f42511;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f42512;

    public C13327(InterfaceC11572 interfaceC11572, C20283 c20283, String str, String str2) {
        this.f42509 = interfaceC11572;
        this.f42511 = c20283;
        this.f42510 = str;
        this.f42512 = str2;
    }

    @Override // l.InterfaceC16047
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11572 mo7395() {
        return this.f42509;
    }

    @Override // l.InterfaceC16047
    /* JADX INFO: renamed from: ۙ */
    public final void mo7396(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f42511.m46582(concurrentLinkedQueue, "", true, (Predicate) null);
    }

    @Override // l.InterfaceC16047
    /* JADX INFO: renamed from: ۙ */
    public final C1878 mo7394(ArrayList arrayList) {
        return new C1878("", "Usage: " + this.f42510 + "->" + this.f42512, arrayList);
    }
}
