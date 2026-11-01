package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩷۫᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 41VB */
/* JADX INFO: loaded from: classes5.dex */
public final class C20883 extends AbstractC21803 implements InterfaceC23145, InterfaceC21733 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18060 f67822;

    public C20883(C18060 c18060) {
        super(2);
        this.f67822 = c18060;
    }

    @Override // l.AbstractC21803, l.InterfaceC23145
    /* JADX INFO: renamed from: ۙ */
    public final void mo4603(C12417 c12417) {
        String str = "L" + c12417.m2211() + l.b;
        String strM8699 = C2892.m8699(c12417);
        C21588 c21588 = new C21588(str, strM8699 == null ? str : C16523.m38890("L", strM8699, l.b));
        this.f67822.m42051(c21588);
        c12417.m2202(true, true, true, false, new C7477(new C10300(c21588)));
    }
}
