package l;

import android.widget.ImageView;

/* JADX INFO: renamed from: l.᩹ۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C12B */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22191 implements InterfaceC3263, InterfaceC21574 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72600;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72601;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72602;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72603;

    public /* synthetic */ C22191(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f72601 = obj;
        this.f72603 = obj2;
        this.f72600 = obj3;
        this.f72602 = obj4;
    }

    @Override // l.InterfaceC3263
    /* JADX INFO: renamed from: ۙ */
    public void mo3187(C10840 c10840) {
        C15136.m36302((C15136) this.f72601, (C10840) this.f72603, (C21422) this.f72600, (C11545) this.f72602, c10840);
    }

    @Override // l.InterfaceC21574
    /* JADX INFO: renamed from: ܰ */
    public void mo14999(int i) {
        C14745 c14745 = (C14745) this.f72601;
        ImageView imageView = (ImageView) this.f72603;
        InterfaceC21926 interfaceC21926 = (InterfaceC21926) this.f72600;
        C16148 c16148 = (C16148) this.f72602;
        EnumC23917 enumC23917 = EnumC23917.IMMUTABLE;
        c14745.f48224 = i;
        c14745.f48225 = enumC23917;
        imageView.setImageBitmap(interfaceC21926.mo40846(c14745));
        if (c16148.mo38231()) {
            c16148.m38232();
            ((DialogInterfaceC19356) c16148.mo7338()).m44372(false);
        }
    }
}
