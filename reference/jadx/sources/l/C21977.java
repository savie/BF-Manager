package l;

/* JADX INFO: renamed from: l.᩷ۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes.dex */
public final class C21977 extends AbstractC4823 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f70917;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C14452 f70918;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C14034 f70919;

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC21013 mo5000() {
        return this.f70918;
    }

    @Override // l.AbstractC4823
    public final String getName() {
        return this.f70918.getName();
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ᩴ */
    public final String mo5002() {
        return this.f70917;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m49714(C21977 c21977) throws C18510 {
        C14034 c14034 = c21977.f70919;
        C21494 c21494 = c14034.f44472;
        C14452 c14452 = c21977.f70918;
        String strM34896 = c14452.m34896();
        EnumC14780 enumC14780 = EnumC14780.TYPES_ONLY;
        if (!(c21494.m48901(strM34896, c21977, enumC14780) instanceof C24478)) {
            throw new C18510(c21977, "\"" + c14452.m34896() + "\" is not a message type.", 0);
        }
        if (c14034.f44472.m48901(c14452.m34905(), c21977, enumC14780) instanceof C24478) {
            return;
        }
        throw new C18510(c21977, "\"" + c14452.m34905() + "\" is not a message type.", 0);
    }

    @Override // l.AbstractC4823
    /* JADX INFO: renamed from: ᩸ */
    public final C14034 mo5003() {
        return this.f70919;
    }

    public C21977(C14452 c14452, C14034 c14034, C22723 c22723) {
        super(0);
        this.f16869 = c22723;
        this.f70918 = c14452;
        this.f70919 = c14034;
        this.f70917 = c22723.mo5002() + '.' + c14452.getName();
        c14034.f44472.m48903(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49713(C21977 c21977) {
        c21977.m14855(c21977.f70918.m34899().m43953());
    }
}
