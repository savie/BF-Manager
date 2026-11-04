package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩸ۤ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: A940 */
/* JADX INFO: loaded from: classes.dex */
public final class C22741 extends AbstractC6559 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19757 f73791;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f73792;

    @Override // l.AbstractC6559
    /* JADX INFO: renamed from: ᩷ */
    public final int mo13346() {
        return this.f73792.size();
    }

    @Override // l.AbstractC6559
    /* JADX INFO: renamed from: ۙ */
    public final int mo13344() {
        return this.f73791.f63586.size();
    }

    @Override // l.AbstractC6559
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo13347(int i, int i2) {
        return this.f73792.get(i) == this.f73791.f63586.get(i2);
    }

    @Override // l.AbstractC6559
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo13345(int i, int i2) {
        return this.f73792.get(i) == this.f73791.f63586.get(i2);
    }

    public C22741(C19757 c19757, ArrayList arrayList) {
        this.f73791 = c19757;
        this.f73792 = arrayList;
    }
}
