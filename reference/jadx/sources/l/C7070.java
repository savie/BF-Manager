package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜ᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes3.dex */
public final class C7070 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3541 f23730;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f23731;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f23732;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Collection f23733;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f23734;

    public C7070(ActivityC3541 activityC3541, String str, String str2, Collection collection) {
        this.f23730 = activityC3541;
        this.f23732 = str;
        this.f23731 = str2;
        this.f23733 = collection;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10245(this.f23730);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() throws IOException {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (String str : this.f23732.split("\n")) {
            if (!str.isEmpty()) {
                arrayList.add(new C12238(str, true));
            }
        }
        Collections.sort(arrayList);
        C19999 c19999M45285 = C19999.m45285(this.f23731);
        ArrayList<C10946> arrayList2 = new ArrayList();
        boolean z2 = false;
        for (C21887 c21887 : this.f23733) {
            String str2 = c21887.f71006;
            String strM45286 = c19999M45285.m45286(str2);
            if (!c21887.f71004) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    C12238 c12238 = (C12238) it.next();
                    if (c12238.m30440(strM45286)) {
                        z = !c12238.f40967;
                        break;
                    }
                }
            } else {
                z = true;
            }
            if (z) {
                arrayList2.add(new C10946(strM45286, str2));
                if (!c19999M45285.f64015.isEmpty() && !strM45286.equals(str2)) {
                    z2 = true;
                }
            }
        }
        Collections.sort(arrayList2, new C4247());
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            sb.append((String) ((C10946) it2.next()).f37217);
            sb.append("\n");
        }
        if (z2) {
            sb.append("\n# mapping对照\n");
            for (C10946 c10946 : arrayList2) {
                Object obj = c10946.f37217;
                Object obj2 = c10946.f37218;
                if (!((String) obj).equals(obj2)) {
                    sb.append((String) obj2);
                    sb.append(" -> ");
                    sb.append((String) c10946.f37217);
                    sb.append("\n");
                }
            }
        }
        this.f23734 = sb.toString();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        String str = this.f23734;
        ActivityC3541 activityC3541 = this.f23730;
        ActivityC21135.m47562(activityC3541, str, activityC3541.getString(R.string.MT_Protector), null, null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f23730.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
