package l;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: l.ۧ۠۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes4.dex */
public final class C10870 extends AbstractC14728 implements InterfaceC20480 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC5930 f36960;

    @Override // l.AbstractC8774
    /* JADX INFO: renamed from: ۙ */
    public final void mo1802(AbstractC19357 abstractC19357) {
        abstractC19357.mo3936(this);
    }

    @Override // l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public final EnumC12490 mo1801() {
        return EnumC12490.EXPRESSION_STATEMENT;
    }

    @Override // l.InterfaceC20480
    public final AbstractC5930 getExpression() {
        return this.f36960;
    }

    @Override // l.AbstractC8774, l.InterfaceC17428
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1800(InterfaceC6139 interfaceC6139, Object obj) {
        return interfaceC6139.mo1883(this, obj);
    }

    @Override // l.AbstractC8774
    /* JADX INFO: renamed from: ۨۙ */
    public final EnumC18651 mo1803() {
        return EnumC18651.f60549;
    }

    @Override // l.AbstractC8774
    public final String toString() {
        StringWriter stringWriter = new StringWriter();
        try {
            new C15830(stringWriter, false).m37631(this, -1);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
