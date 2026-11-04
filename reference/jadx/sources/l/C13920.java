package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۬ܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes4.dex */
public class C13920 extends AbstractC19594 {

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public String f44145 = "null";

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f44144 = new ArrayList();

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46049;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, this.f44145);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        mo29447("...");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ed A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:15:0x0081, B:17:0x008f, B:18:0x0097, B:20:0x009d, B:22:0x00ad, B:24:0x00b9, B:25:0x00bb, B:33:0x00e1, B:34:0x00e7, B:36:0x00ed, B:39:0x00fb, B:42:0x013c, B:43:0x015b, B:45:0x015f, B:47:0x016b, B:28:0x00cd), top: B:73:0x0081, outer: #2, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fb A[Catch: all -> 0x01c0, TRY_LEAVE, TryCatch #0 {all -> 0x01c0, blocks: (B:15:0x0081, B:17:0x008f, B:18:0x0097, B:20:0x009d, B:22:0x00ad, B:24:0x00b9, B:25:0x00bb, B:33:0x00e1, B:34:0x00e7, B:36:0x00ed, B:39:0x00fb, B:42:0x013c, B:43:0x015b, B:45:0x015f, B:47:0x016b, B:28:0x00cd), top: B:73:0x0081, outer: #2, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x013c A[Catch: all -> 0x01c0, TRY_ENTER, TryCatch #0 {all -> 0x01c0, blocks: (B:15:0x0081, B:17:0x008f, B:18:0x0097, B:20:0x009d, B:22:0x00ad, B:24:0x00b9, B:25:0x00bb, B:33:0x00e1, B:34:0x00e7, B:36:0x00ed, B:39:0x00fb, B:42:0x013c, B:43:0x015b, B:45:0x015f, B:47:0x016b, B:28:0x00cd), top: B:73:0x0081, outer: #2, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x015b A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:15:0x0081, B:17:0x008f, B:18:0x0097, B:20:0x009d, B:22:0x00ad, B:24:0x00b9, B:25:0x00bb, B:33:0x00e1, B:34:0x00e7, B:36:0x00ed, B:39:0x00fb, B:42:0x013c, B:43:0x015b, B:45:0x015f, B:47:0x016b, B:28:0x00cd), top: B:73:0x0081, outer: #2, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x015f A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:15:0x0081, B:17:0x008f, B:18:0x0097, B:20:0x009d, B:22:0x00ad, B:24:0x00b9, B:25:0x00bb, B:33:0x00e1, B:34:0x00e7, B:36:0x00ed, B:39:0x00fb, B:42:0x013c, B:43:0x015b, B:45:0x015f, B:47:0x016b, B:28:0x00cd), top: B:73:0x0081, outer: #2, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0169  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ad A[LOOP:0: B:7:0x0035->B:55:0x01ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00fb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x013c, please report this as an issue */
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws Exception {
        AbstractC22044 abstractC22044;
        String str;
        int i;
        Iterator it;
        String str2;
        String[] strArr;
        int i2;
        C7078 c7078;
        boolean z;
        long j;
        String str3;
        String str4 = "/";
        AbstractC22044 abstractC22044M43860 = m43860("outputDir");
        String[] strArrM43831 = m43831("ARG_PATHS");
        String strM43865 = m43865("password");
        int iM43854 = m43854("level");
        boolean zM43847 = m43847("deleteSources");
        int i3 = 0;
        C10872 c10872 = new C10872(this, strArrM43831, false);
        if (mo924()) {
            return C12187.m30469();
        }
        int length = strArrM43831.length;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f44144;
            if (i4 < length) {
                AbstractC22044 abstractC22044M35193 = C14584.m35193(strArrM43831[i4], new String[i3]);
                AbstractC22044 abstractC22044M49839 = abstractC22044M43860.m49876((abstractC22044M35193.mo4281() ? abstractC22044M35193.getName() : abstractC22044M35193.m49874()) + ".zip").m49839(true);
                this.f44145 = abstractC22044M49839.getName();
                C13789 c13789M27611 = c10872.m27611(i4);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(abstractC22044M49839);
                try {
                    C25179 c25179 = new C25179(abstractC22044M49839);
                    try {
                        c25179.m56139(strM43865);
                        boolean zM39533 = AbstractC16752.m39533(iM43854, c25179);
                        C3150 c3150 = new C3150();
                        if (zM39533) {
                            abstractC22044 = abstractC22044M43860;
                            Iterator it2 = c13789M27611.f43741.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Iterator it3 = it2;
                                    C7078 c7079 = (C7078) it2.next();
                                    str = strM43865;
                                    if (!c7079.f23331) {
                                        i = iM43854;
                                        if (c7079.f23324.equals("AndroidManifest.xml")) {
                                            try {
                                                C14955 c14955M35975 = C14955.m35975(c7079.f23323);
                                                c3150.f10213 = C18685.m43477(c14955M35975);
                                                c3150.f10214 = C18685.m43478(c14955M35975);
                                                break;
                                            } catch (Exception unused) {
                                                c3150.f10213 = false;
                                                c3150.f10214 = false;
                                                break;
                                            }
                                        }
                                        C22807.m51420(arrayList2);
                                        throw e;
                                    }
                                    i = iM43854;
                                    strM43865 = str;
                                    it2 = it3;
                                    iM43854 = i;
                                }
                            }
                            it = c13789M27611.f43741.iterator();
                            while (it.hasNext()) {
                                c7078 = (C7078) it.next();
                                if (mo924()) {
                                    break;
                                }
                                c10872.m27614();
                                mo16837(C21576.m49088(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + c10872.m27610() + str4 + c10872.m27613() + MotionUtils.EASING_TYPE_FORMAT_END);
                                z = c7078.f23331;
                                Iterator it4 = it;
                                String[] strArr2 = strArrM43831;
                                j = c7078.f23326;
                                int i5 = length;
                                str3 = c7078.f23324;
                                if (z) {
                                    C8002 c8002 = new C8002(str3 + str4);
                                    c8002.setTime(j);
                                    c25179.m56125(c8002);
                                    str4 = str4;
                                } else {
                                    AbstractC22044 abstractC22045 = c7078.f23323;
                                    if (zM39533) {
                                        c25179.m56135(C20304.m46644(str3, c3150));
                                    }
                                    mo29447(str3);
                                    C8002 c8003 = new C8002(str3);
                                    c8003.m21854(c7078.f23322);
                                    c8003.setTime(j);
                                    c25179.m56125(c8003);
                                    abstractC22045.m49842(c25179.m56119(), new C7209(this, c10872));
                                }
                                strArrM43831 = strArr2;
                                it = it4;
                                length = i5;
                                str4 = str4;
                                zM39533 = zM39533;
                            }
                            str2 = str4;
                            strArr = strArrM43831;
                            i2 = length;
                            c25179.close();
                            if (mo924()) {
                                C22807.m51420(arrayList2);
                                return C12187.m30469();
                            }
                            arrayList.addAll(arrayList2);
                            i4++;
                            i3 = 0;
                            strArrM43831 = strArr;
                            abstractC22044M43860 = abstractC22044;
                            strM43865 = str;
                            iM43854 = i;
                            length = i2;
                            str4 = str2;
                        } else {
                            abstractC22044 = abstractC22044M43860;
                        }
                        str = strM43865;
                        i = iM43854;
                        it = c13789M27611.f43741.iterator();
                        while (it.hasNext()) {
                            c7078 = (C7078) it.next();
                            if (mo924()) {
                                break;
                                break;
                            }
                            c10872.m27614();
                            mo16837(C21576.m49088(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + c10872.m27610() + str4 + c10872.m27613() + MotionUtils.EASING_TYPE_FORMAT_END);
                            z = c7078.f23331;
                            Iterator it5 = it;
                            String[] strArr3 = strArrM43831;
                            j = c7078.f23326;
                            int i6 = length;
                            str3 = c7078.f23324;
                            if (z) {
                                C8002 c8004 = new C8002(str3 + str4);
                                c8004.setTime(j);
                                c25179.m56125(c8004);
                                str4 = str4;
                            } else {
                                AbstractC22044 abstractC22046 = c7078.f23323;
                                if (zM39533) {
                                    c25179.m56135(C20304.m46644(str3, c3150));
                                }
                                mo29447(str3);
                                C8002 c8005 = new C8002(str3);
                                c8005.m21854(c7078.f23322);
                                c8005.setTime(j);
                                c25179.m56125(c8005);
                                abstractC22046.m49842(c25179.m56119(), new C7209(this, c10872));
                            }
                            strArrM43831 = strArr3;
                            it = it5;
                            length = i6;
                            str4 = str4;
                            zM39533 = zM39533;
                        }
                        str2 = str4;
                        strArr = strArrM43831;
                        i2 = length;
                        c25179.close();
                        if (mo924()) {
                            C22807.m51420(arrayList2);
                            return C12187.m30469();
                        }
                        arrayList.addAll(arrayList2);
                        i4++;
                        i3 = 0;
                        strArrM43831 = strArr;
                        abstractC22044M43860 = abstractC22044;
                        strM43865 = str;
                        iM43854 = i;
                        length = i2;
                        str4 = str2;
                    } catch (Throwable th) {
                        try {
                            c25179.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    C22807.m51420(arrayList2);
                    throw e;
                }
            } else {
                String[] strArr4 = strArrM43831;
                if (!mo924() && zM43847) {
                    C22807.m51423(this, strArr4, arrayList, c10872.m27613());
                }
                return m43857();
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        boolean zM43847 = m43847("compressToAnother");
        C22807.m51422(c12187, zM43847, zM43847 ? m43837(c8615) : m43863(c8614), c8614, c8615, C22807.m51418((List) this.f44144));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C6331.m18055();
    }
}
