package l;

import android.content.DialogInterface;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶ֫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes5.dex */
public final class C15765 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f51308;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f51309;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f51310;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23225 f51311;

    public C15765(C23225 c23225, boolean z, boolean z2, String str) {
        this.f51311 = c23225;
        this.f51309 = z;
        this.f51308 = z2;
        this.f51310 = str;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8190(this.f51311.f75238.m31979());
        this.f7780.m33188((Runnable) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        HashMap map = new HashMap();
        C23225 c23225 = this.f51311;
        Iterator it = c23225.f75235.iterator();
        do {
            boolean zHasNext = it.hasNext();
            boolean z = this.f51308;
            boolean z2 = this.f51309;
            if (zHasNext) {
                InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
                C15632 c15632 = (C15632) C11392.computeIfAbsent(map, interfaceC2386.getName(), new C23773(2));
                if (z2) {
                    c15632.f50770 = C24808.m55329(interfaceC2386.mo8093());
                }
                if (z) {
                    c15632.f50771 = C15701.m37477(new C8826(interfaceC2386.mo8093().mo4290(), 0));
                }
            } else {
                c23225.f75236 = map;
                if (z2) {
                    c23225.f75234 = true;
                }
                if (z) {
                    c23225.f75237 = true;
                    return;
                }
                return;
            }
        } while (!this.f7780.m33196());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f7780.m33196()) {
            return;
        }
        this.f51311.m52139(this.f51310);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f51311.f75238.m31979().m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
