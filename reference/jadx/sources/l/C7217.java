package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۟ۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7217 extends AbstractC19918 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f24045;

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo19183(C22823 c22823) {
        return false;
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo19184(C22823 c22823) {
        return false;
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo19185() {
        return false;
    }

    public C7217(String str, EnumC23529 enumC23529, boolean z, int i, String str2) {
        super(str, EnumC14357.TYPE_PTR, enumC23529, z, i);
        this.f24045 = str2;
    }

    @Override // l.AbstractC9604
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo19180(AbstractC9604 abstractC9604) {
        return super.mo19180(abstractC9604) && (abstractC9604 instanceof C7217) && mo19182((C7217) abstractC9604);
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19179(C5100 c5100) {
        c5100.m14210(this.f24045);
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo19182(AbstractC19918 abstractC19918) {
        if (!(abstractC19918 instanceof C7217)) {
            return false;
        }
        String str = ((C7217) abstractC19918).f24045;
        String str2 = this.f24045;
        if (str2 != null || str == null) {
            return str2.equals(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m19181() {
        return this.f24045;
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0244 mo19176(boolean z) {
        boolean zM24476 = m24476();
        String str = this.f24045;
        if (!zM24476) {
            EnumC6075 enumC6075 = EnumC6075.Domain;
            HashMap map = this.f32353;
            if (((String) map.get(enumC6075)).endsWith("in-addr.arpa") || ((String) map.get(enumC6075)).endsWith("ip6.arpa")) {
                return new C0244(C0561.unmodifiableMap(map), 0, 0, 0, z, null);
            }
            if (m24466()) {
                return new C0244(C0561.unmodifiableMap(map), 0, 0, 0, z, null);
            }
            HashMap mapM38742 = C16473.m38742(str);
            EnumC6075 enumC6076 = EnumC6075.Subtype;
            mapM38742.put(enumC6076, (String) C0561.unmodifiableMap(map).get(enumC6076));
            return new C0244(str, mapM38742, z);
        }
        return new C0244(C16473.m38742(str), 0, 0, 0, z, null);
    }

    @Override // l.AbstractC19918
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20706 mo19177(C22823 c22823) {
        C0244 c0244Mo19176 = mo19176(false);
        c0244Mo19176.m1649(c22823);
        String strMo1660 = c0244Mo19176.mo1660();
        return new C20706(c22823, strMo1660, C22823.m50521(strMo1660, this.f24045), c0244Mo19176);
    }

    @Override // l.AbstractC19918, l.AbstractC9604
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19178(StringBuilder sb) {
        super.mo19178(sb);
        sb.append(" alias: '");
        String str = this.f24045;
        sb.append(str != null ? str.toString() : "null");
        sb.append('\'');
    }
}
