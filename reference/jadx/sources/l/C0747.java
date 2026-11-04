package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.֡᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J6S5 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0747 implements InterfaceC2017, InterfaceC5392, InterfaceC14075, ISequentialOutStream, InterfaceC1922 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2725;

    public /* synthetic */ C0747(Object obj) {
        this.f2725 = obj;
    }

    @Override // l.InterfaceC14075
    public /* synthetic */ void cancel() {
    }

    @Override // l.InterfaceC1922
    /* JADX INFO: renamed from: ᩷ */
    public String mo2305() {
        return C0168.m1425((C0168) this.f2725);
    }

    @Override // l.InterfaceC2017
    /* JADX INFO: renamed from: ᩷ */
    public void mo1355(Object obj, Throwable th) {
        ((C8950) this.f2725).f29198 = null;
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public int write(ByteBuffer byteBuffer) throws SevenZipException {
        InterfaceC6116 interfaceC6116 = (InterfaceC6116) this.f2725;
        try {
            int iRemaining = byteBuffer.remaining();
            interfaceC6116.mo17645(byteBuffer);
            return iRemaining;
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }

    @Override // l.InterfaceC14075
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC7364 mo3080(int i) {
        return new C6728(i, (AbstractC0148) this.f2725);
    }

    @Override // l.InterfaceC5392
    /* JADX INFO: renamed from: ۙ */
    public void mo1772(AbstractC22044 abstractC22044) {
        C1663.m5981((C8614) this.f2725, abstractC22044);
    }
}
