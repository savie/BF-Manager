package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18003 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f57589 = new IdentityHashMap();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20745 f57590;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedHashMap f57591;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18709 f57592;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f57593;

    public C18003(C18709 c18709, LinkedHashMap linkedHashMap, AbstractC20745 abstractC20745) {
        this.f57592 = c18709;
        this.f57591 = linkedHashMap;
        this.f57590 = abstractC20745;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f57592.f60684, R.string.MT_Protector);
        for (C6111 c6111 : this.f57591.values()) {
            this.f57589.put(c6111, Boolean.valueOf(c6111.m17004()));
            c6111.m17065(true);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws Exception {
        AbstractC20745 abstractC20745 = this.f57590;
        LinkedHashMap linkedHashMap = this.f57591;
        ActivityC5677 activityC5677 = this.f57592.f60684;
        activityC5677.f19364.m17521();
        if (activityC5677.f19365 != null) {
            activityC5677.f19365.m16553();
        }
        Exception exc = null;
        try {
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((C6111) it.next()).m17019().m30027();
            }
            C20346.m45912(C12974.of(activityC5677.f19380.m33319(), new String[0])).m30027();
            if (!activityC5677.f19380.m33318().mo24646(abstractC20745)) {
                throw new C8142("Move project directory failed.");
            }
            activityC5677.f19380.m33321(abstractC20745);
            this.f57593 = true;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                try {
                    if (((AbstractC22611) entry.getKey()).mo19352() == entry.getValue()) {
                        ((C6111) entry.getValue()).m16882(((AbstractC22611) entry.getKey()).m50130(activityC5677.m15676()).m33318());
                    }
                } catch (Exception e) {
                    if (exc == null) {
                        exc = e;
                    } else {
                        exc.addSuppressed(e);
                    }
                }
            }
            if (activityC5677.f19365 != null) {
                activityC5677.f19365.m16573();
            }
            if (exc != null) {
                throw exc;
            }
        } catch (Exception e2) {
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                try {
                    if (((AbstractC22611) entry2.getKey()).mo19352() == entry2.getValue()) {
                        ((C6111) entry2.getValue()).m16882(((AbstractC22611) entry2.getKey()).m50130(activityC5677.m15676()).m33318());
                    }
                } catch (Exception e3) {
                    e2.addSuppressed(e3);
                }
            }
            if (activityC5677.f19365 != null) {
                activityC5677.f19365.m16573();
            }
            exc = e2;
        } catch (Throwable th) {
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                try {
                    if (((AbstractC22611) entry3.getKey()).mo19352() == entry3.getValue()) {
                        ((C6111) entry3.getValue()).m16882(((AbstractC22611) entry3.getKey()).m50130(activityC5677.m15676()).m33318());
                    }
                } catch (Exception e4) {
                    if (exc == null) {
                        exc = e4;
                    } else {
                        exc.addSuppressed(e4);
                    }
                }
            }
            if (activityC5677.f19365 != null) {
                activityC5677.f19365.m16573();
            }
            throw th;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C18709 c18709 = this.f57592;
        c18709.m40364();
        ActivityC5677 activityC5677 = c18709.f60684;
        DialogInterfaceOnClickListenerC14147.m34221(activityC5677, "save_as_project1", activityC5677.getString(R.string.MT_Protector), true);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f57592.f60684.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        ActivityC5677 activityC5677 = this.f57592.f60684;
        if (this.f57593) {
            activityC5677.f19374 = null;
            activityC5677.f19370.m42644().mo23641((Object) activityC5677.f19380.getName());
            activityC5677.f19370.m42624().mo23642(Boolean.FALSE);
        }
        for (Map.Entry entry : this.f57591.entrySet()) {
            if (((AbstractC22611) entry.getKey()).getView() != null) {
                ((C6111) entry.getValue()).m17065(((Boolean) this.f57589.get(entry.getValue())).booleanValue());
            }
        }
        m10251();
    }
}
