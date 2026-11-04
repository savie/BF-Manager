package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64SD */
/* JADX INFO: loaded from: classes2.dex */
public final class C23001 extends AbstractC20105 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12558 f74658;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f74659;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC11066 f74660;

    public C23001(EnumC11066 enumC11066) {
        C12558 c12558 = new C12558();
        this.f74658 = c12558;
        this.f74659 = new ArrayList();
        C17359.requireNonNull(enumC11066);
        this.f74660 = enumC11066;
        c12558.m31250(true);
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static C23001 m51886() {
        return new C23001(EnumC11066.ERROR);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23001 m51888(EnumC11066 enumC11066) {
        return new C23001(enumC11066);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23001 m51889(byte[] bArr) {
        return m51890(bArr, EnumC11066.ERROR);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23001 m51890(byte[] bArr, EnumC11066 enumC11066) {
        return m51887(new C24296(bArr), enumC11066, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23001 m51887(InterfaceC7206 interfaceC7206, EnumC11066 enumC11066, boolean z) {
        C23001 c23001 = new C23001(enumC11066);
        boolean zMo11157 = interfaceC7206.mo15675().mo11157();
        C12558 c12558 = c23001.f74658;
        c12558.m31250(zMo11157);
        for (InterfaceC10869 interfaceC10869 : interfaceC7206.mo15672()) {
            C25239 c25239M51891 = c23001.m51891(interfaceC10869.mo27607(), interfaceC10869.getPackageName());
            c25239M51891.m56370(interfaceC10869.mo27606());
            for (InterfaceC13917 interfaceC13917 : interfaceC10869.mo19828()) {
                c25239M51891.m56368(interfaceC13917.mo33895(), interfaceC13917.getPackageName());
            }
            for (InterfaceC4904 interfaceC4904 : interfaceC10869.mo19824()) {
                C2118 c2118M56366 = c25239M51891.m56366(interfaceC4904.getName(), interfaceC4904.mo15048());
                for (InterfaceC22058 interfaceC22058 : interfaceC4904.mo15047()) {
                    c2118M56366.m7298(interfaceC22058.mo7535(), new C14763(interfaceC22058.mo7534()));
                }
            }
            for (InterfaceC22804 interfaceC22804 : interfaceC10869.mo19825()) {
                C17033 c17033M56372 = c25239M51891.m56372();
                for (InterfaceC19820 interfaceC19820 : interfaceC22804.mo12015()) {
                    c17033M56372.m40125(interfaceC19820.mo45587(), interfaceC19820.mo45586());
                }
            }
            for (InterfaceC15344 interfaceC15344 : interfaceC10869.mo19822()) {
                C23747 c23747M56375 = c25239M51891.m56375(interfaceC15344.mo35833(), interfaceC15344.getTypeName());
                c23747M56375.m53028(interfaceC15344.mo4328());
                C18037 c18037 = new C18037(0);
                ArrayList<InterfaceC2731> arrayList = new ArrayList(interfaceC15344.mo4331());
                Iterator it = interfaceC15344.mo33925().iterator();
                while (it.hasNext()) {
                    arrayList.add((InterfaceC2731) it.next());
                }
                Collections.sort(arrayList, C2661.comparing(new C22255(0)));
                for (InterfaceC2731 interfaceC2731 : arrayList) {
                    if (c18037.add(interfaceC2731.mo9074())) {
                        C20017 c20017M53013 = c23747M56375.m53013(interfaceC2731.mo9073());
                        c20017M53013.m46055(interfaceC2731.mo9072());
                        c20017M53013.m46053(interfaceC2731.mo9067());
                        for (InterfaceC8697 interfaceC8697 : interfaceC2731.mo9078()) {
                            c23747M56375.m53016(interfaceC8697.mo23383(), interfaceC8697.mo18156(), true);
                            c20017M53013.m46050(interfaceC8697.mo23383()).m32853(interfaceC8697);
                        }
                    }
                }
            }
            if (!z) {
                ArrayList arrayList2 = new ArrayList();
                for (C23747 c23747 : c25239M51891.mo19822()) {
                    for (int iMo4331 = c23747.mo4331() - 1; iMo4331 >= 0; iMo4331--) {
                        if (!c23747.mo4334(iMo4331).mo9078().iterator().hasNext()) {
                            c23747.m53023(iMo4331);
                        }
                    }
                    if (c23747.mo4331() == 0) {
                        arrayList2.add(Integer.valueOf(c23747.mo35833()));
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    c25239M51891.m56367(((Integer) it2.next()).intValue());
                }
            }
        }
        c12558.m31257();
        return c23001;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25239 m51891(int i, String str) {
        ArrayList<C25239> arrayList = this.f74659;
        for (C25239 c25239 : arrayList) {
            if (c25239.mo27607() == i) {
                if (!c25239.getPackageName().equals(str)) {
                    EnumC11066 enumC11066 = EnumC11066.MERGE;
                    EnumC11066 enumC11067 = this.f74660;
                    if (enumC11067 != enumC11066) {
                        if (enumC11067 == EnumC11066.ERROR) {
                            throw new RuntimeException(String.format("There is already a package with id of 0x%02x, named \"%s\" not \"%s\"", Integer.valueOf(i), c25239.getPackageName(), str));
                        }
                        if (enumC11067 == EnumC11066.CREATE) {
                            break;
                        }
                    }
                }
                return c25239;
            }
        }
        C25239 c252310 = new C25239(this, i, str);
        arrayList.add(c252310);
        return c252310;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m51897() {
        C12558 c12558 = this.f74658;
        c12558.m31253();
        Iterator it = m46228().iterator();
        while (it.hasNext()) {
            ((C25239) it.next()).m56374();
        }
        c12558.m31252();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51892(OutputStream outputStream) throws IOException {
        C6178 c6178 = new C6178();
        m51893(c6178, (C3374) null);
        c6178.m17784(outputStream);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51893(InterfaceC23332 interfaceC23332, C3374 c3374) {
        ArrayList<C14795> arrayList = new ArrayList();
        Iterator it = m46228().iterator();
        int size = 0;
        while (it.hasNext()) {
            C14795 c14795 = new C14795((C25239) it.next());
            arrayList.add(c14795);
            size += c14795.f48404.size();
        }
        interfaceC23332.mo17788((short) 2);
        interfaceC23332.mo17788((short) 12);
        long position = interfaceC23332.getPosition();
        interfaceC23332.mo17795();
        interfaceC23332.writeInt(size);
        this.f74658.m31249(interfaceC23332, true, c3374);
        for (C14795 c14796 : arrayList) {
            c14796.f48406.m56371(interfaceC23332, c3374, c14796);
        }
        long position2 = interfaceC23332.getPosition();
        interfaceC23332.seek(position);
        interfaceC23332.writeInt((int) ((position2 - position) + 4));
        interfaceC23332.seek(position2);
    }

    @Override // l.InterfaceC7206
    /* JADX INFO: renamed from: ۫᩷ */
    public final InterfaceC3412 mo15675() {
        return this.f74658;
    }

    @Override // l.InterfaceC7206
    /* JADX INFO: renamed from: ۫᩷ */
    public final C12558 mo15675() {
        return this.f74658;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C3374 m51896() {
        int iM31254 = this.f74658.m31254();
        for (C25239 c25239 : m46228()) {
            c25239.getClass();
            HashMap map = new HashMap();
            int iM53010 = 0;
            int iMax = 1;
            for (C23747 c23747 : c25239.mo19822()) {
                String typeName = c23747.getTypeName();
                Integer num = (Integer) map.get(typeName);
                int iIntValue = num == null ? 1 : num.intValue() + 1;
                map.put(typeName, Integer.valueOf(iIntValue));
                iMax = Math.max(iMax, iIntValue);
                iM53010 += c23747.m53010();
            }
            iM31254 = C12669.m31436(iMax, 3, iM53010, iM31254);
        }
        return new C3374(iM31254);
    }

    @Override // l.InterfaceC7206
    /* JADX INFO: renamed from: ۨ */
    public final int mo15674() {
        return this.f74659.size();
    }

    @Override // l.InterfaceC7206
    /* JADX INFO: renamed from: ۧ */
    public final C25239 mo15673(int i) {
        return (C25239) this.f74659.get(i);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m51894() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f74659;
            if (i >= arrayList.size()) {
                return;
            }
            if (((C25239) arrayList.get(i)).getPackageName().equals("bin.mt.plus.TranslationData")) {
                arrayList.remove(i);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C25239 m51895() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f74659;
            if (i >= arrayList.size()) {
                return null;
            }
            if (((C25239) arrayList.get(i)).getPackageName().equals("bin.mt.plus.TranslationData")) {
                return (C25239) arrayList.get(i);
            }
            i++;
        }
    }
}
