package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۨ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77VL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12019 extends IOException {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f40261;

    public C12019(int i, String str) {
        super(m29919(i, str));
        this.f40261 = i;
    }

    public C12019(String str, Exception exc) {
        super(m29919(4, str), exc);
        this.f40261 = 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m29919(int i, String str) {
        String[] strArrM34177 = C14136.m34177(i);
        if (strArrM34177 == null) {
            return C15489.m37076(str, " (UNKNOW SFTP ERROR CODE)");
        }
        StringBuilder sbM8976 = C3012.m8976(str, " (");
        sbM8976.append(strArrM34177[0]);
        sbM8976.append(": ");
        return C22697.m50267(sbM8976, strArrM34177[1], MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
