package l;

/* JADX INFO: renamed from: l.ۖۨᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AQC */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2513 extends AbstractC10213 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f9970;

    @Override // l.InterfaceC20693
    public int characteristics() {
        return 16720;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract char mo7699(int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo4112();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC11687 mo7700(int i, int i2);

    public AbstractC2513(int i) {
        this.f9970 = i;
    }

    @Override // l.InterfaceC20693
    public final long estimateSize() {
        return ((long) mo4112()) - ((long) this.f9970);
    }

    @Override // l.InterfaceC10110
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public boolean tryAdvance(InterfaceC1164 interfaceC1164) {
        if (this.f9970 >= mo4112()) {
            return false;
        }
        int i = this.f9970;
        this.f9970 = i + 1;
        interfaceC1164.mo4297(mo7699(i));
        return true;
    }

    @Override // l.AbstractC10213, l.InterfaceC10110
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public void forEachRemaining(InterfaceC1164 interfaceC1164) {
        int iMo4112 = mo4112();
        while (true) {
            int i = this.f9970;
            if (i >= iMo4112) {
                return;
            }
            interfaceC1164.mo4297(mo7699(i));
            this.f9970++;
        }
    }

    @Override // l.AbstractC10213, l.InterfaceC10110, l.InterfaceC20693
    public InterfaceC11687 trySplit() {
        int iMo4112 = mo4112();
        int i = this.f9970;
        int iMo4113 = mo4112();
        int i2 = this.f9970;
        int iM9602 = C3184.m9602(iMo4113, i2, 2, i);
        if (iM9602 == i2 || iM9602 == iMo4112) {
            return null;
        }
        if (iM9602 >= i2 && iM9602 <= iMo4112) {
            InterfaceC11687 interfaceC11687Mo7700 = mo7700(i2, iM9602);
            this.f9970 = iM9602;
            return interfaceC11687Mo7700;
        }
        StringBuilder sbM40153 = C17214.m40153(iM9602, "splitPoint ", " outside of range of current position ");
        sbM40153.append(this.f9970);
        sbM40153.append(" and range end ");
        sbM40153.append(iMo4112);
        throw new IndexOutOfBoundsException(sbM40153.toString());
    }
}
