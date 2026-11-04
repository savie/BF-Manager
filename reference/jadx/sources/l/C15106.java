package l;

/* JADX INFO: renamed from: l.ܳۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M96R */
/* JADX INFO: loaded from: classes5.dex */
public final class C15106 extends C9407 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EnumC19104 f49298;

    public C15106(int i, EnumC19104 enumC19104) {
        super(i);
        this.f49298 = enumC19104;
        if (enumC19104 != EnumC19104.SUSPEND) {
            if (i < 1) {
                throw new IllegalArgumentException(C14442.m34864(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + C16735.m39514(C9407.class).m33198() + " instead").toString());
        }
    }

    @Override // l.C9407
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo24782() {
        return this.f49298 == EnumC19104.DROP_OLDEST;
    }

    @Override // l.C9407, l.InterfaceC5412
    /* JADX INFO: renamed from: ۙ */
    public final Object mo16138(C14115 c14115) {
        if (this.f49298 != EnumC19104.DROP_LATEST) {
            return m24783(c14115);
        }
        Object objMo16138 = super.mo16138(c14115);
        return (!(objMo16138 instanceof C4666) || (objMo16138 instanceof C13882)) ? objMo16138 : C11471.f36082;
    }
}
