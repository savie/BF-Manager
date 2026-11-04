package l;

import android.app.Activity;
import android.view.View;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ܶܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7PP */
/* JADX INFO: loaded from: classes5.dex */
public final class C16163 extends C19147 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C17655 f52468 = new C17655();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f52469;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final JSONObject f52470;

    @Override // l.C19147
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo11457() {
        return false;
    }

    public C16163(JSONObject jSONObject) {
        super(27);
        this.f52470 = jSONObject;
    }

    @Override // l.C19147
    /* JADX INFO: renamed from: ᩸ */
    public final JSONObject mo35301() {
        return this.f52470;
    }

    @Override // l.C19147
    /* JADX INFO: renamed from: ۙ */
    public final void mo11455(View view, InterfaceC7960 interfaceC7960) {
        C24132 c24132Mo10928;
        C18415 c18415M42924;
        if (this.f52469 || (c24132Mo10928 = interfaceC7960.mo10928()) == null) {
            return;
        }
        JSONObject jSONObject = this.f52470;
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
            string = C17370.m40798(string);
        }
        try {
            if (z) {
                c18415M42924 = C18415.m42924(8, string);
            } else {
                c18415M42924 = C18415.m42924(74, string);
            }
            C18415 c18415 = c18415M42924;
            if (z2) {
                C7974.m21762(c18415, string2);
            }
            int[] iArrM53971 = c24132Mo10928.m53971();
            if (i == 0 && iArrM53971[0] == iArrM53971[1]) {
                C22673.m51152(R.string.MT_Protector);
                return;
            }
            boolean z3 = i == 2;
            Activity activityM10534 = C3200.m10534(c24132Mo10928.getContext());
            C17359.requireNonNull(activityM10534);
            AbstractActivityC17204 abstractActivityC17204 = (AbstractActivityC17204) activityM10534;
            InterfaceC19106 interfaceC19106M54021 = c24132Mo10928.m54021();
            new C25115(this, new C7919(c24132Mo10928, abstractActivityC17204, R.string.MT_Protector, new C1994()), interfaceC19106M54021, interfaceC19106M54021.mo15344(), c18415, i, iArrM53971, string2, z2, i2, z3, C2503.toPath(c24132Mo10928.getContext().getCacheDir()).resolve("replace-output"), c24132Mo10928, abstractActivityC17204).m8197();
        } catch (Exception e) {
            C22673.m51154((CharSequence) e.toString());
        }
    }
}
