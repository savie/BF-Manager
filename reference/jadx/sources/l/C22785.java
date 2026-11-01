package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64SD */
/* JADX INFO: loaded from: classes2.dex */
public final class C22785 extends AbstractC22702 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f74165;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17140 f74166;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC6556 f74167;

    public C22785(EnumC6556 enumC6556) {
        C17140 c17140 = new C17140();
        this.f74166 = c17140;
        this.f74165 = new ArrayList();
        C13638.requireNonNull(enumC6556);
        this.f74167 = enumC6556;
        c17140.m40060(true);
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static C22785 m50438() {
        return new C22785(EnumC6556.ERROR);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22785 m50434(EnumC6556 enumC6556) {
        return new C22785(enumC6556);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22785 m50436(byte[] bArr) {
        return m50437(bArr, EnumC6556.ERROR);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22785 m50437(byte[] bArr, EnumC6556 enumC6556) {
        return m50435(new C1493(bArr), enumC6556);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22785 m50435(AbstractC22702 abstractC22702, EnumC6556 enumC6556) {
        C22785 c22785 = new C22785(enumC6556);
        boolean zMo15780 = abstractC22702.mo5139().mo15780();
        C17140 c17140 = c22785.f74166;
        c17140.m40060(zMo15780);
        for (InterfaceC17721 interfaceC17721 : abstractC22702.mo17615()) {
            C7262 c7262M50439 = c22785.m50439(interfaceC17721.mo19106(), interfaceC17721.getPackageName());
            c7262M50439.m19388(interfaceC17721.mo19107());
            for (InterfaceC22661 interfaceC22661 : interfaceC17721.mo19108()) {
                c7262M50439.m19386(interfaceC22661.mo35685(), interfaceC22661.getPackageName());
            }
            for (InterfaceC14900 interfaceC14900 : interfaceC17721.mo19110()) {
                C19257 c19257M19384 = c7262M50439.m19384(interfaceC14900.getName(), interfaceC14900.mo35622());
                for (InterfaceC21249 interfaceC21249 : interfaceC14900.mo35623()) {
                    c19257M19384.m44200(interfaceC21249.mo42826(), new C15070(interfaceC21249.mo42827()));
                }
            }
            for (InterfaceC18427 interfaceC18427 : interfaceC17721.mo19111()) {
                C20668 c20668M19391 = c7262M50439.m19391();
                for (InterfaceC7844 interfaceC7844 : interfaceC18427.mo37321()) {
                    c20668M19391.m46514(interfaceC7844.mo20683(), interfaceC7844.mo20682());
                }
            }
            for (InterfaceC19133 interfaceC19133 : interfaceC17721.mo19112()) {
                C0206 c0206M19392 = c7262M50439.m19392(interfaceC19133.mo26942(), interfaceC19133.getTypeName());
                c0206M19392.m1518(interfaceC19133.mo1519());
                C18623 c18623 = new C18623();
                ArrayList<InterfaceC12783> arrayList = new ArrayList(interfaceC19133.mo1536());
                Iterator it = interfaceC19133.mo25271().iterator();
                while (it.hasNext()) {
                    arrayList.add((InterfaceC12783) it.next());
                }
                Collections.sort(arrayList, C7618.comparing(new C3105(1)));
                for (InterfaceC12783 interfaceC12783 : arrayList) {
                    if (c18623.add(interfaceC12783.mo31757())) {
                        C21373 c21373M1523 = c0206M19392.m1523(interfaceC12783.mo31747());
                        c21373M1523.m47906(interfaceC12783.mo31750());
                        c21373M1523.m47905(interfaceC12783.mo31748());
                        for (InterfaceC3609 interfaceC3609 : interfaceC12783.mo31746()) {
                            c0206M19392.m1526(interfaceC3609.mo10691(), interfaceC3609.mo7645(), true);
                            c21373M1523.m47902(interfaceC3609.mo10691()).m42940(interfaceC3609);
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (C0206 c0206 : c7262M50439.mo19112()) {
                for (int iMo1536 = c0206.mo1536() - 1; iMo1536 >= 0; iMo1536--) {
                    if (!c0206.mo1530(iMo1536).mo31746().iterator().hasNext()) {
                        c0206.m1517(iMo1536);
                    }
                }
                if (c0206.mo1536() == 0) {
                    arrayList2.add(Integer.valueOf(c0206.mo26942()));
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                c7262M50439.m19385(((Integer) it2.next()).intValue());
            }
        }
        c17140.m40056();
        return c22785;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7262 m50439(int i, String str) {
        ArrayList<C7262> arrayList = this.f74165;
        for (C7262 c7262 : arrayList) {
            if (c7262.mo19106() == i) {
                if (!c7262.getPackageName().equals(str)) {
                    EnumC6556 enumC6556 = EnumC6556.MERGE;
                    EnumC6556 enumC6557 = this.f74167;
                    if (enumC6557 != enumC6556) {
                        if (enumC6557 == EnumC6556.ERROR) {
                            throw new RuntimeException(String.format("There is already a package with id of 0x%02x, named \"%s\" not \"%s\"", Integer.valueOf(i), c7262.getPackageName(), str));
                        }
                        if (enumC6557 == EnumC6556.CREATE) {
                            break;
                        }
                    }
                }
                return c7262;
            }
        }
        C7262 c7263 = new C7262(this, i, str);
        arrayList.add(c7263);
        return c7263;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m50445() {
        C17140 c17140 = this.f74166;
        c17140.m40064();
        Iterator it = m50269().iterator();
        while (it.hasNext()) {
            ((C7262) it.next()).m19393();
        }
        c17140.m40054();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50440(OutputStream outputStream) throws IOException {
        C11018 c11018 = new C11018();
        m50441(c11018, (C8516) null);
        c11018.m27780(outputStream);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50441(InterfaceC16662 interfaceC16662, C8516 c8516) {
        ArrayList<C14319> arrayList = new ArrayList();
        Iterator it = m50269().iterator();
        int size = 0;
        while (it.hasNext()) {
            C14319 c14319 = new C14319((C7262) it.next());
            arrayList.add(c14319);
            size += c14319.f46903.size();
        }
        interfaceC16662.mo24505((short) 2);
        interfaceC16662.mo24505((short) 12);
        long position = interfaceC16662.getPosition();
        interfaceC16662.mo24500();
        interfaceC16662.writeInt(size);
        this.f74166.m40059(interfaceC16662, true, c8516);
        for (C14319 c143110 : arrayList) {
            c143110.f46905.m19389(interfaceC16662, c8516, c143110);
        }
        long position2 = interfaceC16662.getPosition();
        interfaceC16662.seek(position);
        interfaceC16662.writeInt((int) ((position2 - position) + 4));
        interfaceC16662.seek(position2);
    }

    @Override // l.InterfaceC6432
    /* JADX INFO: renamed from: ֨ܰ */
    public final InterfaceC5727 mo5139() {
        return this.f74166;
    }

    @Override // l.InterfaceC6432
    /* JADX INFO: renamed from: ֨ܰ */
    public final C17140 mo5139() {
        return this.f74166;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C8516 m50444() {
        int iM40061 = this.f74166.m40061();
        for (C7262 c7262 : m50269()) {
            c7262.getClass();
            HashMap map = new HashMap();
            int iM1532 = 0;
            int iMax = 1;
            for (C0206 c0206 : c7262.mo19112()) {
                String typeName = c0206.getTypeName();
                Integer num = (Integer) map.get(typeName);
                int iIntValue = num == null ? 1 : num.intValue() + 1;
                map.put(typeName, Integer.valueOf(iIntValue));
                iMax = Math.max(iMax, iIntValue);
                iM1532 += c0206.m1532();
            }
            iM40061 = C1694.m5620(iMax, 3, iM1532, iM40061);
        }
        return new C8516(iM40061);
    }

    @Override // l.InterfaceC6432
    /* JADX INFO: renamed from: ۡ */
    public final int mo5141() {
        return this.f74165.size();
    }

    @Override // l.InterfaceC6432
    /* JADX INFO: renamed from: ۜ */
    public final C7262 mo5140(int i) {
        return (C7262) this.f74165.get(i);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m50442() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f74165;
            if (i >= arrayList.size()) {
                return;
            }
            if (((C7262) arrayList.get(i)).getPackageName().equals("bin.mt.plus.TranslationData")) {
                arrayList.remove(i);
                return;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C7262 m50443() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f74165;
            if (i >= arrayList.size()) {
                return null;
            }
            if (((C7262) arrayList.get(i)).getPackageName().equals("bin.mt.plus.TranslationData")) {
                return (C7262) arrayList.get(i);
            }
            i++;
        }
    }
}
