package l;

import com.alipay.sdk.m.u0.b;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ܰ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 041R */
/* JADX INFO: loaded from: classes.dex */
public final class C22860 implements InterfaceC14940 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C14764 f74293;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4747 f74294;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15400 f74295;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C15400 f74296;

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ */
    public final void mo18303(C12703 c12703) {
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ */
    public final void mo18304(C16432 c16432) {
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ */
    public final void mo18307(C20908 c20908) {
    }

    public C22860(C4747 c4747) {
        this.f74294 = c4747;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15400 m51580(C15400 c15400, C14769 c14769) {
        if (this.f74293 == null) {
            this.f74293 = C14764.m35506(this.f74294);
        }
        this.f74295 = c15400;
        this.f74296 = null;
        Iterator it = c14769.iterator();
        while (it.hasNext()) {
            C23892 c23892 = (C23892) it.next();
            c23892.getClass();
            mo18309(c23892);
        }
        C15400 c15401 = this.f74296;
        return c15401 == null ? c15400 : c15401;
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ */
    public final void mo18301(C3754 c3754) {
        EnumC19876 enumC19876M45735;
        if (c3754.f69124.f73596 != this.f74293.f48282.f73596 || (enumC19876M45735 = EnumC19876.m45735((String) c3754.f12872)) == null) {
            return;
        }
        if (this.f74296 == null) {
            this.f74296 = new C15400(this.f74295);
        }
        this.f74296.f50208.add(enumC19876M45735);
        this.f74296.f50207.remove(enumC19876M45735);
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ */
    public final void mo18309(C23892 c23892) {
        if (c23892.f69124.f73596 == this.f74293.f48257.f73596) {
            for (C14769 c14769 = c23892.f77372; c14769.m35550(); c14769 = c14769.f48336) {
                C5558 c5558 = (C5558) c14769.f48335;
                if (((C10377) c5558.f19300).f38072.toString().equals(b.d)) {
                    ((AbstractC21654) c5558.f19301).mo12192(this);
                }
            }
        }
    }

    @Override // l.InterfaceC14940
    /* JADX INFO: renamed from: ۙ */
    public final void mo18305(C17924 c17924) {
        for (AbstractC21654 abstractC21654 : c17924.f58709) {
            abstractC21654.mo12192(this);
        }
    }
}
