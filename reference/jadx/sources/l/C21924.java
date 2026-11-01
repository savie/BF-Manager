package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J1YX */
/* JADX INFO: loaded from: classes5.dex */
public class C21924 extends AbstractC20413 {

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f71125 = 0;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public C15575 f71126;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f71127 = new ArrayList();

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public long f71128;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public C2455 f71129;

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5724;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(R.string.MT_Protector, m41569("zipPath"), C16737.m39288(R.string.MT_Protector));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        mo41554("...");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() throws IOException {
        char c;
        String strM41585 = m41585("zipPath");
        C17367 c17367M40441 = C17367.m40441(m41553(e.m));
        String strM40458 = c17367M40441.m40458();
        int i = c17367M40441.readInt();
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        while (true) {
            boolean z = true;
            c = 1;
            if (i2 >= i) {
                break;
            }
            String strM40459 = c17367M40441.m40458();
            String strM404510 = c17367M40441.m40458();
            byte b = c17367M40441.readByte();
            String strConcat = strM40458.concat(strM40459);
            String strConcat2 = strM40458.concat(strM404510);
            boolean z2 = (b & 1) != 0;
            if ((b & 2) == 0) {
                z = false;
            }
            arrayList.add(new C2167(strConcat, strConcat2, z2, z));
            i2++;
        }
        int i3 = c17367M40441.readInt();
        HashSet hashSet = new HashSet(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            hashSet.add(c17367M40441.m40458());
        }
        C14558 c14558M41593 = m41593();
        boolean zM41573 = m41573("keepApkSigBlock");
        AbstractC20745 abstractC20745M15313 = C5553.m15313(strM41585, new String[0]);
        this.f71129 = new C2455(abstractC20745M15313);
        C15575 c15575M45035 = C19808.m45035(abstractC20745M15313, c14558M41593 != null);
        this.f71126 = c15575M45035;
        C22918 c22918M37220 = c15575M45035.m37220();
        if (c14558M41593 == null && zM41573 && this.f71129.m7488()) {
            c22918M37220.m50726(this.f71129);
        }
        if (this.f71129.m7482()) {
            c22918M37220.m50718();
        }
        Collection<C12107> collectionM7466 = this.f71129.m7466();
        C4990 c4990 = new C4990(this, C19808.m45032(collectionM7466));
        int i5 = 0;
        for (C12107 c12107 : collectionM7466) {
            if (mo2357()) {
                return C5202.m14378();
            }
            if (!hashSet.contains(c12107.getName())) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && !((C2167) it.next()).m6753(c12107)) {
                }
                i5++;
                mo21457(C16737.m39288(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i5 + "/" + collectionM7466.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                mo41554(c12107.getName());
                if (c12107.isDirectory()) {
                    c22918M37220.m50727(c12107);
                } else {
                    C19808.m45039(c12107, this.f71129, c22918M37220, c4990);
                    this.f71128 += c12107.m30138();
                }
            }
        }
        m46157(100);
        mo21455(100);
        c22918M37220.close();
        if (c14558M41593 != null) {
            C11005.m27760(this.f71126, c14558M41593, this);
        }
        if (mo2357()) {
            return C5202.m14378();
        }
        C19016.m43740(abstractC20745M15313);
        C5222 c5222 = new C5222();
        c5222.m14408(abstractC20745M15313);
        this.f71126.m37219(abstractC20745M15313, new RunnableC12027(c == true ? 1 : 0, this, abstractC20745M15313), this.f71129);
        c5222.m14402(abstractC20745M15313);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String strM6752 = ((C2167) it2.next()).m6752();
            if (strM6752 != null) {
                this.f71127.add(strM6752);
            }
        }
        return C5202.m14379();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (c5202.m14380() && m41579(c11545)) {
            c11545.m28831();
            c11545.m28777((Collection) this.f71127);
            c11545.m28830();
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C15575 c15575;
        if (!c5202.m14380() && (c15575 = this.f71126) != null) {
            C19431.m44468(c15575.m37220());
            this.f71126.m37218().mo24647();
        }
        C19431.m44468(this.f71129);
        C21094.m47530();
    }
}
