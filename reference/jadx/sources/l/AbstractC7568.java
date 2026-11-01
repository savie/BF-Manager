package l;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.۟ܺ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: C43V */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7568 implements InterfaceC16036 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f25097 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC20974 f25098;

    @Override // l.InterfaceC16036
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void mo20095(InterfaceC20974 interfaceC20974) {
        if (this.f25097) {
            throw new IllegalStateException("Cannot call init more than once.");
        }
        this.f25098 = interfaceC20974;
        this.f25097 = true;
    }

    @Override // l.InterfaceC16036
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set mo20094() {
        InterfaceC0512 interfaceC0512 = (InterfaceC0512) getClass().getAnnotation(InterfaceC0512.class);
        return interfaceC0512 == null ? Collections.EMPTY_SET : m20093(interfaceC0512.value(), false, "option value", "@SupportedOptions");
    }

    @Override // l.InterfaceC16036
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Set mo20097() {
        boolean z;
        InterfaceC20269 interfaceC20269 = (InterfaceC20269) getClass().getAnnotation(InterfaceC20269.class);
        synchronized (this) {
            z = this.f25097;
        }
        if (interfaceC20269 != null) {
            return m20093(interfaceC20269.value(), z && ((C10474) this.f25098).m26572().compareTo(EnumC12508.RELEASE_8) <= 0, "annotation type", "@SupportedAnnotationTypes");
        }
        if (z) {
            ((C10474) this.f25098).m26566().m15231(EnumC23921.WARNING, "No SupportedAnnotationTypes annotation found on " + getClass().getName() + ", returning an empty set.");
        }
        return Collections.EMPTY_SET;
    }

    @Override // l.InterfaceC16036
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC12508 mo20096() {
        boolean z;
        InterfaceC16741 interfaceC16741 = (InterfaceC16741) getClass().getAnnotation(InterfaceC16741.class);
        if (interfaceC16741 != null) {
            return interfaceC16741.value();
        }
        EnumC12508 enumC12508 = EnumC12508.RELEASE_6;
        synchronized (this) {
            z = this.f25097;
        }
        if (z) {
            ((C10474) this.f25098).m26566().m15231(EnumC23921.WARNING, "No SupportedSourceVersion annotation found on " + getClass().getName() + ", returning " + enumC12508 + ".");
        }
        return enumC12508;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Set m20093(String[] strArr, boolean z, String str, String str2) {
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
                    z3 = this.f25097;
                }
                if (z3) {
                    C5534 c5534M26566 = ((C10474) this.f25098).m26566();
                    EnumC23921 enumC23921 = EnumC23921.WARNING;
                    StringBuilder sbM30515 = C12278.m30515("Duplicate ", str, " ``", strSubstring, "'' for processor ");
                    sbM30515.append(getClass().getName());
                    sbM30515.append(" in its ");
                    sbM30515.append(str2);
                    sbM30515.append("annotation.");
                    c5534M26566.m15231(enumC23921, sbM30515.toString());
                }
            }
        }
        return C0561.unmodifiableSet(hashSet);
    }
}
