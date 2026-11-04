package l;

/* JADX INFO: renamed from: l.᩹۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4UL */
/* JADX INFO: loaded from: classes.dex */
public final class C23420 extends AbstractC10739 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f75806;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f75807;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f75807.compareTo(((C23420) obj).f75807);
    }

    public C23420(C24738 c24738) {
        super(c24738);
        this.f75806 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23420 m52620(String str, C24738 c24738) {
        C23420 c23420 = new C23420(c24738);
        c23420.f75806 = 0;
        c23420.f75807 = str;
        return (C23420) c24738.f80116.m38079(c23420);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10825(C4028 c4028, C17452 c17452) {
        c4028.m12998();
        this.f75807 = c4028.m12994();
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final int mo10821(int i) {
        return C6929.m19213(this.f75807.length()) + i + C8398.m22565(this.f75807).length + 1;
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10826(C24166 c24166) {
        byte[] bArrM22565 = C8398.m22565(this.f75807);
        c24166.m54135(this.f75807.length());
        c24166.m54133(bArrM22565, 0, bArrM22565.length);
        c24166.m54138(0);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final String mo10823() {
        return "string_data_item: \"" + C8398.m22566(this.f75807) + "\"";
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m52622() {
        return this.f75807;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52621(String str) {
        this.f75807 = str;
    }

    public final int hashCode() {
        if (this.f75806 == 0) {
            this.f75806 = this.f75807.hashCode();
        }
        return this.f75806;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C23420.class.equals(obj.getClass())) {
            return false;
        }
        return this.f75807.equals(((C23420) obj).f75807);
    }
}
