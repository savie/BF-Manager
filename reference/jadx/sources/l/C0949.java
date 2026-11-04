package l;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.view.View;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONParseException;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.֨ۙ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0949 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9897 m3769() {
        String strM46703 = C20327.m46701().m46703("term_ex_info_v3", null);
        if (strM46703 != null) {
            try {
                C9897 c9897 = new C9897();
                JSONObject jSONObject = new JSONObject(strM46703);
                c9897.f31826 = jSONObject.getInt(am.aE);
                c9897.f31824 = jSONObject.getString("n");
                c9897.f31823 = jSONObject.getJSONArray(c9897.f31822).getLong(0);
                c9897.f31825 = jSONObject.getJSONArray(c9897.f31822).getString(1);
                return c9897;
            } catch (JSONParseException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3772(final AbstractActivityC17204 abstractActivityC17204, final Runnable runnable, final boolean z) {
        int i;
        final C9897 c9897M3769 = m3769();
        if (c9897M3769 == null) {
            runnable.run();
            return;
        }
        if (!z && C21576.f68932.getInt("term_ex_skip", -1) == c9897M3769.f31826) {
            runnable.run();
            return;
        }
        C3186 c3186M46731 = C20340.m46731();
        if (c3186M46731 == null) {
            i = R.string.MT_Protector;
        } else {
            if (c3186M46731.f10380 >= c9897M3769.f31826) {
                runnable.run();
                return;
            }
            i = R.string.MT_Protector;
        }
        String strM49059 = C21576.m49059(R.string.MT_Protector, c9897M3769.f31824, C8311.m22390(c9897M3769.f31823) + "B", c9897M3769.f31822);
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8008(strM49059 + "\n" + C21576.m49088(i));
        c2361BuildDialog.m8012(false);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۨۙ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C0949.m3771(c9897M3769, abstractActivityC17204, runnable);
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۛۙ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (!z) {
                    C22673.m51159(R.string.MT_Protector);
                    C21576.f68932.edit().putInt("term_ex_skip", c9897M3769.f31826).apply();
                }
                runnable.run();
            }
        });
        c2361BuildDialog.m8016();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3771(C9897 c9897, AbstractActivityC17204 abstractActivityC17204, Runnable runnable) {
        PackageInfo packageInfoM49057;
        AbstractC22044 abstractC22044M49876 = C6382.f21562.m49876("termex_v" + c9897.f31826 + "_" + c9897.f31822 + ".apk");
        if (!C20340.f65260) {
            try {
                packageInfoM49057 = C21576.m49057("bin.mt.termex");
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfoM49057 = null;
            }
            if (packageInfoM49057 != null) {
                AbstractC22044 abstractC22044M35193 = C14584.m35193(packageInfoM49057.applicationInfo.sourceDir, new String[0]);
                try {
                    MessageDigest messageDigestM36174 = C15022.m36174();
                    C15022.m36175(messageDigestM36174, abstractC22044M35193.mo4290());
                    if (C15022.m36182(messageDigestM36174.digest()).equals(c9897.f31825)) {
                        c9897.f31826 = packageInfoM49057.versionCode;
                        c9897.f31824 = packageInfoM49057.versionName;
                        m3778(abstractActivityC17204, abstractC22044M35193, c9897, runnable);
                        return;
                    }
                } catch (Exception unused2) {
                }
            }
        }
        if (abstractC22044M49876.mo2934()) {
            try {
                MessageDigest messageDigestM36175 = C15022.m36174();
                C15022.m36175(messageDigestM36175, abstractC22044M49876.mo4290());
                if (C15022.m36182(messageDigestM36175.digest()).equals(c9897.f31825)) {
                    m3778(abstractActivityC17204, abstractC22044M49876, c9897, runnable);
                    return;
                }
            } catch (Exception unused3) {
            }
        }
        new C18102(abstractActivityC17204, abstractC22044M49876, c9897, runnable).m8197();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String m3776(C22941 c22941) {
        int i = 2;
        Set set = (Set) C1170.stream(new C13244(c22941.m51742()).m18371("lib/")).filter(new C18218(i)).map(new C3984(i)).collect(C2025.toSet());
        for (String str : Build.SUPPORTED_ABIS) {
            if (set.contains(str)) {
                return C14442.m34865("lib/", str, "/");
            }
        }
        return C8947.m23910(new StringBuilder("lib/"), Build.SUPPORTED_ABIS[0], "/");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m3778(final AbstractActivityC17204 abstractActivityC17204, final AbstractC22044 abstractC22044, C9897 c9897, final Runnable runnable) {
        if (!C20340.f65260) {
            new C7661(abstractActivityC17204, abstractC22044, c9897, runnable).m8197();
            return;
        }
        C2361 c2361BuildDialog = abstractActivityC17204.buildDialog();
        c2361BuildDialog.m8021(R.string.MT_Protector);
        c2361BuildDialog.m8000(R.string.MT_Protector);
        c2361BuildDialog.m8012(false);
        c2361BuildDialog.m8026(R.string.MT_Protector, null);
        c2361BuildDialog.m8022(R.string.MT_Protector, new DialogInterfaceOnClickListenerC24070(0, runnable));
        final DialogInterfaceC8327 dialogInterfaceC8327M8016 = c2361BuildDialog.m8016();
        final C0203 c0203 = new C0203();
        C18848 c18848 = new C18848(dialogInterfaceC8327M8016, abstractActivityC17204, c0203, runnable);
        abstractActivityC17204.getLifecycle().mo23077(c18848);
        dialogInterfaceC8327M8016.m22426(new DialogInterfaceOnDismissListenerC3932(0, abstractActivityC17204, c18848));
        dialogInterfaceC8327M8016.m22436().setOnClickListener(new View.OnClickListener() { // from class: l.ܰۙ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0203 c0204 = c0203;
                if (c0204.m1604()) {
                    if (c0204.f1363) {
                        return;
                    }
                    c0204.f1363 = true;
                    dialogInterfaceC8327M8016.dismiss();
                    ServiceC17530.m41157();
                    C20340.m46730();
                    runnable.run();
                    return;
                }
                C8224.m22123(abstractActivityC17204, abstractC22044, "bin.mt.termex");
            }
        });
        C8224.f27068.m40350(dialogInterfaceC8327M8016, new InterfaceC16438() { // from class: l.᩶ۙ᩻
            @Override // l.InterfaceC16438
            /* JADX INFO: renamed from: ۙ */
            public final void mo1486(Object obj) {
                C0203 c0204 = c0203;
                if (!c0204.m1604() || c0204.f1363) {
                    return;
                }
                c0204.f1363 = true;
                dialogInterfaceC8327M8016.dismiss();
                ServiceC17530.m41157();
                C20340.m46730();
                runnable.run();
            }
        });
        C8224.m22123(abstractActivityC17204, abstractC22044, "bin.mt.termex");
    }

    @TargetApi(29)
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3770(C3186 c3186) throws Throwable {
        C22941 c22941;
        C22941 c22942 = null;
        try {
            String str = c3186.f10382;
            String str2 = c3186.f10377;
            if (str == null) {
                c22941 = new C22941(str2);
                try {
                    String strM3779 = m3779(c22941);
                    c3186.f10382 = strM3779;
                    str = strM3779;
                    c22942 = c22941;
                } catch (Throwable th) {
                    th = th;
                    C20244.m46520(c22941);
                    throw th;
                }
            }
            AbstractC22044 abstractC22044M49876 = C6382.f21568.m49876("term/.exhash");
            if (abstractC22044M49876.mo4304()) {
                try {
                    if (abstractC22044M49876.m49871().equals(str)) {
                        C20244.m46520(c22942);
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            if (c22942 == null) {
                c22942 = new C22941(str2);
            }
            m3775(c22942, str);
            C20244.m46520(c22942);
        } catch (Throwable th2) {
            th = th2;
            c22941 = c22942;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3775(C22941 c22941, String str) throws IOException, ErrnoException {
        String strSubstring;
        AbstractC22044 abstractC22044M49876 = C6382.f21568.m49876("term");
        HashSet<String> hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM23910 = C8947.m23910(new StringBuilder(), m3776(c22941), "lib/");
        for (C8002 c8002 : c22941.m51740()) {
            String name = c8002.getName();
            if (name.startsWith("assets/")) {
                strSubstring = name.substring(7);
            } else if (name.startsWith(strM23910)) {
                strSubstring = name.substring(strM23910.length() - 4);
            }
            linkedHashMap.put(strSubstring, c8002);
            int iIndexOf = strSubstring.indexOf(47);
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            hashSet.add(strSubstring);
        }
        for (String str2 : hashSet) {
            abstractC22044M49876.m49876(str2).mo4296();
            System.out.println(">> Delete: " + str2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String strM5124 = (String) entry.getKey();
            C8002 c8003 = (C8002) entry.getValue();
            if (strM5124.endsWith(".rename")) {
                strM5124 = C1402.m5124(7, 0, strM5124);
            } else if (strM5124.endsWith(".link")) {
                String strM5125 = C1402.m5124(5, 0, strM5124);
                String strTrim = new String(c22941.m51731(c8003, (C3374) null), StandardCharsets.UTF_8).trim();
                if (strTrim.startsWith("-n ")) {
                    strTrim = strTrim.substring(3);
                }
                Os.symlink(strTrim, abstractC22044M49876.m49876(strM5125).mo4278());
                System.out.println(">> Symlink: " + strM5125 + " > " + strTrim);
            }
            System.out.println(">> Extract: " + strM5124);
            AbstractC22044 abstractC22044M49877 = abstractC22044M49876.m49876(strM5124);
            if (c8003.isDirectory()) {
                abstractC22044M49877.m49853();
            } else {
                abstractC22044M49877.m49840(c22941.m51727(c8003));
            }
        }
        if (str != null) {
            abstractC22044M49876.m49876(".exhash").m49879(str);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static String m3779(C22941 c22941) {
        MessageDigest messageDigestM36174 = C15022.m36174();
        String strM23910 = C8947.m23910(new StringBuilder(), m3776(c22941), "lib/");
        byte[] bArr = new byte[4];
        for (C8002 c8002 : c22941.m51740()) {
            String name = c8002.getName();
            if (name.startsWith("assets/") || name.startsWith(strM23910)) {
                C15022.m36176(messageDigestM36174, name);
                if (c8002.isDirectory()) {
                    C6929.m19210(0, 123456, bArr);
                } else {
                    C6929.m19210(0, c8002.m21825(), bArr);
                }
                messageDigestM36174.update(bArr);
            }
        }
        return C15022.m36182(messageDigestM36174.digest());
    }
}
