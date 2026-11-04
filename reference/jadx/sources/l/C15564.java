package l;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܳ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes5.dex */
public final class C15564 implements InterfaceC16047 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18045 f50621;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f50622;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20283 f50623;

    public C15564(C18045 c18045, C20283 c20283, String str) {
        this.f50621 = c18045;
        this.f50623 = c20283;
        this.f50622 = str;
    }

    @Override // l.InterfaceC16047
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11572 mo7395() {
        return this.f50621;
    }

    @Override // l.InterfaceC16047
    /* JADX INFO: renamed from: ۙ */
    public final void mo7396(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f50623.m46582(concurrentLinkedQueue, "", true, (Predicate) null);
    }

    @Override // l.InterfaceC16047
    /* JADX INFO: renamed from: ۙ */
    public final C1878 mo7394(ArrayList arrayList) {
        return new C1878("", "Usage: " + this.f50622, arrayList);
    }
}
