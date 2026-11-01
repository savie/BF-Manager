package l;

/* JADX INFO: renamed from: l.۠ۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: S9I7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8099 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f28361;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC17976 f28362;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EnumC21504 f28363;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC18682 f28364;

    public C8099(EnumC17976 enumC17976, EnumC18682 enumC18682, EnumC21504 enumC21504) {
        this.f28362 = enumC17976;
        this.f28364 = enumC18682;
        this.f28361 = 7600;
        this.f28363 = enumC21504;
    }

    public C8099() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21312(C5982 c5982) throws C17271 {
        this.f28362 = (EnumC17976) C20799.m46783(c5982.m27388(), EnumC17976.class, null);
        this.f28364 = (EnumC18682) C20799.m46783(c5982.m27388(), EnumC18682.class, null);
        this.f28361 = c5982.m27375();
        c5982.m27389(3);
        this.f28363 = (EnumC21504) C20799.m46783(c5982.m27388(), EnumC21504.class, null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21313(C5982 c5982) {
        c5982.m27381((byte) this.f28362.f57492);
        c5982.m27381((byte) this.f28364.f60635);
        c5982.m27396(this.f28361);
        c5982.m27383(3, new byte[]{0, 0, 0});
        c5982.m27381((byte) this.f28363.getValue());
    }

    public final String toString() {
        return String.format("WindowsVersion[%s, %s, %d, %s]", this.f28362, this.f28364, Integer.valueOf(this.f28361), this.f28363);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8099.class == obj.getClass()) {
            C8099 c8099 = (C8099) obj;
            if (this.f28361 == c8099.f28361 && this.f28362 == c8099.f28362 && this.f28364 == c8099.f28364 && this.f28363 == c8099.f28363) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13638.hash(this.f28362, this.f28364, Integer.valueOf(this.f28361), this.f28363);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC21504 m21311() {
        return this.f28363;
    }
}
