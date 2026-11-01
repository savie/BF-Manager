package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z11M */
/* JADX INFO: loaded from: classes.dex */
public final class C23108 extends AbstractDialogInterfaceOnClickListenerC17341 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15347 f75067;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23108(C15347 c15347, AbstractActivityC12483 abstractActivityC12483) {
        super(abstractActivityC12483, R.string.MT_Protector);
        this.f75067 = c15347;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1069() {
        String strTrim = m40352().trim();
        if (strTrim.isEmpty()) {
            strTrim = "/sdcard/MT2";
        }
        String strM29688 = C11904.m29688(strTrim);
        String strMo33986 = C11904.m29695().mo33986();
        if (!C11904.m29687(strM29688)) {
            m40347("Permission denied");
            return;
        }
        String strMo33987 = C11904.m29695().mo33986();
        int i = ViewOnClickListenerC4514.f16038;
        String string = ApplicationC0716.f2992.getString("extract_apk_path", null);
        if (string != null) {
            if (string.startsWith(strMo33986 + "/") || string.equals(strMo33986)) {
                StringBuilder sbM23356 = C9023.m23356(strMo33987);
                sbM23356.append(string.substring(strMo33986.length()));
                ApplicationC0716.f2992.edit().putString("extract_apk_path", sbM23356.toString()).apply();
            }
        }
        String string2 = ApplicationC0716.f2992.getString("inject_log_path", null);
        if (string2 != null) {
            String strMo33988 = C11904.f39934.mo33986();
            if (string2.startsWith("[SDCARD]/") || string2.equals("[SDCARD]")) {
                string2 = C0242.m1616(8, string2, C9023.m23356(strMo33988));
            }
            if (string2.startsWith(strMo33986 + "/") || string2.equals(strMo33986)) {
                StringBuilder sbM23357 = C9023.m23356(strMo33987);
                sbM23357.append(string2.substring(strMo33986.length()));
                String string3 = sbM23357.toString();
                if (string3.startsWith(strMo33988)) {
                    string3 = "[SDCARD]" + string3.substring(strMo33988.length());
                }
                ApplicationC0716.f2992.edit().putString("inject_log_path", string3).apply();
            }
        }
        C15347 c15347 = this.f75067;
        c15347.m42292().edit().putString(c15347.m13157(), strM29688).apply();
        m40364();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC17341
    /* JADX INFO: renamed from: ᩳ */
    public final void mo21386() {
        C15347 c15347 = this.f75067;
        c15347.m42292().edit().remove(c15347.m13157()).apply();
        C11904.m29696("/sdcard/MT2");
    }
}
