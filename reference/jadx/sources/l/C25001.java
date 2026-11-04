package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ۧ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: M4QY */
/* JADX INFO: loaded from: classes.dex */
public final class C25001 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f80937;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f80938;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC3547 f80939;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16795 f80940;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f80941 = false;

    public C25001(C16795 c16795, boolean z, boolean z2, RunnableC3547 runnableC3547) {
        this.f80940 = c16795;
        this.f80937 = z;
        this.f80938 = z2;
        this.f80939 = runnableC3547;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f80940.f54187.m23233(), R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        C7302 c7302M42889;
        C16795 c16795 = this.f80940;
        int iM47057 = c16795.f54186.m47057();
        int iM47052 = c16795.f54186.m47052();
        Iterator it = c16795.f54185.iterator();
        while (it.hasNext()) {
            C6004 c6004 = (C6004) ((InterfaceC2386) it.next());
            this.f7780.m33189(c6004.getName());
            if (c6004.m17449()) {
                throw new IOException("Unable to chown '" + c6004.getPath() + "': Unsupported operation");
            }
            String path = c6004.getPath();
            AbstractC22044 abstractC22044M35193 = C14584.m35193(path, new String[0]);
            if ((abstractC22044M35193 instanceof C18379) && (c7302M42889 = ((C18379) abstractC22044M35193).m42889()) != null) {
                path = c7302M42889.mo4294();
            }
            C14453.m34907(path, iM47057, iM47052, this.f80937, this.f80938);
            c6004.m17447(c6004.mo5155().m24239(iM47057, iM47052));
            this.f80941 = true;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f80939.run();
        C22673.m51152(R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f80941) {
            this.f80939.run();
        }
        this.f80940.f54187.m23233().m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
