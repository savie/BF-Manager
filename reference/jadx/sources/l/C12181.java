package l;

import java.math.BigInteger;

/* JADX INFO: renamed from: l.۫ۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M45G */
/* JADX INFO: loaded from: classes4.dex */
public final class C12181 extends AbstractC11348 implements InterfaceC4871 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17119 f40766;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12181(C17119 c17119) {
        super(0);
        this.f40766 = c17119;
    }

    @Override // l.InterfaceC4871
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3788() {
        C17119 c17119 = this.f40766;
        return BigInteger.valueOf(c17119.m39972()).shiftLeft(32).or(BigInteger.valueOf(c17119.m39975())).shiftLeft(32).or(BigInteger.valueOf(c17119.m39974()));
    }
}
