package l;

import android.content.Intent;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩺ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1PL */
/* JADX INFO: loaded from: classes.dex */
public class ServiceC23069 extends AbstractServiceC13457 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C5079 f74951;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C18623 f74950 = new C18623();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C18623 f74947 = new C18623();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C18623 f74949 = new C18623();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static HashMap f74948 = new HashMap();

    static {
        C2256 c2256M20502 = C7810.m20502();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        c2256M20502.m6933(1L, timeUnit);
        c2256M20502.m6932(1L, timeUnit);
        c2256M20502.m6924(1L, timeUnit);
        c2256M20502.m6926(new C21215());
        c2256M20502.m6928(new C23587());
        f74951 = c2256M20502.m6922();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m51045(C11780 c11780) {
        if (f74948.containsKey(c11780.f39567) || f74947.contains(c11780.f39567)) {
            return false;
        }
        f74950.add(c11780.f39567);
        Intent intent = new Intent();
        intent.putExtra("task", new C6840(c11780));
        AbstractServiceC13457.m32940(C16737.m39277(), intent);
        return true;
    }

    @Override // l.AbstractServiceC13457
    /* JADX INFO: renamed from: ۙ */
    public final void mo32942(Intent intent) {
        String strM46730;
        C6840 c6840 = (C6840) intent.getParcelableExtra("task");
        C13638.requireNonNull(c6840);
        String str = c6840.f23042;
        f74950.remove(str);
        C18623 c18623 = f74949;
        c18623.remove(str);
        HashMap map = f74948;
        if (map.containsKey(str)) {
            return;
        }
        AbstractC20745 abstractC20745M46690 = C5429.m15003().m46690(str);
        AbstractC20745 abstractC20745M46691 = abstractC20745M46690.m46690("packageUpload");
        AbstractC20745 abstractC20745M46692 = abstractC20745M46690.m46690("key");
        if (abstractC20745M46691.mo33975()) {
            final C13191 c13191 = new C13191(str);
            map.put(str, c13191);
            try {
                try {
                    abstractC20745M46690.m46690(d.O).mo24647();
                    if (abstractC20745M46692.mo33975()) {
                        strM46730 = abstractC20745M46692.m46730();
                        c13191.m32665(100);
                    } else {
                        String[] strArrM13089 = C4723.m13089(abstractC20745M46691, c6840.f23039);
                        C8516 c8516 = new C8516(abstractC20745M46691.mo33964());
                        c8516.m22241(new InterfaceC21921() { // from class: l.᩹ܶۜ
                            @Override // l.InterfaceC21921
                            /* JADX INFO: renamed from: ۙ */
                            public final void mo1855(int i) {
                                c13191.m32665(i);
                            }
                        });
                        C1195 c1195 = new C1195();
                        c1195.f5298 = str;
                        c1195.f5301 = abstractC20745M46691;
                        c1195.f5300 = c8516;
                        C6490 c6490 = new C6490();
                        c6490.m17686(strArrM13089[0]);
                        c6490.m17681("PUT", c1195);
                        c6490.m17687("Content-Md5", strArrM13089[2]);
                        InterfaceC11617 interfaceC11617M14157 = f74951.m14157(c6490.m17678());
                        c1195.f5299 = interfaceC11617M14157;
                        C18485 c18485Execute = interfaceC11617M14157.execute();
                        if (interfaceC11617M14157.mo10827()) {
                            map.remove(str);
                            return;
                        } else {
                            if (!c18485Execute.m42863()) {
                                throw new IOException("Unexpected response code " + c18485Execute);
                            }
                            strM46730 = strArrM13089[1];
                            abstractC20745M46692.m46735(strM46730);
                        }
                    }
                    if (c18623.contains(str)) {
                        map.remove(str);
                        return;
                    }
                    int iM13085 = C4723.m13085(strM46730, c6840);
                    abstractC20745M46691.mo24647();
                    abstractC20745M46692.mo24647();
                    f74947.add(str);
                    Intent intent2 = new Intent("bin.mt.protect.ProtectUploadService.ACTION_SUCCESS");
                    intent2.putExtra("taskID", str);
                    intent2.putExtra("id", iM13085);
                    C16737.m39270(intent2);
                    map.remove(str);
                } catch (Exception e) {
                    Intent intent3 = new Intent("bin.mt.protect.ProtectUploadService.ACTION_FAIL");
                    intent3.putExtra("taskID", str);
                    if ((e instanceof C4987) || (e instanceof C8142)) {
                        intent3.putExtra("message", e.getMessage());
                    }
                    C16737.m39270(intent3);
                    map.remove(str);
                }
            } catch (Throwable th) {
                map.remove(str);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m51046(String str) {
        return f74948.containsKey(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m51044(String str) {
        C13191 c13191 = (C13191) f74948.get(str);
        if (c13191 == null) {
            return f74950.contains(str) ? 0 : 100;
        }
        return c13191.f43904;
    }
}
