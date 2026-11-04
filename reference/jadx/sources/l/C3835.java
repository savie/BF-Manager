package l;

/* JADX INFO: renamed from: l.ۘ֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: F9FK */
/* JADX INFO: loaded from: classes2.dex */
public final class C3835 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC23973 f13069;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f13070;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f13071;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12374(C7453 c7453) {
        this.f13070 = c7453.m56002();
        this.f13069 = (EnumC23973) C10961.m27793(c7453.m56012(), EnumC23973.class, null);
        this.f13071 = c7453.m56003(((int) c7453.m56012()) / 2, C22150.f71350);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12373() {
        return this.f13070;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileNotifyInformation{action=");
        sb.append(this.f13069);
        sb.append(", fileName='");
        return C8947.m23910(sb, this.f13071, "'}");
    }
}
