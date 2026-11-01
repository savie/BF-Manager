package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import bin.mt.plugin.api.ui.dialog.ProgressDialog;
import bin.mt.plugin.api.util.Consumer;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۫᩸᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12686 implements InterfaceC21921, InterfaceC18848, InterfaceC4031, InterfaceC16464, Consumer, InterfaceC7728 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42356;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f42357;

    public /* synthetic */ C12686(int i, Object obj) {
        this.f42356 = i;
        this.f42357 = obj;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept */
    public void mo42471accept(Object obj) {
        ((ProgressDialog) this.f42357).lambda$new$0((CharSequence) obj);
    }

    @Override // l.InterfaceC21921
    /* JADX INFO: renamed from: ۙ */
    public void mo1855(int i) {
        ((C7095) this.f42357).mo21455(i);
    }

    @Override // l.InterfaceC4031
    /* JADX INFO: renamed from: ۙ */
    public void mo11533(C6854 c6854) {
        ((C6936) this.f42357).f23330.m28765();
    }

    @Override // l.InterfaceC7728
    /* JADX INFO: renamed from: ۙ */
    public void mo11010(C16195 c16195) {
        ((C15601) this.f42357).f50735.suppressLayout(false);
    }

    @Override // l.InterfaceC16464
    /* JADX INFO: renamed from: ۙ */
    public Bitmap mo947() {
        InterfaceC13911 interfaceC13911;
        switch (this.f42356) {
            case 3:
                interfaceC13911 = (C3555) this.f42357;
                break;
            default:
                interfaceC13911 = (InterfaceC13911) this.f42357;
                break;
        }
        return C5443.m15057(interfaceC13911);
    }

    @Override // l.InterfaceC18848
    /* JADX INFO: renamed from: ܰ */
    public void mo4355(AbstractC20745 abstractC20745) {
        C11545 c11545 = (C11545) this.f42357;
        try {
            C22785 c22785M50437 = C22785.m50437(abstractC20745.m46727(), EnumC6556.ERROR);
            Iterator it = c22785M50437.mo5139().m10937().iterator();
            while (it.hasNext()) {
                ((C12202) it.next()).m30301("MT管理器");
            }
            for (C7262 c7262 : c22785M50437.mo17615()) {
                for (C0206 c0206 : c7262.mo19112()) {
                    if (c0206.getTypeName().equals("^attr-private")) {
                        c7262.m19385(c0206.mo26942());
                        break;
                    }
                }
            }
            for (C7262 c7263 : c22785M50437.mo17615()) {
                c7263.m19395();
                c7263.m19390();
                Iterator it2 = c7263.mo19112().iterator();
                while (it2.hasNext()) {
                    for (C21373 c21373 : ((C0206) it2.next()).mo25271()) {
                        c21373.m47905(false);
                        Iterator it3 = c21373.mo31746().iterator();
                        while (it3.hasNext()) {
                            ((C18551) it3.next()).m42943(false);
                        }
                    }
                }
            }
            if (c22785M50437.mo5141() != 1) {
                throw new RuntimeException();
            }
            C7262 c7262Mo5140 = c22785M50437.mo5140(0);
            HashSet hashSet = new HashSet();
            for (C0206 c0207 : c7262Mo5140.mo19112()) {
                while (c0207.mo1536() > 1) {
                    c0207.m1517(c0207.mo1536() - 1);
                }
                if (!hashSet.add(c0207.getTypeName())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(c0207.getTypeName());
                    sb.append(2);
                    c0207.m1534(c0207.getTypeName() + (hashSet.add(sb.toString()) ? 2 : 3));
                }
            }
            C22785 c22785M50435 = C22785.m50435(c22785M50437, EnumC6556.ERROR);
            C11018 c11018 = new C11018();
            c22785M50435.m50445();
            c22785M50435.m50441(c11018, (C8516) null);
            abstractC20745.m46706("slim.arsc").m46697(c11018);
            C21094.m47530();
        } catch (Exception e) {
            c11545.m28824().m31002(e, (DialogInterface.OnDismissListener) null);
        }
    }
}
