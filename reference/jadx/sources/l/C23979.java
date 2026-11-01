package l;

import java.nio.ByteBuffer;
import java.util.Set;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.᩻᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B3M */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23979 implements ISequentialOutStream, InterfaceC2288, InterfaceC10680 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f77734;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f77735;

    public /* synthetic */ C23979(Object obj, Object obj2) {
        this.f77734 = obj;
        this.f77735 = obj2;
    }

    @Override // l.InterfaceC2288
    public /* synthetic */ void cancel() {
    }

    @Override // l.InterfaceC10680
    /* JADX INFO: renamed from: ۙ */
    public void mo26890(String str, String str2, boolean z, boolean z2, boolean z3) {
        ViewOnClickListenerC23380.m51516((ViewOnClickListenerC23380) this.f77734, (Set) this.f77735, str, str2, z, z2, z3);
    }

    @Override // l.InterfaceC2288
    /* JADX INFO: renamed from: ܰ */
    public AbstractC11462 mo2001(int i) {
        return C9183.m23617((C9183) this.f77734, (C11545) this.f77735, i);
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public int write(ByteBuffer byteBuffer) throws SevenZipException {
        InterfaceC9868 interfaceC9868 = (InterfaceC9868) this.f77734;
        ISequentialOutStream iSequentialOutStream = (ISequentialOutStream) this.f77735;
        if (interfaceC9868.mo2357()) {
            throw new SevenZipException("Canceled");
        }
        return iSequentialOutStream.write(byteBuffer);
    }
}
