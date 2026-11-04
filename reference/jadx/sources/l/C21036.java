package l;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9A2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21036 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList f67231;

    static {
        m48080();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m48079() {
        return !f67231.isEmpty();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48077(C24132 c24132) {
        String string = ApplicationC17729.f58258.getString("stid", null);
        if (!TextUtils.isEmpty(string)) {
            for (InterfaceC24020 interfaceC24020 : f67231) {
                if (interfaceC24020.mo12513().equals(string)) {
                    if (interfaceC24020.mo12515(c24132)) {
                        return;
                    }
                    f67231 = m48078();
                    return;
                }
            }
        }
        if (f67231.isEmpty() || ((InterfaceC24020) f67231.get(0)).mo12515(c24132)) {
            return;
        }
        f67231 = m48078();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m48076() {
        return f67231;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m48080() {
        f67231 = m48078();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static ArrayList m48078() {
        PackageManager packageManager;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(new C3882(C21576.m49081()));
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            PackageManager packageManagerM49081 = C21576.m49081();
            Intent intent = new Intent("android.intent.action.PROCESS_TEXT");
            intent.setType("text/plain");
            List<ResolveInfo> listQueryIntentActivities = packageManagerM49081.queryIntentActivities(intent, 65536);
            int size = arrayList.size();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                CharSequence charSequenceLoadLabel = resolveInfo.loadLabel(packageManagerM49081);
                if (charSequenceLoadLabel != null) {
                    String string = charSequenceLoadLabel.toString();
                    String str = resolveInfo.activityInfo.name;
                    if (string.equalsIgnoreCase("Translate") || string.equalsIgnoreCase("翻译") || string.equalsIgnoreCase("翻譯") || string.equalsIgnoreCase("Перевести") || string.equalsIgnoreCase("Перакласці") || string.equalsIgnoreCase("Tərcümə etmək") || string.equalsIgnoreCase("Traducir") || string.equalsIgnoreCase("Menerjemahkan") || string.equalsIgnoreCase("Çevir")) {
                        packageManager = packageManagerM49081;
                        arrayList.add(size, new C14322(resolveInfo));
                        size++;
                    } else {
                        if (str.contains("Translate")) {
                            packageManager = packageManagerM49081;
                        } else {
                            packageManager = packageManagerM49081;
                            if (str.contains("Translation") || str.contains("Translator") || str.contains(".translate.") || C24276.m54287(string, "Translate") || C24276.m54287(string, "翻译") || C24276.m54287(string, "翻譯") || C24276.m54287(string, "Перевести") || C24276.m54287(string, "Перакласці") || C24276.m54287(string, "Tərcümə etmək") || C24276.m54287(string, "Traducir") || C24276.m54287(string, "Menerjemahkan") || C24276.m54287(string, "Çevir")) {
                            }
                        }
                        arrayList.add(new C14322(resolveInfo));
                    }
                } else {
                    packageManager = packageManagerM49081;
                }
                packageManagerM49081 = packageManager;
            }
        }
        return arrayList;
    }
}
