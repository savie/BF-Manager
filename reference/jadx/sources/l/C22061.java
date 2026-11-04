package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩷۫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes2.dex */
public class C22061 extends AbstractC19594 {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public List f71137 = new ArrayList();

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
        AbstractC22044 abstractC22044;
        Throwable th;
        AbstractC22044 abstractC22044M43860 = m43860("output");
        String[] strArrM43831 = m43831("ARG_PATHS");
        String strM43865 = m43865("password");
        int iM43854 = m43854("level");
        boolean zM43847 = m43847("deleteSources");
        long jM43855 = m43855("splitSize");
        boolean zM43848 = m43847("replaceExisting");
        C13789 c13789M51419 = C22807.m51419((AbstractC18900) this, strArrM43831, false);
        ArrayList<C7078> arrayList = c13789M51419.f43741;
        if (mo924()) {
            return C12187.m30469();
        }
        C18003 c18003M41975 = C18003.m41975(abstractC22044M43860, zM43848 || jM43855 != -1);
        AbstractC22044 abstractC22044M41983 = c18003M41975.m41983();
        ArrayList arrayList2 = new ArrayList();
        if (jM43855 == -1) {
            arrayList2.add(abstractC22044M41983);
        }
        try {
            C25179 c25179 = jM43855 == -1 ? new C25179(abstractC22044M41983) : new C25179(abstractC22044M41983, jM43855, new C14666(arrayList2));
            try {
                c25179.m56139(strM43865);
                boolean zM39533 = AbstractC16752.m39533(iM43854, c25179);
                C3150 c3150 = new C3150();
                if (zM39533) {
                    try {
                        for (C7078 c7078 : arrayList) {
                            if (!c7078.f23331 && c7078.f23324.equals("AndroidManifest.xml")) {
                                try {
                                    C14955 c14955M35975 = C14955.m35975(c7078.f23323);
                                    c3150.f10213 = C18685.m43477(c14955M35975);
                                    c3150.f10214 = C18685.m43478(c14955M35975);
                                    break;
                                } catch (Exception unused) {
                                    c3150.f10213 = false;
                                    c3150.f10214 = false;
                                    break;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        abstractC22044 = abstractC22044M41983;
                        try {
                            try {
                                c25179.close();
                                throw th;
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                                throw th;
                            }
                        } catch (Exception e) {
                            e = e;
                            C22807.m51420(arrayList2);
                            abstractC22044.mo4287();
                            throw e;
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C7078 c7079 = (C7078) it.next();
                    if (mo924()) {
                        break;
                    }
                    c13789M51419.m33698();
                    boolean z = c7079.f23331;
                    long j = c7079.f23322;
                    it = it;
                    abstractC22044M41983 = abstractC22044M41983;
                    long j2 = c7079.f23326;
                    strArrM43831 = strArrM43831;
                    String str = c7079.f23324;
                    zM43847 = zM43847;
                    if (z) {
                        try {
                            C8002 c8002 = new C8002(str + "/");
                            c8002.setTime(j2);
                            c25179.m56125(c8002);
                        } catch (Throwable th4) {
                            th = th4;
                            abstractC22044 = abstractC22044M41983;
                            c25179.close();
                            throw th;
                        }
                    } else {
                        AbstractC22044 abstractC22045 = c7079.f23323;
                        if (zM39533) {
                            c25179.m56135(C20304.m46644(str, c3150));
                        }
                        StringBuilder sb = new StringBuilder();
                        boolean z2 = zM39533;
                        sb.append(C21576.m49088(R.string.MT_Protector));
                        sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                        sb.append(c13789M51419.m33693());
                        sb.append("/");
                        sb.append(c13789M51419.m33697());
                        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                        mo16837(sb.toString());
                        mo29447(str);
                        C8002 c8003 = new C8002(str);
                        c8003.m21854(j);
                        c8003.setTime(j2);
                        c25179.m56125(c8003);
                        abstractC22045.m49842(c25179.m56119(), new C4907(this, c13789M51419));
                        c13789M51419.m33694(j);
                        zM39533 = z2;
                    }
                }
                String[] strArr = strArrM43831;
                boolean z3 = zM43847;
                AbstractC22044 abstractC22046 = abstractC22044M41983;
                try {
                    c25179.close();
                    if (mo924()) {
                        C22807.m51420(arrayList2);
                        abstractC22046.mo4287();
                        return C12187.m30469();
                    }
                    if (jM43855 != -1) {
                        if (arrayList2.isEmpty() || !abstractC22046.mo2934()) {
                            C22807.m51420(arrayList2);
                            abstractC22046.mo4287();
                            throw new IOException(C1402.m5125(abstractC22046, new StringBuilder("Unable to finalize ZIP split output: ")));
                        }
                        arrayList2.set(arrayList2.size() - 1, abstractC22046);
                    }
                    this.f71137 = c18003M41975.m41982(arrayList2, jM43855 == -1 ? EnumC20987.NONE : EnumC20987.ZIP);
                    if (mo924()) {
                        return C12187.m30469();
                    }
                    if (z3) {
                        C22807.m51423(this, strArr, this.f71137, c13789M51419.m33697());
                    }
                    return C12187.m30468();
                } catch (Exception e2) {
                    e = e2;
                    abstractC22044 = abstractC22046;
                    C22807.m51420(arrayList2);
                    abstractC22044.mo4287();
                    throw e;
                }
            } catch (Throwable th5) {
                abstractC22044 = abstractC22044M41983;
                th = th5;
            }
        } catch (Exception e3) {
            e = e3;
            abstractC22044 = abstractC22044M41983;
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        boolean zM43847 = m43847("compressToAnother");
        C22807.m51422(c12187, zM43847, zM43847 ? m43837(c8615) : m43863(c8614), c8614, c8615, C22807.m51418(this.f71137));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C6331.m18055();
    }
}
