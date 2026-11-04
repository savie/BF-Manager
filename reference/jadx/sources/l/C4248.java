package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘܶ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 98AW */
/* JADX INFO: loaded from: classes3.dex */
public class C4248 extends AbstractC15118 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15466 = 0;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f15467;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public C7715 f15468;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public C1485 f15469 = new C1485();

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46049;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        mo16841("...");
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws Exception {
        ArrayList arrayList;
        C22941 c22941;
        Throwable th;
        C22941 c22942;
        byte[] bArr;
        C22941 c22943;
        C3374 c3374;
        String[] strArrM43831 = m43831("ARG_PATHS");
        AbstractC22044 abstractC22044M49857 = C6382.f21563.m49857("");
        this.f15467 = abstractC22044M49857;
        abstractC22044M49857.m49853();
        String strSubstring = m43865("targetPath").substring(1);
        int iM43854 = m43854("level");
        int iM43855 = m43854("update");
        C9651 c9651M43843 = m43843();
        boolean zM43847 = m43847("keepApkSigBlock");
        AbstractC18881 abstractC18881 = (AbstractC18881) m43838();
        C24320 c24320 = (C24320) m43848();
        c24320.mo20837(false);
        C1485 c1485 = this.f15469;
        if (iM43855 != 0) {
            c1485.m5293(new C12451(strSubstring, c24320, iM43855));
        }
        this.f15469.m5294(abstractC18881, null, null, strArrM43831, this.f15467.mo4294(), new C6486(this));
        if (mo924()) {
            return C12187.m30469();
        }
        m43868(R.string.MT_Protector);
        m36393(true);
        mo29447("...");
        AbstractC22044 abstractC22044M54371 = c24320.m54371();
        C7715 c7715M43873 = C18902.m43873(abstractC22044M54371, c9651M43843 != null);
        this.f15468 = c7715M43873;
        C25179 c25179M20996 = c7715M43873.m20996();
        ArrayList arrayList2 = new ArrayList();
        try {
            C22941 c22944 = new C22941(abstractC22044M54371);
            try {
                if (c9651M43843 == null && zM43847) {
                    try {
                        if (c22944.m51726()) {
                            c25179M20996.m56128(c22944);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        arrayList = arrayList2;
                        c22941 = c22944;
                    }
                }
                try {
                    if (c22944.m51736()) {
                        c25179M20996.m56130();
                    }
                    boolean zM25489 = AbstractDialogInterfaceOnClickListenerC9777.m25489(iM43854, c25179M20996);
                    C3150 c3150 = new C3150();
                    if (zM25489) {
                        c3150.m10289(c22944);
                    }
                    Iterator it = c1485.m5292().iterator();
                    long jM51749 = 0;
                    long size = 0;
                    while (it.hasNext()) {
                        C22941 c22945 = new C22941((AbstractC22044) it.next());
                        arrayList2.add(c22945);
                        for (C8002 c8002 : c22945.m51742()) {
                            if (!c8002.isDirectory()) {
                                size += c8002.getSize();
                            }
                        }
                        jM51749 += (long) c22945.m51749();
                    }
                    C3374 c3375 = new C3374(size);
                    c3375.m11078(new C17859(this));
                    HashSet hashSet = new HashSet();
                    byte[] bArr2 = new byte[1024];
                    Iterator it2 = arrayList2.iterator();
                    long j = 0;
                    while (true) {
                        long j2 = j;
                        AbstractC22044 abstractC22044 = abstractC22044M54371;
                        C9651 c9651 = c9651M43843;
                        if (it2.hasNext()) {
                            try {
                                Iterator it3 = it2;
                                C22941 c22946 = (C22941) it2.next();
                                for (C8002 c8003 : c22946.m51742()) {
                                    arrayList = arrayList2;
                                    try {
                                        byte[] bArr3 = bArr2;
                                        C22941 c22947 = c22946;
                                        long j3 = j2 + 1;
                                        c22942 = c22944;
                                        try {
                                            StringBuilder sb = new StringBuilder();
                                            C3374 c3376 = c3375;
                                            sb.append(C21576.m49088(R.string.MT_Protector));
                                            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                                            sb.append(j3);
                                            sb.append("/");
                                            sb.append(jM51749);
                                            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                                            mo16837(sb.toString());
                                            mo29447(c8003.getName());
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(strSubstring);
                                            String str = strSubstring;
                                            sb2.append(c8003.getName());
                                            C8002 c8004 = new C8002(sb2.toString());
                                            long j4 = jM51749;
                                            c8004.setTime(c8003.getTime());
                                            if (zM25489) {
                                                c25179M20996.m56135(C20304.m46644(c8004.getName(), c3150));
                                            }
                                            c25179M20996.m56125(c8004);
                                            hashSet.add(c8004.getName());
                                            if (!c8004.isDirectory()) {
                                                c22943 = c22947;
                                                InputStream inputStreamM51727 = c22943.m51727(c8003);
                                                bArr = bArr3;
                                                while (true) {
                                                    try {
                                                        int i = inputStreamM51727.read(bArr);
                                                        if (i == -1) {
                                                            c3374 = c3376;
                                                            inputStreamM51727.close();
                                                            break;
                                                        }
                                                        c25179M20996.write(bArr, 0, i);
                                                        C3374 c3377 = c3376;
                                                        c3377.m11079(i);
                                                        if (mo924()) {
                                                            C12187 c12187M30469 = C12187.m30469();
                                                            inputStreamM51727.close();
                                                            c22942.close();
                                                            Iterator it4 = arrayList.iterator();
                                                            while (it4.hasNext()) {
                                                                C20244.m46520((C22941) it4.next());
                                                            }
                                                            return c12187M30469;
                                                        }
                                                        c3376 = c3377;
                                                    } catch (Throwable th3) {
                                                        try {
                                                            inputStreamM51727.close();
                                                            throw th3;
                                                        } catch (Throwable th4) {
                                                            th3.addSuppressed(th4);
                                                            throw th3;
                                                        }
                                                    }
                                                    th = th;
                                                    th = th;
                                                    c22941 = c22942;
                                                    try {
                                                        c22941.close();
                                                        throw th;
                                                    } catch (Throwable th5) {
                                                        th.addSuppressed(th5);
                                                        throw th;
                                                    }
                                                }
                                            }
                                            bArr = bArr3;
                                            c22943 = c22947;
                                            c3374 = c3376;
                                            c25179M20996.m56134();
                                            if (mo924()) {
                                                C12187 c12187M304610 = C12187.m30469();
                                                c22942.close();
                                                Iterator it5 = arrayList.iterator();
                                                while (it5.hasNext()) {
                                                    C20244.m46520((C22941) it5.next());
                                                }
                                                return c12187M304610;
                                            }
                                            c3375 = c3374;
                                            j2 = j3;
                                            arrayList2 = arrayList;
                                            jM51749 = j4;
                                            c22946 = c22943;
                                            bArr2 = bArr;
                                            c22944 = c22942;
                                            strSubstring = str;
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        c22942 = c22944;
                                    }
                                }
                                abstractC22044M54371 = abstractC22044;
                                j = j2;
                                c9651M43843 = c9651;
                                it2 = it3;
                            } catch (Throwable th8) {
                                th = th8;
                                arrayList = arrayList2;
                            }
                        } else {
                            arrayList = arrayList2;
                            C22941 c22948 = c22944;
                            try {
                                long jM517410 = c22948.m51749();
                                long jM46645 = 0;
                                for (C8002 c8005 : c22948.m51742()) {
                                    if (!c8005.isDirectory()) {
                                        jM46645 += zM25489 ? C20304.m46645(c8005, c3150) : c8005.m21838();
                                    }
                                }
                                C3374 c3378 = new C3374(jM46645);
                                c3378.m11078(new C17859(this));
                                long j5 = 0;
                                for (C8002 c8006 : c22948.m51742()) {
                                    j5++;
                                    if (hashSet.contains(c8006.getName())) {
                                        if (!c8006.isDirectory()) {
                                            c3378.m11077(zM25489 ? C20304.m46645(c8006, c3150) : c8006.m21838());
                                        }
                                        c22941 = c22948;
                                    } else {
                                        mo16837(C21576.m49088(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + j5 + "/" + jM517410 + MotionUtils.EASING_TYPE_FORMAT_END);
                                        mo29447(c8006.getName());
                                        c22941 = c22948;
                                        try {
                                            C20304.m46646(c22941, c25179M20996, c8006, c3150, new C24386(this, c3378));
                                            if (mo924()) {
                                                C12187 c12187M304611 = C12187.m30469();
                                                c22941.close();
                                                Iterator it6 = arrayList.iterator();
                                                while (it6.hasNext()) {
                                                    C20244.m46520((C22941) it6.next());
                                                }
                                                return c12187M304611;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            th = th;
                                            c22941.close();
                                            throw th;
                                        }
                                    }
                                    c22948 = c22941;
                                    zM25489 = zM25489;
                                }
                                C22941 c22949 = c22948;
                                c25179M20996.close();
                                if (c9651 != null) {
                                    C0938.m3744(this.f15468, c9651, this);
                                }
                                if (mo924()) {
                                    C12187 c12187M304612 = C12187.m30469();
                                    c22949.close();
                                    Iterator it7 = arrayList.iterator();
                                    while (it7.hasNext()) {
                                        C20244.m46520((C22941) it7.next());
                                    }
                                    return c12187M304612;
                                }
                                C24808.m55331(abstractC22044);
                                C24523 c24523 = new C24523();
                                c24523.m54796(abstractC22044);
                                this.f15468.m20995(abstractC22044, new RunnableC8296(2, this, abstractC22044), c22949);
                                c24523.m54797(abstractC22044);
                                c22949.close();
                                Iterator it8 = arrayList.iterator();
                                while (it8.hasNext()) {
                                    C20244.m46520((C22941) it8.next());
                                }
                                return m43857();
                            } catch (Throwable th10) {
                                th = th10;
                                c22941 = c22948;
                            }
                        }
                    }
                } catch (Throwable th11) {
                    th = th11;
                    arrayList = arrayList2;
                    c22941 = c22944;
                }
            } catch (Throwable th12) {
                th = th12;
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    C20244.m46520((C22941) it9.next());
                }
                throw th;
            }
        } catch (Throwable th13) {
            th = th13;
            arrayList = arrayList2;
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (c12187.m30474()) {
            if (m43863(c8614)) {
                c8614.m23209();
            }
            if (m43837(c8615)) {
                c8615.m23176((Collection) this.f15469.m5295());
                c8615.m23216();
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C7715 c7715;
        AbstractC22044 abstractC22044 = this.f15467;
        if (abstractC22044 != null) {
            abstractC22044.mo4296();
        }
        if (!c12187.m30474() && (c7715 = this.f15468) != null) {
            C20244.m46520(c7715.m20996());
            this.f15468.m20994().mo4296();
        }
        C6331.m18055();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, C21576.m49088(R.string.MT_Protector).toLowerCase());
    }
}
