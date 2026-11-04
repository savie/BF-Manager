package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܿۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes4.dex */
public final class C18062 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f59132 = false;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f59133;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f59134;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC8540 f59135;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f59136;

    public C18062(InterfaceC8540 interfaceC8540, C7312 c7312, EnumC20820 enumC20820, C3163 c3163, boolean z, InterfaceC2574 interfaceC2574, boolean z2) {
        this.f59135 = interfaceC8540;
        InterfaceC23301 interfaceC23301M10346 = c3163.m10346(c3163.f10267);
        try {
            interfaceC8540.mo22848(interfaceC2574);
            EnumC21704 enumC21704Mo22849 = interfaceC8540.mo22849();
            if (enumC21704Mo22849.compareTo(EnumC20820.m47626(enumC20820)) < 0) {
                String name = interfaceC8540.getClass().getName();
                String str = enumC20820.f66685;
                C25213 c25213 = C13146.f42046;
                c7312.m34529(new C25213("compiler", "proc.processor.incompatible.source.version", enumC21704Mo22849, name, str));
            }
            this.f59136 = new LinkedHashSet();
            this.f59133 = new LinkedHashSet();
            for (String str2 : interfaceC8540.mo22850()) {
                boolean zAdd = this.f59136.add(str2);
                this.f59133.add(C18808.m43613(z, str2, this.f59135, c7312, z2));
                if (z2 && !zAdd) {
                    String name2 = interfaceC8540.getClass().getName();
                    C25213 c25214 = C13146.f42046;
                    c7312.m34529(new C25213("compiler", "proc.duplicate.supported.annotation", str2, name2));
                }
            }
            if (z2 && this.f59133.contains(C21966.m49708("*")) && this.f59133.size() > 1) {
                String name3 = interfaceC8540.getClass().getName();
                C25213 c25215 = C13146.f42046;
                c7312.m34529(new C25213("compiler", "proc.redundant.types.with.wildcard", name3));
            }
            this.f59134 = new LinkedHashSet();
            for (String str3 : this.f59135.mo22847()) {
                if (m42084(str3, c7312)) {
                    boolean zAdd2 = this.f59134.add(str3);
                    if (z2 && !zAdd2) {
                        String name4 = interfaceC8540.getClass().getName();
                        C25213 c25216 = C13146.f42046;
                        c7312.m34529(new C25213("compiler", "proc.duplicate.option.name", str3, name4));
                    }
                }
            }
            c3163.m10346(interfaceC23301M10346);
        } catch (Throwable th) {
            try {
                throw new C11349(th);
            } catch (Throwable th2) {
                c3163.m10346(interfaceC23301M10346);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m42084(String str, C7312 c7312) {
        boolean z;
        Pattern pattern = C18808.f61088;
        String[] strArrSplit = str.split("\\.", -1);
        int length = strArrSplit.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            if (!EnumC21704.m49266(strArrSplit[i])) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            String name = this.f59135.getClass().getName();
            C11040 c11040 = C22843.f74058;
            c7312.m34525(new C11040("compiler", "proc.processor.bad.option.name", str, name));
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42086(String str) {
        Iterator it = this.f59133.iterator();
        while (it.hasNext()) {
            if (((Pattern) it.next()).matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42085(HashSet hashSet) {
        hashSet.removeAll(this.f59134);
    }
}
