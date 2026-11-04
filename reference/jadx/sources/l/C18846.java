package l;

import android.content.Context;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩳۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public final class C18846 extends C7833 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f61220;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC19020 f61221;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f61222;

    public C18846(Context context, String str, InterfaceC19020 interfaceC19020) {
        new WeakReference(context);
        this.f61222 = "";
        this.f61220 = str;
        this.f61221 = interfaceC19020;
    }

    @Override // l.InterfaceC19020
    /* JADX INFO: renamed from: ۙ */
    public final void mo2048(JSONObject jSONObject) {
        C3687 c3687M11981 = C3687.m11981();
        String strM23910 = C8947.m23910(new StringBuilder(), this.f61222, "_H5");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iOptInt = jSONObject.optInt("ret", -6);
        c3687M11981.getClass();
        C3687.m11980(strM23910, jElapsedRealtime, 0L, 0L, iOptInt, this.f61220);
        InterfaceC19020 interfaceC19020 = this.f61221;
        if (interfaceC19020 != null) {
            interfaceC19020.mo2048(jSONObject);
            this.f61221 = null;
        }
    }

    @Override // l.InterfaceC19020
    /* JADX INFO: renamed from: ۙ */
    public final void mo2047(C1121 c1121) {
        String str = c1121.f4181;
        String strM34972 = this.f61220;
        if (str != null) {
            strM34972 = C14483.m34972(str, strM34972);
        }
        C3687 c3687M11981 = C3687.m11981();
        String strM23910 = C8947.m23910(new StringBuilder(), this.f61222, "_H5");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = c1121.f4180;
        c3687M11981.getClass();
        C3687.m11980(strM23910, jElapsedRealtime, 0L, 0L, i, strM34972);
        InterfaceC19020 interfaceC19020 = this.f61221;
        if (interfaceC19020 != null) {
            interfaceC19020.mo2047(c1121);
            this.f61221 = null;
        }
    }

    @Override // l.InterfaceC19020
    /* JADX INFO: renamed from: ۙ */
    public final void mo2046() {
        InterfaceC19020 interfaceC19020 = this.f61221;
        if (interfaceC19020 != null) {
            interfaceC19020.mo2046();
            this.f61221 = null;
        }
    }
}
