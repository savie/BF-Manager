package l;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.ۨ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes4.dex */
public final class C11993 implements InterfaceC2742 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicInteger f38650;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17036 f38651;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16269 f38652;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f38653;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f38654;

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ֨ */
    public final /* synthetic */ void mo9088() {
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ۫ۙ */
    public final /* synthetic */ boolean mo7310() {
        return true;
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ܳ */
    public final ISequentialOutStream mo7311() {
        return null;
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ void mo9093(int i) {
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩷ۙ */
    public final /* synthetic */ void mo9095() {
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ܰ */
    public final String mo9092() {
        return C21054.m48109(mo9090());
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ۙ */
    public final void mo9089(String str) {
        C21054.m48119(mo9090(), str);
    }

    public C11993(C17036 c17036, List list, AtomicReference atomicReference, C16269 c16269, AtomicInteger atomicInteger) {
        this.f38651 = c17036;
        this.f38653 = list;
        this.f38654 = atomicReference;
        this.f38652 = c16269;
        this.f38650 = atomicInteger;
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ۚ */
    public final String mo9090() {
        return this.f38651.m40138();
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩸ۙ */
    public final IInArchive mo9096() {
        return this.f38651.m40144();
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩷ */
    public final void mo9094(IInArchive iInArchive) {
        this.f38651.m40145(iInArchive);
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ֫ */
    public final void mo7308(int i) {
        AtomicReference atomicReference = this.f38654;
        if (i >= 0) {
            List list = this.f38653;
            if (i < list.size()) {
                atomicReference.set(((C1997) list.get(i)).m6840());
                return;
            }
        }
        atomicReference.set(null);
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo9091(int i) {
        if (i < 0) {
            return false;
        }
        List list = this.f38653;
        return i < list.size() && ((C1997) list.get(i)).m6844();
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩶ */
    public final void mo7312() {
        this.f38654.set(null);
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩷ */
    public final void mo7313() {
        this.f38652.cancel();
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f38652.m38601();
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ۙ */
    public final void mo7309(int i) {
        this.f38650.set(i);
    }
}
