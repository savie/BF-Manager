package l;

import android.graphics.Bitmap;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 91U1 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13455 implements InterfaceC17293, InterfaceC16464, InterfaceC3485, InterfaceC18189, InterfaceC21921 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f44507;

    public /* synthetic */ C13455(Object obj) {
        this.f44507 = obj;
    }

    @Override // l.InterfaceC17293
    /* JADX INFO: renamed from: ۙ */
    public void mo1826(String str) {
        ((C2455) this.f44507).m7474(str);
    }

    @Override // l.InterfaceC18189
    /* JADX INFO: renamed from: ܰ */
    public String mo948() {
        C7236 c7236 = (C7236) this.f44507;
        return c7236.m19341(c7236.f24113, c7236.f24120);
    }

    @Override // l.InterfaceC16464
    /* JADX INFO: renamed from: ۙ */
    public Bitmap mo947() {
        return C5443.m15048((InterfaceC13911) this.f44507);
    }

    @Override // l.InterfaceC3485
    /* JADX INFO: renamed from: ۙ */
    public CharSequence mo4815(C4751 c4751) {
        C16053 c16053 = (C16053) this.f44507;
        return c16053.m13133().getString(R.string.MT_Protector, c16053.m42292().getString(c16053.m13157(), "10MB"));
    }

    @Override // l.InterfaceC21921
    /* JADX INFO: renamed from: ۙ */
    public void mo1855(final int i) {
        final InterfaceC21921 interfaceC21921 = (InterfaceC21921) this.f44507;
        C16737.m39273(new Runnable() { // from class: l.ۘ᩻᩺
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC21921.mo1855(i);
            }
        });
    }
}
