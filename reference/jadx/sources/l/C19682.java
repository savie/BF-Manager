package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M1ZN */
/* JADX INFO: loaded from: classes5.dex */
public class C19682 extends AbstractC20413 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f63190 = 0;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public String f63193;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public long f63194;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public Collection f63195;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f63198;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public C2455 f63199;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public C15575 f63200;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public C4612 f63192 = new C4612();

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f63197 = new ArrayList();

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public HashSet f63196 = new HashSet();

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f63191 = new HashSet();

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5713;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, m41569("zipPath"));
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
        HashMap map;
        HashSet hashSet;
        C21123 c21123;
        String strM5594;
        C4612 c4612;
        C21123 c21124;
        String str;
        C19682 c19682;
        C21123 c21125;
        InputStream inputStreamMo33970;
        String str2;
        C4612 c4613;
        HashSet hashSet2;
        C19682 c19683 = this;
        AbstractC20745 abstractC20745M41587 = c19683.m41587("zipPath");
        String[] strArrM41566 = c19683.m41566("ARG_PATHS");
        c19683.f63193 = c19683.m41585("rename");
        int iM41581 = c19683.m41581("level");
        int iM41582 = c19683.m41581("update");
        boolean zM41573 = c19683.m41573("deleteSources");
        String strM41585 = c19683.m41585("basePath");
        C14558 c14558M41593 = m41593();
        boolean zM41574 = c19683.m41573("keepApkSigBlock");
        C2462.m7542(abstractC20745M41587, EnumC11636.MODIFY_FILE);
        C18976 c18976 = new C18976(c19683);
        C4612 c4614 = c19683.f63192;
        c4614.m12758(strArrM41566, false, c18976);
        if (mo2357()) {
            return C5202.m14378();
        }
        C2455 c2455 = new C2455(abstractC20745M41587);
        c19683.f63199 = c2455;
        c19683.f63195 = c2455.m7466();
        C15575 c15575M45035 = C19808.m45035(abstractC20745M41587, c14558M41593 != null);
        c19683.f63200 = c15575M45035;
        C22918 c22918M37220 = c15575M45035.m37220();
        if (c14558M41593 == null && zM41574 && c19683.f63199.m7488()) {
            c22918M37220.m50726(c19683.f63199);
        }
        if (c19683.f63199.m7482()) {
            c22918M37220.m50718();
        }
        boolean zM30496 = AbstractDialogInterfaceOnClickListenerC12272.m30496(iM41581, c22918M37220);
        C21123 c21126 = new C21123();
        if (zM30496) {
            c21126.m47548(c19683.f63199);
        }
        HashSet hashSet3 = c19683.f63191;
        if (zM41573) {
            hashSet3.add(abstractC20745M41587);
        }
        C22918 c22918M37221 = c19683.f63200.m37220();
        if (iM41582 == 0) {
            map = null;
        } else {
            map = new HashMap();
            for (Iterator it = c19683.f63195.iterator(); it.hasNext(); it = it) {
                C12107 c12107 = (C12107) it.next();
                if (!c12107.isDirectory()) {
                    map.put(c12107.getName(), c12107);
                }
            }
        }
        String str3 = c19683.f63193;
        Iterator it2 = c4614.f16331.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            strArrM41566 = strArrM41566;
            hashSet = c19683.f63196;
            zM41573 = zM41573;
            abstractC20745M41587 = abstractC20745M41587;
            c14558M41593 = c14558M41593;
            if (!zHasNext) {
                break;
            }
            it2 = it2;
            C3056 c3056 = (C3056) it2.next();
            if (mo2357()) {
                break;
            }
            c4614.m12759();
            c22918M37220 = c22918M37220;
            String strM1616 = c3056.f11521;
            AbstractC20745 abstractC20745 = c3056.f11517;
            long j = c3056.f11519;
            C4612 c4615 = c4614;
            HashSet hashSet4 = hashSet3;
            long j2 = c3056.f11516;
            if (str3.isEmpty()) {
                c21123 = c21126;
            } else {
                int iIndexOf = strM1616.indexOf(47);
                c21123 = c21126;
                strM1616 = iIndexOf == -1 ? str3 : C0242.m1616(iIndexOf, strM1616, C9023.m23356(str3));
            }
            if (c3056.f11515) {
                strM5594 = C1679.m5594(strM41585, strM1616, "/");
                C12107 c12108 = new C12107(strM5594);
                c12108.setTime(j);
                c22918M37221.m50727(c12108);
                c4612 = c4615;
                c21124 = c21123;
                str = strM41585;
                c19682 = this;
            } else {
                String strM37076 = C15489.m37076(strM41585, strM1616);
                try {
                    if (iM41582 != 0) {
                        C13638.requireNonNull(map);
                        C12107 c12109 = (C12107) map.get(strM37076);
                        if (c12109 != null) {
                            if (iM41582 != 1) {
                                c4613 = c4615;
                                hashSet2 = hashSet4;
                                c4613.m12756(j2);
                                hashSet2.add(abstractC20745);
                            } else if (c12109.getTime() >= abstractC20745.mo33991()) {
                                c4613 = c4615;
                                c4613.m12756(j2);
                                hashSet2 = hashSet4;
                                hashSet2.add(abstractC20745);
                            }
                            c19683 = this;
                            c4614 = c4613;
                            hashSet3 = hashSet2;
                            c21126 = c21123;
                        }
                    }
                    C12107 c121010 = new C12107(strM37076);
                    c121010.m30096(j2);
                    c121010.setTime(j);
                    c22918M37221.m50727(c121010);
                    byte[] bArr = new byte[4096];
                    long j3 = 0;
                    while (true) {
                        int i = inputStreamMo33970.read(bArr);
                        if (i <= 0) {
                            str2 = strM37076;
                            str = strM41585;
                            c22918M37221.m50730();
                            break;
                        }
                        str2 = strM37076;
                        c22918M37221.write(bArr, 0, i);
                        byte[] bArr2 = bArr;
                        long j4 = j3 + ((long) i);
                        str = strM41585;
                        c19682.m46156(j4, c121010.getSize());
                        c19682.m41578(c4612.m12761() + j4, c4612.m12754());
                        if (mo2357()) {
                            break;
                        }
                        strM37076 = str2;
                        strM41585 = str;
                        bArr = bArr2;
                        j3 = j4;
                    }
                    inputStreamMo33970.close();
                    c4612.m12756(j2);
                    strM5594 = str2;
                } catch (Throwable th) {
                    if (inputStreamMo33970 == null) {
                        throw th;
                    }
                    try {
                        inputStreamMo33970.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
                c4612 = c4615;
                if (zM30496) {
                    c21125 = c21123;
                    c22918M37221.m50733(C16185.m38271(strM37076, c21125));
                } else {
                    c21125 = c21123;
                }
                StringBuilder sb = new StringBuilder();
                c21124 = c21125;
                sb.append(C16737.m39288(R.string.MT_Protector));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                sb.append(c4612.m12755());
                sb.append("/");
                sb.append(c4612.m12760());
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                String string = sb.toString();
                c19682 = this;
                c19682.mo21457(string);
                c19682.mo41554(strM37076);
                inputStreamMo33970 = abstractC20745.mo33970();
            }
            hashSet.add(strM5594);
            if (!hashSet4.contains(abstractC20745)) {
                c19682.f63198++;
            }
            if (strM1616.indexOf(47) == -1) {
                c19682.f63197.add(strM1616);
            }
            c19683 = c19682;
            c4614 = c4612;
            hashSet3 = hashSet4;
            zM30496 = zM30496;
            iM41582 = iM41582;
            strM41585 = str;
            c21126 = c21124;
        }
        C19682 c19684 = c19683;
        C22918 c22918 = c22918M37220;
        if (mo2357()) {
            return C5202.m14378();
        }
        C22918 c22918M37222 = c19684.f63200.m37220();
        C8393 c8393 = new C8393(c19684, C19808.m45032(c19684.f63195));
        int i2 = 0;
        for (C12107 c121011 : c19684.f63195) {
            if (mo2357()) {
                break;
            }
            i2++;
            if (!hashSet.contains(c121011.getName())) {
                c19684.mo21457(C16737.m39288(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i2 + "/" + c19684.f63195.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                c19684.mo41554(c121011.getName());
                if (c121011.isDirectory()) {
                    c22918M37222.m50727(c121011);
                } else {
                    C19808.m45039(c121011, c19684.f63199, c22918M37222, c8393);
                    c19684.f63194 = c121011.m30138() + c19684.f63194;
                }
            } else if (!c121011.isDirectory()) {
                c19684.f63194 = c121011.m30138() + c19684.f63194;
            }
        }
        if (mo2357()) {
            return C5202.m14378();
        }
        c22918.close();
        if (c14558M41593 != null) {
            C11005.m27760(c19684.f63200, c14558M41593, c19684);
        }
        if (mo2357()) {
            return C5202.m14378();
        }
        C19016.m43740(abstractC20745M41587);
        C5222 c5222 = new C5222();
        c5222.m14408(abstractC20745M41587);
        c19684.f63200.m37219(abstractC20745M41587, new RunnableC14458(c19684, abstractC20745M41587, 1), c19684.f63199);
        c5222.m14402(abstractC20745M41587);
        if (zM41573) {
            boolean z = c19684.f63198 > 1;
            if (z) {
                c19684.m41591(R.string.MT_Protector);
                c19684.mo21455(0);
                c19684.m46157(0);
            }
            for (String str4 : strArrM41566) {
                AbstractC20745 abstractC20745M15313 = C5553.m15313(str4, new String[0]);
                EnumC11669 enumC11669M29115 = EnumC11669.m29115(abstractC20745M15313.mo33974());
                if (z && abstractC20745M15313.mo33974() && !abstractC20745M15313.m46723()) {
                    c19684.mo41554(abstractC20745M15313.getName());
                }
                if (c19684.m44818(abstractC20745M15313, z)) {
                    enumC11669M29115.m29117(str4);
                }
            }
        }
        return C5202.m14379();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m44818(AbstractC20745 abstractC20745, boolean z) {
        if (abstractC20745.mo33974() && !abstractC20745.m46723()) {
            boolean z2 = true;
            Iterator it = abstractC20745.mo33983(true).iterator();
            while (it.hasNext()) {
                if (!m44818((AbstractC20745) it.next(), z)) {
                    z2 = false;
                }
            }
            if (z2) {
                if (z) {
                    mo41554(abstractC20745.getName());
                }
                return abstractC20745.mo24644();
            }
        } else if (!this.f63191.contains(abstractC20745)) {
            if (z) {
                mo41554(abstractC20745.getName());
            }
            return abstractC20745.mo24644();
        }
        return false;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (c5202.m14380()) {
            if (m41579(c11545)) {
                c11545.m28831();
            }
            if (m41559(c11546)) {
                c11546.m28777((Collection) this.f63197);
                c11546.m28830();
            }
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C15575 c15575;
        if (!c5202.m14380() && (c15575 = this.f63200) != null) {
            C19431.m44468(c15575.m37220());
            this.f63200.m37218().mo24647();
        }
        C19431.m44468(this.f63199);
        C21094.m47530();
    }
}
