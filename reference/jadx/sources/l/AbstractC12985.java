package l;

/* JADX INFO: renamed from: l.۫۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12985 extends AbstractC15222 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f41617;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f41618;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C11783[] f41619;

    public AbstractC12985() {
        super(0);
        this.f41619 = null;
        this.f41617 = 0;
    }

    public AbstractC12985(AbstractC12985 abstractC12985) {
        super(0);
        this.f41619 = null;
        this.f41617 = 0;
        this.f41618 = abstractC12985.f41618;
        this.f41619 = C25210.m56211(abstractC12985.f41619);
    }

    public String getPathName() {
        return this.f41618;
    }

    public C11783[] getPathData() {
        return this.f41619;
    }

    public void setPathData(C11783[] c11783Arr) {
        if (!C25210.m56208(this.f41619, c11783Arr)) {
            this.f41619 = C25210.m56211(c11783Arr);
        } else {
            C25210.m56213(this.f41619, c11783Arr);
        }
    }
}
