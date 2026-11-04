package l;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.ۡۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: C43V */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9285 implements InterfaceC8540 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f30184 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC2574 f30185;

    @Override // l.InterfaceC8540
    /* JADX INFO: renamed from: ۙ */
    public final synchronized void mo22848(InterfaceC2574 interfaceC2574) {
        if (this.f30184) {
            throw new IllegalStateException("Cannot call init more than once.");
        }
        this.f30185 = interfaceC2574;
        this.f30184 = true;
    }

    @Override // l.InterfaceC8540
    /* JADX INFO: renamed from: ۙ */
    public final Set mo22847() {
        InterfaceC13760 interfaceC13760 = (InterfaceC13760) getClass().getAnnotation(InterfaceC13760.class);
        return interfaceC13760 == null ? Collections.EMPTY_SET : m24490(interfaceC13760.value(), false, "option value", "@SupportedOptions");
    }

    @Override // l.InterfaceC8540
    /* JADX INFO: renamed from: ᩷ */
    public final Set mo22850() {
        boolean z;
        InterfaceC7049 interfaceC7049 = (InterfaceC7049) getClass().getAnnotation(InterfaceC7049.class);
        synchronized (this) {
            z = this.f30184;
        }
        if (interfaceC7049 != null) {
            return m24490(interfaceC7049.value(), z && ((C18808) this.f30185).m43646().compareTo(EnumC21704.RELEASE_8) <= 0, "annotation type", "@SupportedAnnotationTypes");
        }
        if (z) {
            ((C18808) this.f30185).m43644().m40667(EnumC15230.WARNING, "No SupportedAnnotationTypes annotation found on " + getClass().getName() + ", returning an empty set.");
        }
        return Collections.EMPTY_SET;
    }

    @Override // l.InterfaceC8540
    /* JADX INFO: renamed from: ۤ */
    public final EnumC21704 mo22849() {
        boolean z;
        InterfaceC4550 interfaceC4550 = (InterfaceC4550) getClass().getAnnotation(InterfaceC4550.class);
        if (interfaceC4550 != null) {
            return interfaceC4550.value();
        }
        EnumC21704 enumC21704 = EnumC21704.RELEASE_6;
        synchronized (this) {
            z = this.f30184;
        }
        if (z) {
            ((C18808) this.f30185).m43644().m40667(EnumC15230.WARNING, "No SupportedSourceVersion annotation found on " + getClass().getName() + ", returning " + enumC21704 + ".");
        }
        return enumC21704;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Set m24490(String[] strArr, boolean z, String str, String str2) {
        String strSubstring;
        boolean z2;
        boolean z3;
        int iIndexOf;
        HashSet hashSet = new HashSet();
        for (String str3 : strArr) {
            if (!z || (iIndexOf = str3.indexOf(47)) == -1) {
                strSubstring = str3;
                z2 = false;
            } else {
                strSubstring = str3.substring(iIndexOf + 1);
                z2 = true;
            }
            if (!hashSet.add(strSubstring) && !z2) {
                synchronized (this) {
                    z3 = this.f30184;
                }
                if (z3) {
                    C17316 c17316M43644 = ((C18808) this.f30185).m43644();
                    EnumC15230 enumC15230 = EnumC15230.WARNING;
                    StringBuilder sbM10406 = C3188.m10406("Duplicate ", str, " ``", strSubstring, "'' for processor ");
                    sbM10406.append(getClass().getName());
                    sbM10406.append(" in its ");
                    sbM10406.append(str2);
                    sbM10406.append("annotation.");
                    c17316M43644.m40667(enumC15230, sbM10406.toString());
                }
            }
        }
        return C4681.unmodifiableSet(hashSet);
    }
}
