package l;

/* JADX INFO: renamed from: l.ۧۡܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10898 extends AbstractC15131 {
    @Override // l.AbstractC15131, l.InterfaceC17952
    /* JADX INFO: renamed from: ۙ */
    public final void mo6530(C8781 c8781) throws C8116 {
        if (c8781 instanceof InterfaceC5958) {
            this.f49442.add(c8781);
            return;
        }
        throw new C8116("Text content elements cannot contain " + c8781 + " elements.");
    }
}
