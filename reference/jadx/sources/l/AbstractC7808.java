package l;

/* JADX INFO: renamed from: l.۟ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: CANR */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7808 extends AbstractC6317 implements InterfaceC22703 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f26015;

    public AbstractC7808(InterfaceC4825 interfaceC4825) {
        super(interfaceC4825);
        this.f26015 = 2;
    }

    @Override // l.InterfaceC22703
    /* JADX INFO: renamed from: ۤ */
    public final int mo2104() {
        return this.f26015;
    }

    @Override // l.AbstractC20487
    public final String toString() {
        if (m46989() == null) {
            String strM39513 = C16735.m39513(this);
            C15243.m36591(strM39513, "renderLambdaToString(...)");
            return strM39513;
        }
        return super.toString();
    }
}
