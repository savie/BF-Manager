package l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6YU */
/* JADX INFO: loaded from: classes5.dex */
public class C18394 extends AbstractC11813 {

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC14664 f59911;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42898(C18394 c18394, String str) {
        if (str == null || "ssvc".equals(str)) {
            c18394.mo7306();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ܰܳۧ] */
    public C18394(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59911 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: l.ܰܳۧ
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                C18394.m42898(this.f47952, str);
            }
        };
        m12579();
        m12575((InterfaceC24044) new C13809(5, this));
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۢ */
    public final void mo12582() {
        super.mo12582();
        m29658().registerOnSharedPreferenceChangeListener(this.f59911);
    }

    @Override // l.C3906
    /* JADX INFO: renamed from: ۡ */
    public final void mo12581() {
        m29658().unregisterOnSharedPreferenceChangeListener(this.f59911);
        super.mo12581();
    }

    @Override // l.AbstractC11813
    /* JADX INFO: renamed from: ۙ */
    public final void mo2388(AbstractActivityC17204 abstractActivityC17204) {
        String[] strArrM54845 = C24560.m54845(m12560());
        int iM14043 = C4422.m14043();
        boolean[] zArr = new boolean[3];
        for (int i = 0; i < 3; i++) {
            boolean z = true;
            if (((1 << i) & iM14043) == 0) {
                z = false;
            }
            zArr[i] = z;
        }
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8024(m12578());
        c2361BuildDialog.m8015(strArrM54845, zArr, new DialogInterfaceOnMultiChoiceClickListenerC21378(zArr, 0));
        c2361BuildDialog.m8017(R.layout.MT_Protector);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterfaceOnClickListenerC15621(1, zArr));
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361BuildDialog.m8016().m22423(R.id.MT_Protector).setMinimumHeight(0);
    }
}
