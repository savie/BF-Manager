package l;

import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.۟ۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7AS */
/* JADX INFO: loaded from: classes3.dex */
public final class C7800 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3063 f25908;

    public C7800(C12802 c12802, C3063 c3063, C24209 c24209) {
        this.f25908 = c3063;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18683 m21256(C3767 c3767) {
        if (!EnumC12716.GET.equals(c3767.m12226())) {
            return m21252(c3767, EnumC21667.METHOD_NOT_ALLOWED, R.string.MT_Protector, new Object[0]);
        }
        return C12802.m31750(this.f25908.m9990());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18683 m21253(C3767 c3767) {
        String strM53541;
        if (!EnumC12716.POST.equals(c3767.m12226())) {
            return m21252(c3767, EnumC21667.METHOD_NOT_ALLOWED, R.string.MT_Protector, new Object[0]);
        }
        C3063 c3063 = this.f25908;
        C17233 c17233M9995 = c3063.m9995(c3767);
        if (c17233M9995 != null) {
            return m21252(c3767, EnumC21667.UNAUTHORIZED, c17233M9995.f56160, c17233M9995.f56157);
        }
        if (!C23991.m53548(c3767) && (strM53541 = C23991.m53541(c3767, "content-length")) != null) {
            String strTrim = strM53541.trim();
            if (!strTrim.isEmpty()) {
                for (int i = 0; i < strTrim.length(); i++) {
                    char cCharAt = strTrim.charAt(i);
                    if (cCharAt >= '0' && cCharAt <= '9') {
                    }
                }
                try {
                    if (Long.parseLong(strTrim) <= 8192) {
                        try {
                            C17233 c17233M9984 = c3063.m9984(c3767, C23991.m53549(c3767));
                            Object[] objArr = c17233M9984.f56157;
                            int i2 = c17233M9984.f56160;
                            String str = c17233M9984.f56159;
                            if (!c17233M9984.f56158) {
                                if (str.isEmpty()) {
                                    return C12802.m31751(EnumC21667.UNAUTHORIZED, C21576.m49059(i2, objArr));
                                }
                                return AbstractC1530.m5422(EnumC21667.UNAUTHORIZED, "application/json", new JSONObject().add(d.O, C21576.m49059(i2, objArr)).add("code", str).toString());
                            }
                            return C12802.m31750(Collections.singletonMap("deviceId", c17233M9984.f56156));
                        } catch (IOException | C0784 unused) {
                            c3063.m9989(c3767);
                            return m21252(c3767, EnumC21667.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
            }
        }
        c3063.m9989(c3767);
        return m21252(c3767, EnumC21667.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C18683 m21252(C3767 c3767, EnumC21667 enumC21667, int i, Object... objArr) {
        C18683 c18683M31751 = C12802.m31751(enumC21667, C21576.m49059(i, objArr));
        if (C23991.m53544(c3767)) {
            c18683M31751.m43438();
        }
        return c18683M31751;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C18683 m21258(C3767 c3767, C19471 c19471) {
        if (!EnumC12716.GET.equals(c3767.m12226())) {
            return C12802.m31751(EnumC21667.METHOD_NOT_ALLOWED, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
        return C12802.m31750(this.f25908.m9980(c19471));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18683 m21255(C3767 c3767, C19471 c19471) {
        if (!EnumC12716.DELETE.equals(c3767.m12226())) {
            return C12802.m31751(EnumC21667.METHOD_NOT_ALLOWED, C21576.m49059(R.string.MT_Protector, new Object[0]));
        }
        String strM53547 = C23991.m53547(c3767, "deviceId");
        if (strM53547 == null || strM53547.isEmpty()) {
            return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, "deviceId"));
        }
        return C12802.m31750(Collections.singletonMap("deleted", Boolean.valueOf(this.f25908.m9993(c19471, strM53547))));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18683 m21257(C3767 c3767, C19471 c19471) {
        EnumC21667 enumC21667;
        String strM49059;
        if (!EnumC12716.POST.equals(c3767.m12226())) {
            enumC21667 = EnumC21667.METHOD_NOT_ALLOWED;
            strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
        } else {
            try {
                LinkedHashMap linkedHashMapM9981 = this.f25908.m9981(c19471, C23991.m53549(c3767));
                if (linkedHashMapM9981 == null) {
                    enumC21667 = EnumC21667.BAD_REQUEST;
                    strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
                } else {
                    return C12802.m31750(linkedHashMapM9981);
                }
            } catch (IOException | C0784 unused) {
                enumC21667 = EnumC21667.BAD_REQUEST;
                strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
            }
        }
        return C12802.m31751(enumC21667, strM49059);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18683 m21254(C3767 c3767, C19471 c19471) {
        EnumC21667 enumC21667;
        String strM49059;
        if (!EnumC12716.POST.equals(c3767.m12226())) {
            enumC21667 = EnumC21667.METHOD_NOT_ALLOWED;
            strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
        } else {
            try {
                LinkedHashMap linkedHashMapM9982 = this.f25908.m9982(c19471, C24209.m54195(C23991.m53549(c3767)));
                if (linkedHashMapM9982 == null) {
                    return C12802.m31751(EnumC21667.BAD_REQUEST, C21576.m49059(R.string.MT_Protector, new Object[0]));
                }
                return C12802.m31750(linkedHashMapM9982);
            } catch (IOException | C0784 | C3325 unused) {
                enumC21667 = EnumC21667.BAD_REQUEST;
                strM49059 = C21576.m49059(R.string.MT_Protector, new Object[0]);
            }
        }
        return C12802.m31751(enumC21667, strM49059);
    }
}
