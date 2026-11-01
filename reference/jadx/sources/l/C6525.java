package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜۙ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M4QY */
/* JADX INFO: loaded from: classes3.dex */
public final class C6525 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22754 f21980;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f21981;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC10138 f21982;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f21983;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f21984 = false;

    public C6525(C22754 c22754, boolean z, boolean z2, RunnableC10138 runnableC10138) {
        this.f21980 = c22754;
        this.f21981 = z;
        this.f21983 = z2;
        this.f21982 = runnableC10138;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f21980.f74099.m28824(), R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        C14042 c14042M40125;
        C22754 c22754 = this.f21980;
        int iM44162 = c22754.f74102.m44162();
        int iM44158 = c22754.f74102.m44158();
        Iterator it = c22754.f74101.iterator();
        while (it.hasNext()) {
            C6794 c6794 = (C6794) ((InterfaceC2557) it.next());
            this.f12806.m40698(c6794.getName());
            if (c6794.m18393()) {
                throw new IOException("Unable to chown '" + c6794.getPath() + "': Unsupported operation");
            }
            String path = c6794.getPath();
            AbstractC20745 abstractC20745M15313 = C5553.m15313(path, new String[0]);
            if ((abstractC20745M15313 instanceof C17196) && (c14042M40125 = ((C17196) abstractC20745M15313).m40125()) != null) {
                path = c14042M40125.mo33986();
            }
            C0055.m952(path, iM44162, iM44158, this.f21981, this.f21983);
            c6794.m18394(c6794.mo7971().m29322(iM44162, iM44158));
            this.f21984 = true;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f21982.run();
        C15829.m37611(R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f21984) {
            this.f21982.run();
        }
        this.f21980.f74099.m28824().m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
