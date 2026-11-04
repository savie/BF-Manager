package l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.֨۫ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F54P */
/* JADX INFO: loaded from: classes3.dex */
public final class C1175 extends AbstractC14883 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayList f4305;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f4306;

    public C1175(C7887 c7887, C16618 c16618, C9311 c9311) {
        super(c7887, 0);
        this.f4305 = new ArrayList();
        this.f4306 = m35828(c16618, c9311);
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo4328() {
        return this.f4306;
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final int mo4331() {
        return this.f4305.size();
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2731 mo4334(int i) {
        return (C12361) this.f4305.get(i);
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final void mo4333() {
        Collections.sort(this.f4305, new C4443());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4330(C12361 c12361) {
        int iMo9069;
        this.f4305.add(c12361);
        if (!c12361.mo9072() || (iMo9069 = c12361.mo9069() + 1) <= this.f4306) {
            return;
        }
        this.f4306 = iMo9069;
    }

    @Override // l.AbstractC14883, l.InterfaceC15344
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7206 mo4329() {
        return (C24296) super.mo4329();
    }

    @Override // l.AbstractC14883, l.InterfaceC15344
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7887 mo4332() {
        return (C7887) super.mo4332();
    }

    @Override // l.AbstractC14883, l.InterfaceC15344
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC10869 mo4332() {
        return (C7887) super.mo4332();
    }
}
