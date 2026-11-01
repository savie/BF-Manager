package l;

/* JADX INFO: renamed from: l.ۤ֫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9983 extends AbstractC8572 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f34113;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f34114;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C5486[] f34115;

    public AbstractC9983() {
        super(0);
        this.f34115 = null;
        this.f34113 = 0;
    }

    public AbstractC9983(AbstractC9983 abstractC9983) {
        super(0);
        this.f34115 = null;
        this.f34113 = 0;
        this.f34114 = abstractC9983.f34114;
        this.f34115 = C22420.m49742(abstractC9983.f34115);
    }

    public String getPathName() {
        return this.f34114;
    }

    public C5486[] getPathData() {
        return this.f34115;
    }

    public void setPathData(C5486[] c5486Arr) {
        if (!C22420.m49739(this.f34115, c5486Arr)) {
            this.f34115 = C22420.m49742(c5486Arr);
        } else {
            C22420.m49744(this.f34115, c5486Arr);
        }
    }
}
