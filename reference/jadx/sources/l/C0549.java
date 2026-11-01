package l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡ܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1IP */
/* JADX INFO: loaded from: classes2.dex */
public final class C0549 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13626 f2300;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13626 f2301;

    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dd  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2560(C13626 c13626) {
        Boolean bool;
        Boolean bool2;
        Iterator it = c13626.m33320("state").mo33983(true).iterator();
        while (it.hasNext()) {
            ((AbstractC20745) it.next()).mo24647();
        }
        Iterator it2 = c13626.m33320("dex/smali").mo33983(true).iterator();
        while (it2.hasNext()) {
            ((AbstractC20745) it2.next()).mo24647();
        }
        Iterator it3 = c13626.m33320("arsc/xml").mo33983(true).iterator();
        while (it3.hasNext()) {
            ((AbstractC20745) it3.next()).mo24647();
        }
        for (AbstractC20745 abstractC20745 : c13626.m33320("dex/config").mo33983(true)) {
            if (abstractC20745.mo33971()) {
                String name = abstractC20745.getName();
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
                abstractC20745.mo24647();
            }
        }
        for (AbstractC20745 abstractC20746 : c13626.m33320("arsc/config").mo33983(true)) {
            if (abstractC20746.mo33971()) {
                String name2 = abstractC20746.getName();
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
                abstractC20746.mo24647();
            }
        }
    }

    public C0549(C13626 c13626) {
        this.f2301 = c13626;
        this.f2300 = new C13626(c13626, "backup");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2563(String str) throws IOException {
        C13626 c13626 = this.f2300;
        if (c13626.m33318().mo33971()) {
            c13626.m33323();
        }
        if (!c13626.m33326()) {
            c13626.m33318().mo33987();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        c13626.m33320(jCurrentTimeMillis + ".info").m46735(str);
        C22918 c22918 = new C22918(c13626.m33320(jCurrentTimeMillis + ".zip"));
        Charset charset = StandardCharsets.UTF_8;
        c22918.m50717();
        C13626 c13627 = this.f2301;
        m2561(c13627.m33320("state"), c22918, "");
        m2561(c13627.m33320("dex/config"), c22918, "dex/");
        m2561(c13627.m33320("dex/smali"), c22918, "dex/");
        m2561(c13627.m33320("arsc/config"), c22918, "arsc/");
        m2561(c13627.m33320("arsc/xml"), c22918, "arsc/");
        c22918.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m2564(AbstractC20745 abstractC20745) {
        C13626 c13626 = this.f2301;
        C13626 c13627 = new C13626(c13626, "temp");
        try {
            C2455 c2455 = new C2455(abstractC20745);
            try {
                for (C12107 c12107 : c2455.m7466()) {
                    C5553.m15307(c12107.getName(), c12107.isDirectory());
                }
                c13627.m33323();
                c13627.m33318().m46739();
                for (C12107 c12108 : c2455.m7466()) {
                    AbstractC20745 abstractC20745M33320 = c13627.m33320(C5553.m15307(c12108.getName(), c12108.isDirectory()));
                    if (c12108.isDirectory()) {
                        abstractC20745M33320.m46739();
                    } else {
                        abstractC20745M33320.mo46720();
                        abstractC20745M33320.m46694(c2455.m7471(c12108));
                    }
                    abstractC20745M33320.mo32855(c12108.getTime());
                }
                c2455.close();
                AbstractC20745 abstractC20745M33321 = c13627.m33320("state");
                AbstractC20745 abstractC20745M33322 = c13626.m33320("state");
                abstractC20745M33322.mo24647();
                if (abstractC20745M33321.mo33975()) {
                    abstractC20745M33321.m46699(abstractC20745M33322, (Runnable) null);
                }
                AbstractC20745 abstractC20745M33323 = c13627.m33320("dex/config");
                AbstractC20745 abstractC20745M33324 = c13626.m33320("dex/config");
                abstractC20745M33324.mo24647();
                if (abstractC20745M33323.mo33975()) {
                    abstractC20745M33323.m46699(abstractC20745M33324, (Runnable) null);
                }
                AbstractC20745 abstractC20745M33325 = c13627.m33320("dex/smali");
                AbstractC20745 abstractC20745M33326 = c13626.m33320("dex/smali");
                abstractC20745M33326.mo24647();
                if (abstractC20745M33325.mo33975()) {
                    abstractC20745M33325.m46699(abstractC20745M33326, (Runnable) null);
                }
                AbstractC20745 abstractC20745M33327 = c13627.m33320("arsc/config");
                AbstractC20745 abstractC20745M33328 = c13626.m33320("arsc/config");
                abstractC20745M33328.mo24647();
                if (abstractC20745M33327.mo33975()) {
                    abstractC20745M33327.m46699(abstractC20745M33328, (Runnable) null);
                }
                AbstractC20745 abstractC20745M33329 = c13627.m33320("arsc/xml");
                AbstractC20745 abstractC20745M333210 = c13626.m33320("arsc/xml");
                abstractC20745M333210.mo24647();
                if (abstractC20745M33329.mo33975()) {
                    abstractC20745M33329.m46699(abstractC20745M333210, (Runnable) null);
                }
                c13627.m33323();
            } catch (Throwable th) {
                try {
                    c2455.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            c13627.m33323();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m2562() {
        List<AbstractC20745> list = (List) C9030.stream(this.f2300.m33318().mo33983(true)).filter(new C16073(0)).collect(C1890.toList());
        ArrayList arrayList = new ArrayList(list.size());
        for (AbstractC20745 abstractC20745 : list) {
            String strMo33986 = abstractC20745.mo33986();
            AbstractC20745 abstractC20745M15313 = C5553.m15313(strMo33986.substring(0, strMo33986.length() - 3) + "info", new String[0]);
            if (abstractC20745M15313.mo33975()) {
                try {
                    String strM46730 = abstractC20745M15313.m46730();
                    if (!strM46730.isEmpty()) {
                        String name = abstractC20745.getName();
                        arrayList.add(new C20306(abstractC20745, abstractC20745M15313, strM46730, Long.parseLong(name.substring(0, name.length() - 4))));
                    }
                } catch (IOException | NumberFormatException unused) {
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2561(AbstractC20745 abstractC20745, C22918 c22918, String str) throws IOException {
        if (abstractC20745.mo33975()) {
            StringBuilder sbM23356 = C9023.m23356(str);
            sbM23356.append(abstractC20745.getName());
            sbM23356.append("/");
            String string = sbM23356.toString();
            C12107 c12107 = new C12107(string);
            c12107.setTime(abstractC20745.mo33991());
            c22918.m50727(c12107);
            c22918.m50730();
            for (AbstractC20745 abstractC20746 : abstractC20745.mo33983(true)) {
                if (abstractC20746.mo33974()) {
                    m2561(abstractC20746, c22918, string);
                } else {
                    StringBuilder sbM23357 = C9023.m23356(string);
                    sbM23357.append(abstractC20746.getName());
                    C12107 c12108 = new C12107(sbM23357.toString());
                    c12108.setTime(abstractC20746.mo33991());
                    c22918.m50727(c12108);
                    c22918.m50724(abstractC20746.mo33970());
                    c22918.m50730();
                }
            }
        }
    }
}
