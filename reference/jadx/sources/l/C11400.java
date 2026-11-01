package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۨ֫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes4.dex */
public class C11400 extends AbstractC20413 {

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public String f38404 = "null";

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f38403 = new ArrayList();

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5719;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, this.f38404);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        mo41554("...");
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
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws Exception {
        AbstractC20745 abstractC20745;
        String str;
        int i;
        Iterator it;
        String str2;
        String[] strArr;
        int i2;
        C3056 c3056;
        boolean z;
        long j;
        String str3;
        String str4 = "/";
        AbstractC20745 abstractC20745M41587 = m41587("outputDir");
        String[] strArrM41566 = m41566("ARG_PATHS");
        String strM41585 = m41585("password");
        int iM41581 = m41581("level");
        boolean zM41573 = m41573("deleteSources");
        int i3 = 0;
        C21983 c21983 = new C21983(this, strArrM41566, false);
        if (mo2357()) {
            return C5202.m14378();
        }
        int length = strArrM41566.length;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f38403;
            if (i4 < length) {
                AbstractC20745 abstractC20745M15313 = C5553.m15313(strArrM41566[i4], new String[i3]);
                AbstractC20745 abstractC20745M46693 = abstractC20745M41587.m46690((abstractC20745M15313.mo33974() ? abstractC20745M15313.getName() : abstractC20745M15313.m46718()) + ".zip").m46693(true);
                this.f38404 = abstractC20745M46693.getName();
                C4612 c4612M48804 = c21983.m48804(i4);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(abstractC20745M46693);
                try {
                    C22918 c22918 = new C22918(abstractC20745M46693);
                    try {
                        c22918.m50719(strM41585);
                        boolean zM11266 = AbstractC3886.m11266(iM41581, c22918);
                        C21123 c21123 = new C21123();
                        if (zM11266) {
                            abstractC20745 = abstractC20745M41587;
                            Iterator it2 = c4612M48804.f16331.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Iterator it3 = it2;
                                    C3056 c3057 = (C3056) it2.next();
                                    str = strM41585;
                                    if (!c3057.f11515) {
                                        i = iM41581;
                                        if (c3057.f11521.equals("AndroidManifest.xml")) {
                                            try {
                                                C20945 c20945M47096 = C20945.m47096(c3057.f11517);
                                                c21123.f68791 = C20240.m45752(c20945M47096);
                                                c21123.f68792 = C20240.m45748(c20945M47096);
                                                break;
                                            } catch (Exception unused) {
                                                c21123.f68791 = false;
                                                c21123.f68792 = false;
                                                break;
                                            }
                                        }
                                        C0815.m3392(arrayList2);
                                        throw e;
                                    }
                                    i = iM41581;
                                    strM41585 = str;
                                    it2 = it3;
                                    iM41581 = i;
                                }
                            }
                            it = c4612M48804.f16331.iterator();
                            while (it.hasNext()) {
                                c3056 = (C3056) it.next();
                                if (mo2357()) {
                                    break;
                                }
                                c21983.m48806();
                                mo21457(C16737.m39288(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + c21983.m48803() + str4 + c21983.m48807() + MotionUtils.EASING_TYPE_FORMAT_END);
                                z = c3056.f11515;
                                Iterator it4 = it;
                                String[] strArr2 = strArrM41566;
                                j = c3056.f11519;
                                int i5 = length;
                                str3 = c3056.f11521;
                                if (z) {
                                    C12107 c12107 = new C12107(str3 + str4);
                                    c12107.setTime(j);
                                    c22918.m50727(c12107);
                                    str4 = str4;
                                } else {
                                    AbstractC20745 abstractC20746 = c3056.f11517;
                                    if (zM11266) {
                                        c22918.m50733(C16185.m38271(str3, c21123));
                                    }
                                    mo41554(str3);
                                    C12107 c12108 = new C12107(str3);
                                    c12108.m30096(c3056.f11516);
                                    c12108.setTime(j);
                                    c22918.m50727(c12108);
                                    abstractC20746.m46696(c22918.m50720(), new C13517(this, c21983));
                                }
                                strArrM41566 = strArr2;
                                it = it4;
                                length = i5;
                                str4 = str4;
                                zM11266 = zM11266;
                            }
                            str2 = str4;
                            strArr = strArrM41566;
                            i2 = length;
                            c22918.close();
                            if (mo2357()) {
                                C0815.m3392(arrayList2);
                                return C5202.m14378();
                            }
                            arrayList.addAll(arrayList2);
                            i4++;
                            i3 = 0;
                            strArrM41566 = strArr;
                            abstractC20745M41587 = abstractC20745;
                            strM41585 = str;
                            iM41581 = i;
                            length = i2;
                            str4 = str2;
                        } else {
                            abstractC20745 = abstractC20745M41587;
                        }
                        str = strM41585;
                        i = iM41581;
                        it = c4612M48804.f16331.iterator();
                        while (it.hasNext()) {
                            c3056 = (C3056) it.next();
                            if (mo2357()) {
                                break;
                                break;
                            }
                            c21983.m48806();
                            mo21457(C16737.m39288(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + c21983.m48803() + str4 + c21983.m48807() + MotionUtils.EASING_TYPE_FORMAT_END);
                            z = c3056.f11515;
                            Iterator it5 = it;
                            String[] strArr3 = strArrM41566;
                            j = c3056.f11519;
                            int i6 = length;
                            str3 = c3056.f11521;
                            if (z) {
                                C12107 c12109 = new C12107(str3 + str4);
                                c12109.setTime(j);
                                c22918.m50727(c12109);
                                str4 = str4;
                            } else {
                                AbstractC20745 abstractC20747 = c3056.f11517;
                                if (zM11266) {
                                    c22918.m50733(C16185.m38271(str3, c21123));
                                }
                                mo41554(str3);
                                C12107 c121010 = new C12107(str3);
                                c121010.m30096(c3056.f11516);
                                c121010.setTime(j);
                                c22918.m50727(c121010);
                                abstractC20747.m46696(c22918.m50720(), new C13517(this, c21983));
                            }
                            strArrM41566 = strArr3;
                            it = it5;
                            length = i6;
                            str4 = str4;
                            zM11266 = zM11266;
                        }
                        str2 = str4;
                        strArr = strArrM41566;
                        i2 = length;
                        c22918.close();
                        if (mo2357()) {
                            C0815.m3392(arrayList2);
                            return C5202.m14378();
                        }
                        arrayList.addAll(arrayList2);
                        i4++;
                        i3 = 0;
                        strArrM41566 = strArr;
                        abstractC20745M41587 = abstractC20745;
                        strM41585 = str;
                        iM41581 = i;
                        length = i2;
                        str4 = str2;
                    } catch (Throwable th) {
                        try {
                            c22918.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    C0815.m3392(arrayList2);
                    throw e;
                }
            } else {
                String[] strArr4 = strArrM41566;
                if (!mo2357() && zM41573) {
                    C0815.m3395(this, strArr4, arrayList, c21983.m48807());
                }
                return m41583();
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        boolean zM41573 = m41573("compressToAnother");
        C0815.m3393(c5202, zM41573, zM41573 ? m41559(c11546) : m41579(c11545), c11545, c11546, C0815.m3390((List) this.f38403));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C21094.m47530();
    }
}
