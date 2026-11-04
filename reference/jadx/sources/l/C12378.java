package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۨ۬ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: L57K */
/* JADX INFO: loaded from: classes4.dex */
public final class C12378 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f39748;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Consumer f39749;

    public C12378(String str, Consumer consumer) {
        this.f39748 = str;
        this.f39749 = consumer;
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        this.f39749.n(c2551);
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    public final String getName() {
        return this.f39748;
    }
}
