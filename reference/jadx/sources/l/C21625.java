package l;

import com.google.android.material.motion.MotionUtils;
import javax.crypto.SecretKey;

/* JADX INFO: renamed from: l.᩸ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9HI */
/* JADX INFO: loaded from: classes5.dex */
public final class C21625 extends C11771 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C11771 f70137;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public SecretKey f70138;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18097 f70139;

    public C21625(C18097 c18097, C11771 c11771, SecretKey secretKey) {
        this.f70139 = c18097;
        this.f70137 = c11771;
        this.f70138 = secretKey;
    }

    @Override // l.C11771
    /* JADX INFO: renamed from: ۚ */
    public final int mo29405() {
        return this.f70137.mo29405();
    }

    @Override // l.AbstractC10068
    /* JADX INFO: renamed from: ۨ */
    public final int mo25477() {
        return this.f70137.mo25477();
    }

    @Override // l.C11771, l.InterfaceC19388
    /* JADX INFO: renamed from: ۨ */
    public final void mo29404(C19240 c19240) {
        C18097 c18097 = this.f70139;
        C11771 c11771 = this.f70137;
        try {
            ((C1186) c11771.mo25478()).m4345(EnumC4714.SMB2_FLAGS_SIGNED);
            int iM27400 = c19240.m27400();
            c11771.mo29404(c19240);
            int iM27401 = c19240.m27400() - iM27400;
            int i = C18097.f57864;
            SecretKey secretKey = this.f70138;
            C21356 c21356 = c18097.f57865;
            String algorithm = secretKey.getAlgorithm();
            c21356.getClass();
            InterfaceC8618 interfaceC8618M47886 = C21356.m47886(algorithm);
            interfaceC8618M47886.init(secretKey.getEncoded());
            interfaceC8618M47886.update(c19240.m27387(), iM27400, iM27401);
            System.arraycopy(interfaceC8618M47886.mo3570(), 0, c19240.m27387(), iM27400 + 48, 16);
        } catch (C7206 e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // l.AbstractC10068
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC8657 mo25478() {
        return (C1186) this.f70137.mo25478();
    }

    @Override // l.C11771
    public final String toString() {
        return "Signed(" + this.f70137.toString() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // l.C11771
    /* JADX INFO: renamed from: ᩹ */
    public final C11771 mo29408() {
        return this.f70137.mo29408();
    }
}
