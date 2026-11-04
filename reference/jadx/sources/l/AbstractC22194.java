package l;

/* JADX INFO: renamed from: l.᩷ܽܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89EN */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22194 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC11005 f71513;

    public AbstractC22194(EnumC11005 enumC11005) {
        this.f71513 = enumC11005;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m50204(C7453 c7453) {
        C7453 c7454 = new C7453();
        int iMo19897 = mo19897(c7454);
        c7453.m56023((int) this.f71513.getValue());
        c7453.m56023(iMo19897);
        c7453.m20460();
        c7453.m56010(c7454);
        return iMo19897 + 8;
    }

    /* JADX INFO: renamed from: ᩸ */
    public int mo19897(C7453 c7453) {
        throw new UnsupportedOperationException("Should be implemented by specific SMB2NegotiateContext");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static AbstractC22194 m50201(C7453 c7453) throws C2013 {
        int iM56017 = c7453.m56017();
        EnumC11005 enumC11005 = (EnumC11005) C10961.m27793(iM56017, EnumC11005.class, null);
        int i = C5040.f17457[enumC11005.ordinal()];
        if (i == 1) {
            C19956 c19956 = new C19956();
            c19956.m50203(c7453);
            return c19956;
        }
        if (i == 2) {
            C13966 c13966 = new C13966();
            c13966.m50203(c7453);
            return c13966;
        }
        if (i == 3) {
            C7255 c7255 = new C7255();
            c7255.m50203(c7453);
            return c7255;
        }
        if (i == 4) {
            C22940 c22940 = new C22940(EnumC11005.SMB2_NETNAME_NEGOTIATE_CONTEXT_ID);
            c22940.m50203(c7453);
            return c22940;
        }
        throw new C12082("Unknown SMB2NegotiateContextType encountered: " + iM56017 + " / " + enumC11005);
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo19896(C7453 c7453) {
        throw new UnsupportedOperationException("Should be implemented by specific message type");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50203(C7453 c7453) throws C2013 {
        int iM56017 = c7453.m56017();
        c7453.m56021(4);
        mo19896(c7453);
        int i = iM56017 % 8;
        int i2 = i == 0 ? 0 : 8 - i;
        if (i2 <= 0 || c7453.m56013() < i2) {
            return;
        }
        c7453.m56021(i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC11005 m50202() {
        return this.f71513;
    }
}
