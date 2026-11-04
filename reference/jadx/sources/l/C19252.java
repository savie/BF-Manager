package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳᩳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9QS */
/* JADX INFO: loaded from: classes5.dex */
public class C19252 extends AbstractC19594 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public C4424 f62272;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f62273;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public boolean f62274;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public volatile C8547 f62276;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f62279;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f62275 = new HashSet();

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public C18616 f62277 = new C18616(false);

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3678 f62278 = new C0607(this);

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۧ */
    public final C12187 mo2531() throws IOException {
        C8547 c8547;
        C8547 c8548;
        String[] strArrM43831 = m43831("ARG_PATHS");
        String strM43865 = m43865("targetPath");
        C12276 c12276 = (C12276) m43838();
        this.f62274 = c12276.m30662();
        boolean z = strArrM43831.length == 1;
        this.f62273 = z;
        if (z) {
            m45192();
        }
        C6265.m17912(strM43865, EnumC12230.MODIFY_DIRECTORY);
        C14584.m35193(strM43865, new String[0]).m49853();
        this.f62272 = C4424.m14049(strM43865, this.f62277, this.f62278, new C8579(1, C22763.m51335(c12276)));
        if (this.f62274) {
            c8547 = new C8547();
            this.f62276 = c8547;
            if (this.f62279 || mo924()) {
                c8547.m22866();
            }
        } else {
            c8547 = null;
        }
        try {
            if (this.f62274) {
                c12276.m30664(c8547);
            }
            this.f62272.m14074(strArrM43831, (AbstractC7629) c12276, true, false);
            if (this.f62276 == c8547) {
                this.f62276 = null;
            }
            if (!this.f62272.m14076(false)) {
                cancel();
                return C12187.m30469();
            }
            if (this.f62274) {
                c8548 = new C8547();
                this.f62276 = c8548;
                if (this.f62279 || mo924()) {
                    c8548.m22866();
                }
            } else {
                c8548 = null;
            }
            try {
                InterfaceC20481 interfaceC20481M30658 = this.f62274 ? c12276.m30658(c8548) : c12276.m30658((C8547) null);
                try {
                    Iterator it = this.f62272.m14079().iterator();
                    while (it.hasNext()) {
                        m44591((AbstractC6662) it.next(), interfaceC20481M30658);
                    }
                    interfaceC20481M30658.close();
                    if (this.f62276 == c8548) {
                        this.f62276 = null;
                    }
                    return m43857();
                } catch (Throwable th) {
                    try {
                        interfaceC20481M30658.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (this.f62276 == c8548) {
                    this.f62276 = null;
                }
                throw th3;
            }
        } catch (Throwable th4) {
            if (this.f62276 == c8547) {
                this.f62276 = null;
            }
            throw th4;
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩺ */
    public final C11983 mo2534() {
        return C14620.f46056;
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ܶۙ */
    public final CharSequence mo2532() {
        return C21576.m49059(this.f62274 ? R.string.MT_Protector : R.string.MT_Protector, m43850("targetPath"));
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ֫ */
    public final void mo2528() {
        m43868(R.string.MT_Protector);
        mo29447("...");
    }

    @Override // l.AbstractC18900
    public final void cancel() {
        super.cancel();
        this.f62279 = true;
        C8547 c8547 = this.f62276;
        if (c8547 != null) {
            c8547.m22866();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44591(AbstractC6662 abstractC6662, InterfaceC20481 interfaceC20481) throws IOException {
        if (mo924()) {
            return;
        }
        if (abstractC6662.m18625()) {
            throw new IOException("Unsupported payload directory entry: " + abstractC6662.m18604());
        }
        this.f62272.m6376();
        int i = this.f62274 ? R.string.MT_Protector : R.string.MT_Protector;
        if (this.f62272.m6381() > 1) {
            mo16837(C21576.m49088(i) + MotionUtils.EASING_TYPE_FORMAT_START + this.f62272.m6385() + "/" + this.f62272.m6381() + MotionUtils.EASING_TYPE_FORMAT_END);
        } else {
            m43868(i);
        }
        mo29447(abstractC6662.m18624());
        if (this.f62273) {
            mo16839(0);
        } else {
            m45194(0);
            mo16839(this.f62272.m6380());
        }
        AbstractC22044 abstractC22044M18641 = abstractC6662.m18641();
        if (abstractC6662.m18630()) {
            if (abstractC6662.m18639()) {
                abstractC22044M18641 = abstractC22044M18641.m49839(true);
                abstractC6662.m18635(abstractC22044M18641);
                if (abstractC6662.m18620() != null) {
                    abstractC6662.m18638(abstractC22044M18641.getName());
                }
            } else if (abstractC6662.m18616()) {
                abstractC22044M18641.mo4300(this);
            } else {
                abstractC22044M18641.mo4296();
            }
        }
        String strM18604 = abstractC6662.m18604();
        if (strM18604.startsWith("/")) {
            strM18604 = strM18604.substring(1);
        }
        C4819 c4819Mo8640 = interfaceC20481.mo8640(strM18604);
        try {
            C13961 c13961M49855 = abstractC22044M18641.m49855("rw");
            try {
                interfaceC20481.mo8643(c4819Mo8640, c13961M49855, new C8065(this, c4819Mo8640));
                c13961M49855.close();
                if (mo924()) {
                    abstractC22044M18641.mo4287();
                    return;
                }
                C24523 c24523M18617 = abstractC6662.m18617();
                if (c24523M18617 != null) {
                    c24523M18617.m54797(abstractC22044M18641);
                }
                this.f62272.m6378(abstractC6662.m18622());
                C20108.m46233(abstractC6662.m18626(), true);
                if (abstractC6662.m18620() != null) {
                    this.f62275.add((String) abstractC6662.m18620());
                }
            } catch (Throwable th) {
                try {
                    c13961M49855.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | RuntimeException e) {
            abstractC22044M18641.mo4287();
            throw e;
        }
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final C12187 mo4494(Exception exc) {
        if (mo924()) {
            return C12187.m30469();
        }
        return C12187.m30465(exc);
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ۙ */
    public final void mo2529(Main main, C8614 c8614, C8614 c8615, C12187 c12187) {
        if (c12187.m30474() && m43863(c8614)) {
            c8614.m23209();
        }
        HashSet hashSet = this.f62275;
        if (hashSet.isEmpty() || !m43837(c8615)) {
            return;
        }
        c8615.m23176((Collection) hashSet);
        c8615.m23216();
    }

    @Override // l.AbstractC18900
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2533(C12187 c12187) {
        C6331.m18055();
    }
}
