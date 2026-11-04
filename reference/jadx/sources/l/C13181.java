package l;

/* JADX INFO: renamed from: l.۫ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: IIX2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13181 extends AbstractC16700 {
    @Override // l.AbstractC16700, l.InterfaceC13673
    public final String getName() {
        return "FinishTypeInference";
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        if (c2551.m8524() || c2551.m8490().isEmpty()) {
            return;
        }
        C4937.forEach(c2551.m8490(), new C13498(2, c2551));
    }
}
