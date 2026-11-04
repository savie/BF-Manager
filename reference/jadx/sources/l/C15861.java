package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶۙ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B9R5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15861 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f51572;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6167 f51573;

    public C15861(ActivityC6167 activityC6167, boolean z) {
        this.f51573 = activityC6167;
        this.f51572 = z;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f51573, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        C23747 c23747M56373;
        C6178 c6178 = new C6178();
        AbstractC22044 abstractC22044M49876 = ActivityC6167.f21006.m49876("arsc");
        EnumC11066 enumC11066 = EnumC11066.ERROR;
        C24296 c24296 = new C24296(abstractC22044M49876);
        boolean z = false;
        C23001 c23001M51887 = C23001.m51887(c24296, enumC11066, false);
        ActivityC6167 activityC6167 = this.f51573;
        for (C24067<C3929> c24067 : activityC6167.f21014.values()) {
            c24067.m53619();
            if (c24067.m53622()) {
                C2375 c2375 = new C2375();
                Iterator it = c23001M51887.mo15672().iterator();
                while (it.hasNext()) {
                    for (C23747 c23747 : ((C25239) it.next()).mo19822()) {
                        String typeName = c23747.getTypeName();
                        if (typeName.equals("string") || typeName.equals("array") || typeName.equals("plurals")) {
                            for (C20017 c20017 : c23747.mo33925()) {
                                if (c20017.mo9073().m47027().equals(c24067.m53620())) {
                                    for (C13304 c13304 : c20017.mo9078()) {
                                        c2375.m8077(c13304.mo23384(), c13304);
                                    }
                                }
                            }
                        }
                    }
                }
                for (C3929 c3929 : c24067) {
                    C13304 c13305 = (C13304) C8341.m22446(c2375, c3929.f13415);
                    C17359.requireNonNull(c13305);
                    C3609 value = c13305.getValue(c3929.f13417);
                    String str = c3929.f13419;
                    if (str != null) {
                        C21083 c21083M48143 = C21083.m48143(str);
                        value.m11707(c21083M48143.m48146(), c21083M48143.m48144());
                    } else if (!value.mo11710().getValue().equals(c3929.f13418)) {
                        C21083 c21083M48144 = C21083.m48143(c3929.f13418);
                        value.m11707(c21083M48144.m48146(), c21083M48144.m48144());
                    }
                }
            }
        }
        if (!activityC6167.f21012.isChecked()) {
            c23001M51887.m51894();
        } else {
            Collection<C24067> collectionValues = activityC6167.f21014.values();
            C25239 c25239M51895 = c23001M51887.m51895();
            if (c25239M51895 == null) {
                int i = 23;
                while (true) {
                    if (i < 38) {
                        try {
                            c25239M51895 = c23001M51887.m51891(i, "bin.mt.plus.TranslationData");
                            break;
                        } catch (RuntimeException unused) {
                            i++;
                            z = false;
                        }
                    } else {
                        throw new RuntimeException("This should not happen");
                    }
                }
            }
            C23747 c23748 = null;
            C23747 c23749 = null;
            for (C23747 c237410 : c25239M51895.mo19822()) {
                if (c237410.getTypeName().equals(am.av)) {
                    c23748 = c237410;
                } else if (c237410.getTypeName().equals("b")) {
                    c23749 = c237410;
                }
            }
            if (c23748 != null) {
                c25239M51895.m56367(c23748.mo35833());
            }
            if (c23749 != null) {
                c25239M51895.m56367(c23749.mo35833());
            }
            Iterator it2 = c25239M51895.mo19822().iterator();
            do {
                if (!it2.hasNext()) {
                    c23747M56373 = null;
                    break;
                }
                c23747M56373 = (C23747) it2.next();
            } while (!c23747M56373.getTypeName().equals(am.aF));
            if (c23747M56373 == null) {
                c23747M56373 = c25239M51895.m56373();
            }
            c23747M56373.m53024();
            boolean z2 = false;
            for (C24067<C3929> c24068 : collectionValues) {
                ArrayList arrayList = new ArrayList();
                for (C3929 c39210 : c24068) {
                    if (c39210.f13419 != null) {
                        arrayList.add(c39210);
                    }
                }
                if (!arrayList.isEmpty()) {
                    c23747M56373.m53028(arrayList.size());
                    try {
                        C20017 c20017M53025 = c23747M56373.m53025(c24068.m53620());
                        int i2 = 0;
                        while (i2 < arrayList.size()) {
                            C3929 c39211 = (C3929) arrayList.get(i2);
                            c23747M56373.m53016(i2, "_", z);
                            C13304 c13304M46050 = c20017M53025.m46050(i2);
                            c13304M46050.m32860(true);
                            c13304M46050.m32859(c39211.f13415);
                            C21083 c21083M48145 = C21083.m48143(c39211.f13418);
                            C21083 c21083M48146 = C21083.m48143(c39211.f13419);
                            c13304M46050.m32849(c21083M48145.m48146(), c21083M48145.m48144(), -1).m11711(c39211.f13417);
                            c13304M46050.m32849(c21083M48146.m48146(), c21083M48146.m48144(), -1).m11711(c39211.f13417);
                            i2++;
                            z = false;
                        }
                        z2 = true;
                    } catch (Exception e) {
                        throw new IOException(e);
                    }
                }
                z = false;
            }
            if (!z2) {
                c23001M51887.m51894();
            }
        }
        c23001M51887.m51897();
        c23001M51887.m51893(c6178, (C3374) null);
        AbstractC22044 abstractC22044 = activityC6167.f21008;
        abstractC22044.getClass();
        abstractC22044.m49843(new C19301(c6178));
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        boolean z = this.f51572;
        ActivityC6167 activityC6167 = this.f51573;
        if (z) {
            activityC6167.finish();
            return;
        }
        activityC6167.f21010 = activityC6167.m17762();
        activityC6167.f21013 = false;
        C22673.m51152(R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f51573.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
