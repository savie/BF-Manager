package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩶ۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8G3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21291 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f67890;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f67891;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f67892;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f67893;

    public C21291(String str) {
        String strM42694;
        this.f67893 = str;
        boolean z = false;
        int i = 0;
        while (str.charAt(i) == '[') {
            i++;
        }
        this.f67890 = i;
        String strSubstring = str.substring(i);
        strSubstring.getClass();
        switch (strSubstring) {
            case "B":
                strM42694 = ClassTransform.BYTE;
                z = true;
                break;
            case "C":
                strM42694 = ClassTransform.CHARACTER;
                z = true;
                break;
            case "D":
                strM42694 = ClassTransform.DOUBLE;
                z = true;
                break;
            case "F":
                strM42694 = ClassTransform.FLOAT;
                z = true;
                break;
            case "I":
                strM42694 = ClassTransform.INTEGER;
                z = true;
                break;
            case "J":
                strM42694 = ClassTransform.LONG;
                z = true;
                break;
            case "S":
                strM42694 = ClassTransform.SHORT;
                z = true;
                break;
            case "V":
                strM42694 = ClassTransform.VOID;
                z = true;
                break;
            case "Z":
                strM42694 = ClassTransform.BOOLEAN;
                z = true;
                break;
            default:
                strM42694 = C18307.m42694(strSubstring);
                try {
                    ClassLoader.getSystemClassLoader().loadClass(strM42694);
                    z = true;
                    break;
                } catch (Exception unused) {
                    break;
                }
                break;
        }
        this.f67892 = strM42694;
        this.f67891 = z;
    }
}
