package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙۜ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: E1YX */
/* JADX INFO: loaded from: classes3.dex */
public class C4732 extends AbstractC19594 {

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f16659 = 0;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public C22941 f16660;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public long f16661;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public C7715 f16662;

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46050;
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
        String[] strArrM43831 = m43831("ARG_PATHS");
        String strM43865 = m43865("zipPath");
        C9651 c9651M43843 = m43843();
        boolean zM43847 = m43847("keepApkSigBlock");
        AbstractC22044 abstractC22044M35193 = C14584.m35193(strM43865, new String[0]);
        C6265.m17913(abstractC22044M35193, EnumC12230.MODIFY_FILE);
        this.f16660 = new C22941(abstractC22044M35193);
        int i = 1;
        C7715 c7715M43873 = C18902.m43873(abstractC22044M35193, c9651M43843 != null);
        this.f16662 = c7715M43873;
        C25179 c25179M20996 = c7715M43873.m20996();
        if (c9651M43843 == null && zM43847 && this.f16660.m51726()) {
            c25179M20996.m56128(this.f16660);
        }
        if (this.f16660.m51736()) {
            c25179M20996.m56130();
        }
        Collection<C8002> collectionM51742 = this.f16660.m51742();
        C13723 c13723 = new C13723(this, C18902.m43870(collectionM51742));
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (String str : strArrM43831) {
            if (str.endsWith("/")) {
                arrayList.add(str.substring(1));
            } else {
                hashSet.add(str.substring(1));
            }
        }
        int i2 = 0;
        for (C8002 c8002 : collectionM51742) {
            if (mo924()) {
                return C12187.m30469();
            }
            if (!hashSet.contains(c8002.getName())) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (c8002.getName().startsWith((String) it.next())) {
                        }
                    } else {
                        i2++;
                        mo16837(C21576.m49088(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + i2 + "/" + collectionM51742.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                        mo29447(c8002.getName());
                        if (c8002.isDirectory()) {
                            c25179M20996.m56125(c8002);
                        } else {
                            C18902.m43878(c8002, this.f16660, c25179M20996, c13723);
                            this.f16661 += c8002.m21838();
                        }
                    }
                }
            }
            if (!c8002.isDirectory()) {
                this.f16661 += c8002.m21838();
            }
        }
        m45194(100);
        mo16839(100);
        c25179M20996.close();
        if (c9651M43843 != null) {
            C0938.m3744(this.f16662, c9651M43843, this);
        }
        if (mo924()) {
            return C12187.m30469();
        }
        C24808.m55331(abstractC22044M35193);
        C24523 c24523 = new C24523();
        c24523.m54796(abstractC22044M35193);
        this.f16662.m20995(abstractC22044M35193, new RunnableC8255(i, this, abstractC22044M35193), this.f16660);
        c24523.m54797(abstractC22044M35193);
        return C12187.m30468();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (c12187.m30474() && m43863(c8614)) {
            c8614.m23216();
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C7715 c7715;
        if (!c12187.m30474() && (c7715 = this.f16662) != null) {
            C20244.m46520(c7715.m20996());
            this.f16662.m20994().mo4296();
        }
        C20244.m46520(this.f16660);
        C6331.m18055();
    }
}
