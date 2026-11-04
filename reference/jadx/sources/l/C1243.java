package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.֨ܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes3.dex */
public class C1243 extends AbstractC19594 {

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public String f4504 = "null";

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f4503 = new ArrayList();

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12187 mo4494(Exception exc) {
        if (!mo924()) {
            return C12187.m30465(exc);
        }
        return C12187.m30469();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46049;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, this.f4504);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        mo29447("...");
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws Exception {
        int i;
        int i2;
        AbstractC22044 abstractC22044M43860 = m43860("outputDir");
        String[] strArrM43831 = m43831("ARG_PATHS");
        int iM43854 = m43854("level");
        EnumC24958 enumC24958 = EnumC24958.values()[m43854("format")];
        boolean zM43847 = m43847("deleteSources");
        boolean z = true;
        C10872 c10872 = new C10872(this, strArrM43831, true);
        if (mo924()) {
            return C12187.m30469();
        }
        int length = strArrM43831.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f4503;
            if (i4 >= length) {
                if (!mo924() && zM43847) {
                    C22807.m51423(this, strArrM43831, arrayList, c10872.m27613());
                }
                return m43857();
            }
            AbstractC22044 abstractC22044M35193 = C14584.m35193(strArrM43831[i4], new String[i3]);
            if (enumC24958.f80819 && abstractC22044M35193.mo4281()) {
                throw new Exception(C1402.m5125(abstractC22044M35193, new StringBuilder("Can not compress directory: ")));
            }
            StringBuilder sbM27333 = C10732.m27333((abstractC22044M35193.mo4281() || enumC24958.f80819) ? abstractC22044M35193.getName() : abstractC22044M35193.m49874());
            sbM27333.append(enumC24958.f80817);
            AbstractC22044 abstractC22044M49839 = abstractC22044M43860.m49876(sbM27333.toString()).m49839(z);
            this.f4504 = abstractC22044M49839.getName();
            C13789 c13789M27611 = c10872.m27611(i4);
            if (enumC24958.f80819 && c13789M27611.f43741.size() != z) {
                throw new RuntimeException("Expected to be a single file, but file size = " + c13789M27611.f43741.size());
            }
            try {
                boolean z2 = enumC24958.f80819;
                String str = MotionUtils.EASING_TYPE_FORMAT_END;
                String str2 = MotionUtils.EASING_TYPE_FORMAT_START;
                String str3 = "/";
                if (z2) {
                    C7078 c7078 = (C7078) c13789M27611.f43741.get(0);
                    CharSequence charSequence = c7078.f23324;
                    AbstractC22044 abstractC22044 = c7078.f23323;
                    mo29447(charSequence);
                    c10872.m27614();
                    mo16837(C21576.m49088(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + c10872.m27610() + "/" + c10872.m27613() + MotionUtils.EASING_TYPE_FORMAT_END);
                    OutputStream outputStreamM55718 = enumC24958.m55718(abstractC22044M49839.mo4289(false), iM43854, abstractC22044.mo4285());
                    try {
                        abstractC22044.m49842(outputStreamM55718, new C19142(this, c10872));
                        if (outputStreamM55718 != null) {
                            outputStreamM55718.close();
                        }
                        i = iM43854;
                        enumC24958 = enumC24958;
                        i2 = length;
                        i4 = i4;
                        arrayList = arrayList;
                    } catch (Throwable th) {
                        if (outputStreamM55718 == null) {
                            throw th;
                        }
                        try {
                            outputStreamM55718.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } else {
                    EnumC24958 enumC24959 = enumC24958.f80820;
                    C21776 c21776 = new C21776(enumC24959 == null ? abstractC22044M49839.m49869() : enumC24959.m55718(abstractC22044M49839.mo4289(false), iM43854, -1L));
                    try {
                        c21776.m49378();
                        c21776.m49379();
                        Iterator it = c13789M27611.f43741.iterator();
                        while (it.hasNext()) {
                            C7078 c7079 = (C7078) it.next();
                            if (mo924()) {
                                break;
                            }
                            c10872.m27614();
                            mo16837(C21576.m49088(R.string.MT_Protector) + str2 + c10872.m27610() + str3 + c10872.m27613() + str);
                            boolean z3 = c7079.f23331;
                            String str4 = c7079.f23328;
                            long j = c7079.f23326;
                            Iterator it2 = it;
                            String str5 = c7079.f23324;
                            int i5 = iM43854;
                            boolean z4 = c7079.f23329;
                            if (z3) {
                                C7450 c7450 = new C7450(z4 ? (byte) 50 : (byte) 53, str5 + str3);
                                c7450.m20427(C21813.fromMillis(j));
                                if (c7079.f23325) {
                                    c7450.m20422(c7079.f23327 | 16384);
                                    c7450.m20455(c7079.f23332);
                                    c7450.m20424(c7079.f23330);
                                }
                                if (z4) {
                                    c7450.m20453(str4);
                                }
                                c21776.m49376(c7450);
                                c21776.m49377();
                                str2 = str2;
                                str3 = str3;
                            } else {
                                length = length;
                                AbstractC22044 abstractC22045 = c7079.f23323;
                                mo29447(str5);
                                C7450 c7451 = new C7450(z4 ? (byte) 50 : UTF8.S_P3A, str5);
                                c7451.m20452(z4 ? 0L : c7079.f23322);
                                c7451.m20427(C21813.fromMillis(j));
                                if (c7079.f23325) {
                                    c7451.m20422(c7079.f23327 | 32768);
                                    c7451.m20455(c7079.f23332);
                                    c7451.m20424(c7079.f23330);
                                }
                                if (z4) {
                                    c7451.m20453(str4);
                                }
                                c21776.m49376(c7451);
                                if (!z4) {
                                    abstractC22045.m49842(c21776, new C10191(this, c10872));
                                }
                                c21776.m49377();
                            }
                            str3 = str3;
                            str = str;
                            it = it2;
                            iM43854 = i5;
                            length = length;
                            str2 = str2;
                        }
                        i = iM43854;
                        i2 = length;
                        c21776.close();
                    } catch (Throwable th3) {
                        try {
                            c21776.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                }
                if (mo924()) {
                    abstractC22044M49839.mo4287();
                    return C12187.m30469();
                }
                arrayList.add(abstractC22044M49839);
                i4++;
                z = true;
                i3 = 0;
                abstractC22044M43860 = abstractC22044M43860;
                enumC24958 = enumC24958;
                iM43854 = i;
                length = i2;
            } catch (Exception e) {
                abstractC22044M49839.mo4287();
                throw e;
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        boolean zM43847 = m43847("compressToAnother");
        C22807.m51422(c12187, zM43847, zM43847 ? m43837(c8615) : m43863(c8614), c8614, c8615, C22807.m51418((List) this.f4503));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C6331.m18055();
    }
}
