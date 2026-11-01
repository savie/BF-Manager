package l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺ۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAUR */
/* JADX INFO: loaded from: classes.dex */
public final class C22767 extends C4421 {
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:86:0x0161 A[Catch: Exception -> 0x01ab, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ab, blocks: (B:58:0x00d7, B:60:0x00e2, B:76:0x0125, B:63:0x00f1, B:66:0x00ff, B:69:0x010a, B:71:0x0112, B:73:0x011b, B:78:0x012e, B:86:0x0161, B:80:0x0140, B:83:0x0150), top: B:110:0x00d7 }] */
    @Override // l.C4421, l.InterfaceC7950
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1395(C14265 c14265, Type type, Object obj) {
        Class clsM21505;
        Throwable exc;
        C4421 c4421;
        Constructor<?>[] constructorArr;
        int i;
        C2974 c2974 = c14265.f46690;
        C0893 c0893 = c14265.f46686;
        int i2 = c2974.f11130;
        HashMap map = null;
        if (i2 == 8) {
            c2974.m8839();
            return null;
        }
        if (c14265.f46685 == 2) {
            c14265.f46685 = 0;
        } else if (i2 != 12) {
            throw new C20614("syntax error");
        }
        if (type == null || !(type instanceof Class)) {
            clsM21505 = null;
        } else {
            clsM21505 = (Class) type;
            if (!Throwable.class.isAssignableFrom(clsM21505)) {
                clsM21505 = null;
            }
        }
        Throwable th = null;
        String strM8840 = null;
        StackTraceElement[] stackTraceElementArr = null;
        while (true) {
            String strM8827 = c2974.m8827(c14265.f46682);
            if (strM8827 == null) {
                int i3 = c2974.f11130;
                if (i3 == 13) {
                    c2974.m8850(16);
                    break;
                }
                if (i3 == 16) {
                    continue;
                }
            }
            c2974.m8864();
            if ("@type".equals(strM8827)) {
                if (c2974.f11130 != 4) {
                    throw new C20614("syntax error");
                }
                String strM8841 = c2974.m8840();
                c0893.getClass();
                clsM21505 = C8219.m21505(strM8841);
                c2974.m8850(16);
            } else if ("message".equals(strM8827)) {
                int i4 = c2974.f11130;
                if (i4 == 8) {
                    strM8840 = null;
                } else {
                    if (i4 != 4) {
                        throw new C20614("syntax error");
                    }
                    strM8840 = c2974.m8840();
                }
                c2974.m8839();
            } else if ("cause".equals(strM8827)) {
                th = (Throwable) mo1395(c14265, null, "cause");
            } else if ("stackTrace".equals(strM8827)) {
                stackTraceElementArr = (StackTraceElement[]) c14265.m34397((String) null, StackTraceElement[].class);
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                map.put(strM8827, c14265.m34396((Object) null));
            }
            if (c2974.f11130 == 13) {
                c2974.m8850(16);
                break;
            }
        }
        if (clsM21505 == null) {
            exc = new Exception(strM8840, th);
            c4421 = null;
        } else {
            try {
                Constructor<?>[] constructors = clsM21505.getConstructors();
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
                    exc = (Throwable) constructor3.newInstance(strM8840, th);
                } else {
                    if (constructor != null) {
                        exc = (Throwable) constructor.newInstance(strM8840);
                    } else if (constructor2 != null) {
                        c4421 = null;
                        exc = (Throwable) constructor2.newInstance(null);
                    } else {
                        exc = null;
                        c4421 = null;
                    }
                    if (exc == null) {
                        exc = new Exception(strM8840, th);
                    }
                }
                c4421 = null;
                if (exc == null) {
                    exc = new Exception(strM8840, th);
                }
            } catch (Exception e) {
                throw new C20614("create instance error", (Throwable) e);
            }
        }
        if (stackTraceElementArr != null) {
            exc.setStackTrace(stackTraceElementArr);
        }
        if (map != null) {
            if (clsM21505 != null) {
                if (clsM21505 == this.f15729) {
                    c4421 = this;
                } else {
                    InterfaceC7950 interfaceC7950M3569 = c0893.m3569((Type) clsM21505);
                    if (interfaceC7950M3569 instanceof C4421) {
                        c4421 = (C4421) interfaceC7950M3569;
                    }
                }
            }
            if (c4421 != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    AbstractC18533 abstractC18533M12355 = c4421.m12355(str);
                    if (abstractC18533M12355 != null) {
                        abstractC18533M12355.mo31963(exc, value);
                    }
                }
            }
        }
        return exc;
    }
}
