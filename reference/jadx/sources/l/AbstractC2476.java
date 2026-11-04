package l;

/* JADX INFO: renamed from: l.ۖۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBJ0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2476 extends AbstractC18884 {
    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo8331() {
        return m43802().m3868().mo3133();
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8329(C15000 c15000) {
        m43802().m3868().mo3136(c15000, this);
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC18884 mo8332(int i) {
        return mo18813(m43795().m1040(i));
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String mo8330() {
        AbstractC6951 abstractC6951M3868 = m43802().m3868();
        abstractC6951M3868.getClass();
        String strM3864 = m43802().m3864();
        String strMo3134 = abstractC6951M3868.mo3134(this);
        String strMo3137 = abstractC6951M3868.mo3137(this);
        StringBuilder sbM3018 = C0703.m3018(100, strM3864);
        if (strMo3134.length() != 0) {
            sbM3018.append(' ');
            sbM3018.append(strMo3134);
        }
        if (strMo3137.length() != 0) {
            sbM3018.append(" // ");
            sbM3018.append(strMo3137);
        }
        return sbM3018.toString();
    }
}
