package l;

import org.json.JSONArray;

/* JADX INFO: renamed from: l.ܰ᩺ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: X66Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C14132 implements InterfaceC21414 {
    @Override // l.InterfaceC21414
    /* JADX INFO: renamed from: ۙ */
    public final void mo3144(C15313 c15313) {
        int iM34486 = ((C14277) c15313.m36673()).m34486();
        JSONArray jSONArray = (JSONArray) ((C14277) c15313.m36673()).m34475();
        C14277 c14277 = new C14277();
        try {
            c14277.m34466(jSONArray.getString(iM34486));
        } catch (Throwable unused) {
        }
        c15313.m36672(c14277);
    }
}
