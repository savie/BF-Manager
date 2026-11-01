package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.EnumSet;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ᩳ᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes4.dex */
public final class C18279 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C16576 f58315 = new C16576();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C8528 f58317;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f58319;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C6761 f58320;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20414 f58321;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5870 f58323;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumSet f58324;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C23800 f58325;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4873 f58326;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C5286 f58327;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC23219[] f58322 = {new C2756(this), new C5579(this), new C4167(this), new C22513(this), new C13341(this)};

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C1926 f58318 = new C1926();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC11930 f58316 = new C9689(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18279 m42467(C12343 c12343) {
        C18279 c18279 = (C18279) c12343.m30656(f58315);
        return c18279 == null ? new C18279(c12343) : c18279;
    }

    public C18279(C12343 c12343) {
        c12343.m30659(f58315, this);
        this.f58325 = C23800.m52336(c12343);
        this.f58321 = C20414.m46161(c12343);
        this.f58320 = C6761.m18268(c12343);
        this.f58323 = C5870.m16083(c12343);
        this.f58317 = C8528.m22273(c12343);
        C5286 c5286M14576 = C5286.m14576(c12343);
        this.f58327 = c5286M14576;
        this.f58326 = new C4873(c5286M14576);
        String strM35397 = C14770.m35395(c12343).m35397("find");
        EnumC11909 enumC11909M29706 = EnumC11909.m29706(c12343);
        this.f58319 = EnumC14026.f46093.m33945(enumC11909M29706);
        this.f58324 = EnumC14047.m33993(strM35397, enumC11909M29706);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42470(C6990 c6990) {
        String str;
        String str2;
        AbstractC14728 abstractC14728M14617;
        C20414 c20414 = this.f58321;
        C22137 c22137M48186 = c20414.m48186();
        C8528 c8528 = this.f58317;
        c8528.getClass();
        HashMap map = c8528.f29526;
        c8528.f29526 = new HashMap();
        try {
            C4603 c4603 = c6990.f23517;
            AbstractC8774 abstractC8774 = c6990.f23515;
            c20414.m48202(c4603.f16295.f34725);
            AbstractC14728 abstractC14728 = (AbstractC14728) abstractC8774;
            EnumC10477 enumC10477 = ((C22990) c4603.f16299).f74722.f11719.f77452;
            EnumC10477 enumC10478 = EnumC10477.f35865;
            C5286 c5286 = this.f58327;
            if (enumC10477 == enumC10478) {
                c5286.f18294 = -1;
                str = "\n";
                str2 = "Analyzer error when processing: ";
                try {
                    abstractC14728M14617 = c5286.m14617(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, C21825.of(abstractC8774));
                } catch (Throwable th) {
                    th = th;
                    try {
                        StringBuilder sb = new StringBuilder(str2);
                        sb.append(c6990.f23515);
                        sb.append(":");
                        sb.append(th.toString());
                        String str3 = str;
                        sb.append(str3);
                        sb.append((String) C20318.stream(th.getStackTrace()).map(new C16485(11)).collect(C1890.joining(str3)));
                        C6171.m17174(sb.toString());
                        throw null;
                    } catch (Throwable th2) {
                        c20414.m48202(c22137M48186.m49095());
                        c8528.f29526 = map;
                        throw th2;
                    }
                }
            } else {
                str = "\n";
                str2 = "Analyzer error when processing: ";
                abstractC8774 = null;
                abstractC14728M14617 = abstractC14728;
            }
            C5870 c5870 = this.f58323;
            C1116 c1116 = this.f58320.f22799;
            C21807 c21807 = new C21807(c5286);
            c21807.f70619 = c6990;
            c21807.f70618 = abstractC8774;
            c5870.m16084(abstractC14728M14617, c4603, c1116, c21807, new C14628(c6990), EnumC3377.ANALYZER, new C3587(c8528));
            c6990.f23514.mo8403(c6990.f23513, c6990.f23518, c6990.f23516);
            c20414.m48202(c22137M48186.m49095());
            c8528.f29526 = map;
        } catch (Throwable th3) {
            th = th3;
            str = "\n";
            str2 = "Analyzer error when processing: ";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42469(C4603 c4603) {
        this.f58316.mo6260(c4603);
    }
}
