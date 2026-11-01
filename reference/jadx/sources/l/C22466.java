package l;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩹ᩴۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9A2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22466 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList f73341;

    static {
        m49970();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m49974() {
        return !f73341.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49972(C6111 c6111) {
        String string = ApplicationC0716.f2992.getString("stid", null);
        if (!TextUtils.isEmpty(string)) {
            for (InterfaceC11883 interfaceC11883 : f73341) {
                if (interfaceC11883.mo8259().equals(string)) {
                    if (interfaceC11883.mo8261(c6111)) {
                        return;
                    }
                    f73341 = m49973();
                    return;
                }
            }
        }
        if (f73341.isEmpty() || ((InterfaceC11883) f73341.get(0)).mo8261(c6111)) {
            return;
        }
        f73341 = m49973();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m49971() {
        return f73341;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m49970() {
        f73341 = m49973();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static ArrayList m49973() {
        PackageManager packageManager;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(new C2709(C16737.m39292()));
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            PackageManager packageManagerM39292 = C16737.m39292();
            Intent intent = new Intent("android.intent.action.PROCESS_TEXT");
            intent.setType("text/plain");
            List<ResolveInfo> listQueryIntentActivities = packageManagerM39292.queryIntentActivities(intent, 65536);
            int size = arrayList.size();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                CharSequence charSequenceLoadLabel = resolveInfo.loadLabel(packageManagerM39292);
                if (charSequenceLoadLabel != null) {
                    String string = charSequenceLoadLabel.toString();
                    String str = resolveInfo.activityInfo.name;
                    if (string.equalsIgnoreCase("Translate") || string.equalsIgnoreCase("翻译") || string.equalsIgnoreCase("翻譯") || string.equalsIgnoreCase("Перевести") || string.equalsIgnoreCase("Перакласці") || string.equalsIgnoreCase("Tərcümə etmək") || string.equalsIgnoreCase("Traducir") || string.equalsIgnoreCase("Menerjemahkan") || string.equalsIgnoreCase("Çevir")) {
                        packageManager = packageManagerM39292;
                        arrayList.add(size, new C5532(resolveInfo));
                        size++;
                    } else {
                        if (str.contains("Translate")) {
                            packageManager = packageManagerM39292;
                        } else {
                            packageManager = packageManagerM39292;
                            if (str.contains("Translation") || str.contains("Translator") || str.contains(".translate.") || C6851.m18463((CharSequence) string, (CharSequence) "Translate") || C6851.m18463((CharSequence) string, (CharSequence) "翻译") || C6851.m18463((CharSequence) string, (CharSequence) "翻譯") || C6851.m18463((CharSequence) string, (CharSequence) "Перевести") || C6851.m18463((CharSequence) string, (CharSequence) "Перакласці") || C6851.m18463((CharSequence) string, (CharSequence) "Tərcümə etmək") || C6851.m18463((CharSequence) string, (CharSequence) "Traducir") || C6851.m18463((CharSequence) string, (CharSequence) "Menerjemahkan") || C6851.m18463((CharSequence) string, (CharSequence) "Çevir")) {
                            }
                        }
                        arrayList.add(new C5532(resolveInfo));
                    }
                } else {
                    packageManager = packageManagerM39292;
                }
                packageManagerM39292 = packageManager;
            }
        }
        return arrayList;
    }
}
