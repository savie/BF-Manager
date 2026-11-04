package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۖܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6Y6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2707 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f8606;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13893 f8607;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9113 f8608;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C7182 f8609;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23043 f8610;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC22297 f8611;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f8612;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C7182 f8613;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C1216 f8614;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C1216 f8615;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f8616;

    public /* synthetic */ C2707(C23043 c23043, AbstractC22044 abstractC22044, String str, boolean z, C9113 c9113, C13148 c13148, C13346 c13346, int i) {
        this(c23043, abstractC22044, str, z, c9113, c13148, c13346);
    }

    public C2707(C23043 c23043, AbstractC22044 abstractC22044, String str, boolean z, C9113 c9113, C13148 c13148) {
        this(c23043, abstractC22044, str, z, c9113, c13148, null);
    }

    public C2707(C23043 c23043, AbstractC22044 abstractC22044, String str, boolean z, C9113 c9113, C13148 c13148, C13346 c13346) {
        this.f8610 = c23043;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f8606 = arrayDeque;
        this.f8611 = c13346;
        this.f8612 = z;
        this.f8608 = c9113;
        this.f8616 = c13148.f42068;
        arrayDeque.push(m8891(abstractC22044, str, ""));
        String str2 = c13148.f42067;
        if (str2.isEmpty()) {
            return;
        }
        String[] strArrSplit = str2.split("/");
        for (int i = 0; i < strArrSplit.length; i++) {
            String str3 = strArrSplit[i];
            C7182 c7182 = (C7182) this.f8606.peek();
            List list = c7182.f23724;
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = (i2 + size) >>> 1;
                if (((C1216) list.get(i3)).f4453.compareTo(str3) <= 0) {
                    i2 = i3 + 1;
                } else {
                    size = i3;
                }
            }
            c7182.f23723 = i2;
            if (i2 == 0) {
                return;
            }
            int i4 = i2 - 1;
            if (!((C1216) list.get(i4)).f4453.equals(str3)) {
                return;
            }
            C1216 c1216 = (C1216) list.get(i4);
            if (this.f8611 == null || i != strArrSplit.length - 1) {
                if (!this.f8612 || !m8893(c1216, c7182)) {
                    return;
                }
            } else {
                if (this.f8612 && c1216.f4452.m6567() == EnumC13093.DIRECTORY) {
                    this.f8615 = c1216;
                    this.f8613 = c7182;
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8893(C1216 c1216, C7182 c7182) throws C10186 {
        try {
            return m8896(c1216, c7182);
        } catch (C10186 e) {
            InterfaceC22297 interfaceC22297 = this.f8611;
            if (interfaceC22297 != null) {
                C25281.m56460(((C13346) interfaceC22297).f42557, "directory_unreadable");
                return false;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m8896(C1216 c1216, C7182 c7182) {
        C1907 c1907 = c1216.f4452;
        String strM46451 = c1216.f4453;
        String str = c1216.f4451;
        EnumC13093 enumC13093M6567 = c1907.m6567();
        EnumC13093 enumC13093 = EnumC13093.DIRECTORY;
        if (enumC13093M6567 != enumC13093) {
            return false;
        }
        boolean z = c7182.f23722;
        String str2 = c7182.f23725;
        C1907 c1907M50234 = z ? this.f8610.f74785.m50234(str) : c1216.f4452;
        if (c1907M50234.m6567() != enumC13093) {
            return false;
        }
        if (!str2.isEmpty()) {
            strM46451 = C20196.m46451(str2, "/", strM46451);
        }
        this.f8606.push(m8891(c1907M50234.m6565(), str, strM46451));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m8892() throws C10186 {
        String string;
        if (this.f8607 == null) {
            C13893 c13893 = null;
            if (this.f8615 != null) {
                C25281.m56458();
                C1216 c1216 = this.f8615;
                C7182 c7182 = this.f8613;
                this.f8615 = null;
                this.f8613 = null;
                m8893(c1216, c7182);
            }
            while (true) {
                ArrayDeque arrayDeque = this.f8606;
                if (!arrayDeque.isEmpty()) {
                    InterfaceC22297 interfaceC22297 = this.f8611;
                    if (interfaceC22297 != null) {
                        C25281.m56458();
                    }
                    C7182 c7183 = (C7182) arrayDeque.peek();
                    int i = c7183.f23723;
                    String str = c7183.f23725;
                    List list = c7183.f23724;
                    if (i < list.size()) {
                        int i2 = c7183.f23723;
                        c7183.f23723 = i2 + 1;
                        C1216 c1217 = (C1216) list.get(i2);
                        if (str.isEmpty()) {
                            string = c1217.f4453;
                        } else {
                            StringBuilder sbM10405 = C3188.m10405(str, "/");
                            sbM10405.append(c1217.f4453);
                            string = sbM10405.toString();
                        }
                        if (interfaceC22297 != null) {
                            this.f8614 = c1217;
                            this.f8609 = c7183;
                        } else if (this.f8612) {
                            m8893(c1217, c7183);
                        }
                        c13893 = new C13893(c1217.f4452, string);
                        break;
                    }
                    arrayDeque.pop();
                } else {
                    break;
                }
            }
            this.f8607 = c13893;
        }
        return this.f8607 != null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C13893 m8895(C2707 c2707) {
        if (!c2707.m8892()) {
            throw new IllegalStateException("No more file entries");
        }
        C13893 c13893 = c2707.f8607;
        if (c2707.f8611 != null) {
            C1216 c1216 = c2707.f8614;
            C7182 c7182 = c2707.f8609;
            if (c2707.f8612 && c1216.f4452.m6567() == EnumC13093.DIRECTORY) {
                c2707.f8615 = c1216;
                c2707.f8613 = c7182;
            }
            c2707.f8614 = null;
            c2707.f8609 = null;
        }
        c2707.f8607 = null;
        return c13893;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m8897(C2707 c2707) {
        if (c2707.f8607 != null || c2707.f8615 != null) {
            return true;
        }
        for (C7182 c7182 : c2707.f8606) {
            if (c7182.f23723 < c7182.f23724.size()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C7182 m8891(AbstractC22044 abstractC22044, String str, String str2) throws C10186 {
        C9113 c9113 = this.f8608;
        C8673 c8673 = new C8673(this.f8616, c9113.f29602, str);
        C23043 c23043 = this.f8610;
        List listM51941 = C23043.m51941(c23043, c8673);
        if (listM51941 != null) {
            return new C7182(str2, listM51941, true);
        }
        c23043.f74785.getClass();
        try {
            List<C1907> listMo8792 = abstractC22044.mo4298().mo8792();
            ArrayList arrayList = new ArrayList(listMo8792.size());
            for (C1907 c1907 : listMo8792) {
                if (c1907.m6567() != EnumC13093.MISSING) {
                    String strM51946 = C23043.m51946(str, c1907.m6565().mo4294());
                    if (c9113.m24267(strM51946).f31730.m20826()) {
                        arrayList.add(new C1216(c1907, strM51946, C23043.m51945(str, strM51946)));
                    }
                }
            }
            C12884.sort(arrayList, C2661.comparing(new C9418()));
            C23043.m51943(c23043, c8673, arrayList);
            return new C7182(str2, arrayList, false);
        } catch (C22790 e) {
            throw C22209.m50224(e);
        }
    }
}
