package l;

/* JADX INFO: renamed from: l.֨ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0916 extends AbstractC2327 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f3668;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f3669;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract int mo3638();

    @Override // l.AbstractC20154, l.InterfaceC10110, l.InterfaceC20693
    public final InterfaceC11501 trySplit() {
        InterfaceC11501 interfaceC11501Mo7064;
        int iMo3637 = mo3637();
        int i = this.f8255;
        int iMo3638 = mo3637();
        int i2 = this.f8255;
        int iM9602 = C3184.m9602(iMo3638, i2, 2, i);
        if (iM9602 == i2 || iM9602 == iMo3637) {
            interfaceC11501Mo7064 = null;
        } else {
            if (iM9602 < i2 || iM9602 > iMo3637) {
                StringBuilder sbM40153 = C17214.m40153(iM9602, "splitPoint ", " outside of range of current position ");
                sbM40153.append(this.f8255);
                sbM40153.append(" and range end ");
                sbM40153.append(iMo3637);
                throw new IndexOutOfBoundsException(sbM40153.toString());
            }
            interfaceC11501Mo7064 = mo7064(i2, iM9602);
            this.f8255 = iM9602;
        }
        if (!this.f3668 && interfaceC11501Mo7064 != null) {
            this.f3669 = mo3638();
            this.f3668 = true;
        }
        return interfaceC11501Mo7064;
    }

    public AbstractC0916(int i) {
        super(i);
        this.f3669 = -1;
        this.f3668 = false;
    }

    public AbstractC0916(int i, int i2) {
        super(i);
        this.f3669 = i2;
        this.f3668 = true;
    }

    @Override // l.AbstractC2327
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo3637() {
        return this.f3668 ? this.f3669 : mo3638();
    }
}
