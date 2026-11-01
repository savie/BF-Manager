package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8G3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14231 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34340(C23028 c23028, C22322 c22322) {
        StringBuilder sb = new StringBuilder("XposedHelpers.get");
        if (c22322.f72897) {
            sb.append("Static");
        }
        String str = c22322.f72899;
        str.getClass();
        switch (str) {
            case "B":
                sb.append("Byte");
                break;
            case "C":
                sb.append("Char");
                break;
            case "D":
                sb.append("Double");
                break;
            case "F":
                sb.append("Float");
                break;
            case "I":
                sb.append("Int");
                break;
            case "J":
                sb.append("Long");
                break;
            case "S":
                sb.append("Short");
                break;
            case "Z":
                sb.append("Boolean");
                break;
        }
        sb.append("Field(/*runtimeObject*/, \"");
        return C22697.m50267(sb, c23028.f74837, "\");");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m34341(String str) {
        return str.substring(1, str.length() - 1).replace('/', '.');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34338(C23028 c23028) {
        String str = c23028.f74837;
        return C0242.m1617("Class<?> ", str.matches("[a-zA-Z]\\w*") ? str.concat("Class") : String.format("cls%X", Integer.valueOf(str.hashCode() & 65535)), " = classLoader.loadClass(\"", m34341(c23028.f74834), "\");");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m34339(C23028 c23028, C1154 c1154) {
        String strM38890;
        String str = c1154.f5175;
        if (str.equals("<clinit>")) {
            return "";
        }
        ArrayList<C23403> arrayList = new ArrayList();
        C17052 c17052 = new C17052(c1154.f5176);
        while (true) {
            String strM39831 = c17052.m39831();
            if (strM39831 == null) {
                break;
            }
            arrayList.add(new C23403(strM39831));
        }
        StringBuilder sb = new StringBuilder("XposedHelpers.");
        if (str.equals("<init>")) {
            sb.append("findAndHookConstructor");
        } else {
            sb.append("findAndHookMethod");
        }
        sb.append("(\"");
        sb.append(m34341(c23028.f74834));
        sb.append("\", classLoader");
        if (!str.equals("<init>")) {
            C0219.m1594(sb, ", \"", str, "\"");
        }
        for (C23403 c23403 : arrayList) {
            sb.append(", ");
            int i = c23403.f75798;
            String str2 = c23403.f75800;
            if (c23403.f75799) {
                StringBuilder sb2 = new StringBuilder();
                if (str2.startsWith("java.lang.")) {
                    sb2.append(str2.substring(10));
                } else {
                    sb2.append(str2);
                }
                for (int i2 = 0; i2 < i; i2++) {
                    sb2.append("[]");
                }
                sb2.append(".class");
                strM38890 = sb2.toString();
            } else {
                if (i > 0) {
                    str2 = c23403.f75797;
                }
                strM38890 = C16523.m38890("classLoader.loadClass(\"", str2, "\")");
            }
            sb.append(strM38890);
        }
        sb.append(", new XC_MethodHook() {\n    @Override\n    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {\n        super.beforeHookedMethod(param);\n    }\n    @Override\n    protected void afterHookedMethod(MethodHookParam param) throws Throwable {\n        super.afterHookedMethod(param);\n    }\n});");
        return sb.toString();
    }
}
