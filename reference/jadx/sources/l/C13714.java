package l;

/* JADX INFO: renamed from: l.ܰۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: U9Z2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13714 extends AbstractC2423 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f45223 = C13488.m32997(C13714.class);

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C8358 f45224;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18941 f45225;

    @Override // l.AbstractC2423
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC22180 mo7358() throws C12303 {
        C2464 c2464 = ((C17241) m7360()).f54929;
        String strM7557 = c2464.m7557();
        String path = c2464.m7563().getPath();
        if (path.lastIndexOf(47) != path.length() - 1) {
            throw new C12303(c2464.m7563() + " directory must end with '/'");
        }
        if (strM7557.lastIndexOf(92) != strM7557.length() - 1) {
            throw new C12303(strM7557.concat(" UNC must end with '\\'"));
        }
        C17987 c17987M7357 = m7357();
        this.f45225 = new C18941(c17987M7357.m41882());
        try {
            c17987M7357.m41868(new C18235(c17987M7357.m41882(), strM7557, "*", 22, ((C9895) c17987M7357.m41882()).m25082(), ((C9895) c17987M7357.m41882()).m25070() - 100), this.f45225, new EnumC19358[0]);
            this.f45224 = new C8358(this.f45225.m43622(), this.f45225.m43621(), ((C9895) c17987M7357.m41882()).m25082(), ((C9895) c17987M7357.m41882()).m25070() - 100, this.f45225.m43623(), c17987M7357.m41882());
            this.f45225.m15236((byte) 2);
            InterfaceC22180 interfaceC22180M7354 = m7354(false);
            if (interfaceC22180M7354 == null) {
                m7355();
            }
            return interfaceC22180M7354;
        } catch (C12303 e) {
            C18941 c18941 = this.f45225;
            if (c18941 != null && c18941.mo17295() && e.m30561() == -1073741809) {
                m7355();
                return null;
            }
            throw e;
        }
    }

    @Override // l.AbstractC2423
    /* JADX INFO: renamed from: ֨ */
    public final InterfaceC22180[] mo7352() {
        return this.f45225.m15240();
    }

    @Override // l.AbstractC2423
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo7353() throws C12303 {
        this.f45224.m21882(this.f45225.m43621(), this.f45225.m43623());
        this.f45225.reset();
        try {
            m7357().m41868(this.f45224, this.f45225, new EnumC19358[0]);
            return this.f45225.m15238() != -2147483642;
        } catch (C12303 e) {
            if (e.m30561() == -2147483642) {
                f45223.mo12120("No more entries", (Exception) e);
                return false;
            }
            throw e;
        }
    }

    @Override // l.AbstractC2423
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo7359() {
        return this.f45225.m43620();
    }

    @Override // l.AbstractC2423
    /* JADX INFO: renamed from: ۨ */
    public final void mo7356() {
        try {
            C17987 c17987M7357 = m7357();
            if (this.f45225 != null) {
                c17987M7357.m41868(new C5514(c17987M7357.m41882(), this.f45225.m43622()), new C3501(c17987M7357.m41882()), new EnumC19358[0]);
            }
        } catch (C12303 e) {
            f45223.mo12120("SmbComFindClose2 failed", (Exception) e);
        }
    }
}
