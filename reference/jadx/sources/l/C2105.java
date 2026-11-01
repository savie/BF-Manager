package l;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.֫᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes3.dex */
public final class C2105 extends AbstractC19040 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f7752;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f7753;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f7754;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC9868 f7755;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f7756;

    @Override // l.AbstractC19040
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized void mo6657(long j, long j2) {
        if (this.f7755.mo2357()) {
            throw new SevenZipException("Canceled");
        }
        int iM22238 = C8516.m22238(j, j2);
        if (iM22238 != this.f7752) {
            this.f7752 = iM22238;
            this.f7755.mo10348(iM22238);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2105(InterfaceC9868 interfaceC9868, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicReference atomicReference) {
        super(null);
        this.f7755 = interfaceC9868;
        this.f7754 = atomicBoolean;
        this.f7753 = atomicBoolean2;
        this.f7756 = atomicReference;
        this.f7752 = -1;
    }

    @Override // l.AbstractC19040
    public final ISequentialOutStream getStream(int i) {
        throw new IllegalStateException("Extraction stream requested in test mode");
    }

    @Override // l.AbstractC19040
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ISequentialOutStream mo6658(int i) throws SevenZipException {
        InterfaceC9868 interfaceC9868 = this.f7755;
        if (interfaceC9868.mo2357()) {
            throw new SevenZipException("Canceled");
        }
        AtomicBoolean atomicBoolean = this.f7754;
        atomicBoolean.set(false);
        this.f7753.set(interfaceC9868.mo10350(i));
        interfaceC9868.mo11186(i);
        if (interfaceC9868.mo2357()) {
            throw new SevenZipException("Canceled");
        }
        atomicBoolean.set(true);
        return new C13217(interfaceC9868);
    }

    @Override // l.AbstractC19040
    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public final void mo6656() {
        this.f7754.set(false);
        this.f7753.set(false);
    }

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final void setOperationResult(ExtractOperationResult extractOperationResult) throws SevenZipException {
        AtomicReference atomicReference;
        boolean andSet = this.f7754.getAndSet(false);
        boolean andSet2 = this.f7753.getAndSet(false);
        if (extractOperationResult != ExtractOperationResult.OK) {
            C11363 c11363 = new C11363(extractOperationResult, andSet2);
            do {
                atomicReference = this.f7756;
                if (atomicReference.compareAndSet(null, c11363)) {
                    break;
                }
            } while (atomicReference.get() == null);
            throw new SevenZipException(extractOperationResult.toString());
        }
        if (andSet) {
            InterfaceC9868 interfaceC9868 = this.f7755;
            if (interfaceC9868.mo2357()) {
                return;
            }
            interfaceC9868.mo11193();
        }
    }
}
