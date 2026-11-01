package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.᩶ۗ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: H72R */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19901 {

    /* JADX INFO: renamed from: ᩻֨ۗ, reason: not valid java name and contains not printable characters */
    private static final short[] f63796 = {5275, -4930, -4987, -4982, -4983, -4985, -4978, -4917, -4961, -4988, -4917, -4977, -4978, -4961, -4978, -4967, -4986, -4990, -4987, -4978, -4917, -4961, -4989, -4978, -4917, -4984, -4962, -4967, -4967, -4978, -4987, -4961, -4917, -4965, -4967, -4988, -4984, -4978, -4968, -4968, -4917, -4950, -4951, -4958, -4930, -4987, -4968, -4962, -4965, -4965, -4988, -4967, -4961, -4978, -4977, -4917, -4950, -4951, -4958, -4911, -4917, -4917, -4985, -4990, -4983, -4967, -4982, -4967, -4974, -4923, -4961, -4986, -4965, -4922, -4947, -4982, -4990, -4985, -4978, -4977, -4917, -4961, -4988, -4917, -4965, -4967, -4978, -4965, -4982, -4967, -4978, -4917, -4954, -4990, -4968, -4968, -4990, -4987, -4980, -4917, -4947, -4982, -4990, -4985, -4978, -4977, -4917, -4961, -4988, -4917, -4965, -4962, -4983, -4985, -4990, -4968, -4989, -4917, -4965, -4967, -4978, -4965, -4982, -4967, -4978, -4977, -4917, -4947, -4982, -4990, -4985, -4978, -4977, -4917, -4961, -4988, -4917, -4984, -4967, -4978, -4982, -4961, -4978, -4917, -4917, -4985, -4990, -4983, -4967, -4982, -4967, -4974, -4917, -4984, -4982, -4984, -4989, -4978, -4917, -4977, -4990, -4967, -4978, -4984, -4961, -4988, -4967, -4974, -4947, -4982, -4990, -4985, -4978, -4977, -4917, -4961, -4988, -4917, -4967, -4978, -4986, -4988, -4963, -4978, -4917, -4990, -4987, -4963, -4982, -4985, -4990, -4977, -4917, -4917, -4985, -4990, -4983, -4967, -4982, -4967, -4974, -4917, -4984, -4982, -4984, -4989, -4978, -4984, -4982, -4984, -4989, -4978, -4977, -4982, -4967, -4986, -4899, -4897, -4922, -4963, -4909, -4982, -4947, -4982, -4990, -4985, -4978, -4977, -4917, -4961, -4988, -4917, -4963, -4978, -4967, -4990, -4979, -4974, -4917, -4984, -4982, -4984, -4989, -4978, -4977, -4917, -4917, -4985, -4990, -4983, -4967, -4982, -4967, -4974, -4917, -4979, -4988, -4967, -4917, -4950, -4951, -4958, -4917, -4917, -4985, -4990, -4983, -4967, -4982, -4967, -4974, -4917, -4977, -4988, -4964, -4987, -4985, -4988, -4982, -4977, -4917, -4930, -4935, -4953, -4917, -4985, -4990, -4983, -4967, -4982, -4967, -4974, -4917, -4967, -4978, -4966, -4962, -4978, -4968, -4961, -4917, -4979, -4982, -4990, -4985, -4978, -4977, -4917, -4964, -4990, -4961, -4989, -4917, -4957, -4929, -4929, -4933, -4917, -4965, -4967, -4978, -4965, -4982, -4967, -4978, -4977, -4917, -4985, -4990, -4983, -4967, -4982, -4967, -4974, -4917, -4967, -4978, -4968, -4965, -4988, -4987, -4968, -4978, -4917, -4983, -4988, -4977, -4974, -4917, -4990, -4968, -4917, -4978, -4986, -4965, -4961, -4974, 550, 16043, 16012, 16004, 16001, 16008, 16009, 16077, 16025, 16002, 16077, 16031, 16008, 16000, 16002, 16027, 16008, 16077, 16024, 16003, 16001, 16002, 16012, 16009, 16012, 16015, 16001, 16008, 16077, 16077, 16001, 16004, 16015, 16031, 16012, 16031, 16020, 16077, 16014, 16012, 16014, 16005, 16008, 16077, 16077, 16001, 16004, 16015, 16031, 16012, 16031, 16020, 16043, 16012, 16004, 16001, 16008, 16009, 16077, 16025, 16002, 16077, 16001, 16002, 16012, 16009, 16077, 16043, 16012, 16004, 16001, 16008, 16009, 16077, 16025, 16002, 16077, 16004, 16003, 16004, 16025, 16004, 16012, 16001, 16004, 16023, 16008, 16077, 16001, 16002, 16012, 16009, 16008, 16009, 16077, 16077, 16001, 16004, 16015, 16031, 16012, 16031, 16020, 3118, 27510, 27514, 27453, 27445, 27438, 27514, 27407, 27444, 27455, 27426, 27434, 27455, 27449, 27438, 27455, 27454, 27514, 27514, 27446, 27443, 27448, 27432, 27451, 27432, 27427, 27514, 27433, 27443, 27424, 27455, 27488, 27514, 27455, 27426, 27434, 27455, 27449, 27438, 27455, 27454, 27514, 27514, 27446, 27443, 27448, 27432, 27451, 27432, 27427, 27514, 27401, 27410, 27419, 27511, 27496, 27503, 27500, 27488, 27514, 27455, 27426, 27434, 27455, 27449, 27438, 27455, 27454, 27514, 27422, 27455, 27449, 27445, 27447, 27434, 27432, 27455, 27433, 27433, 27455, 27454, 27514, 27514, 27446, 27443, 27448, 27432, 27451, 27432, 27427, 27514, 27455, 27426, 27449, 27455, 27455, 27454, 27433, 27514, 27455, 27426, 27434, 27455, 27449, 27438, 27455, 27454, 27514, 27433, 27443, 27424, 27455};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f63797;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f63798;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object f63799;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f63800;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f63801;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f63802;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract RuntimeException mo45169(String str, Throwable th);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract String mo45170(String str);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void mo45172() {
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract String mo45173();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract C15668 mo45174(String str);

    public AbstractC19901(String str, String str2, String str3, String str4, String str5) {
        Object obj = null;
        int i = -142086100;
        int i2 = C3722.f13525;
        int i3 = C1460.f5948;
        int iM11306 = ThreadFactoryC3888.m11306("۫ᩴ") ^ i3;
        int i4 = ((iM11306 ^ i2) * (-5371)) ^ (-1296217726);
        int i5 = -358060928;
        while (true) {
            i = ((((i ^ i2) * (-3959)) >> 31) & i4) ^ (iM11306 ^ i5);
            switch (i) {
                case -2057777829:
                case -1608938459:
                    this.f63799 = obj;
                    if (C2871.m8646()) {
                        iM11306 = (i2 - C19806.m45029("᩺۠")) * (-61);
                        i4 = ((iM11306 ^ i3) * 29189) ^ 1305700259;
                        i5 = 833561596;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨᩸") + i2) * (-77);
                        i4 = ((iM11306 ^ i3) * (-20239)) ^ 1346130102;
                        i5 = -1919466548;
                    }
                    break;
                case -2053688380:
                case 247339487:
                    obj = new Object();
                    if (C1025.f4800 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7927) ^ (-697895444);
                        i5 = 1857303770;
                    } else {
                        iM11306 = C19806.m45029("ۗ֡") ^ i2;
                        i4 = ((iM11306 ^ i3) * (-28881)) ^ (-1636185768);
                        i5 = -1748283931;
                    }
                    break;
                case -1635625140:
                case 895171602:
                    if (C10634.f36300 < 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7927) ^ (-697895444);
                        i5 = 1857303770;
                    } else {
                        iM11306 = C19806.m45029("۬ۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-16313)) ^ (-127458114);
                        i5 = 1383069820;
                    }
                    break;
                case -1428250644:
                case -513366155:
                    if (C0526.f2219) {
                        iM11306 = C19806.m45029("۬ۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-16313)) ^ (-127458114);
                        i5 = 1383069820;
                    } else {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ۤ᩸")) * 81;
                        i4 = ((iM11306 ^ i2) * (-28553)) ^ (-1790916339);
                        i5 = -926139709;
                    }
                    break;
                case -1296718955:
                case 1179978135:
                    if (C2332.f8260) {
                        iM11306 = (ThreadFactoryC3888.m11306("۟ۙ") ^ i3) * (-47);
                        i4 = ((iM11306 ^ i2) * 26417) ^ 693859354;
                        i5 = 1219066451;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨᩸") + i2) * (-77);
                        i4 = ((iM11306 ^ i3) * (-20239)) ^ 1346130102;
                        i5 = -1919466548;
                    }
                    break;
                case -1069550556:
                case -501718399:
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * 30725) ^ (-593720123);
                        i5 = -1613424406;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("֡ܰ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 9135) ^ (-1152040606);
                        i5 = 290554424;
                    }
                    break;
                case -531188126:
                case 875495501:
                    if (C3722.f13525 <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ᩴ۟")) * (-99);
                        i4 = ((iM11306 ^ i2) * 17183) ^ 842266754;
                        i5 = 789736732;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("᩻᩵") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-9887)) ^ (-1091213999);
                        i5 = -302799107;
                    }
                    break;
                case -476545437:
                case -343140326:
                    if (!C0526.f2219) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧ֨") ^ i3;
                        i4 = ((iM11306 ^ i2) * 30725) ^ (-593720123);
                        i5 = -1613424406;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("֨᩸") + i2) * (-77);
                        i4 = ((iM11306 ^ i3) * (-20239)) ^ 1346130102;
                        i5 = -1919466548;
                    }
                    break;
                case -460208210:
                case 1258654654:
                    this.f63797 = str3;
                    this.f63801 = str4;
                    this.f63798 = str5;
                    return;
                case 166095889:
                case 1631895094:
                    if (C2332.f8260) {
                        iM11306 = (i2 - C19806.m45029("֡᩹")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i4 = ((iM11306 ^ i3) * (-22811)) ^ (-1906491673);
                        i5 = -209058880;
                    } else {
                        iM11306 = C19806.m45029("۬ۡ") ^ i3;
                        i4 = ((iM11306 ^ i2) * (-16313)) ^ (-127458114);
                        i5 = 1383069820;
                    }
                    break;
                case 321950323:
                case 1464717439:
                    if (C2124.f7782 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨᩸") + i2) * (-77);
                        i4 = ((iM11306 ^ i3) * (-20239)) ^ 1346130102;
                        i5 = -1919466548;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("۫᩵") + i2) * (-45);
                        i4 = ((iM11306 ^ i3) * (-3837)) ^ 1876865591;
                        i5 = -1983679751;
                    }
                    break;
                case 536732473:
                case 2076395261:
                    if (!RunnableC0195.m1431()) {
                        iM11306 = (ThreadFactoryC3888.m11306("֨᩸") + i2) * (-77);
                        i4 = ((iM11306 ^ i3) * (-20239)) ^ 1346130102;
                        i5 = -1919466548;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۡۗ") ^ i2;
                        i4 = ((iM11306 ^ i3) * 7927) ^ (-697895444);
                        i5 = 1857303770;
                    }
                    break;
                case 538887264:
                case 943078673:
                    this.f63800 = str;
                    if (C2704.m8255() <= 0) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ᩴ۟")) * (-99);
                        i4 = ((iM11306 ^ i2) * 17183) ^ 842266754;
                        i5 = 789736732;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ᩴۨ") ^ i3;
                        i4 = ((iM11306 ^ i2) * 12959) ^ (-1914451336);
                        i5 = 8681708;
                    }
                    break;
                case 889499425:
                case 2144858626:
                    if (ViewTreeObserverOnPreDrawListenerC3327.m9874()) {
                        iM11306 = (i3 - ThreadFactoryC3888.m11306("ᩴ۟")) * (-99);
                        i4 = ((iM11306 ^ i2) * 17183) ^ 842266754;
                        i5 = 789736732;
                    } else {
                        iM11306 = (ThreadFactoryC3888.m11306("᩹ᩳ") ^ i3) * 97;
                        i4 = ((iM11306 ^ i2) * 7331) ^ (-2044085796);
                        i5 = -384235913;
                    }
                    break;
                case 1159252300:
                case 1271586582:
                    RunnableC0195.m1431();
                    iM11306 = C19806.m45029("۬ۡ") ^ i3;
                    i4 = ((iM11306 ^ i2) * (-16313)) ^ (-127458114);
                    i5 = 1383069820;
                    break;
                default:
                    C1977.m6356();
                    throw new RuntimeException();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45171() {
        if (this.f63802) {
            return;
        }
        synchronized (this.f63799) {
            if (this.f63802) {
                return;
            }
            m45166();
            this.f63802 = true;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 70701. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m45166() {
        /*
            Method dump skipped, instruction units count: 7070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC19901.m45166():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e9, code lost:
    
        if (l.C3660.f13403 < 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011f, code lost:
    
        if (l.C2788.m8472() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0122, code lost:
    
        r0 = (l.ThreadFactoryC3888.m11306("ܺۧ") + r28) * (-59);
        r2 = ((r0 ^ r27) * (-27749)) ^ 929363145;
        r30 = -1058652971;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0140, code lost:
    
        if (l.C2704.m8255() <= 0) goto L28;
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m45168(java.io.InputStream r39, java.io.File r40, l.C15668 r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC19901.m45168(java.io.InputStream, java.io.File, l.ܺۗ۬):void");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45167(File file, String str) {
        int iM11306;
        int i;
        int i2;
        String str2;
        short[] sArr;
        int i3;
        String str3;
        String str4;
        String str5;
        int iM45029;
        int i4;
        int i5;
        int iM11307;
        int i6;
        int i7;
        int i8;
        String str6;
        short s;
        int iM450210;
        int i9;
        int i10;
        String str7;
        short[] sArr2;
        int i11;
        short[] sArr3;
        int iM450211;
        int i12;
        int i13;
        AbstractC19901 abstractC19901 = this;
        int i14 = C2124.f7782;
        int i15 = C1189.f5284;
        int iM11308 = ThreadFactoryC3888.m11306("֡ۘ") ^ i14;
        int i16 = ((iM11308 ^ i15) * (-17695)) ^ (-511482519);
        String strM5502 = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i17 = iM11308 ^ 1751070954;
        LinkageError linkageError = null;
        int i18 = 0;
        int i19 = 0;
        StringBuilder sb = null;
        int i20 = 0;
        int i21 = 0;
        short s2 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 1465034768;
        int i25 = 0;
        short[] sArr6 = null;
        Throwable th = null;
        String str8 = null;
        String strM6918 = null;
        String strM4040 = null;
        String str9 = null;
        String str10 = null;
        short[] sArr7 = null;
        int i26 = 0;
        while (true) {
            i24 = i17 ^ (i16 & (((i24 ^ i15) * 12239) >> 31));
            switch (i24) {
                case -2144556031:
                case -1500144901:
                    i21 = 16109;
                    iM11306 = (i14 - C19806.m45029("ۛۢ")) * 109;
                    i = ((iM11306 ^ i15) * (-5717)) ^ 2104134610;
                    i2 = -193761254;
                    i8 = iM11306 ^ i2;
                    str8 = str8;
                    linkageError = linkageError;
                    i17 = i8;
                    i16 = i;
                    sArr5 = sArr5;
                    abstractC19901 = this;
                    break;
                case -1987820810:
                case -1846164297:
                    str2 = str8;
                    sArr5 = sArr5;
                    linkageError = linkageError;
                    sArr = sArr4;
                    i3 = i23;
                    String strM8240 = C2704.m8240(sArr, i3, 14, i21);
                    str3 = abstractC19901.f63800;
                    str4 = strM5502;
                    String strM38890 = C16523.m38890(str4, str3, strM8240);
                    if (!C1977.m6364(file)) {
                        str5 = strM38890;
                        int iM11309 = (ThreadFactoryC3888.m11306("ᩴ᩹") ^ i15) * 77;
                        strM5502 = str4;
                        i23 = i3;
                        str10 = str3;
                        str9 = str5;
                        str8 = str2;
                        i17 = iM11309 ^ 2018748855;
                        i16 = ((iM11309 ^ i14) * 11413) ^ 687883009;
                        sArr4 = sArr;
                        linkageError = linkageError;
                        abstractC19901 = this;
                        sArr5 = sArr5;
                    } else {
                        int iM450212 = (i14 - C19806.m45029("ᩴۚ")) * (-21);
                        i16 = ((iM450212 ^ i15) * 19945) ^ 1700185092;
                        i23 = i3;
                        str10 = str3;
                        str9 = strM38890;
                        str8 = str2;
                        sArr4 = sArr;
                        i17 = iM450212 ^ (-303070974);
                        linkageError = linkageError;
                        strM5502 = str4;
                        sArr5 = sArr5;
                        abstractC19901 = this;
                    }
                    break;
                case -1931272247:
                case 1529198405:
                    C3743.m10966();
                    if (!C1977.m6356()) {
                        iM11307 = (i14 - ThreadFactoryC3888.m11306("۠ۜ")) * (-77);
                        i6 = ((iM11307 ^ i15) * 17581) ^ 369346257;
                        i7 = 1435772208;
                        i17 = iM11307 ^ i7;
                        i16 = i6;
                    } else {
                        sArr3 = sArr7;
                        str7 = str8;
                        sArr2 = sArr5;
                        i11 = i25;
                        int iM450213 = C19806.m45029("ܰۡ") ^ i15;
                        short[] sArr8 = sArr3;
                        i16 = ((iM450213 ^ i14) * (-18587)) ^ (-541463828);
                        str8 = str7;
                        i17 = iM450213 ^ 717511105;
                        sArr5 = sArr2;
                        i25 = i11;
                        sArr7 = sArr8;
                    }
                    break;
                case -1861841044:
                case 50612375:
                    str6 = str8;
                    sArr5 = sArr5;
                    linkageError = linkageError;
                    s = s2;
                    int i27 = s * 3282;
                    i26 = s * s;
                    if (RunnableC1606.f6488 < 0) {
                        int iM113010 = (ThreadFactoryC3888.m11306("ۤ֫") ^ i14) * 9;
                        i16 = ((iM113010 ^ i15) * 31193) ^ 1449007566;
                        i22 = i27;
                        str8 = str6;
                        s2 = s;
                        i17 = iM113010 ^ (-1351482793);
                        linkageError = linkageError;
                        abstractC19901 = this;
                        sArr5 = sArr5;
                    } else {
                        i22 = i27;
                        iM450210 = (i14 - C19806.m45029("ۤۡ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM450210 ^ i15) * (-12497)) ^ 1969062362;
                        i9 = 538139014;
                        i10 = iM450210 ^ i9;
                        s2 = s;
                        str8 = str6;
                        abstractC19901 = this;
                        i17 = i10;
                        i16 = i4;
                        linkageError = linkageError;
                        sArr5 = sArr5;
                    }
                    break;
                case -1841619440:
                case -298444323:
                    str6 = str8;
                    sArr5 = f63796;
                    i25 = 401;
                    i20 = 8;
                    if (C1460.f5948 < 0) {
                        int iM113011 = ThreadFactoryC3888.m11306("ۙᩳ") ^ i14;
                        i6 = ((iM113011 ^ i15) * 25697) ^ (-336260768);
                        str8 = str6;
                        i17 = iM113011 ^ 615278874;
                        i16 = i6;
                    } else {
                        s = s2;
                        sArr5 = sArr5;
                        linkageError = linkageError;
                        iM450210 = (i14 - C19806.m45029("ۤۡ")) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i4 = ((iM450210 ^ i15) * (-12497)) ^ 1969062362;
                        i9 = 538139014;
                        i10 = iM450210 ^ i9;
                        s2 = s;
                        str8 = str6;
                        abstractC19901 = this;
                        i17 = i10;
                        i16 = i4;
                        linkageError = linkageError;
                        sArr5 = sArr5;
                    }
                    break;
                case -1694218757:
                case 943485728:
                    str8 = str8;
                    sArr5 = sArr5;
                    linkageError = linkageError;
                    if (i22 - (i26 + 2692881) <= 0) {
                        iM11306 = C19806.m45029("᩹ۧ") ^ i15;
                        i = ((iM11306 ^ i14) * 16779) ^ (-2093231034);
                        i2 = -691004604;
                    } else {
                        iM11306 = (i15 - ThreadFactoryC3888.m11306("ۤۜ")) * 29;
                        i = ((iM11306 ^ i14) * (-25069)) ^ 1835525441;
                        i2 = 1694069313;
                    }
                    i8 = iM11306 ^ i2;
                    str8 = str8;
                    linkageError = linkageError;
                    i17 = i8;
                    i16 = i;
                    sArr5 = sArr5;
                    abstractC19901 = this;
                    break;
                case -1682772167:
                case 1064667678:
                    C1460.m5050();
                    if (C2477.f9839 > 0) {
                        str8 = str8;
                        sArr5 = sArr5;
                        linkageError = linkageError;
                        iM11306 = (ThreadFactoryC3888.m11306("ܿܶ") ^ i15) * 31;
                        i = ((iM11306 ^ i14) * (-16945)) ^ 1860924114;
                        i2 = 1981946350;
                        i8 = iM11306 ^ i2;
                        str8 = str8;
                        linkageError = linkageError;
                        i17 = i8;
                        i16 = i;
                        sArr5 = sArr5;
                        abstractC19901 = this;
                    } else {
                        sArr3 = sArr7;
                        str7 = str8;
                        sArr2 = sArr5;
                        i11 = i25;
                        int iM450214 = C19806.m45029("ܰۡ") ^ i15;
                        short[] sArr9 = sArr3;
                        i16 = ((iM450214 ^ i14) * (-18587)) ^ (-541463828);
                        str8 = str7;
                        i17 = iM450214 ^ 717511105;
                        sArr5 = sArr2;
                        i25 = i11;
                        sArr7 = sArr9;
                    }
                    break;
                case -1521499787:
                case 8876834:
                    throw abstractC19901.mo45169(C0242.m1617(C1875.m6105(sArr7, i18, i19, i21), str, strM4040, str10, strM6918), linkageError);
                case -1469672430:
                case 532941750:
                    str6 = str8;
                    s = s2;
                    sArr5 = sArr5;
                    linkageError = linkageError;
                    sArr6 = f63796;
                    if (C3577.m10565()) {
                        iM450210 = (i15 - C19806.m45029("ۧ᩵")) * 57;
                        i4 = ((iM450210 ^ i14) * 32033) ^ 1333112674;
                        i9 = 29680801;
                    } else {
                        iM450210 = C19806.m45029("ۚۚ") ^ i15;
                        i4 = ((iM450210 ^ i14) * (-1679)) ^ (-2012662388);
                        i9 = -1200420352;
                    }
                    i10 = iM450210 ^ i9;
                    s2 = s;
                    str8 = str6;
                    abstractC19901 = this;
                    i17 = i10;
                    i16 = i4;
                    linkageError = linkageError;
                    sArr5 = sArr5;
                    break;
                case -1262325568:
                case 1408171085:
                    C10634.m26820();
                    RunnableC0195.m1431();
                    sArr3 = sArr7;
                    str7 = str8;
                    sArr2 = sArr5;
                    i11 = i25;
                    int iM450215 = C19806.m45029("ܰۡ") ^ i15;
                    short[] sArr10 = sArr3;
                    i16 = ((iM450215 ^ i14) * (-18587)) ^ (-541463828);
                    str8 = str7;
                    i17 = iM450215 ^ 717511105;
                    sArr5 = sArr2;
                    i25 = i11;
                    sArr7 = sArr10;
                    break;
                case -1189476765:
                case 656159499:
                    str8 = str8;
                    sArr5 = sArr5;
                    linkageError = linkageError;
                    try {
                        mo45172();
                        iM45029 = C19806.m45029("ۡۚ") ^ i15;
                        i4 = ((iM45029 ^ i14) * (-17979)) ^ (-1683370148);
                        i5 = 1226687440;
                    } catch (Exception | LinkageError e) {
                        th = e;
                        iM45029 = C19806.m45029("ۚܶ") ^ i14;
                        i4 = ((iM45029 ^ i15) * 21541) ^ (-1342136940);
                        i5 = 921061688;
                    }
                    i10 = iM45029 ^ i5;
                    str8 = str8;
                    i17 = i10;
                    i16 = i4;
                    linkageError = linkageError;
                    sArr5 = sArr5;
                    break;
                case -1118227565:
                case 1259604937:
                    str8 = str8;
                    sArr5 = sArr5;
                    linkageError = linkageError;
                    strM4040 = C1066.m4040(f63796, 400, 1, i21);
                    if (C1377.m4833() == 0) {
                        iM45029 = C19806.m45029("ܰܳ") ^ i14;
                        i4 = ((iM45029 ^ i15) * 11751) ^ 1686563234;
                        i5 = -442466792;
                        i10 = iM45029 ^ i5;
                        str8 = str8;
                        i17 = i10;
                        i16 = i4;
                        linkageError = linkageError;
                        sArr5 = sArr5;
                    } else {
                        int iM450216 = C19806.m45029("ۛ۟") ^ i14;
                        i = ((iM450216 ^ i15) * 24463) ^ 1779873550;
                        i8 = iM450216 ^ 750709290;
                        str8 = str8;
                        linkageError = linkageError;
                        sb = null;
                        i17 = i8;
                        i16 = i;
                        sArr5 = sArr5;
                        abstractC19901 = this;
                    }
                    break;
                case -1028882541:
                case 2007950425:
                    str8 = str8;
                    sArr5 = sArr5;
                    linkageError = linkageError;
                    sArr4 = f63796;
                    i23 = 386;
                    if (ViewTreeObserverOnPreDrawListenerC3327.f12317 <= 0) {
                        iM11306 = (ThreadFactoryC3888.m11306("ܿܶ") ^ i15) * 31;
                        i = ((iM11306 ^ i14) * (-16945)) ^ 1860924114;
                        i2 = 1981946350;
                    } else {
                        iM11306 = ThreadFactoryC3888.m11306("ۘܰ") ^ i15;
                        i = ((iM11306 ^ i14) * 15885) ^ 1010826683;
                        i2 = -508320290;
                    }
                    i8 = iM11306 ^ i2;
                    str8 = str8;
                    linkageError = linkageError;
                    i17 = i8;
                    i16 = i;
                    sArr5 = sArr5;
                    abstractC19901 = this;
                    break;
                case -948000743:
                case -291027148:
                    if (C1460.f5948 < 0) {
                        str6 = str8;
                        s = s2;
                        sArr5 = sArr5;
                        linkageError = linkageError;
                        iM450210 = C19806.m45029("ۚۚ") ^ i15;
                        i4 = ((iM450210 ^ i14) * (-1679)) ^ (-2012662388);
                        i9 = -1200420352;
                        i10 = iM450210 ^ i9;
                        s2 = s;
                        str8 = str6;
                        abstractC19901 = this;
                        i17 = i10;
                        i16 = i4;
                        linkageError = linkageError;
                        sArr5 = sArr5;
                    } else {
                        iM11307 = (i14 - ThreadFactoryC3888.m11306("۠ۜ")) * (-77);
                        i6 = ((iM11307 ^ i15) * 17581) ^ 369346257;
                        i7 = 1435772208;
                        i17 = iM11307 ^ i7;
                        i16 = i6;
                    }
                    break;
                case -936023183:
                case 664963111:
                    C0671.m3008();
                    if (AbstractC0464.m2313() == 0) {
                        str8 = str8;
                        sArr5 = sArr5;
                        linkageError = linkageError;
                        int iM450217 = C19806.m45029("ۛ۟") ^ i14;
                        i = ((iM450217 ^ i15) * 24463) ^ 1779873550;
                        i8 = iM450217 ^ 750709290;
                        str8 = str8;
                        linkageError = linkageError;
                        sb = null;
                        i17 = i8;
                        i16 = i;
                        sArr5 = sArr5;
                        abstractC19901 = this;
                    } else {
                        iM11307 = (i14 - ThreadFactoryC3888.m11306("۠ۜ")) * (-77);
                        i6 = ((iM11307 ^ i15) * 17581) ^ 369346257;
                        i7 = 1435772208;
                        i17 = iM11307 ^ i7;
                        i16 = i6;
                    }
                    break;
                case -798103749:
                case 1321390605:
                    throw abstractC19901.mo45169(C22697.m50267(sb, str8, RunnableC3388.m10056(f63796, 452, 8, i21)), th);
                case -753700940:
                case 1958993199:
                    i21 = 2508;
                    iM11306 = (i14 - C19806.m45029("ۛۢ")) * 109;
                    i = ((iM11306 ^ i15) * (-5717)) ^ 2104134610;
                    i2 = -193761254;
                    i8 = iM11306 ^ i2;
                    str8 = str8;
                    linkageError = linkageError;
                    i17 = i8;
                    i16 = i;
                    sArr5 = sArr5;
                    abstractC19901 = this;
                    break;
                case -579971851:
                case 1243339207:
                    str2 = str8;
                    if (!file.delete()) {
                        iM450211 = C19806.m45029("᩻ܳ") ^ i14;
                        i12 = ((iM450211 ^ i15) * 13271) ^ (-773842276);
                        i13 = 1940921036;
                        String str11 = str2;
                        i17 = iM450211 ^ i13;
                        i16 = i12;
                        str8 = str11;
                    } else {
                        str4 = strM5502;
                        sArr5 = sArr5;
                        linkageError = linkageError;
                        sArr = sArr4;
                        str5 = str9;
                        str3 = str10;
                        i3 = i23;
                        int iM113012 = (ThreadFactoryC3888.m11306("ᩴ᩹") ^ i15) * 77;
                        strM5502 = str4;
                        i23 = i3;
                        str10 = str3;
                        str9 = str5;
                        str8 = str2;
                        i17 = iM113012 ^ 2018748855;
                        i16 = ((iM113012 ^ i14) * 11413) ^ 687883009;
                        sArr4 = sArr;
                        linkageError = linkageError;
                        abstractC19901 = this;
                        sArr5 = sArr5;
                    }
                    break;
                case -28505910:
                case 963129800:
                    str8 = str8;
                    sArr5 = sArr5;
                    linkageError = linkageError;
                    s2 = sArr6[357];
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM11306 = ThreadFactoryC3888.m11306("ܺܰ") ^ i14;
                        i = ((iM11306 ^ i15) * 21895) ^ 1572583599;
                        i2 = -425857455;
                        i8 = iM11306 ^ i2;
                        str8 = str8;
                        linkageError = linkageError;
                    } else {
                        int iM450218 = C19806.m45029("ۛ۟") ^ i14;
                        i = ((iM450218 ^ i15) * 24463) ^ 1779873550;
                        i8 = iM450218 ^ 750709290;
                        str8 = str8;
                        linkageError = linkageError;
                        sb = null;
                    }
                    i17 = i8;
                    i16 = i;
                    sArr5 = sArr5;
                    abstractC19901 = this;
                    break;
                case 11557069:
                case 69771487:
                    str2 = str8;
                    if (!C2871.m8639(file)) {
                        str4 = strM5502;
                        sArr5 = sArr5;
                        linkageError = linkageError;
                        sArr = sArr4;
                        str5 = str9;
                        str3 = str10;
                        i3 = i23;
                        int iM113013 = (ThreadFactoryC3888.m11306("ᩴ᩹") ^ i15) * 77;
                        strM5502 = str4;
                        i23 = i3;
                        str10 = str3;
                        str9 = str5;
                        str8 = str2;
                        i17 = iM113013 ^ 2018748855;
                        i16 = ((iM113013 ^ i14) * 11413) ^ 687883009;
                        sArr4 = sArr;
                        linkageError = linkageError;
                        abstractC19901 = this;
                        sArr5 = sArr5;
                    } else {
                        iM450211 = (ThreadFactoryC3888.m11306("ܽ֡") + i15) * (-107);
                        i12 = ((iM450211 ^ i14) * (-16257)) ^ 707344404;
                        i13 = 178993456;
                        String str12 = str2;
                        i17 = iM450211 ^ i13;
                        i16 = i12;
                        str8 = str12;
                    }
                    break;
                case 40467397:
                case 1098716335:
                    short[] sArr11 = f63796;
                    if (C0671.m3008() < 0) {
                        sb = new StringBuilder(C0817.m3406(sArr11, 424, 28, i21));
                        str8 = abstractC19901.f63800;
                        if (C2477.f9839 > 0) {
                            iM11307 = ThreadFactoryC3888.m11306("ܽᩴ") ^ i15;
                            i6 = ((iM11307 ^ i14) * (-16687)) ^ (-1603700661);
                            i7 = 1048875755;
                            i17 = iM11307 ^ i7;
                            i16 = i6;
                        } else {
                            str8 = str8;
                            sArr5 = sArr5;
                            linkageError = linkageError;
                            iM11306 = (ThreadFactoryC3888.m11306("ܿܶ") ^ i15) * 31;
                            i = ((iM11306 ^ i14) * (-16945)) ^ 1860924114;
                            i2 = 1981946350;
                            i8 = iM11306 ^ i2;
                            str8 = str8;
                            linkageError = linkageError;
                            i17 = i8;
                            i16 = i;
                            sArr5 = sArr5;
                            abstractC19901 = this;
                        }
                    } else {
                        str8 = str8;
                        sArr5 = sArr5;
                        linkageError = linkageError;
                        int iM450219 = C19806.m45029("ۛ۟") ^ i14;
                        i = ((iM450219 ^ i15) * 24463) ^ 1779873550;
                        i8 = iM450219 ^ 750709290;
                        str8 = str8;
                        linkageError = linkageError;
                        sb = null;
                        i17 = i8;
                        i16 = i;
                        sArr5 = sArr5;
                        abstractC19901 = this;
                    }
                    break;
                case 105490098:
                case 503492971:
                    str8 = str8;
                    sArr5 = sArr5;
                    linkageError = linkageError;
                    strM5502 = CallableC1627.m5502(f63796, 358, 28, i21);
                    if (RunnableC1895.f7152) {
                        iM11306 = ThreadFactoryC3888.m11306("ۧܺ") ^ i14;
                        i = ((iM11306 ^ i15) * 2745) ^ (-282893749);
                        i2 = -1254677333;
                    } else {
                        iM11306 = (i14 - ThreadFactoryC3888.m11306("ܿۛ")) * 7;
                        i = ((iM11306 ^ i15) * (-31953)) ^ 1947530639;
                        i2 = 2052055031;
                    }
                    i8 = iM11306 ^ i2;
                    str8 = str8;
                    linkageError = linkageError;
                    i17 = i8;
                    i16 = i;
                    sArr5 = sArr5;
                    abstractC19901 = this;
                    break;
                case 414920937:
                case 1322635731:
                    throw abstractC19901.mo45169(str9, linkageError);
                case 428134987:
                case 1396113835:
                    str7 = str8;
                    sArr2 = sArr5;
                    i11 = i25;
                    strM6918 = C2249.m6918(sArr2, i11, i20, i21);
                    sArr3 = f63796;
                    i19 = 15;
                    if (C1461.m5080()) {
                        i18 = 409;
                        int iM4502110 = C19806.m45029("ܰۡ") ^ i15;
                        short[] sArr12 = sArr3;
                        i16 = ((iM4502110 ^ i14) * (-18587)) ^ (-541463828);
                        str8 = str7;
                        i17 = iM4502110 ^ 717511105;
                        sArr5 = sArr2;
                        i25 = i11;
                        sArr7 = sArr12;
                    } else {
                        int iM113014 = ThreadFactoryC3888.m11306("ܿ᩺") ^ i15;
                        i25 = i11;
                        str8 = str7;
                        i17 = iM113014 ^ (-720797601);
                        sArr7 = sArr3;
                        i16 = ((iM113014 ^ i14) * 8353) ^ 244771222;
                        sArr5 = sArr2;
                        i18 = 409;
                    }
                    break;
                case 470643107:
                case 779932344:
                    RunnableC1895.m6170();
                    if (!ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        sArr3 = sArr7;
                        str7 = str8;
                        sArr2 = sArr5;
                        i11 = i25;
                        int iM4502111 = C19806.m45029("ܰۡ") ^ i15;
                        short[] sArr13 = sArr3;
                        i16 = ((iM4502111 ^ i14) * (-18587)) ^ (-541463828);
                        str8 = str7;
                        i17 = iM4502111 ^ 717511105;
                        sArr5 = sArr2;
                        i25 = i11;
                        sArr7 = sArr13;
                    } else {
                        str8 = str8;
                        sArr5 = sArr5;
                        linkageError = linkageError;
                        iM11306 = (i14 - ThreadFactoryC3888.m11306("ܿۛ")) * 7;
                        i = ((iM11306 ^ i15) * (-31953)) ^ 1947530639;
                        i2 = 2052055031;
                        i8 = iM11306 ^ i2;
                        str8 = str8;
                        linkageError = linkageError;
                        i17 = i8;
                        i16 = i;
                        sArr5 = sArr5;
                        abstractC19901 = this;
                    }
                    break;
                case 643936075:
                case 962307576:
                    return;
                case 1380310138:
                case 1518470721:
                    MenuItemOnMenuItemClickListenerC3244.m9701();
                    C19806.m45024();
                    return;
                default:
                    str8 = str8;
                    sArr5 = sArr5;
                    linkageError = linkageError;
                    try {
                        System.load(file.getAbsolutePath());
                        iM11306 = C19806.m45029("ܶ᩹") ^ i14;
                        i = ((iM11306 ^ i15) * 8073) ^ (-1901474071);
                        i2 = 1351044867;
                        i8 = iM11306 ^ i2;
                        str8 = str8;
                        linkageError = linkageError;
                        i17 = i8;
                        i16 = i;
                        sArr5 = sArr5;
                    } catch (LinkageError e2) {
                        linkageError = e2;
                        int iM113015 = (ThreadFactoryC3888.m11306("ۢ᩶") + i15) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        sArr5 = sArr5;
                        str8 = str8;
                        i17 = iM113015 ^ (-339888475);
                        i16 = ((iM113015 ^ i14) * 12399) ^ (-87277059);
                    }
                    abstractC19901 = this;
                    break;
            }
        }
    }
}
