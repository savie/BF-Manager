package l;

/* JADX INFO: renamed from: l.۬ۢۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13763 extends AbstractC0078 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f43686;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f43687;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract int mo33652(C15496 c15496);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract String mo33653();

    public AbstractC13763(int i, int i2) {
        this.f43686 = i;
        this.f43687 = i2;
    }

    @Override // l.AbstractC0078
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1133(C15496 c15496, C15496 c15497) {
        C15496 c15496Mo37068 = c15497.mo37068();
        if (c15496Mo37068 == null || (c15496Mo37068 instanceof C5056)) {
            return false;
        }
        int iMo33652 = mo33652(c15497);
        int i = this.f43687;
        int i2 = this.f43686;
        if (i2 == 0) {
            return iMo33652 == i;
        }
        int i3 = iMo33652 - i;
        return i3 * i2 >= 0 && i3 % i2 == 0;
    }

    public String toString() {
        int i = this.f43687;
        int i2 = this.f43686;
        if (i2 == 0) {
            return String.format(":%s(%d)", mo33653(), Integer.valueOf(i));
        }
        return i == 0 ? String.format(":%s(%dn)", mo33653(), Integer.valueOf(i2)) : String.format(":%s(%dn%+d)", mo33653(), Integer.valueOf(i2), Integer.valueOf(i));
    }
}
