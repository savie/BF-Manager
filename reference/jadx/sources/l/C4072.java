package l;

/* JADX INFO: renamed from: l.ۘۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4YN */
/* JADX INFO: loaded from: classes3.dex */
public final class C4072 extends AbstractC10739 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f13901;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C12231 f13902;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C16532 f13903;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C24956 f13904;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C20436 f13905;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C3282 f13906;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C20436 f13907;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C6310 f13908;

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final int mo10821(int i) {
        return i + 32;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f34103 - ((C4072) obj).f34103;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13152(C24738 c24738) {
        C20436 c20436M46859 = C20436.m46859(this.f13907.m46860(), c24738);
        int i = this.f13901;
        C20436 c20436M468510 = C20436.m46859(this.f13905.m46860(), c24738);
        C12231 c12231 = this.f13902;
        C16532 c16532M39174 = null;
        C12231 c12231M30519 = c12231 != null ? c12231.m30519(c24738) : null;
        C3282 c3282 = this.f13906;
        C3282 c3282M10820 = c3282 != null ? C3282.m10820(c3282.m10827(), c24738) : null;
        C24956 c24956 = this.f13904;
        C24956 c24956M55715 = c24956 != null ? c24956.m55715(c24738) : null;
        C6310 c6310 = this.f13908;
        C6310 c6310M18003 = c6310 != null ? c6310.m18003(c24738) : null;
        C16532 c16532 = this.f13903;
        if (c16532 != null) {
            AbstractC14294[] abstractC14294Arr = c16532.m39175().f75324;
            AbstractC14294[] abstractC14294Arr2 = new AbstractC14294[abstractC14294Arr.length];
            int length = abstractC14294Arr.length;
            for (int i2 = 0; i2 < length; i2++) {
                abstractC14294Arr2[i2] = AbstractC14294.m34703(c24738, abstractC14294Arr[i2]);
            }
            c16532M39174 = C16532.m39174(c24738, new C23246(abstractC14294Arr2));
        }
        C4072 c4072 = new C4072(c24738);
        c4072.f13907 = c20436M46859;
        c4072.f13901 = i;
        c4072.f13905 = c20436M468510;
        c4072.f13902 = c12231M30519;
        c4072.f13906 = c3282M10820;
        c4072.f13904 = c24956M55715;
        c4072.f13908 = c6310M18003;
        c4072.f13903 = c16532M39174;
        if (c6310M18003 != null) {
            c6310M18003.m18007(c4072);
        }
        if (c24956M55715 != null) {
            c24956M55715.m55716(c4072);
        }
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10825(C4028 c4028, C17452 c17452) {
        AbstractC10739 abstractC10739M49623;
        C24738 c24738 = this.f34102;
        this.f13907 = (C20436) c24738.f80112.m49623(c4028.m12995());
        this.f13901 = c4028.m12995();
        C21928 c21928 = c24738.f80112;
        int iM12995 = c4028.m12995();
        AbstractC10739 abstractC10739M49624 = null;
        if (iM12995 == -1) {
            c21928.getClass();
            abstractC10739M49623 = null;
        } else {
            abstractC10739M49623 = c21928.m49623(iM12995);
        }
        this.f13905 = (C20436) abstractC10739M49623;
        this.f13902 = (C12231) c17452.m40955(EnumC15214.TYPE_TYPE_LIST, c4028.m12995());
        C21928 c21929 = c24738.f80094;
        int iM12996 = c4028.m12995();
        if (iM12996 == -1) {
            c21929.getClass();
        } else {
            abstractC10739M49624 = c21929.m49623(iM12996);
        }
        this.f13906 = (C3282) abstractC10739M49624;
        this.f13904 = (C24956) c17452.m40955(EnumC15214.TYPE_ANNOTATIONS_DIRECTORY_ITEM, c4028.m12995());
        this.f13908 = (C6310) c17452.m40955(EnumC15214.TYPE_CLASS_DATA_ITEM, c4028.m12995());
        this.f13903 = (C16532) c17452.m40955(EnumC15214.TYPE_ENCODED_ARRAY_ITEM, c4028.m12995());
        C6310 c6310 = this.f13908;
        if (c6310 != null) {
            c6310.m18007(this);
        }
        C24956 c24956 = this.f13904;
        if (c24956 != null) {
            c24956.m55716(this);
        }
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10826(C24166 c24166) {
        c24166.m54134(this.f13907.f34104);
        c24166.m54134(this.f13901);
        C20436 c20436 = this.f13905;
        c24166.m54134(c20436 == null ? -1 : c20436.f34104);
        C12231 c12231 = this.f13902;
        c24166.m54134(c12231 == null ? 0 : c12231.f34103);
        C3282 c3282 = this.f13906;
        c24166.m54134(c3282 != null ? c3282.f34104 : -1);
        C24956 c24956 = this.f13904;
        c24166.m54134(c24956 == null ? 0 : c24956.f34103);
        C6310 c6310 = this.f13908;
        c24166.m54134(c6310 == null ? 0 : c6310.f34103);
        C16532 c16532 = this.f13903;
        c24166.m54134(c16532 != null ? c16532.f34103 : 0);
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final String mo10823() {
        return "class_def_item: " + this.f13907.m46860();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20436 m13151() {
        return this.f13907;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6310 m13154() {
        return this.f13908;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16532 m13153() {
        if (this.f13903 == null) {
            this.f13903 = C16532.m39174(this.f34102, new C23246(new AbstractC14294[0]));
        }
        return this.f13903;
    }
}
