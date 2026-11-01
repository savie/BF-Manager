package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۜۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: M292 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6605 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f22226;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11545 f22227;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f22228 = "";

    public C6605(C11545 c11545) {
        this.f22227 = c11545;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17912(boolean z) {
        if (this.f22226 != z) {
            this.f22226 = z;
            this.f22228 = "";
            C11545 c11545 = this.f22227;
            if (!z) {
                c11545.m28779(c11545.m28795());
                c11545.f38826.m16164();
            }
            if (c11545.m28835()) {
                c11545.m28807().m18658();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17908() {
        if (this.f22226) {
            this.f22226 = false;
            this.f22228 = "";
            C11545 c11545 = this.f22227;
            if (c11545.m28835()) {
                c11545.m28807().m18656();
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m17913() {
        return this.f22226;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m17914() {
        return this.f22228;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17911(C4405 c4405) {
        this.f22226 = c4405.f15685;
        this.f22228 = c4405.f15687;
        C11545 c11545 = this.f22227;
        if (c11545.m28835()) {
            c11545.m28807().m18658();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17910(String str, boolean z) {
        this.f22226 = z;
        this.f22228 = str;
        C11545 c11545 = this.f22227;
        if (c11545.m28835()) {
            c11545.m28807().m18658();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17909(String str) {
        this.f22228 = str;
        C11545 c11545 = this.f22227;
        c11545.m28779(m17907(str, c11545.m28795()));
        c11545.f38826.m16164();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m17907(String str, List list) {
        InterfaceC3782 c7789;
        boolean zIsEmpty = str.isEmpty();
        C0960 c0960 = InterfaceC3782.f13657;
        C12956 c12956 = InterfaceC3782.f13658;
        if (zIsEmpty) {
            c7789 = c12956;
        } else {
            try {
                if (str.startsWith("/")) {
                    if (str.length() > 1) {
                        final Matcher matcher = Pattern.compile(str.substring(1), 66).matcher("");
                        c7789 = new InterfaceC3782() { // from class: l.ۚۜ᩹
                            @Override // l.InterfaceC3782
                            /* JADX INFO: renamed from: ۙ */
                            public final boolean mo3737(InterfaceC2557 interfaceC2557) {
                                return matcher.reset(interfaceC2557.getName()).find();
                            }
                        };
                    } else {
                        c7789 = c12956;
                    }
                } else {
                    if (str.startsWith("!/")) {
                        if (str.length() > 2) {
                            c7789 = new C9201(Pattern.compile(str.substring(2), 66).matcher(""));
                        }
                    } else if (str.startsWith("!")) {
                        if (str.length() > 1) {
                            final String lowerCase = str.substring(1).toLowerCase();
                            c7789 = new InterfaceC3782() { // from class: l.᩹ۜ᩹
                                @Override // l.InterfaceC3782
                                /* JADX INFO: renamed from: ۙ */
                                public final boolean mo3737(InterfaceC2557 interfaceC2557) {
                                    return !interfaceC2557.getName().toLowerCase().contains(lowerCase);
                                }
                            };
                        }
                    } else {
                        c7789 = new C7789(str.toLowerCase());
                    }
                    c7789 = c12956;
                }
            } catch (Exception unused) {
                c7789 = c0960;
            }
        }
        if (c7789 == c0960) {
            return new ArrayList();
        }
        if (c7789 == c12956) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            if (!interfaceC2557.mo7980() && c7789.mo3737(interfaceC2557)) {
                arrayList.add(interfaceC2557);
            }
        }
        return arrayList;
    }
}
