package l;

import com.alipay.sdk.m.y.l;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferUtilityOptions;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 688Y */
/* JADX INFO: loaded from: classes.dex */
public final class C24522 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f79513;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f79514;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List f79515;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24281 f79516;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f79517;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C2257 f79518;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f79519;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C12587 f79520;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f79521;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f79522;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m54784(String str) {
        boolean z;
        C6446 c6446M18229 = C6446.m18229(TransferUtilityOptions.class);
        Object obj = null;
        if (str == null) {
            return null;
        }
        C4208 c4208 = new C4208(new StringReader(str));
        EnumC19805 enumC19805 = EnumC19805.LEGACY_STRICT;
        c4208.m13442(enumC19805);
        EnumC19805 enumC19805M13450 = c4208.m13450();
        if (c4208.m13450() == enumC19805) {
            c4208.m13442(EnumC19805.LENIENT);
        }
        try {
            try {
                try {
                    c4208.m13438();
                    z = false;
                    try {
                        AbstractC17567 abstractC17567M54785 = m54785(c6446M18229);
                        Object objMo3722 = abstractC17567M54785.mo3722(c4208);
                        Class clsM22558 = C8398.m22558(c6446M18229.m18232());
                        if (objMo3722 != null && !clsM22558.isInstance(objMo3722)) {
                            throw new ClassCastException("Type adapter '" + abstractC17567M54785 + "' returned wrong type; requested " + c6446M18229.m18232() + " but got instance of " + objMo3722.getClass() + "\nVerify that the adapter was registered for the correct type.");
                        }
                        c4208.m13442(enumC19805M13450);
                        obj = objMo3722;
                    } catch (EOFException e) {
                        e = e;
                        if (!z) {
                            throw new C7367(e);
                        }
                        c4208.m13442(enumC19805M13450);
                    }
                } catch (EOFException e2) {
                    e = e2;
                    z = true;
                }
                if (obj != null) {
                    try {
                        if (c4208.m13438() != EnumC14648.END_DOCUMENT) {
                            throw new C7367("JSON document was not fully consumed.");
                        }
                    } catch (C18378 e3) {
                        throw new C7367(e3);
                    } catch (IOException e4) {
                        throw new C8113(e4);
                    }
                }
                return obj;
            } catch (Throwable th) {
                c4208.m13442(enumC19805M13450);
                throw th;
            }
        } catch (IOException e5) {
            throw new C7367(e5);
        } catch (AssertionError e6) {
            throw new AssertionError("AssertionError (Gson 2.15.0): " + e6.getMessage(), e6);
        } catch (IllegalStateException e7) {
            throw new C7367(e7);
        }
    }

    public C24522() {
        C4384 c4384 = C4384.f15796;
        this.f79513 = new ThreadLocal();
        this.f79517 = new ConcurrentMapC17249();
        C14583 c14583 = c4384.f15803;
        new HashMap(c4384.f15802);
        this.f79519 = c4384.f15810;
        this.f79520 = c4384.f15806;
        this.f79514 = C4384.m13996(c4384.f15811);
        this.f79521 = C4384.m13996(c4384.f15805);
        this.f79515 = C4384.m13996(c4384.f15807);
        this.f79516 = C4384.f15798;
        this.f79518 = C4384.f15795;
        this.f79522 = C4384.f15793;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17567 m54785(C6446 c6446) {
        boolean z;
        C17359.requireNonNull(c6446, "type must not be null");
        ConcurrentMapC17249 concurrentMapC17249 = this.f79517;
        AbstractC17567 abstractC17567 = (AbstractC17567) concurrentMapC17249.get(c6446);
        if (abstractC17567 != null) {
            return abstractC17567;
        }
        ThreadLocal threadLocal = this.f79513;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            AbstractC17567 abstractC17568 = (AbstractC17567) map.get(c6446);
            if (abstractC17568 != null) {
                return abstractC17568;
            }
            z = false;
        }
        try {
            C6622 c6622 = new C6622();
            map.put(c6446, c6622);
            Iterator it = this.f79522.iterator();
            AbstractC17567 abstractC17567Mo1459 = null;
            while (it.hasNext()) {
                abstractC17567Mo1459 = ((InterfaceC16075) it.next()).mo1459(this, c6446);
                if (abstractC17567Mo1459 != null) {
                    c6622.m18557(abstractC17567Mo1459);
                    map.put(c6446, abstractC17567Mo1459);
                    break;
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (abstractC17567Mo1459 != null) {
                if (z) {
                    concurrentMapC17249.putAll(map);
                }
                return abstractC17567Mo1459;
            }
            throw new IllegalArgumentException("Gson (2.15.0) cannot handle " + c6446);
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17567 m54786(InterfaceC16075 interfaceC16075, C6446 c6446) {
        C17359.requireNonNull(interfaceC16075, "skipPast must not be null");
        C17359.requireNonNull(c6446, "type must not be null");
        C2257 c2257 = this.f79518;
        if (c2257.m7686(interfaceC16075, c6446)) {
            interfaceC16075 = c2257;
        }
        boolean z = false;
        for (InterfaceC16075 interfaceC16076 : this.f79522) {
            if (z) {
                AbstractC17567 abstractC17567Mo1459 = interfaceC16076.mo1459(this, c6446);
                if (abstractC17567Mo1459 != null) {
                    return abstractC17567Mo1459;
                }
            } else if (interfaceC16076 == interfaceC16075) {
                z = true;
            }
        }
        if (z) {
            throw new IllegalArgumentException("Gson cannot serialize or deserialize " + c6446);
        }
        return m54785(c6446);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54788(Object obj, Class cls, C21362 c21362) {
        AbstractC17567 abstractC17567M54785 = m54785(C6446.m18230((Type) cls));
        EnumC19805 enumC19805M48593 = c21362.m48593();
        if (c21362.m48593() == EnumC19805.LEGACY_STRICT) {
            c21362.m48591(EnumC19805.LENIENT);
        }
        boolean zM48599 = c21362.m48599();
        boolean zM48596 = c21362.m48596();
        c21362.m48592(this.f79519);
        c21362.m48603(false);
        try {
            try {
                abstractC17567M54785.mo3723(c21362, obj);
                c21362.m48591(enumC19805M48593);
                c21362.m48592(zM48599);
                c21362.m48603(zM48596);
            } catch (IOException e) {
                throw new C8113(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (Gson 2.15.0): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            c21362.m48591(enumC19805M48593);
            c21362.m48592(zM48599);
            c21362.m48603(zM48596);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54789(AbstractC0655 abstractC0655, C21362 c21362) {
        EnumC19805 enumC19805M48593 = c21362.m48593();
        boolean zM48599 = c21362.m48599();
        boolean zM48596 = c21362.m48596();
        c21362.m48592(this.f79519);
        c21362.m48603(false);
        if (c21362.m48593() == EnumC19805.LEGACY_STRICT) {
            c21362.m48591(EnumC19805.LENIENT);
        }
        try {
            try {
                C25378.f81932.getClass();
                C25378.m56740(abstractC0655, c21362);
                c21362.m48591(enumC19805M48593);
                c21362.m48592(zM48599);
                c21362.m48603(zM48596);
            } catch (IOException e) {
                throw new C8113(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (Gson 2.15.0): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            c21362.m48591(enumC19805M48593);
            c21362.m48592(zM48599);
            c21362.m48603(zM48596);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21362 m54787(Writer writer) {
        C21362 c21362 = new C21362(writer);
        c21362.m48590(this.f79520);
        c21362.m48592(this.f79519);
        c21362.m48591(EnumC19805.LEGACY_STRICT);
        c21362.m48603(false);
        return c21362;
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f79522 + ",instanceCreators:" + this.f79516 + l.d;
    }
}
