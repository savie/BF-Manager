package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩶۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 998H */
/* JADX INFO: loaded from: classes5.dex */
public final class C20020 extends AbstractC13946 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f64124;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f64125;

    @Override // l.AbstractC13946
    /* JADX INFO: renamed from: ܰ */
    public final int mo7139() {
        return this.f64125.size();
    }

    @Override // l.AbstractC13946
    /* JADX INFO: renamed from: ۙ */
    public final int mo7137() {
        return this.f64124.size();
    }

    @Override // l.AbstractC13946
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo7140(int i, int i2) {
        return ((AbstractC17902) this.f64125.get(i)).m41563() == ((AbstractC17902) this.f64124.get(i2)).m41563();
    }

    @Override // l.AbstractC13946
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo7138(int i, int i2) {
        return this.f64125.get(i) == this.f64124.get(i2);
    }

    public C20020(ArrayList arrayList, ArrayList arrayList2) {
        this.f64125 = arrayList;
        this.f64124 = arrayList2;
    }
}
