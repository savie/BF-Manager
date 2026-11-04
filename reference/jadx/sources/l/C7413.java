package l;

/* JADX INFO: renamed from: l.ۜ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: SIWD */
/* JADX INFO: loaded from: classes4.dex */
public final class C7413 extends AbstractC14124 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC1118 f24424;

    public C7413(AbstractC1118 abstractC1118) {
        this.f24424 = abstractC1118;
    }

    @Override // l.AbstractC14124
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC1118 mo13193(C7830 c7830) {
        AbstractC1118 abstractC1118 = this.f24424;
        Class<?> cls = abstractC1118.getClass();
        AbstractC1118 abstractC1118M4146 = abstractC1118.m4146(c7830);
        if (!cls.isInstance(abstractC1118M4146)) {
            throw new C8597("A state of class " + abstractC1118.getClass() + " has duplicated to produce a class of " + abstractC1118M4146.getClass());
        }
        return (AbstractC1118) cls.cast(abstractC1118M4146);
    }
}
