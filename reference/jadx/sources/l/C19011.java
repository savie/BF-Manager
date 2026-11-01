package l;

import android.content.Context;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩴ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public final class C19011 extends C21812 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f61520;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC18284 f61521;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f61522;

    public C19011(Context context, String str, InterfaceC18284 interfaceC18284) {
        new WeakReference(context);
        this.f61522 = "";
        this.f61520 = str;
        this.f61521 = interfaceC18284;
    }

    @Override // l.InterfaceC18284
    /* JADX INFO: renamed from: ۙ */
    public final void mo16215(JSONObject jSONObject) {
        C2636 c2636M8126 = C2636.m8126();
        String strM50267 = C22697.m50267(new StringBuilder(), this.f61522, "_H5");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iOptInt = jSONObject.optInt("ret", -6);
        c2636M8126.getClass();
        C2636.m8125(strM50267, jElapsedRealtime, 0L, 0L, iOptInt, this.f61520);
        InterfaceC18284 interfaceC18284 = this.f61521;
        if (interfaceC18284 != null) {
            interfaceC18284.mo16215(jSONObject);
            this.f61521 = null;
        }
    }

    @Override // l.InterfaceC18284
    /* JADX INFO: renamed from: ۙ */
    public final void mo16214(C8407 c8407) {
        String str = c8407.f29155;
        String strM37076 = this.f61520;
        if (str != null) {
            strM37076 = C15489.m37076(str, strM37076);
        }
        C2636 c2636M8126 = C2636.m8126();
        String strM50267 = C22697.m50267(new StringBuilder(), this.f61522, "_H5");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = c8407.f29154;
        c2636M8126.getClass();
        C2636.m8125(strM50267, jElapsedRealtime, 0L, 0L, i, strM37076);
        InterfaceC18284 interfaceC18284 = this.f61521;
        if (interfaceC18284 != null) {
            interfaceC18284.mo16214(c8407);
            this.f61521 = null;
        }
    }

    @Override // l.InterfaceC18284
    /* JADX INFO: renamed from: ۙ */
    public final void mo16213() {
        InterfaceC18284 interfaceC18284 = this.f61521;
        if (interfaceC18284 != null) {
            interfaceC18284.mo16213();
            this.f61521 = null;
        }
    }
}
