package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1WW */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2832 extends AbstractC12006 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean f10721;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C8000 f10722;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f10723;

    public AbstractC2832(C5655 c5655, InterfaceC8706 interfaceC8706, String str, boolean z) {
        super(c5655, interfaceC8706);
        if (z) {
            this.f10723 = "[ZIJDFCSB]*" + C17874.m41459(str) + "[ZIJDFCSB]*";
            this.f10721 = true;
            return;
        }
        this.f10723 = str;
        this.f10721 = false;
    }

    @Override // l.AbstractC12006
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List mo8585(C5655 c5655) {
        boolean zEquals;
        InterfaceC7945 interfaceC7945Mo25747;
        ArrayList arrayList = new ArrayList();
        for (C19213 c19213 : c5655.f19322.values()) {
            if (mo8588(c19213)) {
                for (C10124 c10124 : c19213.mo20495()) {
                    if (mo8586(c10124) && c10124.mo9698().equals("Ljava/lang/String;")) {
                        String strM38732 = C16467.m38732(c10124);
                        boolean z = this.f10721;
                        String str = this.f10723;
                        if (z) {
                            zEquals = strM38732.matches(str);
                        } else {
                            zEquals = strM38732.equals(str);
                        }
                        if (zEquals && (interfaceC7945Mo25747 = c10124.mo25747()) != null && mo8587(c10124, interfaceC7945Mo25747)) {
                            arrayList.add(c10124);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo8588(C19213 c19213) {
        return EnumC15236.PUBLIC.m36501(c19213.mo20491()) && "Ljava/lang/Object;".equals(c19213.mo20494());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:93:0x012b  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo8587(C10124 c10124, InterfaceC7945 interfaceC7945) {
        C5655 c5655 = this.f5864;
        C8000 c8000 = new C8000(c5655);
        this.f10722 = c8000;
        c8000.m21065(c10124);
        for (InterfaceC8858 interfaceC8858 : this.f10722.m21064()) {
            String strMo9700 = interfaceC8858.mo9700();
            if (c5655.f19323) {
                strMo9700.getClass();
                switch (strMo9700) {
                    case "Lorg/json/JSONObject;":
                    case "Ljava/net/InetAddress;":
                    case "Ljava/net/HttpURLConnection;":
                    case "Ljava/net/URL;":
                        return false;
                    default:
                        if (strMo9700.startsWith("Ljava/util/concurrent/") || strMo9700.startsWith("Lorg/xml/") || strMo9700.startsWith("Lorg/json/") || strMo9700.startsWith("Ljavax/xml/") || strMo9700.startsWith("Landroid/view/") || strMo9700.startsWith("Landroid/graphics/")) {
                            return false;
                        }
                        break;
                }
            } else {
                strMo9700.getClass();
                switch (strMo9700) {
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
                        if (strMo9700.startsWith("Ljava/nio/file/") || strMo9700.startsWith("Ljava/util/concurrent/") || strMo9700.startsWith("Lorg/xml/") || strMo9700.startsWith("Lorg/json/") || strMo9700.startsWith("Ljavax/xml/") || strMo9700.startsWith("Landroid/app/") || strMo9700.startsWith("Landroid/view/") || strMo9700.startsWith("Landroid/content/") || strMo9700.startsWith("Landroid/graphics/") || strMo9700.startsWith("Landroid/os/")) {
                            return false;
                        }
                        break;
                }
            }
            if (strMo9700.equals("Ljava/lang/Runtime;") && interfaceC8858.getName().equals("exec")) {
                return false;
            }
            if (strMo9700.equals("Ljava/lang/Thread;") && interfaceC8858.getName().equals("start")) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo8586(C10124 c10124) {
        return EnumC15236.PUBLIC.m36501(c10124.mo25750()) && EnumC15236.STATIC.m36501(c10124.mo25750());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m8589() {
        Iterator it = this.f10722.m21064().iterator();
        if (!it.hasNext()) {
            return true;
        }
        String strMo9700 = ((InterfaceC8858) it.next()).mo9700();
        return strMo9700.startsWith("Ljava/lang/") || strMo9700.startsWith("Ljavax/crypto/") || strMo9700.equals("Ljava/io/ByteArrayOutputStream;");
    }
}
