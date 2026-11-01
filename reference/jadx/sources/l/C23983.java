package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes.dex */
public final class C23983 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC3520 f77739;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC12483 f77740;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f77741;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f77742;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f77743;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f77744;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f77745;

    public C23983(ViewOnClickListenerC3520 viewOnClickListenerC3520, AbstractActivityC12483 abstractActivityC12483, String str, ArrayList arrayList, boolean z) {
        this.f77739 = viewOnClickListenerC3520;
        this.f77740 = abstractActivityC12483;
        this.f77743 = str;
        this.f77745 = arrayList;
        this.f77741 = z;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f77740, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        ArrayList arrayList;
        C2455 c2455 = new C2455(this.f77743);
        try {
            ArrayList<C12107> arrayListM7489 = c2455.m7489();
            for (C12107 c12107 : arrayListM7489) {
                C5553.m15307(c12107.getName(), c12107.isDirectory());
            }
            Iterator it = arrayListM7489.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = this.f77745;
                if (!zHasNext) {
                    break;
                }
                C12107 c12108 = (C12107) it.next();
                if (!c12108.isDirectory() && c12108.getName().toLowerCase().endsWith(".smali")) {
                    arrayList.add(c12108);
                }
            }
            if (arrayList.size() == 1) {
                String strM45297 = C20010.m45297(c2455.m7471((C12107) arrayList.get(0)), StandardCharsets.UTF_8);
                this.f77744 = strM45297;
                String strM48325 = AbstractC21616.m48325(strM45297);
                if (strM48325 == null) {
                    throw new C4987(this.f77739.getString(R.string.MT_Protector));
                }
                this.f77742 = strM48325.substring(1, strM48325.length() - 1);
            }
            c2455.close();
        } catch (Throwable th) {
            try {
                c2455.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        ArrayList arrayList = this.f77745;
        boolean zIsEmpty = arrayList.isEmpty();
        String str = this.f77743;
        boolean z = this.f77741;
        if (zIsEmpty) {
            C15829.m37618(R.string.MT_Protector);
            if (z) {
                C5553.m15313(str, new String[0]).mo24647();
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewOnClickListenerC3520 viewOnClickListenerC3520 = this.f77739;
        if (size == 1) {
            viewOnClickListenerC3520.m10354(R.string.MT_Protector, C22627.m50154(this.f77742), C22627.m50150(this.f77742), true, new InterfaceC8400() { // from class: l.ۧ᩹ۜ
                @Override // l.InterfaceC8400
                /* JADX INFO: renamed from: ۙ */
                public final Object mo3208(Object obj, Object obj2) {
                    return this.f38110.f77744;
                }
            });
            if (z) {
                C5553.m15313(str, new String[0]).mo24647();
                return;
            }
            return;
        }
        ViewOnClickListenerC3520.m10363(viewOnClickListenerC3520, str, arrayList, z);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f77740.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
