package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֡᩶ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: F9B6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0665 implements InterfaceC7925 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f2534;

    public C0665(ArrayList arrayList) {
        this.f2534 = arrayList;
    }

    @Override // l.InterfaceC7925
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo2888() {
        for (C15580 c15580 : this.f2534) {
            int i = C18564.f60317[c15580.m37317().ordinal()];
            if (i == 1) {
                ((InterfaceC8670) c15580.m37318()).mo5147();
            } else if (i == 2) {
                ((InterfaceC13890) c15580.m37318()).mo33834();
            }
        }
    }

    @Override // l.InterfaceC7925
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List mo2889() {
        return this.f2534;
    }

    public final String toString() {
        return "CallSite{" + this.f2534 + '}';
    }
}
