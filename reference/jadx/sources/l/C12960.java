package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۫۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBBY */
/* JADX INFO: loaded from: classes4.dex */
public final class C12960 extends C10722 {
    @Override // l.C10722, l.AbstractC13487
    /* JADX INFO: renamed from: ۫ */
    public final String mo1845() {
        return "call site";
    }

    @Override // l.C10722
    public final boolean equals(Object obj) {
        if (obj instanceof C12960) {
            return m27305().equals(((C12960) obj).m27305());
        }
        return false;
    }

    @Override // l.C10722
    public final int hashCode() {
        return m27305().hashCode();
    }

    @Override // l.C10722, l.AbstractC13487
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1848(AbstractC13487 abstractC13487) {
        return m27305().compareTo(((C12960) abstractC13487).m27305());
    }

    @Override // l.C10722
    public final String toString() {
        return m27305().m31594("call site{");
    }

    @Override // l.C10722, l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return m27305().m31595("{", l.d);
    }
}
