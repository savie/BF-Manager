package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.umeng.commonsdk.internal.c;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۖ᩸۬, reason: contains not printable characters */
/* JADX INFO: compiled from: U6XZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2800 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15886 f10654;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C23968 f10655;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C12441 f10656;

    public C2800(C15886 c15886, C23968 c23968) {
        C12441 c12441 = new C12441(10);
        this.f10654 = c15886;
        C13638.requireNonNull(c23968, "pathCoordinator");
        this.f10655 = c23968;
        this.f10656 = c12441;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3070 m8504() {
        return this.f10654.m37800();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m8495(String str, C3070 c3070, String str2) throws C12731 {
        String strM17474 = C6370.m17474(c3070, str, str2, false);
        c3070.m9209(strM17474);
        return strM17474;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m8502(String str, C3070 c3070, String str2) throws C12731 {
        String strM17474 = C6370.m17474(c3070, str, str2, false);
        c3070.m9207(strM17474);
        c3070.m9210(strM17474);
        return strM17474;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11268 m8505(String str) {
        return this.f10655.m52809(str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11268 m8509(String str) {
        return this.f10655.m52812(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11268 m8506(List list) {
        return this.f10655.m52810((Collection) list);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C5928 m8503(String str) throws C12731 {
        try {
            return this.f10656.m30917(str).mo33989().mo8394();
        } catch (C20040 e) {
            throw m8500(e);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m8508(String str) {
        return this.f10656.m30917(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8507(AbstractC20745 abstractC20745, InterfaceC11974 interfaceC11974) throws C12731 {
        if (abstractC20745.mo33979() || (abstractC20745 instanceof C17589) || (abstractC20745 instanceof C17196)) {
            String parent = abstractC20745.getParent();
            boolean z = true;
            while (parent != null) {
                this.f10656.getClass();
                AbstractC20745 abstractC20745M15313 = C5553.m15313(parent, new String[0]);
                try {
                    C5928 c5928Mo8394 = abstractC20745M15313.mo33989().mo8394();
                    if (c5928Mo8394.m16196() == EnumC12279.LINK) {
                        throw interfaceC11974.mo15512("FILE_IS_SYMLINK", "A symbolic-link parent cannot be traversed by a destructive file tool.", "parent_is_link");
                    }
                    if (c5928Mo8394.m16196() == EnumC12279.MISSING) {
                        throw interfaceC11974.mo15512(z ? "FILE_PARENT_NOT_FOUND" : "FILE_LINK_CHECK_FAILED", z ? "The target parent directory does not exist." : "An existing parent chain could not be verified safely.", z ? "parent_missing" : "ancestor_missing");
                    }
                    if (c5928Mo8394.m16196() != EnumC12279.DIRECTORY) {
                        throw interfaceC11974.mo15512("FILE_NOT_DIRECTORY", "A target parent is not a directory.", c5928Mo8394.m16196().name().toLowerCase(Locale.ROOT));
                    }
                    parent = abstractC20745M15313.getParent();
                    z = false;
                } catch (C20040 e) {
                    throw interfaceC11974.mo15512("FILE_LINK_CHECK_FAILED", "A parent link status could not be verified safely.", e.m45399().name().toLowerCase(Locale.ROOT));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m8500(C20040 c20040) {
        String str;
        boolean z = false;
        switch (C14091.f46255[c20040.m45399().ordinal()]) {
            case 1:
                str = "FILE_NOT_FOUND";
                z = true;
                break;
            case 2:
                str = "FILE_ALREADY_EXISTS";
                z = true;
                break;
            case 3:
                str = "FILE_NOT_REGULAR";
                break;
            case 4:
                str = "FILE_NOT_DIRECTORY";
                break;
            case 5:
                str = "FILE_DIRECTORY_NOT_EMPTY";
                z = true;
                break;
            case 6:
                str = "FILE_ACCESS_DENIED";
                break;
            case 7:
            case 8:
                str = "FILE_BACKEND_UNSUPPORTED";
                break;
            default:
                str = "FILE_STORAGE_ERROR";
                z = true;
                break;
        }
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, c20040.m45400()).add("targetPath", c20040.m45397() == null ? JSON.NULL : JSON.value(c20040.m45397()));
        String strName = c20040.m45398().name();
        Locale locale = Locale.ROOT;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("operation", strName.toLowerCase(locale)).add("backendReason", c20040.m45399().name().toLowerCase(locale));
        if (z) {
            return C12731.m31627(str, c20040.getMessage(), "warning", (JSONArray) null, jSONObjectAdd2);
        }
        return C12731.m31631(str, c20040.getMessage(), "fatal", null, jSONObjectAdd2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m8497(String str, IOException iOException) {
        return m8498(str, iOException.getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m8496(RuntimeException runtimeException, String str) {
        return m8498(str, runtimeException.getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m8498(String str, String str2) {
        return C12731.m31627("FILE_STORAGE_ERROR", "Failed to read local file content.", "warning", (JSONArray) null, C3184.m9603(MotionUtils.EASING_TYPE_PATH, str, "operation", "read").add("backendReason", str2));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C12731 m8501(String str) {
        return C12731.m31627("FILE_NOT_FOUND", "The requested file path does not exist.", "warning", (JSONArray) null, C3184.m9603(MotionUtils.EASING_TYPE_PATH, str, "operation", c.h));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12731 m8499(String str, String str2, String str3, EnumC12279 enumC12279) {
        String str4;
        int i = C14091.f46256[enumC12279.ordinal()];
        if (i == 1) {
            str4 = "regular file";
        } else if (i == 2) {
            str4 = "directory";
        } else if (i == 3) {
            str4 = "symbolic link";
        } else if (i == 4) {
            str4 = "special node";
        } else {
            if (i != 5) {
                throw new IncompatibleClassChangeError();
            }
            str4 = "missing path";
        }
        JSONObject jSONObjectAdd = C3184.m9603(MotionUtils.EASING_TYPE_PATH, str3, "operation", c.h).add("backendReason", enumC12279.name().toLowerCase(Locale.ROOT));
        if (("FILE_NOT_REGULAR".equals(str) && enumC12279 == EnumC12279.DIRECTORY) || ("FILE_NOT_DIRECTORY".equals(str) && enumC12279 == EnumC12279.REGULAR)) {
            return C12731.m31627(str, str2 + " Found: " + str4 + ".", "warning", (JSONArray) null, jSONObjectAdd);
        }
        return C12731.m31631(str, str2 + " Found: " + str4 + ".", "fatal", null, jSONObjectAdd);
    }
}
