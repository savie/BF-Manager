package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩹ܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBBY */
/* JADX INFO: loaded from: classes2.dex */
public final class C22371 extends C13905 {
    @Override // l.C13905, l.AbstractC9901
    /* JADX INFO: renamed from: ֨ */
    public final String mo2375() {
        return "call site";
    }

    @Override // l.C13905
    public final boolean equals(Object obj) {
        if (obj instanceof C22371) {
            return m33738().equals(((C22371) obj).m33738());
        }
        return false;
    }

    @Override // l.C13905
    public final int hashCode() {
        return m33738().hashCode();
    }

    @Override // l.C13905, l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public final int mo2378(AbstractC9901 abstractC9901) {
        return m33738().compareTo(((C22371) abstractC9901).m33738());
    }

    @Override // l.C13905
    public final String toString() {
        return m33738().m15250("call site{");
    }

    @Override // l.C13905, l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return m33738().m15251("{", l.d);
    }
}
