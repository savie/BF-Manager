package l;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.ۤ᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes4.dex */
public final class C11106 extends AbstractC19969 implements InterfaceC4895 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC22295 f35018;

    @Override // l.AbstractC8036
    /* JADX INFO: renamed from: ۙ */
    public final void mo2284(AbstractC0578 abstractC0578) {
        abstractC0578.mo1952(this);
    }

    @Override // l.InterfaceC19637
    /* JADX INFO: renamed from: ۙ */
    public final EnumC22621 mo2283() {
        return EnumC22621.EXPRESSION_STATEMENT;
    }

    @Override // l.InterfaceC4895
    public final AbstractC22295 getExpression() {
        return this.f35018;
    }

    @Override // l.AbstractC8036, l.InterfaceC19637
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2282(InterfaceC15161 interfaceC15161, Object obj) {
        return interfaceC15161.mo5862(this, obj);
    }

    @Override // l.AbstractC8036
    /* JADX INFO: renamed from: ۤۙ */
    public final EnumC21461 mo2285() {
        return EnumC21461.f68533;
    }

    @Override // l.AbstractC8036
    public final String toString() {
        StringWriter stringWriter = new StringWriter();
        try {
            new C9526(stringWriter, false).m24928(this, -1);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
