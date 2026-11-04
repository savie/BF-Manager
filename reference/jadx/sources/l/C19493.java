package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19493 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f62923;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15017 f62924;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedHashMap f62925;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f62926 = new IdentityHashMap();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f62927;

    public C19493(C15017 c15017, LinkedHashMap linkedHashMap, AbstractC22044 abstractC22044) {
        this.f62924 = c15017;
        this.f62925 = linkedHashMap;
        this.f62923 = abstractC22044;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f62924.f49051, R.string.MT_Protector);
        for (C24132 c24132 : this.f62925.values()) {
            this.f62926.put(c24132, Boolean.valueOf(c24132.m53988()));
            c24132.m54107(true);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws Exception {
        AbstractC22044 abstractC22044 = this.f62923;
        LinkedHashMap linkedHashMap = this.f62925;
        ActivityC0848 activityC0848 = this.f62924.f49051;
        activityC0848.f3178.m30724();
        if (activityC0848.f3179 != null) {
            activityC0848.f3179.m46621();
        }
        Exception exc = null;
        try {
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((C24132) it.next()).m53869().m52947();
            }
            C8950.m23928(C6429.of(activityC0848.f3191.m24693(), new String[0])).m52947();
            if (!activityC0848.f3191.m24699().mo4301(abstractC22044)) {
                throw new C3090("Move project directory failed.");
            }
            activityC0848.f3191.m24695(abstractC22044);
            this.f62927 = true;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                try {
                    if (((AbstractC9051) entry.getKey()).mo1442() == entry.getValue()) {
                        ((C24132) entry.getValue()).m53929(((AbstractC9051) entry.getKey()).m24166(activityC0848.m3442()).m24699());
                    }
                } catch (Exception e) {
                    if (exc == null) {
                        exc = e;
                    } else {
                        exc.addSuppressed(e);
                    }
                }
            }
            if (activityC0848.f3179 != null) {
                activityC0848.f3179.m46573();
            }
            if (exc != null) {
                throw exc;
            }
        } catch (Exception e2) {
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                try {
                    if (((AbstractC9051) entry2.getKey()).mo1442() == entry2.getValue()) {
                        ((C24132) entry2.getValue()).m53929(((AbstractC9051) entry2.getKey()).m24166(activityC0848.m3442()).m24699());
                    }
                } catch (Exception e3) {
                    e2.addSuppressed(e3);
                }
            }
            if (activityC0848.f3179 != null) {
                activityC0848.f3179.m46573();
            }
            exc = e2;
        } catch (Throwable th) {
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                try {
                    if (((AbstractC9051) entry3.getKey()).mo1442() == entry3.getValue()) {
                        ((C24132) entry3.getValue()).m53929(((AbstractC9051) entry3.getKey()).m24166(activityC0848.m3442()).m24699());
                    }
                } catch (Exception e4) {
                    if (exc == null) {
                        exc = e4;
                    } else {
                        exc.addSuppressed(e4);
                    }
                }
            }
            if (activityC0848.f3179 != null) {
                activityC0848.f3179.m46573();
            }
            throw th;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C15017 c15017 = this.f62924;
        c15017.m22951();
        ActivityC0848 activityC0848 = c15017.f49051;
        DialogInterfaceOnClickListenerC12983.m32395(activityC0848, "save_as_project1", activityC0848.getString(R.string.MT_Protector), true);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f62924.f49051.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        ActivityC0848 activityC0848 = this.f62924.f49051;
        if (this.f62927) {
            activityC0848.f3182 = null;
            activityC0848.f3171.m51320().mo40348((Object) activityC0848.f3191.getName());
            activityC0848.f3171.m51296().mo40353(Boolean.FALSE);
        }
        for (Map.Entry entry : this.f62925.entrySet()) {
            if (((AbstractC9051) entry.getKey()).getView() != null) {
                ((C24132) entry.getValue()).m54107(((Boolean) this.f62926.get(entry.getValue())).booleanValue());
            }
        }
        m8196();
    }
}
