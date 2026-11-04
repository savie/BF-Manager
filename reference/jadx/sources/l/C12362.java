package l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1IP */
/* JADX INFO: loaded from: classes3.dex */
public final class C12362 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9378 f39712;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9378 f39713;

    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dd  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30838(C9378 c9378) {
        Boolean bool;
        Boolean bool2;
        Iterator it = c9378.m24694("state").mo4299(true).iterator();
        while (it.hasNext()) {
            ((AbstractC22044) it.next()).mo4296();
        }
        Iterator it2 = c9378.m24694("dex/smali").mo4299(true).iterator();
        while (it2.hasNext()) {
            ((AbstractC22044) it2.next()).mo4296();
        }
        Iterator it3 = c9378.m24694("arsc/xml").mo4299(true).iterator();
        while (it3.hasNext()) {
            ((AbstractC22044) it3.next()).mo4296();
        }
        for (AbstractC22044 abstractC22044 : c9378.m24694("dex/config").mo4299(true)) {
            if (abstractC22044.mo4304()) {
                String name = abstractC22044.getName();
                name.getClass();
                if (name.equals("dex_name_map") || name.equals("map")) {
                    bool2 = Boolean.FALSE;
                } else {
                    bool2 = Boolean.TRUE;
                }
            } else {
                bool2 = Boolean.TRUE;
            }
            if (bool2.booleanValue()) {
                abstractC22044.mo4296();
            }
        }
        for (AbstractC22044 abstractC22045 : c9378.m24694("arsc/config").mo4299(true)) {
            if (abstractC22045.mo4304()) {
                String name2 = abstractC22045.getName();
                name2.getClass();
                if (name2.equals("pkgsort") || name2.equals("name")) {
                    bool = Boolean.FALSE;
                } else {
                    bool = Boolean.TRUE;
                }
            } else {
                bool = Boolean.TRUE;
            }
            if (bool.booleanValue()) {
                abstractC22045.mo4296();
            }
        }
    }

    public C12362(C9378 c9378) {
        this.f39713 = c9378;
        this.f39712 = new C9378(c9378, "backup");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30841(String str) throws IOException {
        C9378 c9378 = this.f39712;
        if (c9378.m24699().mo4304()) {
            c9378.m24697();
        }
        if (!c9378.m24702()) {
            c9378.m24699().mo4274();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        c9378.m24694(jCurrentTimeMillis + ".info").m49879(str);
        C25179 c25179 = new C25179(c9378.m24694(jCurrentTimeMillis + ".zip"));
        Charset charset = StandardCharsets.UTF_8;
        c25179.m56132();
        C9378 c9379 = this.f39713;
        m30839(c9379.m24694("state"), c25179, "");
        m30839(c9379.m24694("dex/config"), c25179, "dex/");
        m30839(c9379.m24694("dex/smali"), c25179, "dex/");
        m30839(c9379.m24694("arsc/config"), c25179, "arsc/");
        m30839(c9379.m24694("arsc/xml"), c25179, "arsc/");
        c25179.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30842(AbstractC22044 abstractC22044) {
        C9378 c9378 = this.f39713;
        C9378 c9379 = new C9378(c9378, "temp");
        try {
            C22941 c22941 = new C22941(abstractC22044);
            try {
                for (C8002 c8002 : c22941.m51742()) {
                    C14584.m35187(c8002.getName(), c8002.isDirectory());
                }
                c9379.m24697();
                c9379.m24699().m49853();
                for (C8002 c8003 : c22941.m51742()) {
                    AbstractC22044 abstractC22044M24694 = c9379.m24694(C14584.m35187(c8003.getName(), c8003.isDirectory()));
                    if (c8003.isDirectory()) {
                        abstractC22044M24694.m49853();
                    } else {
                        abstractC22044M24694.mo49834();
                        abstractC22044M24694.m49840(c22941.m51727(c8003));
                    }
                    abstractC22044M24694.mo2942(c8003.getTime());
                }
                c22941.close();
                AbstractC22044 abstractC22044M24695 = c9379.m24694("state");
                AbstractC22044 abstractC22044M24696 = c9378.m24694("state");
                abstractC22044M24696.mo4296();
                if (abstractC22044M24695.mo2934()) {
                    abstractC22044M24695.m49845(abstractC22044M24696, (Runnable) null);
                }
                AbstractC22044 abstractC22044M24697 = c9379.m24694("dex/config");
                AbstractC22044 abstractC22044M24698 = c9378.m24694("dex/config");
                abstractC22044M24698.mo4296();
                if (abstractC22044M24697.mo2934()) {
                    abstractC22044M24697.m49845(abstractC22044M24698, (Runnable) null);
                }
                AbstractC22044 abstractC22044M24699 = c9379.m24694("dex/smali");
                AbstractC22044 abstractC22044M246910 = c9378.m24694("dex/smali");
                abstractC22044M246910.mo4296();
                if (abstractC22044M24699.mo2934()) {
                    abstractC22044M24699.m49845(abstractC22044M246910, (Runnable) null);
                }
                AbstractC22044 abstractC22044M246911 = c9379.m24694("arsc/config");
                AbstractC22044 abstractC22044M246912 = c9378.m24694("arsc/config");
                abstractC22044M246912.mo4296();
                if (abstractC22044M246911.mo2934()) {
                    abstractC22044M246911.m49845(abstractC22044M246912, (Runnable) null);
                }
                AbstractC22044 abstractC22044M246913 = c9379.m24694("arsc/xml");
                AbstractC22044 abstractC22044M246914 = c9378.m24694("arsc/xml");
                abstractC22044M246914.mo4296();
                if (abstractC22044M246913.mo2934()) {
                    abstractC22044M246913.m49845(abstractC22044M246914, (Runnable) null);
                }
                c9379.m24697();
            } catch (Throwable th) {
                try {
                    c22941.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            c9379.m24697();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m30840() {
        List<AbstractC22044> list = (List) C1170.stream(this.f39712.m24699().mo4299(true)).filter(new C19907(1)).collect(C2025.toList());
        ArrayList arrayList = new ArrayList(list.size());
        for (AbstractC22044 abstractC22044 : list) {
            String strMo4294 = abstractC22044.mo4294();
            AbstractC22044 abstractC22044M35193 = C14584.m35193(strMo4294.substring(0, strMo4294.length() - 3) + "info", new String[0]);
            if (abstractC22044M35193.mo2934()) {
                try {
                    String strM49871 = abstractC22044M35193.m49871();
                    if (!strM49871.isEmpty()) {
                        String name = abstractC22044.getName();
                        arrayList.add(new C20567(abstractC22044, abstractC22044M35193, strM49871, Long.parseLong(name.substring(0, name.length() - 4))));
                    }
                } catch (IOException | NumberFormatException unused) {
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30839(AbstractC22044 abstractC22044, C25179 c25179, String str) throws IOException {
        if (abstractC22044.mo2934()) {
            StringBuilder sbM27333 = C10732.m27333(str);
            sbM27333.append(abstractC22044.getName());
            sbM27333.append("/");
            String string = sbM27333.toString();
            C8002 c8002 = new C8002(string);
            c8002.setTime(abstractC22044.mo4286());
            c25179.m56125(c8002);
            c25179.m56134();
            for (AbstractC22044 abstractC22045 : abstractC22044.mo4299(true)) {
                if (abstractC22045.mo4281()) {
                    m30839(abstractC22045, c25179, string);
                } else {
                    StringBuilder sbM27334 = C10732.m27333(string);
                    sbM27334.append(abstractC22045.getName());
                    C8002 c8003 = new C8002(sbM27334.toString());
                    c8003.setTime(abstractC22045.mo4286());
                    c25179.m56125(c8003);
                    c25179.m56123(abstractC22045.mo4290());
                    c25179.m56134();
                }
            }
        }
    }
}
