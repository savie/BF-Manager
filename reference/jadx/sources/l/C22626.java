package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.᩹᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes2.dex */
public final class C22626 extends AbstractC4306 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC10983 f73722;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2869 f73723;

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۘ */
    public final void mo11186(int i) {
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۙ */
    public final void mo10348(int i) {
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ᩶ */
    public final void mo11193() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22626(C21920 c21920, C2869 c2869, InterfaceC10983 interfaceC10983) {
        super(c21920);
        this.f73723 = c2869;
        this.f73722 = interfaceC10983;
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ᩹ */
    public final ISequentialOutStream mo11194() {
        final C2869 c2869 = this.f73723;
        final InterfaceC10983 interfaceC10983 = this.f73722;
        return new ISequentialOutStream() { // from class: l.ۚ᩻᩹
            @Override // net.sf.sevenzipjbinding.ISequentialOutStream
            public final int write(ByteBuffer byteBuffer) throws SevenZipException {
                C2869 c28610 = c2869;
                InterfaceC10983 interfaceC10984 = interfaceC10983;
                try {
                    c28610.f10832 = true;
                    return interfaceC10984.write(byteBuffer);
                } catch (IOException e) {
                    throw new SevenZipException(e);
                }
            }
        };
    }

    @Override // l.InterfaceC9868
    /* JADX INFO: renamed from: ۨ */
    public final void mo10349() {
        this.f73723.f10833 = true;
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f73723.f10833;
    }
}
