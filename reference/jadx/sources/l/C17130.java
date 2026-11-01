package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 98AW */
/* JADX INFO: loaded from: classes5.dex */
public class C17130 extends AbstractC0656 {

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f54631 = 0;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public C15575 f54632;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f54633;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public C13479 f54634 = new C13479();

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5719;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        mo2982("...");
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws Exception {
        ArrayList arrayList;
        C2455 c2455;
        Throwable th;
        C2455 c2456;
        byte[] bArr;
        C2455 c2457;
        C8516 c8516;
        String[] strArrM41566 = m41566("ARG_PATHS");
        AbstractC20745 abstractC20745M46688 = C11904.f39941.m46688("");
        this.f54633 = abstractC20745M46688;
        abstractC20745M46688.m46739();
        String strSubstring = m41585("targetPath").substring(1);
        int iM41581 = m41581("level");
        int iM41582 = m41581("update");
        C14558 c14558M41593 = m41593();
        boolean zM41573 = m41573("keepApkSigBlock");
        AbstractC12233 abstractC12233 = (AbstractC12233) m41560();
        C8289 c8289 = (C8289) m41574();
        c8289.mo10267(false);
        C13479 c13479 = this.f54634;
        if (iM41582 != 0) {
            c13479.m32985(new C0196(strSubstring, c8289, iM41582));
        }
        this.f54634.m32986(abstractC12233, null, null, strArrM41566, this.f54633.mo33986(), new C16425(this));
        if (mo2357()) {
            return C5202.m14378();
        }
        m41591(R.string.MT_Protector);
        m2980(true);
        mo41554("...");
        AbstractC20745 abstractC20745M21723 = c8289.m21723();
        C15575 c15575M45035 = C19808.m45035(abstractC20745M21723, c14558M41593 != null);
        this.f54632 = c15575M45035;
        C22918 c22918M37220 = c15575M45035.m37220();
        ArrayList arrayList2 = new ArrayList();
        try {
            C2455 c2458 = new C2455(abstractC20745M21723);
            try {
                if (c14558M41593 == null && zM41573) {
                    try {
                        if (c2458.m7488()) {
                            c22918M37220.m50726(c2458);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        arrayList = arrayList2;
                        c2455 = c2458;
                    }
                }
                try {
                    if (c2458.m7482()) {
                        c22918M37220.m50718();
                    }
                    boolean zM30496 = AbstractDialogInterfaceOnClickListenerC12272.m30496(iM41581, c22918M37220);
                    C21123 c21123 = new C21123();
                    if (zM30496) {
                        c21123.m47548(c2458);
                    }
                    Iterator it = c13479.m32984().iterator();
                    long jM7485 = 0;
                    long size = 0;
                    while (it.hasNext()) {
                        C2455 c2459 = new C2455((AbstractC20745) it.next());
                        arrayList2.add(c2459);
                        for (C12107 c12107 : c2459.m7466()) {
                            if (!c12107.isDirectory()) {
                                size += c12107.getSize();
                            }
                        }
                        jM7485 += (long) c2459.m7485();
                    }
                    C8516 c8517 = new C8516(size);
                    c8517.m22241(new C4895(this));
                    HashSet hashSet = new HashSet();
                    byte[] bArr2 = new byte[1024];
                    Iterator it2 = arrayList2.iterator();
                    long j = 0;
                    while (true) {
                        long j2 = j;
                        AbstractC20745 abstractC20745 = abstractC20745M21723;
                        C14558 c14558 = c14558M41593;
                        if (it2.hasNext()) {
                            try {
                                Iterator it3 = it2;
                                C2455 c24510 = (C2455) it2.next();
                                for (C12107 c12108 : c24510.m7466()) {
                                    arrayList = arrayList2;
                                    try {
                                        byte[] bArr3 = bArr2;
                                        C2455 c24511 = c24510;
                                        long j3 = j2 + 1;
                                        c2456 = c2458;
                                        try {
                                            StringBuilder sb = new StringBuilder();
                                            C8516 c8518 = c8517;
                                            sb.append(C16737.m39288(R.string.MT_Protector));
                                            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                                            sb.append(j3);
                                            sb.append("/");
                                            sb.append(jM7485);
                                            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                                            mo21457(sb.toString());
                                            mo41554(c12108.getName());
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(strSubstring);
                                            String str = strSubstring;
                                            sb2.append(c12108.getName());
                                            C12107 c12109 = new C12107(sb2.toString());
                                            long j4 = jM7485;
                                            c12109.setTime(c12108.getTime());
                                            if (zM30496) {
                                                c22918M37220.m50733(C16185.m38271(c12109.getName(), c21123));
                                            }
                                            c22918M37220.m50727(c12109);
                                            hashSet.add(c12109.getName());
                                            if (!c12109.isDirectory()) {
                                                c2457 = c24511;
                                                InputStream inputStreamM7471 = c2457.m7471(c12108);
                                                bArr = bArr3;
                                                while (true) {
                                                    try {
                                                        int i = inputStreamM7471.read(bArr);
                                                        if (i == -1) {
                                                            c8516 = c8518;
                                                            inputStreamM7471.close();
                                                            break;
                                                        }
                                                        c22918M37220.write(bArr, 0, i);
                                                        C8516 c8519 = c8518;
                                                        c8519.m22242(i);
                                                        if (mo2357()) {
                                                            C5202 c5202M14378 = C5202.m14378();
                                                            inputStreamM7471.close();
                                                            c2456.close();
                                                            Iterator it4 = arrayList.iterator();
                                                            while (it4.hasNext()) {
                                                                C19431.m44468((C2455) it4.next());
                                                            }
                                                            return c5202M14378;
                                                        }
                                                        c8518 = c8519;
                                                    } catch (Throwable th3) {
                                                        try {
                                                            inputStreamM7471.close();
                                                            throw th3;
                                                        } catch (Throwable th4) {
                                                            th3.addSuppressed(th4);
                                                            throw th3;
                                                        }
                                                    }
                                                    th = th;
                                                    th = th;
                                                    c2455 = c2456;
                                                    try {
                                                        c2455.close();
                                                        throw th;
                                                    } catch (Throwable th5) {
                                                        th.addSuppressed(th5);
                                                        throw th;
                                                    }
                                                }
                                            }
                                            bArr = bArr3;
                                            c2457 = c24511;
                                            c8516 = c8518;
                                            c22918M37220.m50730();
                                            if (mo2357()) {
                                                C5202 c5202M14379 = C5202.m14378();
                                                c2456.close();
                                                Iterator it5 = arrayList.iterator();
                                                while (it5.hasNext()) {
                                                    C19431.m44468((C2455) it5.next());
                                                }
                                                return c5202M14379;
                                            }
                                            c8517 = c8516;
                                            j2 = j3;
                                            arrayList2 = arrayList;
                                            jM7485 = j4;
                                            c24510 = c2457;
                                            bArr2 = bArr;
                                            c2458 = c2456;
                                            strSubstring = str;
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        c2456 = c2458;
                                    }
                                }
                                abstractC20745M21723 = abstractC20745;
                                j = j2;
                                c14558M41593 = c14558;
                                it2 = it3;
                            } catch (Throwable th8) {
                                th = th8;
                                arrayList = arrayList2;
                            }
                        } else {
                            arrayList = arrayList2;
                            C2455 c24512 = c2458;
                            try {
                                long jM7486 = c24512.m7485();
                                long jM38272 = 0;
                                for (C12107 c121010 : c24512.m7466()) {
                                    if (!c121010.isDirectory()) {
                                        jM38272 += zM30496 ? C16185.m38272(c121010, c21123) : c121010.m30138();
                                    }
                                }
                                C8516 c85110 = new C8516(jM38272);
                                c85110.m22241(new C4895(this));
                                long j5 = 0;
                                for (C12107 c121011 : c24512.m7466()) {
                                    j5++;
                                    if (hashSet.contains(c121011.getName())) {
                                        if (!c121011.isDirectory()) {
                                            c85110.m22240(zM30496 ? C16185.m38272(c121011, c21123) : c121011.m30138());
                                        }
                                        c2455 = c24512;
                                    } else {
                                        mo21457(C16737.m39288(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + j5 + "/" + jM7486 + MotionUtils.EASING_TYPE_FORMAT_END);
                                        mo41554(c121011.getName());
                                        c2455 = c24512;
                                        try {
                                            C16185.m38273(c2455, c22918M37220, c121011, c21123, new C12192(this, c85110));
                                            if (mo2357()) {
                                                C5202 c5202M143710 = C5202.m14378();
                                                c2455.close();
                                                Iterator it6 = arrayList.iterator();
                                                while (it6.hasNext()) {
                                                    C19431.m44468((C2455) it6.next());
                                                }
                                                return c5202M143710;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            th = th;
                                            c2455.close();
                                            throw th;
                                        }
                                    }
                                    c24512 = c2455;
                                    zM30496 = zM30496;
                                }
                                C2455 c24513 = c24512;
                                c22918M37220.close();
                                if (c14558 != null) {
                                    C11005.m27760(this.f54632, c14558, this);
                                }
                                if (mo2357()) {
                                    C5202 c5202M143711 = C5202.m14378();
                                    c24513.close();
                                    Iterator it7 = arrayList.iterator();
                                    while (it7.hasNext()) {
                                        C19431.m44468((C2455) it7.next());
                                    }
                                    return c5202M143711;
                                }
                                C19016.m43740(abstractC20745);
                                C5222 c5222 = new C5222();
                                c5222.m14408(abstractC20745);
                                this.f54632.m37219(abstractC20745, new RunnableC15178(3, this, abstractC20745), c24513);
                                c5222.m14402(abstractC20745);
                                c24513.close();
                                Iterator it8 = arrayList.iterator();
                                while (it8.hasNext()) {
                                    C19431.m44468((C2455) it8.next());
                                }
                                return m41583();
                            } catch (Throwable th10) {
                                th = th10;
                                c2455 = c24512;
                            }
                        }
                    }
                } catch (Throwable th11) {
                    th = th11;
                    arrayList = arrayList2;
                    c2455 = c2458;
                }
            } catch (Throwable th12) {
                th = th12;
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    C19431.m44468((C2455) it9.next());
                }
                throw th;
            }
        } catch (Throwable th13) {
            th = th13;
            arrayList = arrayList2;
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (c5202.m14380()) {
            if (m41579(c11545)) {
                c11545.m28831();
            }
            if (m41559(c11546)) {
                c11546.m28777((Collection) this.f54634.m32987());
                c11546.m28830();
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C15575 c15575;
        AbstractC20745 abstractC20745 = this.f54633;
        if (abstractC20745 != null) {
            abstractC20745.mo24647();
        }
        if (!c5202.m14380() && (c15575 = this.f54632) != null) {
            C19431.m44468(c15575.m37220());
            this.f54632.m37218().mo24647();
        }
        C21094.m47530();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, C16737.m39288(R.string.MT_Protector).toLowerCase());
    }
}
