package l;

import org.json.JSONArray;

/* JADX INFO: renamed from: l.ᩳۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X66Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C19030 implements InterfaceC22760 {
    @Override // l.InterfaceC22760
    /* JADX INFO: renamed from: ۙ */
    public final void mo1200(C19929 c19929) {
        int iM34627 = ((C14270) c19929.m45858()).m34627();
        JSONArray jSONArray = (JSONArray) ((C14270) c19929.m45858()).m34634();
        C14270 c14270 = new C14270();
        try {
            c14270.m34618(jSONArray.getInt(iM34627));
        } catch (Throwable unused) {
        }
        c19929.m45857(c14270);
    }
}
