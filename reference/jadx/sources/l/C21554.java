package l;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩸ۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1EE */
/* JADX INFO: loaded from: classes5.dex */
public final class C21554 implements InterfaceC0737 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f69993;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1092 f69994;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f69995;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6094 f69996;

    public C21554(C1092 c1092, C6094 c6094, String str, String str2) {
        this.f69994 = c1092;
        this.f69996 = c6094;
        this.f69995 = str;
        this.f69993 = str2;
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7794 mo3200() {
        return this.f69994;
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۙ */
    public final void mo3202(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f69996.m16539(concurrentLinkedQueue, "", true, (Predicate) null);
    }

    @Override // l.InterfaceC0737
    /* JADX INFO: renamed from: ۙ */
    public final C10617 mo3201(ArrayList arrayList) {
        return new C10617("", "Usage: " + this.f69995 + "->" + this.f69993, arrayList);
    }
}
