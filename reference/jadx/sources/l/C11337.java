package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧ᩻᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J8EC */
/* JADX INFO: loaded from: classes3.dex */
public final class C11337 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22149 f38247;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11545 f38248;

    public C11337(C11545 c11545) {
        this.f38248 = c11545;
        C22149 c22149 = new C22149(c11545.m28824());
        c22149.m49138();
        c22149.m49155();
        this.f38247 = c22149;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28402(C6397 c6397) {
        String name = c6397.getName();
        C22149 c22149 = this.f38247;
        c22149.m49151(name, (ViewOnLongClickListenerC10944) null);
        c22149.m49142(R.string.MT_Protector, c6397.m17543().getName());
        if (c6397.getSize() != -1) {
            c22149.m49157(c6397.getSize()).m9599(8);
        }
        c22149.m49144(c6397.m17544());
        c22149.m49159();
        C23519.m51792(c22149.m49160(), this.f38248, c6397);
    }
}
