package l;

import android.content.Intent;
import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.ۗۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P9S5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3078 implements InterfaceC17293, InterfaceC0380, InterfaceC16464, InterfaceC8395, InterfaceC7790, InterfaceC9199 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11652;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11653;

    public /* synthetic */ C3078(int i, Object obj) {
        this.f11652 = i;
        this.f11653 = obj;
    }

    @Override // l.InterfaceC9199
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object mo9261(C2617 c2617) {
        return (C22374) this.f11653;
    }

    @Override // l.InterfaceC8395
    /* JADX INFO: renamed from: ۙ */
    public void mo1796(Intent intent, int i) {
        ViewOnLayoutChangeListenerC3333.m9924((ViewOnLayoutChangeListenerC3333) this.f11653);
    }

    @Override // l.InterfaceC0380
    /* JADX INFO: renamed from: ۙ */
    public void mo1825(Object obj) {
        switch (this.f11652) {
            case 2:
                ((C11359) this.f11653).m28463();
                break;
            default:
                ActivityC5677.m15593((ActivityC5677) this.f11653, (String) obj);
                break;
        }
    }

    @Override // l.InterfaceC17293
    /* JADX INFO: renamed from: ۙ */
    public void mo1826(String str) {
        ((C8289) this.f11653).m21713(str);
    }

    @Override // l.InterfaceC16464
    /* JADX INFO: renamed from: ۙ */
    public Bitmap mo947() {
        return C5443.m15045((AbstractC20745) this.f11653);
    }
}
