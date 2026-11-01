package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܰܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBDV */
/* JADX INFO: loaded from: classes4.dex */
public class C13905 extends AbstractC9901 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C4731 f45810;

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ֨ */
    public String mo2375() {
        return "array";
    }

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public boolean mo2379() {
        return false;
    }

    public C13905(C4731 c4731) {
        c4731.m43642();
        this.f45810 = c4731;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C13905)) {
            return false;
        }
        return this.f45810.equals(((C13905) obj).f45810);
    }

    public int hashCode() {
        return this.f45810.hashCode();
    }

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public int mo2378(AbstractC9901 abstractC9901) {
        return this.f45810.compareTo(((C13905) abstractC9901).f45810);
    }

    public String toString() {
        return this.f45810.m15250("array{");
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public String mo2376() {
        return this.f45810.m15251("{", l.d);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C4731 m33738() {
        return this.f45810;
    }
}
