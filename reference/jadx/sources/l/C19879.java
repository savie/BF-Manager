package l;

/* JADX INFO: renamed from: l.᩶ۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes5.dex */
public class C19879 extends C9979 implements Comparable {
    /* JADX INFO: renamed from: ۚ */
    public boolean mo25268() {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((String) this.f43680).compareTo((String) ((C19879) obj).f43680);
    }

    public C19879(int i, String str) {
        super(Integer.valueOf(i), str);
    }

    @Override // l.C13111
    public int hashCode() {
        return (((String) this.f43680).hashCode() * 11) + m25242();
    }

    @Override // l.C13111
    public boolean equals(Object obj) {
        if (obj instanceof C19879) {
            return ((String) this.f43680).equals((String) ((C19879) obj).f43680);
        }
        return false;
    }

    @Override // l.C13111
    public String toString() {
        if (!C13612.m33285(EnumC4438.CP_INDEX)) {
            return (String) this.f43680;
        }
        return String.format("#%-4d /* %s */", Integer.valueOf(m25242()), (String) this.f43680);
    }
}
