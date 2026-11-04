package l;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ۢܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10199 implements ISequentialOutStream, InterfaceC3797 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f32625;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f32626;

    public /* synthetic */ C10199(Object obj, Object obj2) {
        this.f32625 = obj;
        this.f32626 = obj2;
    }

    @Override // l.InterfaceC3797
    /* JADX INFO: renamed from: ۙ */
    public void mo12326(int i, int i2, int i3) {
        C24064.m53606((C24064) this.f32625, (ArrayList) this.f32626, i, i2, i3);
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public int write(ByteBuffer byteBuffer) throws SevenZipException {
        InterfaceC2742 interfaceC2742 = (InterfaceC2742) this.f32625;
        ISequentialOutStream iSequentialOutStream = (ISequentialOutStream) this.f32626;
        if (interfaceC2742.mo924()) {
            throw new SevenZipException("Canceled");
        }
        return iSequentialOutStream.write(byteBuffer);
    }
}
