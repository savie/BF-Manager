package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩶۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: YBD4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21165 extends AbstractC2519 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final String[] f67571 = {"static-put", "static-get", "instance-put", "instance-get", "invoke-static", "invoke-instance", "invoke-constructor", "invoke-direct", "invoke-interface"};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC13487 f67572;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f67573;

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ۫ */
    public final String mo1845() {
        return "method handle";
    }

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo1849() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21165 m48269(int i, AbstractC13487 abstractC13487) {
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    if (!(abstractC13487 instanceof AbstractC22657)) {
                        throw new IllegalArgumentException("ref has wrong type: " + abstractC13487.getClass());
                    }
                    break;
                default:
                    throw new IllegalArgumentException(C13645.m33382(i, "type is out of range: "));
            }
        } else if (!(abstractC13487 instanceof C16689)) {
            throw new IllegalArgumentException("ref has wrong type: " + abstractC13487.getClass());
        }
        return new C21165(i, abstractC13487);
    }

    public C21165(int i, AbstractC13487 abstractC13487) {
        this.f67573 = i;
        this.f67572 = abstractC13487;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC13487 m48271() {
        return this.f67572;
    }

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public final int m48270() {
        return this.f67573;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m48273() {
        int i = this.f67573;
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m48272() {
        switch (this.f67573) {
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
    public static String m48268(int i) {
        return f67571[i];
    }

    @Override // l.AbstractC13487
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1848(AbstractC13487 abstractC13487) {
        C21165 c21165 = (C21165) abstractC13487;
        int i = c21165.f67573;
        int i2 = this.f67573;
        if (i2 == i) {
            return this.f67572.compareTo(c21165.f67572);
        }
        return Integer.compare(i2, i);
    }

    public final String toString() {
        return "method-handle{" + mo1843() + l.d;
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return f67571[this.f67573] + "," + this.f67572.toString();
    }

    @Override // l.InterfaceC22239
    public final C5085 getType() {
        return C5085.f17736;
    }
}
