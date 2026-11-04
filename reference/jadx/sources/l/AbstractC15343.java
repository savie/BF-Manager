package l;

/* JADX INFO: renamed from: l.ܳ۫ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: O62Y */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15343 extends AbstractC4450 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C8565 f50098;

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo2989(C8565 c8565);

    public AbstractC15343(C24975 c24975, int i) {
        this.f50098 = c24975.m55818().m8724(i);
    }

    @Override // l.AbstractC4450
    /* JADX INFO: renamed from: ۙ */
    public final Object mo14147() {
        C8565 c8565 = this.f50098;
        Object objMo2989 = mo2989(c8565);
        if (objMo2989 == null) {
            c8565.getClass();
            c8565.m22995();
        }
        return objMo2989;
    }
}
