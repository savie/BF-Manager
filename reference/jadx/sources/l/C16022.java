package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܺܶܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: YBD4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16022 extends AbstractC23783 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final String[] f51848 = {"static-put", "static-get", "instance-put", "instance-get", "invoke-static", "invoke-instance", "invoke-constructor", "invoke-direct", "invoke-interface"};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC9901 f51849;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f51850;

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ֨ */
    public final String mo2375() {
        return "method handle";
    }

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo2379() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16022 m37998(int i, AbstractC9901 abstractC9901) {
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    if (!(abstractC9901 instanceof AbstractC11788)) {
                        throw new IllegalArgumentException("ref has wrong type: " + abstractC9901.getClass());
                    }
                    break;
                default:
                    throw new IllegalArgumentException(C8479.m22141(i, "type is out of range: "));
            }
        } else if (!(abstractC9901 instanceof C23077)) {
            throw new IllegalArgumentException("ref has wrong type: " + abstractC9901.getClass());
        }
        return new C16022(i, abstractC9901);
    }

    public C16022(int i, AbstractC9901 abstractC9901) {
        this.f51850 = i;
        this.f51849 = abstractC9901;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AbstractC9901 m38000() {
        return this.f51849;
    }

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public final int m37999() {
        return this.f51850;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m38001() {
        int i = this.f51850;
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m38002() {
        switch (this.f51850) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m37997(int i) {
        return f51848[i];
    }

    @Override // l.AbstractC9901
    /* JADX INFO: renamed from: ܰ */
    public final int mo2378(AbstractC9901 abstractC9901) {
        C16022 c16022 = (C16022) abstractC9901;
        int i = c16022.f51850;
        int i2 = this.f51850;
        if (i2 == i) {
            return this.f51849.compareTo(c16022.f51849);
        }
        return Integer.compare(i2, i);
    }

    public final String toString() {
        return "method-handle{" + mo2376() + l.d;
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return f51848[this.f51850] + "," + this.f51849.toString();
    }

    @Override // l.InterfaceC4919
    public final C3320 getType() {
        return C3320.f12272;
    }
}
