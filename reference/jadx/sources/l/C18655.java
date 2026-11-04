package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1799 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18655 implements InterfaceC24229 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C0756 f60660;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21639 f60661;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f60662;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f60663;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8214 f60664;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f60665;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f60666;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC5386 f60667;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C4091 f60668;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15146 f60669;

    public C18655(C8214 c8214) {
        this.f60664 = c8214;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43416(C15146 c15146, InterfaceC5386 interfaceC5386, ArrayList arrayList, C4091 c4091, boolean z, C21639 c21639, C0756 c0756) {
        this.f60669 = c15146;
        this.f60667 = interfaceC5386;
        this.f60663 = arrayList;
        this.f60668 = c4091;
        this.f60662 = z;
        this.f60661 = c21639;
        this.f60660 = c0756;
        this.f60666 = null;
        this.f60665 = null;
    }

    @Override // l.InterfaceC24229
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo43417(int i, int i2, int i3, EnumC22631 enumC22631) {
        boolean zM22113;
        C21639 c21639;
        String strM55822;
        C24975 c24975 = this.f60668.f13939;
        if ("dex_field".equals(this.f60669.f49417)) {
            C15146 c15146 = this.f60669;
            c21639 = this.f60661;
            C0756 c0756 = this.f60660;
            if (i2 == 2) {
                AbstractC2599 abstractC2599M55818 = c24975.m55818();
                int iM55814 = c24975.m55814(i3);
                int iM8721 = abstractC2599M55818.m8721(iM55814);
                String str = c15146.f49414;
                String str2 = c15146.f49421;
                if (c24975.m55817(iM8721, 0, str.length(), str)) {
                    int iMo8719 = abstractC2599M55818.mo8719(iM55814 + 4);
                    int i4 = c0756.f2754;
                    int i5 = c0756.f2758;
                    if (c24975.m55793(iMo8719, 0, i4, str2) && c24975.m55817(abstractC2599M55818.m8721(iM55814 + 2), i5, str2.length() - i5, str2)) {
                        strM55822 = C20196.m46451(c24975.m55822(iM8721), "->", str2);
                        c21639.f69088 = strM55822;
                        c21639.f69089 = "exact_reference";
                        c21639.f69087 = "not_applicable";
                        zM22113 = true;
                    }
                }
            }
            zM22113 = false;
        } else if ("dex_class".equals(this.f60669.f49417)) {
            C15146 c15147 = this.f60669;
            c21639 = this.f60661;
            if (i2 == 1 && c24975.m55794(i3, c15147.f49414)) {
                strM55822 = c24975.m55822(i3);
                c21639.f69088 = strM55822;
                c21639.f69089 = "exact_reference";
                c21639.f69087 = "not_applicable";
                zM22113 = true;
            } else {
                zM22113 = false;
            }
        } else {
            zM22113 = C8214.m22113(this.f60664, this.f60669, this.f60667, this.f60668, c24975, i3, enumC22631, i2, this.f60662, this.f60661, this.f60660);
        }
        if (zM22113) {
            if (this.f60665 == null) {
                this.f60666 = this.f60668.f13949.getType();
                C4091 c4091 = this.f60668;
                StringBuilder sb = new StringBuilder();
                Iterator it = c4091.mo6805().iterator();
                while (it.hasNext()) {
                    sb.append((CharSequence) it.next());
                }
                this.f60665 = c4091.getName() + MotionUtils.EASING_TYPE_FORMAT_START + ((Object) sb) + MotionUtils.EASING_TYPE_FORMAT_END + c4091.mo6802();
            }
            ArrayList arrayList = this.f60663;
            String str3 = this.f60666;
            String str4 = this.f60665;
            C21639 c216310 = this.f60661;
            arrayList.add(new C2248(str3, str4, c216310.f69088, c216310.f69089, c216310.f69087, enumC22631.f73509, i));
            if (this.f60663.size() >= this.f60669.f49416) {
                return false;
            }
        }
        return true;
    }
}
