package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۤۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7ER */
/* JADX INFO: loaded from: classes4.dex */
public class ActivityC10589 extends AbstractActivityC22047 {
    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ֫ۙ */
    public final boolean mo1384() {
        return true;
    }

    @Override // l.AbstractActivityC17204
    /* JADX INFO: renamed from: ᩶ */
    public final String mo122() {
        return "CommonPasswordsTextEditor";
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ᩷ۙ */
    public final String mo1392() {
        return "CommonPasswords.txt";
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ۚۙ */
    public final String mo1386() {
        return getString(R.string.MT_Protector);
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ܳۙ */
    public final String mo1390() {
        int i = C9341.f30354;
        return "syntax:INTERNAL:".concat("CommonPasswords");
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ۧۙ */
    public final String mo1388() {
        List<C14340> listM48113 = C21054.m48113();
        ArrayList arrayList = new ArrayList();
        synchronized (listM48113) {
            for (C14340 c14340 : listM48113) {
                arrayList.add(new C14340(c14340.f45235, c14340.f45234));
            }
        }
        return C4624.m14432(arrayList);
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ۤ */
    public final void mo1387(String str) {
        C21054.m48120(C4624.m14433(str));
    }

    @Override // l.AbstractActivityC22047
    /* JADX INFO: renamed from: ۙ */
    public final void mo1385(Exception exc) {
        if (exc instanceof C21778) {
            this.f71108.m54024(((C21778) exc).m49389() - 1);
        }
    }
}
