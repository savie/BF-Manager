package l;

import com.google.android.material.motion.MotionUtils;
import com.umeng.commonsdk.UMConfigure;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;
import net.engio.mbassy.listener.MessageHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۬֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: EIWH */
/* JADX INFO: loaded from: classes4.dex */
public final class C13534 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashSet f43003;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f43004;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f43005;

    static {
        Pattern patternCompile = Pattern.compile("\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*");
        f43004 = patternCompile;
        f43005 = Pattern.compile(MotionUtils.EASING_TYPE_FORMAT_START + patternCompile + "\\.)*" + patternCompile);
        f43003 = new HashSet(Arrays.asList("_", "abstract", "assert", ClassTransform.BOOLEAN, "break", ClassTransform.BYTE, "case", "catch", ClassTransform.CHARACTER, Name.LABEL, "const", "continue", "default", "do", ClassTransform.DOUBLE, "else", "enum", "extends", "false", "final", "finally", ClassTransform.FLOAT, "for", "goto", "if", "implements", "import", "instanceof", ClassTransform.INTEGER, "interface", ClassTransform.LONG, UMConfigure.WRAPER_TYPE_NATIVE, "new", "null", "package", "private", "protected", "public", "return", ClassTransform.SHORT, "static", "strictfp", "super", "switch", MessageHandler.Properties.IsSynchronized, "this", "throw", "throws", "transient", "true", "try", ClassTransform.VOID, "volatile", "while"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m33239(String str) {
        int i = C12326.f39603;
        if (str == null || str.isEmpty() || f43003.contains(str) || !f43004.matcher(str).matches()) {
            return false;
        }
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (32 > iCodePointAt || iCodePointAt > 126) {
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m33240(String str) {
        int i = C12326.f39603;
        return (str == null || str.isEmpty() || f43003.contains(str) || !f43004.matcher(str).matches()) ? false : true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m33241(String str) {
        int i = C12326.f39603;
        return (str == null || str.isEmpty() || f43003.contains(str) || !f43005.matcher(str).matches()) ? false : true;
    }
}
