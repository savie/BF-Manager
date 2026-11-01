package l;

import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: renamed from: l.᩺ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9I0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23037 extends C11771 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15276 f74849;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final SecretKey f74850;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11771 f74851;

    public C23037(C15276 c15276, C11771 c11771, SecretKey secretKey) {
        this.f74849 = c15276;
        this.f74851 = c11771;
        this.f74850 = secretKey;
    }

    @Override // l.C11771, l.InterfaceC19388
    /* JADX INFO: renamed from: ۨ */
    public final void mo29404(C19240 c19240) {
        C11771 c11771 = this.f74851;
        C19240 c19241 = new C19240(c11771.mo25477());
        c11771.mo29404(c19241);
        byte[] bArrM27387 = c19241.m27387();
        int iM27400 = c19241.m27400();
        C15276 c15276 = this.f74849;
        byte[] bArrM36589 = c15276.m36589();
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrM36589, 0, bArrM36589.length);
        C23060 c23060 = new C23060(((C1186) c11771.mo25478()).m4337(), iM27400, bArrM36589);
        byte[] bArrM36583 = C15276.m36583(c23060);
        try {
            C21356 c21356 = c15276.f49800;
            String strM44612 = c15276.f49799.m44612();
            c21356.getClass();
            InterfaceC17789 interfaceC17789M30219 = C12146.m30219(strM44612);
            interfaceC17789M30219.mo38566(EnumC18495.ENCRYPT, this.f74850.getEncoded(), gCMParameterSpec);
            interfaceC17789M30219.mo38567(bArrM36583);
            byte[] bArrMo38568 = interfaceC17789M30219.mo38568(iM27400, bArrM27387);
            if (bArrMo38568.length != iM27400 + 16) {
                throw new IllegalStateException("Invalid length for cipherText after encryption.");
            }
            byte[] bArrM51009 = c23060.m51009();
            System.arraycopy(bArrMo38568, iM27400, bArrM51009, 0, bArrM51009.length);
            c23060.m51010(c19240);
            c19240.m27383(iM27400, bArrMo38568);
        } catch (C7206 e) {
            C15276.f49798.mo12118(c11771.mo25478(), "Security exception while encrypting packet << {} >>");
            throw new C13865(e);
        }
    }

    @Override // l.AbstractC10068
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC8657 mo25478() {
        return (C1186) this.f74851.mo25478();
    }

    @Override // l.C11771
    /* JADX INFO: renamed from: ۚ */
    public final int mo29405() {
        return this.f74851.mo29405();
    }

    @Override // l.AbstractC10068
    /* JADX INFO: renamed from: ۨ */
    public final int mo25477() {
        return this.f74851.mo25477() + 52;
    }

    @Override // l.C11771
    public final String toString() {
        return "Encrypted[" + this.f74851.toString() + "]";
    }

    @Override // l.C11771
    /* JADX INFO: renamed from: ᩹ */
    public final C11771 mo29408() {
        return this.f74851.mo29408();
    }
}
