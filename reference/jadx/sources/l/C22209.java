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

/* JADX INFO: renamed from: l.᩷ܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6XZ */
/* JADX INFO: loaded from: classes.dex */
public final class C22209 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22999 f71545;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10274 f71546;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2402 f71547;

    public C22209(C22999 c22999, C10274 c10274) {
        C2402 c2402 = new C2402();
        this.f71545 = c22999;
        C17359.requireNonNull(c10274, "pathCoordinator");
        this.f71546 = c10274;
        this.f71547 = c2402;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9113 m50227() {
        return this.f71545.m51885();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m50219(String str, C9113 c9113, String str2) throws C10186 {
        String strM2299 = C0470.m2299(c9113, str, str2, false);
        c9113.m24268(strM2299);
        return strM2299;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m50226(String str, C9113 c9113, String str2) throws C10186 {
        String strM2299 = C0470.m2299(c9113, str, str2, false);
        c9113.m24270(strM2299);
        c9113.m24269(strM2299);
        return strM2299;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19225 m50228(String str) {
        return this.f71546.m26483(str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19225 m50233(String str) {
        return this.f71546.m26486(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19225 m50229(List list) {
        return this.f71546.m26484((Collection) list);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m50232(String str) {
        return this.f71547.m8144(str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1907 m50234(String str) throws C10186 {
        try {
            return this.f71547.m8144(str).mo4298().mo8790();
        } catch (C22790 e) {
            throw m50224(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50230(AbstractC22044 abstractC22044) throws C10186 {
        abstractC22044.getClass();
        if ((abstractC22044 instanceof C18379) && abstractC22044.mo42890().m42889() == null && abstractC22044.mo42886()) {
            return;
        }
        m50231(abstractC22044, new C6338(abstractC22044));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50231(AbstractC22044 abstractC22044, InterfaceC5055 interfaceC5055) throws C10186 {
        if (abstractC22044.mo19981() || (abstractC22044 instanceof C0678) || (abstractC22044 instanceof C18379)) {
            String parent = abstractC22044.getParent();
            boolean z = true;
            while (parent != null) {
                this.f71547.getClass();
                AbstractC22044 abstractC22044M35193 = C14584.m35193(parent, new String[0]);
                try {
                    C1907 c1907Mo8790 = abstractC22044M35193.mo4298().mo8790();
                    if (c1907Mo8790.m6567() == EnumC13093.LINK) {
                        throw interfaceC5055.mo15291("FILE_IS_SYMLINK", "A symbolic-link parent cannot be traversed by a file tool.", "parent_is_link");
                    }
                    if (c1907Mo8790.m6567() == EnumC13093.MISSING) {
                        throw interfaceC5055.mo15291(z ? "FILE_PARENT_NOT_FOUND" : "FILE_LINK_CHECK_FAILED", z ? "The target parent directory does not exist." : "An existing parent chain could not be verified safely.", z ? "parent_missing" : "ancestor_missing");
                    }
                    if (c1907Mo8790.m6567() != EnumC13093.DIRECTORY) {
                        throw interfaceC5055.mo15291("FILE_NOT_DIRECTORY", "A target parent is not a directory.", c1907Mo8790.m6567().name().toLowerCase(Locale.ROOT));
                    }
                    parent = abstractC22044M35193.getParent();
                    z = false;
                } catch (C22790 e) {
                    throw interfaceC5055.mo15291("FILE_LINK_CHECK_FAILED", "A parent link status could not be verified safely.", e.m51409().name().toLowerCase(Locale.ROOT));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m50224(C22790 c22790) {
        String str;
        boolean z = false;
        switch (C14091.f44597[c22790.m51409().ordinal()]) {
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
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, c22790.m51410()).add("targetPath", c22790.m51411() == null ? JSON.NULL : JSON.value(c22790.m51411()));
        String strName = c22790.m51408().name();
        Locale locale = Locale.ROOT;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("operation", strName.toLowerCase(locale)).add("backendReason", c22790.m51409().name().toLowerCase(locale));
        if (z) {
            return C10186.m26302(str, c22790.getMessage(), "warning", (JSONArray) null, jSONObjectAdd2);
        }
        return C10186.m26306(str, c22790.getMessage(), "fatal", null, jSONObjectAdd2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m50221(String str, IOException iOException) {
        return m50222(str, iOException.getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m50220(RuntimeException runtimeException, String str) {
        return m50222(str, runtimeException.getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m50222(String str, String str2) {
        return C10186.m26302("FILE_STORAGE_ERROR", "Failed to read local file content.", "warning", (JSONArray) null, C22121.m50076(MotionUtils.EASING_TYPE_PATH, str, "operation", "read").add("backendReason", str2));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C10186 m50225(String str) {
        return C10186.m26302("FILE_NOT_FOUND", "The requested file path does not exist.", "warning", (JSONArray) null, C22121.m50076(MotionUtils.EASING_TYPE_PATH, str, "operation", c.h));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10186 m50223(String str, String str2, String str3, EnumC13093 enumC13093) {
        String str4;
        int i = C14091.f44598[enumC13093.ordinal()];
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
        JSONObject jSONObjectAdd = C22121.m50076(MotionUtils.EASING_TYPE_PATH, str3, "operation", c.h).add("backendReason", enumC13093.name().toLowerCase(Locale.ROOT));
        if (("FILE_NOT_REGULAR".equals(str) && enumC13093 == EnumC13093.DIRECTORY) || ("FILE_NOT_DIRECTORY".equals(str) && enumC13093 == EnumC13093.REGULAR)) {
            return C10186.m26302(str, str2 + " Found: " + str4 + ".", "warning", (JSONArray) null, jSONObjectAdd);
        }
        return C10186.m26306(str, str2 + " Found: " + str4 + ".", "fatal", null, jSONObjectAdd);
    }
}
