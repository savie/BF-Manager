package l;

import java.math.BigInteger;

/* JADX INFO: renamed from: l.ۘۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M45G */
/* JADX INFO: loaded from: classes3.dex */
public final class C3918 extends AbstractC13006 implements InterfaceC19479 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14358 f13381;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3918(C14358 c14358) {
        super(0);
        this.f13381 = c14358;
    }

    @Override // l.InterfaceC19479
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4064() {
        C14358 c14358 = this.f13381;
        return BigInteger.valueOf(c14358.m34785()).shiftLeft(32).or(BigInteger.valueOf(c14358.m34788())).shiftLeft(32).or(BigInteger.valueOf(c14358.m34787()));
    }
}
