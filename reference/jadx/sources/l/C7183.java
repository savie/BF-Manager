package l;

/* JADX INFO: renamed from: l.۟ۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9HO */
/* JADX INFO: loaded from: classes4.dex */
public final class C7183 extends C20589 {
    @Override // l.C20589, l.AbstractC16356
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo19116(C0938 c0938) throws C0127 {
        if (c0938.m3697().toString().contains("not_defined_in_RFC4178@please_ignore")) {
            return;
        }
        int iM3699 = c0938.m3699();
        if (iM3699 == 0) {
            m46451(c0938.m3697());
            return;
        }
        if (iM3699 != 1) {
            if (iM3699 == 2) {
                m46452(c0938.m3697());
            } else {
                if (iM3699 == 3 || iM3699 == 4) {
                    return;
                }
                throw new C0127("Unknown Object Tag " + c0938.m3699() + " encountered.");
            }
        }
    }
}
