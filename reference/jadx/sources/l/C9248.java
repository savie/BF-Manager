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

/* JADX INFO: renamed from: l.ۡ۠۫, reason: contains not printable characters */
/* JADX INFO: compiled from: P1ZZ */
/* JADX INFO: loaded from: classes4.dex */
public class C9248 extends AbstractC19594 {

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f30101 = 0;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public C22941 f30102;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public long f30103 = 0;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public C7715 f30104;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C22941 f30105;

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46045;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, m43840("tarZipPath"));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        mo29447("...");
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws IOException {
        String strM43865 = m43865("srcZipPath");
        String strM43866 = m43865("tarZipPath");
        String strM43867 = m43865("targetPath");
        int iM43854 = m43854("update");
        String[] strArrM43831 = m43831("ARG_PATHS");
        C9651 c9651M43843 = m43843();
        boolean zM43847 = m43847("keepApkSigBlock");
        AbstractC22044 abstractC22044M35193 = C14584.m35193(strM43866, new String[0]);
        C6265.m17913(abstractC22044M35193, EnumC12230.MODIFY_FILE);
        this.f30105 = new C22941(C14584.m35193(strM43865, new String[0]));
        this.f30102 = new C22941(abstractC22044M35193);
        int i = 1;
        C7715 c7715M43873 = C18902.m43873(abstractC22044M35193, c9651M43843 != null);
        this.f30104 = c7715M43873;
        C25179 c25179M20996 = c7715M43873.m20996();
        boolean zM51736 = this.f30102.m51736();
        if (c9651M43843 == null && zM43847 && this.f30102.m51726()) {
            c25179M20996.m56128(this.f30102);
        }
        if (zM51736) {
            c25179M20996.m56130();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Collection<C8002> collectionM51742 = this.f30105.m51742();
        int length = strArrM43831.length;
        int i2 = 0;
        while (i2 < length) {
            String strSubstring = strArrM43831[i2].substring(i);
            if (strSubstring.endsWith("/")) {
                int iLastIndexOf = strSubstring.lastIndexOf(47, strSubstring.length() - 2) + 1;
                for (C8002 c8002 : collectionM51742) {
                    String[] strArr = strArrM43831;
                    Collection collection = collectionM51742;
                    if (c8002.getName().startsWith(strSubstring)) {
                        StringBuilder sbM27333 = C10732.m27333(strM43867);
                        sbM27333.append(c8002.getName().substring(iLastIndexOf));
                        String string = sbM27333.toString();
                        c8002.m21851(string);
                        linkedHashMap.put(string, c8002);
                    }
                    collectionM51742 = collection;
                    strArrM43831 = strArr;
                    strSubstring = strSubstring;
                }
            } else {
                C8002 c8002M51724 = this.f30105.m51724(strSubstring);
                StringBuilder sbM27334 = C10732.m27333(strM43867);
                sbM27334.append(c8002M51724.m21843());
                String string2 = sbM27334.toString();
                c8002M51724.m21851(string2);
                linkedHashMap.put(string2, c8002M51724);
            }
            i2++;
            i = 1;
            collectionM51742 = collectionM51742;
            strArrM43831 = strArrM43831;
        }
        for (C8002 c8003 : this.f30102.m51742()) {
            linkedHashMap2.put(c8003.getName(), c8003);
        }
        if (iM43854 == 0) {
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                linkedHashMap2.remove((String) it.next());
            }
        } else if (iM43854 == 1) {
            for (Map.Entry entry : new ArrayList(linkedHashMap.entrySet())) {
                C8002 c8004 = (C8002) linkedHashMap2.get(entry.getKey());
                if (c8004 != null) {
                    if (((C8002) entry.getValue()).getTime() > c8004.getTime()) {
                        linkedHashMap2.remove(entry.getKey());
                    } else {
                        linkedHashMap.remove(entry.getKey());
                    }
                }
            }
        } else if (iM43854 == 2) {
            Iterator it2 = linkedHashMap2.keySet().iterator();
            while (it2.hasNext()) {
                linkedHashMap.remove((String) it2.next());
            }
        }
        C3150 c3150 = new C3150();
        if (zM51736) {
            C8002 c8005 = (C8002) linkedHashMap.get("AndroidManifest.xml");
            if (c8005 != null) {
                InputStream inputStreamM51727 = this.f30105.m51727(c8005);
                try {
                    try {
                        C14955 c14955M35973 = C14955.m35973(inputStreamM51727);
                        c3150.f10213 = C18685.m43477(c14955M35973);
                        c3150.f10214 = C18685.m43478(c14955M35973);
                    } catch (Exception unused) {
                        c3150.f10213 = false;
                        c3150.f10214 = false;
                    }
                    inputStreamM51727.close();
                } catch (Throwable th) {
                    try {
                        inputStreamM51727.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else {
                c3150.m10289(this.f30102);
            }
        }
        C9994 c9994 = new C9994(this, m24435(linkedHashMap.values(), c3150) + m24435(linkedHashMap2.values(), c3150));
        int i3 = 0;
        for (C8002 c8006 : linkedHashMap.values()) {
            if (mo924()) {
                return C12187.m30469();
            }
            i3++;
            mo16837(C21576.m49088(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i3 + "/" + linkedHashMap.size() + MotionUtils.EASING_TYPE_FORMAT_END);
            mo29447(c8006.getName());
            if (c8006.isDirectory()) {
                c25179M20996.m56125(c8006);
            } else {
                C20304.m46646(this.f30105, c25179M20996, c8006, c3150, new C1046(c9994));
                this.f30103 += C20304.m46645(c8006, c3150);
            }
        }
        Iterator it3 = linkedHashMap2.values().iterator();
        int i4 = 0;
        while (it3.hasNext()) {
            C8002 c8007 = (C8002) it3.next();
            if (mo924()) {
                return C12187.m30469();
            }
            int i5 = i4 + 1;
            mo16837(C21576.m49088(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i5 + "/" + linkedHashMap2.size() + MotionUtils.EASING_TYPE_FORMAT_END);
            mo29447(c8007.getName());
            if (c8007.isDirectory()) {
                c25179M20996.m56125(c8007);
            } else {
                C20304.m46646(this.f30102, c25179M20996, c8007, c3150, new C1046(c9994));
                this.f30103 += C20304.m46645(c8007, c3150);
            }
            it3 = it3;
            i4 = i5;
        }
        if (mo924()) {
            return C12187.m30469();
        }
        C20244.m46520(this.f30105);
        this.f30105 = null;
        C20244.m46520(this.f30102);
        this.f30102 = null;
        c25179M20996.close();
        if (c9651M43843 != null) {
            C0938.m3744(this.f30104, c9651M43843, this);
        }
        if (mo924()) {
            return C12187.m30469();
        }
        C24808.m55331(abstractC22044M35193);
        C24523 c24523 = new C24523();
        c24523.m54796(abstractC22044M35193);
        this.f30104.m20995(abstractC22044M35193, new RunnableC18945(0, this, abstractC22044M35193), new AutoCloseable[0]);
        c24523.m54797(abstractC22044M35193);
        return C12187.m30468();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m24435(Collection collection, C3150 c3150) {
        Iterator it = collection.iterator();
        long jM46645 = 0;
        while (it.hasNext()) {
            C8002 c8002 = (C8002) it.next();
            if (!c8002.isDirectory()) {
                jM46645 += C20304.m46645(c8002, c3150);
            }
        }
        return jM46645;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (c12187.m30474()) {
            if (m43863(c8614)) {
                c8614.m23209();
            }
            if (m43837(c8615)) {
                c8615.m23176((Collection) AbstractC18900.m43824(m43831("ARG_PATHS")));
                c8615.m23216();
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C7715 c7715 = this.f30104;
        if (c7715 != null) {
            C20244.m46520(c7715.m20996());
            this.f30104.m20994().mo4296();
        }
        C20244.m46520(this.f30105);
        C20244.m46520(this.f30102);
        C6331.m18055();
    }
}
