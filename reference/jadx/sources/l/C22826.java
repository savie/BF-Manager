package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩸۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 998H */
/* JADX INFO: loaded from: classes.dex */
public final class C22826 extends AbstractC6559 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f73981;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f73982;

    @Override // l.AbstractC6559
    /* JADX INFO: renamed from: ᩷ */
    public final int mo13346() {
        return this.f73982.size();
    }

    @Override // l.AbstractC6559
    /* JADX INFO: renamed from: ۙ */
    public final int mo13344() {
        return this.f73981.size();
    }

    @Override // l.AbstractC6559
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo13347(int i, int i2) {
        return ((AbstractC18900) this.f73982.get(i)).m43844() == ((AbstractC18900) this.f73981.get(i2)).m43844();
    }

    @Override // l.AbstractC6559
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13345(int i, int i2) {
        return this.f73982.get(i) == this.f73981.get(i2);
    }

    public C22826(ArrayList arrayList, ArrayList arrayList2) {
        this.f73982 = arrayList;
        this.f73981 = arrayList2;
    }
}
