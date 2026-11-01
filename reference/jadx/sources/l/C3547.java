package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۗ᩺۬, reason: contains not printable characters */
/* JADX INFO: compiled from: L6Y6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3547 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC5435 f13051;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C2136 f13052;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f13053;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C11786 f13054;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C13903 f13055;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1201 f13056;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C13903 f13057;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C3070 f13058;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2136 f13059;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f13060;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f13061;

    public /* synthetic */ C3547(C1201 c1201, AbstractC20745 abstractC20745, String str, boolean z, C3070 c3070, C4253 c4253, C4023 c4023, int i) {
        this(c1201, abstractC20745, str, z, c3070, c4253, c4023);
    }

    public C3547(C1201 c1201, AbstractC20745 abstractC20745, String str, boolean z, C3070 c3070, C4253 c4253) {
        this(c1201, abstractC20745, str, z, c3070, c4253, null);
    }

    public C3547(C1201 c1201, AbstractC20745 abstractC20745, String str, boolean z, C3070 c3070, C4253 c4253, C4023 c4023) {
        this.f13056 = c1201;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f13053 = arrayDeque;
        this.f13051 = c4023;
        this.f13060 = z;
        this.f13058 = c3070;
        this.f13061 = c4253.f15366;
        arrayDeque.push(m10461(abstractC20745, str, ""));
        String str2 = c4253.f15365;
        if (str2.isEmpty()) {
            return;
        }
        String[] strArrSplit = str2.split("/");
        for (int i = 0; i < strArrSplit.length; i++) {
            String str3 = strArrSplit[i];
            C13903 c13903 = (C13903) this.f13053.peek();
            List list = c13903.f45805;
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = (i2 + size) >>> 1;
                if (((C2136) list.get(i3)).f7805.compareTo(str3) <= 0) {
                    i2 = i3 + 1;
                } else {
                    size = i3;
                }
            }
            c13903.f45804 = i2;
            if (i2 == 0) {
                return;
            }
            int i4 = i2 - 1;
            if (!((C2136) list.get(i4)).f7805.equals(str3)) {
                return;
            }
            C2136 c2136 = (C2136) list.get(i4);
            if (this.f13051 == null || i != strArrSplit.length - 1) {
                if (!this.f13060 || !m10463(c2136, c13903)) {
                    return;
                }
            } else {
                if (this.f13060 && c2136.f7804.m16196() == EnumC12279.DIRECTORY) {
                    this.f13052 = c2136;
                    this.f13055 = c13903;
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m10463(C2136 c2136, C13903 c13903) throws C12731 {
        try {
            return m10466(c2136, c13903);
        } catch (C12731 e) {
            InterfaceC5435 interfaceC5435 = this.f13051;
            if (interfaceC5435 != null) {
                C21663.m48395(((C4023) interfaceC5435).f14881, "directory_unreadable");
                return false;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m10466(C2136 c2136, C13903 c13903) {
        C5928 c5928 = c2136.f7804;
        String strM5594 = c2136.f7805;
        String str = c2136.f7803;
        EnumC12279 enumC12279M16196 = c5928.m16196();
        EnumC12279 enumC12279 = EnumC12279.DIRECTORY;
        if (enumC12279M16196 != enumC12279) {
            return false;
        }
        boolean z = c13903.f45803;
        String str2 = c13903.f45802;
        C5928 c5928M8503 = z ? this.f13056.f5313.m8503(str) : c2136.f7804;
        if (c5928M8503.m16196() != enumC12279) {
            return false;
        }
        if (!str2.isEmpty()) {
            strM5594 = C1679.m5594(str2, "/", strM5594);
        }
        this.f13053.push(m10461(c5928M8503.m16195(), str, strM5594));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m10462() throws C12731 {
        String string;
        if (this.f13054 == null) {
            C11786 c11786 = null;
            if (this.f13052 != null) {
                C21663.m48393();
                C2136 c2136 = this.f13052;
                C13903 c13903 = this.f13055;
                this.f13052 = null;
                this.f13055 = null;
                m10463(c2136, c13903);
            }
            while (true) {
                ArrayDeque arrayDeque = this.f13053;
                if (!arrayDeque.isEmpty()) {
                    InterfaceC5435 interfaceC5435 = this.f13051;
                    if (interfaceC5435 != null) {
                        C21663.m48393();
                    }
                    C13903 c13904 = (C13903) arrayDeque.peek();
                    int i = c13904.f45804;
                    String str = c13904.f45802;
                    List list = c13904.f45805;
                    if (i < list.size()) {
                        int i2 = c13904.f45804;
                        c13904.f45804 = i2 + 1;
                        C2136 c2137 = (C2136) list.get(i2);
                        if (str.isEmpty()) {
                            string = c2137.f7805;
                        } else {
                            StringBuilder sbM8976 = C3012.m8976(str, "/");
                            sbM8976.append(c2137.f7805);
                            string = sbM8976.toString();
                        }
                        if (interfaceC5435 != null) {
                            this.f13059 = c2137;
                            this.f13057 = c13904;
                        } else if (this.f13060) {
                            m10463(c2137, c13904);
                        }
                        c11786 = new C11786(c2137.f7804, string);
                        break;
                    }
                    arrayDeque.pop();
                } else {
                    break;
                }
            }
            this.f13054 = c11786;
        }
        return this.f13054 != null;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C11786 m10465(C3547 c3547) {
        if (!c3547.m10462()) {
            throw new IllegalStateException("No more file entries");
        }
        C11786 c11786 = c3547.f13054;
        if (c3547.f13051 != null) {
            C2136 c2136 = c3547.f13059;
            C13903 c13903 = c3547.f13057;
            if (c3547.f13060 && c2136.f7804.m16196() == EnumC12279.DIRECTORY) {
                c3547.f13052 = c2136;
                c3547.f13055 = c13903;
            }
            c3547.f13059 = null;
            c3547.f13057 = null;
        }
        c3547.f13054 = null;
        return c11786;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m10467(C3547 c3547) {
        if (c3547.f13054 != null || c3547.f13052 != null) {
            return true;
        }
        for (C13903 c13903 : c3547.f13053) {
            if (c13903.f45804 < c13903.f45805.size()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C13903 m10461(AbstractC20745 abstractC20745, String str, String str2) throws C12731 {
        C3070 c3070 = this.f13058;
        C4729 c4729 = new C4729(this.f13061, c3070.f11560, str);
        C1201 c1201 = this.f13056;
        List listM4387 = C1201.m4387(c1201, c4729);
        if (listM4387 != null) {
            return new C13903(str2, listM4387, true);
        }
        c1201.f5313.getClass();
        try {
            List<C5928> listMo8397 = abstractC20745.mo33989().mo8397();
            ArrayList arrayList = new ArrayList(listMo8397.size());
            for (C5928 c5928 : listMo8397) {
                if (c5928.m16196() != EnumC12279.MISSING) {
                    String strM4392 = C1201.m4392(str, c5928.m16195().mo33986());
                    if (c3070.m9208(strM4392).f6625.m51848()) {
                        arrayList.add(new C2136(c5928, strM4392, C1201.m4391(str, strM4392)));
                    }
                }
            }
            C23846.sort(arrayList, C7618.comparing(new C9899()));
            C1201.m4389(c1201, c4729, arrayList);
            return new C13903(str2, arrayList, false);
        } catch (C20040 e) {
            throw C2800.m8500(e);
        }
    }
}
