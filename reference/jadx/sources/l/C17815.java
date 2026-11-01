package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ᩳۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9R5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17815 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f56445;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10055 f56446;

    public C17815(ActivityC10055 activityC10055, boolean z) {
        this.f56446 = activityC10055;
        this.f56445 = z;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f56446, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        C0206 c0206M19383;
        C11018 c11018 = new C11018();
        C22785 c22785M50435 = C22785.m50435(new C1493(ActivityC10055.f34354.m46690("arsc")), EnumC6556.ERROR);
        ActivityC10055 activityC10055 = this.f56446;
        for (C7232<C20638> c7232 : activityC10055.f34362.values()) {
            c7232.m19266();
            if (c7232.m19264()) {
                C17212 c17212 = new C17212();
                Iterator it = c22785M50435.mo17615().iterator();
                while (it.hasNext()) {
                    for (C0206 c0206 : ((C7262) it.next()).mo19112()) {
                        String typeName = c0206.getTypeName();
                        if (typeName.equals("string") || typeName.equals("array") || typeName.equals("plurals")) {
                            for (C21373 c21373 : c0206.mo25271()) {
                                if (c21373.mo31747().m37865().equals(c7232.m19260())) {
                                    for (C18551 c18551 : c21373.mo31746()) {
                                        c17212.m40149(c18551.mo10693(), c18551);
                                    }
                                }
                            }
                        }
                    }
                }
                for (C20638 c20638 : c7232) {
                    C18551 c18552 = (C18551) c17212.m40144(c20638.f67202, (Integer) null);
                    C13638.requireNonNull(c18552);
                    C16435 value = c18552.getValue(c20638.f67203);
                    String str = c20638.f67201;
                    if (str != null) {
                        C19933 c19933M45229 = C19933.m45229(str);
                        value.m38687(c19933M45229.m45232(), c19933M45229.m45230());
                    } else if (!value.mo25187().getValue().equals(c20638.f67205)) {
                        C19933 c19933M452210 = C19933.m45229(c20638.f67205);
                        value.m38687(c19933M452210.m45232(), c19933M452210.m45230());
                    }
                }
            }
        }
        if (!activityC10055.f34358.isChecked()) {
            c22785M50435.m50442();
        } else {
            Collection<C7232> collectionValues = activityC10055.f34362.values();
            C7262 c7262M50443 = c22785M50435.m50443();
            if (c7262M50443 == null) {
                int i = 23;
                while (true) {
                    if (i < 38) {
                        try {
                            c7262M50443 = c22785M50435.m50439(i, "bin.mt.plus.TranslationData");
                            break;
                        } catch (RuntimeException unused) {
                            i++;
                        }
                    } else {
                        throw new RuntimeException("This should not happen");
                    }
                }
            }
            C0206 c0207 = null;
            C0206 c0208 = null;
            for (C0206 c0209 : c7262M50443.mo19112()) {
                if (c0209.getTypeName().equals(am.av)) {
                    c0207 = c0209;
                } else if (c0209.getTypeName().equals("b")) {
                    c0208 = c0209;
                }
            }
            if (c0207 != null) {
                c7262M50443.m19385(c0207.mo26942());
            }
            if (c0208 != null) {
                c7262M50443.m19385(c0208.mo26942());
            }
            Iterator it2 = c7262M50443.mo19112().iterator();
            do {
                if (!it2.hasNext()) {
                    c0206M19383 = null;
                    break;
                }
                c0206M19383 = (C0206) it2.next();
            } while (!c0206M19383.getTypeName().equals(am.aF));
            if (c0206M19383 == null) {
                c0206M19383 = c7262M50443.m19383();
            }
            c0206M19383.m1542();
            boolean z = false;
            boolean z2 = false;
            for (C7232<C20638> c7233 : collectionValues) {
                ArrayList arrayList = new ArrayList();
                for (C20638 c20639 : c7233) {
                    if (c20639.f67201 != null) {
                        arrayList.add(c20639);
                    }
                }
                if (!arrayList.isEmpty()) {
                    c0206M19383.m1518(arrayList.size());
                    try {
                        C21373 c21373M1538 = c0206M19383.m1538(c7233.m19260());
                        int i2 = 0;
                        while (i2 < arrayList.size()) {
                            C20638 c206310 = (C20638) arrayList.get(i2);
                            c0206M19383.m1526(i2, "_", z);
                            C18551 c18551M47902 = c21373M1538.m47902(i2);
                            c18551M47902.m42946(true);
                            c18551M47902.m42948(c206310.f67202);
                            C19933 c19933M452211 = C19933.m45229(c206310.f67205);
                            C19933 c19933M452212 = C19933.m45229(c206310.f67201);
                            c18551M47902.m42937(c19933M452211.m45232(), c19933M452211.m45230(), -1).m38685(c206310.f67203);
                            c18551M47902.m42937(c19933M452212.m45232(), c19933M452212.m45230(), -1).m38685(c206310.f67203);
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
                c22785M50435.m50442();
            }
        }
        c22785M50435.m50445();
        c22785M50435.m50441(c11018, (C8516) null);
        AbstractC20745 abstractC20745 = activityC10055.f34360;
        abstractC20745.getClass();
        abstractC20745.m46698(new C15101(0, c11018));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        boolean z = this.f56445;
        ActivityC10055 activityC10055 = this.f56446;
        if (z) {
            activityC10055.finish();
            return;
        }
        activityC10055.f34355 = activityC10055.m25451();
        activityC10055.f34356 = false;
        C15829.m37611(R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f56446.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
