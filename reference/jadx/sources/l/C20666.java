package l;

/* JADX INFO: renamed from: l.᩵ܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1RO */
/* JADX INFO: loaded from: classes5.dex */
public final class C20666 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47291(InterfaceC19920[] interfaceC19920Arr) throws C4258 {
        for (int i = 0; i < interfaceC19920Arr.length - 1; i++) {
            if (!interfaceC19920Arr[i].mo6948()) {
                throw new C4258("Unsupported XZ filter chain");
            }
        }
        if (!interfaceC19920Arr[interfaceC19920Arr.length - 1].mo6947()) {
            throw new C4258("Unsupported XZ filter chain");
        }
        int i2 = 0;
        for (InterfaceC19920 interfaceC19920 : interfaceC19920Arr) {
            if (interfaceC19920.mo6949()) {
                i2++;
            }
        }
        if (i2 > 3) {
            throw new C4258("Unsupported XZ filter chain");
        }
    }
}
