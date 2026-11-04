package l;

/* JADX INFO: renamed from: l.᩵۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4QU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20436 extends AbstractC10739 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C3282 f65454;

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final int mo10821(int i) {
        return i + 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20436 m46859(String str, C24738 c24738) {
        C3282 c3282M10820 = C3282.m10820(str, c24738);
        C20436 c20436 = new C20436(c24738);
        c20436.f65454 = c3282M10820;
        return (C20436) c24738.f80112.m38079(c20436);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10825(C4028 c4028, C17452 c17452) {
        this.f65454 = (C3282) this.f34102.f80094.m49623(c4028.m12995());
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10826(C24166 c24166) {
        c24166.m54134(this.f65454.f34104);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final String mo10823() {
        return "type_id_item: " + this.f65454.m10827();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C20436 c20436) {
        return this.f65454.compareTo(c20436.f65454);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m46860() {
        return this.f65454.m10827();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m46863() {
        String strM10827 = this.f65454.m10827();
        return strM10827.length() > 1 ? "L" : strM10827;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m46864() {
        String strM10827 = this.f65454.m10827();
        return (strM10827.charAt(0) == 'J' || strM10827.charAt(0) == 'D') ? 2 : 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46862(String str) {
        this.f65454.m10824(str);
    }

    public final int hashCode() {
        return this.f65454.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C20436.class.equals(obj.getClass()) && this.f65454 == ((C20436) obj).f65454;
    }
}
