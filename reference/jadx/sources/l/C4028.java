package l;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ۘܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes2.dex */
public final class C4028 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Integer f14892;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient String f14893;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Comparator f14894;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Integer f14895;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient int f14896;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4028 m11531(Integer num, Integer num2) {
        return new C4028(num, num2);
    }

    public C4028(Integer num, Integer num2) {
        EnumC13202 enumC13202 = EnumC13202.INSTANCE;
        this.f14894 = enumC13202;
        if (enumC13202.compare(num, num2) < 1) {
            this.f14895 = num;
            this.f14892 = num2;
        } else {
            this.f14895 = num2;
            this.f14892 = num;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11532(Integer num) {
        Integer num2 = this.f14895;
        Comparator comparator = this.f14894;
        return comparator.compare(num, num2) > -1 && comparator.compare(num, this.f14892) < 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C4028.class) {
            return false;
        }
        C4028 c4028 = (C4028) obj;
        return this.f14895.equals(c4028.f14895) && this.f14892.equals(c4028.f14892);
    }

    public final int hashCode() {
        int i = this.f14896;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f14892.hashCode() + ((this.f14895.hashCode() + ((C4028.class.hashCode() + 629) * 37)) * 37);
        this.f14896 = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        if (this.f14893 == null) {
            this.f14893 = "[" + this.f14895 + ".." + this.f14892 + "]";
        }
        return this.f14893;
    }
}
