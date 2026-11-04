package l;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.᩸ۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F54P */
/* JADX INFO: loaded from: classes2.dex */
public final class C22586 extends AbstractC14883 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayList f73021;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f73022;

    public C22586(C10651 c10651, C16618 c16618, C9311 c9311) {
        super(c10651, 0);
        this.f73021 = new ArrayList();
        this.f73022 = m35828(c16618, c9311);
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ֫ */
    public final int mo4328() {
        return this.f73022;
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ۚۙ */
    public final int mo4331() {
        return this.f73021.size();
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC2731 mo4334(int i) {
        return (C7141) this.f73021.get(i);
    }

    @Override // l.InterfaceC15344
    /* JADX INFO: renamed from: ۧۙ */
    public final void mo4333() {
        Collections.sort(this.f73021, new C4443());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50911(C7141 c7141) {
        int iMo9069;
        this.f73021.add(c7141);
        if (!c7141.mo9072() || (iMo9069 = c7141.mo9069() + 1) <= this.f73022) {
            return;
        }
        this.f73022 = iMo9069;
    }

    @Override // l.AbstractC14883, l.InterfaceC15344
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC7206 mo4329() {
        return (C15126) super.mo4329();
    }

    @Override // l.AbstractC14883, l.InterfaceC15344
    /* JADX INFO: renamed from: ۤ */
    public final C10651 mo4332() {
        return (C10651) super.mo4332();
    }

    @Override // l.AbstractC14883, l.InterfaceC15344
    /* JADX INFO: renamed from: ۤ */
    public final InterfaceC10869 mo4332() {
        return (C10651) super.mo4332();
    }
}
