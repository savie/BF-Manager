package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.᩺ܺۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7QT */
/* JADX INFO: loaded from: classes2.dex */
public final class C24401 extends C7246 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22185 f79168;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C19179 f79169;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24401(C22185 c22185, EnumC6282 enumC6282, EnumC7687... enumC7687Arr) {
        super(c22185, enumC6282, enumC7687Arr);
        this.f79168 = c22185;
    }

    @Override // l.C7246, l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4671(EnumC7687 enumC7687, String str) {
        if (!this.f55347.contains(enumC7687)) {
            return false;
        }
        mo4669(str == null ? null : C22185.m50183(this.f79168, str));
        return true;
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC24928 mo4668(String str) {
        m54575();
        return this.f79169.m44442(str);
    }

    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC24928 mo4676(InterfaceC24329 interfaceC24329) {
        m54575();
        return this.f79169.m44448(interfaceC24329);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.᩵ܺۘ] */
    @Override // l.AbstractC23655
    /* JADX INFO: renamed from: ܳ */
    public final Iterable mo4673() {
        final List listSingletonList;
        C19179 c19179 = this.f79169;
        Set setM44447 = c19179 != null ? c19179.m44447() : Collections.EMPTY_SET;
        if (!setM44447.isEmpty()) {
            listSingletonList = Collections.singletonList(setM44447);
        } else {
            listSingletonList = Collections.EMPTY_LIST;
        }
        if (this.f23892 == null) {
            return listSingletonList;
        }
        final ?? r1 = new Iterable() { // from class: l.᩵ܺۘ
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return new C6501(this.f66282);
            }
        };
        return new Iterable() { // from class: l.ۨܺۘ
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return C8475.m22793(Arrays.asList(listSingletonList, r1), new C11794(4));
            }
        };
    }

    @Override // l.C7246, l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4672(InterfaceC24329 interfaceC24329) {
        if (this.f79169 == null) {
            m54575();
        }
        return this.f79169.m44445(interfaceC24329);
    }

    @Override // l.C7246, l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final void mo4669(Iterable iterable) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                InterfaceC24329 interfaceC24329 = (InterfaceC24329) it.next();
                if (C3445.exists(interfaceC24329, new EnumC20599[0]) && !C3445.isDirectory(interfaceC24329, new EnumC20599[0])) {
                    String string = interfaceC24329.getFileName().toString();
                    int iLastIndexOf = string.lastIndexOf(".");
                    if (iLastIndexOf > 0) {
                        String strSubstring = string.substring(iLastIndexOf);
                        strSubstring.getClass();
                        if (strSubstring.equals(".jar") || strSubstring.equals(".jmod")) {
                        }
                    }
                    throw new IllegalArgumentException(interfaceC24329.toString());
                }
            }
        }
        super.mo4669(iterable);
        this.f79169 = null;
    }

    @Override // l.AbstractC16941, l.AbstractC23655
    /* JADX INFO: renamed from: ۙ */
    public final void mo4670(Iterable iterable, String str) {
        C17359.requireNonNull(iterable);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC24329 interfaceC24329 = (InterfaceC24329) it.next();
            AbstractC16941.m39916(interfaceC24329);
            arrayList.add(interfaceC24329);
        }
        m54575();
        C3517 c3517M44442 = this.f79169.m44442(str);
        if (c3517M44442 == null) {
            c3517M44442 = new C3517(this.f79168, this, this.f55348.getName() + "[" + str + "]", str, arrayList, true);
            this.f79169.m44444(c3517M44442);
        } else {
            c3517M44442.f12094 = arrayList;
            this.f79169.m44449(c3517M44442);
        }
        c3517M44442.f12092 = true;
        this.f55346 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m54575() {
        if (this.f79169 != null) {
            return;
        }
        this.f79169 = new C19179(this.f79168);
        Iterator it = mo4673().iterator();
        while (it.hasNext()) {
            for (InterfaceC24928 interfaceC24928 : (Set) it.next()) {
                if (interfaceC24928 instanceof C3517) {
                    C3517 c3517 = (C3517) interfaceC24928;
                    if (!this.f79169.f62032.containsKey(c3517.f12095)) {
                        this.f79169.m44444(c3517);
                    }
                }
            }
        }
    }
}
