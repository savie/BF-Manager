package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩵֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77VL */
/* JADX INFO: loaded from: classes5.dex */
public final class C20199 extends IOException {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f64841;

    public C20199(int i, String str) {
        super(m46456(i, str));
        this.f64841 = i;
    }

    public C20199(String str, Exception exc) {
        super(m46456(4, str), exc);
        this.f64841 = 4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m46456(int i, String str) {
        String[] strArrM9895 = C3045.m9895(i);
        if (strArrM9895 == null) {
            return C14483.m34972(str, " (UNKNOW SFTP ERROR CODE)");
        }
        StringBuilder sbM10405 = C3188.m10405(str, " (");
        sbM10405.append(strArrM9895[0]);
        sbM10405.append(": ");
        return C8947.m23910(sbM10405, strArrM9895[1], MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
