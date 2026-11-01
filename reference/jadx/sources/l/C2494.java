package l;

/* JADX INFO: renamed from: l.ۖۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: F9FK */
/* JADX INFO: loaded from: classes2.dex */
public final class C2494 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC11668 f9898;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f9899;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f9900;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7627(C19240 c19240) {
        this.f9899 = c19240.m27378();
        this.f9898 = (EnumC11668) C20799.m46783(c19240.m27394(), EnumC11668.class, null);
        this.f9900 = c19240.m27379(((int) c19240.m27394()) / 2, C7393.f24570);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m7626() {
        return this.f9899;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileNotifyInformation{action=");
        sb.append(this.f9898);
        sb.append(", fileName='");
        return C22697.m50267(sb, this.f9900, "'}");
    }
}
