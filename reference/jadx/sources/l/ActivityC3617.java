package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۘ֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A7ER */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC3617 extends AbstractActivityC10490 {
    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ۖۙ */
    public final boolean mo7992() {
        return true;
    }

    @Override // l.AbstractActivityC12483
    /* JADX INFO: renamed from: ۡ */
    public final String mo126() {
        return "CommonPasswordsTextEditor";
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ܳ */
    public final String mo7998() {
        return "CommonPasswords.txt";
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ۨۙ */
    public final String mo7997() {
        return getString(R.string.MT_Protector);
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ۙۙ */
    public final String mo7994() {
        int i = C12859.f42771;
        return "syntax:INTERNAL:".concat("CommonPasswords");
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ۚۙ */
    public final String mo7995() {
        List<C6148> listM27972 = C11088.m27972();
        ArrayList arrayList = new ArrayList();
        synchronized (listM27972) {
            for (C6148 c6148 : listM27972) {
                arrayList.add(new C6148(c6148.f21002, c6148.f21001));
            }
        }
        return C0795.m3345(arrayList);
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ۨ */
    public final void mo7996(String str) {
        C11088.m27976(C0795.m3346(str));
    }

    @Override // l.AbstractActivityC10490
    /* JADX INFO: renamed from: ۙ */
    public final void mo7993(Exception exc) {
        if (exc instanceof C12791) {
            this.f35938.m17023(((C12791) exc).m31773() - 1);
        }
    }
}
