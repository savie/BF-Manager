package l;

import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۖۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X66Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C2622 implements InterfaceC22760 {
    @Override // l.InterfaceC22760
    /* JADX INFO: renamed from: ۙ */
    public final void mo1200(C19929 c19929) {
        String strM34647 = ((C14270) c19929.m45858()).m34647();
        JSONObject jSONObject = (JSONObject) ((C14270) c19929.m45858()).m34634();
        C14270 c14270 = new C14270();
        try {
            c14270.m34618(jSONObject.getInt(strM34647));
        } catch (Throwable unused) {
        }
        c19929.m45857(c14270);
    }
}
