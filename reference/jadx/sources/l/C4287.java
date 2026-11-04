package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q77G */
/* JADX INFO: loaded from: classes2.dex */
public final class C4287 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m13666(InterfaceC8697 interfaceC8697) {
        C6178 c6178 = new C6178(256);
        c6178.writeInt(1);
        c6178.m17789(interfaceC8697.mo18155());
        c6178.m17789(interfaceC8697.mo18152());
        c6178.m17789(interfaceC8697.mo18157());
        c6178.m17789(interfaceC8697.mo18151());
        c6178.writeInt(interfaceC8697.getParent());
        ArrayList<InterfaceC5650> arrayList = new ArrayList(interfaceC8697.mo18154());
        Iterator it = interfaceC8697.values().iterator();
        while (it.hasNext()) {
            arrayList.add((InterfaceC5650) it.next());
        }
        if (!interfaceC8697.mo18155() ? false : "style".equals(C10208.m26336(interfaceC8697.getType().getTypeName()))) {
            C12884.sort(arrayList, C2661.comparingInt(new C23340(1)));
        }
        c6178.writeInt(arrayList.size());
        for (InterfaceC5650 interfaceC5650 : arrayList) {
            c6178.writeInt(interfaceC5650.mo16637());
            c6178.writeInt(interfaceC5650.mo16635());
            if (interfaceC5650.mo16636() && interfaceC5650.mo11710() != null) {
                c6178.writeInt(0);
                c6178.m17789(true);
                InterfaceC16090 interfaceC16090Mo11710 = interfaceC5650.mo11710();
                c6178.m17786((CharSequence) interfaceC16090Mo11710.getValue());
                C25042[] c25042ArrMo8826 = interfaceC16090Mo11710.mo8826();
                c6178.writeInt(c25042ArrMo8826 == null ? 0 : c25042ArrMo8826.length);
                if (c25042ArrMo8826 != null) {
                    for (C25042 c25042 : c25042ArrMo8826) {
                        c6178.m17810(c25042.f81015);
                        c6178.writeInt(c25042.f81016);
                        c6178.writeInt(c25042.f81014);
                    }
                }
            } else {
                c6178.writeInt(interfaceC5650.getValue());
                c6178.writeByte(0);
            }
        }
        return c6178.m17796();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m13663(byte[] bArr) {
        return C15022.m36182(C15022.m36183().digest(bArr)).substring(0, 16);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12490 m13664(InterfaceC2731 interfaceC2731, int i, byte[] bArr) throws C10186 {
        C6525 c6525;
        try {
            C20348 c20348 = new C20348(bArr);
            if (c20348.readInt() != 1) {
                throw new IOException("Unsupported resource entry payload version");
            }
            boolean zM46753 = c20348.m46753();
            boolean zM46754 = c20348.m46753();
            boolean zM46755 = c20348.m46753();
            boolean zM46756 = c20348.m46753();
            int i2 = c20348.readInt();
            int i3 = c20348.readInt();
            if (i3 >= 0) {
                int i4 = 100000;
                if (i3 <= 100000) {
                    ArrayList arrayList = new ArrayList(i3);
                    C12490 c12490 = new C12490(interfaceC2731, i, zM46753, zM46754, zM46755, zM46756, i2, arrayList);
                    int i5 = 0;
                    while (i5 < i3) {
                        int i6 = c20348.readInt();
                        int i7 = c20348.readInt();
                        int i8 = c20348.readInt();
                        if (c20348.m46753()) {
                            String strM46756 = c20348.m46756();
                            int i9 = c20348.readInt();
                            if (i9 < 0 || i9 > i4) {
                                throw new IOException("Invalid resource entry payload style count");
                            }
                            C25042[] c25042Arr = new C25042[i9];
                            for (int i10 = 0; i10 < i9; i10++) {
                                c25042Arr[i10] = new C25042(c20348.m46743(), c20348.readInt(), c20348.readInt());
                            }
                            c6525 = new C6525(strM46756, c25042Arr);
                        } else {
                            c6525 = null;
                        }
                        arrayList.add(new C24425(c12490, i6, i7, i8, c6525));
                        i5++;
                        i4 = 100000;
                    }
                    if (c20348.available() == 0) {
                        return c12490;
                    }
                    throw new IOException("Trailing resource entry payload bytes");
                }
            }
            throw new IOException("Invalid resource entry payload value count");
        } catch (Exception e) {
            throw C10186.m26305("RESOURCE_PATCH_CORRUPT", e.getMessage() == null ? "Resource patch is corrupt." : e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23001 m13665(C24296 c24296, ArrayList arrayList) {
        C20695 c20695;
        C23001 c23001M51887 = C23001.m51887(new C5209(c24296, arrayList), EnumC11066.CREATE, true);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1260 c1260 = (C1260) it.next();
            if (!c1260.m4578() && !c1260.m4580()) {
                int i = c1260.f4547;
                String str = c1260.f4549;
                byte[] bArr = c1260.f4545;
                int i2 = (i >>> 24) & 255;
                int i3 = (i >>> 16) & 255;
                int i4 = i & 65535;
                Iterator it2 = c23001M51887.mo15672().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        c20695 = null;
                        break;
                    }
                    C25239 c25239 = (C25239) it2.next();
                    if (c25239.mo27607() == i2) {
                        for (C23747 c23747 : c25239.mo19822()) {
                            if (c23747.mo35833() == i3) {
                                for (C20017 c20017 : c23747.mo33925()) {
                                    if (C10208.m26337(c20017).equals(str) && c20017.mo9075(i4)) {
                                        c20695 = new C20695(c20017);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (c20695 != null) {
                    C20017 c20018 = c20695.f66325;
                    C12490 c12490M13664 = m13664(c20018, i4, bArr);
                    c20018.m46056(i4);
                    c20018.m46050(i4).m32853((InterfaceC8697) c12490M13664);
                } else {
                    throw C10186.m26305("RESOURCE_PATCH_CORRUPT", "Resource patch target is missing from base resources.arsc.");
                }
            }
        }
        return c23001M51887;
    }
}
