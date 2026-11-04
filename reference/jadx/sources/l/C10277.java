package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final class C10277 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f32816;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Collection f32817;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f32818;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3041 f32819;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f32820;

    public C10277(ActivityC3041 activityC3041, String str, String str2, Collection collection) {
        this.f32819 = activityC3041;
        this.f32818 = str;
        this.f32816 = str2;
        this.f32817 = collection;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8190(this.f32819);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (String str : this.f32818.split("\n")) {
            if (!str.isEmpty()) {
                arrayList.add(new C11769(str, true));
            }
        }
        Collections.sort(arrayList);
        C5804 c5804M16929 = C5804.m16929(this.f32816);
        ArrayList<C2310> arrayList2 = new ArrayList();
        boolean z2 = false;
        for (C2820 c2820 : this.f32817) {
            String str2 = c2820.f9270;
            String strM16930 = c5804M16929.m16930(str2);
            if (!c2820.f9268) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    C11769 c11769 = (C11769) it.next();
                    if (c11769.m29546(strM16930)) {
                        z = !c11769.f38034;
                        break;
                    }
                }
            } else {
                z = true;
            }
            if (z) {
                arrayList2.add(new C2310(strM16930, str2));
                if (!c5804M16929.f19944.isEmpty() && !strM16930.equals(str2)) {
                    z2 = true;
                }
            }
        }
        Collections.sort(arrayList2, new C10539(1));
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            sb.append((String) ((C2310) it2.next()).f7473);
            sb.append("\n");
        }
        if (z2) {
            sb.append("\n# mapping对照\n");
            for (C2310 c2310 : arrayList2) {
                Object obj = c2310.f7473;
                Object obj2 = c2310.f7474;
                if (!((String) obj).equals(obj2)) {
                    sb.append((String) obj2);
                    sb.append(" -> ");
                    sb.append((String) c2310.f7473);
                    sb.append("\n");
                }
            }
        }
        this.f32820 = sb.toString();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        String str = this.f32820;
        ActivityC3041 activityC3041 = this.f32819;
        ActivityC4300.m13685(activityC3041, str, activityC3041.getString(R.string.MT_Protector), null, null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f32819.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
