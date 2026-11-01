package l;

import android.os.SystemClock;
import com.tencent.connect.auth.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۧ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C10857 extends C21812 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f36928;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC18284 f36929;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ a f36930;

    public C10857(a aVar, String str, InterfaceC18284 interfaceC18284) {
        this.f36930 = aVar;
        this.f36928 = str;
        this.f36929 = interfaceC18284;
    }

    @Override // l.InterfaceC18284
    /* JADX INFO: renamed from: ۙ */
    public final void mo16215(JSONObject jSONObject) {
        C2636 c2636M8126 = C2636.m8126();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iOptInt = jSONObject.optInt("ret", -6);
        c2636M8126.getClass();
        C2636.m8125("action_login_H5", jElapsedRealtime, 0L, 0L, iOptInt, this.f36928);
        InterfaceC18284 interfaceC18284 = this.f36929;
        if (interfaceC18284 != null) {
            interfaceC18284.mo16215(jSONObject);
            this.f36929 = null;
        }
    }

    @Override // l.InterfaceC18284
    /* JADX INFO: renamed from: ۙ */
    public final void mo16214(C8407 c8407) {
        String str = c8407.f29155;
        String strM37076 = this.f36928;
        if (str != null) {
            strM37076 = C15489.m37076(str, strM37076);
        }
        C2636 c2636M8126 = C2636.m8126();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = c8407.f29154;
        c2636M8126.getClass();
        C2636.m8125("action_login_H5", jElapsedRealtime, 0L, 0L, i, strM37076);
        a.m901(this.f36930, strM37076);
        InterfaceC18284 interfaceC18284 = this.f36929;
        if (interfaceC18284 != null) {
            interfaceC18284.mo16214(c8407);
            this.f36929 = null;
        }
    }

    @Override // l.InterfaceC18284
    /* JADX INFO: renamed from: ۙ */
    public final void mo16213() {
        InterfaceC18284 interfaceC18284 = this.f36929;
        if (interfaceC18284 != null) {
            interfaceC18284.mo16213();
            this.f36929 = null;
        }
    }
}
