package l;

import java.io.IOException;
import net.sf.sevenzipjbinding.IOutCreateCallback;
import net.sf.sevenzipjbinding.IOutItemBase;
import net.sf.sevenzipjbinding.ISequentialInStream;
import net.sf.sevenzipjbinding.SevenZipException;
import net.sf.sevenzipjbinding.impl.OutItemFactory;

/* JADX INFO: renamed from: l.ܺ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4B3Z */
/* JADX INFO: loaded from: classes5.dex */
public class C16218 implements IOutCreateCallback {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f52337;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16923 f52338;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f52340;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f52339 = -1;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ISequentialInStream f52336 = null;

    public C16218(InterfaceC16923 interfaceC16923) {
        this.f52338 = interfaceC16923;
    }

    @Override // net.sf.sevenzipjbinding.IOutCreateCallback
    public IOutItemBase getItemInformation(int i, OutItemFactory outItemFactory) throws SevenZipException {
        InterfaceC16923 interfaceC16923 = this.f52338;
        if (interfaceC16923.mo2357()) {
            throw new SevenZipException("Canceled");
        }
        return interfaceC16923.getItemInformation(i, outItemFactory);
    }

    @Override // net.sf.sevenzipjbinding.IOutCreateCallback
    public final ISequentialInStream getStream(int i) throws SevenZipException {
        InterfaceC16923 interfaceC16923 = this.f52338;
        if (interfaceC16923.mo2357()) {
            throw new SevenZipException("Canceled");
        }
        try {
            ISequentialInStream stream = interfaceC16923.getStream(i);
            this.f52336 = stream;
            return stream;
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }

    @Override // net.sf.sevenzipjbinding.IOutCreateCallback
    public final void setOperationResult(boolean z) throws SevenZipException {
        C19431.m44468(this.f52336);
        this.f52336 = null;
        if (!z) {
            throw new SevenZipException();
        }
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final void setTotal(long j) throws SevenZipException {
        this.f52337 = j;
        m38329(this.f52340, j);
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final void setCompleted(long j) throws SevenZipException {
        this.f52340 = j;
        m38329(j, this.f52337);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38329(long j, long j2) throws SevenZipException {
        if (this.f52338.mo2357()) {
            throw new SevenZipException("Canceled");
        }
        final int iM22238 = C8516.m22238(j, j2);
        if (iM22238 != this.f52339) {
            this.f52339 = iM22238;
            C16737.m39273(new Runnable() { // from class: l.۟᩹ۖ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f25596.f52338.mo17106(iM22238);
                }
            });
        }
    }
}
