package l;

/* JADX INFO: renamed from: l.᩹᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23781 extends AbstractC2809 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f77037;

    @Override // l.InterfaceC8409
    public int characteristics() {
        return 16720;
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract char mo23935(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo31302();

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC16321 mo23936(int i, int i2);

    public AbstractC23781(int i) {
        this.f77037 = i;
    }

    @Override // l.InterfaceC8409
    public final long estimateSize() {
        return ((long) mo31302()) - ((long) this.f77037);
    }

    @Override // l.InterfaceC9154
    /* JADX INFO: renamed from: ᩷, reason: merged with bridge method [inline-methods] */
    public boolean tryAdvance(InterfaceC12089 interfaceC12089) {
        if (this.f77037 >= mo31302()) {
            return false;
        }
        int i = this.f77037;
        this.f77037 = i + 1;
        interfaceC12089.mo10258(mo23935(i));
        return true;
    }

    @Override // l.AbstractC2809, l.InterfaceC9154
    /* JADX INFO: renamed from: ۙ, reason: merged with bridge method [inline-methods] */
    public void forEachRemaining(InterfaceC12089 interfaceC12089) {
        int iMo31302 = mo31302();
        while (true) {
            int i = this.f77037;
            if (i >= iMo31302) {
                return;
            }
            interfaceC12089.mo10258(mo23935(i));
            this.f77037++;
        }
    }

    @Override // l.AbstractC2809, l.InterfaceC8409
    public InterfaceC16321 trySplit() {
        int iMo31302 = mo31302();
        int i = this.f77037;
        int iMo31303 = mo31302();
        int i2 = this.f77037;
        int iM18182 = C6421.m18182(iMo31303, i2, 2, i);
        if (iM18182 == i2 || iM18182 == iMo31302) {
            return null;
        }
        if (iM18182 >= i2 && iM18182 <= iMo31302) {
            InterfaceC16321 interfaceC16321Mo23936 = mo23936(i2, iM18182);
            this.f77037 = iM18182;
            return interfaceC16321Mo23936;
        }
        StringBuilder sbM12235 = C3769.m12235(iM18182, "splitPoint ", " outside of range of current position ");
        sbM12235.append(this.f77037);
        sbM12235.append(" and range end ");
        sbM12235.append(iMo31302);
        throw new IndexOutOfBoundsException(sbM12235.toString());
    }
}
