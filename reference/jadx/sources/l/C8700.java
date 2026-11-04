package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.۠ܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes4.dex */
public class C8700 extends AbstractC19594 {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f28358;

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
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
        return C21576.m49059(R.string.MT_Protector, m43840("output"));
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
        OutputStream outputStreamM55718;
        String[] strArr;
        boolean z;
        C18003 c18003;
        this.f28358 = m43860("output");
        String[] strArrM43831 = m43831("ARG_PATHS");
        EnumC24958 enumC24958 = EnumC24958.values()[m43854("format")];
        int iM43854 = m43854("level");
        boolean zM43847 = m43847("deleteSources");
        boolean zM43848 = m43847("replaceExisting");
        C13789 c13789M51419 = C22807.m51419((AbstractC18900) this, strArrM43831, true);
        ArrayList arrayList = c13789M51419.f43741;
        if (mo924()) {
            return C12187.m30469();
        }
        if (enumC24958.f80819 && arrayList.size() != 1) {
            throw new RuntimeException("Expected to be a single file, but file size = " + arrayList.size());
        }
        C18003 c18003M41975 = C18003.m41975(this.f28358, zM43848);
        AbstractC22044 abstractC22044M41983 = c18003M41975.m41983();
        if (enumC24958.f80819) {
            C7078 c7078 = (C7078) arrayList.get(0);
            mo16837(C21576.m49088(R.string.MT_Protector));
            CharSequence charSequence = c7078.f23324;
            AbstractC22044 abstractC22044 = c7078.f23323;
            mo29447(charSequence);
            try {
                OutputStream outputStreamM55719 = enumC24958.m55718(abstractC22044M41983.mo4289(false), iM43854, abstractC22044.mo4285());
                try {
                    abstractC22044.m49842(outputStreamM55719, new C9445(this, c7078));
                    if (outputStreamM55719 != null) {
                        outputStreamM55719.close();
                    }
                    strArr = strArrM43831;
                    z = zM43847;
                    c18003 = c18003M41975;
                } catch (Throwable th) {
                    if (outputStreamM55719 == null) {
                        throw th;
                    }
                    try {
                        outputStreamM55719.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Exception e) {
                abstractC22044M41983.mo4287();
                throw e;
            }
        } else {
            EnumC24958 enumC24959 = enumC24958.f80820;
            try {
                if (enumC24959 == null) {
                    outputStreamM55718 = abstractC22044M41983.m49869();
                } else {
                    outputStreamM55718 = enumC24959.m55718(abstractC22044M41983.mo4289(false), iM43854, -1L);
                }
                C21776 c21776 = new C21776(outputStreamM55718);
                try {
                    c21776.m49378();
                    c21776.m49379();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C7078 c7079 = (C7078) it.next();
                        if (mo924()) {
                            break;
                        }
                        c13789M51419.m33698();
                        boolean z2 = c7079.f23331;
                        long j = c7079.f23322;
                        String str = c7079.f23328;
                        long j2 = c7079.f23326;
                        String str2 = c7079.f23324;
                        Iterator it2 = it;
                        boolean z3 = c7079.f23329;
                        String[] strArr2 = strArrM43831;
                        if (z2) {
                            C7450 c7450 = new C7450(z3 ? (byte) 50 : (byte) 53, str2 + "/");
                            c7450.m20427(C21813.fromMillis(j2));
                            if (c7079.f23325) {
                                c7450.m20422(c7079.f23327 | 16384);
                                c7450.m20455(c7079.f23332);
                                c7450.m20424(c7079.f23330);
                            }
                            if (z3) {
                                c7450.m20453(str);
                            }
                            c21776.m49376(c7450);
                            c21776.m49377();
                        } else {
                            AbstractC22044 abstractC22045 = c7079.f23323;
                            mo16837(C21576.m49088(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + c13789M51419.m33693() + "/" + c13789M51419.m33697() + MotionUtils.EASING_TYPE_FORMAT_END);
                            mo29447(str2);
                            C7450 c7451 = new C7450(z3 ? (byte) 50 : UTF8.S_P3A, str2);
                            c7451.m20452(z3 ? 0L : j);
                            c7451.m20427(C21813.fromMillis(j2));
                            if (c7079.f23325) {
                                c7451.m20422(c7079.f23327 | 32768);
                                c7451.m20455(c7079.f23332);
                                c7451.m20424(c7079.f23330);
                            }
                            if (z3) {
                                c7451.m20453(str);
                            }
                            c21776.m49376(c7451);
                            if (!z3) {
                                abstractC22045.m49842(c21776, new C2734(this, c13789M51419));
                            }
                            c21776.m49377();
                            c13789M51419.m33694(j);
                        }
                        it = it2;
                        strArrM43831 = strArr2;
                        zM43847 = zM43847;
                        c18003M41975 = c18003M41975;
                    }
                    strArr = strArrM43831;
                    z = zM43847;
                    c18003 = c18003M41975;
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
            } catch (Exception e2) {
                abstractC22044M41983.mo4287();
                throw e2;
            }
        }
        if (mo924()) {
            abstractC22044M41983.mo4287();
            return C12187.m30469();
        }
        List listM41982 = c18003.m41982(Collections.singletonList(abstractC22044M41983), EnumC20987.NONE);
        if (mo924()) {
            return C12187.m30469();
        }
        if (z) {
            C22807.m51423(this, strArr, listM41982, c13789M51419.m33697());
        }
        return C12187.m30468();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        boolean zM43847 = m43847("compressToAnother");
        C22807.m51422(c12187, zM43847, zM43847 ? m43837(c8615) : m43863(c8614), c8614, c8615, Collections.singletonList(this.f28358.getName()));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C6331.m18055();
    }
}
