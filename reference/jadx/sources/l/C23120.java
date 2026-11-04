package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.᩸᩹᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A22 */
/* JADX INFO: loaded from: classes.dex */
public class C23120 extends AbstractC14694 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f74977 = C16980.m40038(C23120.class.getName());

    @Override // l.AbstractC14694
    /* JADX INFO: renamed from: ۙ */
    public final void mo7634(StringBuilder sb) {
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo9133(C14168 c14168, HashSet hashSet) {
    }

    @Override // l.AbstractC14694
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo35351(long j) {
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo9134(C14168 c14168) {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23120 m52051(String str, EnumC24021 enumC24021, EnumC6121 enumC6121, boolean z) {
        switch (C9473.f30696[enumC24021.ordinal()]) {
            case 1:
                return new C8728(str, enumC24021, enumC6121, z);
            case 2:
                return new C7237(str, enumC24021, enumC6121, z);
            case 3:
                return new C7237(str, enumC24021, enumC6121, z);
            case 4:
                return new C2762(str, enumC24021, enumC6121, z);
            case 5:
                return new C13948(str, enumC24021, enumC6121, z);
            case 6:
                return new C5220(str, enumC24021, enumC6121, z);
            case 7:
                return new C22374(str, enumC24021, enumC6121, z);
            case 8:
                return new C11185(str, enumC24021, enumC6121, z);
            default:
                return new C23120(str, enumC24021, enumC6121, z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52052(C14168 c14168, HashSet hashSet, C17307 c17307) {
        if (c17307 == null || !c17307.m40647()) {
            return;
        }
        if (m35359().equalsIgnoreCase(c17307.mo30944()) || m35359().equalsIgnoreCase(c17307.mo30939()) || m35359().equalsIgnoreCase(c17307.m40634())) {
            C21628 c21628M34408 = c14168.m34408();
            EnumC6121 enumC6121M35354 = m35354();
            int i = C3137.f10167;
            hashSet.addAll(c21628M34408.m49145(enumC6121M35354, true, i));
            hashSet.addAll(c17307.m40636(m35354(), i, c14168.m34408()));
        }
        f74977.mo13725("{} DNSQuestion({}).addAnswersForServiceInfo(): info: {}\n{}", c14168.getName(), m35359(), c17307, hashSet);
    }
}
