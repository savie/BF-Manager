package l;

import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܿ᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes5.dex */
public final class C17632 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC3520 f56038;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f56039;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56040;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f56041;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C1777 f56042;

    public C17632(ViewOnClickListenerC3520 viewOnClickListenerC3520, int i, HashSet hashSet, String str) {
        this.f56038 = viewOnClickListenerC3520;
        this.f56040 = i;
        this.f56039 = hashSet;
        this.f56041 = str;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        ViewOnClickListenerC3520 viewOnClickListenerC3520 = this.f56038;
        viewOnClickListenerC3520.f12880.m16553();
        C1777 c1777 = new C1777((AbstractActivityC12483) viewOnClickListenerC3520.requireActivity());
        c1777.m5837(R.string.MT_Protector);
        c1777.mo5828((Runnable) null);
        c1777.mo5843();
        this.f56042 = c1777;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws C4987, IOException {
        ViewOnClickListenerC3520 viewOnClickListenerC3520 = this.f56038;
        String str = this.f56041;
        HashSet<String> hashSet = this.f56039;
        int i = this.f56040;
        if (i == 0) {
            C8516 c8516 = new C8516(hashSet.size());
            C1777 c1777 = this.f56042;
            C13638.requireNonNull(c1777);
            c8516.m22241(new C1438(c1777));
            C22918 c22918 = new C22918(str);
            try {
                C9856 c9856 = new C9856(new BufferedOutputStream(c22918.m50720()));
                C2093 c2093 = new C2093();
                for (String str2 : hashSet) {
                    if (!this.f56042.m5824()) {
                        c8516.m22242(1);
                        c22918.m50725(str2 + ".smali");
                        C6094 c6094 = viewOnClickListenerC3520.f12880;
                        c2093.m6636();
                        c6094.m16535(str2, c2093);
                        c9856.append((CharSequence) c2093.m6635());
                        c9856.flush();
                    } else {
                        c22918.close();
                        return;
                    }
                }
                c22918.close();
                return;
            } catch (Throwable th) {
                try {
                    c22918.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (i == 1) {
            C8516 c8517 = new C8516(hashSet.size());
            C1777 c1778 = this.f56042;
            C13638.requireNonNull(c1778);
            c8517.m22241(new C1438(c1778));
            C8485 c8485M21646 = null;
            for (String str3 : hashSet) {
                if (this.f56042.m5824()) {
                    return;
                }
                c8517.m22242(1);
                InterfaceC9354 interfaceC9354M16528 = viewOnClickListenerC3520.f12880.m16528(str3);
                C13638.requireNonNull(interfaceC9354M16528);
                if (c8485M21646 == null) {
                    c8485M21646 = interfaceC9354M16528.mo24003().m21646();
                }
                c8485M21646.m22160((InterfaceC22762) interfaceC9354M16528.mo23999());
                if (c8485M21646.m37938()) {
                    throw new C4987(R.string.MT_Protector);
                }
            }
            if (c8485M21646 != null) {
                c8485M21646.m37936(new C10602(C5553.m15313(str, new String[0])));
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        C8516 c8518 = new C8516(hashSet.size());
        C1777 c1779 = this.f56042;
        C13638.requireNonNull(c1779);
        c8518.m22241(new C1438(c1779));
        C16246 c16246 = new C16246();
        C22918 c22919 = new C22918(str);
        try {
            for (String str4 : hashSet) {
                if (!this.f56042.m5824()) {
                    c8518.m22242(1);
                    InterfaceC9354 interfaceC9354M16529 = viewOnClickListenerC3520.f12880.m16528(str4);
                    C13638.requireNonNull(interfaceC9354M16529);
                    C8485 c8485M21647 = interfaceC9354M16529.mo24003().m21646();
                    c8485M21647.m22160((InterfaceC22762) interfaceC9354M16529.mo23999());
                    c16246.m38375();
                    c8485M21647.m37936(c16246);
                    byte[] bArrM31471 = C12664.m31468(ByteBuffer.wrap(c16246.m38373(), 0, c16246.m38372())).m31471();
                    c22919.m50725(str4 + ".class");
                    c22919.write(bArrM31471);
                } else {
                    c22919.close();
                    return;
                }
            }
            c22919.close();
        } catch (Throwable th3) {
            try {
                c22919.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f56042.m5824()) {
            C15829.m37611(R.string.MT_Protector);
            C5553.m15313(this.f56041, new String[0]).mo24647();
            return;
        }
        C15829.m37611(R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f56038.f12882.m42627((Throwable) exc);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f56038.f12880.m16573();
        this.f56042.m5825();
    }
}
