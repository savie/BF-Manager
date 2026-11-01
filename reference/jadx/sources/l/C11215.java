package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۧ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: E1YX */
/* JADX INFO: loaded from: classes4.dex */
public class C11215 extends AbstractC20413 {

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f37941 = 0;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public C2455 f37942;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public long f37943;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public C15575 f37944;

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5712;
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
        String[] strArrM41566 = m41566("ARG_PATHS");
        String strM41585 = m41585("zipPath");
        C14558 c14558M41593 = m41593();
        boolean zM41573 = m41573("keepApkSigBlock");
        final AbstractC20745 abstractC20745M15313 = C5553.m15313(strM41585, new String[0]);
        C2462.m7542(abstractC20745M15313, EnumC11636.MODIFY_FILE);
        this.f37942 = new C2455(abstractC20745M15313);
        C15575 c15575M45035 = C19808.m45035(abstractC20745M15313, c14558M41593 != null);
        this.f37944 = c15575M45035;
        C22918 c22918M37220 = c15575M45035.m37220();
        if (c14558M41593 == null && zM41573 && this.f37942.m7488()) {
            c22918M37220.m50726(this.f37942);
        }
        if (this.f37942.m7482()) {
            c22918M37220.m50718();
        }
        Collection<C12107> collectionM7466 = this.f37942.m7466();
        C6275 c6275 = new C6275(this, C19808.m45032(collectionM7466));
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (String str : strArrM41566) {
            if (str.endsWith("/")) {
                arrayList.add(str.substring(1));
            } else {
                hashSet.add(str.substring(1));
            }
        }
        int i = 0;
        for (C12107 c12107 : collectionM7466) {
            if (mo2357()) {
                return C5202.m14378();
            }
            if (!hashSet.contains(c12107.getName())) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (c12107.getName().startsWith((String) it.next())) {
                        }
                    } else {
                        i++;
                        mo21457(C16737.m39288(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i + "/" + collectionM7466.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                        mo41554(c12107.getName());
                        if (c12107.isDirectory()) {
                            c22918M37220.m50727(c12107);
                        } else {
                            C19808.m45039(c12107, this.f37942, c22918M37220, c6275);
                            this.f37943 += c12107.m30138();
                        }
                    }
                }
            }
            if (!c12107.isDirectory()) {
                this.f37943 += c12107.m30138();
            }
        }
        m46157(100);
        mo21455(100);
        c22918M37220.close();
        if (c14558M41593 != null) {
            C11005.m27760(this.f37944, c14558M41593, this);
        }
        if (mo2357()) {
            return C5202.m14378();
        }
        C19016.m43740(abstractC20745M15313);
        C5222 c5222 = new C5222();
        c5222.m14408(abstractC20745M15313);
        this.f37944.m37219(abstractC20745M15313, new Runnable() { // from class: l.ܿ᩶֨
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = C11215.f37941;
                C11215 c11215 = this.f55800;
                c11215.m41591(R.string.MT_Protector);
                c11215.mo41554(abstractC20745M15313.getName());
            }
        }, this.f37942);
        c5222.m14402(abstractC20745M15313);
        return C5202.m14379();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (c5202.m14380() && m41579(c11545)) {
            c11545.m28830();
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C15575 c15575;
        if (!c5202.m14380() && (c15575 = this.f37944) != null) {
            C19431.m44468(c15575.m37220());
            this.f37944.m37218().mo24647();
        }
        C19431.m44468(this.f37942);
        C21094.m47530();
    }
}
