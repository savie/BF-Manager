package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8XG */
/* JADX INFO: loaded from: classes5.dex */
public final class C18571 extends AbstractC9008 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14974 f60339 = new C14974();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12604 f60340 = new C12604();

    @Override // l.InterfaceC8263
    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC23705 mo7447() {
        return this.f60339;
    }

    @Override // l.InterfaceC8263
    /* JADX INFO: renamed from: ۙ */
    public final C7932 mo7444(InterfaceC4753 interfaceC4753) {
        if (interfaceC4753.mo14653()) {
            return null;
        }
        return C7932.m21504(interfaceC4753.getIndex());
    }

    @Override // l.AbstractC9008, l.InterfaceC8263
    /* JADX INFO: renamed from: ۙ */
    public final void mo7445(C14228 c14228) {
        this.f60340.m31312(c14228);
    }

    @Override // l.AbstractC9008, l.InterfaceC8263
    /* JADX INFO: renamed from: ۙ */
    public final void mo22276(C5280 c5280) {
        this.f60340.m31311(c5280);
    }

    @Override // l.AbstractC9008, l.InterfaceC8263
    /* JADX INFO: renamed from: ֫ */
    public final List mo22275() {
        C4313 c4313 = new C4313();
        for (C8787 c8787 : this.f60340.m31309()) {
            c4313.m13805(c8787.m23584(), c8787);
        }
        Object[] objArr = {c4313};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        return C24579.m54899(obj, arrayList, obj, arrayList);
    }

    @Override // l.AbstractC9008, l.InterfaceC8263
    /* JADX INFO: renamed from: ۚ */
    public final void mo7446() {
        C14974 c14974;
        C12604 c12604 = this.f60340;
        Iterator it = c12604.m31309().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c14974 = this.f60339;
            if (!zHasNext) {
                break;
            } else {
                c14974.m14259((C8787) it.next());
            }
        }
        if (c12604.m31314().m47877()) {
            c14974.m14260();
        } else {
            c14974.m14255(c12604.m31313());
        }
    }

    @Override // l.AbstractC9008, l.InterfaceC8263
    /* JADX INFO: renamed from: ۙ */
    public final void mo22277(InterfaceC23180 interfaceC23180) {
        C20942 c20942M31314 = this.f60340.m31314();
        if (c20942M31314.m47877()) {
            return;
        }
        interfaceC23180.mo11851(c20942M31314, this.f60339);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20942 m43148() {
        return this.f60340.m31314();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m43147(int i) {
        return this.f60340.m31310(i);
    }
}
