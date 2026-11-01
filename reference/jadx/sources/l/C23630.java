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

/* JADX INFO: renamed from: l.᩻ۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 113M */
/* JADX INFO: loaded from: classes.dex */
public final class C23630 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f76551;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC12483 f76552;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f76553;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f76554;

    static {
        f76551 = Build.VERSION.SDK_INT < 24;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23630 m52095(AbstractActivityC12483 abstractActivityC12483, AbstractC20745 abstractC20745, String str) {
        C23630 c23630 = new C23630();
        c23630.f76552 = abstractActivityC12483;
        c23630.f76554 = abstractC20745;
        c23630.f76553 = str;
        return c23630;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m52097() {
        return this.f76553;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m52098(String str) {
        if (str == null || str.equals("default")) {
            str = this.f76553;
        }
        return m52094(this.f76552.getPackageManager(), this.f76554, str);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m52101(InterfaceC23898 interfaceC23898) {
        m52100(interfaceC23898, this.f76554, false);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x015f A[Catch: Exception -> 0x016b, TRY_LEAVE, TryCatch #0 {Exception -> 0x016b, blocks: (B:67:0x0153, B:68:0x015f), top: B:75:0x0031 }] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52100(InterfaceC23898 interfaceC23898, AbstractC20745 abstractC20745, boolean z) {
        int i;
        String str = this.f76553;
        AbstractActivityC12483 abstractActivityC12483 = this.f76552;
        if (!interfaceC23898.mo16278() && !interfaceC23898.mo16276()) {
            throw new RuntimeException();
        }
        if (z) {
            try {
                abstractActivityC12483.startActivity(m52093(interfaceC23898, C14396.m34657(abstractC20745), str));
                return;
            } catch (Exception e) {
                abstractActivityC12483.m31002(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        try {
            if (!abstractC20745.mo33972() || !interfaceC23898.mo16278()) {
                abstractActivityC12483.startActivity(m52093(interfaceC23898, abstractC20745.m46712(), str));
            } else {
                boolean z2 = false;
                try {
                    i = abstractActivityC12483.getPackageManager().getApplicationInfo(interfaceC23898.mo16277().getPackageName(), 0).targetSdkVersion;
                } catch (PackageManager.NameNotFoundException unused) {
                    i = -1;
                }
                if (i >= 29) {
                    abstractActivityC12483.startActivity(m52093(interfaceC23898, abstractC20745.m46712(), str));
                } else {
                    Intent intentM52093 = m52093(interfaceC23898, abstractC20745.m46732(), str);
                    if (f76551) {
                        try {
                            abstractActivityC12483.startActivity(intentM52093);
                            return;
                        } catch (Exception unused2) {
                        }
                    }
                    InterfaceC10890 interfaceC10890M18096 = C6696.m18096();
                    if (interfaceC10890M18096 != null && interfaceC10890M18096.mo2032()) {
                        StringBuilder sb = new StringBuilder("am start");
                        String action = intentM52093.getAction();
                        if (action != null) {
                            sb.append(" -a ");
                            sb.append(action);
                        }
                        ComponentName component = intentM52093.getComponent();
                        if (component != null) {
                            sb.append(" -n ");
                            sb.append(C6696.m18085(component.flattenToString()));
                        }
                        Uri data = intentM52093.getData();
                        if (data != null) {
                            sb.append(" -d ");
                            sb.append(C6696.m18085(data.toString()));
                        }
                        String type = intentM52093.getType();
                        if (type != null) {
                            sb.append(" -t ");
                            sb.append(C6696.m18085(type));
                        }
                        Uri uri = (Uri) intentM52093.getParcelableExtra("android.intent.extra.STREAM");
                        if (uri != null) {
                            sb.append(" --eu android.intent.extra.STREAM ");
                            sb.append(C6696.m18085(uri.toString()));
                        }
                        int flags = intentM52093.getFlags();
                        if (flags != 0) {
                            sb.append(" -f ");
                            sb.append(String.format("0x%08x", Integer.valueOf(flags)));
                        }
                        String string = sb.toString();
                        System.out.println("Cmd: " + string);
                        C5950 c5950Mo2027 = interfaceC10890M18096.mo2027(string);
                        boolean zM16221 = c5950Mo2027.m16221();
                        String str2 = c5950Mo2027.f20238;
                        if (!zM16221 || str2.contains("Warning")) {
                            return;
                        } else {
                            System.out.println("Start activity with shell failed: ".concat(str2));
                        }
                    }
                    try {
                        C16737.m39262("bin.mt.filetransfer");
                        z2 = true;
                    } catch (Exception unused3) {
                    }
                    if (z2) {
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName("bin.mt.filetransfer", "bin.mt.filetransfer.Main"));
                        intent.putExtra("intent", intentM52093);
                        try {
                            abstractActivityC12483.startActivity(intent);
                            return;
                        } catch (Exception unused4) {
                        }
                    }
                    abstractActivityC12483.startActivity(m52093(interfaceC23898, abstractC20745.m46712(), str));
                }
            }
        } catch (Exception e2) {
            abstractActivityC12483.m31002(e2, (DialogInterface.OnDismissListener) null);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52099(InterfaceC23898 interfaceC23898) {
        this.f76552.mo30999(interfaceC23898.mo16277().getPackageName());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m52102() {
        if (f76551 || !this.f76554.mo33972() || C6696.m18100()) {
            return false;
        }
        try {
            C16737.m39262("bin.mt.filetransfer");
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m52094(PackageManager packageManager, AbstractC20745 abstractC20745, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        HashMap map = new HashMap();
        if (abstractC20745.mo33972()) {
            intent.setDataAndType(abstractC20745.m46732(), str);
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                m52096(map, it.next(), true);
            }
        }
        intent.setDataAndType(abstractC20745.m46712(), str);
        Iterator<ResolveInfo> it2 = packageManager.queryIntentActivities(intent, 65536).iterator();
        while (it2.hasNext()) {
            m52096(map, it2.next(), false);
        }
        if (map.isEmpty() && !str.equals("*/*")) {
            return m52094(packageManager, abstractC20745, "*/*");
        }
        return new ArrayList(map.values());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52096(HashMap map, ResolveInfo resolveInfo, boolean z) {
        String str = resolveInfo.activityInfo.packageName;
        if (str.equals("bin.mt.plus") || str.equals("bin.mt.plus.canary") || str.equals("bin.mt.plus")) {
            return;
        }
        StringBuilder sbM8976 = C3012.m8976(str, "/");
        sbM8976.append(resolveInfo.activityInfo.name);
        String string = sbM8976.toString();
        C12341 c12341 = (C12341) map.get(string);
        if (c12341 == null) {
            c12341 = new C12341(resolveInfo);
            map.put(string, c12341);
        }
        if (z) {
            c12341.m30648();
        } else {
            c12341.m30653();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Intent m52093(InterfaceC23898 interfaceC23898, Uri uri, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uri, str);
        intent.setComponent(interfaceC23898.mo16277());
        intent.addFlags(268435456);
        C21273.m47737(intent, uri);
        return intent;
    }
}
