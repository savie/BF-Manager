package l;

import com.alipay.sdk.m.y.l;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferUtilityOptions;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: renamed from: l.ۛۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 688Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C6044 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C9387 f20527;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List f20528;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f20529;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f20530;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C15923 f20531;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f20532;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C0130 f20533;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final List f20534;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f20535;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f20536;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C15923 f20523 = C15923.f51599;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final EnumC7455 f20526 = EnumC7455.f24847;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC19181 f20524 = EnumC19181.f61950;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final EnumC19181 f20525 = EnumC19181.f61953;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m16438(String str) {
        boolean z;
        C11730 c11730M29313 = C11730.m29313(TransferUtilityOptions.class);
        Object obj = null;
        if (str == null) {
            return null;
        }
        C5379 c5379 = new C5379(new StringReader(str));
        EnumC14948 enumC14948 = EnumC14948.LEGACY_STRICT;
        c5379.m14914(enumC14948);
        EnumC14948 enumC14948M14923 = c5379.m14923();
        if (c5379.m14923() == enumC14948) {
            c5379.m14914(EnumC14948.LENIENT);
        }
        try {
            try {
                try {
                    c5379.m14916();
                    z = false;
                    try {
                        AbstractC7186 abstractC7186M16440 = m16440(c11730M29313);
                        Object objMo1571 = abstractC7186M16440.mo1571(c5379);
                        Class clsM30166 = C12123.m30166(c11730M29313.m29316());
                        if (objMo1571 != null && !clsM30166.isInstance(objMo1571)) {
                            throw new ClassCastException("Type adapter '" + abstractC7186M16440 + "' returned wrong type; requested " + c11730M29313.m29316() + " but got instance of " + objMo1571.getClass() + "\nVerify that the adapter was registered for the correct type.");
                        }
                        c5379.m14914(enumC14948M14923);
                        obj = objMo1571;
                    } catch (EOFException e) {
                        e = e;
                        if (!z) {
                            throw new C22003(e);
                        }
                        c5379.m14914(enumC14948M14923);
                    }
                } catch (EOFException e2) {
                    e = e2;
                    z = true;
                }
                if (obj != null) {
                    try {
                        if (c5379.m14916() != EnumC22313.END_DOCUMENT) {
                            throw new C22003("JSON document was not fully consumed.");
                        }
                    } catch (C13141 e3) {
                        throw new C22003(e3);
                    } catch (IOException e4) {
                        throw new C9573(e4);
                    }
                }
                return obj;
            } catch (Throwable th) {
                c5379.m14914(enumC14948M14923);
                throw th;
            }
        } catch (IOException e5) {
            throw new C22003(e5);
        } catch (AssertionError e6) {
            throw new AssertionError("AssertionError (GSON 2.13.2): " + e6.getMessage(), e6);
        } catch (IllegalStateException e7) {
            throw new C22003(e7);
        }
    }

    public C6044() {
        C12126 c12126 = C12126.f40599;
        Map map = Collections.EMPTY_MAP;
        EnumC3657 enumC3657 = EnumC3657.f13397;
        List list = Collections.EMPTY_LIST;
        this.f20529 = new ThreadLocal();
        this.f20532 = new ConcurrentMapC13783();
        C0130 c0130 = new C0130();
        this.f20533 = c0130;
        this.f20536 = true;
        this.f20531 = f20523;
        this.f20530 = list;
        this.f20535 = list;
        this.f20534 = list;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C15613.f50762);
        arrayList.add(C7061.m18926(f20524));
        arrayList.add(c12126);
        arrayList.addAll(list);
        arrayList.add(C15613.f50770);
        arrayList.add(C15613.f50761);
        arrayList.add(C15613.f50766);
        arrayList.add(C15613.f50755);
        arrayList.add(C15613.f50769);
        AbstractC7186 abstractC7186 = C15613.f50776;
        arrayList.add(C15613.m37280(Long.TYPE, Long.class, abstractC7186));
        arrayList.add(C15613.m37280(Double.TYPE, Double.class, new C20156()));
        arrayList.add(C15613.m37280(Float.TYPE, Float.class, new C0399()));
        arrayList.add(C1416.m4955(f20525));
        arrayList.add(C15613.f50764);
        arrayList.add(C15613.f50756);
        arrayList.add(C15613.m37281(AtomicLong.class, new C16628(abstractC7186).m19120()));
        arrayList.add(C15613.m37281(AtomicLongArray.class, new C12395(abstractC7186).m19120()));
        arrayList.add(C15613.f50767);
        arrayList.add(C15613.f50779);
        arrayList.add(C15613.f50752);
        arrayList.add(C15613.f50775);
        arrayList.add(C15613.m37281(BigDecimal.class, C15613.f50754));
        arrayList.add(C15613.m37281(BigInteger.class, C15613.f50757));
        arrayList.add(C15613.m37281(C9304.class, C15613.f50763));
        arrayList.add(C15613.f50771);
        arrayList.add(C15613.f50765);
        arrayList.add(C15613.f50758);
        arrayList.add(C15613.f50777);
        arrayList.add(C15613.f50760);
        arrayList.add(C15613.f50773);
        arrayList.add(C15613.f50778);
        arrayList.add(C10798.f36765);
        arrayList.add(C15613.f50759);
        if (C13847.f45683) {
            arrayList.add(C13847.f45680);
            arrayList.add(C13847.f45681);
            arrayList.add(C13847.f45682);
        }
        arrayList.add(C19970.f63933);
        arrayList.add(C15613.f50768);
        arrayList.add(new C16442(c0130));
        arrayList.add(new C2827(c0130));
        C9387 c9387 = new C9387(c0130);
        this.f20527 = c9387;
        arrayList.add(c9387);
        arrayList.add(C15613.f50772);
        arrayList.add(new C9179(c0130, f20526, c12126, c9387));
        this.f20528 = C0561.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m16437(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7186 m16440(C11730 c11730) {
        boolean z;
        C13638.requireNonNull(c11730, "type must not be null");
        ConcurrentMapC13783 concurrentMapC13783 = this.f20532;
        AbstractC7186 abstractC7186 = (AbstractC7186) concurrentMapC13783.get(c11730);
        if (abstractC7186 != null) {
            return abstractC7186;
        }
        ThreadLocal threadLocal = this.f20529;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            AbstractC7186 abstractC7187 = (AbstractC7186) map.get(c11730);
            if (abstractC7187 != null) {
                return abstractC7187;
            }
            z = false;
        }
        try {
            C17333 c17333 = new C17333();
            map.put(c11730, c17333);
            Iterator it = this.f20528.iterator();
            AbstractC7186 abstractC7186Mo5183 = null;
            while (it.hasNext()) {
                abstractC7186Mo5183 = ((InterfaceC20592) it.next()).mo5183(this, c11730);
                if (abstractC7186Mo5183 != null) {
                    c17333.m40303(abstractC7186Mo5183);
                    map.put(c11730, abstractC7186Mo5183);
                    break;
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (abstractC7186Mo5183 != null) {
                if (z) {
                    concurrentMapC13783.putAll(map);
                }
                return abstractC7186Mo5183;
            }
            throw new IllegalArgumentException("GSON (2.13.2) cannot handle " + c11730);
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC7186 m16441(InterfaceC20592 interfaceC20592, C11730 c11730) {
        C13638.requireNonNull(interfaceC20592, "skipPast must not be null");
        C13638.requireNonNull(c11730, "type must not be null");
        C9387 c9387 = this.f20527;
        if (c9387.m24081(interfaceC20592, c11730)) {
            interfaceC20592 = c9387;
        }
        boolean z = false;
        for (InterfaceC20592 interfaceC20593 : this.f20528) {
            if (z) {
                AbstractC7186 abstractC7186Mo5183 = interfaceC20593.mo5183(this, c11730);
                if (abstractC7186Mo5183 != null) {
                    return abstractC7186Mo5183;
                }
            } else if (interfaceC20593 == interfaceC20592) {
                z = true;
            }
        }
        if (z) {
            throw new IllegalArgumentException("GSON cannot serialize or deserialize " + c11730);
        }
        return m16440(c11730);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16442(Object obj, Class cls, C1145 c1145) {
        AbstractC7186 abstractC7186M16440 = m16440(C11730.m29314((Type) cls));
        EnumC14948 enumC14948M4210 = c1145.m4210();
        if (c1145.m4210() == EnumC14948.LEGACY_STRICT) {
            c1145.m4205(EnumC14948.LENIENT);
        }
        boolean zM4215 = c1145.m4215();
        boolean zM4198 = c1145.m4198();
        c1145.m4207(this.f20536);
        c1145.m4213(false);
        try {
            try {
                abstractC7186M16440.mo1572(c1145, obj);
                c1145.m4205(enumC14948M4210);
                c1145.m4207(zM4215);
                c1145.m4213(zM4198);
            } catch (IOException e) {
                throw new C9573(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            c1145.m4205(enumC14948M4210);
            c1145.m4207(zM4215);
            c1145.m4213(zM4198);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m16443(AbstractC1810 abstractC1810, C1145 c1145) {
        EnumC14948 enumC14948M4210 = c1145.m4210();
        boolean zM4215 = c1145.m4215();
        boolean zM4198 = c1145.m4198();
        c1145.m4207(this.f20536);
        c1145.m4213(false);
        if (c1145.m4210() == EnumC14948.LEGACY_STRICT) {
            c1145.m4205(EnumC14948.LENIENT);
        }
        try {
            try {
                try {
                    C15613.f50774.mo1572(c1145, abstractC1810);
                    c1145.m4205(enumC14948M4210);
                    c1145.m4207(zM4215);
                    c1145.m4213(zM4198);
                } catch (IOException e) {
                    throw new C9573(e);
                }
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            c1145.m4205(enumC14948M4210);
            c1145.m4207(zM4215);
            c1145.m4213(zM4198);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1145 m16439(Writer writer) {
        C1145 c1145 = new C1145(writer);
        c1145.m4206(this.f20531);
        c1145.m4207(this.f20536);
        c1145.m4205(EnumC14948.LEGACY_STRICT);
        c1145.m4213(false);
        return c1145;
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f20528 + ",instanceCreators:" + this.f20533 + l.d;
    }
}
