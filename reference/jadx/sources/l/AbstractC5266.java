package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ᩻᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: P1WW */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5266 extends AbstractC13819 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f18563;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C17549 f18564;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f18565;

    public AbstractC5266(C22420 c22420, InterfaceC23517 interfaceC23517, String str, boolean z) {
        super(c22420, interfaceC23517);
        if (z) {
            this.f18565 = "[ZIJDFCSB]*" + C17370.m40798(str) + "[ZIJDFCSB]*";
            this.f18563 = true;
            return;
        }
        this.f18565 = str;
        this.f18563 = false;
    }

    @Override // l.AbstractC13819
    /* JADX INFO: renamed from: ۙ */
    public List mo12249(C22420 c22420) {
        boolean zEquals;
        InterfaceC7140 interfaceC7140Mo13175;
        ArrayList arrayList = new ArrayList();
        for (C7447 c7447 : c22420.f72611.values()) {
            if (mo15856(c7447)) {
                for (C5122 c5122 : c7447.mo20405()) {
                    if (mo15855(c5122) && c5122.mo6802().equals("Ljava/lang/String;")) {
                        String strM35126 = C14565.m35126(c5122);
                        boolean z = this.f18563;
                        String str = this.f18565;
                        if (z) {
                            zEquals = strM35126.matches(str);
                        } else {
                            zEquals = strM35126.equals(str);
                        }
                        if (zEquals && (interfaceC7140Mo13175 = c5122.mo13175()) != null && mo7732(c5122, interfaceC7140Mo13175)) {
                            arrayList.add(c5122);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo15856(C7447 c7447) {
        return EnumC2536.PUBLIC.m8459(c7447.mo20404()) && "Ljava/lang/Object;".equals(c7447.mo20397());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:93:0x012b  */
    /* JADX INFO: renamed from: ۙ */
    public boolean mo7732(C5122 c5122, InterfaceC7140 interfaceC7140) {
        C22420 c22420 = this.f75089;
        C17549 c17549 = new C17549(c22420);
        this.f18564 = c17549;
        c17549.m41204(c5122);
        for (InterfaceC4859 interfaceC4859 : this.f18564.m41203()) {
            String strMo6804 = interfaceC4859.mo6804();
            if (c22420.f72609) {
                strMo6804.getClass();
                switch (strMo6804) {
                    case "Lorg/json/JSONObject;":
                    case "Ljava/net/InetAddress;":
                    case "Ljava/net/HttpURLConnection;":
                    case "Ljava/net/URL;":
                        return false;
                    default:
                        if (strMo6804.startsWith("Ljava/util/concurrent/") || strMo6804.startsWith("Lorg/xml/") || strMo6804.startsWith("Lorg/json/") || strMo6804.startsWith("Ljavax/xml/") || strMo6804.startsWith("Landroid/view/") || strMo6804.startsWith("Landroid/graphics/")) {
                            return false;
                        }
                        break;
                }
            } else {
                strMo6804.getClass();
                switch (strMo6804) {
                    case "Ljava/io/RandomAccessFile;":
                    case "Ljava/text/SimpleDateFormat;":
                    case "Ljava/util/Calendar;":
                    case "Lorg/json/JSONObject;":
                    case "Ljava/net/InetAddress;":
                    case "Ljava/io/File;":
                    case "Ljava/util/Date;":
                    case "Ljava/io/FileInputStream;":
                    case "Ljava/net/HttpURLConnection;":
                    case "Ljava/io/FileOutputStream;":
                    case "Ljava/net/URL;":
                        return false;
                    default:
                        if (strMo6804.startsWith("Ljava/nio/file/") || strMo6804.startsWith("Ljava/util/concurrent/") || strMo6804.startsWith("Lorg/xml/") || strMo6804.startsWith("Lorg/json/") || strMo6804.startsWith("Ljavax/xml/") || strMo6804.startsWith("Landroid/app/") || strMo6804.startsWith("Landroid/view/") || strMo6804.startsWith("Landroid/content/") || strMo6804.startsWith("Landroid/graphics/") || strMo6804.startsWith("Landroid/os/")) {
                            return false;
                        }
                        break;
                }
            }
            if (strMo6804.equals("Ljava/lang/Runtime;") && interfaceC4859.getName().equals("exec")) {
                return false;
            }
            if (strMo6804.equals("Ljava/lang/Thread;") && interfaceC4859.getName().equals("start")) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo15855(C5122 c5122) {
        return EnumC2536.PUBLIC.m8459(c5122.mo13184()) && EnumC2536.STATIC.m8459(c5122.mo13184());
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m15857() {
        Iterator it = this.f18564.m41203().iterator();
        if (!it.hasNext()) {
            return true;
        }
        String strMo6804 = ((InterfaceC4859) it.next()).mo6804();
        return strMo6804.startsWith("Ljava/lang/") || strMo6804.startsWith("Ljavax/crypto/") || strMo6804.equals("Ljava/io/ByteArrayOutputStream;");
    }
}
