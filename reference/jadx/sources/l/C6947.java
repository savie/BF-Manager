package l;

import com.google.android.material.motion.MotionUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: l.ۜۛۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55PX */
/* JADX INFO: loaded from: classes3.dex */
public class C6947 extends AbstractC3964 {
    @Override // l.AbstractC3964
    /* JADX INFO: renamed from: ۙ */
    public final C11421 mo1714() {
        return new C11421("VMS", "d-MMM-yyyy HH:mm:ss", null);
    }

    @Override // l.InterfaceC15896
    /* JADX INFO: renamed from: ۙ */
    public final C17388 mo1715(String str) {
        String strNextToken;
        String strNextToken2 = null;
        if (!m12703(str)) {
            return null;
        }
        C17388 c17388 = new C17388();
        c17388.m40844(str);
        String strM12701 = m12701(1);
        String strM12702 = m12701(2);
        String str2 = m12701(3) + " " + m12701(4);
        String strM12703 = m12701(5);
        String[] strArr = {m12701(9), m12701(10), m12701(11)};
        try {
            c17388.m40831(m12702(str2));
        } catch (ParseException unused) {
        }
        StringTokenizer stringTokenizer = new StringTokenizer(strM12703, ",");
        int iCountTokens = stringTokenizer.countTokens();
        if (iCountTokens == 1) {
            strNextToken = stringTokenizer.nextToken();
        } else if (iCountTokens != 2) {
            strNextToken = null;
        } else {
            strNextToken2 = stringTokenizer.nextToken();
            strNextToken = stringTokenizer.nextToken();
        }
        if (strM12701.lastIndexOf(".DIR") != -1) {
            c17388.m40827(1);
        } else {
            c17388.m40827(0);
        }
        c17388.m40835(strM12701);
        c17388.m40829(Long.parseLong(strM12702) * 512);
        c17388.m40830(strNextToken2);
        c17388.m40840(strNextToken);
        for (int i = 0; i < 3; i++) {
            String str3 = strArr[i];
            c17388.m40828(i, 0, str3.indexOf(82) >= 0);
            c17388.m40828(i, 1, str3.indexOf(87) >= 0);
            c17388.m40828(i, 2, str3.indexOf(69) >= 0);
        }
        return c17388;
    }

    @Override // l.AbstractC23356, l.InterfaceC15896
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo19232(BufferedReader bufferedReader) throws IOException {
        String line = bufferedReader.readLine();
        StringBuilder sb = new StringBuilder();
        while (line != null) {
            if (line.startsWith("Directory") || line.startsWith("Total")) {
                line = bufferedReader.readLine();
            } else {
                sb.append(line);
                if (line.trim().endsWith(MotionUtils.EASING_TYPE_FORMAT_END)) {
                    break;
                }
                line = bufferedReader.readLine();
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }
}
