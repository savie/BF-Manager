package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܿۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8G3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18307 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42692(C14160 c14160, C1483 c1483) {
        StringBuilder sb = new StringBuilder("XposedHelpers.get");
        if (c1483.f5152) {
            sb.append("Static");
        }
        String str = c1483.f5154;
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
        return C8947.m23910(sb, c14160.f44771, "\");");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m42694(String str) {
        return str.substring(1, str.length() - 1).replace('/', '.');
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42691(C14160 c14160) {
        String str = c14160.f44771;
        return C3188.m10404("Class<?> ", str.matches("[a-zA-Z]\\w*") ? str.concat("Class") : String.format("cls%X", Integer.valueOf(str.hashCode() & 65535)), " = classLoader.loadClass(\"", m42694(c14160.f44772), "\");");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m42693(C14160 c14160, C9685 c9685) {
        String strM34865;
        String str = c9685.f31271;
        if (str.equals("<clinit>")) {
            return "";
        }
        ArrayList<C21291> arrayList = new ArrayList();
        C24275 c24275 = new C24275(c9685.f31265);
        while (true) {
            String strM54278 = c24275.m54278();
            if (strM54278 == null) {
                break;
            }
            arrayList.add(new C21291(strM54278));
        }
        StringBuilder sb = new StringBuilder("XposedHelpers.");
        if (str.equals("<init>")) {
            sb.append("findAndHookConstructor");
        } else {
            sb.append("findAndHookMethod");
        }
        sb.append("(\"");
        sb.append(m42694(c14160.f44772));
        sb.append("\", classLoader");
        if (!str.equals("<init>")) {
            C22121.m50078(sb, ", \"", str, "\"");
        }
        for (C21291 c21291 : arrayList) {
            sb.append(", ");
            int i = c21291.f67890;
            String str2 = c21291.f67892;
            if (c21291.f67891) {
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
                strM34865 = sb2.toString();
            } else {
                if (i > 0) {
                    str2 = c21291.f67893;
                }
                strM34865 = C14442.m34865("classLoader.loadClass(\"", str2, "\")");
            }
            sb.append(strM34865);
        }
        sb.append(", new XC_MethodHook() {\n    @Override\n    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {\n        super.beforeHookedMethod(param);\n    }\n    @Override\n    protected void afterHookedMethod(MethodHookParam param) throws Throwable {\n        super.afterHookedMethod(param);\n    }\n});");
        return sb.toString();
    }
}
