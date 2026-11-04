package l;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: l.ۨۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes3.dex */
public final class C12341 implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Integer f39631;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public transient String f39632;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Comparator f39633;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Integer f39634;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient int f39635;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12341 m30766(Integer num, Integer num2) {
        return new C12341(num, num2);
    }

    public C12341(Integer num, Integer num2) {
        EnumC20546 enumC20546 = EnumC20546.INSTANCE;
        this.f39633 = enumC20546;
        if (enumC20546.compare(num, num2) < 1) {
            this.f39631 = num;
            this.f39634 = num2;
        } else {
            this.f39631 = num2;
            this.f39634 = num;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30767(Integer num) {
        Integer num2 = this.f39631;
        Comparator comparator = this.f39633;
        return comparator.compare(num, num2) > -1 && comparator.compare(num, this.f39634) < 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C12341.class) {
            return false;
        }
        C12341 c12341 = (C12341) obj;
        return this.f39631.equals(c12341.f39631) && this.f39634.equals(c12341.f39634);
    }

    public final int hashCode() {
        int i = this.f39635;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.f39634.hashCode() + ((this.f39631.hashCode() + ((C12341.class.hashCode() + 629) * 37)) * 37);
        this.f39635 = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        if (this.f39632 == null) {
            this.f39632 = "[" + this.f39631 + ".." + this.f39634 + "]";
        }
        return this.f39632;
    }
}
