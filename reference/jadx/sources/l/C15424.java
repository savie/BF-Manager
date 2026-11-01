package l;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܶᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes5.dex */
public final class C15424 extends AbstractC23974 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC11274 f50269;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC11169 f50270;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1332 f50271;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Method f50272;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Method f50273;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Class f50274;

    public C15424(C21046 c21046, Class cls, InterfaceC1332 interfaceC1332, EnumC11274 enumC11274) {
        if (InterfaceC1332.class.isAssignableFrom(cls) && !cls.isInstance(interfaceC1332)) {
            throw new IllegalArgumentException("Bad messageDefaultInstance for ".concat(cls.getName()));
        }
        this.f50270 = c21046;
        this.f50274 = cls;
        this.f50271 = interfaceC1332;
        if (InterfaceC9800.class.isAssignableFrom(cls)) {
            this.f50272 = AbstractC18245.m42416(cls, "valueOf", C21857.class);
            this.f50273 = AbstractC18245.m42416(cls, "getValueDescriptor", new Class[0]);
        } else {
            this.f50272 = null;
            this.f50273 = null;
        }
        this.f50269 = enumC11274;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36898(C19741 c19741) {
        if (this.f50270 != null) {
            throw new IllegalStateException("Already initialized.");
        }
        this.f50270 = new C23185(c19741);
    }

    @Override // l.AbstractC23974
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19741 mo36901() {
        InterfaceC11169 interfaceC11169 = this.f50270;
        if (interfaceC11169 == null) {
            throw new IllegalStateException("getDescriptor() called before internalInit()");
        }
        return interfaceC11169.mo28101();
    }

    @Override // l.AbstractC23974
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1332 mo36899() {
        return this.f50271;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC11274 m36895() {
        return this.f50269;
    }

    @Override // l.AbstractC23974
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo36896(Object obj) {
        C19741 c19741Mo36901 = mo36901();
        if (c19741Mo36901.mo23408()) {
            if (c19741Mo36901.m44913() != EnumC19035.MESSAGE && c19741Mo36901.m44913() != EnumC19035.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(m36900(it.next()));
            }
            return arrayList;
        }
        return m36900(obj);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m36900(Object obj) {
        int i = C16108.f52089[mo36901().m44913().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AbstractC18245.m42415(this.f50272, (Object) null, obj);
            }
        } else if (!this.f50274.isInstance(obj)) {
            return this.f50271.newBuilderForType().mergeFrom((InterfaceC1332) obj).build();
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC23974
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo36897(C22169 c22169) {
        C19741 c19741Mo36901 = mo36901();
        boolean zMo23408 = c19741Mo36901.mo23408();
        Method method = this.f50273;
        if (zMo23408) {
            if (c19741Mo36901.m44913() == EnumC19035.ENUM) {
                ArrayList arrayList = new ArrayList();
                for (Object objM42415 : (List) c22169) {
                    if (C16108.f52089[mo36901().m44913().ordinal()] == 2) {
                        objM42415 = AbstractC18245.m42415(method, objM42415, new Object[0]);
                    }
                    arrayList.add(objM42415);
                }
                return arrayList;
            }
        } else {
            if (C16108.f52089[mo36901().m44913().ordinal()] == 2) {
                return AbstractC18245.m42415(method, c22169, new Object[0]);
            }
        }
        return c22169;
    }
}
