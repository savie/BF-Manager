package l;

/* JADX INFO: renamed from: l.ܿۧ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7TC */
/* JADX INFO: loaded from: classes4.dex */
public final class C17313 extends AbstractC9990 {
    @Override // l.AbstractC9990
    /* JADX INFO: renamed from: ۖ */
    public final long mo3898(Object obj) {
        return ((C18334) obj).m42570();
    }

    @Override // l.AbstractC9990
    /* JADX INFO: renamed from: ۙ */
    public final long mo3899(Object obj) {
        return ((C18334) obj).m42571();
    }

    @Override // l.AbstractC9990
    /* JADX INFO: renamed from: ۙ */
    public final void mo3900(long j, Object obj) {
        ((C18334) obj).m42572(j);
    }

    @Override // l.AbstractC9990
    /* JADX INFO: renamed from: ۨ */
    public final long mo3901(Object obj) {
        return ((C18334) obj).m42577();
    }

    @Override // l.AbstractC9990
    /* JADX INFO: renamed from: ۨ */
    public final void mo3903(long j, Object obj) {
        ((C18334) obj).m42576(j);
    }

    @Override // l.AbstractC9990
    /* JADX INFO: renamed from: ܰ */
    public final String mo3904(Object obj) {
        C18334 c18334 = (C18334) obj;
        String strM42573 = c18334.m42573();
        return (strM42573.endsWith("/") || !c18334.m42574()) ? strM42573 : strM42573.concat("/");
    }

    @Override // l.AbstractC9990
    /* JADX INFO: renamed from: ܰ */
    public final void mo3905(long j, Object obj) {
        ((C18334) obj).m42579(j);
    }

    @Override // l.AbstractC9990
    /* JADX INFO: renamed from: ۨ */
    public final Object mo3902(String str) {
        if (!C12529.m31139(str, "/", false)) {
            throw new RuntimeException();
        }
        C12107 c12107 = new C12107(str);
        String strM30093 = c12107.m30093();
        int i = C5696.f19430;
        String parent = c12107.getParent();
        String strConcat = parent != null ? "/".concat(parent) : "/";
        C13465.m32962((Object) strM30093);
        C13465.m32962((Object) strConcat);
        return new C18334(-1, str, strM30093, strConcat, true, false, -1L, -1L, 0L, 0, null);
    }
}
