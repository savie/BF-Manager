package l;

/* JADX INFO: renamed from: l.ۨۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 59UK */
/* JADX INFO: loaded from: classes4.dex */
public final class C11597 extends AbstractC2423 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f38964 = C13488.m32997(C11597.class);

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public byte[] f38965;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2402 f38966;

    @Override // l.AbstractC2423
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo7359() {
        return false;
    }

    @Override // l.AbstractC2423
    /* JADX INFO: renamed from: ֨ */
    public final InterfaceC22180[] mo7352() {
        InterfaceC22180[] interfaceC22180ArrM7328 = this.f38966.m7328();
        return interfaceC22180ArrM7328 == null ? new InterfaceC22180[0] : interfaceC22180ArrM7328;
    }

    @Override // l.AbstractC2423
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC22180 mo7358() throws C12303 {
        C17987 c17987M7357 = m7357();
        C4519 c4519 = new C4519(((C17241) m7360()).f54929.m7557(), c17987M7357.m41882());
        c4519.m12631(1);
        c4519.m12629(129);
        C11576 c11576 = new C11576(c17987M7357.m41882(), C11180.f37872);
        c11576.m28876("*");
        c4519.mo27236(c11576);
        try {
            this.f38965 = ((C13693) c17987M7357.m41868(c4519, null, new EnumC19358[0])).m33399();
            this.f38966 = (C2402) c11576.mo9821();
            InterfaceC22180 interfaceC22180M7354 = m7354(false);
            if (interfaceC22180M7354 == null) {
                m7355();
            }
            return interfaceC22180M7354;
        } catch (C12303 e) {
            C13693 c13693 = (C13693) c4519.mo9821();
            if (c13693 != null && c13693.mo17295() && c13693.m31351() == 0) {
                try {
                    c17987M7357.m41868(new C9769(c17987M7357.m41882(), c13693.m33399()), null, new EnumC19358[0]);
                } catch (C12303 e2) {
                    e.addSuppressed(e2);
                }
            }
            C2402 c2402 = (C2402) c11576.mo9821();
            if (c2402 != null && c2402.mo17295() && c2402.m31351() == -1073741809) {
                m7355();
                return null;
            }
            throw e;
        }
    }

    @Override // l.AbstractC2423
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo7353() throws C12303 {
        InterfaceC22180[] interfaceC22180ArrM7328 = this.f38966.m7328();
        C17987 c17987M7357 = m7357();
        C11576 c11576 = new C11576(c17987M7357.m41882(), this.f38965);
        c11576.m28876("*");
        c11576.m28877(interfaceC22180ArrM7328[interfaceC22180ArrM7328.length - 1].mo24728());
        c11576.m28878();
        try {
            C2402 c2402 = (C2402) c17987M7357.m41868(c11576, null, new EnumC19358[0]);
            if (c2402.m31351() == -2147483642) {
                return false;
            }
            this.f38966 = c2402;
            return true;
        } catch (C12303 e) {
            if (e.m30561() == -2147483642) {
                f38964.mo12120("End of listing", (Exception) e);
                return false;
            }
            throw e;
        }
    }

    @Override // l.AbstractC2423
    /* JADX INFO: renamed from: ۨ */
    public final void mo7356() {
        try {
            C17987 c17987M7357 = m7357();
            if (this.f38965 != null && c17987M7357.m41880()) {
                c17987M7357.m41868(new C9769(c17987M7357.m41882(), this.f38965), null, new EnumC19358[0]);
            }
        } finally {
            this.f38965 = null;
        }
    }
}
