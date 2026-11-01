package l;

import android.text.TextUtils;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 179R */
/* JADX INFO: loaded from: classes2.dex */
public final class C0403 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m2137() {
        int i = ApplicationC0716.f2992.getInt("amsl", 5);
        if (i < 1 || i > 100) {
            return 5;
        }
        return i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C11392 m2140() {
        String string = ApplicationC0716.f2992.getString("amsk", "");
        InterfaceC6025 interfaceC6025 = ApplicationC0716.f2992;
        EnumC7501 enumC7501 = EnumC7501.V1_V2_V3;
        int i = interfaceC6025.getInt("amss", enumC7501.ordinal());
        EnumC7501[] enumC7501ArrValues = EnumC7501.values();
        if (i >= 0 && i < enumC7501ArrValues.length) {
            enumC7501 = enumC7501ArrValues[i];
        }
        return m2138(new C11392(string, enumC7501, ApplicationC0716.f2992.getString("amv1sf", null), ApplicationC0716.f2992.getBoolean("amkv1sd", false)));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m2141(C11392 c11392) {
        C11392 c11392M2138 = m2138(c11392);
        InterfaceC17314 interfaceC17314PutBoolean = ApplicationC0716.f2992.edit().putString("amsk", c11392M2138.m28501()).mo4065(c11392M2138.m28499().ordinal(), "amss").putBoolean("amkv1sd", c11392M2138.m28500());
        if (c11392M2138.m28502() == null) {
            interfaceC17314PutBoolean.remove("amv1sf");
        } else {
            interfaceC17314PutBoolean.putString("amv1sf", c11392M2138.m28502());
        }
        interfaceC17314PutBoolean.apply();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11392 m2138(C11392 c11392) {
        String strM28501 = c11392.m28501();
        if (TextUtils.isEmpty(strM28501)) {
            strM28501 = "";
        } else {
            C20659.m46512().getClass();
            if (C16737.m39288(R.string.MT_Protector).equals(strM28501)) {
                strM28501 = "";
            }
        }
        return new C11392(strM28501, c11392.m28499(), TextUtils.isEmpty(c11392.m28502()) ? null : c11392.m28502(), c11392.m28500());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2139(String str) {
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
            ApplicationC0716.f2992.edit().mo4065(numValueOf.intValue(), "amsl").apply();
        }
    }
}
