package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿۘ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 1799 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17099 implements InterfaceC13887 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f54562;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C6784 f54563;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C5810 f54564;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C12161 f54565;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC22827 f54566;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10750 f54567;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f54568;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f54569;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11770 f54570;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f54571;

    public C17099(C10750 c10750) {
        this.f54567 = c10750;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39920(C6784 c6784, InterfaceC22827 interfaceC22827, ArrayList arrayList, C11770 c11770, boolean z, C12161 c12161, C5810 c5810) {
        this.f54563 = c6784;
        this.f54566 = interfaceC22827;
        this.f54568 = arrayList;
        this.f54570 = c11770;
        this.f54569 = z;
        this.f54565 = c12161;
        this.f54564 = c5810;
        this.f54571 = null;
        this.f54562 = null;
    }

    @Override // l.InterfaceC13887
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo33723(int i, int i2, int i3, EnumC10297 enumC10297) {
        boolean zM27048;
        C12161 c12161;
        String strM41204;
        C17684 c17684 = this.f54570.f39511;
        if ("dex_field".equals(this.f54563.f22901)) {
            C6784 c6784 = this.f54563;
            c12161 = this.f54565;
            C5810 c5810 = this.f54564;
            if (i2 == 2) {
                AbstractC18119 abstractC18119M41166 = c17684.m41166();
                int iM41190 = c17684.m41190(i3);
                int iM42183 = abstractC18119M41166.m42183(iM41190);
                String str = c6784.f22903;
                String str2 = c6784.f22902;
                if (c17684.m41193(iM42183, 0, str.length(), str)) {
                    int iMo9809 = abstractC18119M41166.mo9809(iM41190 + 4);
                    int i4 = c5810.f19735;
                    int i5 = c5810.f19738;
                    if (c17684.m41178(iMo9809, 0, i4, str2) && c17684.m41193(abstractC18119M41166.m42183(iM41190 + 2), i5, str2.length() - i5, str2)) {
                        strM41204 = C1679.m5594(c17684.m41204(iM42183), "->", str2);
                        c12161.f40700 = strM41204;
                        c12161.f40701 = "exact_reference";
                        c12161.f40699 = "not_applicable";
                        zM27048 = true;
                    }
                }
            }
            zM27048 = false;
        } else if ("dex_class".equals(this.f54563.f22901)) {
            C6784 c6785 = this.f54563;
            c12161 = this.f54565;
            if (i2 == 1 && c17684.m41179(i3, c6785.f22903)) {
                strM41204 = c17684.m41204(i3);
                c12161.f40700 = strM41204;
                c12161.f40701 = "exact_reference";
                c12161.f40699 = "not_applicable";
                zM27048 = true;
            } else {
                zM27048 = false;
            }
        } else {
            zM27048 = C10750.m27048(this.f54567, this.f54563, this.f54566, this.f54570, c17684, i3, enumC10297, i2, this.f54569, this.f54565, this.f54564);
        }
        if (zM27048) {
            if (this.f54562 == null) {
                this.f54571 = this.f54570.f39513.getType();
                C11770 c11770 = this.f54570;
                StringBuilder sb = new StringBuilder();
                Iterator it = c11770.mo9699().iterator();
                while (it.hasNext()) {
                    sb.append((CharSequence) it.next());
                }
                this.f54562 = c11770.getName() + MotionUtils.EASING_TYPE_FORMAT_START + ((Object) sb) + MotionUtils.EASING_TYPE_FORMAT_END + c11770.mo9698();
            }
            ArrayList arrayList = this.f54568;
            String str3 = this.f54571;
            String str4 = this.f54562;
            C12161 c12162 = this.f54565;
            arrayList.add(new C14983(str3, str4, c12162.f40700, c12162.f40701, c12162.f40699, enumC10297.f35326, i));
            if (this.f54568.size() >= this.f54563.f22905) {
                return false;
            }
        }
        return true;
    }
}
