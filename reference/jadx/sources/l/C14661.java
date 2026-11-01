package l;

import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ܳܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QB */
/* JADX INFO: loaded from: classes4.dex */
public final class C14661 implements InterfaceC1959 {
    @Override // l.InterfaceC1959
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo6327(InterfaceC3800 interfaceC3800) throws Throwable {
        C23833.m52506(interfaceC3800);
    }

    @Override // l.InterfaceC1959
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo6329(InterfaceC3800 interfaceC3800, byte[] bArr) throws IOException {
        C23833.m52507(interfaceC3800, bArr);
    }

    @Override // l.InterfaceC1959
    /* JADX INFO: renamed from: ۙ */
    public final C17482 mo6325(InterfaceC3800 interfaceC3800, boolean z) {
        return new C17482(interfaceC3800, z);
    }

    @Override // l.InterfaceC1959
    /* JADX INFO: renamed from: ۙ */
    public final void mo6328(InterfaceC3800 interfaceC3800, InterfaceC3800 interfaceC3801) throws IOException {
        C5212.move(interfaceC3800, interfaceC3801, EnumC21440.ATOMIC_MOVE, EnumC21440.REPLACE_EXISTING);
    }

    @Override // l.InterfaceC1959
    /* JADX INFO: renamed from: ۙ */
    public final void mo6326(FileChannel fileChannel) throws IOException {
        fileChannel.force(true);
    }

    @Override // l.InterfaceC1959
    /* JADX INFO: renamed from: ܰ */
    public final void mo6330(InterfaceC3800 interfaceC3800) {
        C5212.delete(interfaceC3800);
    }
}
