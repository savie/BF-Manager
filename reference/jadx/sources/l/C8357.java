package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۠ᩴ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes3.dex */
public final class C8357 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f28984;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f28985 = false;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f28986;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f28987;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC16036 f28988;

    public C8357(InterfaceC16036 interfaceC16036, C20414 c20414, EnumC11909 enumC11909, C4831 c4831, boolean z, InterfaceC20974 interfaceC20974, boolean z2) {
        this.f28988 = interfaceC16036;
        InterfaceC3398 interfaceC3398M13415 = c4831.m13415(c4831.f16986);
        try {
            interfaceC16036.mo20095(interfaceC20974);
            EnumC12508 enumC12508Mo20096 = interfaceC16036.mo20096();
            if (enumC12508Mo20096.compareTo(EnumC11909.m29707(enumC11909)) < 0) {
                String name = interfaceC16036.getClass().getName();
                String str = enumC11909.f39974;
                C14065 c14065 = C9768.f32836;
                c20414.m48201(new C14065("compiler", "proc.processor.incompatible.source.version", enumC12508Mo20096, name, str));
            }
            this.f28984 = new LinkedHashSet();
            this.f28987 = new LinkedHashSet();
            for (String str2 : interfaceC16036.mo20097()) {
                boolean zAdd = this.f28984.add(str2);
                this.f28987.add(C10474.m26539(z, str2, this.f28988, c20414, z2));
                if (z2 && !zAdd) {
                    String name2 = interfaceC16036.getClass().getName();
                    C14065 c14066 = C9768.f32836;
                    c20414.m48201(new C14065("compiler", "proc.duplicate.supported.annotation", str2, name2));
                }
            }
            if (z2 && this.f28987.contains(C12653.m31449("*")) && this.f28987.size() > 1) {
                String name3 = interfaceC16036.getClass().getName();
                C14065 c14067 = C9768.f32836;
                c20414.m48201(new C14065("compiler", "proc.redundant.types.with.wildcard", name3));
            }
            this.f28986 = new LinkedHashSet();
            for (String str3 : this.f28988.mo20094()) {
                if (m21879(str3, c20414)) {
                    boolean zAdd2 = this.f28986.add(str3);
                    if (z2 && !zAdd2) {
                        String name4 = interfaceC16036.getClass().getName();
                        C14065 c14068 = C9768.f32836;
                        c20414.m48201(new C14065("compiler", "proc.duplicate.option.name", str3, name4));
                    }
                }
            }
            c4831.m13415(interfaceC3398M13415);
        } catch (Throwable th) {
            try {
                throw new C14002(th);
            } catch (Throwable th2) {
                c4831.m13415(interfaceC3398M13415);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m21879(String str, C20414 c20414) {
        boolean z;
        Pattern pattern = C10474.f35828;
        String[] strArrSplit = str.split("\\.", -1);
        int length = strArrSplit.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            if (!EnumC12508.m31065(strArrSplit[i])) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            String name = this.f28988.getClass().getName();
            C5909 c5909 = C23879.f77204;
            c20414.m48197(new C5909("compiler", "proc.processor.bad.option.name", str, name));
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21881(String str) {
        Iterator it = this.f28987.iterator();
        while (it.hasNext()) {
            if (((Pattern) it.next()).matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21880(HashSet hashSet) {
        hashSet.removeAll(this.f28986);
    }
}
