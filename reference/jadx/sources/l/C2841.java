package l;

import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۖ᩺ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: X66Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C2841 implements InterfaceC21414 {
    @Override // l.InterfaceC21414
    /* JADX INFO: renamed from: ۙ */
    public final void mo3144(C15313 c15313) {
        String strM34493 = ((C14277) c15313.m36673()).m34493();
        JSONObject jSONObject = (JSONObject) ((C14277) c15313.m36673()).m34475();
        C14277 c14277 = new C14277();
        try {
            c14277.m34465(jSONObject.get(strM34493));
        } catch (Throwable unused) {
        }
        c15313.m36672(c14277);
    }
}
