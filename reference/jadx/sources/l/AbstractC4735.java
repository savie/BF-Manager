package l;

/* JADX INFO: renamed from: l.ۙۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SB7W */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4735 extends AbstractC12235 {
    @Override // l.AbstractC12235, l.InterfaceC24170
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14635(C18202 c18202) throws C14429 {
        if (c18202 instanceof InterfaceC13726) {
            this.f39383.add(c18202);
            return;
        }
        throw new C14429("Text content elements cannot contain " + c18202 + " elements.");
    }
}
