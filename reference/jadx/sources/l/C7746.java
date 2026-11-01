package l;

/* JADX INFO: renamed from: l.۟᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes3.dex */
public final class C7746 extends AbstractC10569 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C9158 f25592;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C22375 f25593;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f25594;

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC1332 mo8524() {
        return this.f25593;
    }

    @Override // l.AbstractC10569
    public final String getName() {
        return this.f25593.getName();
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ۚ */
    public final String mo8523() {
        return this.f25594;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m20396(C7746 c7746) throws C13391 {
        C9158 c9158 = c7746.f25592;
        C1395 c1395 = c9158.f31130;
        C22375 c22375 = c7746.f25593;
        String strM49618 = c22375.m49618();
        EnumC22563 enumC22563 = EnumC22563.TYPES_ONLY;
        if (!(c1395.m4884(strM49618, c7746, enumC22563) instanceof C2806)) {
            throw new C13391(c7746, "\"" + c22375.m49618() + "\" is not a message type.", 0);
        }
        if (c9158.f31130.m4884(c22375.m49627(), c7746, enumC22563) instanceof C2806) {
            return;
        }
        throw new C13391(c7746, "\"" + c22375.m49627() + "\" is not a message type.", 0);
    }

    @Override // l.AbstractC10569
    /* JADX INFO: renamed from: ܰ */
    public final C9158 mo8528() {
        return this.f25592;
    }

    public C7746(C22375 c22375, C9158 c9158, C16213 c16213) {
        super(0);
        this.f36173 = c16213;
        this.f25593 = c22375;
        this.f25592 = c9158;
        this.f25594 = c16213.mo8523() + '.' + c22375.getName();
        c9158.f31130.m4887(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20395(C7746 c7746) {
        c7746.m26727(c7746.f25593.m49619().m51072());
    }
}
