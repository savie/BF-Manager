package l;

/* JADX INFO: renamed from: l.᩹ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAOM */
/* JADX INFO: loaded from: classes.dex */
public final class C23274 implements InterfaceC5877 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18099 f75425;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f75426;

    @Override // l.InterfaceC5877
    public final void afterFinish() {
    }

    @Override // l.InterfaceC5877
    public final void beforeStart() {
    }

    @Override // l.InterfaceC5877
    public final boolean onError(Exception exc) {
        return false;
    }

    @Override // l.InterfaceC5877
    public final void onFinish() {
    }

    @Override // l.InterfaceC5877
    public final void onStart() {
    }

    public C23274(C18099 c18099, boolean z) {
        this.f75425 = c18099;
        this.f75426 = z;
    }

    @Override // l.InterfaceC5877
    /* JADX INFO: renamed from: ۙ */
    public final String mo17103(String str) throws Throwable {
        String strM20868;
        String strM20869;
        C18099 c18099 = this.f75425;
        if (c18099 == null) {
            return "???";
        }
        c18099.m42218();
        String str2 = null;
        for (C7658 c7658 : c18099.m42216()) {
            if (this.f75426) {
                strM20868 = c7658.m20869();
                strM20869 = c7658.m20868();
            } else {
                strM20868 = c7658.m20868();
                strM20869 = c7658.m20869();
            }
            if (strM20868.equalsIgnoreCase(str)) {
                if (str2 == null) {
                    str2 = strM20869;
                }
                if (strM20868.equals(str)) {
                    return strM20869;
                }
            }
        }
        return str2 != null ? str2 : "???";
    }

    @Override // l.InterfaceC5877
    public final String getId() {
        boolean z = this.f75426;
        C18099 c18099 = this.f75425;
        if (c18099 == null) {
            return ":null:" + z;
        }
        return c18099.m42221() + ":" + z;
    }
}
