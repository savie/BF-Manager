package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ᩴۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A22 */
/* JADX INFO: loaded from: classes5.dex */
public class C18506 extends AbstractC9604 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f58946 = C13488.m32998(C18506.class.getName());

    @Override // l.AbstractC9604
    /* JADX INFO: renamed from: ۙ */
    public final void mo19178(StringBuilder sb) {
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10854(C22823 c22823, HashSet hashSet) {
    }

    @Override // l.AbstractC9604
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo24471(long j) {
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo10855(C22823 c22823) {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18506 m42898(String str, EnumC14357 enumC14357, EnumC23529 enumC23529, boolean z) {
        switch (C0866.f3523[enumC14357.ordinal()]) {
            case 1:
                return new C3688(str, enumC14357, enumC23529, z);
            case 2:
                return new C6511(str, enumC14357, enumC23529, z);
            case 3:
                return new C6511(str, enumC14357, enumC23529, z);
            case 4:
                return new C12862(str, enumC14357, enumC23529, z);
            case 5:
                return new C22740(str, enumC14357, enumC23529, z);
            case 6:
                return new C14979(str, enumC14357, enumC23529, z);
            case 7:
                return new C21328(str, enumC14357, enumC23529, z);
            case 8:
                return new C17800(str, enumC14357, enumC23529, z);
            default:
                return new C18506(str, enumC14357, enumC23529, z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42899(C22823 c22823, HashSet hashSet, C0244 c0244) {
        if (c0244 == null || !c0244.m1677()) {
            return;
        }
        if (m24477().equalsIgnoreCase(c0244.mo1670()) || m24477().equalsIgnoreCase(c0244.mo1660()) || m24477().equalsIgnoreCase(c0244.m1661())) {
            C2983 c2983M50562 = c22823.m50562();
            EnumC23529 enumC23529M24475 = m24475();
            int i = C17178.f54761;
            hashSet.addAll(c2983M50562.m8884(enumC23529M24475, true, i));
            hashSet.addAll(c0244.m1641(m24475(), i, c22823.m50562()));
        }
        f58946.mo12139("{} DNSQuestion({}).addAnswersForServiceInfo(): info: {}\n{}", c22823.getName(), m24477(), c0244, hashSet);
    }
}
