package l;

/* JADX INFO: renamed from: l.ܶܿۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8APP */
/* JADX INFO: loaded from: classes5.dex */
public class ActivityC16243 extends AbstractActivityC22047 {

    /* JADX INFO: renamed from: ۗ᩷, reason: not valid java name and contains not printable characters */
    public String f52792;

    /* JADX INFO: renamed from: ᩹᩷, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f52793;

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ܳۙ */
    public final String mo1390() {
        return ".mtd";
    }

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "DictionaryEditor";
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ֫ۙ */
    public final boolean mo1384() {
        try {
            int i = C14584.f45961;
            AbstractC22044 abstractC22044M35190 = C14584.m35190(getIntent());
            this.f52793 = abstractC22044M35190;
            this.f52792 = abstractC22044M35190.m49874();
            return true;
        } catch (Exception e) {
            m40402((Throwable) e, true);
            return false;
        }
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ۚۙ */
    public final String mo1386() {
        return this.f52792;
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ۤۙ */
    public final String mo35215() {
        return this.f52793.mo4294();
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ᩷ۙ */
    public final String mo1392() {
        return this.f52793.getName();
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ۧۙ */
    public final String mo1388() {
        return this.f52793.m49871();
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ۤ */
    public final void mo1387(String str) throws C0200 {
        C18099.m42212((CharSequence) str);
        this.f52793.m49879(str);
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ۙ */
    public final void mo1385(Exception exc) {
        if (exc instanceof C0200) {
            this.f71108.m54024(((C0200) exc).m1593() - 1);
        }
    }
}
