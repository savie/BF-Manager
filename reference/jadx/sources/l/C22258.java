package l;

import java.util.concurrent.atomic.AtomicBoolean;
import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.᩷ᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes.dex */
public final class C22258 implements InterfaceC13118 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25242 f71669;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17036 f71670;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f71671;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15722 f71672;

    public C22258(C17036 c17036, C25242 c25242, AtomicBoolean atomicBoolean, C15722 c15722) {
        this.f71670 = c17036;
        this.f71669 = c25242;
        this.f71671 = atomicBoolean;
        this.f71672 = c15722;
    }

    @Override // l.InterfaceC13118
    /* JADX INFO: renamed from: ۙ */
    public final void mo20516(IInArchive iInArchive) {
        try {
            this.f71670.m40130(iInArchive, this.f71669);
        } catch (Throwable th) {
            C20244.m46520(iInArchive);
            throw th;
        }
    }

    @Override // l.InterfaceC13118
    /* JADX INFO: renamed from: ᩷ */
    public final void mo20517() {
        this.f71671.set(true);
    }

    @Override // l.InterfaceC13118
    /* JADX INFO: renamed from: ۙ */
    public final void mo20515(AbstractC22044 abstractC22044) {
        this.f71669.m56379(abstractC22044);
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f71672.getAsBoolean();
    }
}
