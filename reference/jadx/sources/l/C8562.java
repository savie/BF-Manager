package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.۠ۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8562 implements Supplier {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27951;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC25384 f27952;

    public /* synthetic */ C8562(AbstractC25384 abstractC25384, int i) {
        this.f27951 = i;
        this.f27952 = abstractC25384;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f27951) {
            case 0:
                return ((AbstractC11781) this.f27952).mo29597();
            default:
                C2569 c2569 = (C2569) this.f27952;
                C18499 c18499 = new C18499();
                new C9280(c2569, c18499).m52092(((C13256) c2569.f21366).f42355);
                C14769 c14769M43093 = c18499.m43093();
                c2569.f8252 = C15867.of(c14769M43093);
                return c14769M43093;
        }
    }
}
