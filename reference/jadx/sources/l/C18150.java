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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ᩳܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9AZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18150 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21678 m42274() {
        String strM22055 = C8416.m22053().m22055("term_ex_info_v3", null);
        if (strM22055 != null) {
            try {
                C21678 c21678 = new C21678();
                JSONObject jSONObject = new JSONObject(strM22055);
                c21678.f70309 = jSONObject.getInt(am.aE);
                c21678.f70311 = jSONObject.getString("n");
                c21678.f70312 = jSONObject.getJSONArray(c21678.f70310).getLong(0);
                c21678.f70313 = jSONObject.getJSONArray(c21678.f70310).getString(1);
                return c21678;
            } catch (JSONParseException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42278(final AbstractActivityC12483 abstractActivityC12483, final Runnable runnable, final boolean z) {
        int i;
        final C21678 c21678M42274 = m42274();
        if (c21678M42274 == null) {
            runnable.run();
            return;
        }
        if (!z && C16737.f53615.getInt("term_ex_skip", -1) == c21678M42274.f70309) {
            runnable.run();
            return;
        }
        C3478 c3478M13121 = C4744.m13121();
        if (c3478M13121 == null) {
            i = R.string.MT_Protector;
        } else {
            if (c3478M13121.f12768 >= c21678M42274.f70309) {
                runnable.run();
                return;
            }
            i = R.string.MT_Protector;
        }
        String strM39264 = C16737.m39264(R.string.MT_Protector, c21678M42274.f70311, C1791.m5863(c21678M42274.f70312) + "B", c21678M42274.f70310);
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21261(strM39264 + "\n" + C16737.m39288(i));
        c8067BuildDialog.m21265(false);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܰܺۜ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C18150.m42280(c21678M42274, abstractActivityC12483, runnable);
            }
        });
        c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۨܺۜ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (!z) {
                    C15829.m37618(R.string.MT_Protector);
                    C16737.f53615.edit().putInt("term_ex_skip", c21678M42274.f70309).apply();
                }
                runnable.run();
            }
        });
        c8067BuildDialog.m21269();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42280(C21678 c21678, AbstractActivityC12483 abstractActivityC12483, Runnable runnable) {
        PackageInfo packageInfoM39262;
        AbstractC20745 abstractC20745M46690 = C11904.f39937.m46690("termex_v" + c21678.f70309 + "_" + c21678.f70310 + ".apk");
        if (!C4744.f16694) {
            try {
                packageInfoM39262 = C16737.m39262("bin.mt.termex");
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfoM39262 = null;
            }
            if (packageInfoM39262 != null) {
                AbstractC20745 abstractC20745M15313 = C5553.m15313(packageInfoM39262.applicationInfo.sourceDir, new String[0]);
                try {
                    MessageDigest messageDigestM49416 = C22253.m49416();
                    C22253.m49417(messageDigestM49416, abstractC20745M15313.mo33970());
                    if (C22253.m49424(messageDigestM49416.digest()).equals(c21678.f70313)) {
                        c21678.f70309 = packageInfoM39262.versionCode;
                        c21678.f70311 = packageInfoM39262.versionName;
                        m42283(abstractActivityC12483, abstractC20745M15313, c21678, runnable);
                        return;
                    }
                } catch (Exception unused2) {
                }
            }
        }
        if (abstractC20745M46690.mo33975()) {
            try {
                MessageDigest messageDigestM49417 = C22253.m49416();
                C22253.m49417(messageDigestM49417, abstractC20745M46690.mo33970());
                if (C22253.m49424(messageDigestM49417.digest()).equals(c21678.f70313)) {
                    m42283(abstractActivityC12483, abstractC20745M46690, c21678, runnable);
                    return;
                }
            } catch (Exception unused3) {
            }
        }
        new C4038(abstractActivityC12483, abstractC20745M46690, c21678, runnable).m10243();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String m42281(C2455 c2455) {
        Set set = (Set) C9030.stream(new C1044(c2455.m7466()).m25252("lib/")).filter(new C12252(1)).map(new C13212(0)).collect(C1890.toSet());
        for (String str : Build.SUPPORTED_ABIS) {
            if (set.contains(str)) {
                return C16523.m38890("lib/", str, "/");
            }
        }
        return C22697.m50267(new StringBuilder("lib/"), Build.SUPPORTED_ABIS[0], "/");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m42283(final AbstractActivityC12483 abstractActivityC12483, final AbstractC20745 abstractC20745, C21678 c21678, final Runnable runnable) {
        if (!C4744.f16694) {
            new C23090(abstractActivityC12483, abstractC20745, c21678, runnable).m10243();
            return;
        }
        C8067 c8067BuildDialog = abstractActivityC12483.buildDialog();
        c8067BuildDialog.m21274(R.string.MT_Protector);
        c8067BuildDialog.m21253(R.string.MT_Protector);
        c8067BuildDialog.m21265(false);
        c8067BuildDialog.m21251(R.string.MT_Protector, null);
        c8067BuildDialog.m21275(R.string.MT_Protector, new DialogInterfaceOnClickListenerC2627(0, runnable));
        final DialogInterfaceC19356 dialogInterfaceC19356M21269 = c8067BuildDialog.m21269();
        final C6861 c6861 = new C6861();
        final C15329 c15329 = new C15329(dialogInterfaceC19356M21269, abstractActivityC12483, c6861, runnable);
        abstractActivityC12483.getLifecycle().mo9171(c15329);
        dialogInterfaceC19356M21269.m44367(new DialogInterface.OnDismissListener() { // from class: l.ۚܺۜ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                abstractActivityC12483.getLifecycle().mo9172(c15329);
            }
        });
        dialogInterfaceC19356M21269.m44373().setOnClickListener(new View.OnClickListener() { // from class: l.᩹ܺۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6861 c6862 = c6861;
                if (c6862.m18483()) {
                    if (c6862.f23142) {
                        return;
                    }
                    c6862.f23142 = true;
                    dialogInterfaceC19356M21269.dismiss();
                    ServiceC2046.m6541();
                    C4744.m13120();
                    runnable.run();
                    return;
                }
                C3872.m11210(abstractActivityC12483, abstractC20745, "bin.mt.termex");
            }
        });
        C3872.f14473.m44959(dialogInterfaceC19356M21269, new InterfaceC10597() { // from class: l.֨ܺۜ
            @Override // l.InterfaceC10597
            /* JADX INFO: renamed from: ۙ */
            public final void mo1473(Object obj) {
                C6861 c6862 = c6861;
                if (!c6862.m18483() || c6862.f23142) {
                    return;
                }
                c6862.f23142 = true;
                dialogInterfaceC19356M21269.dismiss();
                ServiceC2046.m6541();
                C4744.m13120();
                runnable.run();
            }
        });
        C3872.m11210(abstractActivityC12483, abstractC20745, "bin.mt.termex");
    }

    @TargetApi(29)
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42277(C3478 c3478) throws Throwable {
        C2455 c2455;
        C2455 c2456 = null;
        try {
            String str = c3478.f12766;
            String str2 = c3478.f12767;
            if (str == null) {
                c2455 = new C2455(str2);
                try {
                    String strM42273 = m42273(c2455);
                    c3478.f12766 = strM42273;
                    str = strM42273;
                    c2456 = c2455;
                } catch (Throwable th) {
                    th = th;
                    C19431.m44468(c2455);
                    throw th;
                }
            }
            AbstractC20745 abstractC20745M46690 = C11904.f39938.m46690("term/.exhash");
            if (abstractC20745M46690.mo33971()) {
                try {
                    if (abstractC20745M46690.m46730().equals(str)) {
                        C19431.m44468(c2456);
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            if (c2456 == null) {
                c2456 = new C2455(str2);
            }
            m42276(c2456, str);
            C19431.m44468(c2456);
        } catch (Throwable th2) {
            th = th2;
            c2455 = c2456;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42276(C2455 c2455, String str) throws ErrnoException {
        String strSubstring;
        AbstractC20745 abstractC20745M46690 = C11904.f39938.m46690("term");
        HashSet<String> hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strM50267 = C22697.m50267(new StringBuilder(), m42281(c2455), "lib/");
        for (C12107 c12107 : c2455.m7489()) {
            String name = c12107.getName();
            if (name.startsWith("assets/")) {
                strSubstring = name.substring(7);
            } else if (name.startsWith(strM50267)) {
                strSubstring = name.substring(strM50267.length() - 4);
            }
            linkedHashMap.put(strSubstring, c12107);
            int iIndexOf = strSubstring.indexOf(47);
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            hashSet.add(strSubstring);
        }
        for (String str2 : hashSet) {
            abstractC20745M46690.m46690(str2).mo24647();
            System.out.println(">> Delete: " + str2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String strM46498 = (String) entry.getKey();
            C12107 c12108 = (C12107) entry.getValue();
            if (strM46498.endsWith(".rename")) {
                strM46498 = C20630.m46498(7, 0, strM46498);
            } else if (strM46498.endsWith(".link")) {
                String strM46499 = C20630.m46498(5, 0, strM46498);
                String strTrim = new String(c2455.m7475(c12108, (C8516) null), StandardCharsets.UTF_8).trim();
                if (strTrim.startsWith("-n ")) {
                    strTrim = strTrim.substring(3);
                }
                Os.symlink(strTrim, abstractC20745M46690.m46690(strM46499).mo24643());
                System.out.println(">> Symlink: " + strM46499 + " > " + strTrim);
            }
            System.out.println(">> Extract: " + strM46498);
            AbstractC20745 abstractC20745M46691 = abstractC20745M46690.m46690(strM46498);
            if (c12108.isDirectory()) {
                abstractC20745M46691.m46739();
            } else {
                abstractC20745M46691.m46694(c2455.m7471(c12108));
            }
        }
        if (str != null) {
            abstractC20745M46690.m46690(".exhash").m46735(str);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m42273(C2455 c2455) {
        MessageDigest messageDigestM49416 = C22253.m49416();
        String strM50267 = C22697.m50267(new StringBuilder(), m42281(c2455), "lib/");
        byte[] bArr = new byte[4];
        for (C12107 c12107 : c2455.m7489()) {
            String name = c12107.getName();
            if (name.startsWith("assets/") || name.startsWith(strM50267)) {
                C22253.m49418(messageDigestM49416, name);
                if (c12107.isDirectory()) {
                    C15157.m36338(0, 123456, bArr);
                } else {
                    C15157.m36338(0, c12107.m30126(), bArr);
                }
                messageDigestM49416.update(bArr);
            }
        }
        return C22253.m49424(messageDigestM49416.digest());
    }
}
