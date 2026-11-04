package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩸ۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M292 */
/* JADX INFO: loaded from: classes.dex */
public final class C22612 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f73068;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C8614 f73069;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f73070 = "";

    public C22612(C8614 c8614) {
        this.f73069 = c8614;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50944(boolean z) {
        if (this.f73068 != z) {
            this.f73068 = z;
            this.f73070 = "";
            C8614 c8614 = this.f73069;
            if (!z) {
                c8614.m23178(c8614.m23202());
                c8614.f28159.m12740();
            }
            if (c8614.m23196()) {
                c8614.m23194().m46169();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50940() {
        if (this.f73068) {
            this.f73068 = false;
            this.f73070 = "";
            C8614 c8614 = this.f73069;
            if (c8614.m23196()) {
                c8614.m23194().m46180();
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m50945() {
        return this.f73068;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m50946() {
        return this.f73070;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50943(C2889 c2889) {
        this.f73068 = c2889.f9475;
        this.f73070 = c2889.f9477;
        C8614 c8614 = this.f73069;
        if (c8614.m23196()) {
            c8614.m23194().m46169();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50942(String str, boolean z) {
        this.f73068 = z;
        this.f73070 = str;
        C8614 c8614 = this.f73069;
        if (c8614.m23196()) {
            c8614.m23194().m46169();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50941(String str) {
        this.f73070 = str;
        C8614 c8614 = this.f73069;
        c8614.m23178(m50939(str, c8614.m23202()));
        c8614.f28159.m12740();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m50939(String str, List list) {
        InterfaceC10677 c23883;
        boolean zIsEmpty = str.isEmpty();
        C4712 c4712 = InterfaceC10677.f33900;
        C21866 c21866 = InterfaceC10677.f33899;
        if (zIsEmpty) {
            c23883 = c21866;
        } else {
            try {
                if (str.startsWith("/")) {
                    if (str.length() > 1) {
                        c23883 = new C17169(Pattern.compile(str.substring(1), 66).matcher(""));
                    } else {
                        c23883 = c21866;
                    }
                } else {
                    if (str.startsWith("!/")) {
                        if (str.length() > 2) {
                            final Matcher matcher = Pattern.compile(str.substring(2), 66).matcher("");
                            c23883 = new InterfaceC10677() { // from class: l.۬ۨܳ
                                @Override // l.InterfaceC10677
                                /* JADX INFO: renamed from: ۙ */
                                public final boolean mo14602(InterfaceC2386 interfaceC2386) {
                                    return !matcher.reset(interfaceC2386.getName()).find();
                                }
                            };
                        }
                    } else if (str.startsWith("!")) {
                        if (str.length() > 1) {
                            c23883 = new C16423(str.substring(1).toLowerCase());
                        }
                    } else {
                        c23883 = new C23883(str.toLowerCase());
                    }
                    c23883 = c21866;
                }
            } catch (Exception unused) {
                c23883 = c4712;
            }
        }
        if (c23883 == c4712) {
            return new ArrayList();
        }
        if (c23883 == c21866) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            if (!interfaceC2386.mo8106() && c23883.mo14602(interfaceC2386)) {
                arrayList.add(interfaceC2386);
            }
        }
        return arrayList;
    }
}
