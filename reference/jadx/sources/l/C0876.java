package l;

import com.alipay.sdk.m.u0.b;
import com.alipay.sdk.m.y.l;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.֨ۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99OR */
/* JADX INFO: loaded from: classes2.dex */
public final class C0876 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final char[] f3263;

    static {
        char[] cArr = new char[80];
        f3263 = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m3567(AbstractC22701 abstractC22701, String str) {
        StringBuilder sbM10405 = C3188.m10405("# ", str);
        m3570(abstractC22701, sbM10405, 0);
        return sbM10405.toString();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:106:0x0200  */
    /* JADX WARN: Code duplicated, block: B:131:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x015a  */
    /* JADX WARN: Code duplicated, block: B:64:0x016c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0174  */
    /* JADX WARN: Code duplicated, block: B:68:0x0179  */
    /* JADX WARN: Code duplicated, block: B:69:0x0183  */
    /* JADX WARN: Code duplicated, block: B:71:0x0187  */
    /* JADX WARN: Code duplicated, block: B:74:0x0191  */
    /* JADX WARN: Code duplicated, block: B:76:0x0195  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ea  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3570(AbstractC22701 abstractC22701, StringBuilder sb, int i) {
        int i2;
        Method method;
        Method method2;
        Object objM51175;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC22701.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method5 = declaredMethods[i3];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method4 = (Method) entry.getValue()) != null && method4.getReturnType().equals(List.class)) {
                m3569(sb, i, C1402.m5124(4, 0, strSubstring), AbstractC22701.m51175(method4, abstractC22701, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                m3569(sb, i, C1402.m5124(3, 0, strSubstring), AbstractC22701.m51175(method3, abstractC22701, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objM51175 = AbstractC22701.m51175(method, abstractC22701, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objM51175 instanceof Boolean) {
                                    zEquals = !((Boolean) objM51175).booleanValue();
                                } else if (objM51175 instanceof Integer) {
                                    if (((Integer) objM51175).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM51175 instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objM51175).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM51175 instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objM51175).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM51175 instanceof String) {
                                    zEquals = objM51175.equals("");
                                } else if (objM51175 instanceof AbstractC17084) {
                                    zEquals = objM51175.equals(AbstractC17084.f55772);
                                } else if ((objM51175 instanceof InterfaceC18775) ? !((objM51175 instanceof Enum) && ((Enum) objM51175).ordinal() == 0) : objM51175 != ((InterfaceC18775) objM51175).getDefaultInstanceForType()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) AbstractC22701.m51175(method2, abstractC22701, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                m3569(sb, i, strSubstring, objM51175);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objM51175 = AbstractC22701.m51175(method, abstractC22701, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objM51175 instanceof Boolean) {
                                zEquals = !((Boolean) objM51175).booleanValue();
                            } else if (objM51175 instanceof Integer) {
                                if (((Integer) objM51175).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM51175 instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objM51175).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM51175 instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objM51175).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM51175 instanceof String) {
                                zEquals = objM51175.equals("");
                            } else if (objM51175 instanceof AbstractC17084) {
                                zEquals = objM51175.equals(AbstractC17084.f55772);
                            } else if (objM51175 instanceof InterfaceC18775) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) AbstractC22701.m51175(method2, abstractC22701, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            m3569(sb, i, strSubstring, objM51175);
                        }
                    }
                }
            }
            i2 = 3;
        }
        if (abstractC22701 instanceof AbstractC6799) {
            Iterator itM22904 = ((AbstractC6799) abstractC22701).f22658.m22904();
            while (itM22904.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itM22904.next();
                ((C13510) entry2.getKey()).getClass();
                m3569(sb, i, "[0]", entry2.getValue());
            }
        }
        C18906 c18906 = abstractC22701.f73691;
        if (c18906 != null) {
            c18906.m43887(sb, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3569(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m3569(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m3569(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m3568(sb, i);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(C20398.m46799(AbstractC17084.m40219((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC17084) {
            sb.append(": \"");
            sb.append(C20398.m46799((AbstractC17084) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC22701) {
            sb.append(" {");
            m3570((AbstractC22701) obj, sb, i + 2);
            sb.append("\n");
            m3568(sb, i);
            sb.append(l.d);
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i3 = i + 2;
            m3569(sb, i3, "key", entry.getKey());
            m3569(sb, i3, b.d, entry.getValue());
            sb.append("\n");
            m3568(sb, i);
            sb.append(l.d);
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3568(StringBuilder sb, int i) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f3263, 0, i2);
            i -= i2;
        }
    }
}
