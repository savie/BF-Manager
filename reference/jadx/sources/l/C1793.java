package l;

import android.graphics.Bitmap;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1793 implements InterfaceC5392, InterfaceC18006, InterfaceC21100, InterfaceC24044 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f6126;

    public /* synthetic */ C1793(Object obj) {
        this.f6126 = obj;
    }

    @Override // l.InterfaceC18006
    /* JADX INFO: renamed from: ۙ */
    public void mo1736(Object obj) {
        ((C1750) this.f6126).m6174();
    }

    @Override // l.InterfaceC24044
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CharSequence mo6271(C3906 c3906) {
        C12559 c12559 = (C12559) this.f6126;
        return c12559.m12560().getString(R.string.MT_Protector, c12559.m29658().getString(c12559.m12557(), "10MB"));
    }

    @Override // l.InterfaceC5392
    /* JADX INFO: renamed from: ۙ */
    public void mo1772(AbstractC22044 abstractC22044) {
        new ViewOnClickListenerC18541((C8614) this.f6126).m43124(abstractC22044, false);
    }

    @Override // l.InterfaceC21100
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Bitmap mo6272() {
        return C8275.m22351((InterfaceC0817) this.f6126);
    }
}
