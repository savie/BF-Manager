package l;

/* JADX INFO: renamed from: l.ܿۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes5.dex */
public final class C18073 extends AbstractC17567 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0174 f59156;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Class f59157;

    public C18073(C0174 c0174, Class cls) {
        this.f59156 = c0174;
        this.f59157 = cls;
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final void mo3723(C21362 c21362, Object obj) {
        this.f59156.f1247.mo3723(c21362, obj);
    }

    @Override // l.AbstractC17567
    /* JADX INFO: renamed from: ۙ */
    public final Object mo3722(C4208 c4208) {
        Object objMo3722 = this.f59156.f1247.mo3722(c4208);
        if (objMo3722 != null) {
            Class cls = this.f59157;
            if (!cls.isInstance(objMo3722)) {
                throw new C7367("Expected a " + cls.getName() + " but was " + objMo3722.getClass().getName() + "; at path " + c4208.m13451());
            }
        }
        return objMo3722;
    }
}
