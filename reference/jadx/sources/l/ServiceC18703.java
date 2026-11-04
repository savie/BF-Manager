package l;

import android.content.Intent;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ᩳ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1PL */
/* JADX INFO: loaded from: classes5.dex */
public class ServiceC18703 extends AbstractServiceC2067 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C24363 f60805;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C18037 f60802 = new C18037(0);

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final C18037 f60804 = new C18037(0);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C18037 f60801 = new C18037(0);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static HashMap f60803 = new HashMap();

    static {
        C6463 c6463M54267 = C24258.m54267();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        c6463M54267.m18278(1L, timeUnit);
        c6463M54267.m18276(1L, timeUnit);
        c6463M54267.m18267(1L, timeUnit);
        c6463M54267.m18269(new C4120());
        c6463M54267.m18273(new C12970());
        f60805 = c6463M54267.m18265();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43500(C6025 c6025) {
        if (f60803.containsKey(c6025.f20607) || f60804.contains(c6025.f20607)) {
            return false;
        }
        f60802.add(c6025.f20607);
        Intent intent = new Intent();
        intent.putExtra("task", new C7516(c6025));
        AbstractServiceC2067.m7140(C21576.m49084(), intent);
        return true;
    }

    @Override // l.AbstractServiceC2067
    /* JADX INFO: renamed from: ۙ */
    public final void mo7142(Intent intent) {
        String strM49871;
        C7516 c7516 = (C7516) intent.getParcelableExtra("task");
        C17359.requireNonNull(c7516);
        String str = c7516.f24830;
        f60802.remove(str);
        C18037 c18037 = f60801;
        c18037.remove(str);
        HashMap map = f60803;
        if (map.containsKey(str)) {
            return;
        }
        AbstractC22044 abstractC22044M49876 = C3787.m12320().m49876(str);
        AbstractC22044 abstractC22044M49877 = abstractC22044M49876.m49876("packageUpload");
        AbstractC22044 abstractC22044M49878 = abstractC22044M49876.m49876("key");
        if (abstractC22044M49877.mo2934()) {
            final C17957 c17957 = new C17957(str);
            map.put(str, c17957);
            try {
                try {
                    abstractC22044M49876.m49876(d.O).mo4296();
                    if (abstractC22044M49878.mo2934()) {
                        strM49871 = abstractC22044M49878.m49871();
                        c17957.m41911(100);
                    } else {
                        String[] strArrM46448 = C20195.m46448(abstractC22044M49877, c7516.f24833);
                        C3374 c3374 = new C3374(abstractC22044M49877.mo4285());
                        c3374.m11078(new InterfaceC17544() { // from class: l.ܰ֡ۧ
                            @Override // l.InterfaceC17544
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo1209(int i) {
                                c17957.m41911(i);
                            }
                        });
                        C20941 c20941 = new C20941();
                        c20941.f67003 = str;
                        c20941.f67002 = abstractC22044M49877;
                        c20941.f67001 = c3374;
                        C0496 c0496 = new C0496();
                        c0496.m2397(strArrM46448[0]);
                        c0496.m2392("PUT", c20941);
                        c0496.m2398("Content-Md5", strArrM46448[2]);
                        InterfaceC6595 interfaceC6595M54450 = f60805.m54450(c0496.m2389());
                        c20941.f67000 = interfaceC6595M54450;
                        C9444 c9444Execute = interfaceC6595M54450.execute();
                        if (interfaceC6595M54450.mo18520()) {
                            map.remove(str);
                            return;
                        } else {
                            if (!c9444Execute.m24819()) {
                                throw new IOException("Unexpected response code " + c9444Execute);
                            }
                            strM49871 = strArrM46448[1];
                            abstractC22044M49878.m49879(strM49871);
                        }
                    }
                    if (c18037.contains(str)) {
                        map.remove(str);
                        return;
                    }
                    int iM46444 = C20195.m46444(strM49871, c7516);
                    abstractC22044M49877.mo4296();
                    abstractC22044M49878.mo4296();
                    f60804.add(str);
                    Intent intent2 = new Intent("bin.mt.protect.ProtectUploadService.ACTION_SUCCESS");
                    intent2.putExtra("taskID", str);
                    intent2.putExtra("id", iM46444);
                    C21576.m49065(intent2);
                    map.remove(str);
                } catch (Exception e) {
                    Intent intent3 = new Intent("bin.mt.protect.ProtectUploadService.ACTION_FAIL");
                    intent3.putExtra("taskID", str);
                    if ((e instanceof C4866) || (e instanceof C3090)) {
                        intent3.putExtra("message", e.getMessage());
                    }
                    C21576.m49065(intent3);
                    map.remove(str);
                }
            } catch (Throwable th) {
                map.remove(str);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m43501(String str) {
        return f60803.containsKey(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m43499(String str) {
        C17957 c17957 = (C17957) f60803.get(str);
        if (c17957 == null) {
            return f60802.contains(str) ? 0 : 100;
        }
        return c17957.f58825;
    }
}
