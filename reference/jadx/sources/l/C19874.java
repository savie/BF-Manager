package l;

import android.app.Activity;
import android.view.View;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.᩶ۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7PP */
/* JADX INFO: loaded from: classes5.dex */
public final class C19874 extends C13607 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C15641 f63721 = new C15641();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f63722;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final JSONObject f63723;

    @Override // l.C13607
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo33244() {
        return false;
    }

    public C19874(JSONObject jSONObject) {
        super(27);
        this.f63723 = jSONObject;
    }

    @Override // l.C13607
    /* JADX INFO: renamed from: ۖ */
    public final JSONObject mo33245() {
        return this.f63723;
    }

    @Override // l.C13607
    /* JADX INFO: renamed from: ۙ */
    public final void mo33247(View view, InterfaceC4433 interfaceC4433) {
        C6111 c6111Mo11315;
        C14690 c14690M35218;
        if (this.f63722 || (c6111Mo11315 = interfaceC4433.mo11315()) == null) {
            return;
        }
        JSONObject jSONObject = this.f63723;
        String string = jSONObject.getString(am.av);
        String string2 = jSONObject.getString("b");
        boolean z = jSONObject.getBoolean(am.aF);
        int i = jSONObject.getInt("d");
        int i2 = jSONObject.getInt("e");
        boolean z2 = jSONObject.getBoolean("f", true);
        if (string.isEmpty()) {
            return;
        }
        if (!z2) {
            string = C17874.m41459(string);
        }
        try {
            if (z) {
                c14690M35218 = C14690.m35218(8, string);
            } else {
                c14690M35218 = C14690.m35218(74, string);
            }
            C14690 c14690 = c14690M35218;
            if (z2) {
                C9751.m24733(c14690, string2);
            }
            int[] iArrM16971 = c6111Mo11315.m16971();
            if (i == 0 && iArrM16971[0] == iArrM16971[1]) {
                C15829.m37611(R.string.MT_Protector);
                return;
            }
            boolean z3 = i == 2;
            Activity activityM22527 = C8703.m22527(c6111Mo11315.getContext());
            C13638.requireNonNull(activityM22527);
            AbstractActivityC12483 abstractActivityC12483 = (AbstractActivityC12483) activityM22527;
            InterfaceC2916 interfaceC2916M17000 = c6111Mo11315.m17000();
            new C9996(this, new C9268(c6111Mo11315, abstractActivityC12483, R.string.MT_Protector, new C19168()), interfaceC2916M17000, interfaceC2916M17000.mo2395(), c14690, i, iArrM16971, string2, z2, i2, z3, C7412.toPath(c6111Mo11315.getContext().getCacheDir()).resolve("replace-output"), c6111Mo11315, abstractActivityC12483).m10243();
        } catch (Exception e) {
            C15829.m37613((CharSequence) e.toString());
        }
    }
}
