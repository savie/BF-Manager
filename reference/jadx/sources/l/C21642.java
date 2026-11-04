package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes.dex */
public final class C21642 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f69091;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f69092;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f69093;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19404 f69094;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f69095;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f69096;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f69097;

    public C21642(ViewOnClickListenerC19404 viewOnClickListenerC19404, AbstractActivityC17204 abstractActivityC17204, String str, ArrayList arrayList, boolean z) {
        this.f69094 = viewOnClickListenerC19404;
        this.f69091 = abstractActivityC17204;
        this.f69096 = str;
        this.f69097 = arrayList;
        this.f69093 = z;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f69091, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        ArrayList arrayList;
        C22941 c22941 = new C22941(this.f69096);
        try {
            ArrayList<C8002> arrayListM51740 = c22941.m51740();
            for (C8002 c8002 : arrayListM51740) {
                C14584.m35187(c8002.getName(), c8002.isDirectory());
            }
            Iterator it = arrayListM51740.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = this.f69097;
                if (!zHasNext) {
                    break;
                }
                C8002 c8003 = (C8002) it.next();
                if (!c8003.isDirectory() && c8003.getName().toLowerCase().endsWith(".smali")) {
                    arrayList.add(c8003);
                }
            }
            if (arrayList.size() == 1) {
                String strM15490 = C5125.m15490(c22941.m51727((C8002) arrayList.get(0)), StandardCharsets.UTF_8);
                this.f69095 = strM15490;
                String strM49367 = AbstractC21775.m49367(strM15490);
                if (strM49367 == null) {
                    throw new C4866(this.f69094.getString(R.string.MT_Protector));
                }
                this.f69092 = strM49367.substring(1, strM49367.length() - 1);
            }
            c22941.close();
        } catch (Throwable th) {
            try {
                c22941.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        ArrayList arrayList = this.f69097;
        boolean zIsEmpty = arrayList.isEmpty();
        String str = this.f69096;
        boolean z = this.f69093;
        if (zIsEmpty) {
            C22673.m51159(R.string.MT_Protector);
            if (z) {
                C14584.m35193(str, new String[0]).mo4296();
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewOnClickListenerC19404 viewOnClickListenerC19404 = this.f69094;
        if (size == 1) {
            viewOnClickListenerC19404.m44871(R.string.MT_Protector, C15306.m36755(this.f69092), C15306.m36751(this.f69092), true, new InterfaceC23955() { // from class: l.ܰ᩺ۧ
                @Override // l.InterfaceC23955
                /* JADX INFO: renamed from: ۙ */
                public final Object mo3124(Object obj, Object obj2) {
                    return this.f48756.f69095;
                }
            });
            if (z) {
                C14584.m35193(str, new String[0]).mo4296();
                return;
            }
            return;
        }
        ViewOnClickListenerC19404.m44879(viewOnClickListenerC19404, str, arrayList, z);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f69091.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
