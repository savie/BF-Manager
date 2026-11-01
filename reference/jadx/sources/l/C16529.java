package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽۡ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9QS */
/* JADX INFO: loaded from: classes5.dex */
public class C16529 extends AbstractC20413 {

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f53101;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public C21026 f53102;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f53104;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public volatile C1752 f53105;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public boolean f53108;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final HashSet f53103 = new HashSet();

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public C16608 f53107 = new C16608(false);

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8327 f53106 = new C20057(this);

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۜ */
    public final C5202 mo3077() {
        C1752 c1752;
        C1752 c1753;
        String[] strArrM41566 = m41566("ARG_PATHS");
        String strM41585 = m41585("targetPath");
        C8809 c8809 = (C8809) m41560();
        this.f53104 = c8809.m22936();
        boolean z = strArrM41566.length == 1;
        this.f53108 = z;
        if (z) {
            m46154();
        }
        C2462.m7541(strM41585, EnumC11636.MODIFY_DIRECTORY);
        C5553.m15313(strM41585, new String[0]).m46739();
        this.f53102 = C21026.m47356(strM41585, this.f53107, this.f53106, new C0151(C11465.m28644(c8809)));
        if (this.f53104) {
            c1752 = new C1752();
            this.f53105 = c1752;
            if (this.f53101 || mo2357()) {
                c1752.m5799();
            }
        } else {
            c1752 = null;
        }
        try {
            if (this.f53104) {
                c8809.m22933(c1752);
            }
            this.f53102.m47381(strArrM41566, (AbstractC9677) c8809, true, false);
            if (this.f53105 == c1752) {
                this.f53105 = null;
            }
            if (!this.f53102.m47383(false)) {
                cancel();
                return C5202.m14378();
            }
            if (this.f53104) {
                c1753 = new C1752();
                this.f53105 = c1753;
                if (this.f53101 || mo2357()) {
                    c1753.m5799();
                }
            } else {
                c1753 = null;
            }
            try {
                InterfaceC19392 interfaceC19392M22929 = this.f53104 ? c8809.m22929(c1753) : c8809.m22929((C1752) null);
                try {
                    Iterator it = this.f53102.m47385().iterator();
                    while (it.hasNext()) {
                        m38902((AbstractC10444) it.next(), interfaceC19392M22929);
                    }
                    interfaceC19392M22929.close();
                    if (this.f53105 == c1753) {
                        this.f53105 = null;
                    }
                    return m41583();
                } catch (Throwable th) {
                    try {
                        interfaceC19392M22929.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (this.f53105 == c1753) {
                    this.f53105 = null;
                }
                throw th3;
            }
        } catch (Throwable th4) {
            if (this.f53105 == c1752) {
                this.f53105 = null;
            }
            throw th4;
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۟ */
    public final C14600 mo3078() {
        return C1362.f5726;
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ᩳۙ */
    public final CharSequence mo3080() {
        return C16737.m39264(this.f53104 ? R.string.MT_Protector : R.string.MT_Protector, m41567("targetPath"));
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۘ */
    public final void mo3075() {
        m41591(R.string.MT_Protector);
        mo41554("...");
    }

    @Override // l.AbstractC17902
    public final void cancel() {
        super.cancel();
        this.f53101 = true;
        C1752 c1752 = this.f53105;
        if (c1752 != null) {
            c1752.m5799();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m38902(AbstractC10444 abstractC10444, InterfaceC19392 interfaceC19392) throws IOException {
        if (mo2357()) {
            return;
        }
        if (abstractC10444.m26387()) {
            throw new IOException("Unsupported payload directory entry: " + abstractC10444.m26362());
        }
        this.f53102.m10992();
        int i = this.f53104 ? R.string.MT_Protector : R.string.MT_Protector;
        if (this.f53102.m10990() > 1) {
            mo21457(C16737.m39288(i) + MotionUtils.EASING_TYPE_FORMAT_START + this.f53102.m10991() + "/" + this.f53102.m10990() + MotionUtils.EASING_TYPE_FORMAT_END);
        } else {
            m41591(i);
        }
        mo41554(abstractC10444.m26393());
        if (this.f53108) {
            mo21455(0);
        } else {
            m46157(0);
            mo21455(this.f53102.m10996());
        }
        AbstractC20745 abstractC20745M26394 = abstractC10444.m26394();
        if (abstractC10444.m26389()) {
            if (abstractC10444.m26388()) {
                abstractC20745M26394 = abstractC20745M26394.m46693(true);
                abstractC10444.m26383(abstractC20745M26394);
                if (abstractC10444.m26372() != null) {
                    abstractC10444.m26361(abstractC20745M26394.getName());
                }
            } else if (abstractC10444.m26376()) {
                abstractC20745M26394.mo35234(this);
            } else {
                abstractC20745M26394.mo24647();
            }
        }
        String strM26362 = abstractC10444.m26362();
        if (strM26362.startsWith("/")) {
            strM26362 = strM26362.substring(1);
        }
        C9474 c9474Mo34857 = interfaceC19392.mo34857(strM26362);
        try {
            C1388 c1388M46710 = abstractC20745M26394.m46710("rw");
            try {
                interfaceC19392.mo34860(c9474Mo34857, c1388M46710, new C0300(this, c9474Mo34857));
                c1388M46710.close();
                if (mo2357()) {
                    abstractC20745M26394.mo24644();
                    return;
                }
                C5222 c5222M26377 = abstractC10444.m26377();
                if (c5222M26377 != null) {
                    c5222M26377.m14402(abstractC20745M26394);
                }
                this.f53102.m10994(abstractC10444.m26359());
                C22252.m49408(abstractC10444.m26385(), true);
                if (abstractC10444.m26372() != null) {
                    this.f53103.add((String) abstractC10444.m26372());
                }
            } catch (Throwable th) {
                try {
                    c1388M46710.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | RuntimeException e) {
            abstractC20745M26394.mo24644();
            throw e;
        }
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final C5202 mo6160(Exception exc) {
        if (mo2357()) {
            return C5202.m14378();
        }
        return C5202.m14375(exc);
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ۙ */
    public final void mo3076(Main main, C11545 c11545, C11545 c11546, C5202 c5202) {
        if (c5202.m14380() && m41579(c11545)) {
            c11545.m28831();
        }
        HashSet hashSet = this.f53103;
        if (hashSet.isEmpty() || !m41559(c11546)) {
            return;
        }
        c11546.m28777((Collection) hashSet);
        c11546.m28830();
    }

    @Override // l.AbstractC17902
    /* JADX INFO: renamed from: ܰ */
    public final void mo3079(C5202 c5202) {
        C21094.m47530();
    }
}
