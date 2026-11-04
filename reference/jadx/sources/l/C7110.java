package l;

/* JADX INFO: renamed from: l.ۜۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes3.dex */
public class C7110 extends C14150 implements Comparable {
    /* JADX INFO: renamed from: ᩴ */
    public boolean mo4218() {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((String) this.f61429).compareTo((String) ((C7110) obj).f61429);
    }

    public C7110(int i, String str) {
        super(Integer.valueOf(i), str);
    }

    @Override // l.C18941
    public int hashCode() {
        return (((String) this.f61429).hashCode() * 11) + m34370();
    }

    @Override // l.C18941
    public boolean equals(Object obj) {
        if (obj instanceof C7110) {
            return ((String) this.f61429).equals((String) ((C7110) obj).f61429);
        }
        return false;
    }

    @Override // l.C18941
    public String toString() {
        if (!C25406.m56769(EnumC11979.CP_INDEX)) {
            return (String) this.f61429;
        }
        return String.format("#%-4d /* %s */", Integer.valueOf(m34370()), (String) this.f61429);
    }
}
