package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩻ۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8G3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23403 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f75797;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f75798;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f75799;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f75800;

    public C23403(String str) {
        String strM34341;
        this.f75797 = str;
        boolean z = false;
        int i = 0;
        while (str.charAt(i) == '[') {
            i++;
        }
        this.f75798 = i;
        String strSubstring = str.substring(i);
        strSubstring.getClass();
        switch (strSubstring) {
            case "B":
                strM34341 = ClassTransform.BYTE;
                z = true;
                break;
            case "C":
                strM34341 = ClassTransform.CHARACTER;
                z = true;
                break;
            case "D":
                strM34341 = ClassTransform.DOUBLE;
                z = true;
                break;
            case "F":
                strM34341 = ClassTransform.FLOAT;
                z = true;
                break;
            case "I":
                strM34341 = ClassTransform.INTEGER;
                z = true;
                break;
            case "J":
                strM34341 = ClassTransform.LONG;
                z = true;
                break;
            case "S":
                strM34341 = ClassTransform.SHORT;
                z = true;
                break;
            case "V":
                strM34341 = ClassTransform.VOID;
                z = true;
                break;
            case "Z":
                strM34341 = ClassTransform.BOOLEAN;
                z = true;
                break;
            default:
                strM34341 = C14231.m34341(strSubstring);
                try {
                    ClassLoader.getSystemClassLoader().loadClass(strM34341);
                    z = true;
                    break;
                } catch (Exception unused) {
                    break;
                }
                break;
        }
        this.f75800 = strM34341;
        this.f75799 = z;
    }
}
