package l;

/* JADX INFO: renamed from: l.ۧۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBJ0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10794 extends AbstractC16438 {
    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ܰ */
    public final int mo15536() {
        return m38693().m40073().mo3096();
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ۙ */
    public final void mo15535(C2718 c2718) {
        m38693().m40073().mo3099(c2718, this);
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC16438 mo20431(int i) {
        return mo8569(m38695().m3157(i));
    }

    @Override // l.AbstractC16438
    /* JADX INFO: renamed from: ܶ */
    public final String mo15537() {
        AbstractC14322 abstractC14322M40073 = m38693().m40073();
        abstractC14322M40073.getClass();
        String strM40072 = m38693().m40072();
        String strMo3097 = abstractC14322M40073.mo3097(this);
        String strMo3100 = abstractC14322M40073.mo3100(this);
        StringBuilder sbM40152 = C17214.m40152(100, strM40072);
        if (strMo3097.length() != 0) {
            sbM40152.append(' ');
            sbM40152.append(strMo3097);
        }
        if (strMo3100.length() != 0) {
            sbM40152.append(" // ");
            sbM40152.append(strMo3100);
        }
        return sbM40152.toString();
    }
}
