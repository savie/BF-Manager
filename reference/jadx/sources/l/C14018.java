package l;

/* JADX INFO: renamed from: l.۬ܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes4.dex */
public class C14018 extends C17969 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C10729 f44410;

    @Override // l.C17969
    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo34139() {
        return true;
    }

    public C14018(AbstractC19728 abstractC19728, AbstractC11781 abstractC11781, AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C10729 c10729) {
        super(abstractC11781, abstractC22665, abstractC19728);
        this.f58893 = abstractC22665;
        mo19991(abstractC22664);
        this.f44410 = c10729;
    }

    @Override // l.C17969, l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public final C14018 mo4934(C14458 c14458) {
        AbstractC22970 abstractC22970 = this.f73596;
        AbstractC22664 abstractC22664Mo19992 = mo19992();
        mo19992();
        return new C7307(this, abstractC22970, abstractC22664Mo19992, this.f58893, this.f44410, c14458);
    }

    @Override // l.C17969, l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public final Object mo9324(InterfaceC4764 interfaceC4764, Object obj) {
        return interfaceC4764.mo1770(this, obj);
    }

    @Override // l.AbstractC22664, l.InterfaceC9769
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m51066(sb, false);
        sb.append("capture#");
        sb.append((((long) hashCode()) & 4294967295L) % 997);
        sb.append(" of ");
        sb.append(this.f44410);
        return sb.toString();
    }
}
