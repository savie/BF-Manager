package l;

import com.google.android.material.motion.MotionUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: l.ᩴ᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 55PX */
/* JADX INFO: loaded from: classes5.dex */
public class C19034 extends AbstractC11979 {
    @Override // l.AbstractC11979
    /* JADX INFO: renamed from: ۙ */
    public final C12497 mo4882() {
        return new C12497("VMS", "d-MMM-yyyy HH:mm:ss", null);
    }

    @Override // l.InterfaceC23786
    /* JADX INFO: renamed from: ۙ */
    public final C11086 mo4881(String str) {
        String strNextToken;
        String strNextToken2 = null;
        if (!m29790(str)) {
            return null;
        }
        C11086 c11086 = new C11086();
        c11086.m27944(str);
        String strM29788 = m29788(1);
        String strM29789 = m29788(2);
        String str2 = m29788(3) + " " + m29788(4);
        String strM297810 = m29788(5);
        String[] strArr = {m29788(9), m29788(10), m29788(11)};
        try {
            c11086.m27951(m29789(str2));
        } catch (ParseException unused) {
        }
        StringTokenizer stringTokenizer = new StringTokenizer(strM297810, ",");
        int iCountTokens = stringTokenizer.countTokens();
        if (iCountTokens == 1) {
            strNextToken = stringTokenizer.nextToken();
        } else if (iCountTokens != 2) {
            strNextToken = null;
        } else {
            strNextToken2 = stringTokenizer.nextToken();
            strNextToken = stringTokenizer.nextToken();
        }
        if (strM29788.lastIndexOf(".DIR") != -1) {
            c11086.m27947(1);
        } else {
            c11086.m27947(0);
        }
        c11086.m27957(strM29788);
        c11086.m27949(Long.parseLong(strM29789) * 512);
        c11086.m27950(strNextToken2);
        c11086.m27954(strNextToken);
        for (int i = 0; i < 3; i++) {
            String str3 = strArr[i];
            c11086.m27948(i, 0, str3.indexOf(82) >= 0);
            c11086.m27948(i, 1, str3.indexOf(87) >= 0);
            c11086.m27948(i, 2, str3.indexOf(69) >= 0);
        }
        return c11086;
    }

    @Override // l.AbstractC14614, l.InterfaceC23786
    /* JADX INFO: renamed from: ۙ */
    public final String mo35090(BufferedReader bufferedReader) throws IOException {
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
