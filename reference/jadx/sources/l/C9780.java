package l;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ֨ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public final class C9780 extends AbstractC16755 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC24699 f31523;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Method f31524;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Class f31525;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21013 f31526;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Method f31527;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC24961 f31528;

    public C9780(C10526 c10526, Class cls, InterfaceC21013 interfaceC21013, EnumC24961 enumC24961) {
        if (InterfaceC21013.class.isAssignableFrom(cls) && !cls.isInstance(interfaceC21013)) {
            throw new IllegalArgumentException("Bad messageDefaultInstance for ".concat(cls.getName()));
        }
        this.f31523 = c10526;
        this.f31525 = cls;
        this.f31526 = interfaceC21013;
        if (InterfaceC23425.class.isAssignableFrom(cls)) {
            this.f31524 = AbstractC9035.m24124(cls, "valueOf", C1357.class);
            this.f31527 = AbstractC9035.m24124(cls, "getValueDescriptor", new Class[0]);
        } else {
            this.f31524 = null;
            this.f31527 = null;
        }
        this.f31528 = enumC24961;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25501(C7323 c7323) {
        if (this.f31523 != null) {
            throw new IllegalStateException("Already initialized.");
        }
        this.f31523 = new C18731(c7323);
    }

    @Override // l.AbstractC16755
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7323 mo25504() {
        InterfaceC24699 interfaceC24699 = this.f31523;
        if (interfaceC24699 == null) {
            throw new IllegalStateException("getDescriptor() called before internalInit()");
        }
        return interfaceC24699.mo31623();
    }

    @Override // l.AbstractC16755
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21013 mo25502() {
        return this.f31526;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC24961 m25505() {
        return this.f31528;
    }

    @Override // l.AbstractC16755
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo25499(Object obj) {
        C7323 c7323Mo25504 = mo25504();
        if (c7323Mo25504.mo8649()) {
            if (c7323Mo25504.m20086() != EnumC2848.MESSAGE && c7323Mo25504.m20086() != EnumC2848.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(m25503(it.next()));
            }
            return arrayList;
        }
        return m25503(obj);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m25503(Object obj) {
        int i = C22461.f72690[mo25504().m20086().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AbstractC9035.m24123(this.f31524, (Object) null, obj);
            }
        } else if (!this.f31525.isInstance(obj)) {
            return this.f31526.newBuilderForType().mergeFrom((InterfaceC21013) obj).build();
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC16755
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo25500(C14495 c14495) {
        C7323 c7323Mo25504 = mo25504();
        boolean zMo8649 = c7323Mo25504.mo8649();
        Method method = this.f31527;
        if (zMo8649) {
            if (c7323Mo25504.m20086() == EnumC2848.ENUM) {
                ArrayList arrayList = new ArrayList();
                for (Object objM24123 : (List) c14495) {
                    if (C22461.f72690[mo25504().m20086().ordinal()] == 2) {
                        objM24123 = AbstractC9035.m24123(method, objM24123, new Object[0]);
                    }
                    arrayList.add(objM24123);
                }
                return arrayList;
            }
        } else {
            if (C22461.f72690[mo25504().m20086().ordinal()] == 2) {
                return AbstractC9035.m24123(method, c14495, new Object[0]);
            }
        }
        return c14495;
    }
}
