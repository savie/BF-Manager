package l;

/* JADX INFO: renamed from: l.᩶ۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: O62Y */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19906 extends AbstractC9943 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C18825 f63808;

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo5043(C18825 c18825);

    public AbstractC19906(C17684 c17684, int i) {
        this.f63808 = c17684.m41166().m42184(i);
    }

    @Override // l.AbstractC9943
    /* JADX INFO: renamed from: ۙ */
    public final Object mo20056() {
        C18825 c18825 = this.f63808;
        Object objMo5043 = mo5043(c18825);
        if (objMo5043 == null) {
            c18825.getClass();
            c18825.m43450();
        }
        return objMo5043;
    }
}
