package l;

import java.util.TreeSet;

/* JADX INFO: renamed from: l.ۘܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q74C */
/* JADX INFO: loaded from: classes3.dex */
public final class C4036 implements InterfaceC6299 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f14923;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TreeSet f14924 = new TreeSet(new C2945(1));

    @Override // l.InterfaceC21116
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11543(C15327 c15327, C2065 c2065) {
        TreeSet treeSet = this.f14924;
        treeSet.add(c2065);
        this.f14923 += c2065.f7657;
        while (this.f14923 > 209715200 && !treeSet.isEmpty()) {
            c15327.m36709((C2065) treeSet.first());
        }
    }

    @Override // l.InterfaceC21116
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11541(C2065 c2065) {
        this.f14924.remove(c2065);
        this.f14923 -= c2065.f7657;
    }

    @Override // l.InterfaceC21116
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11544(C15327 c15327, C2065 c2065, C2065 c2066) {
        mo11541(c2065);
        mo11543(c15327, c2066);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11542(C15327 c15327, long j) {
        if (j != -1) {
            while (this.f14923 + j > 209715200) {
                TreeSet treeSet = this.f14924;
                if (treeSet.isEmpty()) {
                    return;
                } else {
                    c15327.m36709((C2065) treeSet.first());
                }
            }
        }
    }
}
