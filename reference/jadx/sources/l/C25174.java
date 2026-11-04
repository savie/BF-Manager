package l;

import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.HashSet;

/* JADX INFO: renamed from: l.᩻ܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes.dex */
public final class C25174 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f81365;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f81366;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC20698 f81367;

    public C25174(ViewOnClickListenerC20698 viewOnClickListenerC20698, String str, HashSet hashSet) {
        this.f81367 = viewOnClickListenerC20698;
        this.f81366 = str;
        this.f81365 = hashSet;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191((AbstractActivityC17204) this.f81367.requireActivity(), R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        C25179 c25179 = new C25179(this.f81366);
        try {
            C8018 c8018 = new C8018(new BufferedOutputStream(c25179.m56119()));
            for (String str : this.f81365) {
                c25179.m56124(str + ".xml");
                c8018.write(this.f81367.f66350.m29993(str));
                c8018.flush();
            }
            c25179.close();
        } catch (Throwable th) {
            try {
                c25179.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C22673.m51152(R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f81367.f66353.m51299(exc);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
