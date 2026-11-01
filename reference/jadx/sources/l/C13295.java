package l;

import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.۬ᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7AS */
/* JADX INFO: loaded from: classes3.dex */
public final class C13295 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2004 f44154;

    public C13295(C12610 c12610, C2004 c2004, C14001 c14001) {
        this.f44154 = c2004;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7768 m32784(C15530 c15530) {
        if (!EnumC18351.GET.equals(c15530.m37142())) {
            return m32779(c15530, EnumC10591.METHOD_NOT_ALLOWED, R.string.MT_Protector, new Object[0]);
        }
        return C12610.m31383(this.f44154.m6463());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7768 m32781(C15530 c15530) {
        String strM14439;
        if (!EnumC18351.POST.equals(c15530.m37142())) {
            return m32779(c15530, EnumC10591.METHOD_NOT_ALLOWED, R.string.MT_Protector, new Object[0]);
        }
        C2004 c2004 = this.f44154;
        C11178 c11178M6451 = c2004.m6451(c15530);
        if (c11178M6451 != null) {
            return m32779(c15530, EnumC10591.UNAUTHORIZED, c11178M6451.f37867, c11178M6451.f37870);
        }
        if (!C5244.m14445(c15530) && (strM14439 = C5244.m14439(c15530, "content-length")) != null) {
            String strTrim = strM14439.trim();
            if (!strTrim.isEmpty()) {
                for (int i = 0; i < strTrim.length(); i++) {
                    char cCharAt = strTrim.charAt(i);
                    if (cCharAt >= '0' && cCharAt <= '9') {
                    }
                }
                try {
                    if (Long.parseLong(strTrim) <= 8192) {
                        try {
                            C11178 c11178M6456 = c2004.m6456(c15530, C5244.m14438(c15530));
                            Object[] objArr = c11178M6456.f37870;
                            int i2 = c11178M6456.f37867;
                            String str = c11178M6456.f37871;
                            if (!c11178M6456.f37869) {
                                if (str.isEmpty()) {
                                    return C12610.m31384(EnumC10591.UNAUTHORIZED, C16737.m39264(i2, objArr));
                                }
                                return AbstractC16940.m39639(EnumC10591.UNAUTHORIZED, "application/json", new JSONObject().add(d.O, C16737.m39264(i2, objArr)).add("code", str).toString());
                            }
                            return C12610.m31383(Collections.singletonMap("deviceId", c11178M6456.f37868));
                        } catch (IOException | C21173 unused) {
                            c2004.m6460(c15530);
                            return m32779(c15530, EnumC10591.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
            }
        }
        c2004.m6460(c15530);
        return m32779(c15530, EnumC10591.BAD_REQUEST, R.string.MT_Protector, new Object[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C7768 m32779(C15530 c15530, EnumC10591 enumC10591, int i, Object... objArr) {
        C7768 c7768M31384 = C12610.m31384(enumC10591, C16737.m39264(i, objArr));
        if (C5244.m14443(c15530)) {
            c7768M31384.m20446();
        }
        return c7768M31384;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7768 m32780(C15530 c15530, C21055 c21055) {
        if (!EnumC18351.GET.equals(c15530.m37142())) {
            return C12610.m31384(EnumC10591.METHOD_NOT_ALLOWED, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
        return C12610.m31383(this.f44154.m6453(c21055));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7768 m32783(C15530 c15530, C21055 c21055) {
        if (!EnumC18351.DELETE.equals(c15530.m37142())) {
            return C12610.m31384(EnumC10591.METHOD_NOT_ALLOWED, C16737.m39264(R.string.MT_Protector, new Object[0]));
        }
        String strM14444 = C5244.m14444(c15530, "deviceId");
        if (strM14444 == null || strM14444.isEmpty()) {
            return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, "deviceId"));
        }
        return C12610.m31383(Collections.singletonMap("deleted", Boolean.valueOf(this.f44154.m6466(c21055, strM14444))));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7768 m32785(C15530 c15530, C21055 c21055) {
        EnumC10591 enumC10591;
        String strM39264;
        if (!EnumC18351.POST.equals(c15530.m37142())) {
            enumC10591 = EnumC10591.METHOD_NOT_ALLOWED;
            strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
        } else {
            try {
                LinkedHashMap linkedHashMapM6454 = this.f44154.m6454(c21055, C5244.m14438(c15530));
                if (linkedHashMapM6454 == null) {
                    enumC10591 = EnumC10591.BAD_REQUEST;
                    strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
                } else {
                    return C12610.m31383(linkedHashMapM6454);
                }
            } catch (IOException | C21173 unused) {
                enumC10591 = EnumC10591.BAD_REQUEST;
                strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
            }
        }
        return C12610.m31384(enumC10591, strM39264);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7768 m32782(C15530 c15530, C21055 c21055) {
        EnumC10591 enumC10591;
        String strM39264;
        if (!EnumC18351.POST.equals(c15530.m37142())) {
            enumC10591 = EnumC10591.METHOD_NOT_ALLOWED;
            strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
        } else {
            try {
                LinkedHashMap linkedHashMapM6455 = this.f44154.m6455(c21055, C14001.m33846(C5244.m14438(c15530)));
                if (linkedHashMapM6455 == null) {
                    return C12610.m31384(EnumC10591.BAD_REQUEST, C16737.m39264(R.string.MT_Protector, new Object[0]));
                }
                return C12610.m31383(linkedHashMapM6455);
            } catch (IOException | C1983 | C21173 unused) {
                enumC10591 = EnumC10591.BAD_REQUEST;
                strM39264 = C16737.m39264(R.string.MT_Protector, new Object[0]);
            }
        }
        return C12610.m31384(enumC10591, strM39264);
    }
}
