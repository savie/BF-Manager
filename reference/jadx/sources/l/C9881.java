package l;

import android.text.TextUtils;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 179R */
/* JADX INFO: loaded from: classes3.dex */
public final class C9881 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m25689() {
        int i = ApplicationC17729.f58258.getInt("amsl", 5);
        if (i < 1 || i > 100) {
            return 5;
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10737 m25692() {
        String string = ApplicationC17729.f58258.getString("amsk", "");
        InterfaceC9801 interfaceC9801 = ApplicationC17729.f58258;
        EnumC6670 enumC6670 = EnumC6670.V1_V2_V3;
        int i = interfaceC9801.getInt("amss", enumC6670.ordinal());
        EnumC6670[] enumC6670ArrValues = EnumC6670.values();
        if (i >= 0 && i < enumC6670ArrValues.length) {
            enumC6670 = enumC6670ArrValues[i];
        }
        return m25690(new C10737(string, enumC6670, ApplicationC17729.f58258.getString("amv1sf", null), ApplicationC17729.f58258.getBoolean("amkv1sd", false)));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m25693(C10737 c10737) {
        C10737 c10737M25690 = m25690(c10737);
        InterfaceC18752 interfaceC18752PutBoolean = ApplicationC17729.f58258.edit().putString("amsk", c10737M25690.m27351()).mo3486(c10737M25690.m27349().ordinal(), "amss").putBoolean("amkv1sd", c10737M25690.m27348());
        if (c10737M25690.m27350() == null) {
            interfaceC18752PutBoolean.remove("amv1sf");
        } else {
            interfaceC18752PutBoolean.putString("amv1sf", c10737M25690.m27350());
        }
        interfaceC18752PutBoolean.apply();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10737 m25690(C10737 c10737) {
        String strM27351 = c10737.m27351();
        if (TextUtils.isEmpty(strM27351)) {
            strM27351 = "";
        } else {
            C3620.m11750().getClass();
            if (C21576.m49088(R.string.MT_Protector).equals(strM27351)) {
                strM27351 = "";
            }
        }
        return new C10737(strM27351, c10737.m27349(), TextUtils.isEmpty(c10737.m27350()) ? null : c10737.m27350(), c10737.m27348());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m25691(String str) {
        Integer numValueOf = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                int i = Integer.parseInt(str.trim());
                boolean z = true;
                if (i < 1 || i > 100) {
                    z = false;
                }
                if (z) {
                    numValueOf = Integer.valueOf(i);
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (numValueOf != null) {
            ApplicationC17729.f58258.edit().mo3486(numValueOf.intValue(), "amsl").apply();
        }
    }
}
