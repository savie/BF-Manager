package l;

/* JADX INFO: renamed from: l.֫ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAOM */
/* JADX INFO: loaded from: classes2.dex */
public final class C1982 implements InterfaceC17526 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0176 f7432;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f7433;

    @Override // l.InterfaceC17526
    public final void afterFinish() {
    }

    @Override // l.InterfaceC17526
    public final void beforeStart() {
    }

    @Override // l.InterfaceC17526
    public final boolean onError(Exception exc) {
        return false;
    }

    @Override // l.InterfaceC17526
    public final void onFinish() {
    }

    @Override // l.InterfaceC17526
    public final void onStart() {
    }

    public C1982(C0176 c0176, boolean z) {
        this.f7432 = c0176;
        this.f7433 = z;
    }

    @Override // l.InterfaceC17526
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo6394(String str) throws Throwable {
        String strM30258;
        String strM30259;
        C0176 c0176 = this.f7432;
        if (c0176 == null) {
            return "???";
        }
        c0176.m1377();
        String str2 = null;
        for (C12172 c12172 : c0176.m1378()) {
            if (this.f7433) {
                strM30258 = c12172.m30259();
                strM30259 = c12172.m30258();
            } else {
                strM30258 = c12172.m30258();
                strM30259 = c12172.m30259();
            }
            if (strM30258.equalsIgnoreCase(str)) {
                if (str2 == null) {
                    str2 = strM30259;
                }
                if (strM30258.equals(str)) {
                    return strM30259;
                }
            }
        }
        return str2 != null ? str2 : "???";
    }

    @Override // l.InterfaceC17526
    public final String getId() {
        boolean z = this.f7433;
        C0176 c0176 = this.f7432;
        if (c0176 == null) {
            return ":null:" + z;
        }
        return c0176.m1373() + ":" + z;
    }
}
