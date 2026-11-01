package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.᩶᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P1ZZ */
/* JADX INFO: loaded from: classes5.dex */
public class C20387 extends AbstractC20413 {

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f66063 = 0;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public C2455 f66064;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public long f66065 = 0;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public C2455 f66066;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public C15575 f66067;

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5715;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, m41569("tarZipPath"));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        mo41554("...");
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws IOException {
        String strM41585 = m41585("srcZipPath");
        String strM41586 = m41585("tarZipPath");
        String strM41587 = m41585("targetPath");
        int iM41581 = m41581("update");
        String[] strArrM41566 = m41566("ARG_PATHS");
        C14558 c14558M41593 = m41593();
        boolean zM41573 = m41573("keepApkSigBlock");
        AbstractC20745 abstractC20745M15313 = C5553.m15313(strM41586, new String[0]);
        C2462.m7542(abstractC20745M15313, EnumC11636.MODIFY_FILE);
        this.f66066 = new C2455(C5553.m15313(strM41585, new String[0]));
        this.f66064 = new C2455(abstractC20745M15313);
        int i = 1;
        C15575 c15575M45035 = C19808.m45035(abstractC20745M15313, c14558M41593 != null);
        this.f66067 = c15575M45035;
        C22918 c22918M37220 = c15575M45035.m37220();
        boolean zM7482 = this.f66064.m7482();
        if (c14558M41593 == null && zM41573 && this.f66064.m7488()) {
            c22918M37220.m50726(this.f66064);
        }
        if (zM7482) {
            c22918M37220.m50718();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Collection<C12107> collectionM7466 = this.f66066.m7466();
        int length = strArrM41566.length;
        int i2 = 0;
        while (i2 < length) {
            String strSubstring = strArrM41566[i2].substring(i);
            if (strSubstring.endsWith("/")) {
                int iLastIndexOf = strSubstring.lastIndexOf(47, strSubstring.length() - 2) + 1;
                for (C12107 c12107 : collectionM7466) {
                    String[] strArr = strArrM41566;
                    Collection collection = collectionM7466;
                    if (c12107.getName().startsWith(strSubstring)) {
                        StringBuilder sbM23356 = C9023.m23356(strM41587);
                        sbM23356.append(c12107.getName().substring(iLastIndexOf));
                        String string = sbM23356.toString();
                        c12107.m30128(string);
                        linkedHashMap.put(string, c12107);
                    }
                    collectionM7466 = collection;
                    strArrM41566 = strArr;
                    strSubstring = strSubstring;
                }
            } else {
                C12107 c12107M7470 = this.f66066.m7470(strSubstring);
                StringBuilder sbM23357 = C9023.m23356(strM41587);
                sbM23357.append(c12107M7470.m30093());
                String string2 = sbM23357.toString();
                c12107M7470.m30128(string2);
                linkedHashMap.put(string2, c12107M7470);
            }
            i2++;
            i = 1;
            collectionM7466 = collectionM7466;
            strArrM41566 = strArrM41566;
        }
        for (C12107 c12108 : this.f66064.m7466()) {
            linkedHashMap2.put(c12108.getName(), c12108);
        }
        if (iM41581 == 0) {
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                linkedHashMap2.remove((String) it.next());
            }
        } else if (iM41581 == 1) {
            for (Map.Entry entry : new ArrayList(linkedHashMap.entrySet())) {
                C12107 c12109 = (C12107) linkedHashMap2.get(entry.getKey());
                if (c12109 != null) {
                    if (((C12107) entry.getValue()).getTime() > c12109.getTime()) {
                        linkedHashMap2.remove(entry.getKey());
                    } else {
                        linkedHashMap.remove(entry.getKey());
                    }
                }
            }
        } else if (iM41581 == 2) {
            Iterator it2 = linkedHashMap2.keySet().iterator();
            while (it2.hasNext()) {
                linkedHashMap.remove((String) it2.next());
            }
        }
        C21123 c21123 = new C21123();
        if (zM7482) {
            C12107 c121010 = (C12107) linkedHashMap.get("AndroidManifest.xml");
            if (c121010 != null) {
                InputStream inputStreamM7471 = this.f66066.m7471(c121010);
                try {
                    try {
                        C20945 c20945M47094 = C20945.m47094(inputStreamM7471);
                        c21123.f68791 = C20240.m45752(c20945M47094);
                        c21123.f68792 = C20240.m45748(c20945M47094);
                    } catch (Exception unused) {
                        c21123.f68791 = false;
                        c21123.f68792 = false;
                    }
                    inputStreamM7471.close();
                } catch (Throwable th) {
                    try {
                        inputStreamM7471.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                c21123.m47548(this.f66064);
            }
        }
        C21092 c21092 = new C21092(this, m46037(linkedHashMap.values(), c21123) + m46037(linkedHashMap2.values(), c21123));
        int i3 = 0;
        for (C12107 c121011 : linkedHashMap.values()) {
            if (mo2357()) {
                return C5202.m14378();
            }
            i3++;
            mo21457(C16737.m39288(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i3 + "/" + linkedHashMap.size() + MotionUtils.EASING_TYPE_FORMAT_END);
            mo41554(c121011.getName());
            if (c121011.isDirectory()) {
                c22918M37220.m50727(c121011);
            } else {
                C16185.m38273(this.f66066, c22918M37220, c121011, c21123, new C16154(c21092));
                this.f66065 += C16185.m38272(c121011, c21123);
            }
        }
        Iterator it3 = linkedHashMap2.values().iterator();
        int i4 = 0;
        while (it3.hasNext()) {
            C12107 c121012 = (C12107) it3.next();
            if (mo2357()) {
                return C5202.m14378();
            }
            int i5 = i4 + 1;
            mo21457(C16737.m39288(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i5 + "/" + linkedHashMap2.size() + MotionUtils.EASING_TYPE_FORMAT_END);
            mo41554(c121012.getName());
            if (c121012.isDirectory()) {
                c22918M37220.m50727(c121012);
            } else {
                C16185.m38273(this.f66064, c22918M37220, c121012, c21123, new C16154(c21092));
                this.f66065 += C16185.m38272(c121012, c21123);
            }
            it3 = it3;
            i4 = i5;
        }
        if (mo2357()) {
            return C5202.m14378();
        }
        C19431.m44468(this.f66066);
        this.f66066 = null;
        C19431.m44468(this.f66064);
        this.f66064 = null;
        c22918M37220.close();
        if (c14558M41593 != null) {
            C11005.m27760(this.f66067, c14558M41593, this);
        }
        if (mo2357()) {
            return C5202.m14378();
        }
        C19016.m43740(abstractC20745M15313);
        C5222 c5222 = new C5222();
        c5222.m14408(abstractC20745M15313);
        this.f66067.m37219(abstractC20745M15313, new RunnableC3850(3, this, abstractC20745M15313), new AutoCloseable[0]);
        c5222.m14402(abstractC20745M15313);
        return C5202.m14379();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m46037(Collection collection, C21123 c21123) {
        Iterator it = collection.iterator();
        long jM38272 = 0;
        while (it.hasNext()) {
            C12107 c12107 = (C12107) it.next();
            if (!c12107.isDirectory()) {
                jM38272 += C16185.m38272(c12107, c21123);
            }
        }
        return jM38272;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (c5202.m14380()) {
            if (m41579(c11545)) {
                c11545.m28831();
            }
            if (m41559(c11546)) {
                c11546.m28777((Collection) AbstractC17902.m41547(m41566("ARG_PATHS")));
                c11546.m28830();
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C15575 c15575 = this.f66067;
        if (c15575 != null) {
            C19431.m44468(c15575.m37220());
            this.f66067.m37218().mo24647();
        }
        C19431.m44468(this.f66066);
        C19431.m44468(this.f66064);
        C21094.m47530();
    }
}
