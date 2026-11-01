package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚ֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes3.dex */
public class C5049 extends AbstractC20413 {

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public List f17616 = new ArrayList();

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5719;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, m41569("output"));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        mo41554("...");
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws Exception {
        AbstractC20745 abstractC20745;
        Throwable th;
        AbstractC20745 abstractC20745M41587 = m41587("output");
        String[] strArrM41566 = m41566("ARG_PATHS");
        String strM41585 = m41585("password");
        int iM41581 = m41581("level");
        boolean zM41573 = m41573("deleteSources");
        long jM41590 = m41590("splitSize");
        boolean zM41574 = m41573("replaceExisting");
        C4612 c4612M3391 = C0815.m3391((AbstractC17902) this, strArrM41566, false);
        ArrayList<C3056> arrayList = c4612M3391.f16331;
        if (mo2357()) {
            return C5202.m14378();
        }
        C19908 c19908M45178 = C19908.m45178(abstractC20745M41587, zM41574 || jM41590 != -1);
        AbstractC20745 abstractC20745M45186 = c19908M45178.m45186();
        ArrayList arrayList2 = new ArrayList();
        if (jM41590 == -1) {
            arrayList2.add(abstractC20745M45186);
        }
        try {
            C22918 c22918 = jM41590 == -1 ? new C22918(abstractC20745M45186) : new C22918(abstractC20745M45186, jM41590, new C16711(arrayList2));
            try {
                c22918.m50719(strM41585);
                boolean zM11266 = AbstractC3886.m11266(iM41581, c22918);
                C21123 c21123 = new C21123();
                if (zM11266) {
                    try {
                        for (C3056 c3056 : arrayList) {
                            if (!c3056.f11515 && c3056.f11521.equals("AndroidManifest.xml")) {
                                try {
                                    C20945 c20945M47096 = C20945.m47096(c3056.f11517);
                                    c21123.f68791 = C20240.m45752(c20945M47096);
                                    c21123.f68792 = C20240.m45748(c20945M47096);
                                    break;
                                } catch (Exception unused) {
                                    c21123.f68791 = false;
                                    c21123.f68792 = false;
                                    break;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        abstractC20745 = abstractC20745M45186;
                        try {
                            try {
                                c22918.close();
                                throw th;
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                                throw th;
                            }
                        } catch (Exception e) {
                            e = e;
                            C0815.m3392(arrayList2);
                            abstractC20745.mo24644();
                            throw e;
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C3056 c3057 = (C3056) it.next();
                    if (mo2357()) {
                        break;
                    }
                    c4612M3391.m12759();
                    boolean z = c3057.f11515;
                    long j = c3057.f11516;
                    it = it;
                    abstractC20745M45186 = abstractC20745M45186;
                    long j2 = c3057.f11519;
                    strArrM41566 = strArrM41566;
                    String str = c3057.f11521;
                    zM41573 = zM41573;
                    if (z) {
                        try {
                            C12107 c12107 = new C12107(str + "/");
                            c12107.setTime(j2);
                            c22918.m50727(c12107);
                        } catch (Throwable th4) {
                            th = th4;
                            abstractC20745 = abstractC20745M45186;
                            c22918.close();
                            throw th;
                        }
                    } else {
                        AbstractC20745 abstractC20746 = c3057.f11517;
                        if (zM11266) {
                            c22918.m50733(C16185.m38271(str, c21123));
                        }
                        StringBuilder sb = new StringBuilder();
                        boolean z2 = zM11266;
                        sb.append(C16737.m39288(R.string.MT_Protector));
                        sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                        sb.append(c4612M3391.m12755());
                        sb.append("/");
                        sb.append(c4612M3391.m12760());
                        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                        mo21457(sb.toString());
                        mo41554(str);
                        C12107 c12108 = new C12107(str);
                        c12108.m30096(j);
                        c12108.setTime(j2);
                        c22918.m50727(c12108);
                        abstractC20746.m46696(c22918.m50720(), new C2226(this, c4612M3391));
                        c4612M3391.m12756(j);
                        zM11266 = z2;
                    }
                }
                String[] strArr = strArrM41566;
                boolean z3 = zM41573;
                AbstractC20745 abstractC20747 = abstractC20745M45186;
                try {
                    c22918.close();
                    if (mo2357()) {
                        C0815.m3392(arrayList2);
                        abstractC20747.mo24644();
                        return C5202.m14378();
                    }
                    if (jM41590 != -1) {
                        if (arrayList2.isEmpty() || !abstractC20747.mo33975()) {
                            C0815.m3392(arrayList2);
                            abstractC20747.mo24644();
                            throw new IOException(C17922.m41615(abstractC20747, new StringBuilder("Unable to finalize ZIP split output: ")));
                        }
                        arrayList2.set(arrayList2.size() - 1, abstractC20747);
                    }
                    this.f17616 = c19908M45178.m45185(arrayList2, jM41590 == -1 ? EnumC15675.NONE : EnumC15675.ZIP);
                    if (mo2357()) {
                        return C5202.m14378();
                    }
                    if (z3) {
                        C0815.m3395(this, strArr, this.f17616, c4612M3391.m12760());
                    }
                    return C5202.m14379();
                } catch (Exception e2) {
                    e = e2;
                    abstractC20745 = abstractC20747;
                    C0815.m3392(arrayList2);
                    abstractC20745.mo24644();
                    throw e;
                }
            } catch (Throwable th5) {
                abstractC20745 = abstractC20745M45186;
                th = th5;
            }
        } catch (Exception e3) {
            e = e3;
            abstractC20745 = abstractC20745M45186;
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        boolean zM41573 = m41573("compressToAnother");
        C0815.m3393(c5202, zM41573, zM41573 ? m41559(c11546) : m41579(c11545), c11545, c11546, C0815.m3390(this.f17616));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C21094.m47530();
    }
}
