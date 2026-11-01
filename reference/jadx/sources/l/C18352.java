package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.ᩳ᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: YBJ2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18352 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7063 f58554;

    public C18352(C7063 c7063) {
        this.f58554 = c7063;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m42610(C21880 c21880, String str) {
        StringBuilder sb = new StringBuilder(1024);
        sb.append('<');
        sb.append(c21880.m48671());
        String str2 = str + this.f58554.m18930();
        boolean z = true;
        if (c21880.m48665() == 1) {
            C23292 c23292M48666 = c21880.m48666(0);
            String str3 = c23292M48666.m51377() + "=" + c23292M48666.m51379() + c23292M48666.m51378() + c23292M48666.m51379();
            if (str3.length() > 80) {
                sb.append("\n");
                sb.append(str2);
            } else {
                sb.append(" ");
            }
            sb.append(str3);
        } else {
            for (int i = 0; i < c21880.m48665(); i++) {
                C23292 c23292M48667 = c21880.m48666(i);
                String strM51377 = c23292M48667.m51377();
                if (strM51377.startsWith("xmlns:") || strM51377.equals("xmlns")) {
                    if (z) {
                        sb.append(" ");
                        z = false;
                    } else {
                        sb.append("\n");
                        sb.append(str2);
                    }
                    sb.append(c23292M48667.m51377());
                    sb.append(a.h);
                    sb.append(c23292M48667.m51379());
                    sb.append(c23292M48667.m51378());
                    sb.append(c23292M48667.m51379());
                }
            }
            for (int i2 = 0; i2 < c21880.m48665(); i2++) {
                C23292 c23292M48668 = c21880.m48666(i2);
                String strM51378 = c23292M48668.m51377();
                if (!strM51378.startsWith("xmlns:") && !strM51378.equals("xmlns")) {
                    sb.append("\n");
                    sb.append(str2);
                    sb.append(c23292M48668.m51377());
                    sb.append(a.h);
                    sb.append(c23292M48668.m51379());
                    sb.append(c23292M48668.m51378());
                    sb.append(c23292M48668.m51379());
                }
            }
        }
        if (c21880.m48670()) {
            sb.append(" /");
        }
        sb.append('>');
        return sb.toString();
    }
}
