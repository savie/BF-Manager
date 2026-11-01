package l;

/* JADX INFO: renamed from: l.ۤ֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 89EN */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9988 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC7165 f34118;

    public AbstractC9988(EnumC7165 enumC7165) {
        this.f34118 = enumC7165;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m25247(C19240 c19240) {
        C19240 c19241 = new C19240();
        int iMo20768 = mo20768(c19241);
        c19240.m27396((int) this.f34118.getValue());
        c19240.m27396(iMo20768);
        c19240.m44195();
        c19240.m27386(c19241);
        return iMo20768 + 8;
    }

    /* JADX INFO: renamed from: ۖ */
    public int mo20768(C19240 c19240) {
        throw new UnsupportedOperationException("Should be implemented by specific SMB2NegotiateContext");
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static AbstractC9988 m25244(C19240 c19240) throws C17271 {
        int iM27375 = c19240.m27375();
        EnumC7165 enumC7165 = (EnumC7165) C20799.m46783(iM27375, EnumC7165.class, null);
        int i = C8577.f29653[enumC7165.ordinal()];
        if (i == 1) {
            C15633 c15633 = new C15633();
            c15633.m25246(c19240);
            return c15633;
        }
        if (i == 2) {
            C19160 c19160 = new C19160();
            c19160.m25246(c19240);
            return c19160;
        }
        if (i == 3) {
            C7871 c7871 = new C7871();
            c7871.m25246(c19240);
            return c7871;
        }
        if (i == 4) {
            C20571 c20571 = new C20571(EnumC7165.SMB2_NETNAME_NEGOTIATE_CONTEXT_ID);
            c20571.m25246(c19240);
            return c20571;
        }
        throw new C13865("Unknown SMB2NegotiateContextType encountered: " + iM27375 + " / " + enumC7165);
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo20770(C19240 c19240) {
        throw new UnsupportedOperationException("Should be implemented by specific message type");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25246(C19240 c19240) throws C17271 {
        int iM27375 = c19240.m27375();
        c19240.m27389(4);
        mo20770(c19240);
        int i = iM27375 % 8;
        int i2 = i == 0 ? 0 : 8 - i;
        if (i2 <= 0 || c19240.m27391() < i2) {
            return;
        }
        c19240.m27389(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC7165 m25245() {
        return this.f34118;
    }
}
