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

/* JADX INFO: renamed from: l.᩸᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 99OR */
/* JADX INFO: loaded from: classes4.dex */
public final class C21794 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final char[] f70583;

    static {
        char[] cArr = new char[80];
        f70583 = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m48551(AbstractC16129 abstractC16129, String str) {
        StringBuilder sbM8976 = C3012.m8976("# ", str);
        m48554(abstractC16129, sbM8976, 0);
        return sbM8976.toString();
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
    public static void m48554(AbstractC16129 abstractC16129, StringBuilder sb, int i) {
        int i2;
        Method method;
        Method method2;
        Object objM38182;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC16129.getClass().getDeclaredMethods();
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
                m48553(sb, i, C20630.m46498(4, 0, strSubstring), AbstractC16129.m38182(method4, abstractC16129, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                m48553(sb, i, C20630.m46498(3, 0, strSubstring), AbstractC16129.m38182(method3, abstractC16129, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objM38182 = AbstractC16129.m38182(method, abstractC16129, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objM38182 instanceof Boolean) {
                                    zEquals = !((Boolean) objM38182).booleanValue();
                                } else if (objM38182 instanceof Integer) {
                                    if (((Integer) objM38182).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM38182 instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objM38182).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM38182 instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objM38182).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM38182 instanceof String) {
                                    zEquals = objM38182.equals("");
                                } else if (objM38182 instanceof AbstractC23725) {
                                    zEquals = objM38182.equals(AbstractC23725.f76778);
                                } else if ((objM38182 instanceof InterfaceC23206) ? !((objM38182 instanceof Enum) && ((Enum) objM38182).ordinal() == 0) : objM38182 != ((InterfaceC23206) objM38182).getDefaultInstanceForType()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) AbstractC16129.m38182(method2, abstractC16129, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                m48553(sb, i, strSubstring, objM38182);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objM38182 = AbstractC16129.m38182(method, abstractC16129, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objM38182 instanceof Boolean) {
                                zEquals = !((Boolean) objM38182).booleanValue();
                            } else if (objM38182 instanceof Integer) {
                                if (((Integer) objM38182).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM38182 instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objM38182).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM38182 instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objM38182).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM38182 instanceof String) {
                                zEquals = objM38182.equals("");
                            } else if (objM38182 instanceof AbstractC23725) {
                                zEquals = objM38182.equals(AbstractC23725.f76778);
                            } else if (objM38182 instanceof InterfaceC23206) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) AbstractC16129.m38182(method2, abstractC16129, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            m48553(sb, i, strSubstring, objM38182);
                        }
                    }
                }
            }
            i2 = 3;
        }
        if (abstractC16129 instanceof AbstractC19657) {
            Iterator itM21847 = ((AbstractC19657) abstractC16129).f63110.m21847();
            while (itM21847.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itM21847.next();
                ((C9074) entry2.getKey()).getClass();
                m48553(sb, i, "[0]", entry2.getValue());
            }
        }
        C22937 c22937 = abstractC16129.f52121;
        if (c22937 != null) {
            c22937.m50772(sb, i);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48553(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m48553(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m48553(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m48552(sb, i);
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
            sb.append(C4591.m12739(AbstractC23725.m52256((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC23725) {
            sb.append(": \"");
            sb.append(C4591.m12739((AbstractC23725) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC16129) {
            sb.append(" {");
            m48554((AbstractC16129) obj, sb, i + 2);
            sb.append("\n");
            m48552(sb, i);
            sb.append(l.d);
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i3 = i + 2;
            m48553(sb, i3, "key", entry.getKey());
            m48553(sb, i3, b.d, entry.getValue());
            sb.append("\n");
            m48552(sb, i);
            sb.append(l.d);
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48552(StringBuilder sb, int i) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f70583, 0, i2);
            i -= i2;
        }
    }
}
