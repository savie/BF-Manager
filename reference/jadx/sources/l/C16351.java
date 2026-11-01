package l;

/* JADX INFO: renamed from: l.ܽۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes5.dex */
public class C16351 extends C10001 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f52645;

    public C16351(int i, String str, int i2, EnumC0554 enumC0554, String str2) {
        super(i, str, i2, enumC0554);
        this.f52645 = (str2 == null || str2.isEmpty()) ? null : str2;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m38522() {
        return this.f52645;
    }

    @Override // l.C10001, l.C19879, l.C13111
    public final int hashCode() {
        String str = this.f52645;
        return (str == null ? 0 : str.hashCode()) + super.hashCode();
    }
}
