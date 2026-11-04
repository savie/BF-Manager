package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.EnumSet;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֨֨᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes2.dex */
public final class C0838 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C13477 f3146 = new C13477();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f3148;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C12863 f3149;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7312 f3151;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C3075 f3153;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C24705 f3154;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C0310 f3155;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumSet f3156;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7044 f3157;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C15714 f3158;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC7550[] f3150 = {new C6059(this), new C23959(this), new C17991(this), new C3821(this), new C20975(this)};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17245 f3147 = new C17245();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC12024 f3152 = new C23213(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0838 m3338(C4747 c4747) {
        C0838 c0838 = (C0838) c4747.m14643(f3146);
        return c0838 == null ? new C0838(c4747) : c0838;
    }

    public C0838(C4747 c4747) {
        c4747.m14646(f3146, this);
        this.f3154 = C24705.m55066(c4747);
        this.f3151 = C7312.m20023(c4747);
        this.f3155 = C0310.m1899(c4747);
        this.f3149 = C12863.m31895(c4747);
        this.f3157 = C7044.m19373(c4747);
        C15714 c15714M37502 = C15714.m37502(c4747);
        this.f3158 = c15714M37502;
        this.f3153 = new C3075(c15714M37502);
        String strM32422 = C13015.m32421(c4747).m32422("find");
        EnumC20820 enumC20820M47625 = EnumC20820.m47625(c4747);
        this.f3148 = EnumC3666.f12554.m11915(enumC20820M47625);
        this.f3156 = EnumC20229.m46502(strM32422, enumC20820M47625);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3340(C0092 c0092) {
        String str;
        String str2;
        AbstractC19969 abstractC19969M37506;
        C7312 c7312 = this.f3151;
        C23393 c23393M34514 = c7312.m34514();
        C7044 c7044 = this.f3157;
        c7044.getClass();
        HashMap map = c7044.f23239;
        c7044.f23239 = new HashMap();
        try {
            C3168 c3168 = c0092.f1006;
            AbstractC8036 abstractC8036 = c0092.f1005;
            c7312.m34530(c3168.f10275.f61856);
            AbstractC19969 abstractC19969 = (AbstractC19969) abstractC8036;
            EnumC13603 enumC13603 = ((C7768) c3168.f10272).f25562.f53083.f38066;
            EnumC13603 enumC13604 = EnumC13603.f43213;
            C15714 c15714 = this.f3158;
            if (enumC13603 == enumC13604) {
                c15714.f51040 = -1;
                str = "\n";
                str2 = "Analyzer error when processing: ";
                try {
                    abstractC19969M37506 = c15714.m37506(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, C14769.of(abstractC8036));
                } catch (Throwable th) {
                    th = th;
                    try {
                        StringBuilder sb = new StringBuilder(str2);
                        sb.append(c0092.f1005);
                        sb.append(":");
                        sb.append(th.toString());
                        String str3 = str;
                        sb.append(str3);
                        sb.append((String) C13847.stream(th.getStackTrace()).map(new C14305(2)).collect(C2025.joining(str3)));
                        C11972.m30024(sb.toString());
                        throw null;
                    } catch (Throwable th2) {
                        c7312.m34530(c23393M34514.m52573());
                        c7044.f23239 = map;
                        throw th2;
                    }
                }
            } else {
                str = "\n";
                str2 = "Analyzer error when processing: ";
                abstractC8036 = null;
                abstractC19969M37506 = abstractC19969;
            }
            C12863 c12863 = this.f3149;
            C14479 c14479 = this.f3155.f1709;
            C9786 c9786 = new C9786(c15714);
            c9786.f31549 = c0092;
            c9786.f31548 = abstractC8036;
            c12863.m31896(abstractC19969M37506, c3168, c14479, c9786, new C16499(c0092), EnumC23584.ANALYZER, new C0332(c7044));
            c0092.f1001.mo12356(c0092.f1007, c0092.f1004, c0092.f1002);
            c7312.m34530(c23393M34514.m52573());
            c7044.f23239 = map;
        } catch (Throwable th3) {
            th = th3;
            str = "\n";
            str2 = "Analyzer error when processing: ";
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3341(C3168 c3168) {
        this.f3152.mo30217(c3168);
    }
}
