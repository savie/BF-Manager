package l;

/* JADX INFO: renamed from: l.ۙ᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes3.dex */
public class C5268 extends C1144 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f18566;

    public C5268(int i, String str, int i2, EnumC19840 enumC19840, String str2) {
        super(i, str, i2, enumC19840);
        this.f18566 = (str2 == null || str2.isEmpty()) ? null : str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m15858() {
        return this.f18566;
    }

    @Override // l.C1144, l.C7110, l.C18941
    public final int hashCode() {
        String str = this.f18566;
        return (str == null ? 0 : str.hashCode()) + super.hashCode();
    }
}
