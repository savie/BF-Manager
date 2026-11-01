package l;

/* JADX INFO: renamed from: l.ۘ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: E1CE */
/* JADX INFO: loaded from: classes2.dex */
public final class C3784 implements Comparable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6607 f13660;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15075 f13661;

    public C3784(C6607 c6607) {
        this.f13660 = c6607;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f13661.f49146 - ((C15075) obj).f49146;
    }

    public final String toString() {
        String string = "[ ";
        if (this.f13661 != null) {
            for (int i = 0; i < 9; i++) {
                StringBuilder sbM23356 = C9023.m23356(string);
                sbM23356.append(this.f13661.f49151[i]);
                sbM23356.append(" ");
                string = sbM23356.toString();
            }
        }
        StringBuilder sbM8976 = C3012.m8976(string, "] ");
        sbM8976.append(this.f13661);
        return sbM8976.toString();
    }
}
