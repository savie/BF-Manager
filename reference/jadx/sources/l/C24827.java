package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.᩻ۚ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: A1YB */
/* JADX INFO: loaded from: classes2.dex */
public class C24827 extends AbstractC19594 {

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f80304 = 0;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public String f80305;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f80306;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public boolean f80309;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f80313;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public C24523 f80307 = new C24523();

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public C18616 f80310 = new C18616(false);

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public HashSet f80308 = new HashSet();

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C22763 f80312 = new C22763();

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f80311 = new HashSet();

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f80314 = new HashSet();

    /* JADX WARN: Bottom block not found for handler: all -> 0x022f */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0502 */
    /* JADX WARN: Code duplicated, block: B:139:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:229:0x04d1 A[Catch: all -> 0x04f2, TryCatch #10 {all -> 0x04f2, blocks: (B:187:0x03f1, B:203:0x0433, B:206:0x044a, B:208:0x044e, B:209:0x0451, B:196:0x0406, B:197:0x040b, B:199:0x0417, B:201:0x041d, B:213:0x0497, B:214:0x049d, B:216:0x04a4, B:221:0x04ae, B:223:0x04b2, B:224:0x04b5, B:225:0x04c1, B:226:0x04c2, B:227:0x04cb, B:229:0x04d1, B:231:0x04df, B:232:0x04e5), top: B:418:0x03f1 }] */
    /* JADX WARN: Code duplicated, block: B:366:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:367:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:431:0x07e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x0848 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x04df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x04cb A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:498:?, code lost:
    
        throw r0;
     */
    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C12187 mo2531() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2155
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C24827.mo2531():l.ۨۜۧ");
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        String[] strArrM43831 = m43831("ARG_PATHS");
        return strArrM43831.length == 1 ? C21576.m49059(R.string.MT_Protector, C11293.m28558(strArrM43831[0])) : C21576.m49059(R.string.MT_Protector, m43850("extractDir"));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46056;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        mo29447("...");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m55341(C24827 c24827, AbstractC22044 abstractC22044, int i, IInArchive iInArchive, AbstractC22044 abstractC22045, String[] strArr, C1706[] c1706Arr) throws Throwable {
        boolean zM49078 = C21576.m49078();
        ArrayList<C1997> arrayList = new ArrayList();
        C3480 c3480 = new C3480();
        C22069.m49902(null, null, new C5435(c24827, c24827, iInArchive, abstractC22045, arrayList, c1706Arr, strArr, abstractC22044, zM49078, c3480, i));
        if (c24827.mo924()) {
            return;
        }
        c24827.m43868(R.string.MT_Protector);
        C3374 c3374 = new C3374(arrayList.size());
        c3374.m11078(new C11882(c24827));
        for (C1997 c1997 : arrayList) {
            c3374.m11079(1);
            String str = strArr[c1997.m6835()];
            c24827.mo29447(str);
            AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(str);
            c24827.m55344(abstractC22044M49876);
            if (c1997.m6831() >= 0 && zM49078 && abstractC22044M49876.mo2945()) {
                abstractC22044M49876.mo2942(c1997.m6831());
            }
            c24827.m55343(str);
        }
        ArrayList arrayList2 = new ArrayList();
        for (C1706 c1706 : c1706Arr) {
            if (c1706 != null) {
                arrayList2.add(c1706);
            }
        }
        c24827.m55338(abstractC22044, i, arrayList2, c3480);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m55336(AbstractC22044 abstractC22044, String str, long j, long j2) {
        int iMo28696;
        boolean zM51341 = this.f80312.m51341(abstractC22044);
        C18616 c18616 = this.f80310;
        if (c18616.mo28698(zM51341)) {
            iMo28696 = c18616.mo28696(str, C21578.m49094(j, j2), C21578.m49096(abstractC22044), abstractC22044.mo4292(), zM51341);
        } else {
            C21578 c21578 = C21578.f68936;
            iMo28696 = c18616.mo28696(str, c21578, c21578, false, zM51341);
        }
        if (c18616.mo924()) {
            cancel();
        }
        return iMo28696;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m55338(AbstractC22044 abstractC22044, int i, ArrayList arrayList, C3480 c3480) {
        if (arrayList.isEmpty()) {
            return;
        }
        m43868(R.string.MT_Protector);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1706 c1706 = (C1706) it.next();
            if (!mo924()) {
                String str = c1706.f5851;
                String strConcat = str.concat("/");
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        AbstractC22044 abstractC22044M49876 = abstractC22044.m49876(str);
                        if (!abstractC22044M49876.mo2934()) {
                            mo29447(str);
                            m55344(abstractC22044M49876.m49858());
                            abstractC22044M49876.mo2946(c3480.m11433(str, c1706.f5850));
                            if (!c1706.f5849) {
                                int i2 = C20108.f64607;
                                C20108.m46233(abstractC22044M49876.mo4294(), true);
                            }
                            m55343(abstractC22044M49876.mo4294().substring(i));
                            break;
                        }
                        break;
                    }
                    C1706 c1707 = (C1706) it2.next();
                    if (c1707 != c1706 && c1707.f5851.startsWith(strConcat)) {
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m55343(String str) {
        int iIndexOf = str.indexOf(47);
        HashSet hashSet = this.f80308;
        if (iIndexOf == -1) {
            hashSet.add(str);
        } else {
            hashSet.add(str.substring(0, iIndexOf));
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (c12187.m30474()) {
            boolean z = this.f80313;
            HashSet hashSet = this.f80308;
            if (z) {
                if (m43837(c8615)) {
                    c8615.m23209();
                    c8615.m23176((Collection) hashSet);
                    c8615.m23216();
                    return;
                }
                return;
            }
            if (m43863(c8614)) {
                c8614.m23209();
                c8614.m23176((Collection) hashSet);
                c8614.m23216();
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C6331.m18055();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m55342(AbstractC22044 abstractC22044) throws IOException {
        if (this.f80314.add(abstractC22044.mo4294())) {
            try {
                C6265.m17913(abstractC22044, EnumC12230.MODIFY_DIRECTORY);
                if (!abstractC22044.mo2934() && !abstractC22044.mo4274()) {
                    throw new IOException(C1402.m5125(abstractC22044, new StringBuilder("Cannot create extract directory: ")));
                }
            } catch (Exception e) {
                throw new IOException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m55344(AbstractC22044 abstractC22044) {
        if (abstractC22044 == null) {
            return;
        }
        String strMo4294 = abstractC22044.mo4294();
        HashSet hashSet = this.f80311;
        if (hashSet.contains(strMo4294)) {
            return;
        }
        if (!abstractC22044.mo2934()) {
            abstractC22044.mo4274();
        }
        hashSet.add(abstractC22044.mo4294());
        do {
            abstractC22044 = abstractC22044.m49858();
            if (abstractC22044 == null) {
                return;
            }
        } while (hashSet.add(abstractC22044.mo4294()));
    }
}
