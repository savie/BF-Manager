package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.֨᩹۟, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C1405 extends C7756 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20456 f5825;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C18339 f5826;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1405(C20456 c20456, EnumC3584 enumC3584, EnumC19730... enumC19730Arr) {
        super(c20456, enumC3584, enumC19730Arr);
        this.f5825 = c20456;
    }

    @Override // l.C7756, l.AbstractC14107
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo4921(EnumC19730 enumC19730, String str) {
        if (!this.f31746.contains(enumC19730)) {
            return false;
        }
        mo4918(str == null ? null : C20456.m46263(this.f5825, str));
        return true;
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4290 mo4917(String str) {
        m4916();
        return this.f5826.m42588(str);
    }

    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4290 mo4922(InterfaceC3800 interfaceC3800) {
        m4916();
        return this.f5826.m42594(interfaceC3800);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ۖ᩹۟] */
    @Override // l.AbstractC14107
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Iterable mo4923() {
        final List listSingletonList;
        C18339 c18339 = this.f5826;
        Set setM42593 = c18339 != null ? c18339.m42593() : Collections.EMPTY_SET;
        if (!setM42593.isEmpty()) {
            listSingletonList = Collections.singletonList(setM42593);
        } else {
            listSingletonList = Collections.EMPTY_LIST;
        }
        if (this.f25610 == null) {
            return listSingletonList;
        }
        final ?? r1 = new Iterable() { // from class: l.ۖ᩹۟
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return new C22573(this.f10696);
            }
        };
        return new Iterable() { // from class: l.ۚ᩹۟
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return C20021.m45348(Arrays.asList(listSingletonList, r1), new C7497(9));
            }
        };
    }

    @Override // l.C7756, l.AbstractC14107
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo4920(InterfaceC3800 interfaceC3800) {
        if (this.f5826 == null) {
            m4916();
        }
        return this.f5826.m42591(interfaceC3800);
    }

    @Override // l.C7756, l.AbstractC14107
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4918(Iterable iterable) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                InterfaceC3800 interfaceC3800 = (InterfaceC3800) it.next();
                if (C5212.exists(interfaceC3800, new EnumC22146[0]) && !C5212.isDirectory(interfaceC3800, new EnumC22146[0])) {
                    String string = interfaceC3800.getFileName().toString();
                    int iLastIndexOf = string.lastIndexOf(".");
                    if (iLastIndexOf > 0) {
                        String strSubstring = string.substring(iLastIndexOf);
                        strSubstring.getClass();
                        if (strSubstring.equals(".jar") || strSubstring.equals(".jmod")) {
                        }
                    }
                    throw new IllegalArgumentException(interfaceC3800.toString());
                }
            }
        }
        super.mo4918(iterable);
        this.f5826 = null;
    }

    @Override // l.AbstractC9376, l.AbstractC14107
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4919(Iterable iterable, String str) {
        C13638.requireNonNull(iterable);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC3800 interfaceC3800 = (InterfaceC3800) it.next();
            AbstractC9376.m24052(interfaceC3800);
            arrayList.add(interfaceC3800);
        }
        m4916();
        C11990 c11990M42588 = this.f5826.m42588(str);
        if (c11990M42588 == null) {
            c11990M42588 = new C11990(this.f5825, this, this.f31747.getName() + "[" + str + "]", str, arrayList, true);
            this.f5826.m42590(c11990M42588);
        } else {
            c11990M42588.f40189 = arrayList;
            this.f5826.m42595(c11990M42588);
        }
        c11990M42588.f40187 = true;
        this.f31745 = true;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m4916() {
        if (this.f5826 != null) {
            return;
        }
        this.f5826 = new C18339(this.f5825);
        Iterator it = mo4923().iterator();
        while (it.hasNext()) {
            for (InterfaceC4290 interfaceC4290 : (Set) it.next()) {
                if (interfaceC4290 instanceof C11990) {
                    C11990 c11990 = (C11990) interfaceC4290;
                    if (!this.f5826.f58506.containsKey(c11990.f40190)) {
                        this.f5826.m42590(c11990);
                    }
                }
            }
        }
    }
}
