package l;

import android.os.SystemClock;
import com.tencent.connect.auth.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.۫ۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C12879 extends C7833 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f41213;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC19020 f41214;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ a f41215;

    public C12879(a aVar, String str, InterfaceC19020 interfaceC19020) {
        this.f41215 = aVar;
        this.f41213 = str;
        this.f41214 = interfaceC19020;
    }

    @Override // l.InterfaceC19020
    /* JADX INFO: renamed from: ۙ */
    public final void mo2048(JSONObject jSONObject) {
        C3687 c3687M11981 = C3687.m11981();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iOptInt = jSONObject.optInt("ret", -6);
        c3687M11981.getClass();
        C3687.m11980("action_login_H5", jElapsedRealtime, 0L, 0L, iOptInt, this.f41213);
        InterfaceC19020 interfaceC19020 = this.f41214;
        if (interfaceC19020 != null) {
            interfaceC19020.mo2048(jSONObject);
            this.f41214 = null;
        }
    }

    @Override // l.InterfaceC19020
    /* JADX INFO: renamed from: ۙ */
    public final void mo2047(C1121 c1121) {
        String str = c1121.f4181;
        String strM34972 = this.f41213;
        if (str != null) {
            strM34972 = C14483.m34972(str, strM34972);
        }
        C3687 c3687M11981 = C3687.m11981();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = c1121.f4180;
        c3687M11981.getClass();
        C3687.m11980("action_login_H5", jElapsedRealtime, 0L, 0L, i, strM34972);
        a.m893(this.f41215, strM34972);
        InterfaceC19020 interfaceC19020 = this.f41214;
        if (interfaceC19020 != null) {
            interfaceC19020.mo2047(c1121);
            this.f41214 = null;
        }
    }

    @Override // l.InterfaceC19020
    /* JADX INFO: renamed from: ۙ */
    public final void mo2046() {
        InterfaceC19020 interfaceC19020 = this.f41214;
        if (interfaceC19020 != null) {
            interfaceC19020.mo2046();
            this.f41214 = null;
        }
    }
}
