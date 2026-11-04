package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺۜ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J1YX */
/* JADX INFO: loaded from: classes5.dex */
public class C16664 extends AbstractC19594 {

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f53827 = 0;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public C7715 f53828;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f53829 = new ArrayList();

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public C22941 f53830;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public long f53831;

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46052;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(R.string.MT_Protector, m43840("zipPath"), C21576.m49088(R.string.MT_Protector));
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
        String strM43865 = m43865("zipPath");
        C20348 c20348M46740 = C20348.m46740(m43829(e.m));
        String strM46758 = c20348M46740.m46758();
        int i = c20348M46740.readInt();
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= i) {
                break;
            }
            String strM46759 = c20348M46740.m46758();
            String strM467510 = c20348M46740.m46758();
            byte b = c20348M46740.readByte();
            String strConcat = strM46758.concat(strM46759);
            String strConcat2 = strM46758.concat(strM467510);
            boolean z2 = (b & 1) != 0;
            if ((b & 2) == 0) {
                z = false;
            }
            arrayList.add(new C11443(strConcat, strConcat2, z2, z));
            i2++;
        }
        int i3 = c20348M46740.readInt();
        HashSet hashSet = new HashSet(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            hashSet.add(c20348M46740.m46758());
        }
        C9651 c9651M43843 = m43843();
        boolean zM43847 = m43847("keepApkSigBlock");
        AbstractC22044 abstractC22044M35193 = C14584.m35193(strM43865, new String[0]);
        this.f53830 = new C22941(abstractC22044M35193);
        C7715 c7715M43873 = C18902.m43873(abstractC22044M35193, c9651M43843 != null);
        this.f53828 = c7715M43873;
        C25179 c25179M20996 = c7715M43873.m20996();
        if (c9651M43843 == null && zM43847 && this.f53830.m51726()) {
            c25179M20996.m56128(this.f53830);
        }
        if (this.f53830.m51736()) {
            c25179M20996.m56130();
        }
        Collection<C8002> collectionM51742 = this.f53830.m51742();
        C24870 c24870 = new C24870(this, C18902.m43870(collectionM51742));
        int i5 = 0;
        for (C8002 c8002 : collectionM51742) {
            if (mo924()) {
                return C12187.m30469();
            }
            if (!hashSet.contains(c8002.getName())) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && !((C11443) it.next()).m28805(c8002)) {
                }
                i5++;
                mo16837(C21576.m49088(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i5 + "/" + collectionM51742.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                mo29447(c8002.getName());
                if (c8002.isDirectory()) {
                    c25179M20996.m56125(c8002);
                } else {
                    C18902.m43878(c8002, this.f53830, c25179M20996, c24870);
                    this.f53831 += c8002.m21838();
                }
            }
        }
        m45194(100);
        mo16839(100);
        c25179M20996.close();
        if (c9651M43843 != null) {
            C0938.m3744(this.f53828, c9651M43843, this);
        }
        if (mo924()) {
            return C12187.m30469();
        }
        C24808.m55331(abstractC22044M35193);
        C24523 c24523 = new C24523();
        c24523.m54796(abstractC22044M35193);
        this.f53828.m20995(abstractC22044M35193, new RunnableC7592(2, this, abstractC22044M35193), this.f53830);
        c24523.m54797(abstractC22044M35193);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String strM28804 = ((C11443) it2.next()).m28804();
            if (strM28804 != null) {
                this.f53829.add(strM28804);
            }
        }
        return C12187.m30468();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (c12187.m30474() && m43863(c8614)) {
            c8614.m23209();
            c8614.m23176((Collection) this.f53829);
            c8614.m23216();
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C7715 c7715;
        if (!c12187.m30474() && (c7715 = this.f53828) != null) {
            C20244.m46520(c7715.m20996());
            this.f53828.m20994().mo4296();
        }
        C20244.m46520(this.f53830);
        C6331.m18055();
    }
}
