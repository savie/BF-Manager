package l;

/* JADX INFO: renamed from: l.ۗ۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4P4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3282 extends AbstractC10739 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C23420 f10698;

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo10821(int i) {
        return i + 4;
    }

    public C3282(C24738 c24738, C23420 c23420) {
        super(c24738);
        this.f10698 = c23420;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3282 m10820(String str, C24738 c24738) {
        return (C3282) c24738.f80094.m38079(new C3282(c24738, C23420.m52620(str, c24738)));
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10825(C4028 c4028, C17452 c17452) {
        this.f10698 = (C23420) c17452.m40951(EnumC15214.TYPE_STRING_DATA_ITEM, c4028.m12995());
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo10826(C24166 c24166) {
        c24166.m54134(this.f10698.f34103);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo10823() {
        return "string_id_item: " + C8398.m22566(this.f10698.m52622());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C3282 c3282) {
        return this.f10698.m52622().compareTo(c3282.f10698.m52622());
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m10827() {
        return this.f10698.m52622();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10824(String str) {
        this.f10698.m52621(str);
    }

    public final int hashCode() {
        return this.f10698.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C3282.class.equals(obj.getClass()) && this.f10698 == ((C3282) obj).f10698;
    }
}
