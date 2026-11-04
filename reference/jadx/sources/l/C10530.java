package l;

import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۤ֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QB */
/* JADX INFO: loaded from: classes4.dex */
public final class C10530 implements InterfaceC22465 {
    @Override // l.InterfaceC22465
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo26981(InterfaceC24329 interfaceC24329) throws Throwable {
        C21719.m49293(interfaceC24329);
    }

    @Override // l.InterfaceC22465
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo26983(InterfaceC24329 interfaceC24329, byte[] bArr) throws IOException {
        C21719.m49294(interfaceC24329, bArr);
    }

    @Override // l.InterfaceC22465
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7064 mo26979(InterfaceC24329 interfaceC24329, boolean z) {
        return new C7064(interfaceC24329, z);
    }

    @Override // l.InterfaceC22465
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo26982(InterfaceC24329 interfaceC24329, InterfaceC24329 interfaceC243210) throws IOException {
        C3445.move(interfaceC24329, interfaceC243210, EnumC18361.ATOMIC_MOVE, EnumC18361.REPLACE_EXISTING);
    }

    @Override // l.InterfaceC22465
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo26980(FileChannel fileChannel) throws IOException {
        fileChannel.force(true);
    }

    @Override // l.InterfaceC22465
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo26984(InterfaceC24329 interfaceC24329) {
        C3445.delete(interfaceC24329);
    }
}
