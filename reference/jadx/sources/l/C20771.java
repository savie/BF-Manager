package l;

/* JADX INFO: renamed from: l.᩷ۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes5.dex */
public class C20771 extends C22929 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C0350 f67572;

    @Override // l.C22929
    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo46762() {
        return true;
    }

    public C20771(AbstractC11242 abstractC11242, AbstractC23903 abstractC23903, AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C0350 c0350) {
        super(abstractC23903, abstractC165710, abstractC11242);
        this.f74536 = abstractC165710;
        mo18111(abstractC16579);
        this.f67572 = c0350;
    }

    @Override // l.C22929, l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public final C20771 mo1929(C3794 c3794) {
        AbstractC0618 abstractC0618 = this.f53222;
        AbstractC16579 abstractC16579Mo18112 = mo18112();
        mo18112();
        return new C7365(this, abstractC0618, abstractC16579Mo18112, this.f74536, this.f67572, c3794);
    }

    @Override // l.C22929, l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1928(InterfaceC15874 interfaceC15874, Object obj) {
        return interfaceC15874.mo11014(this, obj);
    }

    @Override // l.AbstractC16579, l.InterfaceC9105
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m39000(sb, false);
        sb.append("capture#");
        sb.append((((long) hashCode()) & 4294967295L) % 997);
        sb.append(" of ");
        sb.append(this.f67572);
        return sb.toString();
    }
}
