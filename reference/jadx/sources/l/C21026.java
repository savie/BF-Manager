package l;

import android.os.Build;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩷ܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D4TJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21026 extends C3761 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final C21386 f68463 = new C21386(1);

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C18910 f68464 = new C18910();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC8327 f68465;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16088 f68467;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f68468;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Predicate f68470;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f68471;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f68472;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f68473;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f68475;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f68474 = new ArrayList();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f68466 = new ArrayList();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f68469 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21026 m47357(String str, C16608 c16608, InterfaceC8327 interfaceC8327) {
        return m47356(str, c16608, interfaceC8327, f68463);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21026 m47356(String str, InterfaceC16088 interfaceC16088, InterfaceC8327 interfaceC8327, Predicate predicate) {
        boolean z = !C5553.m15304(str) && C8272.m21690(str) == null;
        return new C21026(str, interfaceC16088, z, z, interfaceC8327, predicate);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21026 m47355(String str, AbstractC12233 abstractC12233, InterfaceC16088 interfaceC16088, InterfaceC8327 interfaceC8327) {
        C21026 c21026 = new C21026(str, interfaceC16088, abstractC12233.mo10277(), false, interfaceC8327, f68463);
        c21026.f68469 = true;
        return c21026;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21026 m47358(InterfaceC8327 interfaceC8327) {
        return new C21026("", null, true, true, interfaceC8327, f68463);
    }

    public C21026(String str, InterfaceC16088 interfaceC16088, boolean z, boolean z2, InterfaceC8327 interfaceC8327, Predicate predicate) {
        this.f68472 = str;
        this.f68467 = interfaceC16088;
        this.f68475 = z;
        this.f68468 = z2;
        this.f68465 = interfaceC8327;
        this.f68470 = predicate;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m47389() {
        this.f68475 = false;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m47384() {
        this.f68468 = false;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m47387() {
        this.f68471 = true;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m47386() {
        this.f68469 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47376(String str) {
        this.f68473 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47368(String[] strArr, AbstractC9677 abstractC9677, boolean z) throws IOException {
        for (String str : strArr) {
            InterfaceC2557 interfaceC2557M24620 = abstractC9677.m24620(str);
            m47360(interfaceC2557M24620, ((C15404) interfaceC2557M24620).getName(), abstractC9677, z);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47360(InterfaceC2557 interfaceC2557, String str, AbstractC9677 abstractC9677, boolean z) throws IOException {
        boolean z2 = false;
        boolean z3 = z && interfaceC2557.mo7986();
        try {
            if (interfaceC2557.isDirectory() && !z3) {
                z2 = true;
            }
            String strM15307 = C5553.m15307(str, z2);
            if (z3) {
                String strMo7978 = interfaceC2557.mo7978();
                if (strMo7978 == null) {
                    throw new IOException(C0252.m1693("Archive symbolic link target is missing: ", str));
                }
                C5553.m15324(strM15307, strMo7978);
            }
            if (interfaceC2557.isDirectory()) {
                for (InterfaceC2557 interfaceC2558 : abstractC9677.mo10263(interfaceC2557.getPath(), true)) {
                    String name = interfaceC2558.getName();
                    if (!strM15307.isEmpty()) {
                        name = C1679.m5594(strM15307, "/", name);
                    }
                    m47360(interfaceC2558, name, abstractC9677, z);
                }
            }
        } catch (IOException e) {
            String path = interfaceC2557.getPath();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            throw new IOException(C0252.m1693("Unsafe archive entry path: ", path), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47381(String[] strArr, AbstractC9677 abstractC9677, boolean z, boolean z2) throws IOException {
        AbstractC10444 c9033;
        int i;
        C11731 c11731Mo7971;
        String[] strArr2 = strArr;
        String str = this.f68473;
        if (str != null && strArr2.length != 1) {
            throw new IllegalStateException();
        }
        int length = strArr2.length;
        int i2 = 0;
        while (true) {
            ArrayList<AbstractC10444> arrayList = this.f68474;
            InterfaceC8327 interfaceC8327 = this.f68465;
            if (i2 < length) {
                String str2 = strArr2[i2];
                if (interfaceC8327.mo2357()) {
                    return;
                }
                InterfaceC2557 interfaceC2557M24620 = abstractC9677.m24620(str2);
                String name = str != null ? str : ((C15404) interfaceC2557M24620).getName();
                C15404 c15404 = (C15404) interfaceC2557M24620;
                boolean zIsDirectory = c15404.isDirectory();
                if (z) {
                    name = C5553.m15307(name, zIsDirectory);
                }
                AbstractC20745 abstractC20745M15313 = C5553.m15313(this.f68472, name);
                boolean zMo33975 = abstractC20745M15313.mo33975();
                boolean z3 = this.f68468 && c15404.mo7986();
                boolean z4 = zMo33975 && z3 && this.f68471;
                if (zMo33975 && z3) {
                    if (!this.f68471) {
                        m47372(abstractC20745M15313.mo33986());
                        throw null;
                    }
                }
                if (c15404.isDirectory()) {
                    c9033 = new C19616();
                    if (zMo33975 && !z4) {
                        m47367(abstractC20745M15313);
                    }
                    i = length;
                } else {
                    c9033 = new C9033();
                    if (!zMo33975 || z4) {
                        i = length;
                    } else {
                        m47375(abstractC20745M15313);
                        int iM47354 = m47354(abstractC20745M15313, interfaceC2557M24620, name);
                        i = length;
                        InterfaceC16088 interfaceC16088 = this.f68467;
                        if (interfaceC16088.mo2357()) {
                            interfaceC8327.mo10345();
                            return;
                        }
                        if (iM47354 != 1) {
                            if (iM47354 == 2) {
                                c9033.m26386();
                            } else if (this.f68475) {
                                C5222 c5222 = new C5222();
                                c5222.m14408(abstractC20745M15313);
                                c9033.m26366(c5222.m14407());
                            }
                            if (iM47354 == 0 && interfaceC16088.mo11432() && abstractC20745M15313.mo35233()) {
                                c9033.m26384(true);
                            }
                        }
                        i2++;
                        strArr2 = strArr;
                        str = str;
                        length = i;
                    }
                    c9033.m26363(c15404.getSize());
                    this.f13613 = c9033.m26359() + this.f13613;
                }
                c9033.m26361(name);
                c9033.m26381(c15404.getTime());
                c9033.m26369(z3);
                if (c9033.m26374()) {
                    c9033.m26364(c15404.mo7978());
                }
                if (this.f68475 && c9033.m26370() == null && (c11731Mo7971 = interfaceC2557M24620.mo7971()) != null) {
                    if (interfaceC2557M24620 instanceof C6794) {
                        if (C6794.m18392(c11731Mo7971)) {
                            if (!((C6794) interfaceC2557M24620).mo7989().mo46709()) {
                                try {
                                    c9033.m26366(new C2399(C0055.m951(((C15404) interfaceC2557M24620).getPath())));
                                } catch (IOException unused) {
                                }
                            }
                        } else {
                            c9033.m26366(new C2399(c11731Mo7971.m29318(), c11731Mo7971.m29325(), c11731Mo7971.m29327()));
                        }
                    } else {
                        c9033.m26366(new C2399(c11731Mo7971.m29318(), -1, -1));
                    }
                }
                c9033.m26378(str2);
                c9033.m26383(abstractC20745M15313);
                c9033.m26382(name);
                c9033.m26379(zMo33975);
                arrayList.add(c9033);
                this.f13615++;
                i2++;
                strArr2 = strArr;
                str = str;
                length = i;
            } else {
                interfaceC8327.mo10344();
                for (AbstractC10444 abstractC10444 : arrayList) {
                    if (interfaceC8327.mo2357()) {
                        return;
                    }
                    if (m47369(abstractC10444)) {
                        m47365(abstractC10444.mo23365(), abstractC9677, z);
                    }
                }
                if (z2) {
                    interfaceC8327.mo10344();
                    for (AbstractC10444 abstractC10445 : arrayList) {
                        if (abstractC10445.m26387()) {
                            m47371(abstractC10445.mo23365());
                        }
                    }
                }
                Collections.sort(arrayList, f68464);
                for (AbstractC10444 abstractC10446 : arrayList) {
                    if (abstractC10446.m26387()) {
                        abstractC10446.mo23365().m44705();
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47365(C19616 c19616, AbstractC9677 abstractC9677, boolean z) throws IOException {
        AbstractC10444 c19617;
        C11731 c11731Mo7971;
        String strM26393 = c19616.m26393();
        Iterator it = abstractC9677.mo10263(c19616.m26362(), true).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC8327 interfaceC8327 = this.f68465;
            if (!zHasNext) {
                interfaceC8327.mo10344();
                for (AbstractC10444 abstractC10444 : c19616.f62970) {
                    if (interfaceC8327.mo2357()) {
                        return;
                    }
                    if (m47369(abstractC10444)) {
                        m47365(abstractC10444.mo23365(), abstractC9677, z);
                    }
                }
                return;
            }
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            if (interfaceC8327.mo2357()) {
                return;
            }
            String name = interfaceC2557.getName();
            if (!strM26393.isEmpty()) {
                name = C1679.m5594(strM26393, "/", name);
            }
            boolean zIsDirectory = interfaceC2557.isDirectory();
            if (z) {
                name = C5553.m15307(name, zIsDirectory);
            }
            AbstractC20745 abstractC20745M15313 = C5553.m15313(this.f68472, name);
            boolean z2 = false;
            boolean z3 = c19616.m26389() && abstractC20745M15313.mo33975();
            boolean z4 = this.f68468 && interfaceC2557.mo7986();
            if (z3 && z4 && this.f68471) {
                z2 = true;
            }
            if (interfaceC2557.isDirectory()) {
                c19617 = new C19616();
                if (z3 && !z2) {
                    m47367(abstractC20745M15313);
                }
            } else {
                C9033 c9033 = new C9033();
                if (z3 && !z2) {
                    m47375(abstractC20745M15313);
                    int iM47354 = m47354(abstractC20745M15313, interfaceC2557, name);
                    InterfaceC16088 interfaceC16088 = this.f68467;
                    if (interfaceC16088.mo2357()) {
                        interfaceC8327.mo10345();
                        return;
                    }
                    if (iM47354 == 1) {
                        c19616.f62969 = true;
                    } else {
                        if (iM47354 == 2) {
                            c9033.m26386();
                        } else {
                            C5222 c5222 = new C5222();
                            c5222.m14408(abstractC20745M15313);
                            c9033.m26366(c5222.m14407());
                        }
                        if (iM47354 == 0 && interfaceC16088.mo11432() && abstractC20745M15313.mo35233()) {
                            c9033.m26384(true);
                        }
                    }
                }
                c9033.m26363(interfaceC2557.getSize());
                this.f13613 = c9033.m26359() + this.f13613;
                c19617 = c9033;
            }
            c19617.m26381(interfaceC2557.getTime());
            c19617.m26369(z4);
            if (c19617.m26374()) {
                c19617.m26364(interfaceC2557.mo7978());
            }
            if (this.f68475 && c19617.m26370() == null && (c11731Mo7971 = interfaceC2557.mo7971()) != null) {
                if (!(interfaceC2557 instanceof C6794)) {
                    c19617.m26366(new C2399(c11731Mo7971.m29318(), -1, -1));
                } else if (!C6794.m18392(c11731Mo7971)) {
                    c19617.m26366(new C2399(c11731Mo7971.m29318(), c11731Mo7971.m29325(), c11731Mo7971.m29327()));
                } else if (!interfaceC2557.mo7989().mo46709()) {
                    try {
                        c19617.m26366(new C2399(C0055.m951(interfaceC2557.getPath())));
                    } catch (IOException unused) {
                    }
                }
            }
            c19617.m26378(interfaceC2557.getPath());
            c19617.m26383(abstractC20745M15313);
            c19617.m26382(name);
            c19617.m26379(z3);
            c19616.f62970.add(c19617);
            this.f13615++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m47354(AbstractC20745 abstractC20745, InterfaceC2557 interfaceC2557, String str) {
        boolean zTest = this.f68470.test(abstractC20745);
        if (!this.f68467.mo11425(zTest)) {
            C20321 c20321 = C20321.f65801;
            return this.f68467.mo11423(str, c20321, c20321, false, zTest);
        }
        return this.f68467.mo11423(str, C20321.m45855(interfaceC2557), C20321.m45856(abstractC20745), abstractC20745.mo35233(), zTest);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m47369(AbstractC10444 abstractC10444) {
        if (!abstractC10444.m26387()) {
            return false;
        }
        if (!abstractC10444.m26374() || this.f68469) {
            return (this.f68471 && abstractC10444.m26374() && abstractC10444.m26389()) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47378(String[] strArr) throws IOException {
        AbstractC10444 c9033;
        int length = strArr.length;
        int i = 0;
        while (true) {
            ArrayList<AbstractC10444> arrayList = this.f68474;
            InterfaceC8327 interfaceC8327 = this.f68465;
            if (i < length) {
                String str = strArr[i];
                if (interfaceC8327.mo2357()) {
                    return;
                }
                AbstractC20745 abstractC20745M15313 = C5553.m15313(str, new String[0]);
                String name = abstractC20745M15313.getName();
                AbstractC20745 abstractC20745M15314 = C5553.m15313(this.f68472, name);
                if (!C5553.m15330(abstractC20745M15313.mo33986(), abstractC20745M15314.mo33986())) {
                    boolean zMo33975 = abstractC20745M15314.mo33975();
                    if (abstractC20745M15313.mo33974()) {
                        if (abstractC20745M15314.m46705(abstractC20745M15313)) {
                            throw new C8142(C16737.m39264(R.string.MT_Protector, abstractC20745M15313.mo33986()));
                        }
                        c9033 = new C19616();
                    } else {
                        c9033 = new C9033();
                        c9033.m26363(abstractC20745M15313.mo33964());
                    }
                    c9033.m26361(abstractC20745M15313.getName());
                    c9033.m26381(abstractC20745M15313.mo33991());
                    c9033.m26369(this.f68468 && abstractC20745M15313.m46723());
                    c9033.m26368(abstractC20745M15313);
                    c9033.m26383(abstractC20745M15314);
                    c9033.m26382(name);
                    c9033.m26379(zMo33975);
                    if (!zMo33975) {
                        interfaceC8327.mo10346(name);
                        if (abstractC20745M15313.mo24646(abstractC20745M15314)) {
                            if (c9033.m26387()) {
                                abstractC20745M15314.mo32855(c9033.m26392());
                            }
                            this.f68466.add(c9033);
                            this.f13615++;
                            m10992();
                        }
                    } else if (c9033.f35662) {
                        if (abstractC20745M15314.mo33974() && !abstractC20745M15314.m46723()) {
                            m47372(abstractC20745M15314.mo33986());
                            throw null;
                        }
                    } else if (c9033.m26387()) {
                        m47367(abstractC20745M15314);
                    } else {
                        m47375(abstractC20745M15314);
                    }
                    if (c9033.f35662 || !c9033.m26387()) {
                        C9033 c9033Mo23366 = c9033.mo23366();
                        if (zMo33975) {
                            c9033Mo23366.m26390();
                            InterfaceC16088 interfaceC16088 = this.f68467;
                            if (interfaceC16088.mo11428()) {
                                interfaceC16088.mo11424(name, C20321.m45856(abstractC20745M15313), C20321.m45856(abstractC20745M15314), abstractC20745M15314.mo35233());
                            }
                            if (interfaceC16088.mo2357()) {
                                interfaceC8327.mo10345();
                                return;
                            }
                            if (interfaceC16088.mo11431() != 1) {
                                if (interfaceC16088.mo11431() == 2) {
                                    c9033Mo23366.m26386();
                                } else if (!c9033.f35662) {
                                    C5222 c5222 = new C5222();
                                    c5222.m14408(abstractC20745M15314);
                                    c9033Mo23366.m26366(c5222.m14407());
                                }
                                if (interfaceC16088.mo11431() == 0 && interfaceC16088.mo11432() && abstractC20745M15314.mo35233()) {
                                    c9033Mo23366.m26384(true);
                                }
                            }
                        }
                        if (!c9033.f35662) {
                            this.f13613 += c9033.f35657;
                        }
                        arrayList.add(c9033);
                        this.f13615++;
                    } else {
                        arrayList.add(c9033);
                        this.f13615++;
                    }
                }
                i++;
            } else {
                interfaceC8327.mo10344();
                for (AbstractC10444 abstractC10444 : arrayList) {
                    if (interfaceC8327.mo2357()) {
                        return;
                    }
                    if (abstractC10444.m26387() && !abstractC10444.m26374()) {
                        m47362(abstractC10444.mo23365());
                    }
                }
                interfaceC8327.mo10344();
                for (AbstractC10444 abstractC10445 : arrayList) {
                    if (abstractC10445.m26387()) {
                        m47371(abstractC10445.mo23365());
                    }
                }
                Collections.sort(arrayList, f68464);
                for (AbstractC10444 abstractC10446 : arrayList) {
                    if (abstractC10446.m26387()) {
                        abstractC10446.mo23365().m44705();
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47362(C19616 c19616) throws IOException {
        AbstractC10444 c9033;
        AbstractC20745 abstractC20745M26380 = c19616.m26380();
        String str = c19616.m26393() + "/";
        Iterator it = abstractC20745M26380.mo33983(true).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC8327 interfaceC8327 = this.f68465;
            if (!zHasNext) {
                interfaceC8327.mo10344();
                for (AbstractC10444 abstractC10444 : c19616.f62970) {
                    if (interfaceC8327.mo2357()) {
                        return;
                    }
                    if (abstractC10444.m26387() && !abstractC10444.m26374()) {
                        m47362(abstractC10444.mo23365());
                    }
                }
                return;
            }
            AbstractC20745 abstractC20745 = (AbstractC20745) it.next();
            if (interfaceC8327.mo2357()) {
                return;
            }
            StringBuilder sbM23356 = C9023.m23356(str);
            sbM23356.append(abstractC20745.getName());
            String string = sbM23356.toString();
            AbstractC20745 abstractC20745M15313 = C5553.m15313(this.f68472, string);
            if (!C5553.m15330(abstractC20745.mo33986(), abstractC20745M15313.mo33986())) {
                boolean z = false;
                boolean z2 = c19616.m26389() && abstractC20745M15313.mo33975();
                if (abstractC20745.mo33974()) {
                    c9033 = new C19616();
                } else {
                    c9033 = new C9033();
                    c9033.m26363(abstractC20745.mo33964());
                }
                c9033.m26381(abstractC20745.mo33991());
                if (this.f68468 && abstractC20745.m46723()) {
                    z = true;
                }
                c9033.m26369(z);
                c9033.m26368(abstractC20745);
                c9033.m26383(abstractC20745M15313);
                c9033.m26382(string);
                c9033.m26379(z2);
                if (c19616.m26389() && !z2) {
                    interfaceC8327.mo10346(string);
                    if (abstractC20745.mo24646(abstractC20745M15313)) {
                        if (c9033.m26387()) {
                            abstractC20745M15313.mo32855(c9033.m26392());
                        }
                        this.f68466.add(c9033);
                        this.f13615++;
                        m10992();
                    }
                }
                if (z2) {
                    if (c9033.f35662) {
                        if (abstractC20745M15313.mo33974() && !abstractC20745M15313.m46723()) {
                            m47372(abstractC20745M15313.mo33986());
                            throw null;
                        }
                    } else if (c9033.m26387()) {
                        m47367(abstractC20745M15313);
                    } else {
                        m47375(abstractC20745M15313);
                    }
                }
                if (c9033.f35662 || !c9033.m26387()) {
                    C9033 c9033Mo23366 = c9033.mo23366();
                    if (z2) {
                        if (c19616.m26389()) {
                            c9033Mo23366.m26390();
                        }
                        InterfaceC16088 interfaceC16088 = this.f68467;
                        if (interfaceC16088.mo11428()) {
                            interfaceC16088.mo11424(string, C20321.m45856(abstractC20745), C20321.m45856(abstractC20745M15313), abstractC20745M15313.mo35233());
                        }
                        if (interfaceC16088.mo2357()) {
                            interfaceC8327.mo10345();
                            return;
                        }
                        if (interfaceC16088.mo11431() == 1) {
                            c19616.f62969 = true;
                        } else {
                            if (interfaceC16088.mo11431() == 2) {
                                c9033Mo23366.m26386();
                            } else if (!c9033.f35662) {
                                C5222 c5222 = new C5222();
                                c5222.m14408(abstractC20745M15313);
                                c9033Mo23366.m26366(c5222.m14407());
                            }
                            if (interfaceC16088.mo11431() == 0 && interfaceC16088.mo11432() && abstractC20745M15313.mo35233()) {
                                c9033Mo23366.m26384(true);
                            }
                        }
                    }
                    if (!c9033.f35662) {
                        this.f13613 += c9033.f35657;
                    }
                }
                c19616.f62970.add(c9033);
                this.f13615++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47380(String[] strArr, AbstractC9677 abstractC9677, AbstractC12233 abstractC12233, InterfaceC10594 interfaceC10594) {
        AbstractC10444 c19616;
        C11731 c11731Mo7971;
        C20321 c20321M45855;
        C11731 c11731Mo7972;
        String[] strArr2 = strArr;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            ArrayList<AbstractC10444> arrayList = this.f68474;
            InterfaceC8327 interfaceC8327 = this.f68465;
            if (i < length) {
                String str = strArr2[i];
                if (interfaceC8327.mo2357()) {
                    return;
                }
                InterfaceC2557 interfaceC2557M24620 = abstractC9677.m24620(str);
                C15404 c15404 = (C15404) interfaceC2557M24620;
                String name = c15404.getName();
                String strM18162 = C6730.m18162(this.f68472, name);
                boolean zMo10261 = abstractC12233.mo10261(strM18162);
                if (zMo10261 && this.f68468 && c15404.mo7986()) {
                    m47372(strM18162);
                    throw null;
                }
                if (c15404.isDirectory()) {
                    interfaceC10594.setName(name);
                    c19616 = new C19616();
                    if (zMo10261) {
                        m47361(abstractC12233, strM18162);
                    }
                    length = length;
                } else {
                    C9033 c9033 = new C9033();
                    if (zMo10261) {
                        m47373(abstractC12233, strM18162);
                        InterfaceC16088 interfaceC16088 = this.f68467;
                        if (interfaceC16088.mo11428()) {
                            C20321 c20321M45856 = C20321.m45855(interfaceC2557M24620);
                            try {
                                c20321M45855 = C20321.m45855(abstractC12233.m24620(strM18162));
                            } catch (Exception unused) {
                                c20321M45855 = C20321.f65801;
                            }
                            interfaceC16088.mo11424(name, c20321M45856, c20321M45855, false);
                        }
                        if (interfaceC16088.mo2357()) {
                            interfaceC8327.mo10345();
                            return;
                        }
                        if (interfaceC16088.mo11431() != 1) {
                            if (interfaceC16088.mo11431() == 2) {
                                c9033.m26386();
                            } else if (this.f68475 && (c11731Mo7971 = abstractC12233.m24620(strM18162).mo7971()) != null) {
                                c9033.m26366(new C2399(c11731Mo7971.m29318(), -1, -1));
                            }
                        }
                        i++;
                        strArr2 = strArr;
                        length = length;
                    } else {
                        length = length;
                    }
                    c9033.m26363(c15404.getSize());
                    this.f13613 += c9033.m26359();
                    c19616 = c9033;
                }
                c19616.m26361(name);
                c19616.m26381(c15404.getTime());
                c19616.m26369(this.f68468 && c15404.mo7986());
                if (c19616.m26374()) {
                    c19616.m26364(c15404.mo7978());
                }
                if (this.f68475 && c19616.m26370() == null && (c11731Mo7972 = interfaceC2557M24620.mo7971()) != null) {
                    int iM29318 = c11731Mo7972.m29318();
                    if ((interfaceC2557M24620 instanceof C6794) && C6794.m18392(c11731Mo7972) && !((C6794) interfaceC2557M24620).mo7989().mo46709()) {
                        try {
                            iM29318 = C0055.m951(((C15404) interfaceC2557M24620).getPath()).m15389();
                        } catch (IOException unused2) {
                        }
                    }
                    c19616.m26366(new C2399(iM29318, -1, -1));
                }
                c19616.m26378(c15404.getPath());
                c19616.m26371(strM18162);
                c19616.m26382(name);
                c19616.m26379(zMo10261);
                arrayList.add(c19616);
                this.f13615++;
                i++;
                strArr2 = strArr;
                length = length;
            } else {
                interfaceC8327.mo10344();
                for (AbstractC10444 abstractC10444 : arrayList) {
                    if (interfaceC8327.mo2357()) {
                        return;
                    }
                    if (abstractC10444.m26387() && (!abstractC10444.m26374() || this.f68469)) {
                        m47364(abstractC10444.mo23365(), abstractC9677, abstractC12233, interfaceC10594);
                    }
                }
                interfaceC8327.mo10344();
                for (AbstractC10444 abstractC10445 : arrayList) {
                    if (abstractC10445.m26387()) {
                        m47371(abstractC10445.mo23365());
                    }
                }
                Collections.sort(arrayList, f68464);
                for (AbstractC10444 abstractC10446 : arrayList) {
                    if (abstractC10446.m26387()) {
                        abstractC10446.mo23365().m44705();
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47364(C19616 c19616, AbstractC9677 abstractC9677, AbstractC12233 abstractC12233, InterfaceC10594 interfaceC10594) throws IOException {
        AbstractC10444 c19617;
        C11731 c11731Mo7971;
        C11731 c11731Mo7972;
        C20321 c20321M45855;
        String str = c19616.m26393() + "/";
        Iterator it = abstractC9677.mo10263(c19616.m26362(), true).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC8327 interfaceC8327 = this.f68465;
            if (!zHasNext) {
                interfaceC8327.mo10344();
                for (AbstractC10444 abstractC10444 : c19616.f62970) {
                    if (interfaceC8327.mo2357()) {
                        return;
                    }
                    if (abstractC10444.m26387() && (!abstractC10444.m26374() || this.f68469)) {
                        m47364(abstractC10444.mo23365(), abstractC9677, abstractC12233, interfaceC10594);
                    }
                }
                return;
            }
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            if (interfaceC8327.mo2357()) {
                return;
            }
            StringBuilder sbM23356 = C9023.m23356(str);
            sbM23356.append(interfaceC2557.getName());
            String string = sbM23356.toString();
            String strM18162 = C6730.m18162(this.f68472, string);
            boolean z = false;
            boolean z2 = c19616.m26389() && abstractC12233.mo10261(strM18162);
            if (interfaceC2557.isDirectory()) {
                interfaceC10594.setName(string);
                c19617 = new C19616();
                if (z2) {
                    m47361(abstractC12233, strM18162);
                }
            } else {
                C9033 c9033 = new C9033();
                if (z2) {
                    m47373(abstractC12233, strM18162);
                    InterfaceC16088 interfaceC16088 = this.f68467;
                    if (interfaceC16088.mo11428()) {
                        C20321 c20321M45856 = C20321.m45855(interfaceC2557);
                        try {
                            c20321M45855 = C20321.m45855(abstractC12233.m24620(strM18162));
                        } catch (Exception unused) {
                            c20321M45855 = C20321.f65801;
                        }
                        interfaceC16088.mo11424(string, c20321M45856, c20321M45855, false);
                    }
                    if (interfaceC16088.mo2357()) {
                        interfaceC8327.mo10345();
                        return;
                    } else if (interfaceC16088.mo11431() == 1) {
                        c19616.f62969 = true;
                    } else if (interfaceC16088.mo11431() == 2) {
                        c9033.m26386();
                    } else if (this.f68475 && (c11731Mo7972 = abstractC12233.m24620(strM18162).mo7971()) != null) {
                        c9033.m26366(new C2399(c11731Mo7972.m29318(), -1, -1));
                    }
                }
                c9033.m26363(interfaceC2557.getSize());
                this.f13613 += c9033.m26359();
                c19617 = c9033;
            }
            c19617.m26381(interfaceC2557.getTime());
            if (this.f68468 && interfaceC2557.mo7986()) {
                z = true;
            }
            c19617.m26369(z);
            if (c19617.m26374()) {
                c19617.m26364(interfaceC2557.mo7978());
            }
            if (this.f68475 && c19617.m26370() == null && (c11731Mo7971 = interfaceC2557.mo7971()) != null) {
                int iM29318 = c11731Mo7971.m29318();
                if ((interfaceC2557 instanceof C6794) && C6794.m18392(c11731Mo7971) && !interfaceC2557.mo7989().mo46709()) {
                    try {
                        iM29318 = C0055.m951(interfaceC2557.getPath()).m15389();
                    } catch (IOException unused2) {
                    }
                }
                c19617.m26366(new C2399(iM29318, -1, -1));
            }
            c19617.m26378(interfaceC2557.getPath());
            c19617.m26371(strM18162);
            c19617.m26382(string);
            c19617.m26379(z2);
            c19616.f62970.add(c19617);
            this.f13615++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0192  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47382(String[] strArr, AbstractC12233 abstractC12233, InterfaceC20471 interfaceC20471) throws IOException {
        AbstractC10444 c19616;
        C11731 c11731Mo7971;
        C20321 c20321M45855;
        C11731 c11731Mo7972;
        String[] strArr2 = strArr;
        boolean zMo24615 = abstractC12233.mo24615();
        int length = strArr2.length;
        int i = 0;
        while (true) {
            ArrayList<AbstractC10444> arrayList = this.f68474;
            InterfaceC8327 interfaceC8327 = this.f68465;
            if (i < length) {
                String str = strArr2[i];
                if (interfaceC8327.mo2357()) {
                    return;
                }
                InterfaceC2557 interfaceC2557M24620 = abstractC12233.m24620(str);
                C15404 c15404 = (C15404) interfaceC2557M24620;
                String name = c15404.getName();
                String strM18162 = C6730.m18162(this.f68472, name);
                String path = c15404.getPath();
                if (!zMo24615 ? !path.equals(strM18162) : !path.equalsIgnoreCase(strM18162)) {
                    boolean zMo10261 = abstractC12233.mo10261(strM18162);
                    if (zMo10261 && this.f68468 && c15404.mo7986()) {
                        m47372(strM18162);
                        throw null;
                    }
                    if (c15404.isDirectory()) {
                        interfaceC20471.setName(name);
                        c19616 = new C19616();
                        if (zMo10261) {
                            m47361(abstractC12233, strM18162);
                        }
                        zMo24615 = zMo24615;
                        length = length;
                    } else {
                        C9033 c9033 = new C9033();
                        if (zMo10261) {
                            m47373(abstractC12233, strM18162);
                            InterfaceC16088 interfaceC16088 = this.f68467;
                            if (interfaceC16088.mo11428()) {
                                C20321 c20321M45856 = C20321.m45855(interfaceC2557M24620);
                                try {
                                    c20321M45855 = C20321.m45855(abstractC12233.m24620(strM18162));
                                } catch (Exception unused) {
                                    c20321M45855 = C20321.f65801;
                                }
                                interfaceC16088.mo11424(name, c20321M45856, c20321M45855, false);
                            }
                            if (interfaceC16088.mo2357()) {
                                interfaceC8327.mo10345();
                                return;
                            } else if (interfaceC16088.mo11431() != 1) {
                                if (interfaceC16088.mo11431() == 2) {
                                    c9033.m26386();
                                } else if (this.f68475 && (c11731Mo7971 = abstractC12233.m24620(strM18162).mo7971()) != null) {
                                    c9033.m26366(new C2399(c11731Mo7971.m29318(), -1, -1));
                                }
                            }
                        } else {
                            zMo24615 = zMo24615;
                            length = length;
                        }
                        c9033.m26363(c15404.getSize());
                        this.f13613 = c9033.m26359() + this.f13613;
                        c19616 = c9033;
                    }
                    c19616.m26361(name);
                    c19616.m26381(c15404.getTime());
                    c19616.m26369(this.f68468 && c15404.mo7986());
                    if (c19616.m26374()) {
                        c19616.m26364(c15404.mo7978());
                    }
                    if (this.f68475 && c19616.m26370() == null && (c11731Mo7972 = interfaceC2557M24620.mo7971()) != null) {
                        int iM29318 = c11731Mo7972.m29318();
                        if ((interfaceC2557M24620 instanceof C6794) && C6794.m18392(c11731Mo7972) && !((C6794) interfaceC2557M24620).mo7989().mo46709()) {
                            try {
                                iM29318 = C0055.m951(((C15404) interfaceC2557M24620).getPath()).m15389();
                            } catch (IOException unused2) {
                            }
                        }
                        c19616.m26366(new C2399(iM29318, -1, -1));
                    }
                    c19616.m26378(path);
                    c19616.m26371(strM18162);
                    c19616.m26382(name);
                    c19616.m26379(zMo10261);
                    if (!zMo10261 && c19616.m26387()) {
                        try {
                            if (abstractC12233.mo30347(c19616.m26362(), c19616.m26385())) {
                                this.f68466.add(c19616);
                                this.f13615++;
                                m10992();
                            } else {
                                arrayList.add(c19616);
                                this.f13615++;
                            }
                        } catch (Exception unused3) {
                        }
                    } else {
                        arrayList.add(c19616);
                        this.f13615++;
                    }
                } else {
                    zMo24615 = zMo24615;
                    length = length;
                }
                i++;
                strArr2 = strArr;
                zMo24615 = zMo24615;
                length = length;
            } else {
                interfaceC8327.mo10344();
                for (AbstractC10444 abstractC10444 : arrayList) {
                    if (interfaceC8327.mo2357()) {
                        return;
                    }
                    if (abstractC10444.m26387() && (!abstractC10444.m26374() || this.f68469)) {
                        m47366(abstractC10444.mo23365(), abstractC12233, interfaceC20471);
                    }
                }
                interfaceC8327.mo10344();
                for (AbstractC10444 abstractC10445 : arrayList) {
                    if (abstractC10445.m26387()) {
                        m47371(abstractC10445.mo23365());
                    }
                }
                Collections.sort(arrayList, f68464);
                for (AbstractC10444 abstractC10446 : arrayList) {
                    if (abstractC10446.m26387()) {
                        abstractC10446.mo23365().m44705();
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47366(C19616 c19616, AbstractC12233 abstractC12233, InterfaceC20471 interfaceC20471) throws IOException {
        AbstractC10444 c19617;
        C11731 c11731Mo7971;
        C11731 c11731Mo7972;
        C20321 c20321M45855;
        String str = c19616.m26393() + "/";
        Iterator it = abstractC12233.mo10263(c19616.m26362(), true).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC8327 interfaceC8327 = this.f68465;
            if (!zHasNext) {
                interfaceC8327.mo10344();
                for (AbstractC10444 abstractC10444 : c19616.f62970) {
                    if (interfaceC8327.mo2357()) {
                        return;
                    }
                    if (abstractC10444.m26387() && (!abstractC10444.m26374() || this.f68469)) {
                        m47366(abstractC10444.mo23365(), abstractC12233, interfaceC20471);
                    }
                }
                return;
            }
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            if (interfaceC8327.mo2357()) {
                return;
            }
            StringBuilder sbM23356 = C9023.m23356(str);
            sbM23356.append(interfaceC2557.getName());
            String string = sbM23356.toString();
            String strM18162 = C6730.m18162(this.f68472, string);
            boolean z = false;
            boolean z2 = c19616.m26389() && abstractC12233.mo10261(strM18162);
            if (interfaceC2557.isDirectory()) {
                interfaceC20471.setName(string);
                c19617 = new C19616();
                if (z2) {
                    m47361(abstractC12233, strM18162);
                }
            } else {
                C9033 c9033 = new C9033();
                if (z2) {
                    m47373(abstractC12233, strM18162);
                    InterfaceC16088 interfaceC16088 = this.f68467;
                    if (interfaceC16088.mo11428()) {
                        C20321 c20321M45856 = C20321.m45855(interfaceC2557);
                        try {
                            c20321M45855 = C20321.m45855(abstractC12233.m24620(strM18162));
                        } catch (Exception unused) {
                            c20321M45855 = C20321.f65801;
                        }
                        interfaceC16088.mo11424(string, c20321M45856, c20321M45855, false);
                    }
                    if (interfaceC16088.mo2357()) {
                        interfaceC8327.mo10345();
                        return;
                    } else if (interfaceC16088.mo11431() == 1) {
                        c19616.f62969 = true;
                    } else if (interfaceC16088.mo11431() == 2) {
                        c9033.m26386();
                    } else if (this.f68475 && (c11731Mo7972 = abstractC12233.m24620(strM18162).mo7971()) != null) {
                        c9033.m26366(new C2399(c11731Mo7972.m29318(), -1, -1));
                    }
                }
                c9033.m26363(interfaceC2557.getSize());
                this.f13613 += c9033.m26359();
                c19617 = c9033;
            }
            c19617.m26381(interfaceC2557.getTime());
            if (this.f68468 && interfaceC2557.mo7986()) {
                z = true;
            }
            c19617.m26369(z);
            if (c19617.m26374()) {
                c19617.m26364(interfaceC2557.mo7978());
            }
            if (this.f68475 && c19617.m26370() == null && (c11731Mo7971 = interfaceC2557.mo7971()) != null) {
                int iM29318 = c11731Mo7971.m29318();
                if ((interfaceC2557 instanceof C6794) && C6794.m18392(c11731Mo7971) && !interfaceC2557.mo7989().mo46709()) {
                    try {
                        iM29318 = C0055.m951(interfaceC2557.getPath()).m15389();
                    } catch (IOException unused2) {
                    }
                }
                c19617.m26366(new C2399(iM29318, -1, -1));
            }
            c19617.m26378(interfaceC2557.getPath());
            c19617.m26371(strM18162);
            c19617.m26382(string);
            c19617.m26379(z2);
            c19616.f62970.add(c19617);
            this.f13615++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47379(String[] strArr, AbstractC9677 abstractC9677) {
        AbstractC10444 c9033;
        C11731 c11731Mo7971;
        int length = strArr.length;
        int i = 0;
        while (true) {
            InterfaceC8327 interfaceC8327 = this.f68465;
            ArrayList<AbstractC10444> arrayList = this.f68474;
            if (i < length) {
                String str = strArr[i];
                if (interfaceC8327.mo2357()) {
                    return;
                }
                InterfaceC2557 interfaceC2557M24620 = abstractC9677.m24620(str);
                C15404 c15404 = (C15404) interfaceC2557M24620;
                String name = c15404.getName();
                if (c15404.isDirectory()) {
                    c9033 = new C19616();
                } else {
                    c9033 = new C9033();
                    c9033.m26363(c15404.getSize());
                    this.f13613 = c9033.m26359() + this.f13613;
                }
                c9033.m26361(name);
                c9033.m26381(c15404.getTime());
                c9033.m26369(this.f68468 && c15404.mo7986());
                if (c9033.m26374()) {
                    c9033.m26364(c15404.mo7978());
                }
                if (this.f68475 && (c11731Mo7971 = interfaceC2557M24620.mo7971()) != null) {
                    if (interfaceC2557M24620 instanceof C6794) {
                        if (C6794.m18392(c11731Mo7971)) {
                            if (!((C6794) interfaceC2557M24620).mo7989().mo46709()) {
                                try {
                                    c9033.m26366(new C2399(C0055.m951(((C15404) interfaceC2557M24620).getPath())));
                                } catch (IOException unused) {
                                }
                            }
                        } else {
                            c9033.m26366(new C2399(c11731Mo7971.m29318(), c11731Mo7971.m29325(), c11731Mo7971.m29327()));
                        }
                    } else {
                        c9033.m26366(new C2399(c11731Mo7971.m29318(), -1, -1));
                    }
                }
                c9033.m26378(str);
                c9033.m26371(this.f68472 + name);
                c9033.m26382(name);
                c9033.m26379(false);
                arrayList.add(c9033);
                this.f13615++;
                i++;
            } else {
                interfaceC8327.mo10344();
                for (AbstractC10444 abstractC10444 : arrayList) {
                    if (interfaceC8327.mo2357()) {
                        return;
                    }
                    if (abstractC10444.m26387() && (!abstractC10444.m26374() || this.f68469)) {
                        m47363(abstractC10444.mo23365(), abstractC9677);
                    }
                }
                Collections.sort(arrayList, f68464);
                for (AbstractC10444 abstractC10445 : arrayList) {
                    if (abstractC10445.m26387()) {
                        abstractC10445.mo23365().m44705();
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47363(C19616 c19616, AbstractC9677 abstractC9677) {
        AbstractC10444 c9033;
        C11731 c11731Mo7971;
        String str = c19616.m26393() + "/";
        Iterator it = abstractC9677.mo10263(c19616.m26362(), true).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            InterfaceC8327 interfaceC8327 = this.f68465;
            if (!zHasNext) {
                interfaceC8327.mo10344();
                for (AbstractC10444 abstractC10444 : c19616.f62970) {
                    if (interfaceC8327.mo2357()) {
                        return;
                    }
                    if (abstractC10444.m26387() && (!abstractC10444.m26374() || this.f68469)) {
                        m47363(abstractC10444.mo23365(), abstractC9677);
                    }
                }
                return;
            }
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            if (interfaceC8327.mo2357()) {
                return;
            }
            String strM37076 = C15489.m37076(str, interfaceC2557.getName());
            if (interfaceC2557.isDirectory()) {
                c9033 = new C19616();
            } else {
                c9033 = new C9033();
                c9033.m26363(interfaceC2557.getSize());
                this.f13613 = c9033.m26359() + this.f13613;
            }
            c9033.m26381(interfaceC2557.getTime());
            c9033.m26369(this.f68468 && interfaceC2557.mo7986());
            if (c9033.m26374()) {
                c9033.m26364(interfaceC2557.mo7978());
            }
            if (this.f68475 && (c11731Mo7971 = interfaceC2557.mo7971()) != null) {
                if (!(interfaceC2557 instanceof C6794)) {
                    c9033.m26366(new C2399(c11731Mo7971.m29318(), -1, -1));
                } else if (!C6794.m18392(c11731Mo7971)) {
                    c9033.m26366(new C2399(c11731Mo7971.m29318(), c11731Mo7971.m29325(), c11731Mo7971.m29327()));
                } else if (!interfaceC2557.mo7989().mo46709()) {
                    try {
                        c9033.m26366(new C2399(C0055.m951(interfaceC2557.getPath())));
                    } catch (IOException unused) {
                    }
                }
            }
            c9033.m26378(interfaceC2557.getPath());
            c9033.m26371(this.f68472 + strM37076);
            c9033.m26382(strM37076);
            c9033.m26379(false);
            c19616.f62970.add(c9033);
            this.f13615++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m47372(String str) throws IOException {
        throw new IOException(C0252.m1693("Cannot create symbolic link because it already exists: ", str));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m47373(AbstractC12233 abstractC12233, String str) throws IOException {
        if (abstractC12233.mo10272(str)) {
            throw new IOException(C16523.m38890("File '", str, "' exists but is a directory"));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47361(AbstractC12233 abstractC12233, String str) throws IOException {
        if (!abstractC12233.mo10272(str)) {
            throw new IOException(C16523.m38890("File '", str, "' exists but is not a directory"));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m47375(AbstractC20745 abstractC20745) throws IOException {
        if (abstractC20745.mo33974()) {
            throw new IOException("File '" + abstractC20745 + "' exists but is a directory");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47367(AbstractC20745 abstractC20745) throws IOException {
        if (abstractC20745.mo33974()) {
            return;
        }
        throw new IOException("File '" + abstractC20745 + "' exists but is not a directory");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m47371(C19616 c19616) {
        if (c19616.m26374()) {
            return;
        }
        if (!c19616.m26389()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            c19616.f35656 = countDownLatch;
            Iterator it = c19616.m44704().iterator();
            while (it.hasNext()) {
                ((AbstractC10444) it.next()).mo26365(countDownLatch);
            }
        }
        for (AbstractC10444 abstractC10444 : c19616.m44704()) {
            if (abstractC10444.m26387()) {
                m47371(abstractC10444.mo23365());
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47377(C0196 c0196) {
        m47359(this.f68474, c0196);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47359(ArrayList arrayList, InterfaceC7621 interfaceC7621) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC10444 abstractC10444 = (AbstractC10444) it.next();
            C0196 c0196 = (C0196) interfaceC7621;
            String str = c0196.f1324;
            C8289 c8289 = c0196.f1326;
            int i = c0196.f1325;
            int i2 = C17130.f54631;
            if (!abstractC10444.m26387()) {
                StringBuilder sbM23356 = C9023.m23356(str);
                sbM23356.append(abstractC10444.m26393());
                C12107 entry = c8289.getEntry(sbM23356.toString());
                if (entry != null && (i == 2 || abstractC10444.m26392() <= entry.getTime())) {
                    it.remove();
                    this.f13615--;
                    if (abstractC10444.m26387()) {
                        m47374(abstractC10444.mo23365());
                    } else {
                        this.f13613 -= abstractC10444.f35657;
                    }
                }
            }
            if (abstractC10444.m26387()) {
                m47359(abstractC10444.mo23365().f62970, interfaceC7621);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m47374(C19616 c19616) {
        for (AbstractC10444 abstractC10444 : c19616.f62970) {
            this.f13615--;
            if (abstractC10444.m26387()) {
                m47374(abstractC10444.mo23365());
            } else {
                this.f13613 -= abstractC10444.f35657;
            }
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final List m47385() {
        return C0561.unmodifiableList(this.f68474);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List m47388() {
        return C0561.unmodifiableList(this.f68466);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m47383(boolean z) {
        if (Build.VERSION.SDK_INT < 30) {
            return true;
        }
        C7318 c7318 = new C7318();
        Iterator it = C0561.unmodifiableList(this.f68474).iterator();
        while (it.hasNext()) {
            ((AbstractC10444) it.next()).m26367(c7318, z);
        }
        return c7318.m19525();
    }
}
