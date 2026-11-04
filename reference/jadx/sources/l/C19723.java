package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.LinkedHashSet;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ᩴۡ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 440F */
/* JADX INFO: loaded from: classes5.dex */
public class C19723 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C19723 f63477 = new C22707(null, null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC10772 f63478;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C23892 f63479;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C24550 f63480;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23892 f63481;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean m45420() {
        return !(this instanceof C22707);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m45416() {
        C24550 c24550;
        while (true) {
            c24550 = this.f63480;
            if (c24550.f38070.mo11630()) {
                break;
            } else {
                c24550.mo29590();
            }
        }
        InterfaceC10772 interfaceC10772 = this.f63478;
        if (interfaceC10772 != null) {
            this.f63478 = null;
            interfaceC10772.mo2477(c24550);
        }
    }

    public C19723(C24550 c24550, InterfaceC10772 interfaceC10772) {
        this.f63480 = c24550;
        this.f63478 = interfaceC10772;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C23892 mo45419() {
        m45416();
        return this.f63479;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45418(C23892 c23892) {
        C11972.m30030(this.f63479);
        this.f63479 = c23892;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23892 mo45423() {
        m45416();
        return this.f63481;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m45422(C23892 c23892) {
        C11972.m30030(this.f63481);
        this.f63481 = c23892;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet mo45417() {
        m45416();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C24550 c24550 = this.f63480;
        c24550.mo29590();
        for (AbstractC11781 abstractC11781 : c24550.f79576.mo7472((Predicate) null, EnumC13908.NON_RECURSIVE)) {
            if (abstractC11781.f38066 == EnumC13603.f43218) {
                AbstractC19728 abstractC19728 = abstractC11781.f38072;
                if (abstractC19728 != abstractC19728.f63499.f73707.f49758 && (abstractC11781.mo29591() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
                    linkedHashSet.add((C10377) abstractC11781);
                }
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public LinkedHashSet mo45421() {
        m45416();
        LinkedHashSet<C10377> linkedHashSetMo45417 = mo45417();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C10377 c10377 : linkedHashSetMo45417) {
            if (c10377.f33011 != null) {
                linkedHashSet.add(c10377);
            }
        }
        return linkedHashSet;
    }

    public String toString() {
        return "Annotation type for: " + this.f63480;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static C19723 m45415() {
        return f63477;
    }
}
