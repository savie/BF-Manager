package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶۬۟, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20186 implements InterfaceC13320 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C21825 f65522;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C19670 f65523;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0429 f65524;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21825 f65525;

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ boolean mo1180() {
        return false;
    }

    public C20186(C0429 c0429, C19670 c19670, C21825 c21825, C21825 c21826) {
        this.f65524 = c0429;
        this.f65523 = c19670;
        this.f65522 = c21825;
        this.f65525 = c21826;
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۙ */
    public final void mo1179(AbstractC23903 abstractC23903) {
        C0429 c0429;
        C19003 c19003 = new C19003();
        C19670 c19670 = this.f65523;
        c19003.addAll(c19670.f63146);
        C19003 c19004 = new C19003();
        Iterator it = this.f65522.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c0429 = this.f65524;
            if (!zHasNext) {
                break;
            }
            C15416 c15416 = new C15416(c0429.f1991.m11148(c19670, ((C8191) it.next()).f28550));
            c19004.m43723(c15416);
            c19003.m43723(c15416);
        }
        c19670.f63151 = c19004.m43726();
        C19003 c19005 = new C19003();
        for (C18774 c18774 : this.f65525) {
            C19003 c19006 = new C19003();
            Iterator it2 = c18774.f60861.iterator();
            while (it2.hasNext()) {
                c19006.m43723(c0429.f1991.m11148(c19670, (AbstractC11242) it2.next()));
            }
            C4125 c4125 = new C4125(c0429.f1991.m11148(c19670, c18774.f60862), c19006.m43726());
            c19005.m43723(c4125);
            c19003.m43723(c4125);
        }
        c19670.f63140 = c19005.m43726();
        c19670.f63146 = c19003.m43726();
    }
}
