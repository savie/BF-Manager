package l;

import java.io.IOException;
import net.sf.sevenzipjbinding.IOutCreateCallback;
import net.sf.sevenzipjbinding.IOutItemBase;
import net.sf.sevenzipjbinding.ISequentialInStream;
import net.sf.sevenzipjbinding.SevenZipException;
import net.sf.sevenzipjbinding.impl.OutItemFactory;

/* JADX INFO: renamed from: l.᩺ܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 4B3Z */
/* JADX INFO: loaded from: classes.dex */
public class C24372 implements IOutCreateCallback {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f79081;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21388 f79082;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f79084;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f79080 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ISequentialInStream f79083 = null;

    public C24372(InterfaceC21388 interfaceC21388) {
        this.f79082 = interfaceC21388;
    }

    @Override // net.sf.sevenzipjbinding.IOutCreateCallback
    public IOutItemBase getItemInformation(int i, OutItemFactory outItemFactory) throws SevenZipException {
        InterfaceC21388 interfaceC21388 = this.f79082;
        if (interfaceC21388.mo924()) {
            throw new SevenZipException("Canceled");
        }
        return interfaceC21388.getItemInformation(i, outItemFactory);
    }

    @Override // net.sf.sevenzipjbinding.IOutCreateCallback
    public final ISequentialInStream getStream(int i) throws SevenZipException {
        InterfaceC21388 interfaceC21388 = this.f79082;
        if (interfaceC21388.mo924()) {
            throw new SevenZipException("Canceled");
        }
        try {
            ISequentialInStream stream = interfaceC21388.getStream(i);
            this.f79083 = stream;
            return stream;
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }

    @Override // net.sf.sevenzipjbinding.IOutCreateCallback
    public final void setOperationResult(boolean z) throws SevenZipException {
        C20244.m46520(this.f79083);
        this.f79083 = null;
        if (!z) {
            throw new SevenZipException();
        }
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final void setTotal(long j) throws SevenZipException {
        this.f79081 = j;
        m54492(this.f79084, j);
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final void setCompleted(long j) throws SevenZipException {
        this.f79084 = j;
        m54492(j, this.f79081);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54492(long j, long j2) throws SevenZipException {
        if (this.f79082.mo924()) {
            throw new SevenZipException("Canceled");
        }
        final int iM11075 = C3374.m11075(j, j2);
        if (iM11075 != this.f79080) {
            this.f79080 = iM11075;
            C21576.m49068(new Runnable() { // from class: l.ۨܳ᩸
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39980.f79082.mo2399(iM11075);
                }
            });
        }
    }
}
