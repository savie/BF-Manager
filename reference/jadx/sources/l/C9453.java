package l;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ۡܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes4.dex */
public final class C9453 extends AbstractC11691 {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f30648;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2742 f30649;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f30650;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f30651;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f30652;

    @Override // l.AbstractC11691
    /* JADX INFO: renamed from: ᩸ */
    public final synchronized void mo4533(long j, long j2) {
        if (this.f30649.mo924()) {
            throw new SevenZipException("Canceled");
        }
        int iM11075 = C3374.m11075(j, j2);
        if (iM11075 != this.f30650) {
            this.f30650 = iM11075;
            this.f30649.mo7309(iM11075);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9453(InterfaceC2742 interfaceC2742, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicReference atomicReference) {
        super(null);
        this.f30649 = interfaceC2742;
        this.f30648 = atomicBoolean;
        this.f30651 = atomicBoolean2;
        this.f30652 = atomicReference;
        this.f30650 = -1;
    }

    @Override // l.AbstractC11691
    public final ISequentialOutStream getStream(int i) {
        throw new IllegalStateException("Extraction stream requested in test mode");
    }

    @Override // l.AbstractC11691
    /* JADX INFO: renamed from: ۧ */
    public final ISequentialOutStream mo4530(int i) throws SevenZipException {
        InterfaceC2742 interfaceC2742 = this.f30649;
        if (interfaceC2742.mo924()) {
            throw new SevenZipException("Canceled");
        }
        AtomicBoolean atomicBoolean = this.f30648;
        atomicBoolean.set(false);
        this.f30651.set(interfaceC2742.mo9091(i));
        interfaceC2742.mo7308(i);
        if (interfaceC2742.mo924()) {
            throw new SevenZipException("Canceled");
        }
        atomicBoolean.set(true);
        return new C17340(interfaceC2742);
    }

    @Override // l.AbstractC11691
    /* JADX INFO: renamed from: ܿۙ */
    public final void mo4532() {
        this.f30648.set(false);
        this.f30651.set(false);
    }

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final void setOperationResult(ExtractOperationResult extractOperationResult) throws SevenZipException {
        AtomicReference atomicReference;
        boolean andSet = this.f30648.getAndSet(false);
        boolean andSet2 = this.f30651.getAndSet(false);
        if (extractOperationResult != ExtractOperationResult.OK) {
            C4915 c4915 = new C4915(extractOperationResult, andSet2);
            do {
                atomicReference = this.f30652;
                if (atomicReference.compareAndSet(null, c4915)) {
                    break;
                }
            } while (atomicReference.get() == null);
            throw new SevenZipException(extractOperationResult.toString());
        }
        if (andSet) {
            InterfaceC2742 interfaceC2742 = this.f30649;
            if (interfaceC2742.mo924()) {
                return;
            }
            interfaceC2742.mo7312();
        }
    }
}
