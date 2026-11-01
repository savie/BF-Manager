package l;

/* JADX INFO: renamed from: l.ۤ֡ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8APP */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC9940 extends AbstractActivityC10490 {

    /* JADX INFO: renamed from: ۠ܰ, reason: not valid java name and contains not printable characters */
    public String f33940;

    /* JADX INFO: renamed from: ᩴܰ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f33941;

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ۙۙ */
    public final String mo7994() {
        return ".mtd";
    }

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "DictionaryEditor";
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ۖۙ */
    public final boolean mo7992() {
        try {
            int i = C5553.f19060;
            AbstractC20745 abstractC20745M15309 = C5553.m15309(getIntent());
            this.f33941 = abstractC20745M15309;
            this.f33940 = abstractC20745M15309.m46718();
            return true;
        } catch (Exception e) {
            m31003((Throwable) e, true);
            return false;
        }
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ۨۙ */
    public final String mo7997() {
        return this.f33940;
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo25147() {
        return this.f33941.mo33986();
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ܳ */
    public final String mo7998() {
        return this.f33941.getName();
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ۚۙ */
    public final String mo7995() {
        return this.f33941.m46730();
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ۨ */
    public final void mo7996(String str) throws C16405 {
        C0176.m1372((CharSequence) str);
        this.f33941.m46735(str);
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ۙ */
    public final void mo7993(Exception exc) {
        if (exc instanceof C16405) {
            this.f35938.m17023(((C16405) exc).m38616() - 1);
        }
    }
}
