package l;

import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۠ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8085 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f28314;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f28315;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC15847 f28316;

    public C8085(ViewOnClickListenerC15847 viewOnClickListenerC15847, String str, HashSet hashSet) {
        this.f28316 = viewOnClickListenerC15847;
        this.f28314 = str;
        this.f28315 = hashSet;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246((AbstractActivityC12483) this.f28316.requireActivity(), R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        C22918 c22918 = new C22918(this.f28314);
        try {
            C9856 c9856 = new C9856(new BufferedOutputStream(c22918.m50720()));
            for (String str : this.f28315) {
                c22918.m50725(str + ".xml");
                c9856.write(this.f28316.f51287.m21568(str));
                c9856.flush();
            }
            c22918.close();
        } catch (Throwable th) {
            try {
                c22918.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C15829.m37611(R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f28316.f51295.m42627((Throwable) exc);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
