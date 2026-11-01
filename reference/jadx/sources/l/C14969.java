package l;

import android.content.DialogInterface;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶۗ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: B29A */
/* JADX INFO: loaded from: classes4.dex */
public final class C14969 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f48868;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f48869;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f48870;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21318 f48871;

    public C14969(C21318 c21318, boolean z, boolean z2, String str) {
        this.f48871 = c21318;
        this.f48870 = z;
        this.f48869 = z2;
        this.f48868 = str;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10245(this.f48871.f69365.m47980());
        this.f12806.m40697((Runnable) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        HashMap map = new HashMap();
        C21318 c21318 = this.f48871;
        Iterator it = c21318.f69363.iterator();
        do {
            boolean zHasNext = it.hasNext();
            boolean z = this.f48869;
            boolean z2 = this.f48870;
            if (zHasNext) {
                InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
                C1084 c1084 = (C1084) C9735.computeIfAbsent(map, interfaceC2557.getName(), new C4355(1));
                if (z2) {
                    c1084.f4948 = C19016.m43738(interfaceC2557.mo7989());
                }
                if (z) {
                    c1084.f4949 = C5422.m14996(new C3021(interfaceC2557.mo7989().mo33970(), 0));
                }
            } else {
                c21318.f69364 = map;
                if (z2) {
                    c21318.f69367 = true;
                }
                if (z) {
                    c21318.f69361 = true;
                    return;
                }
                return;
            }
        } while (!this.f12806.m40693());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f12806.m40693()) {
            return;
        }
        this.f48871.m47811(this.f48868);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f48871.f69365.m47980().m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
