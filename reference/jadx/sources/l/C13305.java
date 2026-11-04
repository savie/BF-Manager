package l;

import bin.mt.plus.R;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۫ᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z11M */
/* JADX INFO: loaded from: classes4.dex */
public final class C13305 extends AbstractDialogInterfaceOnClickListenerC8552 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5848 f42468;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13305(C5848 c5848, AbstractActivityC17204 abstractActivityC17204) {
        super(abstractActivityC17204, R.string.MT_Protector);
        this.f42468 = c5848;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܶ */
    public final void mo1877() {
        String strTrim = m22914().trim();
        if (strTrim.isEmpty()) {
            strTrim = "/sdcard/MT2";
        }
        String strM18128 = C6382.m18128(strTrim);
        String strMo4294 = C6382.m18134().mo4294();
        if (!C6382.m18139(strM18128)) {
            m22925("Permission denied");
            return;
        }
        String strMo4295 = C6382.m18134().mo4294();
        int i = ViewOnClickListenerC7793.f25871;
        String string = ApplicationC17729.f58258.getString("extract_apk_path", null);
        if (string != null) {
            if (string.startsWith(strMo4294 + "/") || string.equals(strMo4294)) {
                StringBuilder sbM27333 = C10732.m27333(strMo4295);
                sbM27333.append(string.substring(strMo4294.length()));
                ApplicationC17729.f58258.edit().putString("extract_apk_path", sbM27333.toString()).apply();
            }
        }
        String string2 = ApplicationC17729.f58258.getString("inject_log_path", null);
        if (string2 != null) {
            String strMo4296 = C6382.f21566.mo4294();
            if (string2.startsWith("[SDCARD]/") || string2.equals("[SDCARD]")) {
                string2 = ExternalValue$$ExternalSyntheticOutline0.m(8, string2, C10732.m27333(strMo4296));
            }
            if (string2.startsWith(strMo4294 + "/") || string2.equals(strMo4294)) {
                StringBuilder sbM27334 = C10732.m27333(strMo4295);
                sbM27334.append(string2.substring(strMo4294.length()));
                String string3 = sbM27334.toString();
                if (string3.startsWith(strMo4296)) {
                    string3 = "[SDCARD]" + string3.substring(strMo4296.length());
                }
                ApplicationC17729.f58258.edit().putString("inject_log_path", string3).apply();
            }
        }
        C5848 c5848 = this.f42468;
        c5848.m29658().edit().putString(c5848.m12557(), strM18128).apply();
        m22951();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC8552
    /* JADX INFO: renamed from: ܽ */
    public final void mo22946() {
        C5848 c5848 = this.f42468;
        c5848.m29658().edit().remove(c5848.m12557()).apply();
        C6382.m18135("/sdcard/MT2");
    }
}
