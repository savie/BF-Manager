package l;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩵ۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 113M */
/* JADX INFO: loaded from: classes5.dex */
public final class C20312 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f65186;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC17204 f65187;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f65188;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f65189;

    static {
        f65186 = Build.VERSION.SDK_INT < 24;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20312 m46653(AbstractActivityC17204 abstractActivityC17204, AbstractC22044 abstractC22044, String str) {
        C20312 c20312 = new C20312();
        c20312.f65187 = abstractActivityC17204;
        c20312.f65189 = abstractC22044;
        c20312.f65188 = str;
        return c20312;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m46655() {
        return this.f65188;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m46656(String str) {
        if (str == null || str.equals("default")) {
            str = this.f65188;
        }
        return m46652(this.f65187.getPackageManager(), this.f65189, str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46659(InterfaceC16648 interfaceC16648) {
        m46658(interfaceC16648, this.f65189, false);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x015f A[Catch: Exception -> 0x016b, TRY_LEAVE, TryCatch #0 {Exception -> 0x016b, blocks: (B:67:0x0153, B:68:0x015f), top: B:75:0x0031 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46658(InterfaceC16648 interfaceC16648, AbstractC22044 abstractC22044, boolean z) {
        int i;
        String str = this.f65188;
        AbstractActivityC17204 abstractActivityC17204 = this.f65187;
        if (!interfaceC16648.mo39359() && !interfaceC16648.mo39357()) {
            throw new RuntimeException();
        }
        if (z) {
            try {
                abstractActivityC17204.startActivity(m46651(interfaceC16648, C17568.m41231(abstractC22044), str));
                return;
            } catch (Exception e) {
                abstractActivityC17204.m40401(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        try {
            if (!abstractC22044.mo4291() || !interfaceC16648.mo39359()) {
                abstractActivityC17204.startActivity(m46651(interfaceC16648, abstractC22044.m49878(), str));
            } else {
                boolean z2 = false;
                try {
                    i = abstractActivityC17204.getPackageManager().getApplicationInfo(interfaceC16648.mo39358().getPackageName(), 0).targetSdkVersion;
                } catch (PackageManager.NameNotFoundException unused) {
                    i = -1;
                }
                if (i >= 29) {
                    abstractActivityC17204.startActivity(m46651(interfaceC16648, abstractC22044.m49878(), str));
                } else {
                    Intent intentM46651 = m46651(interfaceC16648, abstractC22044.m49836(), str);
                    if (f65186) {
                        try {
                            abstractActivityC17204.startActivity(intentM46651);
                            return;
                        } catch (Exception unused2) {
                        }
                    }
                    InterfaceC24911 interfaceC24911M21117 = C7756.m21117();
                    if (interfaceC24911M21117 != null && interfaceC24911M21117.mo6266()) {
                        StringBuilder sb = new StringBuilder("am start");
                        String action = intentM46651.getAction();
                        if (action != null) {
                            sb.append(" -a ");
                            sb.append(action);
                        }
                        ComponentName component = intentM46651.getComponent();
                        if (component != null) {
                            sb.append(" -n ");
                            sb.append(C7756.m21098(component.flattenToString()));
                        }
                        Uri data = intentM46651.getData();
                        if (data != null) {
                            sb.append(" -d ");
                            sb.append(C7756.m21098(data.toString()));
                        }
                        String type = intentM46651.getType();
                        if (type != null) {
                            sb.append(" -t ");
                            sb.append(C7756.m21098(type));
                        }
                        Uri uri = (Uri) intentM46651.getParcelableExtra("android.intent.extra.STREAM");
                        if (uri != null) {
                            sb.append(" --eu android.intent.extra.STREAM ");
                            sb.append(C7756.m21098(uri.toString()));
                        }
                        int flags = intentM46651.getFlags();
                        if (flags != 0) {
                            sb.append(" -f ");
                            sb.append(String.format("0x%08x", Integer.valueOf(flags)));
                        }
                        String string = sb.toString();
                        System.out.println("Cmd: " + string);
                        C11484 c11484Mo6262 = interfaceC24911M21117.mo6262(string);
                        boolean zM28855 = c11484Mo6262.m28855();
                        String str2 = c11484Mo6262.f36124;
                        if (!zM28855 || str2.contains("Warning")) {
                            return;
                        } else {
                            System.out.println("Start activity with shell failed: ".concat(str2));
                        }
                    }
                    try {
                        C21576.m49057("bin.mt.filetransfer");
                        z2 = true;
                    } catch (Exception unused3) {
                    }
                    if (z2) {
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName("bin.mt.filetransfer", "bin.mt.filetransfer.Main"));
                        intent.putExtra("intent", intentM46651);
                        try {
                            abstractActivityC17204.startActivity(intent);
                            return;
                        } catch (Exception unused4) {
                        }
                    }
                    abstractActivityC17204.startActivity(m46651(interfaceC16648, abstractC22044.m49878(), str));
                }
            }
        } catch (Exception e2) {
            abstractActivityC17204.m40401(e2, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46657(InterfaceC16648 interfaceC16648) {
        this.f65187.mo37500(interfaceC16648.mo39358().getPackageName());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m46660() {
        if (f65186 || !this.f65189.mo4291() || C7756.m21109()) {
            return false;
        }
        try {
            C21576.m49057("bin.mt.filetransfer");
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m46652(PackageManager packageManager, AbstractC22044 abstractC22044, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        HashMap map = new HashMap();
        if (abstractC22044.mo4291()) {
            intent.setDataAndType(abstractC22044.m49836(), str);
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                m46654(map, it.next(), true);
            }
        }
        intent.setDataAndType(abstractC22044.m49878(), str);
        Iterator<ResolveInfo> it2 = packageManager.queryIntentActivities(intent, 65536).iterator();
        while (it2.hasNext()) {
            m46654(map, it2.next(), false);
        }
        if (map.isEmpty() && !str.equals("*/*")) {
            return m46652(packageManager, abstractC22044, "*/*");
        }
        return new ArrayList(map.values());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46654(HashMap map, ResolveInfo resolveInfo, boolean z) {
        String str = resolveInfo.activityInfo.packageName;
        if (str.equals("bin.mt.plus") || str.equals("bin.mt.plus.canary") || str.equals("bin.mt.plus")) {
            return;
        }
        StringBuilder sbM10405 = C3188.m10405(str, "/");
        sbM10405.append(resolveInfo.activityInfo.name);
        String string = sbM10405.toString();
        C17328 c17328 = (C17328) map.get(string);
        if (c17328 == null) {
            c17328 = new C17328(resolveInfo);
            map.put(string, c17328);
        }
        if (z) {
            c17328.m40674();
        } else {
            c17328.m40675();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Intent m46651(InterfaceC16648 interfaceC16648, Uri uri, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uri, str);
        intent.setComponent(interfaceC16648.mo39358());
        intent.addFlags(268435456);
        C1112.m4126(intent, uri);
        return intent;
    }
}
