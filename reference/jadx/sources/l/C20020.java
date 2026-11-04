package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ᩴᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes5.dex */
public final class C20020 extends AbstractC7217 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC11573 f64316;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11069 f64317;

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ֫ */
    public final void mo7308(int i) {
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ۙ */
    public final void mo7309(int i) {
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩶ */
    public final void mo7312() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20020(C17036 c17036, C11069 c11069, InterfaceC11573 interfaceC11573) {
        super(c17036);
        this.f64317 = c11069;
        this.f64316 = interfaceC11573;
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ܳ */
    public final ISequentialOutStream mo7311() {
        final C11069 c11069 = this.f64317;
        final InterfaceC11573 interfaceC11573 = this.f64316;
        return new ISequentialOutStream() { // from class: l.᩸ᩴ۫
            @Override // net.sf.sevenzipjbinding.ISequentialOutStream
            public final int write(ByteBuffer byteBuffer) throws SevenZipException {
                C11069 c110610 = c11069;
                InterfaceC11573 interfaceC11574 = interfaceC11573;
                try {
                    c110610.f34916 = true;
                    return interfaceC11574.write(byteBuffer);
                } catch (IOException e) {
                    throw new SevenZipException(e);
                }
            }
        };
    }

    @Override // l.InterfaceC2742
    /* JADX INFO: renamed from: ᩷ */
    public final void mo7313() {
        this.f64317.f34913 = true;
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f64317.f34913;
    }
}
