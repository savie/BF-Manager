package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۤ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBDV */
/* JADX INFO: loaded from: classes4.dex */
public class C10722 extends AbstractC13487 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21911 f34049;

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ۫ */
    public String mo1845() {
        return "array";
    }

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩸ */
    public boolean mo1849() {
        return false;
    }

    public C10722(C21911 c21911) {
        c21911.m46488();
        this.f34049 = c21911;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10722)) {
            return false;
        }
        return this.f34049.equals(((C10722) obj).f34049);
    }

    public int hashCode() {
        return this.f34049.hashCode();
    }

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩷ */
    public int mo1848(AbstractC13487 abstractC13487) {
        return this.f34049.compareTo(((C10722) abstractC13487).f34049);
    }

    public String toString() {
        return this.f34049.m31594("array{");
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public String mo1843() {
        return this.f34049.m31595("{", l.d);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C21911 m27305() {
        return this.f34049;
    }
}
