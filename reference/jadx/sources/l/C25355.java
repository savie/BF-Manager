package l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAUR */
/* JADX INFO: loaded from: classes.dex */
public final class C25355 extends C5217 {
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:86:0x0161 A[Catch: Exception -> 0x01ab, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ab, blocks: (B:58:0x00d7, B:60:0x00e2, B:76:0x0125, B:63:0x00f1, B:66:0x00ff, B:69:0x010a, B:71:0x0112, B:73:0x011b, B:78:0x012e, B:86:0x0161, B:80:0x0140, B:83:0x0150), top: B:110:0x00d7 }] */
    @Override // l.C5217, l.InterfaceC3725
    /* JADX INFO: renamed from: ۙ */
    public final Object mo12124(C2759 c2759, Type type, Object obj) {
        Class clsM10244;
        Throwable exc;
        C5217 c5217;
        Constructor<?>[] constructorArr;
        int i;
        C13945 c13945 = c2759.f9128;
        C13420 c13420 = c2759.f9130;
        int i2 = c13945.f44222;
        HashMap map = null;
        if (i2 == 8) {
            c13945.m33956();
            return null;
        }
        if (c2759.f9124 == 2) {
            c2759.f9124 = 0;
        } else if (i2 != 12) {
            throw new C4251("syntax error");
        }
        if (type == null || !(type instanceof Class)) {
            clsM10244 = null;
        } else {
            clsM10244 = (Class) type;
            if (!Throwable.class.isAssignableFrom(clsM10244)) {
                clsM10244 = null;
            }
        }
        Throwable th = null;
        String strM33979 = null;
        StackTraceElement[] stackTraceElementArr = null;
        while (true) {
            String strM33941 = c13945.m33941(c2759.f9125);
            if (strM33941 == null) {
                int i3 = c13945.f44222;
                if (i3 == 13) {
                    c13945.m33973(16);
                    break;
                }
                if (i3 == 16) {
                    continue;
                }
            }
            c13945.m33980();
            if ("@type".equals(strM33941)) {
                if (c13945.f44222 != 4) {
                    throw new C4251("syntax error");
                }
                String strM339710 = c13945.m33979();
                c13420.getClass();
                clsM10244 = C3134.m10244(strM339710);
                c13945.m33973(16);
            } else if ("message".equals(strM33941)) {
                int i4 = c13945.f44222;
                if (i4 == 8) {
                    strM33979 = null;
                } else {
                    if (i4 != 4) {
                        throw new C4251("syntax error");
                    }
                    strM33979 = c13945.m33979();
                }
                c13945.m33956();
            } else if ("cause".equals(strM33941)) {
                th = (Throwable) mo12124(c2759, null, "cause");
            } else if ("stackTrace".equals(strM33941)) {
                stackTraceElementArr = (StackTraceElement[]) c2759.m9107((String) null, StackTraceElement[].class);
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                map.put(strM33941, c2759.m9106((Object) null));
            }
            if (c13945.f44222 == 13) {
                c13945.m33973(16);
                break;
            }
        }
        if (clsM10244 == null) {
            exc = new Exception(strM33979, th);
            c5217 = null;
        } else {
            try {
                Constructor<?>[] constructors = clsM10244.getConstructors();
                int length = constructors.length;
                Constructor<?> constructor = null;
                Constructor<?> constructor2 = null;
                int i5 = 0;
                Constructor<?> constructor3 = null;
                while (i5 < length) {
                    Constructor<?> constructor4 = constructors[i5];
                    if (constructor4.getParameterTypes().length == 0) {
                        constructorArr = constructors;
                        i = length;
                        constructor2 = constructor4;
                    } else {
                        constructorArr = constructors;
                        i = length;
                        if (constructor4.getParameterTypes().length == 1 && constructor4.getParameterTypes()[0] == String.class) {
                            constructor = constructor4;
                        } else if (constructor4.getParameterTypes().length == 2 && constructor4.getParameterTypes()[0] == String.class && constructor4.getParameterTypes()[1] == Throwable.class) {
                            constructor3 = constructor4;
                        }
                    }
                    i5++;
                    constructors = constructorArr;
                    length = i;
                }
                if (constructor3 != null) {
                    exc = (Throwable) constructor3.newInstance(strM33979, th);
                } else {
                    if (constructor != null) {
                        exc = (Throwable) constructor.newInstance(strM33979);
                    } else if (constructor2 != null) {
                        c5217 = null;
                        exc = (Throwable) constructor2.newInstance(null);
                    } else {
                        exc = null;
                        c5217 = null;
                    }
                    if (exc == null) {
                        exc = new Exception(strM33979, th);
                    }
                }
                c5217 = null;
                if (exc == null) {
                    exc = new Exception(strM33979, th);
                }
            } catch (Exception e) {
                throw new C4251("create instance error", (Throwable) e);
            }
        }
        if (stackTraceElementArr != null) {
            exc.setStackTrace(stackTraceElementArr);
        }
        if (map != null) {
            if (clsM10244 != null) {
                if (clsM10244 == this.f18403) {
                    c5217 = this;
                } else {
                    InterfaceC3725 interfaceC3725M33061 = c13420.m33061((Type) clsM10244);
                    if (interfaceC3725M33061 instanceof C5217) {
                        c5217 = (C5217) interfaceC3725M33061;
                    }
                }
            }
            if (c5217 != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    AbstractC23863 abstractC23863M15697 = c5217.m15697(str);
                    if (abstractC23863M15697 != null) {
                        abstractC23863M15697.mo17349(exc, value);
                    }
                }
            }
        }
        return exc;
    }
}
