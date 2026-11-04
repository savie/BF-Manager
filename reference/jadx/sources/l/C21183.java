package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩶۠۫, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ZN */
/* JADX INFO: loaded from: classes5.dex */
public class C21183 extends AbstractC19594 {

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f67641 = 0;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public C7715 f67643;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public long f67644;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public String f67645;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public Collection f67646;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f67648;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C22941 f67649;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public C13789 f67642 = new C13789();

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f67650 = new ArrayList();

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public HashSet f67647 = new HashSet();

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f67651 = new HashSet();

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46058;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, m43840("zipPath"));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        mo29447("...");
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws Throwable {
        HashMap map;
        HashSet hashSet;
        C3150 c3150;
        String strM46451;
        C13789 c13789;
        C3150 c3151;
        String str;
        C21183 c21183;
        C3150 c3152;
        InputStream inputStreamMo4290;
        String str2;
        C13789 c137810;
        HashSet hashSet2;
        C21183 c21184 = this;
        final AbstractC22044 abstractC22044M43860 = c21184.m43860("zipPath");
        String[] strArrM43831 = c21184.m43831("ARG_PATHS");
        c21184.f67645 = c21184.m43865("rename");
        int iM43854 = c21184.m43854("level");
        int iM43855 = c21184.m43854("update");
        boolean zM43847 = c21184.m43847("deleteSources");
        String strM43865 = c21184.m43865("basePath");
        C9651 c9651M43843 = m43843();
        boolean zM43848 = c21184.m43847("keepApkSigBlock");
        C6265.m17913(abstractC22044M43860, EnumC12230.MODIFY_FILE);
        C4029 c4029 = new C4029(c21184);
        C13789 c137811 = c21184.f67642;
        c137811.m33696(strArrM43831, false, c4029);
        if (mo924()) {
            return C12187.m30469();
        }
        C22941 c22941 = new C22941(abstractC22044M43860);
        c21184.f67649 = c22941;
        c21184.f67646 = c22941.m51742();
        C7715 c7715M43873 = C18902.m43873(abstractC22044M43860, c9651M43843 != null);
        c21184.f67643 = c7715M43873;
        C25179 c25179M20996 = c7715M43873.m20996();
        if (c9651M43843 == null && zM43848 && c21184.f67649.m51726()) {
            c25179M20996.m56128(c21184.f67649);
        }
        if (c21184.f67649.m51736()) {
            c25179M20996.m56130();
        }
        boolean zM25489 = AbstractDialogInterfaceOnClickListenerC9777.m25489(iM43854, c25179M20996);
        C3150 c3153 = new C3150();
        if (zM25489) {
            c3153.m10289(c21184.f67649);
        }
        HashSet hashSet3 = c21184.f67651;
        if (zM43847) {
            hashSet3.add(abstractC22044M43860);
        }
        C25179 c25179M20997 = c21184.f67643.m20996();
        if (iM43855 == 0) {
            map = null;
        } else {
            map = new HashMap();
            for (Iterator it = c21184.f67646.iterator(); it.hasNext(); it = it) {
                C8002 c8002 = (C8002) it.next();
                if (!c8002.isDirectory()) {
                    map.put(c8002.getName(), c8002);
                }
            }
        }
        String str3 = c21184.f67645;
        Iterator it2 = c137811.f43741.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            strArrM43831 = strArrM43831;
            hashSet = c21184.f67647;
            zM43847 = zM43847;
            abstractC22044M43860 = abstractC22044M43860;
            c9651M43843 = c9651M43843;
            if (!zHasNext) {
                break;
            }
            it2 = it2;
            C7078 c7078 = (C7078) it2.next();
            if (mo924()) {
                break;
            }
            c137811.m33698();
            c25179M20996 = c25179M20996;
            String strM = c7078.f23324;
            AbstractC22044 abstractC22044 = c7078.f23323;
            long j = c7078.f23326;
            C13789 c137812 = c137811;
            HashSet hashSet4 = hashSet3;
            long j2 = c7078.f23322;
            if (str3.isEmpty()) {
                c3150 = c3153;
            } else {
                int iIndexOf = strM.indexOf(47);
                c3150 = c3153;
                strM = iIndexOf == -1 ? str3 : ExternalValue$$ExternalSyntheticOutline0.m(iIndexOf, strM, C10732.m27333(str3));
            }
            if (c7078.f23331) {
                strM46451 = C20196.m46451(strM43865, strM, "/");
                C8002 c8003 = new C8002(strM46451);
                c8003.setTime(j);
                c25179M20997.m56125(c8003);
                c13789 = c137812;
                c3151 = c3150;
                str = strM43865;
                c21183 = this;
            } else {
                String strM34972 = C14483.m34972(strM43865, strM);
                try {
                    if (iM43855 != 0) {
                        C17359.requireNonNull(map);
                        C8002 c8004 = (C8002) map.get(strM34972);
                        if (c8004 != null) {
                            if (iM43855 != 1) {
                                c137810 = c137812;
                                hashSet2 = hashSet4;
                                c137810.m33694(j2);
                                hashSet2.add(abstractC22044);
                            } else if (c8004.getTime() >= abstractC22044.mo4286()) {
                                c137810 = c137812;
                                c137810.m33694(j2);
                                hashSet2 = hashSet4;
                                hashSet2.add(abstractC22044);
                            }
                            c21184 = this;
                            c137811 = c137810;
                            hashSet3 = hashSet2;
                            c3153 = c3150;
                        }
                    }
                    C8002 c8005 = new C8002(strM34972);
                    c8005.m21854(j2);
                    c8005.setTime(j);
                    c25179M20997.m56125(c8005);
                    byte[] bArr = new byte[4096];
                    long j3 = 0;
                    while (true) {
                        int i = inputStreamMo4290.read(bArr);
                        if (i <= 0) {
                            str2 = strM34972;
                            str = strM43865;
                            c25179M20997.m56134();
                            break;
                        }
                        str2 = strM34972;
                        c25179M20997.write(bArr, 0, i);
                        byte[] bArr2 = bArr;
                        long j4 = j3 + ((long) i);
                        str = strM43865;
                        c21183.m45193(j4, c8005.getSize());
                        c21183.m43862(c13789.m33699() + j4, c13789.m33700());
                        if (mo924()) {
                            break;
                        }
                        strM34972 = str2;
                        strM43865 = str;
                        bArr = bArr2;
                        j3 = j4;
                    }
                    inputStreamMo4290.close();
                    c13789.m33694(j2);
                    strM46451 = str2;
                } catch (Throwable th) {
                    if (inputStreamMo4290 == null) {
                        throw th;
                    }
                    try {
                        inputStreamMo4290.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
                c13789 = c137812;
                if (zM25489) {
                    c3152 = c3150;
                    c25179M20997.m56135(C20304.m46644(strM34972, c3152));
                } else {
                    c3152 = c3150;
                }
                StringBuilder sb = new StringBuilder();
                c3151 = c3152;
                sb.append(C21576.m49088(R.string.MT_Protector));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                sb.append(c13789.m33693());
                sb.append("/");
                sb.append(c13789.m33697());
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                String string = sb.toString();
                c21183 = this;
                c21183.mo16837(string);
                c21183.mo29447(strM34972);
                inputStreamMo4290 = abstractC22044.mo4290();
            }
            hashSet.add(strM46451);
            if (!hashSet4.contains(abstractC22044)) {
                c21183.f67648++;
            }
            if (strM.indexOf(47) == -1) {
                c21183.f67650.add(strM);
            }
            c21184 = c21183;
            c137811 = c13789;
            hashSet3 = hashSet4;
            zM25489 = zM25489;
            iM43855 = iM43855;
            strM43865 = str;
            c3153 = c3151;
        }
        final C21183 c21185 = c21184;
        C25179 c25179 = c25179M20996;
        if (mo924()) {
            return C12187.m30469();
        }
        C25179 c25179M20998 = c21185.f67643.m20996();
        C14469 c14469 = new C14469(c21185, C18902.m43870(c21185.f67646));
        int i2 = 0;
        for (C8002 c8006 : c21185.f67646) {
            if (mo924()) {
                break;
            }
            i2++;
            if (!hashSet.contains(c8006.getName())) {
                c21185.mo16837(C21576.m49088(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i2 + "/" + c21185.f67646.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                c21185.mo29447(c8006.getName());
                if (c8006.isDirectory()) {
                    c25179M20998.m56125(c8006);
                } else {
                    C18902.m43878(c8006, c21185.f67649, c25179M20998, c14469);
                    c21185.f67644 = c8006.m21838() + c21185.f67644;
                }
            } else if (!c8006.isDirectory()) {
                c21185.f67644 = c8006.m21838() + c21185.f67644;
            }
        }
        if (mo924()) {
            return C12187.m30469();
        }
        c25179.close();
        if (c9651M43843 != null) {
            C0938.m3744(c21185.f67643, c9651M43843, c21185);
        }
        if (mo924()) {
            return C12187.m30469();
        }
        C24808.m55331(abstractC22044M43860);
        C24523 c24523 = new C24523();
        c24523.m54796(abstractC22044M43860);
        c21185.f67643.m20995(abstractC22044M43860, new Runnable() { // from class: l.᩺۠۫
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = C21183.f67641;
                C21183 c21186 = this.f78195;
                c21186.m43868(R.string.MT_Protector);
                c21186.mo29447(abstractC22044M43860.getName());
            }
        }, c21185.f67649);
        c24523.m54797(abstractC22044M43860);
        if (zM43847) {
            boolean z = c21185.f67648 > 1;
            if (z) {
                c21185.m43868(R.string.MT_Protector);
                c21185.mo16839(0);
                c21185.m45194(0);
            }
            for (String str4 : strArrM43831) {
                AbstractC22044 abstractC22044M35193 = C14584.m35193(str4, new String[0]);
                EnumC22346 enumC22346M50415 = EnumC22346.m50415(abstractC22044M35193.mo4281());
                if (z && abstractC22044M35193.mo4281() && !abstractC22044M35193.m49860()) {
                    c21185.mo29447(abstractC22044M35193.getName());
                }
                if (c21185.m48332(abstractC22044M35193, z)) {
                    enumC22346M50415.m50417(str4);
                }
            }
        }
        return C12187.m30468();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m48332(AbstractC22044 abstractC22044, boolean z) {
        if (abstractC22044.mo4281() && !abstractC22044.m49860()) {
            boolean z2 = true;
            Iterator it = abstractC22044.mo4299(true).iterator();
            while (it.hasNext()) {
                if (!m48332((AbstractC22044) it.next(), z)) {
                    z2 = false;
                }
            }
            if (z2) {
                if (z) {
                    mo29447(abstractC22044.getName());
                }
                return abstractC22044.mo4287();
            }
        } else if (!this.f67651.contains(abstractC22044)) {
            if (z) {
                mo29447(abstractC22044.getName());
            }
            return abstractC22044.mo4287();
        }
        return false;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (c12187.m30474()) {
            if (m43863(c8614)) {
                c8614.m23209();
            }
            if (m43837(c8615)) {
                c8615.m23176((Collection) this.f67650);
                c8615.m23216();
            }
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C7715 c7715;
        if (!c12187.m30474() && (c7715 = this.f67643) != null) {
            C20244.m46520(c7715.m20996());
            this.f67643.m20994().mo4296();
        }
        C20244.m46520(this.f67649);
        C6331.m18055();
    }
}
